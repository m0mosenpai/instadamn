package X;

import android.os.Handler;
import android.os.Looper;

/* renamed from: X.63B, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C63B implements C63C {
    public static final Handler A00 = new Handler(Looper.getMainLooper());
    public static final C63B A01 = new Object();

    @Override // X.C63C
    public final void ATB(int i, int i2, String str, String str2) {
        C14360o3.A0B(str, 2);
        C006802i c006802i = C006802i.A0p;
        if (i == 7) {
            i = 36708819;
        }
        c006802i.markerAnnotate(i, i2, str, str2);
    }

    @Override // X.C63C
    public final void ATA(int i, int i2, String str, int i3) {
        C006802i.A0p.markerAnnotate(i, i2, "instance", i3);
    }

    @Override // X.C63C
    public final void ATD(int i, int i2) {
        C006802i c006802i = C006802i.A0p;
        if (i == 7) {
            i = 36708819;
        }
        c006802i.markerEnd(i, i2, (short) 3);
    }

    @Override // X.C63C
    public final void ATE(int i, int i2) {
        C006802i c006802i = C006802i.A0p;
        if (i == 7) {
            i = 36708819;
        }
        c006802i.markerEnd(i, i2, (short) 2);
    }

    @Override // X.C63C
    public final boolean ATF(int i, int i2) {
        C006802i.A0p.markerStart(i, i2);
        return C006802i.A0p.isMarkerOn(i, i2);
    }

    @Override // X.C63C
    public final long currentMonotonicTimestamp() {
        return C006802i.A0p.currentMonotonicTimestamp();
    }
}
