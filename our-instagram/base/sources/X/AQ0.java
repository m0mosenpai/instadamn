package X;

import android.graphics.SurfaceTexture;
import android.view.TextureView;

/* loaded from: classes4.dex */
public final class AQ0 implements TextureView.SurfaceTextureListener {
    public final /* synthetic */ AbstractC184988In A00;

    public AQ0(AbstractC184988In abstractC184988In) {
        this.A00 = abstractC184988In;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        AbstractC184988In abstractC184988In = this.A00;
        abstractC184988In.A02 = surfaceTexture;
        abstractC184988In.A01 = i;
        abstractC184988In.A00 = i2;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        AbstractC184988In abstractC184988In = this.A00;
        abstractC184988In.A01 = 0;
        abstractC184988In.A00 = 0;
        abstractC184988In.A02 = null;
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        AbstractC184988In abstractC184988In = this.A00;
        abstractC184988In.A01 = i;
        abstractC184988In.A00 = i2;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.A00.A02 = surfaceTexture;
    }
}
