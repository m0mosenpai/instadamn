package X;

import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout;
import com.instagram.ui.text.ConstrainedEditText;
import com.instagram.ui.widget.interactive.InteractiveDrawableContainer;

/* renamed from: X.8Xg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C188668Xg implements InterfaceC188678Xh {
    public final View A00;
    public final UserSession A01;
    public final C8TN A02;
    public final C183688Ct A03;
    public final C8HI A04;
    public final C184418Gf A05;
    public final C88D A06;
    public final InterfaceC1810081c A07;
    public final ViewOnTouchListenerC1829389o A08;
    public final InteractiveDrawableContainer A09;
    public final boolean A0A;
    public final TouchInterceptorFrameLayout A0B;
    public final AnonymousClass840 A0C;

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000a, code lost:
    
        if (r1 == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A00(X.C188668Xg r3) {
        /*
            X.89o r0 = r3.A08
            r2 = 1
            if (r0 == 0) goto Lc
            X.7lk r0 = r0.A04
            boolean r1 = r0 instanceof X.C171737l3
            r0 = 1
            if (r1 != 0) goto Ld
        Lc:
            r0 = 0
        Ld:
            com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout r1 = r3.A0B
            if (r0 == 0) goto L23
            X.8HI r0 = r3.A04
            X.89E r0 = r0.A1E
            X.8LD r0 = r0.A00()
            boolean r0 = r0.isVisible()
            if (r0 == 0) goto L23
        L1f:
            r1.setKeepObservingAfterRequestDisallowTouchEvent(r2)
            return
        L23:
            r2 = 0
            goto L1f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C188668Xg.A00(X.8Xg):void");
    }

    public final void A01() {
        C190398bx c190398bx = (C190398bx) ((C8NW) this.A03.A1h.get()).A1d.get();
        ConstrainedEditText constrainedEditText = c190398bx.A1j;
        AbstractC125325le.A05(new View[]{constrainedEditText}, false);
        constrainedEditText.setHint("");
        constrainedEditText.setOnTouchListener(c190398bx.A05);
    }

    public C188668Xg(View view, UserSession userSession, TouchInterceptorFrameLayout touchInterceptorFrameLayout, C8TN c8tn, C183688Ct c183688Ct, C8HI c8hi, AnonymousClass840 anonymousClass840, C184418Gf c184418Gf, C88D c88d, InterfaceC1810081c interfaceC1810081c, ViewOnTouchListenerC1829389o viewOnTouchListenerC1829389o, InteractiveDrawableContainer interactiveDrawableContainer, boolean z) {
        this.A01 = userSession;
        this.A05 = c184418Gf;
        this.A04 = c8hi;
        this.A06 = c88d;
        this.A0C = anonymousClass840;
        interactiveDrawableContainer.getClass();
        this.A09 = interactiveDrawableContainer;
        this.A02 = c8tn;
        this.A03 = c183688Ct;
        this.A07 = interfaceC1810081c;
        this.A0A = z;
        touchInterceptorFrameLayout.getClass();
        this.A0B = touchInterceptorFrameLayout;
        view.getClass();
        this.A00 = view;
        this.A08 = viewOnTouchListenerC1829389o;
    }

    @Override // X.InterfaceC188678Xh
    public final void De3(AbstractC172157lk abstractC172157lk) {
        A00(this);
        this.A0C.A02.A01.A06 = abstractC172157lk;
    }
}
