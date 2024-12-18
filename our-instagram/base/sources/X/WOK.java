package X;

import android.view.ViewTreeObserver;

/* loaded from: classes11.dex */
public final class WOK implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ long A00;
    public final /* synthetic */ C70684Wf5 A01;

    public WOK(C70684Wf5 c70684Wf5, long j) {
        this.A01 = c70684Wf5;
        this.A00 = j;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        long currentTimeMillis = System.currentTimeMillis();
        long currentTimeMillis2 = System.currentTimeMillis();
        C70684Wf5 c70684Wf5 = this.A01;
        if (currentTimeMillis2 - c70684Wf5.A00 >= 33) {
            c70684Wf5.A00 = currentTimeMillis;
            C66305U8d c66305U8d = c70684Wf5.A02;
            if (c66305U8d != null) {
                c66305U8d.A09 = true;
                C66305U8d.A05(c66305U8d);
                if (System.currentTimeMillis() - this.A00 > 1000) {
                    MSX.A13(c70684Wf5.A0E, this);
                    c70684Wf5.A01 = null;
                }
            }
            c70684Wf5.A00 = currentTimeMillis;
        }
        return true;
    }
}
