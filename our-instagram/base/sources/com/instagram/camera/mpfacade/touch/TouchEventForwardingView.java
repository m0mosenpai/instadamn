package com.instagram.camera.mpfacade.touch;

import X.C14360o3;
import X.C8IA;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes3.dex */
public final class TouchEventForwardingView extends View {
    public View A00;
    public C8IA A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TouchEventForwardingView(Context context) {
        super(context);
        C14360o3.A0B(context, 1);
    }

    @Override // android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        C8IA c8ia;
        MotionEvent motionEvent2 = motionEvent;
        C14360o3.A0B(motionEvent2, 0);
        if (this.A00 == null || (c8ia = this.A01) == null || !c8ia.Eii(motionEvent2)) {
            return false;
        }
        if (motionEvent2.getActionMasked() == 0) {
            motionEvent2 = MotionEvent.obtain(motionEvent2.getEventTime(), motionEvent2.getEventTime(), motionEvent2.getAction(), motionEvent2.getX(), motionEvent2.getY(), motionEvent2.getPressure(), motionEvent2.getSize(), motionEvent2.getMetaState(), motionEvent2.getXPrecision(), motionEvent2.getYPrecision(), motionEvent2.getDeviceId(), motionEvent2.getEdgeFlags());
        }
        View view = this.A00;
        if (view != null) {
            view.dispatchTouchEvent(motionEvent2);
        }
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TouchEventForwardingView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
        C14360o3.A0B(attributeSet, 2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TouchEventForwardingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C14360o3.A0B(context, 1);
        C14360o3.A0B(attributeSet, 2);
    }
}
