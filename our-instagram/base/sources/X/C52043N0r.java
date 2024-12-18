package X;

import android.graphics.SurfaceTexture;
import android.view.Surface;

/* renamed from: X.N0r, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52043N0r extends ACM {
    public Surface A00;
    public final SurfaceTexture A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C52043N0r(SurfaceTexture surfaceTexture) {
        super(false, false);
        C14360o3.A0B(surfaceTexture, 1);
        this.A01 = surfaceTexture;
    }

    @Override // X.ACM
    public final boolean A01() {
        return true;
    }

    @Override // X.ACM
    public final Surface A00(U7W u7w) {
        super.A01 = u7w;
        Surface surface = this.A00;
        if (surface == null) {
            Surface surface2 = new Surface(this.A01);
            this.A00 = surface2;
            return surface2;
        }
        return surface;
    }
}
