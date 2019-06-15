public class ToTest {

    public String removeA(String args) {
        String ans = "";
        char[] arr = args.toCharArray();
        for(char a: arr ) {
            if(a == 'A') {
                continue;
            }
            ans += a;
        }
        return ans;
    }
}
