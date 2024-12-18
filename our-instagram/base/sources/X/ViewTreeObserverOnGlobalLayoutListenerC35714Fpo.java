package X;

import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: X.Fpo, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC35714Fpo implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int A00;
    public final Object A01;

    public ViewTreeObserverOnGlobalLayoutListenerC35714Fpo(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        boolean A1W;
        switch (this.A00) {
            case 0:
                C32285EJx c32285EJx = (C32285EJx) this.A01;
                C32285EJx.A0B(c32285EJx);
                C189478aR c189478aR = c32285EJx.A08;
                if (c189478aR == null) {
                    return;
                }
                c189478aR.A03.A0S(AbstractC167027dH.A01(c32285EJx.A0O));
                return;
            case 1:
                C31721DwQ c31721DwQ = (C31721DwQ) ((C31702Dw7) this.A01).A01;
                View view = c31721DwQ.mView;
                if (view == null) {
                    return;
                }
                AbstractC166997dE.A1K(view, this);
                C64500TGm c64500TGm = (C64500TGm) AbstractC27401Ut.getInstance().getPerformanceLogger(c31721DwQ.A0V);
                synchronized (c64500TGm) {
                    A1W = AbstractC167007dF.A1W(c64500TGm.A01);
                }
                if (!A1W) {
                    return;
                }
                c64500TGm.A0K.set(SystemClock.uptimeMillis());
                c64500TGm.Cks();
                return;
            default:
                return;
        }
    }
}
