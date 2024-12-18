package X;

import android.graphics.SurfaceTexture;
import android.view.Surface;

/* renamed from: X.AoA, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C24187AoA implements YQR {
    public final Surface A00;

    @Override // X.YQR
    public final void EYM(C72740XmC c72740XmC) {
    }

    @Override // X.YQR
    public final int C4O() {
        return 720;
    }

    @Override // X.YQR
    public final int C4S() {
        return 405;
    }

    @Override // X.YQR
    public final boolean Ca8() {
        return false;
    }

    @Override // X.YQR
    public final Surface getSurface() {
        return this.A00;
    }

    public C24187AoA(SurfaceTexture surfaceTexture) {
        this.A00 = new Surface(surfaceTexture);
    }

    @Override // X.YQR
    public final void Ecc(long j) {
    }
}
