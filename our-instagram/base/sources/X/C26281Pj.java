package X;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: X.1Pj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C26281Pj {
    public final List A00;
    public final List A01;
    public final SecureRandom A02;
    public final List A03;

    public C26281Pj(SecureRandom secureRandom) {
        C14360o3.A0B(secureRandom, 1);
        this.A02 = secureRandom;
        this.A03 = new ArrayList();
        this.A01 = new ArrayList();
        this.A00 = new ArrayList();
    }

    public final void A00(AbstractC26311Pm abstractC26311Pm, InterfaceC16660sJ interfaceC16660sJ) {
        List list = this.A03;
        C26321Pn c26321Pn = new C26321Pn(abstractC26311Pm, this.A02);
        interfaceC16660sJ.invoke(c26321Pn);
        list.add(c26321Pn);
    }

    public final void A01(boolean z) {
        int i;
        for (C26321Pn c26321Pn : this.A03) {
            List list = this.A01;
            C14360o3.A0B(list, 0);
            AbstractC26311Pm abstractC26311Pm = c26321Pn.A04;
            int A05 = abstractC26311Pm.A05(list);
            if (A05 > 0) {
                i = c26321Pn.A03 + A05;
            } else {
                i = 0;
            }
            c26321Pn.A03 = i;
            c26321Pn.A00 += A05;
            abstractC26311Pm.A02();
            if (z) {
                c26321Pn.A01 = Integer.MAX_VALUE;
                c26321Pn.A05.clear();
                c26321Pn.A03 = 0;
                c26321Pn.A00 = 0;
                c26321Pn.A02 = Integer.MAX_VALUE;
            }
        }
        this.A01.clear();
        this.A00.clear();
    }

    public final boolean A02(EnumC26291Pk enumC26291Pk, int i, int i2) {
        EnumC39596He6 enumC39596He6;
        List list = this.A00;
        list.clear();
        List<C26321Pn> list2 = this.A03;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            for (C26321Pn c26321Pn : list2) {
                List list3 = this.A01;
                C14360o3.A0B(list3, 0);
                if (!C26321Pn.A00(c26321Pn, list)) {
                    if (i < list3.size() && list3.get(i) == enumC26291Pk) {
                        AbstractC26311Pm abstractC26311Pm = c26321Pn.A04;
                        if (abstractC26311Pm.A04(enumC26291Pk, list3, i, i2) > c26321Pn.A01 || abstractC26311Pm.A04(enumC26291Pk, list3, i, i2) > c26321Pn.A02 - c26321Pn.A00) {
                            enumC39596He6 = EnumC39596He6.A04;
                        }
                    } else {
                        enumC39596He6 = EnumC39596He6.A08;
                    }
                    list.add(enumC39596He6.toString());
                    return false;
                }
                return false;
            }
        }
        return true;
    }

    public final boolean A03(EnumC26291Pk enumC26291Pk, Integer num, int i) {
        List list = this.A00;
        list.clear();
        List<C26321Pn> list2 = this.A03;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            for (C26321Pn c26321Pn : list2) {
                List list3 = this.A01;
                C14360o3.A0B(list3, 0);
                AbstractC26311Pm abstractC26311Pm = c26321Pn.A04;
                if (abstractC26311Pm.A06(enumC26291Pk, num, list3, i)) {
                    if (!C26321Pn.A00(c26321Pn, list)) {
                        if (abstractC26311Pm.A03(enumC26291Pk, list3, i) > c26321Pn.A01 || abstractC26311Pm.A03(enumC26291Pk, list3, i) > c26321Pn.A02 - c26321Pn.A00) {
                            list.add(EnumC39596He6.A04.toString());
                            return false;
                        }
                    } else {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
