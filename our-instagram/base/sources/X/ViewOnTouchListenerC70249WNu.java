package X;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

/* renamed from: X.WNu, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class ViewOnTouchListenerC70249WNu implements View.OnTouchListener {
    public final GestureDetector A00;

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C14360o3.A0B(motionEvent, 1);
        this.A00.onTouchEvent(motionEvent);
        return false;
    }

    public ViewOnTouchListenerC70249WNu(C3DP c3dp) {
        this.A00 = new GestureDetector(C3DP.A02(c3dp).getContext(), new C44406Jjj(c3dp, 10));
    }
}
