package X;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.TTj, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64775TTj implements Map, Serializable {
    public static final C64775TTj A06 = new C64775TTj(null, new Object[0], 0);
    public transient AbstractC64898TYy A00;
    public transient RO1 A01;
    public transient RO1 A02;
    public final transient Object[] A03;
    public final transient int A04;
    public final transient Object A05;

    public C64775TTj() {
    }

    public C64775TTj(Object obj, Object[] objArr, int i) {
        this();
        this.A05 = obj;
        this.A03 = objArr;
        this.A04 = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x008a, code lost:
    
        r0 = r3 ^ 1;
     */
    @Override // java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object get(java.lang.Object r9) {
        /*
            r8 = this;
            r7 = 0
            if (r9 == 0) goto L91
            int r0 = r8.A04
            java.lang.Object[] r4 = r8.A03
            r1 = 1
            if (r0 != r1) goto L1c
            r0 = 0
            r0 = r4[r0]
            r0.getClass()
            boolean r0 = r0.equals(r9)
            if (r0 == 0) goto L91
            r0 = r4[r1]
            r0.getClass()
        L1b:
            return r0
        L1c:
            java.lang.Object r5 = r8.A05
            if (r5 == 0) goto L91
            boolean r0 = r5 instanceof byte[]
            r6 = -1
            if (r0 == 0) goto L45
            byte[] r5 = (byte[]) r5
            int r0 = r5.length
            int r2 = r0 + (-1)
            int r0 = r9.hashCode()
            int r1 = X.AbstractC62217S2m.A00(r0)
        L32:
            r1 = r1 & r2
            r3 = r5[r1]
            r0 = 255(0xff, float:3.57E-43)
            r3 = r3 & r0
            if (r3 == r0) goto L91
            r0 = r4[r3]
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L8a
            int r1 = r1 + 1
            goto L32
        L45:
            boolean r0 = r5 instanceof short[]
            if (r0 == 0) goto L6a
            short[] r5 = (short[]) r5
            int r0 = r5.length
            int r2 = r0 + (-1)
            int r0 = r9.hashCode()
            int r1 = X.AbstractC62217S2m.A00(r0)
        L56:
            r1 = r1 & r2
            short r0 = r5[r1]
            char r3 = (char) r0
            r0 = 65535(0xffff, float:9.1834E-41)
            if (r3 == r0) goto L91
            r0 = r4[r3]
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L8a
            int r1 = r1 + 1
            goto L56
        L6a:
            int[] r5 = (int[]) r5
            int r0 = r5.length
            int r3 = r0 + (-1)
            int r0 = r9.hashCode()
            int r2 = X.AbstractC62217S2m.A00(r0)
        L77:
            r2 = r2 & r3
            r1 = r5[r2]
            if (r1 == r6) goto L91
            r0 = r4[r1]
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L87
            r0 = r1 ^ 1
            goto L8c
        L87:
            int r2 = r2 + 1
            goto L77
        L8a:
            r0 = r3 ^ 1
        L8c:
            r0 = r4[r0]
            if (r0 != 0) goto L1b
            return r7
        L91:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64775TTj.get(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.Map
    public final int size() {
        return this.A04;
    }

    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [short[], byte[]], vars: [r5v0 ??, r5v4 ??, r5v1 ??, r5v2 short[], r5v3 ??, r5v8 byte[], r5v9 ??]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:107)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:83)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.rerun(InitCodeVariables.java:36)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:553)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
        */
    public static X.C64775TTj A00(X.C62729SNt r17, java.lang.Object[] r18, int r19) {
        /*
            Method dump skipped, instructions count: 421
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64775TTj.A00(X.SNt, java.lang.Object[], int):X.TTj");
    }

    public static C64775TTj A01(Object obj, Object obj2, Object obj3) {
        AbstractC62216S2l.A00("com.android.vending.billing.PURCHASES_UPDATED", obj);
        AbstractC62216S2l.A00("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED", obj2);
        AbstractC62216S2l.A00("com.android.vending.billing.ALTERNATIVE_BILLING", obj3);
        return A00(null, new Object[]{"com.android.vending.billing.PURCHASES_UPDATED", obj, "com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED", obj2, "com.android.vending.billing.ALTERNATIVE_BILLING", obj3}, 3);
    }

    @Override // java.util.Map
    /* renamed from: A02, reason: merged with bridge method [inline-methods] */
    public final AbstractC64898TYy values() {
        AbstractC64898TYy abstractC64898TYy = this.A00;
        if (abstractC64898TYy == null) {
            C60717RNx A062 = A06();
            this.A00 = A062;
            return A062;
        }
        return abstractC64898TYy;
    }

    @Override // java.util.Map
    /* renamed from: A03, reason: merged with bridge method [inline-methods] */
    public final RO1 entrySet() {
        RO1 ro1 = this.A01;
        if (ro1 == null) {
            RO0 A04 = A04();
            this.A01 = A04;
            return A04;
        }
        return ro1;
    }

    public final RO0 A04() {
        return new RO0(this, this.A03, this.A04);
    }

    public final C60719RNz A05() {
        return new C60719RNz(new C60717RNx(this.A03, 0, this.A04), this);
    }

    public final C60717RNx A06() {
        return new C60717RNx(this.A03, 1, this.A04);
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        return entrySet().equals(((Map) obj).entrySet());
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ java.util.Set keySet() {
        RO1 ro1 = this.A02;
        if (ro1 == null) {
            C60719RNz A05 = A05();
            this.A02 = A05;
            return A05;
        }
        return ro1;
    }

    @Override // java.util.Map
    @Deprecated
    public final void clear() {
        throw AbstractC43592JPx.A11();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return AbstractC167007dF.A1W(get(obj));
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        if (obj3 != null) {
            return obj3;
        }
        return obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return S2p.A00(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return AbstractC167007dF.A1N(size());
    }

    @Override // java.util.Map
    @Deprecated
    public final Object put(Object obj, Object obj2) {
        throw AbstractC43592JPx.A11();
    }

    @Override // java.util.Map
    @Deprecated
    public final void putAll(Map map) {
        throw AbstractC43592JPx.A11();
    }

    @Override // java.util.Map
    @Deprecated
    public final Object remove(Object obj) {
        throw AbstractC43592JPx.A11();
    }

    public final String toString() {
        int size = size();
        if (size >= 0) {
            StringBuilder A0t = AbstractC58323PtF.A0t(size);
            Iterator it = entrySet().iterator();
            boolean z = true;
            while (it.hasNext()) {
                Map.Entry A1K = AbstractC166987dD.A1K(it);
                if (!z) {
                    AbstractC58318PtA.A1S(A0t);
                }
                AbstractC58323PtF.A1R(A0t, A1K);
                z = false;
            }
            return AbstractC167027dH.A0R(A0t);
        }
        throw AbstractC25230BEn.A0n("size cannot be negative but was: ", size);
    }
}
