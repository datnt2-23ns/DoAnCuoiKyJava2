import java.io.*;
import java.net.*;

public class FeedbackClient {

    private static final String SERVER_ADDRESS = "192.168.0.106";
    private static final int SERVER_PORT = 11119;

    public static String sendFeedback(String maDocGia, String tenDocGia, String noiDung) {
        StringBuilder response = new StringBuilder();
        try (Socket socket = new Socket(SERVER_ADDRESS, SERVER_PORT);
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()))) {

            out.println(maDocGia);
            out.println(tenDocGia);
            out.println(noiDung);

            // Đọc phản hồi từ server
            response.append(in.readLine());

        } catch (IOException e) {
            e.printStackTrace();
        }
        return response.toString();
    }

}