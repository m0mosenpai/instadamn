package X;

import android.net.Uri;

/* renamed from: X.S1l, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC62190S1l {
    /* JADX WARN: Type inference failed for: r1v0, types: [X.0bW, X.0NO, java.lang.Object] */
    public static final String A00(String str) {
        if (str != null) {
            ?? obj = new Object();
            android.net.Uri A00 = AbstractC08820cl.A00(obj, str);
            if (A00 == null) {
                return null;
            }
            if (AbstractC63387Sj3.A05(A00)) {
                A00 = AbstractC63387Sj3.A00(A00, obj);
            }
            C14360o3.A0A(A00);
            Uri.Builder builder = new Uri.Builder();
            builder.scheme(A00.getScheme());
            builder.authority(A00.getAuthority());
            String A0q = AbstractC58319PtB.A0q(builder);
            if (A0q == null) {
                return str;
            }
            return A0q;
        }
        return str;
    }
}
