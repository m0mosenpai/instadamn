package X;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* loaded from: classes7.dex */
public final class J11 implements InterfaceC149626oF {
    public final /* synthetic */ GestureDetector A00;

    @Override // X.InterfaceC149626oF
    public final boolean DMc(MotionEvent motionEvent) {
        return true;
    }

    @Override // X.InterfaceC149626oF
    public final boolean Du7(MotionEvent motionEvent) {
        C14360o3.A0B(motionEvent, 0);
        this.A00.onTouchEvent(motionEvent);
        return true;
    }

    @Override // X.InterfaceC149626oF
    public final void EJW(float f, float f2) {
    }

    @Override // X.InterfaceC149626oF
    public final void destroy() {
    }

    public J11(GestureDetector gestureDetector) {
        this.A00 = gestureDetector;
    }
}
