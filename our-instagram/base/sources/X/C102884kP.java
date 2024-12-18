package X;

import android.util.SparseArray;
import android.view.View;
import com.facebook.R;
import com.instagram.common.lispy.lang.BloksScript;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* renamed from: X.4kP, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C102884kP implements C2W2 {
    public static final InterfaceC102914kS A0B = new InterfaceC102914kS() { // from class: X.4kR
        @Override // X.InterfaceC102914kS
        public final Object CsV(C6FG c6fg, C102884kP c102884kP) {
            return new Object();
        }
    };
    public int A00;
    public InterfaceC102974kY A01;
    public AnonymousClass631 A02;
    public java.util.Set A03;
    public final int A04;
    public final int A05;
    public final SparseArray A06;
    public final C102934kU A07;
    public final C102884kP A08;
    public final LinkedList A09;
    public final List A0A;

    public final C102884kP A07() {
        int i = this.A04;
        return new C102884kP(this.A01, this.A02, this, null, this.A0A, i);
    }

    public final void A0R(C6B3 c6b3) {
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.A06;
            if (i >= sparseArray.size()) {
                break;
            }
            Object valueAt = sparseArray.valueAt(i);
            if (valueAt != null) {
                c6b3.FDj(sparseArray.keyAt(i), valueAt);
            }
            i++;
        }
        C103054kg A00 = AbstractC103044kf.A00();
        EnumC103014kc enumC103014kc = (EnumC103014kc) AbstractC103024kd.A02.get();
        if (enumC103014kc == null) {
            enumC103014kc = EnumC103014kc.A03;
        }
        if (A00 != null && enumC103014kc != EnumC103014kc.A04) {
            SparseArray sparseArray2 = (SparseArray) this.A07.A00();
            for (int i2 = 0; i2 < sparseArray2.size(); i2++) {
                int keyAt = sparseArray2.keyAt(i2);
                Object A01 = AbstractC103044kf.A01(enumC103014kc, A00, new Q0N(this, keyAt));
                if (A01 != null) {
                    c6b3.FDj(keyAt, A01);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0116, code lost:
    
        if (r6.A02.AgS().AgW().EKz() == false) goto L49;
     */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Throwable, X.4kQ, java.lang.RuntimeException] */
    @Override // X.C2W2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C2W5 AF8(X.C78473fD r15, int r16, int r17) {
        /*
            Method dump skipped, instructions count: 541
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C102884kP.AF8(X.3fD, int, int):X.2W5");
    }

    @Override // X.C2W2
    public final /* synthetic */ C2W5 AF9(C78473fD c78473fD, long j) {
        return AbstractC135286Ad.A00(c78473fD, this, j);
    }

    public final float A02(int i, float f) {
        Object A01 = A01(Number.class, A00(this, i), Float.valueOf(f));
        AbstractC05810Sj.A00(A01);
        return ((Number) A01).floatValue();
    }

    public final View A05(C6FG c6fg) {
        if (c6fg == null) {
            return null;
        }
        return ((C135396Ao) c6fg.A01(A0B, this, R.id.bk_context_key_associated_mutable_container)).A00;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003e, code lost:
    
        if (A02(145, 0.0f) != 0.0f) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C2WC A06(X.C2WC r6, final X.C6FG r7) {
        /*
            r5 = this;
            r0 = 136(0x88, float:1.9E-43)
            r2 = 1065353216(0x3f800000, float:1.0)
            float r0 = r5.A02(r0, r2)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L40
            r0 = 137(0x89, float:1.92E-43)
            float r0 = r5.A02(r0, r2)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L40
            r0 = 138(0x8a, float:1.93E-43)
            r1 = 0
            float r0 = r5.A02(r0, r1)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L40
            r0 = 141(0x8d, float:1.98E-43)
            float r0 = r5.A02(r0, r2)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L40
            r0 = 144(0x90, float:2.02E-43)
            float r0 = r5.A02(r0, r1)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L40
            r0 = 145(0x91, float:2.03E-43)
            float r0 = r5.A02(r0, r1)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r3 = 0
            if (r0 == 0) goto L41
        L40:
            r3 = 1
        L41:
            r0 = 133(0x85, float:1.86E-43)
            java.util.List r4 = r5.A0O(r0)
            if (r3 != 0) goto L58
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L58
            if (r6 == 0) goto L57
            java.lang.Integer r1 = r6.A04
            java.lang.Integer r0 = X.C05F.A01
            if (r1 == r0) goto L58
        L57:
            return r6
        L58:
            if (r6 == 0) goto L68
            java.lang.Integer r1 = r6.A04
            java.lang.Integer r0 = X.C05F.A00
            if (r1 != r0) goto L74
            java.lang.String r1 = "Trying to apply View attributes to a Drawable Node is not yet supported"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L68:
            int r0 = r5.A04
            long r1 = (long) r0
            boolean r0 = X.AnonymousClass634.A0A(r7)
            X.6Ae r6 = new X.6Ae
            r6.<init>(r7, r1, r0)
        L74:
            r1 = 2131428745(0x7f0b0589, float:1.8479143E38)
            X.4kS r0 = X.C102884kP.A0B
            java.lang.Object r0 = r7.A01(r0, r5, r1)
            X.6Ao r0 = (X.C135396Ao) r0
            X.6Ap r1 = new X.6Ap
            r1.<init>(r0)
            X.3eC r0 = new X.3eC
            r0.<init>(r1, r6)
            r6.A0D(r0)
            if (r3 == 0) goto L9f
            long r2 = r6.A0H()
            X.U7D r1 = new X.U7D
            r1.<init>(r5, r2)
            X.3eC r0 = new X.3eC
            r0.<init>(r1, r6)
            r6.A0D(r0)
        L9f:
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L57
            X.4kg r0 = X.AbstractC103044kf.A00()
            if (r0 == 0) goto Lb9
            X.U6P r0 = new X.U6P
            r0.<init>(r7, r5)
            X.3eC r1 = new X.3eC
            r1.<init>(r0, r4)
        Lb5:
            r6.A0D(r1)
            return r6
        Lb9:
            java.util.List r1 = java.util.Collections.unmodifiableList(r4)
            X.6Aq r0 = new X.6Aq
            r0.<init>(r7, r5, r1)
            X.3eC r1 = new X.3eC
            r1.<init>(r0, r6)
            goto Lb5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C102884kP.A06(X.2WC, X.6FG):X.2WC");
    }

    public final InterfaceC103384lE A09() {
        return A0B(36);
    }

    public final InterfaceC103384lE A0A() {
        return A0B(35);
    }

    public final InterfaceC103384lE A0B(int i) {
        Object obj = this.A06.get(i);
        if (obj == null) {
            return null;
        }
        return AbstractC1344365p.A00(this, obj, i);
    }

    public final String A0C() {
        return (String) A01(String.class, A00(this, 158), null);
    }

    public final String A0D() {
        Object A00 = A00(this, 33);
        if (A00 == null) {
            return null;
        }
        if (A00 instanceof String) {
            return (String) A00;
        }
        if (A00 instanceof Number) {
            return String.valueOf(((Number) A00).longValue());
        }
        AbstractC25241Le.A02("BloksModel", AnonymousClass001.A0g(AbstractC111324zv.A00(1857), A00.getClass().getSimpleName(), " for Server Id Value"));
        return null;
    }

    public final String A0E() {
        return A0L(35);
    }

    public final String A0F() {
        return A0L(40);
    }

    public final String A0G() {
        return A0L(36);
    }

    public final String A0H() {
        return A0L(42);
    }

    public final String A0I() {
        return A0L(38);
    }

    public final String A0J() {
        return A0L(41);
    }

    public final String A0K() {
        return A0L(43);
    }

    public final List A0O(int i) {
        Object A01 = A01(List.class, A00(this, i), Collections.emptyList());
        AbstractC05810Sj.A00(A01);
        return (List) A01;
    }

    /* JADX WARN: Code restructure failed: missing block: B:129:0x006c, code lost:
    
        if (r5 <= r6) goto L132;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v6, types: [com.instagram.common.lispy.lang.BloksScript] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0P() {
        /*
            Method dump skipped, instructions count: 458
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C102884kP.A0P():void");
    }

    public final void A0Q(int i, Object obj) {
        this.A06.put(i, obj);
    }

    public final boolean A0U(boolean z) {
        return A0S(38, z);
    }

    public C102884kP(int i) {
        this.A07 = new C102934kU(new C1LY() { // from class: X.4kT
            @Override // X.C1LY
            public final /* bridge */ /* synthetic */ Object get() {
                Object obj = C102884kP.this.A06.get(135);
                if (!(obj instanceof List)) {
                    return new SparseArray();
                }
                List list = (List) obj;
                SparseArray sparseArray = new SparseArray(list.size() / 2);
                for (int i2 = 0; i2 < list.size(); i2 += 2) {
                    sparseArray.put(((Number) list.get(i2)).intValue(), list.get(i2 + 1));
                }
                return sparseArray;
            }
        });
        this.A09 = null;
        this.A06 = new SparseArray();
        this.A05 = i;
        this.A04 = AbstractC102944kV.A00.incrementAndGet();
        this.A0A = null;
        this.A08 = null;
        this.A01 = null;
        this.A02 = null;
        AbstractC102954kW.A04.incrementAndGet();
    }

    public static Object A00(C102884kP c102884kP, int i) {
        C140126Vq A00;
        BloksScript bloksScript;
        C103054kg A002 = AbstractC103044kf.A00();
        if (A002 == null) {
            AnonymousClass631 anonymousClass631 = c102884kP.A02;
            if (anonymousClass631 != null) {
                A002 = anonymousClass631.A00;
            } else {
                A002 = null;
            }
        }
        Object obj = AbstractC103024kd.A02.get();
        if (obj == null) {
            obj = EnumC103014kc.A03;
        }
        SparseArray sparseArray = c102884kP.A06;
        Object obj2 = sparseArray.get(i);
        if (A002 != null && obj != EnumC103014kc.A04) {
            SparseArray sparseArray2 = (SparseArray) c102884kP.A07.A00();
            if (sparseArray2.size() != 0 && (bloksScript = (BloksScript) sparseArray2.get(i)) != null) {
                long j = i | (c102884kP.A04 << 27) | 1152921504606846976L;
                if (obj == EnumC103014kc.A02) {
                    A00 = A002.A03.A00(j);
                    if (A00 == null) {
                        return null;
                    }
                } else {
                    A00 = AbstractC140166Vu.A00(A002, new C140156Vt(c102884kP, bloksScript, obj2, i), j);
                }
            } else {
                int[] A003 = C1LZ.A00().A03().A00(c102884kP.A05);
                int length = A003.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        break;
                    }
                    int i3 = A003[i2];
                    if (i3 == i) {
                        List list = (List) sparseArray.get(i3);
                        if (list != null) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                if (((C102884kP) it.next()).A05 == 16851) {
                                    long j2 = i | (c102884kP.A04 << 27) | 2305843009213693952L;
                                    if (obj == EnumC103014kc.A02) {
                                        A00 = A002.A03.A00(j2);
                                        if (A00 == null) {
                                            return null;
                                        }
                                    } else {
                                        A00 = AbstractC140166Vu.A00(A002, list, j2);
                                    }
                                }
                            }
                        }
                    } else {
                        i2++;
                    }
                }
            }
            return ((AbstractC140206Vy) A00.A01).A00;
        }
        return obj2;
    }

    private final Object A01(Class cls, Object obj, Object obj2) {
        if (cls.isInstance(obj)) {
            return obj;
        }
        if (obj != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(AbstractC111324zv.A00(1857));
            sb.append(obj.getClass().getSimpleName());
            sb.append(" for expected type: ");
            sb.append(cls);
            sb.append(" on model with styleId: ");
            sb.append(this.A05);
            AbstractC25241Le.A02("BloksModel", sb.toString());
        }
        return obj2;
    }

    public final int A03(int i, int i2) {
        Object A00 = A00(this, i);
        if (A00 instanceof String) {
            try {
                return Integer.parseInt((String) A00);
            } catch (NumberFormatException unused) {
                AbstractC25241Le.A02("BloksModel", "Non-int string parsed as int");
                return i2;
            }
        }
        Object A01 = A01(Number.class, A00, Integer.valueOf(i2));
        AbstractC05810Sj.A00(A01);
        return ((Number) A01).intValue();
    }

    public final long A04(int i, long j) {
        Object A00 = A00(this, i);
        if (A00 instanceof String) {
            try {
                return Long.parseLong((String) A00);
            } catch (NumberFormatException unused) {
                AbstractC25241Le.A02("BloksModel", "Non-long string parsed as long");
                return j;
            }
        }
        Object A01 = A01(Number.class, A00, Long.valueOf(j));
        AbstractC05810Sj.A00(A01);
        return ((Number) A01).longValue();
    }

    public final C102884kP A08(int i) {
        Object A00 = A00(this, i);
        if (A00 instanceof List) {
            List A0N = A0N(i);
            if (A0N.isEmpty()) {
                return null;
            }
            A00 = A0N.get(0);
        } else if (!(A00 instanceof C102884kP)) {
            return null;
        }
        return (C102884kP) A00;
    }

    public final String A0L(int i) {
        return (String) A01(String.class, A00(this, i), null);
    }

    public final List A0M() {
        return A0N(C1LZ.A00().A08.A00(this));
    }

    public final List A0N(int i) {
        Object A00 = A00(this, i);
        if (A00 instanceof C102884kP) {
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(A00);
            return arrayList;
        }
        Object A01 = A01(List.class, A00, Collections.emptyList());
        AbstractC05810Sj.A00(A01);
        return (List) A01;
    }

    public final boolean A0S(int i, boolean z) {
        Object A00 = A00(this, i);
        if (A00 != null) {
            if (A00 instanceof Boolean) {
                return ((Boolean) A00).booleanValue();
            }
            if (A00 instanceof Number) {
                if (((Number) A00).intValue() == 1) {
                    return true;
                }
                return false;
            }
            AbstractC25241Le.A02("ParseUtils", "Attempting to extract boolean value from unrecognized value type");
            return z;
        }
        return z;
    }

    public final boolean A0T(InterfaceC126005ms interfaceC126005ms) {
        if (!interfaceC126005ms.FDk(this)) {
            C1LG A03 = C1LZ.A00().A03();
            int i = this.A05;
            for (int i2 : A03.A01(i)) {
                C102884kP A08 = A08(i2);
                if (A08 == null || !A08.A0T(interfaceC126005ms)) {
                }
            }
            int[] A00 = C1LZ.A00().A03().A00(i);
            for (int i3 : A00) {
                List A0N = A0N(i3);
                for (int i4 = 0; i4 < A0N.size(); i4++) {
                    C102884kP c102884kP = (C102884kP) A0N.get(i4);
                    if (c102884kP != null && c102884kP.A0T(interfaceC126005ms)) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public C102884kP(List list, int i, int i2) {
        this.A07 = new C102934kU(new C1LY() { // from class: X.4kT
            @Override // X.C1LY
            public final /* bridge */ /* synthetic */ Object get() {
                Object obj = C102884kP.this.A06.get(135);
                if (!(obj instanceof List)) {
                    return new SparseArray();
                }
                List list2 = (List) obj;
                SparseArray sparseArray = new SparseArray(list2.size() / 2);
                for (int i22 = 0; i22 < list2.size(); i22 += 2) {
                    sparseArray.put(((Number) list2.get(i22)).intValue(), list2.get(i22 + 1));
                }
                return sparseArray;
            }
        });
        this.A09 = null;
        this.A06 = new SparseArray(i2 + 1);
        this.A05 = i;
        this.A04 = AbstractC102944kV.A00.incrementAndGet();
        this.A0A = list;
        this.A08 = null;
        this.A01 = null;
        this.A02 = null;
        AbstractC102954kW.A04.incrementAndGet();
    }

    public C102884kP(C102884kP c102884kP, Q02 q02) {
        this.A07 = new C102934kU(new C1LY() { // from class: X.4kT
            @Override // X.C1LY
            public final /* bridge */ /* synthetic */ Object get() {
                Object obj = C102884kP.this.A06.get(135);
                if (!(obj instanceof List)) {
                    return new SparseArray();
                }
                List list2 = (List) obj;
                SparseArray sparseArray = new SparseArray(list2.size() / 2);
                for (int i22 = 0; i22 < list2.size(); i22 += 2) {
                    sparseArray.put(((Number) list2.get(i22)).intValue(), list2.get(i22 + 1));
                }
                return sparseArray;
            }
        });
        LinkedList linkedList = c102884kP.A09;
        linkedList = linkedList == null ? new LinkedList() : linkedList;
        this.A09 = linkedList;
        linkedList.addFirst(q02);
        this.A06 = c102884kP.A06;
        this.A05 = c102884kP.A05;
        this.A04 = c102884kP.A04;
        this.A0A = c102884kP.A0A;
        C102884kP c102884kP2 = c102884kP.A08;
        this.A08 = c102884kP2 == null ? null : c102884kP2;
        this.A01 = c102884kP.A01;
        this.A02 = c102884kP.A02;
        this.A00 = c102884kP.A00;
        this.A03 = c102884kP.A03;
        AbstractC102954kW.A04.incrementAndGet();
    }

    public C102884kP(InterfaceC102974kY interfaceC102974kY, AnonymousClass631 anonymousClass631, C102884kP c102884kP, C102884kP c102884kP2, List list, int i) {
        this.A07 = new C102934kU(new C1LY() { // from class: X.4kT
            @Override // X.C1LY
            public final /* bridge */ /* synthetic */ Object get() {
                Object obj = C102884kP.this.A06.get(135);
                if (!(obj instanceof List)) {
                    return new SparseArray();
                }
                List list2 = (List) obj;
                SparseArray sparseArray = new SparseArray(list2.size() / 2);
                for (int i22 = 0; i22 < list2.size(); i22 += 2) {
                    sparseArray.put(((Number) list2.get(i22)).intValue(), list2.get(i22 + 1));
                }
                return sparseArray;
            }
        });
        this.A09 = c102884kP.A09;
        this.A06 = c102884kP.A06.clone();
        this.A05 = c102884kP.A05;
        this.A04 = i;
        this.A0A = list;
        this.A08 = c102884kP2;
        this.A01 = interfaceC102974kY;
        this.A02 = anonymousClass631;
        this.A00 = c102884kP.A00;
        this.A03 = c102884kP.A03;
        AbstractC102954kW.A04.incrementAndGet();
    }
}
