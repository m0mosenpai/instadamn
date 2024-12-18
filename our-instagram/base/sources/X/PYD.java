package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class PYD extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;
    public final Object A08;
    public final boolean A09;
    public final boolean A0A;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PYD(FragmentActivity fragmentActivity, AbstractC10360h2 abstractC10360h2, UserSession userSession, C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS, C75113Zb c75113Zb, C54309NzT c54309NzT, InterfaceC23621Ds interfaceC23621Ds, int i, boolean z, boolean z2) {
        super(2, interfaceC23621Ds);
        this.A01 = i;
        this.A05 = c38321qM;
        this.A02 = fragmentActivity;
        this.A03 = c54309NzT;
        this.A08 = userSession;
        this.A04 = abstractC10360h2;
        this.A07 = interfaceC60442pS;
        this.A06 = c75113Zb;
        this.A09 = z;
        this.A0A = z2;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        int i;
        int i2 = this.A01;
        C38321qM c38321qM = (C38321qM) this.A05;
        FragmentActivity fragmentActivity = (FragmentActivity) this.A02;
        C54309NzT c54309NzT = (C54309NzT) this.A03;
        UserSession userSession = (UserSession) this.A08;
        AbstractC10360h2 abstractC10360h2 = (AbstractC10360h2) this.A04;
        InterfaceC60442pS interfaceC60442pS = (InterfaceC60442pS) this.A07;
        C75113Zb c75113Zb = (C75113Zb) this.A06;
        boolean z = this.A09;
        boolean z2 = this.A0A;
        if (i2 != 0) {
            i = 1;
        } else {
            i = 0;
        }
        return new PYD(fragmentActivity, abstractC10360h2, userSession, c38321qM, interfaceC60442pS, c75113Zb, c54309NzT, interfaceC23621Ds, i, z, z2);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x004d A[RETURN] */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            r19 = this;
            r0 = r19
            int r4 = r0.A01
            X.1JX r1 = X.C1JX.A02
            int r2 = r0.A00
            r3 = 1
            if (r4 == 0) goto L4e
            if (r2 != 0) goto L9e
            X.AbstractC09560e7.A00(r20)
            X.12L r4 = X.C12L.A00
            r15 = 0
            r2 = 1374338585(0x51eabe19, float:1.2602646E11)
            X.0nZ r2 = X.MSX.A0J(r4, r2)
            java.lang.Object r11 = r0.A05
            X.1qM r11 = (X.C38321qM) r11
            java.lang.Object r8 = r0.A02
            androidx.fragment.app.FragmentActivity r8 = (androidx.fragment.app.FragmentActivity) r8
            java.lang.Object r14 = r0.A03
            X.NzT r14 = (X.C54309NzT) r14
            java.lang.Object r10 = r0.A08
            com.instagram.common.session.UserSession r10 = (com.instagram.common.session.UserSession) r10
            java.lang.Object r9 = r0.A04
            X.0h2 r9 = (X.AbstractC10360h2) r9
            java.lang.Object r12 = r0.A07
            X.2pS r12 = (X.InterfaceC60442pS) r12
            java.lang.Object r13 = r0.A06
            X.3Zb r13 = (X.C75113Zb) r13
            boolean r5 = r0.A09
            boolean r4 = r0.A0A
            r16 = 0
            X.PYD r7 = new X.PYD
            r17 = r5
            r18 = r4
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
        L45:
            r0.A00 = r3
            java.lang.Object r0 = X.AbstractC23641Du.A00(r0, r2, r7)
            if (r0 != r1) goto La1
            return r1
        L4e:
            if (r2 != 0) goto L9e
            X.AbstractC09560e7.A00(r20)
            java.lang.Object r6 = r0.A05
            X.1qM r6 = (X.C38321qM) r6
            java.lang.Object r10 = r0.A02
            android.content.Context r10 = (android.content.Context) r10
            long r4 = java.lang.System.nanoTime()
            java.lang.String r2 = "mp4"
            java.lang.String r2 = X.AbstractC916948n.A0A(r10, r2, r4, r3)
            java.io.File r4 = X.AbstractC166987dD.A11(r2)
            java.lang.Object r2 = r0.A03
            X.NzT r2 = (X.C54309NzT) r2
            X.OJr r15 = new X.OJr
            r15.<init>(r6, r2, r4)
            java.lang.Object r12 = r0.A08
            com.instagram.common.session.UserSession r12 = (com.instagram.common.session.UserSession) r12
            java.lang.Object r11 = r0.A04
            X.0h2 r11 = (X.AbstractC10360h2) r11
            java.lang.Object r13 = r0.A07
            X.2pS r13 = (X.InterfaceC60442pS) r13
            java.lang.Object r14 = r0.A06
            X.3Zb r14 = (X.C75113Zb) r14
            boolean r2 = r0.A09
            boolean r4 = r0.A0A
            r17 = r4
            r16 = r2
            X.C55220Oej.A00(r10, r11, r12, r13, r14, r15, r16, r17)
            X.12L r2 = X.C12L.A00
            X.12T r2 = r2.A04
            r13 = 0
            X.PXl r7 = new X.PXl
            r8 = r10
            r9 = r11
            r10 = r15
            r11 = r6
            r14 = r3
            r15 = r4
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15)
            goto L45
        L9e:
            X.AbstractC09560e7.A00(r20)
        La1:
            X.0eB r1 = X.C0eB.A00
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.PYD.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((PYD) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }
}
