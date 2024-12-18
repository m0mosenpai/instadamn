package X;

import com.facebook.msys.mci.TraceLogger;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import java.util.Map;

/* renamed from: X.LqU, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49274LqU implements InterfaceC2056798r {
    public final /* synthetic */ C19260xA A00;
    public final /* synthetic */ InterfaceC37261GbE A01;
    public final /* synthetic */ C1OW A02;
    public final /* synthetic */ C49235Lpq A03;
    public final /* synthetic */ DirectThreadKey A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ C15100pQ A06;

    public C49274LqU(C19260xA c19260xA, InterfaceC37261GbE interfaceC37261GbE, C1OW c1ow, C49235Lpq c49235Lpq, DirectThreadKey directThreadKey, String str, C15100pQ c15100pQ) {
        this.A03 = c49235Lpq;
        this.A04 = directThreadKey;
        this.A02 = c1ow;
        this.A05 = str;
        this.A06 = c15100pQ;
        this.A01 = interfaceC37261GbE;
        this.A00 = c19260xA;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC2056798r
    public final void Dn9(C7J1 c7j1) {
        C114675Fx c114675Fx;
        C14360o3.A0B(c7j1, 0);
        C49235Lpq c49235Lpq = this.A03;
        UserSession userSession = c49235Lpq.A00;
        DirectThreadKey directThreadKey = this.A04;
        C14360o3.A0A(directThreadKey);
        C1OW c1ow = this.A02;
        EnumC159397Cz A00 = AbstractC159387Cy.A00(userSession, c1ow, directThreadKey);
        if (c7j1.A03) {
            C2DS c2ds = (C2DS) c49235Lpq.A0B.getValue();
            C14360o3.A0A(directThreadKey);
            C81663kb B3U = c2ds.B3U(directThreadKey);
            if (B3U != null && B3U.Aic() == null && AbstractC31178DnM.A1a(c49235Lpq.A09)) {
                ((C0f6) c49235Lpq.A0C.getValue()).AEp(AnonymousClass001.A05(B3U.C7g(), "BtvEnabledMap is null after thread fetch success, threadSubType = ", ", lifecycleState = ", AbstractC127225p0.A00(B3U.BN6())), 817904752).report();
            }
            String str = this.A05;
            if (str != null) {
                C15100pQ c15100pQ = this.A06;
                c49235Lpq.A07.getValue();
                C120005by.A03(str, null, c15100pQ.A00, 7037, 0);
            }
            if (A00.A01() && str != null) {
                C15100pQ c15100pQ2 = this.A06;
                int i = 15;
                if (((InterfaceC29021af) c1ow).Ar9() == C2EY.A1i) {
                    i = 13;
                }
                c15100pQ2.A00 = i;
                c49235Lpq.A07.getValue();
                TraceLogger.log(null, c15100pQ2.A00, null, 86, str, null, 0, null);
            }
            int i2 = this.A06.A00;
            if (i2 == 13 || i2 == 1) {
                LIG lig = AbstractC47197KtW.A01;
                LIG.A00(userSession, c1ow.A05.hashCode(), AbstractC167007dF.A1P(i2, 13), true);
                lig.A02(userSession, c1ow, str);
            }
            LGM A002 = AbstractC46726Klj.A00(userSession);
            C14360o3.A0A(directThreadKey);
            A002.A02(directThreadKey);
            C4HC.A00.A00(userSession).A01().post(new M6V(this.A00, this.A01, c1ow, c49235Lpq));
            return;
        }
        String str2 = this.A05;
        if (str2 != null) {
            C15100pQ c15100pQ3 = this.A06;
            c49235Lpq.A07.getValue();
            C120005by.A03(str2, null, c15100pQ3.A00, 7033, 5);
        }
        boolean A01 = A00.A01();
        C114675Fx A003 = AbstractC35240FgZ.A00(c7j1.A00);
        if (!A01) {
            EnumC46247KdO enumC46247KdO = EnumC46247KdO.A0F;
            String str3 = A003.A03;
            String str4 = A003.A06;
            String str5 = A003.A05;
            boolean z = A003.A0C;
            boolean z2 = A003.A0D;
            String str6 = A003.A07;
            String str7 = A003.A04;
            String str8 = A003.A02;
            boolean z3 = A003.A0B;
            EnumC81843l3 enumC81843l3 = A003.A00;
            boolean z4 = A003.A0A;
            boolean z5 = A003.A09;
            Map map = A003.A08;
            boolean z6 = A003.A0E;
            C14360o3.A0B(enumC46247KdO, 0);
            AbstractC167017dG.A1Q(str3, str5);
            C14360o3.A0B(map, 13);
            c114675Fx = new C114675Fx(enumC81843l3, enumC46247KdO, str3, str4, str5, str6, str7, str8, map, z, z2, z3, z4, z5, z6);
        } else {
            EnumC46247KdO enumC46247KdO2 = EnumC46247KdO.A08;
            String str9 = A003.A03;
            String str10 = A003.A06;
            String str11 = A003.A05;
            boolean z7 = A003.A0C;
            boolean z8 = A003.A0D;
            String str12 = A003.A07;
            String str13 = A003.A04;
            String str14 = A003.A02;
            boolean z9 = A003.A0B;
            EnumC81843l3 enumC81843l32 = A003.A00;
            boolean z10 = A003.A0A;
            boolean z11 = A003.A09;
            Map map2 = A003.A08;
            boolean z12 = A003.A0E;
            C14360o3.A0B(enumC46247KdO2, 0);
            AbstractC167017dG.A1Q(str9, str11);
            C14360o3.A0B(map2, 13);
            c114675Fx = new C114675Fx(enumC81843l32, enumC46247KdO2, str9, str10, str11, str12, str13, str14, map2, z7, z8, z9, z10, z11, z12);
        }
        this.A01.DUq(c114675Fx, null);
    }
}
