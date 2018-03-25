package message_gateways;

import util.ConnectionFactoryProvider;

import java.io.IOException;

public class GenericConsumer {

    //private Channel channel;
    private static GenericConsumer instance;

    private GenericConsumer() {
//        try {
//            ConnectionFactory connectionFactory = ConnectionFactoryProvider.getJMSConnectionFactory();
//            Connection connection = connectionFactory.newConnection();
//            this.channel = connection.createChannel();
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//        }
    }

    public static GenericConsumer getInstance() {
        if (instance == null) {
            instance = new GenericConsumer();
        }
        return instance;
    }

//    public Channel getChannel() {
//        return this.channel;
//    }
//
//    public void consume(String queueName, Consumer consumer) {
//        try {
//            channel.queueDeclare(queueName, false, false, false, null);
//
//            channel.basicConsume(queueName, true, consumer);
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//        }
//    }
}