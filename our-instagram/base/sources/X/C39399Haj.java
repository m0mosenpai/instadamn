package X;

import android.view.MotionEvent;

/* renamed from: X.Haj, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39399Haj extends UA1 implements InterfaceC676933j {
    public final /* synthetic */ C42614ItX A00;

    @Override // X.InterfaceC676933j
    public final boolean DiJ(ScaleGestureDetectorOnScaleGestureListenerC81153jk scaleGestureDetectorOnScaleGestureListenerC81153jk) {
        return true;
    }

    @Override // X.InterfaceC676933j
    public final boolean DiK(ScaleGestureDetectorOnScaleGestureListenerC81153jk scaleGestureDetectorOnScaleGestureListenerC81153jk) {
        C14360o3.A0B(scaleGestureDetectorOnScaleGestureListenerC81153jk, 0);
        C42614ItX c42614ItX = this.A00;
        C75113Zb c75113Zb = c42614ItX.A04;
        c75113Zb.A0h(true);
        c42614ItX.A01.BQm().DiL(c42614ItX.A03, c75113Zb, scaleGestureDetectorOnScaleGestureListenerC81153jk, c42614ItX.A02.A09, c42614ItX.A00);
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        C14360o3.A0B(motionEvent, 0);
        C42614ItX c42614ItX = this.A00;
        JPY jpy = c42614ItX.A01;
        C38321qM c38321qM = c42614ItX.A03;
        C75113Zb c75113Zb = c42614ItX.A04;
        C81473kH c81473kH = c42614ItX.A02;
        jpy.DBU(c81473kH, c38321qM, I0O.A00(motionEvent, c81473kH.A09), c75113Zb, c42614ItX.A00);
        return true;
    }

    public C39399Haj(C42614ItX c42614ItX) {
        this.A00 = c42614ItX;
    }

    @Override // X.UA1
    public final void A00(MotionEvent motionEvent) {
        C42614ItX c42614ItX = this.A00;
        JPY jpy = c42614ItX.A01;
        C38321qM c38321qM = c42614ItX.A03;
        C75113Zb c75113Zb = c42614ItX.A04;
        C81473kH c81473kH = c42614ItX.A02;
        jpy.Dmf(c81473kH, c38321qM, I0O.A00(motionEvent, c81473kH.A09), c75113Zb, c42614ItX.A00);
    }

    @Override // X.InterfaceC676933j
    public final void DiP(ScaleGestureDetectorOnScaleGestureListenerC81153jk scaleGestureDetectorOnScaleGestureListenerC81153jk) {
        this.A00.A04.A0h(false);
    }
}
