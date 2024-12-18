package X;

/* loaded from: classes10.dex */
public abstract class S27 {
    public static String A00(String str, String str2) {
        int length = str.length();
        int length2 = str2.length();
        int i = length - length2;
        if (i >= 0 && i <= 1) {
            StringBuilder A0r = AbstractC58318PtA.A0r(length, length2);
            for (int i2 = 0; i2 < length; i2++) {
                A0r.append(str.charAt(i2));
                if (length2 > i2) {
                    A0r.append(str2.charAt(i2));
                }
            }
            return A0r.toString();
        }
        throw AbstractC166987dD.A12("Invalid input received");
    }
}
