package X;

import android.view.MotionEvent;

/* renamed from: X.Twj, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C65938Twj implements InterfaceC149626oF {
    public final ScaleGestureDetectorOnScaleGestureListenerC65939Twk A00;

    @Override // X.InterfaceC149626oF
    public final boolean DMc(MotionEvent motionEvent) {
        C14360o3.A0B(motionEvent, 0);
        return this.A00.DMc(motionEvent);
    }

    @Override // X.InterfaceC149626oF
    public final boolean Du7(MotionEvent motionEvent) {
        C14360o3.A0B(motionEvent, 0);
        return this.A00.Du7(motionEvent);
    }

    @Override // X.InterfaceC149626oF
    public final void EJW(float f, float f2) {
        this.A00.EJW(f, f2);
    }

    @Override // X.InterfaceC149626oF
    public final void destroy() {
        this.A00.destroy();
    }

    public C65938Twj(ScaleGestureDetectorOnScaleGestureListenerC65939Twk scaleGestureDetectorOnScaleGestureListenerC65939Twk) {
        this.A00 = scaleGestureDetectorOnScaleGestureListenerC65939Twk;
    }
}
