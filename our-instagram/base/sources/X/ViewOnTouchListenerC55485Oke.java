package X;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

/* renamed from: X.Oke, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class ViewOnTouchListenerC55485Oke implements View.OnTouchListener {
    public final GestureDetector A00;
    public final /* synthetic */ C51474MoL A01;

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C14360o3.A0B(motionEvent, 1);
        boolean onTouchEvent = this.A00.onTouchEvent(motionEvent);
        if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && !onTouchEvent) {
            this.A01.A01();
        }
        return onTouchEvent;
    }

    public ViewOnTouchListenerC55485Oke(GestureDetector gestureDetector, C51474MoL c51474MoL) {
        this.A01 = c51474MoL;
        this.A00 = gestureDetector;
    }
}
