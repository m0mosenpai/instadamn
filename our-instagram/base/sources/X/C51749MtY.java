package X;

import java.util.List;
import java.util.Map;

/* renamed from: X.MtY, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51749MtY extends C0T6 {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public final int A06;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C51749MtY(C50627MWo c50627MWo, C51671Ms2 c51671Ms2, List list, Map map) {
        this(c50627MWo, (C51760Mtj) null, c51671Ms2, (Integer) null, list, map);
        this.A06 = 0;
    }

    public static boolean A00(Object obj, int i) {
        if ((obj instanceof C51749MtY) && ((C51749MtY) obj).A06 == i) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:90:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r3) {
        /*
            Method dump skipped, instructions count: 448
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51749MtY.equals(java.lang.Object):boolean");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    public final int hashCode() {
        int A0J;
        int A0I;
        Object obj;
        switch (this.A06) {
            case 0:
                A0J = (AbstractC166997dE.A0J(this.A01, AbstractC166997dE.A0J(this.A03, AbstractC166997dE.A0J(this.A05, AbstractC166987dD.A0G(this.A04)))) + AbstractC167017dG.A0M(this.A00)) * 31;
                A0I = AbstractC166997dE.A0I(this.A02);
                return A0J + A0I;
            case 1:
                A0J = ((((((((AbstractC167017dG.A0M(this.A00) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC167017dG.A0M(this.A02)) * 31) + AbstractC167017dG.A0M(this.A03)) * 31) + AbstractC167017dG.A0M(this.A04)) * 31;
                obj = this.A05;
                A0I = AbstractC166997dE.A0I(obj);
                return A0J + A0I;
            case 2:
                A0J = (((AbstractC166997dE.A0J(this.A01, AbstractC166997dE.A0J(this.A02, AbstractC166987dD.A0G(this.A05))) + AbstractC167017dG.A0M(this.A04)) * 31) + AbstractC167017dG.A0M(this.A00)) * 31;
                A0I = AbstractC166997dE.A0I(this.A03);
                return A0J + A0I;
            case 3:
                return AbstractC166987dD.A0I(this.A01, AbstractC166997dE.A0J(this.A02, AbstractC166997dE.A0J(this.A03, AbstractC166997dE.A0J(this.A05, AbstractC166997dE.A0J(this.A04, AbstractC166987dD.A0G(this.A00))))));
            case 4:
                A0J = (((AbstractC166997dE.A0J(this.A03, (AbstractC166987dD.A0G(this.A00) + AbstractC167017dG.A0M(this.A02)) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC167017dG.A0M(this.A04)) * 31;
                A0I = AbstractC166997dE.A0I(this.A05);
                return A0J + A0I;
            case 5:
                A0J = (((((((AbstractC166987dD.A0G(this.A05) + AbstractC167017dG.A0M(this.A04)) * 31) + AbstractC167017dG.A0M(this.A03)) * 31) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC167017dG.A0M(this.A02)) * 31;
                obj = this.A01;
                A0I = AbstractC166997dE.A0I(obj);
                return A0J + A0I;
            case 6:
                A0J = (((((AbstractC166997dE.A0J(this.A00, AbstractC166987dD.A0G(this.A05)) + AbstractC167017dG.A0M(this.A02)) * 31) + AbstractC167017dG.A0M(this.A03)) * 31) + AbstractC167017dG.A0M(this.A04)) * 31;
                A0I = AbstractC166997dE.A0I(this.A01);
                return A0J + A0I;
            default:
                return super.hashCode();
        }
    }

    public final String toString() {
        if (this.A06 != 0) {
            return super.toString();
        }
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("GridViewModel(items=");
        A1C.append(this.A04);
        A1C.append(", videoSizeMap=");
        A1C.append(this.A05);
        A1C.append(", gridLayoutStrategy=");
        A1C.append(this.A03);
        A1C.append(", floatingLayoutConfig=");
        A1C.append(this.A01);
        A1C.append(", floatingGridViewModel=");
        A1C.append(this.A00);
        A1C.append(", gridBackgroundColor=");
        return AbstractC167017dG.A0o(this.A02, A1C);
    }

    public C51749MtY(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        this.A06 = i;
        this.A00 = obj;
        this.A01 = obj2;
        this.A02 = obj3;
        this.A03 = obj4;
        this.A04 = obj5;
        this.A05 = obj6;
    }

    public C51749MtY(AbstractC55145Od4 abstractC55145Od4, AbstractC55145Od4 abstractC55145Od42, AbstractC55145Od4 abstractC55145Od43, AbstractC55145Od4 abstractC55145Od44, List list, List list2, int i) {
        this.A06 = 7;
        list = (i & 2) != 0 ? C16930sl.A00 : list;
        abstractC55145Od43 = (i & 8) != 0 ? new NVA(AbstractC166997dE.A0a()) : abstractC55145Od43;
        abstractC55145Od44 = (i & 32) != 0 ? null : abstractC55145Od44;
        this.A06 = 7;
        AbstractC43594JPz.A1P(list, abstractC55145Od43);
        this.A05 = abstractC55145Od4;
        this.A02 = list;
        this.A03 = abstractC55145Od42;
        this.A04 = abstractC55145Od43;
        this.A01 = list2;
        this.A00 = abstractC55145Od44;
    }

    public C51749MtY(C5QE c5qe, C5QE c5qe2, C5QE c5qe3, C5QE c5qe4, C5QE c5qe5, EnumC33348Eoh enumC33348Eoh, int i) {
        this.A06 = 2;
        c5qe3 = (i & 8) != 0 ? null : c5qe3;
        c5qe4 = (i & 16) != 0 ? null : c5qe4;
        c5qe5 = (i & 32) != 0 ? null : c5qe5;
        this.A06 = 2;
        this.A05 = c5qe;
        this.A02 = c5qe2;
        this.A01 = enumC33348Eoh;
        this.A04 = c5qe3;
        this.A00 = c5qe4;
        this.A03 = c5qe5;
    }

    public C51749MtY(C51843Mvl c51843Mvl, C51843Mvl c51843Mvl2, C51843Mvl c51843Mvl3, C51846Mvo c51846Mvo, C51844Mvm c51844Mvm, C51845Mvn c51845Mvn) {
        this.A06 = 4;
        this.A00 = c51846Mvo;
        this.A02 = c51844Mvm;
        this.A03 = c51845Mvn;
        this.A01 = c51843Mvl;
        this.A04 = c51843Mvl2;
        this.A05 = c51843Mvl3;
    }

    public C51749MtY(C50627MWo c50627MWo, C51760Mtj c51760Mtj, C51671Ms2 c51671Ms2, Integer num, List list, Map map) {
        this.A06 = 0;
        AbstractC167017dG.A1P(list, map);
        this.A04 = list;
        this.A05 = map;
        this.A03 = c50627MWo;
        this.A01 = c51671Ms2;
        this.A00 = c51760Mtj;
        this.A02 = num;
    }

    public C51749MtY(C38687GzS c38687GzS, UQE uqe, C67315Uk0 c67315Uk0, Boolean bool, Boolean bool2, C5Hc c5Hc) {
        this.A06 = 5;
        C14360o3.A0B(c5Hc, 1);
        this.A05 = c5Hc;
        this.A04 = c67315Uk0;
        this.A03 = c38687GzS;
        this.A00 = uqe;
        this.A02 = bool;
        this.A01 = bool2;
    }

    public C51749MtY(C51759Mti c51759Mti, C51759Mti c51759Mti2, C51759Mti c51759Mti3, C51759Mti c51759Mti4, Integer num, List list) {
        this.A06 = 6;
        AbstractC167017dG.A1P(c51759Mti, list);
        this.A05 = c51759Mti;
        this.A00 = list;
        this.A02 = num;
        this.A03 = c51759Mti2;
        this.A04 = c51759Mti3;
        this.A01 = c51759Mti4;
    }
}
