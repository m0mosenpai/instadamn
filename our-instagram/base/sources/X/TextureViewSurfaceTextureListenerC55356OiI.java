package X;

import android.graphics.SurfaceTexture;
import android.view.TextureView;

/* renamed from: X.OiI, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class TextureViewSurfaceTextureListenerC55356OiI implements TextureView.SurfaceTextureListener {
    public final /* synthetic */ InterfaceC174767qC A00;
    public final /* synthetic */ C54989OTx A01;
    public final /* synthetic */ YP5 A02;

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public TextureViewSurfaceTextureListenerC55356OiI(InterfaceC174767qC interfaceC174767qC, C54989OTx c54989OTx, YP5 yp5) {
        this.A01 = c54989OTx;
        this.A02 = yp5;
        this.A00 = interfaceC174767qC;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        C54989OTx.A00(this.A00, this.A02, i, i2);
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
