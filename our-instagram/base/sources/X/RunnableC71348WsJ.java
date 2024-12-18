package X;

import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.OvershootInterpolator;
import android.view.animation.ScaleAnimation;

/* renamed from: X.WsJ, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71348WsJ implements Runnable {
    public final /* synthetic */ WjD A00;

    public RunnableC71348WsJ(WjD wjD) {
        this.A00 = wjD;
    }

    @Override // java.lang.Runnable
    public final void run() {
        WjD wjD = this.A00;
        ScaleAnimation scaleAnimation = wjD.A03;
        if (scaleAnimation != null) {
            scaleAnimation.cancel();
        }
        float f = wjD.A00;
        float f2 = wjD.A01;
        View view = wjD.A06;
        UB0 ub0 = new UB0(wjD.A07, f, 0.92f, f2, 0.92f, view.getWidth() / 2.0f, view.getHeight() / 2.0f);
        ub0.setInterpolator(new OvershootInterpolator());
        ub0.setDuration(ViewConfiguration.getLongPressTimeout());
        wjD.A02 = ub0;
        view.startAnimation(ub0);
        wjD.A04 = true;
    }
}
