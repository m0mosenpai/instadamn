package X;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* loaded from: classes8.dex */
public final class JXL extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ C3DP A00;

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        C14360o3.A0B(motionEvent, 0);
        C3DP c3dp = this.A00;
        ViewOnTouchListenerC65896Tw0 viewOnTouchListenerC65896Tw0 = c3dp.A0D;
        if (viewOnTouchListenerC65896Tw0 != null && viewOnTouchListenerC65896Tw0.A09 != 2 && c3dp.A0Z()) {
            c3dp.A0U(c3dp.A0b(Float.valueOf(motionEvent.getY())));
            InterfaceC65577TnB interfaceC65577TnB = c3dp.A0G;
            if (interfaceC65577TnB != null) {
                interfaceC65577TnB.DmX();
            }
        }
        return false;
    }

    public JXL(C3DP c3dp) {
        this.A00 = c3dp;
    }
}
