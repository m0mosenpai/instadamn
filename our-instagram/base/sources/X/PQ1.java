package X;

import android.graphics.SurfaceTexture;
import android.os.Handler;
import com.facebook.proxygen.LigerSamplePolicy;

/* loaded from: classes9.dex */
public final class PQ1 implements Runnable {
    public final /* synthetic */ SurfaceTexture A00;
    public final /* synthetic */ C56208OxH A01;

    public PQ1(SurfaceTexture surfaceTexture, C56208OxH c56208OxH) {
        this.A01 = c56208OxH;
        this.A00 = surfaceTexture;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C56208OxH c56208OxH = this.A01;
        SurfaceTexture surfaceTexture = this.A00;
        int i = c56208OxH.A01;
        int i2 = c56208OxH.A00;
        MXD mxd = c56208OxH.A08;
        C178577wV c178577wV = mxd.A00;
        if (c178577wV != null) {
            c178577wV.A06();
            C197368o7 c197368o7 = c56208OxH.A02;
            if (c197368o7 == null) {
                c197368o7 = mxd.A00(new C55722Ooo(surfaceTexture, c56208OxH, c56208OxH.A09, i, i2));
                c56208OxH.A02 = c197368o7;
            }
            if (c197368o7 != null) {
                Handler handler = c56208OxH.A05;
                Runnable runnable = c56208OxH.A0A;
                handler.removeCallbacks(runnable);
                c197368o7.A04();
                handler.postDelayed(runnable, LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT);
                c56208OxH.A07.A00(c56208OxH);
            }
        }
    }
}
