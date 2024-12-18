package X;

import android.view.GestureDetector;
import android.view.ScaleGestureDetector;
import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.Mbm, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class ViewOnTouchListenerC50780Mbm extends ScaleGestureDetector.SimpleOnScaleGestureListener implements View.OnTouchListener {
    public boolean A00;
    public final AbstractC59962oe A01;
    public final InterfaceC174767qC A02;
    public final InterfaceC09390do A03;
    public final GestureDetector A04;
    public final ScaleGestureDetector A05;
    public final C1815383g A06;

    @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        C14360o3.A0B(scaleGestureDetector, 0);
        C50924Met c50924Met = (C50924Met) this.A03.getValue();
        c50924Met.A04.Egh(new C26031BfK(c50924Met.A01 + ((scaleGestureDetector.getCurrentSpan() - c50924Met.A00) / this.A01.requireView().getWidth()), 4));
        return true;
    }

    @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        C14360o3.A0B(scaleGestureDetector, 0);
        C50924Met c50924Met = (C50924Met) this.A03.getValue();
        float currentSpan = scaleGestureDetector.getCurrentSpan();
        PZE.A02(c50924Met, AbstractC141776au.A00(c50924Met), 37);
        c50924Met.A00 = currentSpan;
        c50924Met.A01 = ((C26031BfK) c50924Met.A04.getValue()).A00;
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0021, code lost:
    
        if (r1 != false) goto L11;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouch(android.view.View r4, android.view.MotionEvent r5) {
        /*
            r3 = this;
            r1 = 1
            X.C14360o3.A0B(r5, r1)
            int r0 = r5.getActionMasked()
            r2 = 0
            if (r0 != 0) goto L32
            r3.A00 = r2
        Ld:
            android.view.ScaleGestureDetector r0 = r3.A05
            boolean r1 = r0.onTouchEvent(r5)
            boolean r0 = r3.A00
            if (r0 != 0) goto L24
            android.view.GestureDetector r0 = r3.A04
            boolean r0 = r0.onTouchEvent(r5)
            if (r0 != 0) goto L23
            r0 = r1
            r1 = 0
            if (r0 == 0) goto L24
        L23:
            r1 = 1
        L24:
            X.83g r0 = r3.A06
            if (r0 == 0) goto L3b
            boolean r0 = r0.A0B(r5)
            if (r0 != 0) goto L30
            if (r1 == 0) goto L31
        L30:
            r2 = 1
        L31:
            return r2
        L32:
            int r0 = r5.getPointerCount()
            if (r0 <= r1) goto Ld
            r3.A00 = r1
            goto Ld
        L3b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ViewOnTouchListenerC50780Mbm.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public ViewOnTouchListenerC50780Mbm(GestureDetector gestureDetector, AbstractC59962oe abstractC59962oe, InterfaceC174767qC interfaceC174767qC, C1815383g c1815383g, UserSession userSession) {
        AbstractC43594JPz.A1P(userSession, gestureDetector);
        this.A01 = abstractC59962oe;
        this.A02 = interfaceC174767qC;
        this.A04 = gestureDetector;
        this.A06 = c1815383g;
        C57541PgF A01 = C57541PgF.A01(userSession, 29);
        InterfaceC09390do A00 = C57541PgF.A00(C57541PgF.A01(abstractC59962oe, 26), EnumC09460dv.A02, 27);
        this.A03 = AbstractC25225BEi.A0a(C57541PgF.A01(A00, 28), A01, C57532Pg6.A00(null, A00, 14), AbstractC25225BEi.A1D(C50924Met.class));
        this.A05 = new ScaleGestureDetector(abstractC59962oe.requireContext(), this);
        C07S c07s = C07S.STARTED;
        C07X viewLifecycleOwner = abstractC59962oe.getViewLifecycleOwner();
        C57312k6 A002 = C07Y.A00(viewLifecycleOwner);
        C57166PZk c57166PZk = new C57166PZk(c07s, this, viewLifecycleOwner, null, 44);
        AnonymousClass191 anonymousClass191 = AnonymousClass191.A00;
        C07X A0K = AbstractC31173DnH.A0K(abstractC59962oe, anonymousClass191, c57166PZk, A002);
        AbstractC23641Du.A05(anonymousClass191, new C57166PZk(c07s, this, A0K, null, 45), C07Y.A00(A0K));
    }
}
