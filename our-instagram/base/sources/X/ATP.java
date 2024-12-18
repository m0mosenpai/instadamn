package X;

import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes4.dex */
public final class ATP implements View.OnTouchListener {
    public int A00;
    public float A01;
    public int A02;

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C14360o3.A0B(motionEvent, 1);
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1 && this.A02 == 2 && AbstractC166987dD.A01(motionEvent.getY(), this.A01) > 10.0f) {
                this.A00++;
            }
        } else {
            this.A01 = motionEvent.getY();
        }
        this.A02 = motionEvent.getAction();
        return false;
    }
}
