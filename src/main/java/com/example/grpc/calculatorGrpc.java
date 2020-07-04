package com.example.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: calculator.proto")
public final class calculatorGrpc {

  private calculatorGrpc() {}

  public static final String SERVICE_NAME = "calculator";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.example.grpc.Calculator.calculation,
      com.example.grpc.Calculator.Result> getMathMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "math",
      requestType = com.example.grpc.Calculator.calculation.class,
      responseType = com.example.grpc.Calculator.Result.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.grpc.Calculator.calculation,
      com.example.grpc.Calculator.Result> getMathMethod() {
    io.grpc.MethodDescriptor<com.example.grpc.Calculator.calculation, com.example.grpc.Calculator.Result> getMathMethod;
    if ((getMathMethod = calculatorGrpc.getMathMethod) == null) {
      synchronized (calculatorGrpc.class) {
        if ((getMathMethod = calculatorGrpc.getMathMethod) == null) {
          calculatorGrpc.getMathMethod = getMathMethod = 
              io.grpc.MethodDescriptor.<com.example.grpc.Calculator.calculation, com.example.grpc.Calculator.Result>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "calculator", "math"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.Calculator.calculation.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.Calculator.Result.getDefaultInstance()))
                  .setSchemaDescriptor(new calculatorMethodDescriptorSupplier("math"))
                  .build();
          }
        }
     }
     return getMathMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static calculatorStub newStub(io.grpc.Channel channel) {
    return new calculatorStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static calculatorBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new calculatorBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static calculatorFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new calculatorFutureStub(channel);
  }

  /**
   */
  public static abstract class calculatorImplBase implements io.grpc.BindableService {

    /**
     */
    public void math(com.example.grpc.Calculator.calculation request,
        io.grpc.stub.StreamObserver<com.example.grpc.Calculator.Result> responseObserver) {
      asyncUnimplementedUnaryCall(getMathMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getMathMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.example.grpc.Calculator.calculation,
                com.example.grpc.Calculator.Result>(
                  this, METHODID_MATH)))
          .build();
    }
  }

  /**
   */
  public static final class calculatorStub extends io.grpc.stub.AbstractStub<calculatorStub> {
    private calculatorStub(io.grpc.Channel channel) {
      super(channel);
    }

    private calculatorStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected calculatorStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new calculatorStub(channel, callOptions);
    }

    /**
     */
    public void math(com.example.grpc.Calculator.calculation request,
        io.grpc.stub.StreamObserver<com.example.grpc.Calculator.Result> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getMathMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class calculatorBlockingStub extends io.grpc.stub.AbstractStub<calculatorBlockingStub> {
    private calculatorBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private calculatorBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected calculatorBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new calculatorBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.example.grpc.Calculator.Result math(com.example.grpc.Calculator.calculation request) {
      return blockingUnaryCall(
          getChannel(), getMathMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class calculatorFutureStub extends io.grpc.stub.AbstractStub<calculatorFutureStub> {
    private calculatorFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private calculatorFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected calculatorFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new calculatorFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.grpc.Calculator.Result> math(
        com.example.grpc.Calculator.calculation request) {
      return futureUnaryCall(
          getChannel().newCall(getMathMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_MATH = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final calculatorImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(calculatorImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_MATH:
          serviceImpl.math((com.example.grpc.Calculator.calculation) request,
              (io.grpc.stub.StreamObserver<com.example.grpc.Calculator.Result>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class calculatorBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    calculatorBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.example.grpc.Calculator.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("calculator");
    }
  }

  private static final class calculatorFileDescriptorSupplier
      extends calculatorBaseDescriptorSupplier {
    calculatorFileDescriptorSupplier() {}
  }

  private static final class calculatorMethodDescriptorSupplier
      extends calculatorBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    calculatorMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (calculatorGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new calculatorFileDescriptorSupplier())
              .addMethod(getMathMethod())
              .build();
        }
      }
    }
    return result;
  }
}
