package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;

/* renamed from: X.BuH, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26914BuH extends AbstractC116895Qv implements JIH {
    public C41004IDz A00;
    public int A01;
    public boolean A02;
    public final LinkedHashMap A03;
    public final InterfaceC09390do A04;
    public final InterfaceC09390do A05;
    public final InterfaceC09390do A06;
    public final InterfaceC09390do A07;
    public final InterfaceC09390do A08;
    public final InterfaceC09390do A09;
    public final InterfaceC09390do A0A;
    public final java.util.Set A0B;
    public final java.util.Set A0C;
    public final java.util.Set A0D;

    public C26914BuH(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A0D = new LinkedHashSet();
        this.A0C = new LinkedHashSet();
        this.A0B = new LinkedHashSet();
        this.A03 = AbstractC166987dD.A1I();
        EnumC09460dv enumC09460dv = EnumC09460dv.A02;
        this.A06 = AbstractC09440dt.A00(enumC09460dv, new C29903DGr(userSession, 13));
        this.A0A = AbstractC09440dt.A00(enumC09460dv, new C29903DGr(userSession, 17));
        this.A09 = AbstractC09440dt.A00(enumC09460dv, new C29903DGr(userSession, 16));
        this.A04 = AbstractC09440dt.A00(enumC09460dv, new C29903DGr(userSession, 11));
        this.A05 = AbstractC09440dt.A00(enumC09460dv, new C29903DGr(userSession, 12));
        this.A08 = AbstractC09440dt.A00(enumC09460dv, new C29903DGr(userSession, 15));
        this.A07 = AbstractC09440dt.A00(enumC09460dv, new C29903DGr(userSession, 14));
    }

    @Override // X.AbstractC116895Qv, X.InterfaceC116905Qw
    public final void D5E(C38971HDz c38971HDz) {
        C14360o3.A0B(c38971HDz, 0);
        this.A02 = false;
    }

    @Override // X.AbstractC116895Qv, X.InterfaceC116905Qw
    public final void D5F() {
        this.A02 = false;
    }

    @Override // X.AbstractC116895Qv, X.InterfaceC116905Qw
    public final void D5G(C37752GjR c37752GjR) {
        C14360o3.A0B(c37752GjR, 0);
        this.A02 = true;
    }

    @Override // X.AbstractC116895Qv, X.InterfaceC116905Qw
    public final void D5H(C37818GkY c37818GkY) {
        String id;
        C14360o3.A0B(c37818GkY, 0);
        boolean z = c37818GkY.A0D;
        boolean z2 = c37818GkY.A0F;
        boolean z3 = c37818GkY.A0B;
        if (c37818GkY.A0C) {
            this.A0D.clear();
            this.A0C.clear();
            this.A0B.clear();
            this.A03.clear();
        }
        if (!z && !z2 && !z3) {
            java.util.Set set = this.A0B;
            List list = c37818GkY.A09;
            ArrayList A1E = AbstractC166987dD.A1E();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C38321qM c38321qM = ((C120985dq) it.next()).A02;
                if (c38321qM != null && (id = c38321qM.getId()) != null) {
                    A1E.add(id);
                }
            }
            set.addAll(A1E);
        }
    }

    @Override // X.JIH
    public final void Dby(C120985dq c120985dq, int i, int i2, boolean z) {
        C14360o3.A0B(c120985dq, 0);
        if (c120985dq.A01 == EnumC129395t1.A0G) {
            String A0s = AbstractC25231BEo.A0s(c120985dq.A02);
            if (AbstractC001800i.A0u(this.A0B, A0s) && A0s != null) {
                LinkedHashMap linkedHashMap = this.A03;
                if (!linkedHashMap.containsKey(A0s)) {
                    linkedHashMap.put(A0s, new C26068Bfw(A0s));
                    int size = linkedHashMap.size();
                    if (size > 1) {
                        Collection values = linkedHashMap.values();
                        C14360o3.A07(values);
                        C26068Bfw c26068Bfw = (C26068Bfw) AbstractC001800i.A0F(values, size - 2);
                        if (c26068Bfw != null && c26068Bfw.A01 < AbstractC167027dH.A01(this.A04)) {
                            A01(this, C05F.A0N, c26068Bfw.A02);
                        }
                    }
                }
                C26068Bfw c26068Bfw2 = (C26068Bfw) linkedHashMap.get(A0s);
                if (c26068Bfw2 != null) {
                    c26068Bfw2.A01 = (int) (((i / i2) + c26068Bfw2.A00) * 100.0d);
                }
            }
        }
    }

    @Override // X.JIH
    public final void DzC(C120985dq c120985dq, int i, int i2) {
        C14360o3.A0B(c120985dq, 0);
        if (c120985dq.A01 == EnumC129395t1.A0G) {
            String A0s = AbstractC25231BEo.A0s(c120985dq.A02);
            if (AbstractC001800i.A0u(this.A0B, A0s) && A0s != null) {
                LinkedHashMap linkedHashMap = this.A03;
                Object obj = linkedHashMap.get(A0s);
                if (obj == null) {
                    obj = new C26068Bfw(A0s);
                    linkedHashMap.put(A0s, obj);
                }
                ((C26068Bfw) obj).A00 = i2;
            }
        }
    }

    @Override // X.JIH
    public final void E1V() {
    }

    public static final void A00(C26914BuH c26914BuH) {
        EnumC129395t1 enumC129395t1;
        EnumC129395t1 enumC129395t12;
        String str;
        String str2;
        C38321qM c38321qM;
        if (c26914BuH.A01 < AbstractC167027dH.A01(c26914BuH.A06)) {
            C41004IDz c41004IDz = c26914BuH.A00;
            if (c41004IDz != null) {
                int A01 = AbstractC167027dH.A01(c26914BuH.A05);
                java.util.Set keySet = c26914BuH.A03.keySet();
                C14360o3.A07(keySet);
                C37540Gfw c37540Gfw = c41004IDz.A00;
                C37556GgC A17 = AbstractC25226BEj.A17(c37540Gfw.A1v);
                int A03 = A17.A03() + A01 + 1;
                int A05 = A17.A05();
                int A0B = c37540Gfw.A0B();
                while (true) {
                    int i = A03 - 1;
                    C120985dq A09 = A17.A09(i);
                    if (A09 != null) {
                        enumC129395t1 = A09.A01;
                    } else {
                        enumC129395t1 = null;
                    }
                    if (enumC129395t1 == EnumC129395t1.A0G) {
                        C120985dq A092 = A17.A09(i);
                        if (A092 != null && (c38321qM = A092.A02) != null) {
                            str2 = c38321qM.getId();
                        } else {
                            str2 = null;
                        }
                        if (!AbstractC001800i.A0u(keySet, str2)) {
                            break;
                        }
                    }
                    if (A03 >= A05) {
                        break;
                    } else {
                        A03++;
                    }
                }
                int i2 = A05 - A03;
                C120985dq A093 = A17.A09(A17.A03());
                if (A093 != null) {
                    enumC129395t12 = A093.A01;
                } else {
                    enumC129395t12 = null;
                }
                if (enumC129395t12 == EnumC129395t1.A08) {
                    i2--;
                }
                if (i2 > A0B) {
                    List A0K = c37540Gfw.A0q.A0K(A03, A05);
                    C37726Gj1 c37726Gj1 = c37540Gfw.A0E;
                    if (c37726Gj1 != null) {
                        Iterator it = A0K.iterator();
                        while (it.hasNext()) {
                            C38321qM c38321qM2 = ((C120985dq) it.next()).A02;
                            if (c38321qM2 != null) {
                                c37726Gj1.A09.EFk(c38321qM2, c37726Gj1.A0A);
                                List list = c37726Gj1.A00;
                                if (list != null) {
                                    list.remove(c38321qM2);
                                }
                            }
                        }
                    }
                    ArrayList A0q = AbstractC167017dG.A0q(A0K);
                    Iterator it2 = A0K.iterator();
                    while (it2.hasNext()) {
                        C38321qM c38321qM3 = ((C120985dq) it2.next()).A02;
                        if (c38321qM3 != null) {
                            str = c38321qM3.getId();
                        } else {
                            str = null;
                        }
                        A0q.add(str);
                    }
                    C37540Gfw.A05(c37540Gfw, AbstractC001800i.A0X(A0q), false, true);
                }
            }
            c26914BuH.A01++;
        }
    }

    public static final void A01(C26914BuH c26914BuH, Integer num, String str) {
        String str2;
        if (AbstractC166987dD.A1a(AbstractC166987dD.A17(c26914BuH.A09)) && !c26914BuH.A02) {
            InterfaceC09390do interfaceC09390do = c26914BuH.A07;
            if (!((java.util.Set) interfaceC09390do.getValue()).isEmpty()) {
                java.util.Set set = (java.util.Set) interfaceC09390do.getValue();
                if (3 - num.intValue() != 0) {
                    str2 = "NOT_INTERESTED";
                } else {
                    str2 = "SKIP_SCROLL";
                }
                if (!set.contains(str2)) {
                    return;
                }
            }
            if (str == null || !c26914BuH.A0B.contains(str)) {
                return;
            }
            java.util.Set set2 = c26914BuH.A0C;
            if (set2.contains(str)) {
                return;
            }
            set2.add(str);
            C11T.A04(new D1N(c26914BuH), 17L);
        }
    }

    public static final void A02(C26914BuH c26914BuH, Integer num, String str) {
        String str2;
        if (AbstractC166987dD.A1a(AbstractC166987dD.A17(c26914BuH.A0A)) && !c26914BuH.A02) {
            InterfaceC09390do interfaceC09390do = c26914BuH.A08;
            if (!((java.util.Set) interfaceC09390do.getValue()).isEmpty()) {
                java.util.Set set = (java.util.Set) interfaceC09390do.getValue();
                switch (num.intValue()) {
                    case 0:
                        str2 = "FOLLOW";
                        break;
                    case 1:
                        str2 = "RESHARE";
                        break;
                    default:
                        str2 = "INTERESTED";
                        break;
                }
                if (!set.contains(str2)) {
                    return;
                }
            }
            if (str == null || !c26914BuH.A0B.contains(str)) {
                return;
            }
            java.util.Set set2 = c26914BuH.A0D;
            if (set2.contains(str)) {
                return;
            }
            set2.add(str);
            C11T.A04(new D1O(c26914BuH), 17L);
        }
    }

    @Override // X.JIH
    public final void DzP(C120985dq c120985dq, Integer num, int i) {
    }

    @Override // X.JIH
    public final void E1U(C120985dq c120985dq, InterfaceC31077DlK interfaceC31077DlK, boolean z) {
    }

    @Override // X.JIH
    public final void D8r(C120985dq c120985dq, List list) {
    }

    @Override // X.JIH
    public final void Dbv(C25370BKn c25370BKn, boolean z) {
    }

    @Override // X.JIH
    public final void DzJ(C120985dq c120985dq, int i) {
    }

    @Override // X.JIH
    public final void DzL(C120985dq c120985dq, int i) {
    }

    @Override // X.JIH
    public final void DzO(C120985dq c120985dq, C37644Ghd c37644Ghd, C37563GgJ c37563GgJ, C25370BKn c25370BKn, boolean z) {
    }
}
