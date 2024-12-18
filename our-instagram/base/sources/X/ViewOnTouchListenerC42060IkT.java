package X;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: X.IkT, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class ViewOnTouchListenerC42060IkT implements View.OnTouchListener {
    public static final ViewOnTouchListenerC42060IkT A00 = new ViewOnTouchListenerC42060IkT();

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        float f;
        boolean A1R = AbstractC167007dF.A1R(0, view, motionEvent);
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != A1R && action != 3) {
                return false;
            }
            f = 1.0f;
        } else {
            f = 0.75f;
        }
        view.setAlpha(f);
        return false;
    }
}
