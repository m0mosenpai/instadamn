package X;

import android.graphics.SurfaceTexture;

/* loaded from: classes9.dex */
public final class PQ0 implements Runnable {
    public final /* synthetic */ SurfaceTexture A00;
    public final /* synthetic */ C56208OxH A01;

    public PQ0(SurfaceTexture surfaceTexture, C56208OxH c56208OxH) {
        this.A01 = c56208OxH;
        this.A00 = surfaceTexture;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C56208OxH c56208OxH = this.A01;
        SurfaceTexture surfaceTexture = this.A00;
        c56208OxH.A05.removeCallbacks(c56208OxH.A0A);
        C197368o7 c197368o7 = c56208OxH.A02;
        c56208OxH.A02 = null;
        if (c197368o7 != null && c56208OxH.A08.A00 != null) {
            c197368o7.A0C(new PSL(surfaceTexture, c197368o7, c56208OxH));
            c56208OxH.A07.A02.remove(c56208OxH);
        } else {
            surfaceTexture.release();
        }
    }
}
