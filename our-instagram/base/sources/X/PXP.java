package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class PXP extends AbstractC23611Dp implements InterfaceC16660sJ {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public Object A06;
    public final int A07 = 0;
    public final Object A08;
    public final Object A09;
    public final String A0A;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PXP(UserSession userSession, NSR nsr, String str, InterfaceC23621Ds interfaceC23621Ds) {
        super(1, interfaceC23621Ds);
        this.A09 = nsr;
        this.A08 = userSession;
        this.A0A = str;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(InterfaceC23621Ds interfaceC23621Ds) {
        if (this.A07 != 0) {
            return new PXP((UserSession) this.A08, (NSR) this.A09, this.A0A, interfaceC23621Ds);
        }
        C36381G3h c36381G3h = (C36381G3h) this.A09;
        C33090Eip c33090Eip = (C33090Eip) this.A01;
        return new PXP((FragmentActivity) this.A08, (UserSession) this.A02, c36381G3h, c33090Eip, this.A0A, interfaceC23621Ds);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((PXP) create((InterfaceC23621Ds) obj)).invokeSuspend(C0eB.A00);
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0031, code lost:
    
        if (r4.AIi(r8, new X.C51755Mte(r10, 46)) == false) goto L15;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0074 -> B:6:0x0020). Please report as a decompilation issue!!! */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            int r0 = r9.A07
            X.1JX r5 = X.C1JX.A02
            if (r0 == 0) goto L77
            int r0 = r9.A00
            r7 = 1
            if (r0 == 0) goto L36
            java.lang.Object r8 = r9.A05
            java.lang.Object r3 = r9.A04
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r2 = r9.A03
            com.instagram.common.session.UserSession r2 = (com.instagram.common.session.UserSession) r2
            java.lang.Object r6 = r9.A02
            X.NSR r6 = (X.NSR) r6
            java.lang.Object r4 = r9.A01
            X.05A r4 = (X.C05A) r4
            X.AbstractC09560e7.A00(r10)
        L20:
            X.PkY r10 = (X.InterfaceC57806PkY) r10
            r0 = 0
            X.C14360o3.A0B(r10, r0)
            r1 = 46
            X.Mte r0 = new X.Mte
            r0.<init>(r10, r1)
            boolean r0 = r4.AIi(r8, r0)
            if (r0 == 0) goto L5c
        L33:
            X.0eB r5 = X.C0eB.A00
            return r5
        L36:
            X.AbstractC09560e7.A00(r10)
            java.lang.Object r6 = r9.A09
            X.NSR r6 = (X.NSR) r6
            X.05A r4 = r6.A02
        L3f:
            java.lang.Object r3 = r4.getValue()
            X.MUq r2 = X.MUq.A00
            r0 = 0
            X.C14360o3.A0B(r2, r0)
            r1 = 46
            X.Mte r0 = new X.Mte
            r0.<init>(r2, r1)
            boolean r0 = r4.AIi(r3, r0)
            if (r0 == 0) goto L3f
            java.lang.Object r2 = r9.A08
            com.instagram.common.session.UserSession r2 = (com.instagram.common.session.UserSession) r2
            java.lang.String r3 = r9.A0A
        L5c:
            java.lang.Object r8 = r4.getValue()
            com.instagram.schools.channels.data.SchoolChannelsDataSource r0 = r6.A01
            r9.A01 = r4
            r9.A02 = r6
            r9.A03 = r2
            r9.A04 = r3
            r9.A05 = r8
            r9.A06 = r8
            r9.A00 = r7
            java.lang.Object r10 = r0.A01(r2, r3, r9)
            if (r10 != r5) goto L20
            return r5
        L77:
            int r1 = r9.A00
            r0 = 1
            if (r1 == 0) goto L98
            java.lang.Object r4 = r9.A06
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r3 = r9.A05
            androidx.fragment.app.FragmentActivity r3 = (androidx.fragment.app.FragmentActivity) r3
            java.lang.Object r1 = r9.A04
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1
            java.lang.Object r2 = r9.A03
            X.Eip r2 = (X.C33090Eip) r2
            X.AbstractC09560e7.A00(r10)
        L8f:
            X.GQE r0 = new X.GQE
            r0.<init>(r3, r1, r2, r4)
            X.C11T.A02(r0)
            goto L33
        L98:
            X.AbstractC09560e7.A00(r10)
            java.lang.Object r2 = r9.A01
            X.Eip r2 = (X.C33090Eip) r2
            java.lang.Object r1 = r9.A02
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1
            java.lang.Object r3 = r9.A08
            androidx.fragment.app.FragmentActivity r3 = (androidx.fragment.app.FragmentActivity) r3
            java.lang.String r4 = r9.A0A
            r9.A03 = r2
            r9.A04 = r1
            r9.A05 = r3
            r9.A06 = r4
            r9.A00 = r0
            java.lang.Object r0 = r2.A00(r9)
            if (r0 != r5) goto L8f
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.PXP.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PXP(FragmentActivity fragmentActivity, UserSession userSession, C36381G3h c36381G3h, C33090Eip c33090Eip, String str, InterfaceC23621Ds interfaceC23621Ds) {
        super(1, interfaceC23621Ds);
        this.A09 = c36381G3h;
        this.A01 = c33090Eip;
        this.A02 = userSession;
        this.A08 = fragmentActivity;
        this.A0A = str;
    }
}
