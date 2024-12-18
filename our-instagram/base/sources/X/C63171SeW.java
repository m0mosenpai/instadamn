package X;

import android.os.Build;
import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.SeW, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63171SeW {
    public static volatile C63171SeW A05;
    public int A00;
    public boolean A01 = true;
    public final AtomicBoolean A02 = AbstractC166997dE.A17();
    public static final boolean A04 = AbstractC167007dF.A1Q(Build.VERSION.SDK_INT, 29);
    public static final File A03 = AbstractC166987dD.A11("/proc/self/fd");

    public final boolean A01(int i, int i2, boolean z, boolean z2) {
        boolean z3;
        if (z && ((!A04 || this.A02.get()) && !z2 && i >= 0 && i2 >= 0)) {
            synchronized (this) {
                boolean z4 = true;
                int i3 = this.A00 + 1;
                this.A00 = i3;
                if (i3 >= 50) {
                    this.A00 = 0;
                    int length = A03.list().length;
                    if (length >= 20000) {
                        z4 = false;
                    }
                    this.A01 = z4;
                    if (!z4 && android.util.Log.isLoggable("Downsampler", 5)) {
                        StringBuilder A1C = AbstractC166987dD.A1C();
                        A1C.append("Excluding HARDWARE bitmap config because we're over the file descriptor limit, file descriptors ");
                        A1C.append(length);
                        android.util.Log.w("Downsampler", AbstractC58320PtC.A13(", limit ", A1C, 20000L));
                    }
                }
                z3 = this.A01;
            }
            if (z3) {
                return true;
            }
        }
        android.util.Log.isLoggable("HardwareConfig", 2);
        return false;
    }

    public static C63171SeW A00() {
        if (A05 == null) {
            synchronized (C63171SeW.class) {
                if (A05 == null) {
                    A05 = new C63171SeW();
                }
            }
        }
        return A05;
    }
}
