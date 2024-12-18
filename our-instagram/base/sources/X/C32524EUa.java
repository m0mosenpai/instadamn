package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.business.BusinessInfo;

/* renamed from: X.EUa, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32524EUa extends C1P1 {
    public UserSession A00;
    public BusinessInfo A01;
    public String A02;
    public final /* synthetic */ Context A03;
    public final /* synthetic */ C35788FrQ A04;
    public final /* synthetic */ InterfaceC37191Ga2 A05;
    public final /* synthetic */ UserSession A06;
    public final /* synthetic */ C1GL A07;
    public final /* synthetic */ EnumC222416a A08;
    public final /* synthetic */ boolean A09;

    public C32524EUa(Context context, C35788FrQ c35788FrQ, InterfaceC37191Ga2 interfaceC37191Ga2, UserSession userSession, C1GL c1gl, BusinessInfo businessInfo, EnumC222416a enumC222416a, String str, boolean z) {
        this.A03 = context;
        this.A06 = userSession;
        this.A05 = interfaceC37191Ga2;
        this.A08 = enumC222416a;
        this.A09 = z;
        this.A07 = c1gl;
        this.A04 = c35788FrQ;
        this.A00 = userSession;
        this.A01 = businessInfo;
        this.A02 = str;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A0N = AbstractC167017dG.A0N(abstractC115105If, -2067471215);
        int A03 = C0f9.A03(2037910374);
        super.onFail(abstractC115105If);
        C0f9.A0A(-1052358786, A03);
        String A04 = AbstractC151876sX.A04(abstractC115105If, this.A03.getString(2131961897));
        C14360o3.A07(A04);
        String A02 = AbstractC151876sX.A02(abstractC115105If);
        C14360o3.A07(A02);
        String A01 = AbstractC151876sX.A01(abstractC115105If);
        if (A01 == null) {
            A01 = "NO_INTERNET";
        }
        this.A05.Dfs(A04, A02, A01);
        C0f9.A0A(1246623499, A0N);
    }

    @Override // X.C1P1
    public final void onFinish() {
        int A03 = C0f9.A03(-1437071602);
        int A032 = C0f9.A03(77196212);
        super.onFinish();
        C0f9.A0A(-1475775508, A032);
        this.A05.Dfz();
        C0f9.A0A(1144173992, A03);
    }

    @Override // X.C1P1
    public final void onStart() {
        int A03 = C0f9.A03(-1291835148);
        int A032 = C0f9.A03(265142311);
        super.onStart();
        C0f9.A0A(1029787681, A032);
        this.A05.DgF();
        C0f9.A0A(1575251703, A03);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00a6, code lost:
    
        if (X.C2E7.A01(r7) == false) goto L18;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, X.1vN, X.6xj] */
    @Override // X.C1P1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r15) {
        /*
            r14 = this;
            r0 = 832456342(0x319e4696, float:4.60643E-9)
            int r5 = X.C0f9.A03(r0)
            X.3DB r15 = (X.C3DB) r15
            r0 = -1073411833(0xffffffffc0050907, float:-2.078676)
            int r4 = X.C0f9.A03(r0)
            r3 = 0
            X.C14360o3.A0B(r15, r3)
            r0 = -1302768641(0xffffffffb25953ff, float:-1.2650161E-8)
            int r6 = X.C0f9.A03(r0)
            com.instagram.user.model.User r7 = X.C72W.A00(r15)
            if (r7 != 0) goto L85
            X.5Ig r0 = new X.5Ig
            r0.<init>(r15)
            r14.onFail(r0)
            r0 = -526865383(0xffffffffe098ac19, float:-8.800956E19)
        L2c:
            X.C0f9.A0A(r0, r6)
            com.instagram.common.session.UserSession r8 = r14.A06
            X.C35132FeZ.A01(r8)
            X.16a r7 = r14.A08
            X.16a r0 = X.EnumC222416a.A05
            if (r7 != r0) goto L59
            java.lang.Integer r10 = X.C05F.A07
            java.lang.String r11 = "switch_to_biz"
            java.lang.Boolean r9 = X.AbstractC166997dE.A0b()
            r12 = 0
            r13 = r12
            X.C9J8.A00(r8, r9, r10, r11, r12, r13)
            X.1AU r1 = X.C1AT.A01(r8)
            X.1AV r0 = X.C1AV.A1K
            X.0xo r1 = X.AbstractC31173DnH.A0c(r1, r0)
            java.lang.String r0 = "cal_migration_show_destination_picker"
            r1.E77(r0, r3)
            r1.apply()
        L59:
            boolean r0 = r14.A09
            if (r0 == 0) goto L7f
            X.1GL r0 = r14.A07
            X.Dsk r6 = new X.Dsk
            r6.<init>(r8, r0)
            X.FrQ r2 = r14.A04
            X.Ga2 r0 = r14.A05
            X.EUq r1 = new X.EUq
            r1.<init>(r3, r2, r0, r7)
            java.lang.String r0 = "conversion"
            r6.A02(r1, r0)
        L72:
            r0 = 102462230(0x61b7316, float:2.9236812E-35)
            X.C0f9.A0A(r0, r4)
            r0 = -372285955(0xffffffffe9cf5dfd, float:-3.1336436E25)
            X.C0f9.A0A(r0, r5)
            return
        L7f:
            X.Ga2 r0 = r14.A05
            r0.DgQ(r7)
            goto L72
        L85:
            java.lang.String r11 = r7.getId()
            com.instagram.model.business.BusinessInfo r0 = r14.A01
            java.lang.String r0 = r0.A0J
            boolean r10 = X.AbstractC25229BEm.A1Z(r0)
            java.lang.String r1 = r14.A02
            r0 = 312(0x138, float:4.37E-43)
            java.lang.String r0 = X.AbstractC43591JPw.A00(r0)
            boolean r0 = r0.equals(r1)
            r9 = r0 ^ 1
            if (r9 == 0) goto La8
            boolean r0 = X.C2E7.A01(r7)
            r2 = 1
            if (r0 != 0) goto La9
        La8:
            r2 = 0
        La9:
            com.instagram.common.session.UserSession r8 = r14.A00
            X.1My r1 = X.AbstractC25651Mw.A00(r8)
            X.6xj r0 = new X.6xj
            r0.<init>()
            r0.A00 = r11
            r0.A04 = r10
            r0.A01 = r9
            r0.A03 = r2
            r1.E4s(r0)
            X.1Ai r0 = X.AbstractC23021Ah.A00(r8)
            r0.A1h(r9)
            X.1Ai r0 = X.AbstractC23021Ah.A00(r8)
            r2 = 1
            X.0xo r1 = X.AbstractC166987dD.A0w(r0)
            java.lang.String r0 = "show_business_onboarding_check_list_tooltip"
            r1.E77(r0, r2)
            r1.apply()
            X.AbstractC31172DnG.A1R(r8, r7)
            r7.A0c(r8)
            X.17P r0 = r7.A03
            java.lang.String r0 = r0.Baz()
            if (r0 == 0) goto Lea
            X.17P r0 = r7.A03
            r0.Bb3()
        Lea:
            r0 = -2049471225(0xffffffff85d78d07, float:-2.0270308E-35)
            goto L2c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32524EUa.onSuccess(java.lang.Object):void");
    }
}
