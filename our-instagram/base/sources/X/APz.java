package X;

import android.graphics.SurfaceTexture;
import android.view.TextureView;

/* loaded from: classes4.dex */
public final class APz implements TextureView.SurfaceTextureListener {
    public final /* synthetic */ C180157z5 A00;

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public APz(C180157z5 c180157z5) {
        this.A00 = c180157z5;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        C180157z5 c180157z5 = this.A00;
        C176507t8 c176507t8 = c180157z5.A08;
        c180157z5.A08 = null;
        if (c176507t8 != null) {
            c176507t8.A01();
        }
        C176507t8 c176507t82 = new C176507t8(surfaceTexture, false);
        c176507t82.A06 = c180157z5.A00;
        c180157z5.A08 = c176507t82;
        c180157z5.A06 = i;
        c180157z5.A05 = i2;
        C180157z5.A01(c180157z5, c176507t82);
        C180157z5.A04(c180157z5, c176507t82, i, i2);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        C180157z5 c180157z5 = this.A00;
        C176507t8 c176507t8 = c180157z5.A08;
        if (c176507t8 != null && c176507t8.A0B == surfaceTexture) {
            c180157z5.A08 = null;
            c180157z5.A06 = 0;
            c180157z5.A05 = 0;
            C180157z5.A03(c180157z5, c176507t8);
            c176507t8.A01();
        }
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        C180157z5 c180157z5 = this.A00;
        C176507t8 c176507t8 = c180157z5.A08;
        if (c176507t8 != null && c176507t8.A0B == surfaceTexture) {
            c180157z5.A06 = i;
            c180157z5.A05 = i2;
            C180157z5.A04(c180157z5, c176507t8, i, i2);
        }
    }
}
