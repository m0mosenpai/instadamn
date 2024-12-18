package X;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.common.session.UserSession;

/* loaded from: classes11.dex */
public final class U1J extends AbstractC66412zI {
    public final Activity A00;
    public final InterfaceC11380iw A01;
    public final UserSession A02;
    public final XLU A03;
    public final InterfaceC72020XFi A04;
    public final String A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0031, code lost:
    
        if (r7.A0H != false) goto L9;
     */
    @Override // X.AbstractC66422zJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void bind(X.InterfaceC66482zP r44, X.C3OO r45) {
        /*
            r43 = this;
            r2 = r45
            r9 = r44
            X.MWj r9 = (X.C50622MWj) r9
            X.U2o r2 = (X.C66173U2o) r2
            r8 = 0
            X.C14360o3.A0B(r9, r8)
            r0 = 1
            X.C14360o3.A0B(r2, r0)
            X.Tx0 r7 = r9.A00
            int r3 = r2.A00
            android.view.View r0 = r2.itemView
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            int r0 = r1.height
            if (r0 == r3) goto L25
            r1.height = r3
            android.view.View r0 = r2.itemView
            r0.setLayoutParams(r1)
        L25:
            r0 = r43
            boolean r1 = r0.A0D
            r24 = 0
            if (r1 != 0) goto L33
            boolean r1 = r7.A0H
            r20 = 0
            if (r1 == 0) goto L35
        L33:
            r20 = 1
        L35:
            X.U2l r31 = X.AbstractC66175U2q.A00
            android.app.Activity r1 = r0.A00
            r32 = r1
            android.view.View r1 = r2.itemView
            android.content.Context r33 = r1.getContext()
            X.C14360o3.A07(r33)
            com.instagram.common.session.UserSession r1 = r0.A02
            r35 = r1
            X.0iw r15 = r0.A01
            X.TtG r14 = r9.A00
            X.XLU r13 = r0.A03
            X.XFi r12 = r0.A04
            android.view.View r1 = r2.itemView
            java.lang.Object r6 = r1.getTag()
            java.lang.String r1 = "null cannot be cast to non-null type com.instagram.search.common.ui.UserRowViewBinder.Holder"
            X.C14360o3.A0C(r6, r1)
            X.U2m r6 = (X.C66171U2m) r6
            r17 = 0
            boolean r11 = r0.A0F
            boolean r1 = r7.A0F
            if (r1 != 0) goto L69
            boolean r2 = r7.A0H
            if (r2 == 0) goto L6b
        L69:
            r24 = 1
        L6b:
            java.lang.String r10 = r0.A05
            boolean r5 = r0.A0B
            boolean r4 = r0.A0E
            boolean r3 = r0.A0C
            if (r1 == 0) goto Laa
            boolean r2 = r0.A09
        L77:
            boolean r1 = r0.A0A
            boolean r0 = r0.A06
            X.U2n r16 = new X.U2n
            r18 = r17
            r23 = r8
            r21 = r11
            r22 = r8
            r25 = r5
            r26 = r4
            r27 = r3
            r28 = r2
            r29 = r1
            r30 = r0
            r19 = r10
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            r34 = r15
            r36 = r7
            r37 = r14
            r38 = r9
            r39 = r13
            r40 = r6
            r41 = r16
            r42 = r12
            r31.A03(r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42)
            return
        Laa:
            boolean r2 = r0.A08
            goto L77
        */
        throw new UnsupportedOperationException("Method not decompiled: X.U1J.bind(X.2zP, X.3OO):void");
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C50622MWj.class;
    }

    public U1J(Activity activity, InterfaceC11380iw interfaceC11380iw, UserSession userSession, XLU xlu, InterfaceC72020XFi interfaceC72020XFi, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        boolean A1V = AbstractC167007dF.A1V(userSession);
        this.A00 = activity;
        this.A02 = userSession;
        this.A01 = interfaceC11380iw;
        this.A03 = xlu;
        this.A04 = interfaceC72020XFi;
        this.A05 = str;
        this.A0D = z;
        this.A0F = A1V;
        this.A0E = z2;
        this.A0B = A1V;
        this.A0C = z3;
        this.A08 = z4;
        this.A09 = z5;
        this.A0A = z6;
        this.A06 = z7;
        this.A07 = AbstractC13620mo.A02(activity);
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        JQ0.A1M(viewGroup);
        return new C66173U2o(C66170U2l.A00(viewGroup.getContext(), viewGroup, this.A07));
    }
}
