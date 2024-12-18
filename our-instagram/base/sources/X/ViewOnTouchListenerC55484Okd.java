package X;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

/* renamed from: X.Okd, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class ViewOnTouchListenerC55484Okd implements View.OnTouchListener {
    public final /* synthetic */ GestureDetector A00;
    public final /* synthetic */ InterfaceC145476h6 A01;

    public ViewOnTouchListenerC55484Okd(GestureDetector gestureDetector, InterfaceC145476h6 interfaceC145476h6) {
        this.A00 = gestureDetector;
        this.A01 = interfaceC145476h6;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C14360o3.A0B(motionEvent, 1);
        boolean onTouchEvent = this.A00.onTouchEvent(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if ((actionMasked != 1 && actionMasked != 3) || onTouchEvent) {
            return onTouchEvent;
        }
        this.A01.D2D(false, true);
        return onTouchEvent;
    }
}
