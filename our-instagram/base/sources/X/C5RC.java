package X;

import android.os.SystemClock;
import java.lang.ref.WeakReference;

/* renamed from: X.5RC, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5RC {
    public WeakReference A00;
    public boolean A01;
    public boolean A02;
    public final L5N A03;
    public final boolean A04;
    public final boolean A05;

    public static final long A00() {
        if (C4S0.A00.A02) {
            return System.currentTimeMillis();
        }
        return SystemClock.elapsedRealtime();
    }

    public static final long A01(C5RC c5rc, String str) {
        C95334Qt c95334Qt;
        int A08;
        InterfaceC95164Qc interfaceC95164Qc = (InterfaceC95164Qc) c5rc.A00.get();
        if (interfaceC95164Qc != null) {
            A08 = interfaceC95164Qc.getCurrentPositionMs();
        } else if (str.equals(C4S0.A02)) {
            WeakReference weakReference = C4S0.A03;
            if (weakReference != null && (c95334Qt = (C95334Qt) weakReference.get()) != null) {
                A08 = (int) c95334Qt.A09.A0I.A08();
            } else {
                return -1L;
            }
        } else {
            return 0L;
        }
        return A08;
    }

    public static final void A02(C5RC c5rc, String str, int i, long j, long j2) {
        c5rc.A03.A06.add(new L2I(str, i, j2, j));
    }

    public C5RC(InterfaceC95164Qc interfaceC95164Qc, L5N l5n, boolean z, boolean z2) {
        this.A03 = l5n;
        this.A04 = z;
        this.A05 = z2;
        this.A00 = new WeakReference(interfaceC95164Qc);
    }
}
