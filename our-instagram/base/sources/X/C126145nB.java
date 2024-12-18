package X;

import android.view.Surface;
import android.view.SurfaceControl;

/* renamed from: X.5nB, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C126145nB implements InterfaceC126155nC {
    public Surface A00;
    public SurfaceControl A01;

    public final Surface A00() {
        return this.A00;
    }

    public final SurfaceControl A01() {
        return this.A01;
    }

    public final void A02() {
        Surface surface = this.A00;
        if (surface != null) {
            surface.release();
        }
        SurfaceControl surfaceControl = this.A01;
        if (surfaceControl != null) {
            surfaceControl.release();
        }
    }

    public C126145nB(Surface surface, SurfaceControl surfaceControl) {
        this.A01 = surfaceControl;
        this.A00 = surface;
    }

    public C126145nB() {
        this(null, null);
        SurfaceControl build = new SurfaceControl.Builder().setName(Integer.toHexString(hashCode())).setBufferSize(0, 0).build();
        C14360o3.A07(build);
        this.A01 = build;
        this.A00 = new Surface(build);
    }
}
