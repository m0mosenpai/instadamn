package X;

import android.view.MotionEvent;

/* loaded from: classes8.dex */
public final class L71 {
    public float A00;
    public final int A01;

    public final boolean A00(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 2 || AbstractC166987dD.A01(this.A00, motionEvent.getX()) <= this.A01) {
                return false;
            }
            return true;
        }
        this.A00 = motionEvent.getX();
        return false;
    }

    public L71(int i) {
        this.A01 = i;
    }
}
