package X;

import android.graphics.SurfaceTexture;
import android.view.TextureView;

/* loaded from: classes11.dex */
public final class Utg extends TextureViewSurfaceTextureListenerC121805fY {
    public SurfaceTexture A00;
    public final TextureView A01;
    public final C121745fS A02;
    public final XLD A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Utg(TextureView textureView, C4RP c4rp, C4RP c4rp2, C121745fS c121745fS, XLD xld) {
        super(c4rp, c4rp2, c121745fS, xld);
        C14360o3.A0B(c121745fS, 2);
        this.A02 = c121745fS;
        this.A01 = textureView;
        this.A03 = xld;
    }

    @Override // X.TextureViewSurfaceTextureListenerC121805fY, android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        SurfaceTexture surfaceTexture2;
        C14360o3.A0B(surfaceTexture, 0);
        if (this.A02.A07 && (surfaceTexture2 = this.A00) != null) {
            try {
                this.A01.setSurfaceTexture(surfaceTexture2);
                this.A00 = null;
                return;
            } catch (IllegalArgumentException e) {
                this.A03.DrN(e);
            }
        }
        this.A00 = null;
        super.onSurfaceTextureAvailable(surfaceTexture, i, i2);
    }

    @Override // X.TextureViewSurfaceTextureListenerC121805fY, android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        C14360o3.A0B(surfaceTexture, 0);
        if (this.A02.A02) {
            this.A00 = surfaceTexture;
            return false;
        }
        return super.onSurfaceTextureDestroyed(surfaceTexture);
    }
}
