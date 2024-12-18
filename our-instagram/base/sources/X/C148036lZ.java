package X;

import android.view.MotionEvent;

/* renamed from: X.6lZ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C148036lZ implements InterfaceC149626oF {
    public final C145826hf A00;
    public final GestureDetectorOnGestureListenerC148016lX A01;

    public C148036lZ(C145826hf c145826hf, GestureDetectorOnGestureListenerC148016lX gestureDetectorOnGestureListenerC148016lX) {
        C14360o3.A0B(c145826hf, 2);
        this.A01 = gestureDetectorOnGestureListenerC148016lX;
        this.A00 = c145826hf;
    }

    @Override // X.InterfaceC149626oF
    public final boolean DMc(MotionEvent motionEvent) {
        C14360o3.A0B(motionEvent, 0);
        return this.A01.DMc(motionEvent);
    }

    @Override // X.InterfaceC149626oF
    public final boolean Du7(MotionEvent motionEvent) {
        C14360o3.A0B(motionEvent, 0);
        return this.A01.Du7(motionEvent);
    }

    @Override // X.InterfaceC149626oF
    public final void EJW(float f, float f2) {
        this.A01.EJW(f, f2);
    }

    @Override // X.InterfaceC149626oF
    public final void destroy() {
        this.A01.destroy();
    }
}
