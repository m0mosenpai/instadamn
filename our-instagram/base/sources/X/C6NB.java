package X;

import android.os.Build;
import java.util.Locale;

/* renamed from: X.6NB, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C6NB {
    public static final C6NC A00;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [X.6NC] */
    static {
        C6NC c6nc;
        String lowerCase = Build.FINGERPRINT.toLowerCase(Locale.ROOT);
        C14360o3.A07(lowerCase);
        if (lowerCase.equals("robolectric")) {
            c6nc = new C6ND() { // from class: X.6NC
                @Override // X.C6ND
                public final void EM6(C6NF c6nf) {
                }
            };
        } else {
            c6nc = null;
        }
        A00 = c6nc;
    }
}
