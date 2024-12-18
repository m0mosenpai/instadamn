package X;

/* loaded from: classes11.dex */
public abstract class VMH {
    public static final String A00(String str, String str2, String str3) {
        if (str.length() != 0) {
            if (str.charAt(0) == '_') {
                str = str.substring(1);
                C14360o3.A07(str);
            }
            return AbstractC002300n.A0d(AbstractC167007dF.A0h(str), str2, str3, false);
        }
        return str;
    }
}
