package X;

import android.view.GestureDetector;
import android.view.ScaleGestureDetector;
import android.view.View;

/* renamed from: X.9X1, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9X1 extends AbstractC178807ws implements InterfaceC180067yw {
    public GestureDetector A00;
    public ScaleGestureDetector A01;
    public View.OnTouchListener A02;
    public View A03;
    public C54655OCh A04;
    public C22808A4b A05;
    public C22809A4c A06;
    public C54453O4h A07;
    public boolean A08;
    public final View.OnTouchListener A09;
    public final GestureDetector.SimpleOnGestureListener A0A;
    public final ScaleGestureDetector.OnScaleGestureListener A0B;

    public C9X1(InterfaceC178207vu interfaceC178207vu) {
        super.A00 = interfaceC178207vu;
        C44406Jjj c44406Jjj = new C44406Jjj(this, 0);
        this.A0A = c44406Jjj;
        C50779Mbl c50779Mbl = new C50779Mbl(this);
        this.A0B = c50779Mbl;
        this.A09 = new ViewOnTouchListenerC209789Po(this, 0);
        C178307w4 c178307w4 = InterfaceC178297w3.A00;
        InterfaceC178207vu interfaceC178207vu2 = super.A00;
        interfaceC178207vu2.getClass();
        InterfaceC178297w3 interfaceC178297w3 = (InterfaceC178297w3) interfaceC178207vu2.Aq1(c178307w4);
        C178037vc c178037vc = InterfaceC180067yw.A01;
        Boolean A0b = AbstractC166997dE.A0b();
        boolean A1a = AbstractC166987dD.A1a(A09(c178037vc, A0b));
        boolean A1a2 = AbstractC166987dD.A1a(A09(InterfaceC180067yw.A02, A0b));
        this.A08 = AbstractC166987dD.A1a(A09(InterfaceC180067yw.A03, A0b));
        if (A1a) {
            InterfaceC178207vu interfaceC178207vu3 = super.A00;
            interfaceC178207vu3.getClass();
            GestureDetector gestureDetector = new GestureDetector(interfaceC178207vu3.getContext(), c44406Jjj, ((C178267w0) interfaceC178297w3).A00);
            this.A00 = gestureDetector;
            gestureDetector.setOnDoubleTapListener(c44406Jjj);
            this.A00.setIsLongpressEnabled(false);
        }
        if (A1a2) {
            InterfaceC178207vu interfaceC178207vu4 = super.A00;
            interfaceC178207vu4.getClass();
            this.A01 = new ScaleGestureDetector(interfaceC178207vu4.getContext(), c50779Mbl, ((C178267w0) interfaceC178297w3).A00);
        }
    }
}
