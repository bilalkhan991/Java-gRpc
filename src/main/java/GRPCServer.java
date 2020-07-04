import com.example.user.GRPCServiceImpl;
import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class GRPCServer {

    public static void main(String[] args) throws IOException, InterruptedException {

        Server server = ServerBuilder.forPort(9090)
                //.addService(new UserService())
                .addService(new GRPCServiceImpl())
                .build();
        server.start();

        System.out.println("Server started at port :" + server.getPort());

        server.awaitTermination();

    }
}