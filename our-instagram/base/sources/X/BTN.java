package X;

import android.view.View;
import android.view.ViewTreeObserver;

/* loaded from: classes5.dex */
public final class BTN extends C58J implements View.OnAttachStateChangeListener, InterfaceC114145Da, ViewTreeObserver.OnGlobalFocusChangeListener {
    public View A00;

    @Override // X.InterfaceC114145Da
    public final void AC8(C5EH c5eh) {
        c5eh.ER6(false);
        c5eh.ETr(new BGK(this, 1));
        c5eh.ETy(new BGK(this, 2));
    }

    private final C58Z A00() {
        C58J c58j = this.A03;
        if (!c58j.A08) {
            AbstractC28290Cdc.A01(AbstractC111324zv.A00(5583));
            throw C00O.createAndThrow();
        }
        if ((c58j.A00 & 1024) != 0) {
            boolean z = false;
            for (C58J c58j2 = c58j.A02; c58j2 != null; c58j2 = c58j2.A02) {
                if ((c58j2.A01 & 1024) != 0) {
                    C58J c58j3 = c58j2;
                    C57S c57s = null;
                    do {
                        if (c58j3 instanceof C58Z) {
                            C58Z c58z = (C58Z) c58j3;
                            if (z) {
                                return c58z;
                            }
                            z = true;
                        } else if ((c58j3.A01 & 1024) != 0 && (c58j3 instanceof C5AY)) {
                            int i = 0;
                            for (C58J c58j4 = ((C5AY) c58j3).A00; c58j4 != null; c58j4 = c58j4.A02) {
                                if ((c58j4.A01 & 1024) != 0) {
                                    i++;
                                    if (i == 1) {
                                        c58j3 = c58j4;
                                    } else {
                                        c57s = AbstractC25233BEq.A08(c57s);
                                        if (c58j3 != null) {
                                            c57s.A09(c58j3);
                                            c58j3 = null;
                                        }
                                        c57s.A09(c58j4);
                                    }
                                }
                            }
                            if (i == 1) {
                            }
                        }
                        c58j3 = AbstractC114335Dx.A00(c57s);
                    } while (c58j3 != null);
                }
            }
        }
        throw AbstractC166987dD.A14("Could not find focus target of embedded view wrapper");
    }

    @Override // X.C58J
    public final void A0A() {
        BTA.A01(this).addOnAttachStateChangeListener(this);
    }

    @Override // X.C58J
    public final void A0E() {
        BTA.A01(this).removeOnAttachStateChangeListener(this);
        this.A00 = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0046, code lost:
    
        if (r0 != false) goto L23;
     */
    @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onGlobalFocusChanged(android.view.View r9, android.view.View r10) {
        /*
            r8 = this;
            X.599 r0 = X.AbstractC114335Dx.A02(r8)
            X.57r r0 = r0.A0A
            if (r0 == 0) goto L4a
            android.view.View r7 = X.BTA.A01(r8)
            X.57r r0 = X.AbstractC114335Dx.A05(r8)
            androidx.compose.ui.platform.AndroidComposeView r0 = (androidx.compose.ui.platform.AndroidComposeView) r0
            X.58X r4 = r0.A0S
            X.57r r6 = X.AbstractC114335Dx.A05(r8)
            r3 = 1
            r5 = 0
            if (r9 == 0) goto L87
            boolean r0 = r9.equals(r6)
            if (r0 != 0) goto L87
            android.view.ViewParent r1 = r9.getParent()
        L26:
            if (r1 == 0) goto L87
            android.view.ViewParent r0 = r7.getParent()
            if (r1 != r0) goto L82
            r2 = 1
        L2f:
            if (r10 == 0) goto L80
            boolean r0 = r10.equals(r6)
            if (r0 != 0) goto L80
            android.view.ViewParent r1 = r10.getParent()
        L3b:
            if (r1 == 0) goto L80
            android.view.ViewParent r0 = r7.getParent()
            if (r1 != r0) goto L7b
            r0 = 1
        L44:
            if (r2 == 0) goto L4b
            if (r0 == 0) goto L62
        L48:
            r8.A00 = r10
        L4a:
            return
        L4b:
            if (r0 == 0) goto L62
            r8.A00 = r10
            X.58Z r2 = r8.A00()
            X.5aA r0 = r2.A0G()
            boolean r0 = r0.BBj()
            if (r0 != 0) goto L4a
            X.58W r4 = (X.C58W) r4
            X.58g r1 = r4.A04
            goto L89
        L62:
            r10 = 0
            if (r2 == 0) goto L48
            r8.A00 = r10
            X.58Z r0 = r8.A00()
            X.5aA r0 = r0.A0G()
            boolean r0 = r0.CV1()
            if (r0 == 0) goto L4a
            r0 = 8
            r4.AHo(r0, r5, r3, r5)
            return
        L7b:
            android.view.ViewParent r1 = r1.getParent()
            goto L3b
        L80:
            r0 = 0
            goto L44
        L82:
            android.view.ViewParent r1 = r1.getParent()
            goto L26
        L87:
            r2 = 0
            goto L2f
        L89:
            boolean r0 = r1.A00     // Catch: java.lang.Throwable -> L99
            if (r0 == 0) goto L90
            X.C1129758g.A00(r1)     // Catch: java.lang.Throwable -> L99
        L90:
            r1.A00 = r3     // Catch: java.lang.Throwable -> L99
            X.AbstractC28485Chd.A04(r2)     // Catch: java.lang.Throwable -> L99
            X.C1129758g.A01(r1)
            return
        L99:
            r0 = move-exception
            X.C1129758g.A01(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BTN.onGlobalFocusChanged(android.view.View, android.view.View):void");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.getViewTreeObserver().addOnGlobalFocusChangeListener(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        view.getViewTreeObserver().removeOnGlobalFocusChangeListener(this);
    }
}
