package X;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: X.IkI, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class ViewOnTouchListenerC42049IkI implements View.OnTouchListener {
    public final /* synthetic */ C7ET A00;

    public ViewOnTouchListenerC42049IkI(C7ET c7et) {
        this.A00 = c7et;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C7ET c7et = this.A00;
        ScaleGestureDetectorOnScaleGestureListenerC81153jk scaleGestureDetectorOnScaleGestureListenerC81153jk = c7et.A0B;
        if (scaleGestureDetectorOnScaleGestureListenerC81153jk != null) {
            scaleGestureDetectorOnScaleGestureListenerC81153jk.A01(motionEvent);
        }
        C7ET.A03(motionEvent, c7et);
        return true;
    }
}
