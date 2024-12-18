package X;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.OvershootInterpolator;
import android.view.animation.ScaleAnimation;

/* loaded from: classes11.dex */
public final class WjD implements InterfaceC72025XFn {
    public float A00;
    public float A01;
    public ScaleAnimation A02;
    public ScaleAnimation A03;
    public boolean A04;
    public Runnable A05;
    public final View A06;
    public final C68745VbO A07;

    public WjD(View view) {
        C14360o3.A0B(view, 1);
        this.A06 = view;
        this.A00 = view.getScaleX();
        this.A01 = view.getScaleY();
        this.A07 = new C68745VbO(this);
    }

    @Override // X.InterfaceC72025XFn
    public final void EM8(MotionEvent motionEvent) {
        RunnableC71348WsJ runnableC71348WsJ = new RunnableC71348WsJ(this);
        this.A05 = runnableC71348WsJ;
        this.A06.postDelayed(runnableC71348WsJ, 150L);
    }

    @Override // X.InterfaceC72025XFn
    public final void Enw() {
        if (this.A04) {
            ScaleAnimation scaleAnimation = this.A02;
            if (scaleAnimation != null) {
                scaleAnimation.cancel();
            }
            float f = this.A00;
            float f2 = this.A01;
            View view = this.A06;
            UB0 ub0 = new UB0(this.A07, f, 1.0f, f2, 1.0f, view.getWidth() / 2.0f, view.getHeight() / 2.0f);
            ub0.setInterpolator(new OvershootInterpolator());
            ub0.setDuration(ViewConfiguration.getLongPressTimeout());
            this.A03 = ub0;
            view.startAnimation(ub0);
            this.A04 = false;
            return;
        }
        this.A06.removeCallbacks(this.A05);
    }
}
