package X;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.GiV, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37694GiV implements C31E {
    public final List A00 = AbstractC166987dD.A1E();

    public static Iterator A01(C37694GiV c37694GiV, Object obj) {
        C14360o3.A0B(obj, 0);
        return c37694GiV.A00.iterator();
    }

    @Override // X.C31F
    public final /* bridge */ /* synthetic */ void CiA(C1PZ c1pz, Long l, Object obj, String str, String str2, String str3, String str4, Collection collection, Collection collection2, Map map, Map map2, boolean z) {
        AbstractC167027dH.A0a(0, obj, str, collection, collection2);
        C14360o3.A0B(c1pz, 11);
        Iterator A00 = A00(this);
        while (A00.hasNext()) {
            ((C31F) A00.next()).CiA(c1pz, l, obj, str, str2, str3, str4, collection, collection2, map, map2, z);
        }
    }

    @Override // X.C31G
    public final void CiG(C85633rs c85633rs, List list, int i, long j, boolean z) {
        AbstractC167007dF.A1F(list, 0, c85633rs);
        Iterator A00 = A00(this);
        while (A00.hasNext()) {
            ((C31G) A00.next()).CiG(c85633rs, list, i, j, z);
        }
    }

    @Override // X.C31E
    public final /* synthetic */ void DrI(C3ZB c3zb) {
    }

    public static Iterator A00(C37694GiV c37694GiV) {
        return c37694GiV.A00.iterator();
    }

    @Override // X.C31E
    public final void CiB(Iterable iterable, String str, String str2) {
        AbstractC167027dH.A12("hp0_unavailable", str2, iterable);
        Iterator A00 = A00(this);
        while (A00.hasNext()) {
            ((C31E) A00.next()).CiB(iterable, "hp0_unavailable", str2);
        }
    }

    @Override // X.C31I
    public final void CiC(C38321qM c38321qM, Integer num, Integer num2, Integer num3, Integer num4, String str, String str2, String str3, String str4, String str5, HashMap hashMap, List list, List list2, List list3, float f, int i) {
        AbstractC167027dH.A12(list, list2, list3);
        AbstractC167007dF.A1G(str, 3, str2);
        AbstractC167007dF.A1I(str3, 7, hashMap);
        Iterator A00 = A00(this);
        while (A00.hasNext()) {
            ((C31I) A00.next()).CiC(c38321qM, num, num2, num3, num4, str, str2, str3, str4, str5, hashMap, list, list2, list3, f, i);
        }
    }

    @Override // X.C31H
    public final void Cky(C9B3 c9b3, String str, long j, long j2, long j3) {
        C14360o3.A0B(c9b3, 3);
        Iterator A00 = A00(this);
        while (A00.hasNext()) {
            ((C31H) A00.next()).Cky(c9b3, "feed_tbi", j, 0L, j3);
        }
    }

    @Override // X.C31G
    public final void Ci6(String str, String str2, String str3) {
        throw C00O.createAndThrow();
    }

    @Override // X.C31E
    public final /* bridge */ /* synthetic */ void Ci7(Integer num, Object obj) {
        AbstractC167017dG.A1N(obj, num);
        Iterator A00 = A00(this);
        while (A00.hasNext()) {
            ((C31E) A00.next()).Ci7(num, obj);
        }
    }

    @Override // X.C31E
    public final /* bridge */ /* synthetic */ void Ci8(InterfaceC42381xS interfaceC42381xS, Object obj) {
        AbstractC167017dG.A1N(interfaceC42381xS, obj);
        Iterator A00 = A00(this);
        while (A00.hasNext()) {
            ((C31E) A00.next()).Ci8(interfaceC42381xS, obj);
        }
    }

    @Override // X.C31E
    public final /* bridge */ /* synthetic */ void Ci9(InterfaceC42381xS interfaceC42381xS, Object obj) {
        AbstractC167017dG.A1N(interfaceC42381xS, obj);
        Iterator A00 = A00(this);
        while (A00.hasNext()) {
            ((C31E) A00.next()).Ci9(interfaceC42381xS, obj);
        }
    }

    @Override // X.C31G
    public final void CiD(int i, boolean z, long j) {
        Iterator A00 = A00(this);
        while (A00.hasNext()) {
            ((C31G) A00.next()).CiD(i, z, j);
        }
    }

    @Override // X.C31G
    public final void CiE(String str, int i, long j, boolean z) {
        Iterator A00 = A00(this);
        while (A00.hasNext()) {
            ((C31G) A00.next()).CiE(str, i, j, z);
        }
    }

    @Override // X.C31G
    public final void CiF(String str, String str2, String str3, String str4, boolean z, boolean z2) {
        Iterator A00 = A00(this);
        while (A00.hasNext()) {
            ((C31G) A00.next()).CiF(str, str2, str3, str4, z, z2);
        }
    }

    @Override // X.C31G
    public final void CiH(C85633rs c85633rs, Iterable iterable) {
        AbstractC167017dG.A1N(c85633rs, iterable);
        Iterator A00 = A00(this);
        while (A00.hasNext()) {
            ((C31G) A00.next()).CiH(c85633rs, iterable);
        }
    }

    @Override // X.C31E
    public final /* bridge */ /* synthetic */ void Cit(InterfaceC42381xS interfaceC42381xS, Object obj, String str) {
        AbstractC167017dG.A1N(interfaceC42381xS, obj);
        Iterator A00 = A00(this);
        while (A00.hasNext()) {
            ((C31E) A00.next()).Cit(interfaceC42381xS, obj, str);
        }
    }

    @Override // X.C31E
    public final void CkJ(InterfaceC42381xS interfaceC42381xS) {
        Iterator A01 = A01(this, interfaceC42381xS);
        while (A01.hasNext()) {
            ((C31E) A01.next()).CkJ(interfaceC42381xS);
        }
    }

    @Override // X.C31E
    public final void CkN(String str, String str2) {
        Iterator A01 = A01(this, str);
        while (A01.hasNext()) {
            ((C31E) A01.next()).CkN(str, str2);
        }
    }

    @Override // X.C31E
    public final void CkO(InterfaceC42381xS interfaceC42381xS, Iterable iterable) {
        AbstractC167017dG.A1N(interfaceC42381xS, iterable);
        Iterator A00 = A00(this);
        while (A00.hasNext()) {
            ((C31E) A00.next()).CkO(interfaceC42381xS, iterable);
        }
    }

    @Override // X.C31E
    public final /* bridge */ /* synthetic */ void Cke(Object obj) {
        Iterator A01 = A01(this, obj);
        while (A01.hasNext()) {
            ((C31E) A01.next()).Cke(obj);
        }
    }

    @Override // X.C31E
    public final /* bridge */ /* synthetic */ void Ckf(InterfaceC42381xS interfaceC42381xS, Object obj) {
        AbstractC167017dG.A1N(interfaceC42381xS, obj);
        Iterator A00 = A00(this);
        while (A00.hasNext()) {
            ((C31E) A00.next()).Ckf(interfaceC42381xS, obj);
        }
    }

    @Override // X.C31E
    public final /* bridge */ /* synthetic */ void Ckg(InterfaceC42381xS interfaceC42381xS, Object obj) {
        AbstractC167017dG.A1N(interfaceC42381xS, obj);
        Iterator A00 = A00(this);
        while (A00.hasNext()) {
            ((C31E) A00.next()).Ckg(interfaceC42381xS, obj);
        }
    }

    @Override // X.C31F
    public final /* bridge */ /* synthetic */ void Ckh(Object obj, String str, Collection collection) {
        AbstractC167027dH.A12(obj, str, collection);
        Iterator A00 = A00(this);
        while (A00.hasNext()) {
            ((C31F) A00.next()).Ckh(obj, str, collection);
        }
    }

    @Override // X.C31H
    public final /* bridge */ /* synthetic */ void Ckx(Integer num, Object obj, String str, List list) {
        AbstractC167017dG.A1N(str, list);
        Iterator A00 = A00(this);
        while (A00.hasNext()) {
            ((C31H) A00.next()).Ckx(num, obj, str, list);
        }
    }

    @Override // X.C31E
    public final void Cm0(C3ZB c3zb) {
        Iterator A01 = A01(this, c3zb);
        while (A01.hasNext()) {
            ((C31E) A01.next()).Cm0(c3zb);
        }
    }

    @Override // X.C31E
    public final void ERS(String str) {
        Iterator A01 = A01(this, str);
        while (A01.hasNext()) {
            ((C31E) A01.next()).ERS(str);
        }
    }

    @Override // X.C31E
    public final void ETt(int i) {
        Iterator A00 = A00(this);
        while (A00.hasNext()) {
            ((C31E) A00.next()).ETt(i);
        }
    }
}
