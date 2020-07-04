package com.example.user;

import com.example.grpc.Calculator;
import com.example.grpc.User;
import com.example.grpc.grpcserviceGrpc;
import io.grpc.stub.StreamObserver;

public class GRPCServiceImpl extends grpcserviceGrpc.grpcserviceImplBase {

    @Override
    public void login(User.LoginRequest request, StreamObserver<User.APIResponse> responseObserver) {

        System.out.println("Inside login");
        String username = request.getUsername();
        String password = request.getPassword();

        User.APIResponse.Builder response = User.APIResponse.newBuilder();
        if(username.equals(password)) {
            response.setResponsemessage("Login Successful").setResponsecode(200);
        }
        else
            response.setResponsemessage("Failed").setResponsecode(100);

        responseObserver.onNext(response.build());
        responseObserver.onCompleted();
    }

    @Override
    public void logout(User.Empty request, StreamObserver<User.APIResponse> responseObserver) {

    }

    @Override
    public void math(Calculator.calculation request, StreamObserver<Calculator.Result> responseObserver) {

        int p1 = request.getParameter1();
        int p2 = request.getParameter2();
        String operator = request.getOperator();

        int cal = Calculate(p1,p2,operator);

        Calculator.Result.Builder result = Calculator.Result.newBuilder();
        result.setResponse(cal);

        responseObserver.onNext(result.build());
        responseObserver.onCompleted();

    }

    public int Calculate (int param1, int param2, String operator) {
        switch (operator) {
            case "*":
                return param1 * param2;
            case "/":
                return param1/param2;
            case "-":
                return param1 - param2;
            case "+":
                return param1 + param2;

            default:
        }
        return 0;
    }
}
