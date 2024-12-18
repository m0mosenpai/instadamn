package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.direct.DirectThreadKey;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;

/* loaded from: classes8.dex */
public final class JTL implements MSJ {
    public final UserSession A00;
    public final InterfaceC37208GaJ A01;
    public final MSJ A02;
    public final MSJ A03;

    @Override // X.MSJ
    public final C43918JbT AFJ() {
        C43918JbT AFJ = this.A02.AFJ();
        C43918JbT AFJ2 = this.A03.AFJ();
        return new C43918JbT(AFJ.A02 + AFJ2.A02, AFJ.A01 + AFJ2.A01, AFJ.A00 + AFJ2.A00, AFJ.A03 + AFJ2.A03);
    }

    @Override // X.MR3
    public final void AX3() {
        this.A02.AX3();
        this.A03.AX3();
    }

    @Override // X.MSJ
    @Deprecated(message = "Use viewModelObservable() instead")
    public final List Av6() {
        return this.A02.Av6();
    }

    @Override // X.MSJ
    public final int CCs() {
        return this.A02.CCs() + this.A03.CCs();
    }

    @Override // X.MSJ
    public final void EWR(boolean z) {
        this.A02.EWR(z);
        this.A03.EWR(z);
    }

    @Override // X.MSJ
    public final void EWV(boolean z) {
        this.A02.EWV(z);
        this.A03.EWV(z);
    }

    @Override // X.MSJ
    public final void EWW(boolean z) {
        this.A02.EWW(z);
        this.A03.EWW(z);
    }

    @Override // X.MSJ
    public final void EWg(boolean z) {
        this.A02.EWg(z);
        this.A03.EWg(z);
    }

    @Override // X.MSJ
    public final void EWh(boolean z) {
        this.A02.EWh(z);
        this.A03.EWh(z);
    }

    @Override // X.MR3
    public final void EdV(AbstractC46972Dl abstractC46972Dl) {
        this.A02.EdV(abstractC46972Dl);
        this.A03.EdV(abstractC46972Dl);
    }

    @Override // X.MSJ
    public final void EdW(C3o9 c3o9) {
        this.A02.EdW(c3o9);
        this.A03.EdW(c3o9);
    }

    @Override // X.MSJ
    public final void FD1(C2EC c2ec) {
        this.A02.FD1(c2ec);
        this.A03.FD1(c2ec);
    }

    @Override // X.MSJ
    public final void FD2(java.util.Set set) {
        this.A02.FD2(set);
        this.A03.FD2(set);
    }

    @Override // X.MR3
    public final C42221xC FDh() {
        C42221xC A03;
        boolean A06 = C18U.A06(C06090Tz.A05, this.A00, 36313042255546035L);
        C42221xC FDh = this.A02.FDh();
        C42221xC FDh2 = this.A03.FDh();
        C42221xC ANg = this.A01.ANg();
        if (A06) {
            A03 = C42221xC.A03(new MOI() { // from class: X.LaA
                @Override // X.MOI
                public final /* bridge */ /* synthetic */ Object ABr(Object obj, Object obj2, Object obj3) {
                    Object obj4;
                    long j;
                    List<JRL> list = (List) obj;
                    List<JRL> list2 = (List) obj2;
                    Map map = (Map) obj3;
                    AbstractC167027dH.A12(list, list2, map);
                    ArrayList A1E = AbstractC166987dD.A1E();
                    LinkedHashMap A1I = AbstractC166987dD.A1I();
                    Iterator A15 = AbstractC166997dE.A15(map);
                    while (A15.hasNext()) {
                        Map.Entry A1K = AbstractC166987dD.A1K(A15);
                        A1I.put(Long.valueOf(AbstractC166987dD.A0N(A1K.getValue())), A1K.getKey());
                    }
                    Map A0B = AbstractC06930Yk.A0B(A1I);
                    LinkedHashMap A1I2 = AbstractC166987dD.A1I();
                    for (JRL jrl : list2) {
                        Object obj5 = A0B.get(Long.valueOf(JRE.A03(jrl.A0J).A00));
                        if (obj5 != null) {
                            A1I2.put(obj5, AbstractC166987dD.A1L(null, jrl));
                        } else {
                            A1E.add(jrl);
                        }
                    }
                    for (JRL jrl2 : list) {
                        String A152 = AbstractC31172DnG.A15(jrl2.A0J);
                        if (A152 != null && map.containsKey(A152)) {
                            C09530e4 c09530e4 = (C09530e4) A1I2.get(A152);
                            if (c09530e4 != null) {
                                A1I2.put(A152, AbstractC166987dD.A1L(jrl2, c09530e4.A01));
                            }
                        } else {
                            A1E.add(jrl2);
                        }
                    }
                    ArrayList A1E2 = AbstractC166987dD.A1E();
                    Iterator A14 = AbstractC166997dE.A14(A1I2);
                    while (A14.hasNext()) {
                        Map.Entry A1K2 = AbstractC166987dD.A1K(A14);
                        C09530e4 c09530e42 = (C09530e4) A1K2.getValue();
                        JRL jrl3 = (JRL) c09530e42.A00;
                        if (jrl3 != null) {
                            JRL jrl4 = (JRL) c09530e42.A01;
                            boolean z = jrl4.A0T;
                            if (z) {
                                j = jrl4.A05;
                            } else {
                                j = jrl3.A05;
                            }
                            long j2 = j;
                            boolean z2 = jrl3.A0j;
                            if (z2) {
                                C43641JRz c43641JRz = jrl3.A0B;
                                C31243DoR c31243DoR = jrl3.A0G;
                                JS2 js2 = jrl3.A0D;
                                String str = jrl4.A0M;
                                String str2 = jrl4.A0N;
                                String str3 = jrl4.A0O;
                                boolean z3 = jrl4.A0e;
                                boolean z4 = jrl4.A0k;
                                DirectThreadKey directThreadKey = jrl4.A0I;
                                C3o9 c3o9 = jrl4.A0J;
                                DirectShareTarget directShareTarget = jrl4.A0H;
                                EnumC92794Ds enumC92794Ds = jrl4.A0E;
                                int i = jrl4.A01;
                                int i2 = jrl4.A02;
                                boolean z5 = jrl4.A0n;
                                C45176JzI c45176JzI = jrl4.A0F;
                                float f = jrl4.A00;
                                boolean z6 = jrl4.A0l;
                                boolean z7 = jrl4.A0m;
                                JUM jum = jrl4.A08;
                                AbstractC46440Kh0 abstractC46440Kh0 = jrl4.A0C;
                                C45127Jxw c45127Jxw = jrl4.A07;
                                C31228DoB c31228DoB = jrl4.A0A;
                                List list3 = jrl4.A0R;
                                int i3 = jrl4.A03;
                                boolean z8 = jrl4.A0c;
                                String str4 = jrl4.A0L;
                                boolean z9 = jrl4.A0b;
                                List list4 = jrl4.A0S;
                                boolean z10 = jrl4.A0h;
                                long j3 = jrl4.A06;
                                C99E c99e = jrl4.A09;
                                List list5 = jrl4.A0Q;
                                String str5 = jrl4.A0K;
                                boolean z11 = jrl4.A0f;
                                boolean z12 = jrl4.A0g;
                                boolean z13 = jrl4.A0Y;
                                boolean z14 = jrl4.A0a;
                                boolean z15 = jrl4.A0Z;
                                boolean z16 = jrl4.A0U;
                                boolean z17 = jrl4.A0X;
                                boolean z18 = jrl4.A0V;
                                int i4 = jrl4.A04;
                                String str6 = jrl4.A0P;
                                boolean z19 = jrl4.A0W;
                                boolean z20 = jrl4.A0d;
                                boolean z21 = jrl4.A0i;
                                AbstractC25229BEm.A1I(str, 0, directThreadKey);
                                AbstractC25233BEq.A0y(7, c3o9, directShareTarget, enumC92794Ds);
                                C14360o3.A0B(jum, 19);
                                JQ0.A0u(20, js2, c45127Jxw, c31228DoB, list3);
                                C14360o3.A0B(str4, 27);
                                C14360o3.A0B(list4, 30);
                                obj4 = new JRL(c45127Jxw, jum, c99e, c31228DoB, c43641JRz, abstractC46440Kh0, js2, enumC92794Ds, c45176JzI, c31243DoR, directShareTarget, directThreadKey, c3o9, str, str2, str3, str4, str5, str6, list3, list4, list5, f, i, i2, i3, i4, j2, j3, z2, z3, z4, z5, z6, z7, z8, z9, z10, z11, z12, z13, z14, z15, z16, z17, z18, z, z19, z20, z21);
                            } else {
                                String str7 = jrl4.A0M;
                                String str8 = jrl4.A0N;
                                String str9 = jrl4.A0O;
                                boolean z22 = jrl4.A0j;
                                boolean z23 = jrl4.A0e;
                                boolean z24 = jrl4.A0k;
                                DirectThreadKey directThreadKey2 = jrl4.A0I;
                                C3o9 c3o92 = jrl4.A0J;
                                DirectShareTarget directShareTarget2 = jrl4.A0H;
                                EnumC92794Ds enumC92794Ds2 = jrl4.A0E;
                                int i5 = jrl4.A01;
                                int i6 = jrl4.A02;
                                boolean z25 = jrl4.A0n;
                                C31243DoR c31243DoR2 = jrl4.A0G;
                                C45176JzI c45176JzI2 = jrl4.A0F;
                                float f2 = jrl4.A00;
                                boolean z26 = jrl4.A0l;
                                boolean z27 = jrl4.A0m;
                                C43641JRz c43641JRz2 = jrl4.A0B;
                                JUM jum2 = jrl4.A08;
                                JS2 js22 = jrl4.A0D;
                                AbstractC46440Kh0 abstractC46440Kh02 = jrl4.A0C;
                                C45127Jxw c45127Jxw2 = jrl4.A07;
                                C31228DoB c31228DoB2 = jrl4.A0A;
                                List list6 = jrl4.A0R;
                                int i7 = jrl4.A03;
                                boolean z28 = jrl4.A0c;
                                String str10 = jrl4.A0L;
                                boolean z29 = jrl4.A0b;
                                List list7 = jrl4.A0S;
                                boolean z30 = jrl4.A0h;
                                long j4 = jrl4.A06;
                                C99E c99e2 = jrl4.A09;
                                List list8 = jrl4.A0Q;
                                String str11 = jrl4.A0K;
                                boolean z31 = jrl4.A0f;
                                boolean z32 = jrl4.A0g;
                                boolean z33 = jrl4.A0Y;
                                boolean z34 = jrl4.A0a;
                                boolean z35 = jrl4.A0Z;
                                boolean z36 = jrl4.A0U;
                                boolean z37 = jrl4.A0X;
                                boolean z38 = jrl4.A0V;
                                int i8 = jrl4.A04;
                                String str12 = jrl4.A0P;
                                boolean z39 = jrl4.A0W;
                                boolean z40 = jrl4.A0d;
                                boolean z41 = jrl4.A0i;
                                AbstractC25229BEm.A1I(str7, 0, directThreadKey2);
                                AbstractC25233BEq.A0y(7, c3o92, directShareTarget2, enumC92794Ds2);
                                C14360o3.A0B(jum2, 19);
                                JQ0.A0u(20, js22, c45127Jxw2, c31228DoB2, list6);
                                C14360o3.A0B(str10, 27);
                                C14360o3.A0B(list7, 30);
                                obj4 = new JRL(c45127Jxw2, jum2, c99e2, c31228DoB2, c43641JRz2, abstractC46440Kh02, js22, enumC92794Ds2, c45176JzI2, c31243DoR2, directShareTarget2, directThreadKey2, c3o92, str7, str8, str9, str10, str11, str12, list6, list7, list8, f2, i5, i6, i7, i8, j2, j4, z22, z23, z24, z25, z26, z27, z28, z29, z30, z31, z32, z33, z34, z35, z36, z37, z38, z, z39, z40, z41);
                            }
                        } else {
                            A1E2.add(A1K2.getKey());
                            obj4 = c09530e42.A01;
                        }
                        A1E.add(obj4);
                    }
                    return AbstractC166987dD.A1L(JUD.A00(JUD.A00(A1E, 30), 31), A1E2);
                }
            }, FDh, FDh2, ANg).A0R(new JQn(this, 33)).A0K(C48417LbW.A00);
        } else {
            A03 = C42221xC.A03(JRK.A00, FDh, FDh2, ANg);
        }
        C14360o3.A0A(A03);
        return A03;
    }

    @Override // X.MR3
    public final void cancel() {
        this.A02.cancel();
        this.A03.cancel();
        this.A01.stop();
    }

    @Override // X.MR3
    public final void start() {
        this.A02.start();
        this.A03.start();
        InterfaceC37208GaJ interfaceC37208GaJ = this.A01;
        interfaceC37208GaJ.start();
        interfaceC37208GaJ.ChV();
    }

    public JTL(UserSession userSession, MSJ msj, MSJ msj2) {
        AbstractC167017dG.A1P(msj, msj2);
        this.A02 = msj;
        this.A03 = msj2;
        this.A00 = userSession;
        this.A01 = AbstractC44044JdV.A00(userSession);
    }
}
