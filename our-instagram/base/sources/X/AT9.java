package X;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes4.dex */
public final class AT9 implements View.OnTouchListener {
    public final /* synthetic */ GestureDetector A00;

    public AT9(GestureDetector gestureDetector) {
        this.A00 = gestureDetector;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C14360o3.A0B(motionEvent, 1);
        this.A00.onTouchEvent(motionEvent);
        return true;
    }
}
