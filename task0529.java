public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;
        int a, summ = 0;

        while (!(s = br.readLine()).equals("сумма")) {
            a = Integer.parseInt(s);
            summ = summ + a;
        }

        System.out.println(summ);

    }
}
