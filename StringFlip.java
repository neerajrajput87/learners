public class StringFlip {
 public static void main(String[] s) {
  String s = "WelcomeToGithub";
  StringFlip obj = new StringFlip();
  obj.stringFlipUsingXOR(s);
  System.out.println();
  obj.stringFlip(s);
 } 
 
 private void stringFlipUsingXOR(String s) {
  char[] c = s.toCharArray();
  for(int i = 0; i < c.length; i++) {
    c[i] ^= 32;
  }
  for(char ch: c) {
    System.out.print(ch);
  }
 }
 
 private void stringFlip(String s) {
  char[] c = s.toCharArray();
  for(int i = 0; i < c.length; i++) {
    if(ch[i] >= 'a' && ch[i] <= 'z')
      c[i] = (char)(c[i] - 32);
     else if(ch[i] >= 'A' && ch[i] <= 'Z')
      c[i] = (char)(c[i] + 32);
  }
  for(char ch: c) {
    System.out.print(ch);
  }
 }
}
