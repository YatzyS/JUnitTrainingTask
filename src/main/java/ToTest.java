public class ToTest {

    public String removeA(String args) {
        String ans = "";
        char[] arr = args.toCharArray();
        int c = 0;
        for(char a: arr ) {
            if(a == 'A' && c<2) {
                c++;
                continue;
            }
            System.out.println(ans);
            ans += a;
            c++;
        }
        return ans;
    }
}
