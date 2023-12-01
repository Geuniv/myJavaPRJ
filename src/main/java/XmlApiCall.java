import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class XmlApiCall {
    public static void main(String[] args) {
        try {
            // URL 객체를 생성하고 웹 주소를 넣습니다.
            URL url = new URL("https://apihub.kma.go.kr/api/typ09/url/eqk/urlNewNotiEqk.do?frDate=20200101&laDate=20201231&cntDiv=Y&orderTy=xml&authKey=DIdS2JmzSt6HUtiZs2re8g");
            // HttpURLConnection 객체를 생성합니다.
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            // 요청 방식을 GET으로 설정합니다.
            con.setRequestMethod("GET");
            // BufferedReader 객체를 생성하고 HttpURLConnection의 InputStream을 넣습니다.
            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String inputLine;
            StringBuffer xmlContent = new StringBuffer();
            // 서버로부터 받은 데이터를 줄단위로 읽습니다.
            while ((inputLine = in.readLine()) != null) {
                xmlContent.append(inputLine);
            }
            // BufferedReader를 닫습니다.
            in.close();
            // HttpURLConnection을 닫습니다.
            con.disconnect();
            // 출력
            System.out.println(xmlContent.toString());
        } catch (Exception e) {
            // 예외 발생시 스택트레이스를 출력합니다.
            e.printStackTrace();
        }
    }
}