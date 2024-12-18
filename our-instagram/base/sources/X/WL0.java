package X;

import android.view.Surface;
import android.view.SurfaceHolder;

/* loaded from: classes11.dex */
public class WL0 implements SurfaceHolder.Callback {
    public Surface A00;
    public final C4RP A01;
    public final C121745fS A02;
    public final XC8 A03;

    public final void A01(Surface surface) {
        this.A00 = null;
        this.A03.DrB(surface);
        RunnableC71441Wu3 runnableC71441Wu3 = new RunnableC71441Wu3(surface, this);
        if (this.A02.A09) {
            this.A01.A0E(new RunnableC49826LzX(runnableC71441Wu3));
        } else {
            this.A01.A0E(null);
            runnableC71441Wu3.run();
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        C14360o3.A0B(surfaceHolder, 0);
        Surface surface = surfaceHolder.getSurface();
        C14360o3.A07(surface);
        this.A00 = surface;
        this.A01.A09(surface);
        this.A03.Dr5(surface);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        C14360o3.A0B(surfaceHolder, 0);
        Surface surface = surfaceHolder.getSurface();
        C14360o3.A07(surface);
        A01(surface);
    }

    public WL0(C4RP c4rp, C121745fS c121745fS, XC8 xc8) {
        this.A01 = c4rp;
        this.A02 = c121745fS;
        this.A03 = xc8;
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
    }
}
