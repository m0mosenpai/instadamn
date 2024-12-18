package X;

import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import com.facebook.mediastreaming.opt.source.SurfaceTextureHolder;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes11.dex */
public final class WWm implements SurfaceTextureHolder {
    public int A00;
    public int A01;
    public W2J A02;
    public W3A A03;
    public final Handler A04;
    public final HandlerThread A05;
    public final C68912VeC A06;
    public final Map A07 = new HashMap();

    @Override // com.facebook.mediastreaming.opt.source.SurfaceTextureHolder
    public final int getHeight() {
        return this.A00;
    }

    @Override // com.facebook.mediastreaming.opt.source.SurfaceTextureHolder
    public final SurfaceTexture getSurfaceTexture() {
        W3A w3a = this.A03;
        C14360o3.A0A(w3a);
        SurfaceTexture surfaceTexture = w3a.A01;
        if (surfaceTexture != null) {
            return surfaceTexture;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // com.facebook.mediastreaming.opt.source.SurfaceTextureHolder
    public final int getWidth() {
        return this.A01;
    }

    public WWm(C68912VeC c68912VeC, int i, int i2) {
        this.A01 = i <= 0 ? 720 : i;
        this.A00 = i2 <= 0 ? 1280 : i2;
        this.A06 = c68912VeC;
        HandlerThread A0A = MSY.A0A("Frame handler thread");
        this.A05 = A0A;
        A0A.setUncaughtExceptionHandler(new C71647Wxu(this, 0));
        A0A.start();
        Handler A09 = MSY.A09(A0A);
        this.A04 = A09;
        AbstractC61788Rti.A00(A09, new RunnableC71253Wqi(this));
    }
}
