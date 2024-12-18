package X;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView;

/* loaded from: classes4.dex */
public final class AQ1 implements TextureView.SurfaceTextureListener {
    public final /* synthetic */ C187058Qy A00;

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        C14360o3.A0B(surfaceTexture, 0);
        C187058Qy c187058Qy = this.A00;
        if (c187058Qy.A04 == null) {
            Surface surface = new Surface(surfaceTexture);
            c187058Qy.A04 = surface;
            C95334Qt c95334Qt = c187058Qy.A08;
            if (c95334Qt != null) {
                c95334Qt.setSurface(surface);
                return;
            }
            return;
        }
        throw AbstractC166987dD.A14("Check failed.");
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public AQ1(C187058Qy c187058Qy) {
        this.A00 = c187058Qy;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        C187058Qy c187058Qy = this.A00;
        C95334Qt c95334Qt = c187058Qy.A08;
        if (c95334Qt != null) {
            c95334Qt.EE5(false);
        }
        c187058Qy.A08 = null;
        Surface surface = c187058Qy.A04;
        if (surface != null) {
            surface.release();
        }
        c187058Qy.A04 = null;
        return true;
    }
}
