package X;

import android.graphics.SurfaceTexture;
import android.view.Surface;

/* renamed from: X.OVg, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55003OVg {
    public final Surface A00;
    public final Integer A01;
    public final SurfaceTexture A02;

    public final SurfaceTexture A00() {
        if (this.A01.intValue() != 0) {
            return null;
        }
        return this.A02;
    }

    public C55003OVg(SurfaceTexture surfaceTexture) {
        this.A02 = surfaceTexture;
        this.A00 = new Surface(surfaceTexture);
        this.A01 = C05F.A00;
    }

    public C55003OVg() {
        this.A02 = null;
        this.A00 = null;
        this.A01 = C05F.A01;
    }
}
