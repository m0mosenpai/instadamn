package com.meta.metaai.writewithai.creation.impl.viewmodel;

import X.AbstractC001800i;
import X.AbstractC141776au;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC25225BEi;
import X.AbstractC25235BEs;
import X.AbstractC52922bZ;
import X.C008002u;
import X.C05A;
import X.C0UO;
import X.C10E;
import X.C14360o3;
import X.C16930sl;
import X.C27339C4u;
import X.C27340C4v;
import X.C27980CVc;
import X.C28260Cd5;
import X.C28261Cd6;
import X.C28265CdA;
import X.C28267CdC;
import X.C28280CdP;
import X.C28353CfD;
import X.C28483Chb;
import X.C29528Czg;
import X.C29530Czi;
import X.C29531Czj;
import X.C50125MBz;
import X.C8g;
import X.C8h;
import X.CAU;
import X.CW8;
import X.CWJ;
import X.PX6;
import android.app.Application;
import com.meta.foa.session.FoaUserSession;
import com.meta.metaai.writewithai.creation.impl.data.WriteSuggestionsRepository;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes5.dex */
public final class WriteWithAICreationViewModel extends AbstractC52922bZ {
    public C27980CVc A00;
    public String A01;
    public final Application A02;
    public final FoaUserSession A03;
    public final C28353CfD A04;
    public final C28483Chb A05;
    public final WriteSuggestionsRepository A06;
    public final C28280CdP A07;
    public final C05A A08;
    public final C05A A09;
    public final C05A A0A;
    public final C0UO A0B;
    public final C0UO A0C;
    public final C0UO A0D;

    /* JADX WARN: Removed duplicated region for block: B:13:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0074 A[EDGE_INSN: B:20:0x0074->B:21:0x0074 BREAK  A[LOOP:0: B:11:0x0040->B:18:0x0040], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A01(X.C27339C4u r11, com.meta.metaai.writewithai.creation.impl.viewmodel.WriteWithAICreationViewModel r12, java.lang.String r13, java.lang.String r14, X.InterfaceC23621Ds r15) {
        /*
            Method dump skipped, instructions count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.metaai.writewithai.creation.impl.viewmodel.WriteWithAICreationViewModel.A01(X.C4u, com.meta.metaai.writewithai.creation.impl.viewmodel.WriteWithAICreationViewModel, java.lang.String, java.lang.String, X.1Ds):java.lang.Object");
    }

    public static final void A05(WriteWithAICreationViewModel writeWithAICreationViewModel, C28261Cd6 c28261Cd6, String str, String str2, String str3, String str4, String str5, List list, boolean z) {
        C05A c05a;
        Object cwj;
        if (!z) {
            C28483Chb c28483Chb = writeWithAICreationViewModel.A05;
            C28483Chb.A04(c28483Chb, "error_message", "empty_response");
            C28483Chb.A05(c28483Chb, "error_message", "empty_response");
            C28483Chb.A00(c28483Chb);
            C28483Chb.A01(c28483Chb);
        }
        if (list != null && !list.isEmpty()) {
            A07(writeWithAICreationViewModel, str, str2, str3, str4, str5, list, !c28261Cd6.A01, false);
            c05a = writeWithAICreationViewModel.A08;
            cwj = new C29530Czi(c28261Cd6);
        } else {
            c05a = writeWithAICreationViewModel.A0A;
            CWJ cwj2 = (CWJ) c05a.getValue();
            C27340C4v c27340C4v = new C27340C4v(c28261Cd6);
            C28267CdC c28267CdC = AbstractC25235BEs.A0g(c05a).A02;
            boolean z2 = !c28261Cd6.A01;
            cwj = new CWJ(new C28260Cd5(AbstractC25235BEs.A0g(c05a).A00.A01, z2), c27340C4v, new C28267CdC(c28267CdC.A00, c28267CdC.A03, c28267CdC.A02, z2), cwj2.A03, str, cwj2.A05, cwj2.A04);
        }
        c05a.Egh(cwj);
    }

    public /* synthetic */ WriteWithAICreationViewModel(Application application, FoaUserSession foaUserSession, C28280CdP c28280CdP) {
        C28483Chb c28483Chb = new C28483Chb(c28280CdP);
        WriteSuggestionsRepository writeSuggestionsRepository = new WriteSuggestionsRepository(application, foaUserSession, c28483Chb);
        C28353CfD c28353CfD = new C28353CfD(foaUserSession, c28280CdP);
        C14360o3.A0B(c28280CdP, 3);
        this.A02 = application;
        this.A03 = foaUserSession;
        this.A07 = c28280CdP;
        this.A05 = c28483Chb;
        this.A06 = writeSuggestionsRepository;
        this.A04 = c28353CfD;
        CW8 cw8 = c28280CdP.A02;
        String str = cw8.A02;
        String str2 = cw8.A04;
        boolean z = c28280CdP.A0F;
        ArrayList A17 = AbstractC25225BEi.A17(3);
        int i = 0;
        do {
            A17.add(new C29528Czg(i));
            i++;
        } while (i < 3);
        C27339C4u c27339C4u = new C27339C4u(null, null, null, A17, z);
        C28265CdA c28265CdA = c28280CdP.A04;
        C008002u A1H = AbstractC25225BEi.A1H(new CWJ(new C28260Cd5(c28265CdA.A01, true), c27339C4u, new C28267CdC(C16930sl.A00, true, true, true), new C28261Cd6(null, true), str2, str, null));
        this.A0A = A1H;
        this.A0D = A1H;
        C008002u A00 = C10E.A00(A08());
        this.A09 = A00;
        this.A0C = A00;
        C008002u A002 = C10E.A00(C29531Czj.A00);
        this.A08 = A002;
        this.A0B = A002;
    }

    public static C28280CdP A00(WriteWithAICreationViewModel writeWithAICreationViewModel, C28280CdP c28280CdP, Object obj, Object obj2, PX6 px6) {
        CW8 cw8 = c28280CdP.A02;
        C05A c05a = writeWithAICreationViewModel.A0A;
        C28280CdP A00 = C28280CdP.A00(new CW8(cw8.A00, cw8.A01, ((CWJ) c05a.getValue()).A05, cw8.A04, cw8.A03), c28280CdP);
        c05a.getValue();
        px6.A01 = writeWithAICreationViewModel;
        px6.A02 = obj;
        px6.A03 = obj2;
        return A00;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0070 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A02(X.C27339C4u r8, com.meta.metaai.writewithai.creation.impl.viewmodel.WriteWithAICreationViewModel r9, java.lang.String r10, java.lang.String r11, X.InterfaceC23621Ds r12) {
        /*
            r3 = 32
            boolean r0 = X.PX6.A02(r12, r3)
            if (r0 == 0) goto L71
            r5 = r12
            X.PX6 r5 = (X.PX6) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L71
            int r2 = r2 - r1
            r5.A00 = r2
        L16:
            java.lang.Object r7 = r5.A04
            X.1JX r4 = X.C1JX.A02
            int r0 = r5.A00
            r6 = 3
            r2 = 2
            r3 = 1
            if (r0 == 0) goto L2d
            if (r0 == r3) goto L41
            if (r0 == r2) goto L41
            if (r0 != r6) goto L77
            X.AbstractC09560e7.A00(r7)
        L2a:
            X.0eB r4 = X.C0eB.A00
            return r4
        L2d:
            X.AbstractC09560e7.A00(r7)
            X.CdP r0 = r9.A07
            com.meta.metaai.writewithai.creation.impl.data.WriteSuggestionsRepository r1 = r9.A06
            X.CdP r0 = A00(r9, r0, r11, r8, r5)
            r5.A00 = r2
            java.lang.Object r7 = r1.A03(r0, r10, r11, r5)
            if (r7 != r4) goto L50
            return r4
        L41:
            java.lang.Object r8 = r5.A03
            X.C4u r8 = (X.C27339C4u) r8
            java.lang.Object r11 = r5.A02
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r9 = r5.A01
            com.meta.metaai.writewithai.creation.impl.viewmodel.WriteWithAICreationViewModel r9 = (com.meta.metaai.writewithai.creation.impl.viewmodel.WriteWithAICreationViewModel) r9
            X.AbstractC09560e7.A00(r7)
        L50:
            X.0xP r7 = (X.InterfaceC19390xP) r7
            r2 = 0
            X.D5B r0 = new X.D5B
            r0.<init>(r8, r9, r11, r2)
            X.0rm r1 = new X.0rm
            r1.<init>(r0, r7)
            X.D3C r0 = new X.D3C
            r0.<init>(r11, r9, r3)
            r5.A01 = r2
            r5.A02 = r2
            r5.A03 = r2
            r5.A00 = r6
            java.lang.Object r0 = r1.collect(r0, r5)
            if (r0 != r4) goto L2a
            return r4
        L71:
            X.PX6 r5 = new X.PX6
            r5.<init>(r9, r12, r3)
            goto L16
        L77:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.metaai.writewithai.creation.impl.viewmodel.WriteWithAICreationViewModel.A02(X.C4u, com.meta.metaai.writewithai.creation.impl.viewmodel.WriteWithAICreationViewModel, java.lang.String, java.lang.String, X.1Ds):java.lang.Object");
    }

    public static final String A03(WriteWithAICreationViewModel writeWithAICreationViewModel) {
        String A0o;
        if (writeWithAICreationViewModel.A01 == null) {
            A0o = writeWithAICreationViewModel.A07.A02.A03;
            if (A0o == null) {
                A0o = "";
            }
        } else {
            A0o = AbstractC166997dE.A0o();
            C14360o3.A0A(A0o);
        }
        writeWithAICreationViewModel.A01 = A0o;
        return A0o;
    }

    public static final void A04(WriteWithAICreationViewModel writeWithAICreationViewModel, C28261Cd6 c28261Cd6) {
        C05A c05a = writeWithAICreationViewModel.A0A;
        CWJ cwj = (CWJ) c05a.getValue();
        String str = cwj.A06;
        String str2 = cwj.A05;
        String str3 = cwj.A04;
        c05a.Egh(new CWJ(cwj.A00, cwj.A01, cwj.A02, c28261Cd6, str, str2, str3));
    }

    public static final void A06(WriteWithAICreationViewModel writeWithAICreationViewModel, String str, String str2, String str3) {
        C05A c05a = writeWithAICreationViewModel.A0A;
        CAU cau = AbstractC25235BEs.A0g(c05a).A01;
        CAU cau2 = null;
        if (cau instanceof C27339C4u) {
            cau2 = cau;
        }
        CWJ cwj = (CWJ) c05a.getValue();
        boolean z = writeWithAICreationViewModel.A07.A0F;
        ArrayList A17 = AbstractC25225BEi.A17(3);
        int i = 0;
        do {
            A17.add(new C29528Czg(i));
            i++;
        } while (i < 3);
        C27339C4u c27339C4u = new C27339C4u(null, null, null, A17, z);
        C28267CdC c28267CdC = AbstractC25235BEs.A0g(c05a).A02;
        C28267CdC c28267CdC2 = new C28267CdC(c28267CdC.A00, c28267CdC.A03, c28267CdC.A02, true);
        c05a.Egh(new CWJ(new C28260Cd5(AbstractC25235BEs.A0g(c05a).A00.A01, true), c27339C4u, c28267CdC2, cwj.A03, str, cwj.A05, cwj.A04));
        writeWithAICreationViewModel.A09.Egh(writeWithAICreationViewModel.A08());
        if (str3 != null) {
            CWJ cwj2 = (CWJ) c05a.getValue();
            String str4 = cwj2.A06;
            String str5 = cwj2.A04;
            c05a.Egh(new CWJ(cwj2.A00, cwj2.A01, cwj2.A02, cwj2.A03, str4, str3, str5));
        }
        AbstractC166987dD.A1Z(new C50125MBz(writeWithAICreationViewModel, cau2, str2, str, null, 21), AbstractC141776au.A00(writeWithAICreationViewModel));
    }

    public static final void A07(WriteWithAICreationViewModel writeWithAICreationViewModel, String str, String str2, String str3, String str4, String str5, List list, boolean z, boolean z2) {
        List list2 = list;
        if (z2 && list2.size() < 3) {
            int size = 3 - list2.size();
            ArrayList A17 = AbstractC25225BEi.A17(size);
            for (int i = 0; i < size; i++) {
                A17.add(new C29528Czg((list2.size() + i) - 1));
            }
            list2 = AbstractC001800i.A0S(A17, list2);
        }
        C27339C4u c27339C4u = new C27339C4u(str2, str3, str4, list2, writeWithAICreationViewModel.A07.A0F);
        C05A c05a = writeWithAICreationViewModel.A0A;
        CWJ cwj = (CWJ) c05a.getValue();
        C28267CdC c28267CdC = AbstractC25235BEs.A0g(c05a).A02;
        c05a.Egh(new CWJ(new C28260Cd5(AbstractC25235BEs.A0g(c05a).A00.A01, z), c27339C4u, new C28267CdC(c28267CdC.A00, c28267CdC.A03, c28267CdC.A02, z), cwj.A03, str, cwj.A05, str5));
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x005a, code lost:
    
        if (X.AbstractC25235BEs.A0g(r2).A03.A01 == false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C28279CdO A08() {
        /*
            r20 = this;
            r1 = r20
            android.app.Application r3 = r1.A02
            r0 = 2131966513(0x7f133a31, float:1.9569866E38)
            java.lang.String r5 = X.AbstractC166997dE.A0p(r3, r0)
            X.0UO r0 = r1.A0D
            java.lang.Object r0 = r0.getValue()
            X.CWJ r0 = (X.CWJ) r0
            X.Cd5 r0 = r0.A00
            boolean r0 = r0.A01
            if (r0 == 0) goto L41
            r3 = 0
        L1a:
            r1 = 0
            java.lang.Integer r7 = X.C05F.A06
            long r9 = X.AbstractC25230BEn.A0M()
            r11 = 1
            java.lang.String r18 = "Close Bottom Sheet"
            X.C87 r13 = X.C87.A0G
            X.C88 r15 = X.C88.A0X
            java.lang.Integer r17 = X.C05F.A00
            X.DQi r19 = X.C30152DQi.A00
            X.CdL r4 = new X.CdL
            r12 = r4
            r14 = r1
            r16 = r1
            r12.<init>(r13, r14, r15, r16, r17, r18, r19)
            r12 = 0
            java.lang.Integer r8 = X.C05F.A0C
            X.CdO r0 = new X.CdO
            r2 = r1
            r6 = r1
            r13 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r13)
            return r0
        L41:
            java.lang.Integer r11 = X.C05F.A00
            X.05A r2 = r1.A0A
            X.CWJ r0 = X.AbstractC25235BEs.A0g(r2)
            X.CAU r0 = r0.A01
            boolean r0 = r0.A00()
            if (r0 != 0) goto L5c
            X.CWJ r0 = X.AbstractC25235BEs.A0g(r2)
            X.Cd6 r0 = r0.A03
            boolean r0 = r0.A01
            r14 = 1
            if (r0 != 0) goto L5d
        L5c:
            r14 = 0
        L5d:
            r0 = 2131966588(0x7f133a7c, float:1.9570018E38)
            java.lang.String r12 = X.AbstractC166997dE.A0p(r3, r0)
            X.C87 r7 = X.C87.A0V
            r10 = 0
            r0 = 17
            X.Dbp r13 = new X.Dbp
            r13.<init>(r1, r0)
            if (r14 == 0) goto L7b
            X.C88 r8 = X.C88.A0X
            X.C88 r9 = X.C88.A0P
        L74:
            X.CWK r3 = new X.CWK
            r6 = r3
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14)
            goto L1a
        L7b:
            X.C88 r8 = X.C88.A0C
            r9 = r8
            goto L74
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.metaai.writewithai.creation.impl.viewmodel.WriteWithAICreationViewModel.A08():X.CdO");
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001c, code lost:
    
        if (r1 == r0) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A09(java.lang.Boolean r6, java.lang.String r7, java.lang.String r8) {
        /*
            r5 = this;
            java.lang.String r4 = A03(r5)
            X.CfD r3 = r5.A04
            java.lang.String r2 = r5.A01
            if (r6 == 0) goto L2f
            boolean r1 = r6.booleanValue()
        Le:
            if (r7 == 0) goto L2c
            int r0 = r7.length()
            if (r0 == 0) goto L2c
            if (r1 == 0) goto L27
            X.C8g r1 = r3.A00
            X.C8g r0 = X.C8g.SUGGESTED
            if (r1 != r0) goto L27
        L1e:
            X.C8h r1 = X.C8h.REGENERATE_BUTTON
        L20:
            X.C28353CfD.A01(r0, r1, r3, r7, r2)
            A06(r5, r7, r4, r8)
            return
        L27:
            X.C8g r0 = X.C8g.USER_GENERATED
            X.C8h r1 = X.C8h.NEW_PROMPT_INPUT
            goto L20
        L2c:
            X.C8g r0 = X.C8g.SERVER_GENERATED
            goto L1e
        L2f:
            r1 = 1
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.metaai.writewithai.creation.impl.viewmodel.WriteWithAICreationViewModel.A09(java.lang.Boolean, java.lang.String, java.lang.String):void");
    }

    public final void A0A(String str) {
        String A03 = A03(this);
        C28353CfD c28353CfD = this.A04;
        C8h c8h = C8h.SUGGESTED_PROMPT;
        C28353CfD.A00(null, c8h, c28353CfD, null, "retry_on_error_click", null, null, c28353CfD.A03.A02.A03);
        String str2 = this.A01;
        C8g c8g = c28353CfD.A00;
        if (c8g == null) {
            c8g = C8g.SERVER_GENERATED;
        }
        C28353CfD.A01(c8g, c8h, c28353CfD, str, str2);
        A06(this, str, A03, null);
    }
}
