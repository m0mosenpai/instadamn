package X;

import android.content.Context;
import android.view.GestureDetector;

/* renamed from: X.IJt, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41154IJt {
    public final Context A00;
    public final GestureDetector A01;
    public final InterfaceC904641g A02;
    public final C81473kH A03;
    public final C38321qM A04;
    public final C75113Zb A05;
    public final ScaleGestureDetectorOnScaleGestureListenerC81153jk A06;

    public /* synthetic */ C41154IJt(Context context, InterfaceC904641g interfaceC904641g, C81473kH c81473kH, C38321qM c38321qM, C75113Zb c75113Zb, int i) {
        C39400Hak c39400Hak = new C39400Hak(interfaceC904641g, c81473kH, c38321qM, c75113Zb, i);
        ScaleGestureDetectorOnScaleGestureListenerC81153jk scaleGestureDetectorOnScaleGestureListenerC81153jk = new ScaleGestureDetectorOnScaleGestureListenerC81153jk(context);
        GestureDetector gestureDetector = new GestureDetector(context, c39400Hak);
        AbstractC167017dG.A1R(c38321qM, c75113Zb);
        this.A00 = context;
        this.A04 = c38321qM;
        this.A05 = c75113Zb;
        this.A03 = c81473kH;
        this.A02 = interfaceC904641g;
        this.A06 = scaleGestureDetectorOnScaleGestureListenerC81153jk;
        this.A01 = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
        scaleGestureDetectorOnScaleGestureListenerC81153jk.A01.add(c39400Hak);
    }
}
