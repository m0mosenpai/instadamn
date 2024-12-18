package X;

import android.view.MotionEvent;

/* renamed from: X.Hai, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39398Hai extends UA1 implements InterfaceC676933j {
    public final /* synthetic */ C41153IJs A00;

    @Override // X.InterfaceC676933j
    public final boolean DiJ(ScaleGestureDetectorOnScaleGestureListenerC81153jk scaleGestureDetectorOnScaleGestureListenerC81153jk) {
        return true;
    }

    public C39398Hai(C41153IJs c41153IJs) {
        this.A00 = c41153IJs;
    }

    @Override // X.UA1
    public final void A00(MotionEvent motionEvent) {
        C41153IJs c41153IJs = this.A00;
        InterfaceC904141b interfaceC904141b = c41153IJs.A02;
        C38321qM c38321qM = c41153IJs.A04;
        C75113Zb c75113Zb = c41153IJs.A05;
        C69228Vjw c69228Vjw = c41153IJs.A03;
        interfaceC904141b.Dme(c69228Vjw, c38321qM, I0O.A00(motionEvent, c69228Vjw.A03), c75113Zb, c41153IJs.A00);
    }

    @Override // X.InterfaceC676933j
    public final boolean DiK(ScaleGestureDetectorOnScaleGestureListenerC81153jk scaleGestureDetectorOnScaleGestureListenerC81153jk) {
        C41153IJs c41153IJs = this.A00;
        C75113Zb c75113Zb = c41153IJs.A05;
        c75113Zb.A0h(true);
        c41153IJs.A02.BQm().DiL(c41153IJs.A04, c75113Zb, scaleGestureDetectorOnScaleGestureListenerC81153jk, c41153IJs.A03.A03, c41153IJs.A00);
        return true;
    }

    @Override // X.InterfaceC676933j
    public final void DiP(ScaleGestureDetectorOnScaleGestureListenerC81153jk scaleGestureDetectorOnScaleGestureListenerC81153jk) {
        this.A00.A05.A0h(false);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        C41153IJs c41153IJs = this.A00;
        InterfaceC904141b interfaceC904141b = c41153IJs.A02;
        C38321qM c38321qM = c41153IJs.A04;
        C75113Zb c75113Zb = c41153IJs.A05;
        C69228Vjw c69228Vjw = c41153IJs.A03;
        interfaceC904141b.DBT(c69228Vjw, c38321qM, I0O.A00(motionEvent, c69228Vjw.A03), c75113Zb, c41153IJs.A00);
        return true;
    }
}
