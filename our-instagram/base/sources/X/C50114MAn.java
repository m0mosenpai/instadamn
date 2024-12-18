package X;

/* renamed from: X.MAn, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C50114MAn extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public final int A01;
    public final Object A02;
    public final String A03;
    public final String A04;
    public final boolean A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C50114MAn(Object obj, String str, String str2, InterfaceC23621Ds interfaceC23621Ds, int i, boolean z) {
        super(2, interfaceC23621Ds);
        this.A01 = i;
        this.A02 = obj;
        this.A05 = z;
        this.A04 = str;
        this.A03 = str2;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        String str;
        boolean z;
        String str2;
        int i;
        int i2 = this.A01;
        Object obj2 = this.A02;
        switch (i2) {
            case 0:
                z = this.A05;
                str2 = this.A04;
                str = this.A03;
                i = 0;
                break;
            case 1:
                str = this.A03;
                z = this.A05;
                str2 = this.A04;
                i = 1;
                break;
            default:
                str2 = this.A04;
                z = this.A05;
                str = this.A03;
                i = 2;
                break;
        }
        return new C50114MAn(obj2, str2, str, interfaceC23621Ds, i, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x002f A[RETURN] */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            int r1 = r12.A01
            X.1JX r4 = X.C1JX.A02
            int r0 = r12.A00
            r5 = 1
            switch(r1) {
                case 0: goto L94;
                case 1: goto L30;
                default: goto La;
            }
        La:
            if (r0 != 0) goto Lac
            X.AbstractC09560e7.A00(r13)
            java.lang.Object r1 = r12.A02
            X.GtP r1 = (X.C38330GtP) r1
            X.05A r0 = r1.A02
            java.lang.String r7 = r12.A04
            r0.Egh(r7)
            X.IdK r6 = r1.A01
            boolean r11 = r12.A05
            java.lang.String r8 = r12.A03
            r12.A00 = r5
            r9 = 0
            r10 = 2
            X.MBc r5 = new X.MBc
            r5.<init>(r6, r7, r8, r9, r10, r11)
            java.lang.Object r0 = X.AnonymousClass194.A00(r12, r5)
        L2d:
            if (r0 != r4) goto Laf
            return r4
        L30:
            if (r0 != 0) goto Lac
            X.AbstractC09560e7.A00(r13)
            java.lang.Object r0 = r12.A02
            X.Eir r0 = (X.C33091Eir) r0
            com.instagram.common.session.UserSession r0 = r0.A00
            java.lang.String r6 = r12.A03
            boolean r1 = r12.A05
            java.lang.String r3 = r12.A04
            X.1Ms r2 = X.AbstractC31173DnH.A0M(r0)
            java.lang.String r0 = "direct_v2/update_channel_invite/"
            r2.A0B(r0)
            r0 = 4081(0xff1, float:5.719E-42)
            java.lang.String r0 = X.AbstractC111324zv.A00(r0)
            r2.A9s(r0, r6)
            if (r1 == 0) goto L91
            r0 = 373(0x175, float:5.23E-43)
            java.lang.String r1 = X.MSV.A00(r0)
        L5b:
            java.lang.String r0 = "invite_state"
            r2.A9s(r0, r1)
            java.lang.String r0 = "threadId"
            r2.A9s(r0, r3)
            java.lang.Class<X.K8F> r1 = X.K8F.class
            java.lang.Class<X.LCS> r0 = X.LCS.class
            X.1ON r1 = X.AbstractC31172DnG.A0S(r2, r1, r0)
            r3 = 0
            r0 = 1695661322(0x6511bd0a, float:4.3014393E22)
            X.02x r2 = r1.A03(r0)
            r1 = 4
            X.MC2 r0 = new X.MC2
            r0.<init>(r1, r3)
            X.0po r2 = X.JX4.A04(r0, r2)
            r1 = 12
            X.GSB r0 = new X.GSB
            r0.<init>(r1, r3)
            X.0po r0 = X.JX4.A03(r0, r2)
            r12.A00 = r5
            java.lang.Object r0 = X.AbstractC18560vj.A01(r12, r0)
            goto L2d
        L91:
            java.lang.String r1 = "declined_by_receiver"
            goto L5b
        L94:
            if (r0 != 0) goto Lac
            X.AbstractC09560e7.A00(r13)
            java.lang.Object r0 = r12.A02
            X.JmH r0 = (X.C44511JmH) r0
            com.instagram.direct.fragment.thread.poll.repository.DirectPollMessageOptionVotersRepository r3 = r0.A01
            boolean r2 = r12.A05
            java.lang.String r1 = r12.A04
            java.lang.String r0 = r12.A03
            r12.A00 = r5
            java.lang.Object r0 = r3.A01(r1, r0, r12, r2)
            goto L2d
        Lac:
            X.AbstractC09560e7.A00(r13)
        Laf:
            X.0eB r4 = X.C0eB.A00
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50114MAn.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C50114MAn) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }
}
