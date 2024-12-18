package X;

/* renamed from: X.2Kl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C48442Kl {
    public static final Object A00 = new Object();
    public static volatile C48442Kl A01;

    /* JADX WARN: Type inference failed for: r0v3, types: [X.2Kl, java.lang.Object] */
    public static C48442Kl A00() {
        C48442Kl c48442Kl;
        synchronized (A00) {
            if (A01 == null) {
                A01 = new Object();
            }
            c48442Kl = A01;
        }
        return c48442Kl;
    }

    public static String A01(String tag) {
        int length = tag.length();
        StringBuilder sb = new StringBuilder(23);
        sb.append("WM-");
        if (length >= 20) {
            tag = tag.substring(0, 20);
        }
        sb.append(tag);
        return sb.toString();
    }
}
