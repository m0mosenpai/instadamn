package X;

import java.io.Closeable;

/* renamed from: X.20I, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C20I {
    public static final void A00(Closeable closeable, Throwable th) {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                C2Ql.A01(th, th2);
            }
        }
    }
}
