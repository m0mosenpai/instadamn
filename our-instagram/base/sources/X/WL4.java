package X;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView;

/* loaded from: classes11.dex */
public final class WL4 implements TextureView.SurfaceTextureListener {
    public final /* synthetic */ C66486UJo A00;

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public WL4(C66486UJo c66486UJo) {
        this.A00 = c66486UJo;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        C66486UJo c66486UJo = this.A00;
        int i3 = C3OO.FLAG_ADAPTER_FULLUPDATE;
        C02R.A07(AbstractC25229BEm.A1Z(c66486UJo.A00), null);
        Surface surface = new Surface(surfaceTexture);
        c66486UJo.A00 = surface;
        InterfaceC95344Qu interfaceC95344Qu = c66486UJo.A03;
        if (interfaceC95344Qu != null) {
            interfaceC95344Qu.setSurface(surface);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        C66486UJo.A01(this.A00);
        return true;
    }
}
