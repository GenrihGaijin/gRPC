package ru.otus.torwel.protobuf.generated;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.35.0)",
    comments = "Source: RemoteSequenceService.proto")
public final class RemoteSequenceServiceGrpc {

  private RemoteSequenceServiceGrpc() {}

  public static final String SERVICE_NAME = "ru.otus.torwel.protobuf.generated.RemoteSequenceService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ru.otus.torwel.protobuf.generated.BoundsMessage,
      ru.otus.torwel.protobuf.generated.ValueMessage> getGetSequenceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getSequence",
      requestType = ru.otus.torwel.protobuf.generated.BoundsMessage.class,
      responseType = ru.otus.torwel.protobuf.generated.ValueMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<ru.otus.torwel.protobuf.generated.BoundsMessage,
      ru.otus.torwel.protobuf.generated.ValueMessage> getGetSequenceMethod() {
    io.grpc.MethodDescriptor<ru.otus.torwel.protobuf.generated.BoundsMessage, ru.otus.torwel.protobuf.generated.ValueMessage> getGetSequenceMethod;
    if ((getGetSequenceMethod = RemoteSequenceServiceGrpc.getGetSequenceMethod) == null) {
      synchronized (RemoteSequenceServiceGrpc.class) {
        if ((getGetSequenceMethod = RemoteSequenceServiceGrpc.getGetSequenceMethod) == null) {
          RemoteSequenceServiceGrpc.getGetSequenceMethod = getGetSequenceMethod =
              io.grpc.MethodDescriptor.<ru.otus.torwel.protobuf.generated.BoundsMessage, ru.otus.torwel.protobuf.generated.ValueMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getSequence"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ru.otus.torwel.protobuf.generated.BoundsMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ru.otus.torwel.protobuf.generated.ValueMessage.getDefaultInstance()))
              .setSchemaDescriptor(new RemoteSequenceServiceMethodDescriptorSupplier("getSequence"))
              .build();
        }
      }
    }
    return getGetSequenceMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RemoteSequenceServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RemoteSequenceServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RemoteSequenceServiceStub>() {
        @java.lang.Override
        public RemoteSequenceServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RemoteSequenceServiceStub(channel, callOptions);
        }
      };
    return RemoteSequenceServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RemoteSequenceServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RemoteSequenceServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RemoteSequenceServiceBlockingStub>() {
        @java.lang.Override
        public RemoteSequenceServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RemoteSequenceServiceBlockingStub(channel, callOptions);
        }
      };
    return RemoteSequenceServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static RemoteSequenceServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RemoteSequenceServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RemoteSequenceServiceFutureStub>() {
        @java.lang.Override
        public RemoteSequenceServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RemoteSequenceServiceFutureStub(channel, callOptions);
        }
      };
    return RemoteSequenceServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class RemoteSequenceServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getSequence(ru.otus.torwel.protobuf.generated.BoundsMessage request,
        io.grpc.stub.StreamObserver<ru.otus.torwel.protobuf.generated.ValueMessage> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetSequenceMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetSequenceMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                ru.otus.torwel.protobuf.generated.BoundsMessage,
                ru.otus.torwel.protobuf.generated.ValueMessage>(
                  this, METHODID_GET_SEQUENCE)))
          .build();
    }
  }

  /**
   */
  public static final class RemoteSequenceServiceStub extends io.grpc.stub.AbstractAsyncStub<RemoteSequenceServiceStub> {
    private RemoteSequenceServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RemoteSequenceServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RemoteSequenceServiceStub(channel, callOptions);
    }

    /**
     */
    public void getSequence(ru.otus.torwel.protobuf.generated.BoundsMessage request,
        io.grpc.stub.StreamObserver<ru.otus.torwel.protobuf.generated.ValueMessage> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getGetSequenceMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class RemoteSequenceServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<RemoteSequenceServiceBlockingStub> {
    private RemoteSequenceServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RemoteSequenceServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RemoteSequenceServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public java.util.Iterator<ru.otus.torwel.protobuf.generated.ValueMessage> getSequence(
        ru.otus.torwel.protobuf.generated.BoundsMessage request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getGetSequenceMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class RemoteSequenceServiceFutureStub extends io.grpc.stub.AbstractFutureStub<RemoteSequenceServiceFutureStub> {
    private RemoteSequenceServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RemoteSequenceServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RemoteSequenceServiceFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_GET_SEQUENCE = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final RemoteSequenceServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(RemoteSequenceServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_SEQUENCE:
          serviceImpl.getSequence((ru.otus.torwel.protobuf.generated.BoundsMessage) request,
              (io.grpc.stub.StreamObserver<ru.otus.torwel.protobuf.generated.ValueMessage>) responseObserver);
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

  private static abstract class RemoteSequenceServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    RemoteSequenceServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ru.otus.torwel.protobuf.generated.RemoteSequenceServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("RemoteSequenceService");
    }
  }

  private static final class RemoteSequenceServiceFileDescriptorSupplier
      extends RemoteSequenceServiceBaseDescriptorSupplier {
    RemoteSequenceServiceFileDescriptorSupplier() {}
  }

  private static final class RemoteSequenceServiceMethodDescriptorSupplier
      extends RemoteSequenceServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    RemoteSequenceServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (RemoteSequenceServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new RemoteSequenceServiceFileDescriptorSupplier())
              .addMethod(getGetSequenceMethod())
              .build();
        }
      }
    }
    return result;
  }
}
