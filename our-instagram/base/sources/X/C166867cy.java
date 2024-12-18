package X;

import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerFrameLayout;

/* renamed from: X.7cy, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C166867cy {
    public float A00;
    public CRM A01;
    public C8QJ A02;
    public InterfaceC16820sZ A03;
    public final C25814BbV A04;
    public final UserSession A05;

    public C166867cy(C25814BbV c25814BbV, UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(c25814BbV, 2);
        this.A05 = userSession;
        this.A04 = c25814BbV;
        this.A03 = C166877cz.A00;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x007a, code lost:
    
        if (r0.A0d != true) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x005a, code lost:
    
        if (r0.A0d != true) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x006a, code lost:
    
        if (r0.A0d != true) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A01(X.C167297di r28, X.CRM r29, X.C166867cy r30, X.C166587cU r31, com.instagram.common.session.UserSession r32) {
        /*
            r4 = 0
            r21 = 0
            r19 = -1025(0xfffffffffffffbff, float:NaN)
            r20 = 65535(0xffff, float:9.1834E-41)
            r5 = r28
            r6 = r4
            r7 = r4
            r8 = r4
            r9 = r4
            r10 = r4
            r11 = r4
            r12 = r4
            r13 = r4
            r14 = r4
            r15 = r4
            r16 = r4
            r17 = r4
            r18 = r4
            r22 = r21
            r23 = r21
            r24 = r21
            r25 = r21
            r26 = r21
            r27 = r21
            r28 = r21
            X.7di r9 = X.C167297di.A00(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            r2 = r29
            android.view.View r0 = r2.A00
            android.content.Context r1 = r0.getContext()
            X.C14360o3.A07(r1)
            java.lang.Class<android.app.Activity> r0 = android.app.Activity.class
            android.content.Context r8 = X.AbstractC167197dY.A00(r1, r0)
            android.app.Activity r8 = (android.app.Activity) r8
            r0 = r30
            X.BbV r12 = r0.A04
            X.7bU r0 = r12.A0B
            X.0UO r3 = r0.A03
            java.lang.Object r10 = r3.getValue()
            X.7bW r10 = (X.C166047bW) r10
            java.lang.Object r0 = r3.getValue()
            X.7bW r0 = (X.C166047bW) r0
            r1 = 1
            if (r0 == 0) goto L5c
            boolean r0 = r0.A0d
            r17 = 1
            if (r0 == r1) goto L5e
        L5c:
            r17 = 0
        L5e:
            java.lang.Object r0 = r3.getValue()
            X.7bW r0 = (X.C166047bW) r0
            if (r0 == 0) goto L6c
            boolean r0 = r0.A0d
            r18 = 1
            if (r0 == r1) goto L6e
        L6c:
            r18 = 0
        L6e:
            java.lang.Object r0 = r3.getValue()
            X.7bW r0 = (X.C166047bW) r0
            if (r0 == 0) goto L7c
            boolean r0 = r0.A0d
            r19 = 1
            if (r0 == r1) goto L7e
        L7c:
            r19 = 0
        L7e:
            X.7il r7 = new X.7il
            r11 = r31
            r13 = r32
            r15 = r21
            r16 = r15
            r20 = r1
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            com.facebook.litho.LithoView r0 = r2.A01
            r0.setComponent(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C166867cy.A01(X.7di, X.CRM, X.7cy, X.7cU, com.instagram.common.session.UserSession):void");
    }

    public final void A03(AbstractC59962oe abstractC59962oe) {
        C14360o3.A0B(abstractC59962oe, 0);
        CRM crm = this.A01;
        if (crm != null) {
            C8QJ c8qj = this.A02;
            if (c8qj != null) {
                c8qj.setOnDismissListener(new C28696Clo(this));
            }
            C8QJ c8qj2 = this.A02;
            if (c8qj2 != null) {
                c8qj2.showAsDropDown(crm.A01, (int) AbstractC13880nE.A04(abstractC59962oe.requireContext(), 6), (int) AbstractC13880nE.A04(abstractC59962oe.requireContext(), 12));
            }
        }
    }

    public static final C65726Tt0 A00(View view, InterfaceC16820sZ interfaceC16820sZ, float f) {
        C65726Tt0 c65726Tt0 = new C65726Tt0(AbstractC65716Tsp.A0I, view, f);
        C65717Tsq c65717Tsq = c65726Tt0.A01;
        c65717Tsq.A02(400.0f);
        c65717Tsq.A01(0.5f);
        c65726Tt0.A05(new WQX(interfaceC16820sZ));
        return c65726Tt0;
    }

    public static final void A02(C166867cy c166867cy, boolean z) {
        C8QJ c8qj = c166867cy.A02;
        if (c8qj != null) {
            c8qj.setOnDismissListener(null);
        }
        C8QJ c8qj2 = c166867cy.A02;
        if (c8qj2 != null) {
            c8qj2.dismiss();
        }
        C25814BbV c25814BbV = c166867cy.A04;
        c25814BbV.A0A.A0D();
        if (!c25814BbV.A02) {
            C28238Cci c28238Cci = C28238Cci.A00;
            UserSession userSession = c25814BbV.A0E;
            C006802i c006802i = C006802i.A0p;
            C14360o3.A07(c006802i);
            c006802i.markerPoint(309476254, AnonymousClass001.A0O("select_comment_screen_comment_unselect_tap_", 1));
            c28238Cci.A00(userSession);
        }
        CRM crm = c166867cy.A01;
        if (crm != null) {
            D8L d8l = new D8L(40, crm, c166867cy);
            RoundedCornerFrameLayout roundedCornerFrameLayout = crm.A02;
            if (roundedCornerFrameLayout.getTranslationY() != c166867cy.A00 && z) {
                crm.A00.setBackground(null);
                A00(roundedCornerFrameLayout, d8l, c166867cy.A00).A02();
            } else {
                d8l.invoke();
            }
        }
    }
}
