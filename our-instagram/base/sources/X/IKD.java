package X;

import android.content.Context;
import android.view.GestureDetector;

/* loaded from: classes7.dex */
public final class IKD {
    public final int A00;
    public final GestureDetector A01;
    public final InterfaceC43438JHc A02;
    public final C3Y6 A03;
    public final C38321qM A04;
    public final C75113Zb A05;
    public final ScaleGestureDetectorOnScaleGestureListenerC81153jk A06;
    public final C38305Gso A07;

    public IKD(Context context, InterfaceC43438JHc interfaceC43438JHc, C3Y6 c3y6, C38321qM c38321qM, C75113Zb c75113Zb, int i) {
        AbstractC167017dG.A1R(interfaceC43438JHc, c3y6);
        AbstractC167017dG.A1T(c38321qM, c75113Zb);
        this.A02 = interfaceC43438JHc;
        this.A03 = c3y6;
        this.A00 = i;
        this.A04 = c38321qM;
        this.A05 = c75113Zb;
        C38305Gso c38305Gso = new C38305Gso(this);
        this.A07 = c38305Gso;
        GestureDetector gestureDetector = new GestureDetector(context, c38305Gso);
        gestureDetector.setIsLongpressEnabled(false);
        this.A01 = gestureDetector;
        ScaleGestureDetectorOnScaleGestureListenerC81153jk scaleGestureDetectorOnScaleGestureListenerC81153jk = new ScaleGestureDetectorOnScaleGestureListenerC81153jk(context);
        scaleGestureDetectorOnScaleGestureListenerC81153jk.A01.add(c38305Gso);
        this.A06 = scaleGestureDetectorOnScaleGestureListenerC81153jk;
    }
}
