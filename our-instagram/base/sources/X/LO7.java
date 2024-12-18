package X;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView;

/* loaded from: classes8.dex */
public final class LO7 implements TextureView.SurfaceTextureListener {
    public final int A00;
    public final int A01;
    public final String A02;
    public final /* synthetic */ LIj A03;

    public LO7(LIj lIj, String str, int i, int i2) {
        C14360o3.A0B(str, 4);
        this.A03 = lIj;
        this.A01 = i;
        this.A00 = i2;
        this.A02 = str;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        C14360o3.A0B(surfaceTexture, 0);
        LIj lIj = this.A03;
        if (lIj.A02 == null) {
            Surface surface = new Surface(surfaceTexture);
            lIj.A02 = surface;
            C95334Qt c95334Qt = lIj.A03;
            if (c95334Qt != null) {
                c95334Qt.setSurface(surface);
            }
            LIj.A01(lIj, this.A02, this.A01, this.A00);
            return;
        }
        throw AbstractC31172DnG.A0u();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        LIj lIj = this.A03;
        C95334Qt c95334Qt = lIj.A03;
        if (c95334Qt != null) {
            c95334Qt.EE5(false);
        }
        Surface surface = lIj.A02;
        if (surface != null) {
            surface.release();
        }
        lIj.A02 = null;
        return true;
    }
}
