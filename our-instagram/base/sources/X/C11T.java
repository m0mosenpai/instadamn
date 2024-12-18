package X;

import android.os.Handler;
import android.os.Looper;

/* renamed from: X.11T, reason: invalid class name */
/* loaded from: classes.dex */
public final class C11T {
    public static InterfaceC16660sJ A00;
    public static final C11T A01 = new Object();
    public static final InterfaceC09390do A02 = AbstractC09440dt.A01(C11U.A00);

    public static final void A01(Runnable runnable) {
        C14360o3.A0B(runnable, 0);
        ((Handler) A02.getValue()).removeCallbacks(runnable);
    }

    public static final void A02(Runnable runnable) {
        C14360o3.A0B(runnable, 0);
        A07(false, runnable);
    }

    public static final void A04(Runnable runnable, long j) {
        C14360o3.A0B(runnable, 0);
        ((Handler) A02.getValue()).postDelayed(runnable, j);
    }

    public static final void A00() {
        A06("This operation must be run on UI thread.");
    }

    public static final void A03(Runnable runnable) {
        ((Handler) A02.getValue()).post(runnable);
    }

    public static final void A05(String str) {
        if (!A08()) {
        } else {
            throw new IllegalStateException(str);
        }
    }

    public static final void A06(String str) {
        if (A08()) {
        } else {
            throw new IllegalStateException(str);
        }
    }

    public static final void A07(boolean z, Runnable runnable) {
        if (A08()) {
            runnable.run();
            return;
        }
        if (z) {
            ((Handler) A02.getValue()).postAtFrontOfQueue(runnable);
            return;
        }
        InterfaceC16660sJ interfaceC16660sJ = A00;
        if (interfaceC16660sJ != null) {
            interfaceC16660sJ.invoke(new C9E0(runnable, 10));
        } else {
            ((Handler) A02.getValue()).post(runnable);
        }
    }

    public static final boolean A08() {
        return C14360o3.A0K(Looper.getMainLooper(), Looper.myLooper());
    }
}
