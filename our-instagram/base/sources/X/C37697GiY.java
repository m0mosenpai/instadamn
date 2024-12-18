package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.GiY, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C37697GiY implements InterfaceC671231d {
    public final JPb A00;
    public final InterfaceC62242sP A01;
    public final C31I A02;
    public final C62832tM A03;
    public final C37546Gg2 A04;
    public final AbstractC39459Hbl A05;
    public final String A06;
    public final HashSet A07 = AbstractC166987dD.A1H();
    public final HashSet A08 = AbstractC166987dD.A1H();
    public final Map A09 = AbstractC166987dD.A1G();
    public final boolean A0A;
    public final UserSession A0B;
    public final InterfaceC670931a A0C;
    public final C42942Iyu A0D;
    public final boolean A0E;

    public final Integer A01(C120985dq c120985dq, C1PZ c1pz) {
        C38321qM c38321qM;
        String str = c120985dq.A06().A0f;
        if (str != null) {
            Iterator A08 = AbstractC37552Gg8.A08(this.A05);
            int i = 0;
            while (true) {
                if (!A08.hasNext()) {
                    break;
                }
                if (C14360o3.A0K(AbstractC37300Gc1.A0A(A08).getId(), str)) {
                    if (i != -1) {
                        if (c1pz.A02 >= i) {
                            return C05F.A0u;
                        }
                        if (C32V.A05(this.A0B, true)) {
                            return C05F.A03;
                        }
                        C37546Gg2 c37546Gg2 = this.A04;
                        EnumC129395t1 enumC129395t1 = c120985dq.A01;
                        if (enumC129395t1 == EnumC129395t1.A02 || enumC129395t1 == EnumC129395t1.A03) {
                            AbstractC37552Gg8 abstractC37552Gg8 = c37546Gg2.A0A;
                            List A0J = abstractC37552Gg8.A0J();
                            int size = A0J.size();
                            for (int i2 = 0; i2 < size; i2++) {
                                if (C14360o3.A0K(((C120985dq) A0J.get(i2)).getId(), str)) {
                                    if (((C120985dq) A0J.get(i2)).A02 != null && (c38321qM = ((C120985dq) A0J.get(i2)).A02) != null) {
                                        abstractC37552Gg8.A0S((C120985dq) A0J.get(i2), new C120985dq(new C128075qb(c38321qM, c120985dq.A06())));
                                        return null;
                                    }
                                    return null;
                                }
                            }
                            return null;
                        }
                        return null;
                    }
                } else {
                    i++;
                }
            }
            return C05F.A15;
        }
        return null;
    }

    @Override // X.InterfaceC671231d
    public final float Aug() {
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC671231d
    public final InterfaceC42381xS F9D() {
        return null;
    }

    private final String A00() {
        StringBuilder A1C;
        char c;
        Iterator A08 = AbstractC37552Gg8.A08(this.A05);
        int i = 0;
        String str = "";
        while (A08.hasNext()) {
            C120985dq A0A = AbstractC37300Gc1.A0A(A08);
            if (i >= 50) {
                break;
            }
            if (AbstractC37647Ghg.A00(A0A)) {
                A1C = AbstractC166997dE.A11(str);
                c = 'A';
            } else {
                boolean A0H = A0A.A0H();
                A1C = AbstractC166987dD.A1C();
                if (A0H) {
                    A1C.append(str);
                    c = 'N';
                } else {
                    A1C.append(str);
                    c = 'O';
                }
            }
            A1C.append(c);
            str = A1C.toString();
            i++;
        }
        return str;
    }

    @Override // X.InterfaceC671231d
    public final List AGp() {
        return C16930sl.A00;
    }

    @Override // X.InterfaceC671231d
    public final /* bridge */ /* synthetic */ void AHZ(Object obj) {
        C0f5 AEp = C18950wb.A01.AEp("ClipsSponsoredContentInjector", 817903741);
        AEp.ABW(DialogModule.KEY_MESSAGE, "Ad Pod is not supported for Reels Ads");
        AEp.report();
        throw AbstractC166987dD.A1D("Ad Pod is not supported for Reels Ads");
    }

    @Override // X.InterfaceC671231d
    public final /* bridge */ /* synthetic */ Object BUP(int i) {
        return this.A09.get(Integer.valueOf(i));
    }

    @Override // X.InterfaceC671231d
    public final List BZU() {
        List A0J = this.A05.A0J();
        ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(A0J, 10));
        Iterator it = A0J.iterator();
        while (it.hasNext()) {
            arrayList.add(((C120985dq) it.next()).getId());
        }
        return arrayList;
    }

    @Override // X.InterfaceC671231d
    public final List BZa() {
        List A0L = this.A05.A0L(EnumC129395t1.A0G);
        ArrayList A0q = AbstractC167017dG.A0q(A0L);
        Iterator it = A0L.iterator();
        while (it.hasNext()) {
            A0q.add(AbstractC37300Gc1.A0A(it).getId());
        }
        return A0q;
    }

    @Override // X.InterfaceC671231d
    public final Integer COV(InterfaceC42381xS interfaceC42381xS, C1PZ c1pz, int i) {
        int A0B;
        String str;
        HashSet hashSet;
        String id;
        int i2;
        String str2;
        HashSet hashSet2;
        String id2;
        boolean z = this instanceof C39458Hbk;
        AbstractC167017dG.A1O(interfaceC42381xS, c1pz);
        if (z) {
            C206239Bg c206239Bg = (C206239Bg) interfaceC42381xS.BUM();
            C120985dq c120985dq = (C120985dq) c206239Bg.A03;
            EnumC129395t1 enumC129395t1 = c120985dq.A01;
            if (AbstractC37647Ghg.A01(enumC129395t1) && c120985dq.A06().A0x) {
                Integer A01 = A01(c120985dq, c1pz);
                if (A01 != null) {
                    return A01;
                }
            } else {
                C37546Gg2 c37546Gg2 = this.A04;
                boolean z2 = c206239Bg.A01;
                Integer num = (Integer) c206239Bg.A00;
                if (num != null) {
                    str2 = AbstractC37798GkD.A01(num);
                } else {
                    str2 = null;
                }
                c37546Gg2.A09(c120985dq, str2, i, z2);
            }
            if (AbstractC37647Ghg.A01(enumC129395t1)) {
                hashSet2 = this.A07;
                id2 = AbstractC25226BEj.A1E(c120985dq);
            } else {
                if (c120985dq.A0H()) {
                    hashSet2 = this.A08;
                } else if (c120985dq.A01 == EnumC129395t1.A05) {
                    hashSet2 = this.A07;
                }
                id2 = c120985dq.getId();
            }
            hashSet2.add(id2);
        } else {
            Object BUM = interfaceC42381xS.BUM();
            C206239Bg c206239Bg2 = (C206239Bg) BUM;
            C120985dq c120985dq2 = (C120985dq) c206239Bg2.A03;
            EnumC129395t1 enumC129395t12 = c120985dq2.A01;
            C75113Zb c75113Zb = null;
            if (AbstractC37647Ghg.A01(enumC129395t12) && c120985dq2.A06().A0x) {
                Integer A012 = A01(c120985dq2, c1pz);
                if (A012 != null) {
                    return A012;
                }
            } else {
                UserSession userSession = this.A0B;
                boolean A06 = C18U.A06(C06090Tz.A05, userSession, 36318479681853646L);
                AbstractC39459Hbl abstractC39459Hbl = this.A05;
                if (!A06 || (abstractC39459Hbl.A0B() - 1 >= 0 && abstractC39459Hbl.A0F(abstractC39459Hbl.A0B() - 1).A01 != EnumC129395t1.A08)) {
                    A0B = abstractC39459Hbl.A0B();
                } else {
                    A0B = abstractC39459Hbl.A0B() - 1;
                }
                if (i >= 0 && i <= A0B) {
                    if (c1pz.A02 >= i) {
                        return C05F.A0u;
                    }
                    if (C32V.A05(userSession, AbstractC37647Ghg.A01(enumC129395t12))) {
                        return C05F.A03;
                    }
                    C37546Gg2 c37546Gg22 = this.A04;
                    boolean z3 = c206239Bg2.A01;
                    Integer num2 = (Integer) c206239Bg2.A00;
                    if (num2 != null) {
                        str = AbstractC37798GkD.A01(num2);
                    } else {
                        str = null;
                    }
                    c37546Gg22.A09(c120985dq2, str, i, z3);
                } else {
                    return C05F.A0C;
                }
            }
            if (this.A0E && c1pz.A00().contains("pushdown_rule_met")) {
                String BF8 = this.A01.BF8(BUM);
                C38321qM c38321qM = c120985dq2.A02;
                if (c38321qM != null && (c75113Zb = this.A00.BRZ(c38321qM)) != null) {
                    c75113Zb.A1O = "pushdown_rule_met";
                }
                C31I c31i = this.A02;
                List A1J = AbstractC166987dD.A1J(BF8);
                if (c75113Zb != null) {
                    i2 = c75113Zb.A0V;
                } else {
                    i2 = 0;
                }
                c31i.CiC(c120985dq2.A02, null, null, null, null, "pushdown_rule_met", "", A00(), null, null, AbstractC167017dG.A0r(BF8, String.valueOf(c120985dq2.BzL(this.A0B))), A1J, AbstractC166987dD.A1J(String.valueOf(i - i2)), AbstractC166987dD.A1J(String.valueOf(i)), -1.0f, c1pz.A02);
            }
            if (AbstractC37647Ghg.A01(enumC129395t12)) {
                hashSet = this.A07;
                id = AbstractC25226BEj.A1E(c120985dq2);
            } else {
                if (c120985dq2.A0H()) {
                    hashSet = this.A08;
                } else {
                    if (c120985dq2.A01 == EnumC129395t1.A05) {
                        hashSet = this.A07;
                    }
                    this.A09.put(Integer.valueOf(i), BUM);
                }
                id = c120985dq2.getId();
            }
            hashSet.add(id);
            this.A09.put(Integer.valueOf(i), BUM);
        }
        this.A04.A0A(this.A03, this.A06);
        return C05F.A00;
    }

    @Override // X.InterfaceC671231d
    public final InterfaceC42381xS Cpq() {
        return null;
    }

    @Override // X.InterfaceC671231d
    public final void DrH() {
        this.A07.clear();
        this.A08.clear();
    }

    @Override // X.InterfaceC671231d
    public final /* bridge */ /* synthetic */ void E6t(Object obj) {
        C0f5 AEp = C18950wb.A01.AEp("ClipsSponsoredContentInjector", 817903741);
        AEp.ABW(DialogModule.KEY_MESSAGE, "HP Push-Up is not supported for Reels Ads");
        AEp.report();
        throw AbstractC166987dD.A1D("HP Push-Up is not supported for Reels Ads");
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0153  */
    @Override // X.InterfaceC671231d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void E6u(java.lang.String r36, java.util.List r37, int r38, int r39, int r40, int r41) {
        /*
            Method dump skipped, instructions count: 515
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C37697GiY.E6u(java.lang.String, java.util.List, int, int, int, int):void");
    }

    @Override // X.InterfaceC671231d
    public final /* bridge */ /* synthetic */ boolean F9C(Object obj, String str, Map map) {
        C206239Bg c206239Bg = (C206239Bg) obj;
        C14360o3.A0B(c206239Bg, 0);
        C120985dq c120985dq = (C120985dq) c206239Bg.A03;
        if (!this.A05.A0b(c120985dq)) {
            return false;
        }
        this.A04.A08(c120985dq);
        Iterator A15 = AbstractC166997dE.A15(this.A09);
        while (A15.hasNext()) {
            if (C14360o3.A0K(AbstractC31176DnK.A0j(A15), c206239Bg)) {
                A15.remove();
            }
        }
        return true;
    }

    public C37697GiY(JPb jPb, UserSession userSession, InterfaceC670931a interfaceC670931a, InterfaceC62242sP interfaceC62242sP, C31I c31i, C42942Iyu c42942Iyu, C62832tM c62832tM, C37546Gg2 c37546Gg2, AbstractC39459Hbl abstractC39459Hbl, String str) {
        this.A0B = userSession;
        this.A04 = c37546Gg2;
        this.A05 = abstractC39459Hbl;
        this.A03 = c62832tM;
        this.A06 = str;
        this.A01 = interfaceC62242sP;
        this.A0C = interfaceC670931a;
        this.A0D = c42942Iyu;
        this.A00 = jPb;
        this.A02 = c31i;
        C06090Tz c06090Tz = C06090Tz.A05;
        this.A0A = C18U.A06(c06090Tz, userSession, 36318526924658951L);
        this.A0E = C18U.A06(c06090Tz, userSession, 36318526925117710L);
    }

    @Override // X.InterfaceC671231d
    public final int Bee() {
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC671231d
    public final int Bef() {
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC671231d
    public final /* bridge */ /* synthetic */ boolean CWc(Object obj) {
        HashSet hashSet;
        String id;
        C120985dq A0G = AbstractC37302Gc3.A0G(obj);
        if (AbstractC37647Ghg.A00(A0G)) {
            A0G.A06();
            hashSet = this.A07;
            id = AbstractC25226BEj.A1E(A0G);
        } else {
            if (A0G.A01 == EnumC129395t1.A05) {
                hashSet = this.A07;
            } else if (A0G.A0H()) {
                hashSet = this.A08;
            } else {
                return false;
            }
            id = A0G.getId();
        }
        return hashSet.contains(id);
    }
}
