package X;

import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes11.dex */
public final class WO1 implements View.OnTouchListener {
    public static final WO1 A00 = new WO1();

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        float f = 1.0f;
        if (motionEvent.getAction() == 0) {
            f = 0.25f;
        }
        view.setAlpha(f);
        return false;
    }
}
