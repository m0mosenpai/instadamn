package X;

/* renamed from: X.Eel, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32954Eel extends AbstractC154286wd {
    public final int A00;
    public final Object A01;
    public final boolean A02;
    public final boolean A03;

    public C32954Eel(Object obj, int i, boolean z, boolean z2) {
        this.A00 = i;
        this.A01 = obj;
        this.A03 = z;
        this.A02 = z2;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A03;
        int i;
        if (this.A00 != 0) {
            A03 = C0f9.A03(-157387566);
            C38288GsX c38288GsX = (C38288GsX) this.A01;
            c38288GsX.A0A().A0E.update();
            if (c38288GsX.isResumed()) {
                C9GR.A0F(c38288GsX.requireActivity(), AbstractC111324zv.A00(3037), 2131956848);
            }
            C38288GsX.A07(c38288GsX);
            i = 260775468;
        } else {
            A03 = C0f9.A03(125251929);
            ((GFJ) this.A01).A03.DGh(this.A02);
            i = 187140863;
        }
        C0f9.A0A(i, A03);
    }

    @Override // X.C1P1
    public final void onFailInBackground(AbstractC115105If abstractC115105If) {
        if (1 - this.A00 != 0) {
            super.onFailInBackground(abstractC115105If);
            return;
        }
        int A03 = C0f9.A03(-1625415861);
        MTJ mtj = ((C38288GsX) this.A01).A01;
        if (mtj == null) {
            C14360o3.A0F("navigationPerfLogger");
            throw C00O.createAndThrow();
        }
        mtj.A00.A01();
        C0f9.A0A(-1205721583, A03);
    }

    @Override // X.C1P1
    public final void onFinish() {
        int A03;
        int i;
        if (this.A00 != 0) {
            A03 = C0f9.A03(688391601);
            C38288GsX c38288GsX = (C38288GsX) this.A01;
            C65823Tug.A00(c38288GsX.A0A(), false, true);
            c38288GsX.A0G = false;
            i = -629075538;
        } else {
            A03 = C0f9.A03(401641714);
            i = -291990907;
        }
        C0f9.A0A(i, A03);
    }

    @Override // X.C1P1
    public final void onStart() {
        int A03;
        int i;
        if (this.A00 != 0) {
            A03 = C0f9.A03(920147709);
            C38288GsX c38288GsX = (C38288GsX) this.A01;
            C65823Tug.A00(c38288GsX.A0A(), true, this.A02);
            MTJ mtj = c38288GsX.A01;
            if (mtj == null) {
                C14360o3.A0F("navigationPerfLogger");
                throw C00O.createAndThrow();
            }
            mtj.A00.A04();
            i = 1605433173;
        } else {
            A03 = C0f9.A03(1958004951);
            i = 1029284930;
        }
        C0f9.A0A(i, A03);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a8, code lost:
    
        if (X.C18U.A06(r2, r5, 36329698132836852L) != false) goto L23;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [X.GZP] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.util.List] */
    @Override // X.C1P1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r12) {
        /*
            r11 = this;
            int r0 = r11.A00
            if (r0 == 0) goto L41
            r0 = 1813395359(0x6c16379f, float:7.2640614E26)
            int r7 = X.C0f9.A03(r0)
            X.Ejf r12 = (X.C33136Ejf) r12
            r0 = 146606678(0x8bd0a56, float:1.1377454E-33)
            int r4 = X.C0f9.A03(r0)
            r3 = 0
            X.C14360o3.A0B(r12, r3)
            java.lang.Object r2 = r11.A01
            X.GsX r2 = (X.C38288GsX) r2
            boolean r1 = r11.A02
            boolean r0 = r11.A03
            X.C38288GsX.A05(r12, r2, r1, r0, r3)
            X.MTJ r0 = r2.A01
            if (r0 != 0) goto L31
            java.lang.String r0 = "navigationPerfLogger"
            X.C14360o3.A0F(r0)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L31:
            X.3Av r0 = r0.A00
            r0.A05()
            r0 = 720274110(0x2aee82be, float:4.2368013E-13)
            X.C0f9.A0A(r0, r4)
            r0 = -971182385(0xffffffffc61ceecf, float:-10043.702)
            goto Lc8
        L41:
            r0 = 2058472270(0x7ab1cb4e, float:4.6158003E35)
            int r7 = X.C0f9.A03(r0)
            X.EDe r12 = (X.C32205EDe) r12
            r0 = 2095862930(0x7cec5492, float:9.816779E36)
            int r10 = X.AbstractC167017dG.A0N(r12, r0)
            java.lang.Object r6 = r11.A01
            X.GFJ r6 = (X.GFJ) r6
            com.instagram.common.session.UserSession r5 = r6.A01
            X.Fzp r4 = X.FBA.A00(r5)
            boolean r3 = r11.A03
            if (r3 == 0) goto Lae
            java.util.List r9 = r12.A01
            boolean r8 = r11.A02
            X.0iw r0 = r6.A00
            java.lang.String r1 = r0.getModuleName()
            java.lang.String r0 = "saved_collections_list"
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto Laa
            com.instagram.user.model.User r0 = X.AbstractC166987dD.A10(r5)
            boolean r0 = r0.A1l()
            if (r0 != 0) goto Laa
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36321142558172328(0x8109e3000424a8, double:3.0329750350655837E-306)
            boolean r0 = X.C18U.A06(r2, r5, r0)
            if (r0 != 0) goto L9e
            r0 = 36323960056852196(0x810c7300062ee4, double:3.034756832575889E-306)
            boolean r0 = X.C18U.A06(r2, r5, r0)
            if (r0 != 0) goto L9e
            r0 = 36323960056590048(0x810c7300022ee0, double:3.034756832410105E-306)
            boolean r0 = X.C18U.A06(r2, r5, r0)
            if (r0 == 0) goto Laa
        L9e:
            r0 = 36329698132836852(0x8111ab000141f4, double:3.0383856149339626E-306)
            boolean r1 = X.C18U.A06(r2, r5, r0)
            r0 = 1
            if (r1 == 0) goto Lab
        Laa:
            r0 = 0
        Lab:
            r4.A06(r9, r8, r0)
        Lae:
            X.GZP r5 = r6.A03
            boolean r2 = r11.A02
            if (r3 == 0) goto Lcc
            java.util.List r1 = r6.A04
            java.util.List r0 = r6.A05
            java.util.List r8 = r4.A02(r1, r0)
        Lbc:
            r5.DGr(r8, r2)
            r0 = -382774299(0xffffffffe92f53e5, float:-1.3247387E25)
            X.C0f9.A0A(r0, r10)
            r0 = 131624031(0x7d86c5f, float:3.2563763E-34)
        Lc8:
            X.C0f9.A0A(r0, r7)
            return
        Lcc:
            java.util.List r0 = r12.A01
            java.util.ArrayList r8 = X.AbstractC166987dD.A1E()
            java.util.Iterator r9 = r0.iterator()
        Ld6:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto Lbc
            java.lang.Object r4 = r9.next()
            r3 = r4
            com.instagram.save.model.SavedCollection r3 = (com.instagram.save.model.SavedCollection) r3
            java.util.List r1 = r6.A04
            X.Epn r0 = r3.A07
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto Ld6
            java.util.List r1 = r6.A05
            X.EpD r0 = r3.A06
            boolean r0 = X.AbstractC001800i.A0u(r1, r0)
            if (r0 != 0) goto Lfb
            X.EpD r0 = r3.A06
            if (r0 != 0) goto Ld6
        Lfb:
            r8.add(r4)
            goto Ld6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32954Eel.onSuccess(java.lang.Object):void");
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
        int A03;
        int i;
        if (this.A00 != 0) {
            A03 = C0f9.A03(-409769935);
            C0f9.A0A(1076518800, C0f9.A03(-1454856833));
            i = -1931244135;
        } else {
            A03 = C0f9.A03(1979706575);
            C0f9.A0A(1498261056, C0f9.A03(-1610058579));
            i = 1731378725;
        }
        C0f9.A0A(i, A03);
    }
}
