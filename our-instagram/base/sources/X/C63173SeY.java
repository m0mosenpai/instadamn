package X;

import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.SeY, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63173SeY {
    public final int A00;
    public final AbstractC63035SbA A01;
    public final HashMap A02;
    public final RBV[] A03;

    public static C63173SeY A01(AnonymousClass469 anonymousClass469, AbstractC63035SbA abstractC63035SbA, RBV[] rbvArr, boolean z) {
        int length = rbvArr.length;
        RBV[] rbvArr2 = new RBV[length];
        for (int i = 0; i < length; i++) {
            RBV rbv = rbvArr[i];
            if (!rbv.A0N()) {
                rbv = rbv.A04(anonymousClass469.A0B(rbv, rbv.A04));
            }
            rbvArr2[i] = rbv;
        }
        return new C63173SeY(anonymousClass469, abstractC63035SbA, rbvArr2, z, false);
    }

    public static RBV A00(C63173SeY c63173SeY, Object obj) {
        return (RBV) c63173SeY.A02.get(obj);
    }

    public final Object A02(AnonymousClass469 anonymousClass469, SQ0 sq0) {
        AbstractC63035SbA abstractC63035SbA = this.A01;
        RBV[] rbvArr = this.A03;
        if (sq0.A00 > 0) {
            BitSet bitSet = sq0.A07;
            if (bitSet == null) {
                int i = sq0.A01;
                Object[] objArr = sq0.A08;
                int length = objArr.length;
                int i2 = 0;
                while (i2 < length) {
                    if ((i & 1) == 0) {
                        objArr[i2] = sq0.A00(rbvArr[i2]);
                    }
                    i2++;
                    i >>= 1;
                }
            } else {
                Object[] objArr2 = sq0.A08;
                int length2 = objArr2.length;
                int i3 = 0;
                while (true) {
                    int nextClearBit = bitSet.nextClearBit(i3);
                    if (nextClearBit >= length2) {
                        break;
                    }
                    objArr2[nextClearBit] = sq0.A00(rbvArr[nextClearBit]);
                    i3 = nextClearBit + 1;
                }
            }
        }
        AnonymousClass469 anonymousClass4692 = sq0.A05;
        if (anonymousClass4692.A0j(EnumC912945i.A0C)) {
            for (int i4 = 0; i4 < rbvArr.length; i4++) {
                if (sq0.A08[i4] == null) {
                    RBV rbv = rbvArr[i4];
                    anonymousClass4692.A0W(rbv, "Null value for creator property '%s' (index %d); `DeserializationFeature.FAIL_ON_NULL_CREATOR_PROPERTIES` enabled", AbstractC25228BEl.A1Z(rbv.A06.A02, rbv.A02()));
                    break;
                }
            }
        }
        Object A0E = abstractC63035SbA.A0E(anonymousClass469, sq0.A08);
        if (A0E != null) {
            C64520THn c64520THn = sq0.A06;
            if (c64520THn != null) {
                Object obj = sq0.A03;
                if (obj != null) {
                    anonymousClass469.A0I(c64520THn.A00, c64520THn.A01, obj).A01(A0E);
                    RBV rbv2 = c64520THn.A05;
                    if (rbv2 != null) {
                        A0E = rbv2.A0F(A0E, sq0.A03);
                    }
                } else {
                    anonymousClass469.A0W(c64520THn.A05, String.format("No Object Id found for an instance of %s, to assign to property '%s'", C914045z.A07(A0E), c64520THn.A04), new Object[0]);
                    throw C00O.createAndThrow();
                }
            }
            for (AbstractC62497SDz abstractC62497SDz = sq0.A02; abstractC62497SDz != null; abstractC62497SDz = abstractC62497SDz.A00) {
                if (abstractC62497SDz instanceof C60583R9t) {
                    C60583R9t c60583R9t = (C60583R9t) abstractC62497SDz;
                    c60583R9t.A00.A0L(A0E, c60583R9t.A01);
                } else if (abstractC62497SDz instanceof C60582R9s) {
                    C60582R9s c60582R9s = (C60582R9s) abstractC62497SDz;
                    ((Map) A0E).put(c60582R9s.A00, c60582R9s.A01);
                } else {
                    C60584R9u c60584R9u = (C60584R9u) abstractC62497SDz;
                    c60584R9u.A00.A02(A0E, c60584R9u.A01, ((AbstractC62497SDz) c60584R9u).A01);
                }
            }
        }
        return A0E;
    }

    public C63173SeY(AnonymousClass469 anonymousClass469, AbstractC63035SbA abstractC63035SbA, RBV[] rbvArr, boolean z, boolean z2) {
        HashMap A1G;
        RBL BSA;
        this.A01 = abstractC63035SbA;
        if (z) {
            A1G = new C64909TZj(((C45T) anonymousClass469.A02).A01.A09);
        } else {
            A1G = AbstractC166987dD.A1G();
        }
        this.A02 = A1G;
        int length = rbvArr.length;
        this.A00 = length;
        this.A03 = new RBV[length];
        if (z2) {
            C912845h c912845h = anonymousClass469.A02;
            for (RBV rbv : rbvArr) {
                if (!(rbv instanceof R9k) || !((R9k) rbv).A01) {
                    List list = ((AbstractC64171T2a) rbv).A01;
                    if (list == null) {
                        C44W A00 = c912845h.A00();
                        list = (A00 == null || (BSA = rbv.BSA()) == null || (list = A00.A0i(BSA)) == null) ? Collections.emptyList() : list;
                        ((AbstractC64171T2a) rbv).A01 = list;
                    }
                    if (!list.isEmpty()) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            this.A02.put(((C913945y) it.next()).A02, rbv);
                        }
                    }
                }
            }
        }
        for (int i = 0; i < length; i++) {
            RBV rbv2 = rbvArr[i];
            this.A03[i] = rbv2;
            if (!(rbv2 instanceof R9k) || !((R9k) rbv2).A01) {
                this.A02.put(rbv2.A06.A02, rbv2);
            }
        }
    }
}
