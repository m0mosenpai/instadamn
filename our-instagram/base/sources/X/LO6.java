package X;

import android.graphics.SurfaceTexture;
import android.view.TextureView;

/* loaded from: classes8.dex */
public final class LO6 implements TextureView.SurfaceTextureListener {
    public final /* synthetic */ InterfaceC174767qC A00;
    public final /* synthetic */ C47982LJb A01;

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public LO6(InterfaceC174767qC interfaceC174767qC, C47982LJb c47982LJb) {
        this.A01 = c47982LJb;
        this.A00 = interfaceC174767qC;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        C47982LJb.A02(this.A00, this.A01, i, i2);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        InterfaceC174767qC interfaceC174767qC = this.A00;
        boolean z = false;
        if (interfaceC174767qC.EjF()) {
            interfaceC174767qC.EbS(null, 0, 0);
            z = true;
        }
        interfaceC174767qC.Eod(null);
        interfaceC174767qC.disconnect();
        return z;
    }
}
