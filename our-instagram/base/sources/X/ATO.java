package X;

import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes4.dex */
public final class ATO implements View.OnTouchListener {
    public float A00 = 0.0f;
    public float A01 = 0.0f;
    public final Runnable A02;

    public ATO(Runnable runnable) {
        this.A02 = runnable;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (view.getScrollY() <= 10) {
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action == 2 && motionEvent.getY() - this.A01 >= 10.0f) {
                    if (AbstractC166987dD.A01(motionEvent.getX(), this.A00) * 2.0f < AbstractC166987dD.A01(motionEvent.getY(), this.A01)) {
                        this.A02.run();
                    }
                }
            } else {
                this.A00 = motionEvent.getX();
                this.A01 = motionEvent.getY();
                return false;
            }
        }
        return false;
    }
}
