package X;

import android.graphics.SurfaceTexture;
import android.view.Surface;

/* renamed from: X.XRf, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C72171XRf extends AbstractC185778Lx {
    public SurfaceTexture A02;
    public Surface A03;
    public AnonymousClass810 A04;
    public int A01 = 1;
    public int A00 = 1;

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
        return AbstractC111324zv.A00(660);
    }

    @Override // X.AbstractC185778Lx, X.InterfaceC185788Ly
    public final void release() {
        Surface surface = this.A03;
        if (surface != null) {
            surface.release();
            this.A03 = null;
        }
        SurfaceTexture surfaceTexture = this.A02;
        if (surfaceTexture != null) {
            surfaceTexture.release();
            this.A02 = null;
        }
        AnonymousClass810 anonymousClass810 = this.A04;
        if (anonymousClass810 != null) {
            anonymousClass810.A01();
            this.A04 = null;
        }
        super.release();
    }

    public final Surface A00() {
        release();
        AnonymousClass810 anonymousClass810 = new AnonymousClass810(new AnonymousClass811(AbstractC111324zv.A00(660)));
        this.A04 = anonymousClass810;
        int i = this.A01;
        int i2 = this.A00;
        anonymousClass810.A00(i, i2);
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.A04.A00);
        this.A02 = surfaceTexture;
        surfaceTexture.setDefaultBufferSize(i, i2);
        Surface surface = new Surface(this.A02);
        this.A03 = surface;
        return surface;
    }

    @Override // X.InterfaceC185788Ly
    public final EnumC185798Lz CFJ() {
        return EnumC185798Lz.PREVIEW;
    }

    @Override // X.InterfaceC185788Ly
    public final void CNg(InterfaceC197958p6 interfaceC197958p6, InterfaceC197978p8 interfaceC197978p8) {
        interfaceC197958p6.EpX(A00(), this);
    }

    @Override // X.InterfaceC185788Ly
    public final void destroy() {
        release();
    }

    @Override // X.AbstractC185778Lx, X.InterfaceC185788Ly
    public final int getHeight() {
        return this.A00;
    }

    @Override // X.AbstractC185778Lx, X.InterfaceC185788Ly
    public final int getWidth() {
        return this.A01;
    }
}
