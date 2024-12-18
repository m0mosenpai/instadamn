package X;

import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes4.dex */
public final class ATU implements View.OnTouchListener {
    public static final ATU A00 = new ATU();

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        view.performClick();
        return true;
    }
}
