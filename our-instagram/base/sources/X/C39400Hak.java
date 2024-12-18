package X;

import android.view.MotionEvent;

/* renamed from: X.Hak, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39400Hak extends UA1 implements InterfaceC676933j {
    public final int A00;
    public final InterfaceC904641g A01;
    public final C81473kH A02;
    public final C38321qM A03;
    public final C75113Zb A04;

    @Override // X.InterfaceC676933j
    public final boolean DiJ(ScaleGestureDetectorOnScaleGestureListenerC81153jk scaleGestureDetectorOnScaleGestureListenerC81153jk) {
        return true;
    }

    @Override // X.InterfaceC676933j
    public final boolean DiK(ScaleGestureDetectorOnScaleGestureListenerC81153jk scaleGestureDetectorOnScaleGestureListenerC81153jk) {
        C14360o3.A0B(scaleGestureDetectorOnScaleGestureListenerC81153jk, 0);
        C75113Zb c75113Zb = this.A04;
        c75113Zb.A0h(true);
        this.A01.Dna(this.A02, this.A03, c75113Zb, scaleGestureDetectorOnScaleGestureListenerC81153jk, this.A00);
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        C14360o3.A0B(motionEvent, 0);
        InterfaceC904641g interfaceC904641g = this.A01;
        C38321qM c38321qM = this.A03;
        C75113Zb c75113Zb = this.A04;
        C81473kH c81473kH = this.A02;
        interfaceC904641g.DnZ(c81473kH, c38321qM, I0O.A00(motionEvent, c81473kH.A09), c75113Zb, this.A00);
        return true;
    }

    @Override // X.UA1
    public final void A00(MotionEvent motionEvent) {
        InterfaceC904641g interfaceC904641g = this.A01;
        C38321qM c38321qM = this.A03;
        C75113Zb c75113Zb = this.A04;
        C81473kH c81473kH = this.A02;
        interfaceC904641g.Dnb(c81473kH, c38321qM, I0O.A00(motionEvent, c81473kH.A09), c75113Zb, this.A00);
    }

    @Override // X.InterfaceC676933j
    public final void DiP(ScaleGestureDetectorOnScaleGestureListenerC81153jk scaleGestureDetectorOnScaleGestureListenerC81153jk) {
        this.A04.A0h(false);
    }

    public C39400Hak(InterfaceC904641g interfaceC904641g, C81473kH c81473kH, C38321qM c38321qM, C75113Zb c75113Zb, int i) {
        AbstractC167017dG.A1P(c38321qM, c75113Zb);
        this.A03 = c38321qM;
        this.A04 = c75113Zb;
        this.A00 = i;
        this.A02 = c81473kH;
        this.A01 = interfaceC904641g;
    }
}
