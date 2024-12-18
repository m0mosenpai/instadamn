package X;

import android.graphics.SurfaceTexture;
import android.view.TextureView;

/* loaded from: classes11.dex */
public final class WL3 implements TextureView.SurfaceTextureListener {
    public final /* synthetic */ C66305U8d A00;

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    public WL3(C66305U8d c66305U8d) {
        this.A00 = c66305U8d;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        C66305U8d c66305U8d = this.A00;
        if (c66305U8d.isVisible() && c66305U8d.A0A) {
            C66305U8d.A05(c66305U8d);
        }
    }
}
