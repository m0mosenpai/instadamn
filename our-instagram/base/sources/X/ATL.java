package X;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes4.dex */
public final class ATL implements View.OnTouchListener {
    public final /* synthetic */ GestureDetector A00;

    public ATL(GestureDetector gestureDetector) {
        this.A00 = gestureDetector;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return this.A00.onTouchEvent(motionEvent);
    }
}
