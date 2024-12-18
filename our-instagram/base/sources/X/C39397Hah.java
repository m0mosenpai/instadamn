package X;

import android.view.MotionEvent;

/* renamed from: X.Hah, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39397Hah extends C7EP {
    public final /* synthetic */ IJ7 A00;

    @Override // X.InterfaceC676933j
    public final boolean DiJ(ScaleGestureDetectorOnScaleGestureListenerC81153jk scaleGestureDetectorOnScaleGestureListenerC81153jk) {
        return true;
    }

    @Override // X.InterfaceC676933j
    public final boolean DiK(ScaleGestureDetectorOnScaleGestureListenerC81153jk scaleGestureDetectorOnScaleGestureListenerC81153jk) {
        C14360o3.A0B(scaleGestureDetectorOnScaleGestureListenerC81153jk, 0);
        IJ7 ij7 = this.A00;
        IN1 in1 = ij7.A01;
        JHM jhm = ij7.A00;
        if (in1 != null && jhm != null) {
            jhm.E2C(ij7.A02, ij7.A03, in1, scaleGestureDetectorOnScaleGestureListenerC81153jk);
            return true;
        }
        return true;
    }

    @Override // X.InterfaceC676933j
    public final void DiP(ScaleGestureDetectorOnScaleGestureListenerC81153jk scaleGestureDetectorOnScaleGestureListenerC81153jk) {
    }

    public C39397Hah(IJ7 ij7) {
        this.A00 = ij7;
    }

    @Override // X.C7EP
    public final void A00(MotionEvent motionEvent, C7EQ c7eq) {
        IJ7 ij7 = this.A00;
        IN1 in1 = ij7.A01;
        JHM jhm = ij7.A00;
        if (in1 != null && jhm != null) {
            jhm.F7v(ij7.A02, ij7.A03, in1, c7eq);
        }
    }
}
