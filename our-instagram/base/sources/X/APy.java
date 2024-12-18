package X;

import android.view.Surface;
import android.view.SurfaceHolder;

/* loaded from: classes4.dex */
public final class APy implements SurfaceHolder.Callback {
    public final /* synthetic */ C180157z5 A00;

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
    }

    public APy(C180157z5 c180157z5) {
        this.A00 = c180157z5;
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        C180157z5 c180157z5 = this.A00;
        Surface surface = surfaceHolder.getSurface();
        surface.getClass();
        synchronized (c180157z5) {
            C176507t8 c176507t8 = c180157z5.A08;
            if (c176507t8 != null) {
                if (c176507t8.A00() != surface) {
                    c176507t8.A01();
                }
                c180157z5.A06 = i2;
                c180157z5.A05 = i3;
                C180157z5.A04(c180157z5, c176507t8, i2, i3);
            }
            c176507t8 = new C176507t8(surface, false);
            c176507t8.A08 = c180157z5.A01;
            c176507t8.A06 = c180157z5.A00;
            c180157z5.A08 = c176507t8;
            C180157z5.A01(c180157z5, c176507t8);
            c180157z5.A06 = i2;
            c180157z5.A05 = i3;
            C180157z5.A04(c180157z5, c176507t8, i2, i3);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        C180157z5 c180157z5 = this.A00;
        C176507t8 c176507t8 = c180157z5.A08;
        if (c176507t8 != null && c176507t8.A00() == surfaceHolder.getSurface()) {
            c180157z5.A08 = null;
            c180157z5.A06 = 0;
            c180157z5.A05 = 0;
            C180157z5.A03(c180157z5, c176507t8);
            c176507t8.A01();
        }
    }
}
