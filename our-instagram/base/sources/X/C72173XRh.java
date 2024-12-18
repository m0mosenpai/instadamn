package X;

import android.graphics.SurfaceTexture;
import android.view.Surface;

/* renamed from: X.XRh, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C72173XRh extends AbstractC185778Lx implements InterfaceC185788Ly {
    public Surface A00;
    public final SurfaceTexture A01;

    @Override // X.AbstractC185778Lx, X.InterfaceC185788Ly
    public final boolean AFZ() {
        return false;
    }

    @Override // X.InterfaceC185788Ly
    public final EnumC197888oz BI3() {
        return null;
    }

    @Override // X.InterfaceC185788Ly
    public final String BOj() {
        return "FakeVideoOutput";
    }

    @Override // X.AbstractC185778Lx, X.InterfaceC185788Ly
    public final void DrC() {
    }

    @Override // X.AbstractC185778Lx, X.InterfaceC185788Ly
    public final int getHeight() {
        return 0;
    }

    @Override // X.AbstractC185778Lx, X.InterfaceC185788Ly
    public final int getWidth() {
        return 0;
    }

    @Override // X.AbstractC185778Lx, X.InterfaceC185788Ly
    public final void release() {
        Surface surface = this.A00;
        if (surface != null) {
            surface.release();
            this.A00 = null;
        }
        super.release();
    }

    public C72173XRh(SurfaceTexture surfaceTexture) {
        this.A01 = surfaceTexture;
    }

    @Override // X.InterfaceC185788Ly
    public final EnumC185798Lz CFJ() {
        return EnumC185798Lz.PREVIEW;
    }

    @Override // X.InterfaceC185788Ly
    public final void CNg(InterfaceC197958p6 interfaceC197958p6, InterfaceC197978p8 interfaceC197978p8) {
        release();
        Surface surface = new Surface(this.A01);
        this.A00 = surface;
        interfaceC197958p6.EpX(surface, this);
    }

    @Override // X.InterfaceC185788Ly
    public final void destroy() {
        release();
    }
}
