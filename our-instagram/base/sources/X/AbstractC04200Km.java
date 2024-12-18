package X;

/* renamed from: X.0Km, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC04200Km {
    public static String A00;
    public static final C04190Kl A01 = new Object();

    public static final String A00() {
        C04190Kl c04190Kl = A01;
        if (A00 == null) {
            synchronized (c04190Kl) {
                String str = A00;
                if (str != null) {
                    return str;
                }
                String l = Long.toString(System.currentTimeMillis());
                C14360o3.A07(l);
                A00 = AnonymousClass001.A0T(l, C09840fj.A00(), '-');
            }
        }
        String str2 = A00;
        C14360o3.A0A(str2);
        return str2;
    }
}
