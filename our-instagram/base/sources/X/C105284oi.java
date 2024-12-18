package X;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* renamed from: X.4oi, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C105284oi extends GestureDetector.SimpleOnGestureListener implements InterfaceC676933j {
    public final /* synthetic */ C105274oh A00;

    @Override // X.InterfaceC676933j
    public final boolean DiJ(ScaleGestureDetectorOnScaleGestureListenerC81153jk scaleGestureDetectorOnScaleGestureListenerC81153jk) {
        return true;
    }

    @Override // X.InterfaceC676933j
    public final boolean DiK(ScaleGestureDetectorOnScaleGestureListenerC81153jk scaleGestureDetectorOnScaleGestureListenerC81153jk) {
        C14360o3.A0B(scaleGestureDetectorOnScaleGestureListenerC81153jk, 0);
        C105274oh c105274oh = this.A00;
        C75113Zb c75113Zb = c105274oh.A05;
        c75113Zb.A0h(true);
        c105274oh.A02.BQm().DiL(c105274oh.A04, c75113Zb, scaleGestureDetectorOnScaleGestureListenerC81153jk, c105274oh.A03.A0J, c105274oh.A01);
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        C14360o3.A0B(motionEvent, 0);
        C105274oh c105274oh = this.A00;
        InterfaceC105254of interfaceC105254of = c105274oh.A02;
        C38321qM c38321qM = c105274oh.A04;
        C75113Zb c75113Zb = c105274oh.A05;
        C105184oY c105184oY = c105274oh.A03;
        interfaceC105254of.DBV(c105184oY, c38321qM, I0O.A00(motionEvent, c105184oY.A0J), c75113Zb, c105274oh.A01);
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        C14360o3.A0B(motionEvent, 0);
        C105274oh c105274oh = this.A00;
        InterfaceC105254of interfaceC105254of = c105274oh.A02;
        C38321qM c38321qM = c105274oh.A04;
        C75113Zb c75113Zb = c105274oh.A05;
        C105184oY c105184oY = c105274oh.A03;
        interfaceC105254of.Dmg(c38321qM, I0O.A00(motionEvent, c105184oY.A0J), c105184oY, c75113Zb, c105274oh.A01, c105274oh.A00);
        return true;
    }

    public C105284oi(C105274oh c105274oh) {
        this.A00 = c105274oh;
    }

    @Override // X.InterfaceC676933j
    public final void DiP(ScaleGestureDetectorOnScaleGestureListenerC81153jk scaleGestureDetectorOnScaleGestureListenerC81153jk) {
        this.A00.A05.A0h(false);
    }
}
