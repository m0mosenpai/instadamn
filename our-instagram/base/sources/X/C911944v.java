package X;

/* renamed from: X.44v, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C911944v {
    public static final C912044w A00;
    public static final C912044w A01;
    public static final C912044w A02;
    public static final C912044w A03;

    static {
        C912044w c912044w = new C912044w("MIME", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", '=', 76, true);
        A00 = c912044w;
        A01 = new C912044w(c912044w, "MIME-NO-LINEFEEDS", Integer.MAX_VALUE);
        A03 = new C912044w(c912044w, "PEM", 64);
        StringBuilder sb = new StringBuilder("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/");
        sb.setCharAt(sb.indexOf("+"), '-');
        sb.setCharAt(sb.indexOf("/"), '_');
        A02 = new C912044w("MODIFIED-FOR-URL", sb.toString(), (char) 0, Integer.MAX_VALUE, false);
    }
}
