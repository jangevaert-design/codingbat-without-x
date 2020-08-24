public class withoutX {
  public String withoutX(String str) {
    int len = str.length();
    if (len > 0 && str.charAt(0) == 'x' && str.charAt(len - 1) != 'x') {
      return str.substring(1, len);
    } else if (len > 0 && str.charAt(0) != 'x' && str.charAt(len - 1) == 'x') {
      return str.substring(0, len -1);
    } else if (len == 1 && str.charAt(0) == 'x') {
      return "";
    } else if (len > 0 && str.charAt(0) == 'x' && str.charAt(len - 1) == 'x') {
      return str.substring(1, len - 1);
    } else {
      return str;
    }
  }
/* waaay more concise
  String s = str;
  if (str.startsWith("x")) {
    s = str.substring(1);
  }
  if (s.endsWith("x")) {
    s = s.substring(0, s.length() - 1);
  }
    return s;
  }
*/

}
