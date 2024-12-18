package X;

import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.LId, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C47969LId {
    public final InterfaceC11380iw A00;
    public final UserSession A01;
    public final InterfaceC164977Zm A02;
    public final C7T8 A03;
    public final C45043JwY A04;

    /* JADX WARN: Type inference failed for: r0v7, types: [X.7Ax, java.lang.Object] */
    public /* synthetic */ C47969LId(InterfaceC11380iw interfaceC11380iw, UserSession userSession, InterfaceC164977Zm interfaceC164977Zm, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4) {
        int i3 = i;
        boolean z5 = z4;
        boolean z6 = z3;
        boolean z7 = z2;
        boolean z8 = z;
        C7T8 c7t8 = (i2 & 8) != 0 ? new C7T8(userSession, new Object()) : null;
        z8 = (i2 & 16) != 0 ? false : z8;
        z7 = (i2 & 32) != 0 ? false : z7;
        z6 = (i2 & 64) != 0 ? false : z6;
        z5 = (i2 & 128) != 0 ? false : z5;
        i3 = (i2 & 256) != 0 ? 0 : i3;
        C14360o3.A0B(c7t8, 4);
        this.A01 = userSession;
        this.A00 = interfaceC11380iw;
        this.A02 = interfaceC164977Zm;
        this.A03 = c7t8;
        this.A04 = new C45043JwY(z8, i3, z7, z6, z5);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0096, code lost:
    
        if (X.LKY.A04(r8) == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00c8, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r1, 36330063205188244L) == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00fe, code lost:
    
        if (r3 == false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0037, code lost:
    
        if (r0 > 1.0f) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A02(X.C44785Js6 r30, X.C7SZ r31) {
        /*
            Method dump skipped, instructions count: 493
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47969LId.A02(X.Js6, X.7SZ):void");
    }

    public static final void A00(LGr lGr, C45043JwY c45043JwY, int i) {
        boolean z = c45043JwY.A01;
        if (z) {
            AbstractC13880nE.A0X(lGr.A00, 17);
        }
        C47992LKj c47992LKj = C47992LKj.A00;
        View view = lGr.A00;
        boolean z2 = c45043JwY.A04;
        boolean z3 = c45043JwY.A03;
        boolean z4 = c45043JwY.A02;
        c47992LKj.A03(view, z2, z3, z4);
        c47992LKj.A03(lGr.A0N, z2, z3, z4);
        C47992LKj.A01(view, i, c45043JwY.A00, z2);
        C47992LKj.A02(view, i, z);
        float f = -4.0f;
        if (i % 2 == 0) {
            f = 4.0f;
        }
        view.setRotation(f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00bd, code lost:
    
        if (r0 != null) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A01(X.C47969LId r8, X.C44785Js6 r9, X.C45043JwY r10) {
        /*
            boolean r2 = r10.A02
            java.util.List r7 = r9.A04
            r6 = 0
            java.lang.Object r0 = r7.get(r6)
            X.LGr r0 = (X.LGr) r0
            X.0do r0 = r0.A0O
            android.view.View r0 = X.AbstractC166987dD.A0d(r0)
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131165184(0x7f070000, float:1.7944578E38)
            if (r2 == 0) goto L1c
            r0 = 2131165207(0x7f070017, float:1.7944625E38)
        L1c:
            float r0 = X.AbstractC166987dD.A04(r1, r0)
            X.Mc8 r5 = new X.Mc8
            r5.<init>(r0)
            int r0 = X.AbstractC166997dE.A0D(r1)
            float r4 = (float) r0
            int r3 = r7.size()
        L2e:
            if (r6 >= r3) goto L4d
            java.lang.Object r0 = r7.get(r6)
            X.LGr r0 = (X.LGr) r0
            android.view.View r2 = r0.A00
            r1 = 1036831949(0x3dcccccd, float:0.1)
            int r0 = X.AbstractC31172DnG.A03(r7, r6)
            int r0 = r0 + (-1)
            float r0 = (float) r0
            float r0 = r0 * r1
            float r0 = r0 + r4
            r2.setElevation(r0)
            r2.setOutlineProvider(r5)
            int r6 = r6 + 1
            goto L2e
        L4d:
            boolean r0 = r10.A03
            if (r0 == 0) goto L84
            android.view.View r0 = r9.itemView
            android.content.res.Resources r0 = r0.getResources()
            int r1 = X.AbstractC166997dE.A07(r0)
            android.view.View r0 = X.AbstractC31171DnF.A06(r9)
            X.AbstractC13880nE.A0f(r0, r1)
            android.view.View r0 = X.AbstractC31171DnF.A06(r9)
            X.AbstractC13880nE.A0U(r0, r1)
            com.instagram.common.session.UserSession r0 = r8.A01
            boolean r2 = X.LC3.A01(r0)
            r1 = 8
            X.2iX r0 = r9.A03
            if (r2 == 0) goto L7f
            android.view.View r0 = r0.E3q()
            if (r0 == 0) goto L7e
        L7b:
            r0.setVisibility(r1)
        L7e:
            return
        L7f:
            android.view.View r0 = r0.getView()
            goto L7b
        L84:
            X.0do r0 = r9.A06
            java.lang.Object r0 = r0.getValue()
            X.3OO r0 = (X.C3OO) r0
            android.view.View r3 = X.AbstractC31171DnF.A06(r0)
            int r1 = r10.A00
            boolean r0 = r10.A04
            r2 = 0
            X.C47992LKj.A01(r3, r2, r1, r0)
            android.view.View r1 = X.AbstractC31171DnF.A06(r9)
            boolean r0 = r10.A01
            X.C47992LKj.A02(r1, r2, r0)
            android.view.View r0 = X.AbstractC31171DnF.A06(r9)
            X.AbstractC13880nE.A0f(r0, r2)
            android.view.View r0 = X.AbstractC31171DnF.A06(r9)
            X.AbstractC13880nE.A0U(r0, r2)
            com.instagram.common.session.UserSession r0 = r8.A01
            boolean r1 = X.LC3.A01(r0)
            X.2iX r0 = r9.A03
            if (r1 == 0) goto Lde
            android.view.View r0 = r0.E3q()
            if (r0 == 0) goto Lcd
        Lbf:
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            boolean r0 = r1 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto Lcd
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            if (r1 == 0) goto Lcd
            int r2 = r1.topMargin
        Lcd:
            android.view.View r1 = r9.A01
            android.view.View r0 = r9.itemView
            android.content.res.Resources r0 = r0.getResources()
            int r0 = X.AbstractC166997dE.A0A(r0)
            int r2 = r2 + r0
            X.AbstractC13880nE.A0Y(r1, r2)
            return
        Lde:
            android.view.View r0 = r0.getView()
            goto Lbf
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47969LId.A01(X.LId, X.Js6, X.JwY):void");
    }
}
