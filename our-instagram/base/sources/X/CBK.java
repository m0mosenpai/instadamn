package X;

import android.view.MotionEvent;

/* loaded from: classes5.dex */
public abstract class CBK {
    public static final void A00(C6KW c6kw, InterfaceC16660sJ interfaceC16660sJ, long j, boolean z) {
        C25256BFu c25256BFu = c6kw.A02;
        if (c25256BFu != null) {
            MotionEvent motionEvent = c25256BFu.A02.A00;
            int action = motionEvent.getAction();
            if (z) {
                motionEvent.setAction(3);
            }
            float A01 = C119365at.A01(j);
            float A02 = C119365at.A02(j);
            motionEvent.offsetLocation(-A01, -A02);
            interfaceC16660sJ.invoke(motionEvent);
            motionEvent.offsetLocation(A01, A02);
            motionEvent.setAction(action);
            return;
        }
        throw AbstractC166987dD.A12("The PointerEvent receiver cannot have a null MotionEvent.");
    }
}
