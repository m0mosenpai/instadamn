package X;

/* renamed from: X.1QD, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C1QD {
    public static final InterfaceC08100bW A00 = new C1QF("IgSecureUriParser").A00;

    public static final boolean A01(String str) {
        android.net.Uri A02;
        if (str == null || (A02 = AbstractC08820cl.A02(A00, str, true)) == null) {
            return false;
        }
        return A00(A02.getHost());
    }

    public static final boolean A00(String str) {
        if (str != null) {
            if (str.equals("instagram.com") || str.endsWith(".instagram.com")) {
                return true;
            }
            return false;
        }
        return false;
    }
}
