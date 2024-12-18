package X;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* renamed from: X.3jj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C81143jj extends GestureDetector.SimpleOnGestureListener implements InterfaceC676933j {
    public final /* synthetic */ C81133ji A00;

    @Override // X.InterfaceC676933j
    public final boolean DiJ(ScaleGestureDetectorOnScaleGestureListenerC81153jk scaleGestureDetectorOnScaleGestureListenerC81153jk) {
        return true;
    }

    @Override // X.InterfaceC676933j
    public final boolean DiK(ScaleGestureDetectorOnScaleGestureListenerC81153jk scaleGestureDetectorOnScaleGestureListenerC81153jk) {
        C14360o3.A0B(scaleGestureDetectorOnScaleGestureListenerC81153jk, 0);
        C81133ji c81133ji = this.A00;
        C75113Zb c75113Zb = c81133ji.A03;
        c75113Zb.A0h(true);
        c81133ji.A02.BQm().DiL(c81133ji.A01, c75113Zb, scaleGestureDetectorOnScaleGestureListenerC81153jk, c81133ji.A04, c81133ji.A00);
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        C14360o3.A0B(motionEvent, 0);
        C81133ji c81133ji = this.A00;
        c81133ji.A02.DBY(c81133ji.A01, I0O.A00(motionEvent, c81133ji.A04), c81133ji.A03, c81133ji.A00);
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        C14360o3.A0B(motionEvent, 0);
        C81133ji c81133ji = this.A00;
        c81133ji.A02.Dmj(c81133ji.A01, I0O.A00(motionEvent, c81133ji.A04), c81133ji.A03, c81133ji.A00);
        return true;
    }

    public C81143jj(C81133ji c81133ji) {
        this.A00 = c81133ji;
    }

    @Override // X.InterfaceC676933j
    public final void DiP(ScaleGestureDetectorOnScaleGestureListenerC81153jk scaleGestureDetectorOnScaleGestureListenerC81153jk) {
        this.A00.A03.A0h(false);
    }
}
