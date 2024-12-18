package X;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;

/* loaded from: classes12.dex */
public final class Y8E implements TextureView.SurfaceTextureListener, SurfaceHolder.Callback, InterfaceC65186TfU, YM7, YM9, YMI, YMN, YMP, YMX {
    public final /* synthetic */ Y8T A00;

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public Y8E(Y8T y8t) {
        this.A00 = y8t;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        Y8T y8t = this.A00;
        Y8T y8t2 = Y8T.$redex_init_class;
        Surface surface = new Surface(surfaceTexture);
        Y8T.A05(y8t, surface);
        y8t.A03 = surface;
        Y8T.A03(y8t, i, i2);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        Y8T y8t = this.A00;
        Y8T.A05(y8t, null);
        Y8T.A03(y8t, 0, 0);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        Y8T.A03(this.A00, i, i2);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        Y8T.A03(this.A00, i2, i3);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        Y8T.A03(this.A00, 0, 0);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        Y8T y8t = Y8T.$redex_init_class;
    }
}
