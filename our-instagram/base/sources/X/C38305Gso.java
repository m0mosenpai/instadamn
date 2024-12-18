package X;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* renamed from: X.Gso, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38305Gso extends GestureDetector.SimpleOnGestureListener implements InterfaceC676933j {
    public final /* synthetic */ IKD A00;

    @Override // X.InterfaceC676933j
    public final boolean DiJ(ScaleGestureDetectorOnScaleGestureListenerC81153jk scaleGestureDetectorOnScaleGestureListenerC81153jk) {
        return true;
    }

    @Override // X.InterfaceC676933j
    public final boolean DiK(ScaleGestureDetectorOnScaleGestureListenerC81153jk scaleGestureDetectorOnScaleGestureListenerC81153jk) {
        C14360o3.A0B(scaleGestureDetectorOnScaleGestureListenerC81153jk, 0);
        IKD ikd = this.A00;
        C75113Zb c75113Zb = ikd.A05;
        c75113Zb.A0h(true);
        ikd.A02.D5u(ikd.A03, ikd.A04, c75113Zb, scaleGestureDetectorOnScaleGestureListenerC81153jk, ikd.A00);
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        C14360o3.A0B(motionEvent, 0);
        IKD ikd = this.A00;
        InterfaceC43438JHc interfaceC43438JHc = ikd.A02;
        C38321qM c38321qM = ikd.A04;
        C75113Zb c75113Zb = ikd.A05;
        C3Y6 c3y6 = ikd.A03;
        interfaceC43438JHc.DBO(c3y6, c38321qM, I0O.A00(motionEvent, c3y6.A0F), c75113Zb, ikd.A00);
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        C14360o3.A0B(motionEvent, 0);
        IKD ikd = this.A00;
        InterfaceC43438JHc interfaceC43438JHc = ikd.A02;
        C38321qM c38321qM = ikd.A04;
        C75113Zb c75113Zb = ikd.A05;
        C3Y6 c3y6 = ikd.A03;
        interfaceC43438JHc.DmV(c3y6, c38321qM, I0O.A00(motionEvent, c3y6.A01), c75113Zb, ikd.A00);
        return true;
    }

    public C38305Gso(IKD ikd) {
        this.A00 = ikd;
    }

    @Override // X.InterfaceC676933j
    public final void DiP(ScaleGestureDetectorOnScaleGestureListenerC81153jk scaleGestureDetectorOnScaleGestureListenerC81153jk) {
        this.A00.A05.A0h(false);
    }
}
