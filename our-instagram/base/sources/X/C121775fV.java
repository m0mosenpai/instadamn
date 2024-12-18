package X;

import android.graphics.SurfaceTexture;
import android.view.Surface;

/* renamed from: X.5fV, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C121775fV implements InterfaceC121785fW {
    public final InterfaceC121765fU[] A00;

    public C121775fV(InterfaceC121765fU... interfaceC121765fUArr) {
        C14360o3.A0B(interfaceC121765fUArr, 1);
        this.A00 = interfaceC121765fUArr;
    }

    @Override // X.InterfaceC121765fU
    public final void DM6(SurfaceTexture surfaceTexture, Surface surface) {
        for (InterfaceC121765fU interfaceC121765fU : this.A00) {
            if (interfaceC121765fU != null) {
                interfaceC121765fU.DM6(surfaceTexture, surface);
            }
        }
    }

    @Override // X.InterfaceC121765fU
    public final void DrL(SurfaceTexture surfaceTexture, Surface surface, int i, int i2) {
        for (InterfaceC121765fU interfaceC121765fU : this.A00) {
            if (interfaceC121765fU != null) {
                interfaceC121765fU.DrL(surfaceTexture, surface, i, i2);
            }
        }
    }

    @Override // X.InterfaceC121765fU
    public final void DrM(SurfaceTexture surfaceTexture, Surface surface) {
        for (InterfaceC121765fU interfaceC121765fU : this.A00) {
            if (interfaceC121765fU != null) {
                interfaceC121765fU.DrM(surfaceTexture, surface);
            }
        }
    }

    @Override // X.InterfaceC121765fU
    public final void E1f(Surface surface) {
        for (InterfaceC121765fU interfaceC121765fU : this.A00) {
            if (interfaceC121765fU != null) {
                interfaceC121765fU.E1f(surface);
            }
        }
    }

    @Override // X.InterfaceC121765fU
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        for (InterfaceC121765fU interfaceC121765fU : this.A00) {
            if (interfaceC121765fU != null) {
                interfaceC121765fU.onSurfaceTextureUpdated(surfaceTexture);
            }
        }
    }
}
