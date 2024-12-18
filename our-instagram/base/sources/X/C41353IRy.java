package X;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.IRy, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41353IRy {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v27, types: [X.5uq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v0, types: [X.N3P, X.HYW] */
    /* JADX WARN: Type inference failed for: r4v3, types: [X.5ut, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [X.0sl] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.util.AbstractCollection, java.util.ArrayList] */
    public static HYW parseFromJson(C16L c16l) {
        ?? r5;
        Integer num;
        ArrayList arrayList;
        C14360o3.A0B(c16l, 0);
        try {
            ?? n3p = new N3P();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("has_more".equals(A0s)) {
                    n3p.A04 = c16l.A0d();
                } else if ("page_index".equals(A0s)) {
                    n3p.A00 = AbstractC166997dE.A0h(c16l);
                } else {
                    ArrayList arrayList2 = null;
                    if ("rank_token".equals(A0s)) {
                        n3p.A01 = AbstractC167017dG.A0m(c16l);
                    } else if ("reels_max_id".equals(A0s)) {
                        n3p.A02 = AbstractC167017dG.A0m(c16l);
                    } else if ("reels_serp_modules".equals(A0s)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList2 = AbstractC166987dD.A1E();
                            while (c16l.A1J() != C16R.A08) {
                                IFA parseFromJson = AbstractC40793I5v.parseFromJson(c16l);
                                if (parseFromJson != null) {
                                    arrayList2.add(parseFromJson);
                                }
                            }
                        }
                        n3p.A03 = arrayList2;
                    } else {
                        AbstractC54184NxL.A00(c16l, n3p, A0s);
                    }
                }
                c16l.A0z();
            }
            List list = n3p.A03;
            String str = n3p.A02;
            boolean z = n3p.A04;
            if (list != null) {
                ArrayList A1E = AbstractC166987dD.A1E();
                for (Object obj : list) {
                    if (C14360o3.A0K(((IFA) obj).A00, "clips")) {
                        A1E.add(obj);
                    }
                }
                ArrayList A1E2 = AbstractC166987dD.A1E();
                Iterator it = A1E.iterator();
                while (it.hasNext()) {
                    Iterable iterable = ((IFA) it.next()).A01;
                    if (iterable == null) {
                        iterable = C16930sl.A00;
                    }
                    AnonymousClass016.A16(iterable, A1E2);
                }
                ArrayList A0Q = AbstractC001800i.A0Q(A1E2, 3);
                r5 = AbstractC167007dF.A0i(A0Q);
                Iterator it2 = A0Q.iterator();
                while (it2.hasNext()) {
                    List<C111034zF> list2 = (List) it2.next();
                    ArrayList A0i = AbstractC167007dF.A0i(list2);
                    for (C111034zF c111034zF : list2) {
                        C130535uy c130535uy = new C130535uy();
                        c130535uy.A00 = 0;
                        C38321qM c38321qM = c111034zF.A00;
                        String A0R = AnonymousClass001.A0R("clips-", c38321qM.getId());
                        C14360o3.A0B(A0R, 0);
                        c130535uy.A0A = A0R;
                        EnumC132885zD enumC132885zD = EnumC132885zD.A08;
                        C14360o3.A0B(enumC132885zD, 0);
                        c130535uy.A06 = enumC132885zD;
                        C125905mf A00 = InterfaceC111084zP.A00.A00(z);
                        A00.A00 = str;
                        c130535uy.A03 = A00.A00();
                        EnumC132895zE enumC132895zE = EnumC132895zE.A05;
                        C14360o3.A0B(enumC132895zE, 0);
                        c130535uy.A07 = enumC132895zE;
                        ArrayList A1N = AbstractC16960so.A1N(new C111034zF(c38321qM, null));
                        C14360o3.A0B(A1N, 0);
                        c130535uy.A0E = A1N;
                        C130505uv c130505uv = new C130505uv(EnumC130515uw.A07, c130535uy, null, null);
                        c130505uv.A01();
                        A0i.add(c130505uv);
                    }
                    ?? obj2 = new Object();
                    obj2.A03 = null;
                    obj2.A0D = null;
                    obj2.A0E = A0i;
                    obj2.A04 = null;
                    obj2.A0G = null;
                    obj2.A08 = null;
                    obj2.A0A = null;
                    obj2.A09 = null;
                    obj2.A05 = null;
                    obj2.A06 = null;
                    obj2.A01 = null;
                    obj2.A02 = null;
                    obj2.A0F = null;
                    obj2.A0H = null;
                    obj2.A0B = null;
                    obj2.A07 = null;
                    obj2.A00 = null;
                    obj2.A0C = null;
                    C125475lt c125475lt = IBK.A00;
                    EnumC130465ur enumC130465ur = EnumC130465ur.A03;
                    ?? obj3 = new Object();
                    obj3.A01 = obj2;
                    obj3.A00 = c125475lt;
                    obj3.A02 = enumC130465ur;
                    r5.add(obj3);
                }
            } else {
                r5 = C16930sl.A00;
            }
            if (AbstractC166987dD.A1b(r5)) {
                IK0 ik0 = new IK0();
                String str2 = n3p.A02;
                ik0.A02 = str2;
                ik0.A06 = n3p.A04;
                ik0.A03 = n3p.A01;
                ik0.A00 = str2;
                ik0.A04 = String.valueOf(n3p.A00);
                ik0.A01 = String.valueOf(n3p.A04);
                ik0.A05 = r5;
                n3p.A02 = ik0;
            }
            C38657Gyy c38657Gyy = n3p.A01;
            if (c38657Gyy != null && (num = c38657Gyy.A01) != null && num.intValue() == 1) {
                boolean z2 = c38657Gyy.A0D;
                String str3 = c38657Gyy.A02;
                String str4 = c38657Gyy.A03;
                String str5 = c38657Gyy.A04;
                String str6 = c38657Gyy.A05;
                String str7 = c38657Gyy.A06;
                Boolean bool = c38657Gyy.A00;
                List list3 = c38657Gyy.A0A;
                String str8 = c38657Gyy.A07;
                List list4 = c38657Gyy.A0B;
                List list5 = c38657Gyy.A0C;
                String str9 = c38657Gyy.A08;
                String str10 = c38657Gyy.A09;
                ArrayList arrayList3 = null;
                AbstractC37302Gc3.A0n();
                if (list3 != null) {
                    arrayList = AbstractC167007dF.A0i(list3);
                    Iterator it3 = list3.iterator();
                    while (it3.hasNext()) {
                        arrayList.add((UR1) ((InterfaceC43472JIk) it3.next()));
                    }
                } else {
                    arrayList = null;
                }
                if (list4 != null) {
                    arrayList3 = AbstractC167007dF.A0i(list4);
                    Iterator it4 = list4.iterator();
                    while (it4.hasNext()) {
                        arrayList3.add((URD) ((XFN) it4.next()));
                    }
                }
                n3p.A01 = new C38657Gyy(bool, 0, str3, str4, str5, str6, str7, str8, str9, str10, arrayList, arrayList3, list5, z2);
                return n3p;
            }
            return n3p;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
