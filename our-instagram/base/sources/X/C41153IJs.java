package X;

import android.content.Context;
import android.view.GestureDetector;

/* renamed from: X.IJs, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41153IJs {
    public final int A00;
    public final GestureDetector A01;
    public final InterfaceC904141b A02;
    public final C69228Vjw A03;
    public final C38321qM A04;
    public final C75113Zb A05;
    public final ScaleGestureDetectorOnScaleGestureListenerC81153jk A06;

    public C41153IJs(Context context, InterfaceC904141b interfaceC904141b, C69228Vjw c69228Vjw, C38321qM c38321qM, C75113Zb c75113Zb, int i) {
        C39398Hai c39398Hai = new C39398Hai(this);
        GestureDetector gestureDetector = new GestureDetector(context, c39398Hai);
        this.A01 = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
        ScaleGestureDetectorOnScaleGestureListenerC81153jk scaleGestureDetectorOnScaleGestureListenerC81153jk = new ScaleGestureDetectorOnScaleGestureListenerC81153jk(context);
        this.A06 = scaleGestureDetectorOnScaleGestureListenerC81153jk;
        scaleGestureDetectorOnScaleGestureListenerC81153jk.A01.add(c39398Hai);
        this.A02 = interfaceC904141b;
        this.A03 = c69228Vjw;
        this.A00 = i;
        this.A04 = c38321qM;
        this.A05 = c75113Zb;
    }
}
