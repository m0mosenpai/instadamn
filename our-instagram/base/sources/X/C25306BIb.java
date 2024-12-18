package X;

import com.facebook.common.dextricks.Constants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.BIb, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25306BIb extends C0T6 {
    public final C9B5 A00;
    public final C206369Bt A01;
    public final MUG A02;
    public final C31200Dnj A03;
    public final C26062Bfp A04;
    public final MUW A05;
    public final C45097JxR A06;
    public final C25290BHi A07;
    public final BIC A08;
    public final Integer A09;
    public final String A0A;
    public final List A0B;
    public final List A0C;
    public final List A0D;
    public final List A0E;
    public final List A0F;
    public final List A0G;
    public final List A0H;
    public final List A0I;
    public final List A0J;
    public final List A0K;
    public final boolean A0L;
    public final C123025hd A0M;

    public static /* synthetic */ C25306BIb A01(C25306BIb c25306BIb, List list) {
        return A00(null, null, null, null, c25306BIb, null, list, null, null, 131069);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C25306BIb) {
                C25306BIb c25306BIb = (C25306BIb) obj;
                if (!C14360o3.A0K(this.A0M, c25306BIb.A0M) || !C14360o3.A0K(this.A0F, c25306BIb.A0F) || !C14360o3.A0K(this.A0J, c25306BIb.A0J) || !C14360o3.A0K(this.A04, c25306BIb.A04) || !C14360o3.A0K(this.A0K, c25306BIb.A0K) || !C14360o3.A0K(this.A07, c25306BIb.A07) || !C14360o3.A0K(this.A08, c25306BIb.A08) || !C14360o3.A0K(this.A03, c25306BIb.A03) || !C14360o3.A0K(this.A05, c25306BIb.A05) || !C14360o3.A0K(this.A0C, c25306BIb.A0C) || !C14360o3.A0K(this.A0H, c25306BIb.A0H) || !C14360o3.A0K(this.A06, c25306BIb.A06) || !C14360o3.A0K(this.A09, c25306BIb.A09) || !C14360o3.A0K(this.A0A, c25306BIb.A0A) || !C14360o3.A0K(this.A02, c25306BIb.A02) || !C14360o3.A0K(this.A01, c25306BIb.A01) || !C14360o3.A0K(this.A00, c25306BIb.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ C25306BIb A00(C206369Bt c206369Bt, MUG mug, C26062Bfp c26062Bfp, C45097JxR c45097JxR, C25306BIb c25306BIb, Integer num, List list, List list2, List list3, int i) {
        C123025hd c123025hd;
        C25290BHi c25290BHi;
        BIC bic;
        C31200Dnj c31200Dnj;
        MUW muw;
        List list4;
        List list5;
        String str;
        C206369Bt c206369Bt2 = c206369Bt;
        MUG mug2 = mug;
        Integer num2 = num;
        C45097JxR c45097JxR2 = c45097JxR;
        List list6 = list3;
        C26062Bfp c26062Bfp2 = c26062Bfp;
        List list7 = list2;
        List list8 = list;
        C9B5 c9b5 = null;
        if ((i & 1) != 0) {
            c123025hd = c25306BIb.A0M;
        } else {
            c123025hd = null;
        }
        if ((i & 2) != 0) {
            list8 = c25306BIb.A0F;
        }
        if ((i & 4) != 0) {
            list7 = c25306BIb.A0J;
        }
        if ((i & 8) != 0) {
            c26062Bfp2 = c25306BIb.A04;
        }
        if ((i & 16) != 0) {
            list6 = c25306BIb.A0K;
        }
        if ((i & 32) != 0) {
            c25290BHi = c25306BIb.A07;
        } else {
            c25290BHi = null;
        }
        if ((i & 64) != 0) {
            bic = c25306BIb.A08;
        } else {
            bic = null;
        }
        if ((i & 128) != 0) {
            c31200Dnj = c25306BIb.A03;
        } else {
            c31200Dnj = null;
        }
        if ((i & 256) != 0) {
            muw = c25306BIb.A05;
        } else {
            muw = null;
        }
        if ((i & 512) != 0) {
            list4 = c25306BIb.A0C;
        } else {
            list4 = null;
        }
        if ((i & 1024) != 0) {
            list5 = c25306BIb.A0H;
        } else {
            list5 = null;
        }
        if ((i & C3OO.FLAG_MOVED) != 0) {
            c45097JxR2 = c25306BIb.A06;
        }
        if ((i & 4096) != 0) {
            num2 = c25306BIb.A09;
        }
        if ((i & 8192) != 0) {
            str = c25306BIb.A0A;
        } else {
            str = null;
        }
        if ((i & Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET) != 0) {
            mug2 = c25306BIb.A02;
        }
        if ((32768 & i) != 0) {
            c206369Bt2 = c25306BIb.A01;
        }
        if ((i & Constants.LOAD_RESULT_PGO_ATTEMPTED) != 0) {
            c9b5 = c25306BIb.A00;
        }
        AbstractC167027dH.A12(c123025hd, list8, list7);
        AbstractC167007dF.A1J(list6, 4, list4);
        C14360o3.A0B(list5, 10);
        AbstractC25229BEm.A1P(mug2, 14, c9b5);
        return new C25306BIb(c9b5, c206369Bt2, mug2, c31200Dnj, c26062Bfp2, muw, c45097JxR2, c25290BHi, bic, c123025hd, num2, str, list8, list7, list6, list4, list5);
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A00, (AbstractC166997dE.A0J(this.A02, (((((AbstractC166997dE.A0J(this.A0H, AbstractC166997dE.A0J(this.A0C, (((((((AbstractC166997dE.A0J(this.A0K, (AbstractC166997dE.A0J(this.A0J, AbstractC166997dE.A0J(this.A0F, AbstractC166987dD.A0G(this.A0M))) + AbstractC167017dG.A0M(this.A04)) * 31) + AbstractC167017dG.A0M(this.A07)) * 31) + AbstractC167017dG.A0M(this.A08)) * 31) + AbstractC167017dG.A0M(this.A03)) * 31) + AbstractC167017dG.A0M(this.A05)) * 31)) + AbstractC167017dG.A0M(this.A06)) * 31) + AbstractC167017dG.A0M(this.A09)) * 31) + AbstractC167017dG.A0O(this.A0A)) * 31) + AbstractC166997dE.A0I(this.A01)) * 31);
    }

    public C25306BIb(C9B5 c9b5, C206369Bt c206369Bt, MUG mug, C31200Dnj c31200Dnj, C26062Bfp c26062Bfp, MUW muw, C45097JxR c45097JxR, C25290BHi c25290BHi, BIC bic, C123025hd c123025hd, Integer num, String str, List list, List list2, List list3, List list4, List list5) {
        AbstractC167007dF.A1G(list2, 3, list3);
        this.A0M = c123025hd;
        this.A0F = list;
        this.A0J = list2;
        this.A04 = c26062Bfp;
        this.A0K = list3;
        this.A07 = c25290BHi;
        this.A08 = bic;
        this.A03 = c31200Dnj;
        this.A05 = muw;
        this.A0C = list4;
        this.A0H = list5;
        this.A06 = c45097JxR;
        this.A09 = num;
        this.A0A = str;
        this.A02 = mug;
        this.A01 = c206369Bt;
        this.A00 = c9b5;
        boolean z = true;
        if (!(list4 instanceof Collection) || !list4.isEmpty()) {
            Iterator it = list4.iterator();
            loop5: while (it.hasNext()) {
                List list6 = (List) ((C51757Mtg) it.next()).A00;
                if (!(list6 instanceof Collection) || !list6.isEmpty()) {
                    Iterator it2 = list6.iterator();
                    while (it2.hasNext()) {
                        if (((BJF) it2.next()).A03) {
                            break loop5;
                        }
                    }
                }
            }
        }
        z = false;
        this.A0L = z;
        List list7 = this.A0F;
        ArrayList A1E = AbstractC166987dD.A1E();
        for (Object obj : list7) {
            if (C14360o3.A0K(((C5HW) obj).A0D, "copyright_stories")) {
                A1E.add(obj);
            }
        }
        this.A0B = A1E;
        List list8 = this.A0F;
        ArrayList A1E2 = AbstractC166987dD.A1E();
        for (Object obj2 : list8) {
            if (C14360o3.A0K(((C5HW) obj2).A0D, "friend_request_stories")) {
                A1E2.add(obj2);
            }
        }
        this.A0D = A1E2;
        List list9 = this.A0F;
        ArrayList A1E3 = AbstractC166987dD.A1E();
        for (Object obj3 : list9) {
            if ("priority_stories".equals(((C5HW) obj3).A0D)) {
                A1E3.add(obj3);
            }
        }
        this.A0I = A1E3;
        List list10 = this.A0F;
        ArrayList A1E4 = AbstractC166987dD.A1E();
        for (Object obj4 : list10) {
            if ("new_stories".equals(((C5HW) obj4).A0D)) {
                A1E4.add(obj4);
            }
        }
        this.A0E = A1E4;
        List list11 = this.A0F;
        ArrayList A1E5 = AbstractC166987dD.A1E();
        for (Object obj5 : list11) {
            if ("old_stories".equals(((C5HW) obj5).A0D)) {
                A1E5.add(obj5);
            }
        }
        this.A0G = A1E5;
    }
}
