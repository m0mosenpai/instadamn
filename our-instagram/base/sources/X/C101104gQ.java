package X;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* renamed from: X.4gQ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C101104gQ extends GestureDetector.SimpleOnGestureListener implements InterfaceC676933j {
    public final /* synthetic */ C101094gP A00;

    @Override // X.InterfaceC676933j
    public final boolean DiJ(ScaleGestureDetectorOnScaleGestureListenerC81153jk scaleGestureDetectorOnScaleGestureListenerC81153jk) {
        return true;
    }

    @Override // X.InterfaceC676933j
    public final boolean DiK(ScaleGestureDetectorOnScaleGestureListenerC81153jk scaleGestureDetectorOnScaleGestureListenerC81153jk) {
        C14360o3.A0B(scaleGestureDetectorOnScaleGestureListenerC81153jk, 0);
        C101094gP c101094gP = this.A00;
        C75113Zb c75113Zb = c101094gP.A05;
        c75113Zb.A0h(true);
        c101094gP.A02.BQm().DiL(c101094gP.A04, c75113Zb, scaleGestureDetectorOnScaleGestureListenerC81153jk, c101094gP.A03.A0J, c101094gP.A01);
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        C14360o3.A0B(motionEvent, 0);
        C101094gP c101094gP = this.A00;
        InterfaceC101074gN interfaceC101074gN = c101094gP.A02;
        C38321qM c38321qM = c101094gP.A04;
        C75113Zb c75113Zb = c101094gP.A05;
        C905741s c905741s = c101094gP.A03;
        interfaceC101074gN.DBS(c905741s, c38321qM, I0O.A00(motionEvent, c905741s.A0J), c75113Zb, c101094gP.A01);
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        C14360o3.A0B(motionEvent, 0);
        C101094gP c101094gP = this.A00;
        InterfaceC101074gN interfaceC101074gN = c101094gP.A02;
        C38321qM c38321qM = c101094gP.A04;
        C75113Zb c75113Zb = c101094gP.A05;
        C905741s c905741s = c101094gP.A03;
        interfaceC101074gN.Dmc(c905741s, c38321qM, I0O.A00(motionEvent, c905741s.A0J), c75113Zb, c101094gP.A01, c101094gP.A00);
        return true;
    }

    public C101104gQ(C101094gP c101094gP) {
        this.A00 = c101094gP;
    }

    @Override // X.InterfaceC676933j
    public final void DiP(ScaleGestureDetectorOnScaleGestureListenerC81153jk scaleGestureDetectorOnScaleGestureListenerC81153jk) {
        this.A00.A05.A0h(false);
    }
}
