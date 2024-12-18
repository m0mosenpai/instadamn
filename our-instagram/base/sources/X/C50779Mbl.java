package X;

import android.view.ScaleGestureDetector;
import com.instagram.common.session.UserSession;

/* renamed from: X.Mbl, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50779Mbl extends ScaleGestureDetector.SimpleOnScaleGestureListener {
    public float A00;
    public final /* synthetic */ C9X1 A01;

    public C50779Mbl(C9X1 c9x1) {
        this.A01 = c9x1;
    }

    private boolean A00() {
        C54655OCh c54655OCh;
        AbstractC176767tY AlU;
        C9X1 c9x1 = this.A01;
        if (c9x1.A03 != null && (c54655OCh = c9x1.A04) != null) {
            InterfaceC175067qg interfaceC175067qg = c54655OCh.A04;
            if (interfaceC175067qg.isConnected()) {
                try {
                    AlU = interfaceC175067qg.AlU();
                } catch (C6M2 unused) {
                }
                if (!c54655OCh.A03 && AlU != null && AbstractC166987dD.A1a(AlU.A01(AbstractC176767tY.A0f))) {
                    return true;
                }
            }
            AlU = null;
            if (!c54655OCh.A03) {
            }
        }
        return false;
    }

    @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        C51903Mwl c51903Mwl;
        C9X1 c9x1 = this.A01;
        C54453O4h c54453O4h = c9x1.A07;
        if (c54453O4h != null) {
            float scaleFactor = scaleGestureDetector.getScaleFactor();
            O5D o5d = c54453O4h.A00.A0B.A00;
            if (o5d != null) {
                NTQ ntq = o5d.A00;
                if (!NTQ.A00(ntq, scaleFactor)) {
                    UserSession userSession = ntq.A02;
                    C06090Tz c06090Tz = C06090Tz.A05;
                    if (C18U.A06(c06090Tz, userSession, 36316757396296323L)) {
                        if (C18U.A06(c06090Tz, userSession, 36317461770933436L) && (c51903Mwl = (C51903Mwl) ((AbstractC55206OeJ) ntq).A01) != null && !c51903Mwl.A04) {
                            ntq.A0J(new C51903Mwl(c51903Mwl.A00, c51903Mwl.A01, c51903Mwl.A03, c51903Mwl.A02, true));
                            ntq.A03.A00(PAK.A00);
                        }
                    } else {
                        return true;
                    }
                } else {
                    return true;
                }
            }
        }
        if (A00()) {
            float currentSpan = (scaleGestureDetector.getCurrentSpan() - this.A00) / AbstractC166987dD.A07(c9x1.A03);
            C54655OCh c54655OCh = c9x1.A04;
            c54655OCh.A04.EhW(new C176427t0(), Math.min(c54655OCh.A01, Math.max(c54655OCh.A02, ((int) (currentSpan * (r3 - r2))) + c54655OCh.A00)));
            return true;
        }
        return false;
    }

    @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        O5D o5d;
        C51903Mwl c51903Mwl;
        C51903Mwl c51903Mwl2;
        C54453O4h c54453O4h = this.A01.A07;
        if (c54453O4h != null && (o5d = c54453O4h.A00.A0B.A00) != null) {
            NTQ ntq = o5d.A00;
            if (C18U.A06(C06090Tz.A05, ntq.A02, 36317461770933436L) && (c51903Mwl2 = (C51903Mwl) ((AbstractC55206OeJ) ntq).A01) != null && c51903Mwl2.A04) {
                ntq.A03.A00(new C56572P9t(MSZ.A08(ntq.A07)));
            }
            C51903Mwl c51903Mwl3 = (C51903Mwl) ((AbstractC55206OeJ) ntq).A01;
            if (c51903Mwl3 != null) {
                c51903Mwl = new C51903Mwl(c51903Mwl3.A00, c51903Mwl3.A01, c51903Mwl3.A03, c51903Mwl3.A02, false);
            } else {
                c51903Mwl = null;
            }
            ntq.A0J(c51903Mwl);
        }
        A00();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0039 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0030 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onScaleBegin(android.view.ScaleGestureDetector r6) {
        /*
            r5 = this;
            boolean r0 = r5.A00()
            if (r0 == 0) goto L65
            float r0 = r6.getCurrentSpan()
            r5.A00 = r0
            X.9X1 r2 = r5.A01
            android.view.View r0 = r2.A03
            android.view.ViewParent r1 = r0.getParent()
            if (r1 == 0) goto L1a
            r0 = 1
            r1.requestDisallowInterceptTouchEvent(r0)
        L1a:
            X.OCh r4 = r2.A04
            X.7qg r1 = r4.A04
            boolean r0 = r1.isConnected()
            if (r0 == 0) goto L29
            X.7tY r3 = r1.AlU()     // Catch: X.C6M2 -> L29
            goto L2a
        L29:
            r3 = 0
        L2a:
            boolean r0 = r1.isConnected()
            if (r0 == 0) goto L35
            X.7tb r2 = r1.Bty()     // Catch: X.C6M2 -> L35
            goto L36
        L35:
            r2 = 0
        L36:
            r1 = 0
            if (r3 == 0) goto L64
            if (r2 == 0) goto L64
            X.7tc r0 = X.AbstractC176797tb.A11
            java.lang.Object r0 = r2.A02(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L64
            int r0 = r0.intValue()
            r4.A00 = r0
            X.7tZ r0 = X.AbstractC176767tY.A0j
            java.lang.Object r0 = r3.A01(r0)
            int r0 = X.AbstractC166987dD.A0H(r0)
            r4.A01 = r0
            X.7tZ r0 = X.AbstractC176767tY.A0l
            java.lang.Object r0 = r3.A01(r0)
            int r0 = X.AbstractC166987dD.A0H(r0)
            r4.A02 = r0
            r1 = 1
        L64:
            return r1
        L65:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50779Mbl.onScaleBegin(android.view.ScaleGestureDetector):boolean");
    }
}
