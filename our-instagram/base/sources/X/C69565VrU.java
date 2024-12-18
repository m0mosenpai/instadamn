package X;

import android.view.MotionEvent;
import android.view.VelocityTracker;

/* renamed from: X.VrU, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69565VrU {
    public float A00;
    public float A01;
    public VelocityTracker A02;

    public final void A00(MotionEvent motionEvent) {
        C14360o3.A0B(motionEvent, 0);
        VelocityTracker velocityTracker = this.A02;
        if (velocityTracker == null) {
            velocityTracker = VelocityTracker.obtain();
            this.A02 = velocityTracker;
            if (velocityTracker == null) {
                return;
            }
        }
        velocityTracker.addMovement(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action != 1 && action != 3) {
            return;
        }
        velocityTracker.computeCurrentVelocity(1);
        this.A00 = velocityTracker.getXVelocity();
        this.A01 = velocityTracker.getYVelocity();
        velocityTracker.recycle();
        this.A02 = null;
    }
}
