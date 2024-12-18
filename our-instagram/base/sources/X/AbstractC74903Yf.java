package X;

import android.os.Looper;

/* renamed from: X.3Yf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC74903Yf {
    public static final long A00;
    public static final InterfaceC09390do A01 = AbstractC09440dt.A01(C74913Yg.A00);

    static {
        long j;
        try {
            j = Looper.getMainLooper().getThread().getId();
        } catch (Exception unused) {
            j = -1;
        }
        A00 = j;
    }
}
