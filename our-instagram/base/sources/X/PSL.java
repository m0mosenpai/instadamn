package X;

import android.graphics.SurfaceTexture;

/* loaded from: classes9.dex */
public final class PSL implements Runnable {
    public final /* synthetic */ SurfaceTexture A00;
    public final /* synthetic */ C197368o7 A01;
    public final /* synthetic */ C56208OxH A02;

    public PSL(SurfaceTexture surfaceTexture, C197368o7 c197368o7, C56208OxH c56208OxH) {
        this.A02 = c56208OxH;
        this.A01 = c197368o7;
        this.A00 = surfaceTexture;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C197368o7 c197368o7 = this.A01;
        SurfaceTexture surfaceTexture = this.A00;
        c197368o7.A03();
        surfaceTexture.release();
    }
}
