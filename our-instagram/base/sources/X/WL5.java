package X;

import android.graphics.SurfaceTexture;
import android.view.TextureView;

/* loaded from: classes11.dex */
public final class WL5 implements TextureView.SurfaceTextureListener {
    public final TextureView.SurfaceTextureListener A00;
    public final /* synthetic */ C66305U8d A01;

    public WL5(TextureView.SurfaceTextureListener surfaceTextureListener, C66305U8d c66305U8d) {
        this.A01 = c66305U8d;
        this.A00 = surfaceTextureListener;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        TextureView.SurfaceTextureListener surfaceTextureListener = this.A00;
        if (surfaceTextureListener != null) {
            surfaceTextureListener.onSurfaceTextureAvailable(surfaceTexture, i, i2);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        TextureView.SurfaceTextureListener surfaceTextureListener = this.A00;
        if (surfaceTextureListener != null) {
            return surfaceTextureListener.onSurfaceTextureDestroyed(surfaceTexture);
        }
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        TextureView.SurfaceTextureListener surfaceTextureListener = this.A00;
        if (surfaceTextureListener != null) {
            surfaceTextureListener.onSurfaceTextureSizeChanged(surfaceTexture, i, i2);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        TextureView.SurfaceTextureListener surfaceTextureListener = this.A00;
        if (surfaceTextureListener != null) {
            surfaceTextureListener.onSurfaceTextureUpdated(surfaceTexture);
        }
        C66305U8d c66305U8d = this.A01;
        if (c66305U8d.isVisible() && c66305U8d.A0A) {
            C66305U8d.A05(c66305U8d);
        }
    }
}
