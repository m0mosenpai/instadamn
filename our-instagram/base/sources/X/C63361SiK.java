package X;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* renamed from: X.SiK, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63361SiK {
    public int A00;
    public final int A01;
    public final SPZ A02;
    public final QBE A03;
    public final Map A04;
    public final Map A05;

    /* JADX WARN: Removed duplicated region for block: B:14:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x002c A[Catch: all -> 0x0043, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0013, B:7:0x0017, B:9:0x001d, B:15:0x0033, B:16:0x003d, B:21:0x002c), top: B:2:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized java.lang.Object A04(int r4, java.lang.Class r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.util.Map r0 = r3.A04     // Catch: java.lang.Throwable -> L43
            java.util.NavigableMap r1 = X.AbstractC58323PtF.A0y(r5, r0)     // Catch: java.lang.Throwable -> L43
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> L43
            java.lang.Object r2 = r1.ceilingKey(r0)     // Catch: java.lang.Throwable -> L43
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch: java.lang.Throwable -> L43
            if (r2 == 0) goto L26
            int r0 = r3.A00     // Catch: java.lang.Throwable -> L43
            if (r0 == 0) goto L28
            int r1 = r3.A01     // Catch: java.lang.Throwable -> L43
            int r1 = r1 / r0
            r0 = 2
            if (r1 >= r0) goto L28
            int r1 = r2.intValue()     // Catch: java.lang.Throwable -> L43
            int r0 = r4 * 8
            if (r1 > r0) goto L26
            goto L28
        L26:
            r0 = 0
            goto L29
        L28:
            r0 = 1
        L29:
            if (r0 == 0) goto L2c
            goto L33
        L2c:
            X.QBE r0 = r3.A03     // Catch: java.lang.Throwable -> L43
            X.Sts r0 = r0.A00(r5, r4)     // Catch: java.lang.Throwable -> L43
            goto L3d
        L33:
            X.QBE r1 = r3.A03     // Catch: java.lang.Throwable -> L43
            int r0 = r2.intValue()     // Catch: java.lang.Throwable -> L43
            X.Sts r0 = r1.A00(r5, r0)     // Catch: java.lang.Throwable -> L43
        L3d:
            java.lang.Object r0 = A01(r0, r3, r5)     // Catch: java.lang.Throwable -> L43
            monitor-exit(r3)
            return r0
        L43:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63361SiK.A04(int, java.lang.Class):java.lang.Object");
    }

    public final synchronized void A05(Object obj) {
        Class<?> cls = obj.getClass();
        InterfaceC65559Tmf A00 = A00(cls);
        int Acf = A00.Acf(obj);
        int B0y = A00.B0y() * Acf;
        int i = this.A01;
        if (B0y <= i / 2) {
            C63798Sts A002 = this.A03.A00(cls, Acf);
            this.A02.A02(A002, obj);
            NavigableMap A0y = AbstractC58323PtF.A0y(cls, this.A04);
            Integer num = (Integer) AbstractC166997dE.A0m(A0y, A002.A00);
            Integer valueOf = Integer.valueOf(A002.A00);
            int i2 = 1;
            if (num != null) {
                i2 = 1 + num.intValue();
            }
            AbstractC37301Gc2.A1T(valueOf, A0y, i2);
            this.A00 += B0y;
            A02(this, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private InterfaceC65559Tmf A00(Class cls) {
        InterfaceC65559Tmf interfaceC65559Tmf;
        Map map = this.A05;
        InterfaceC65559Tmf interfaceC65559Tmf2 = (InterfaceC65559Tmf) map.get(cls);
        InterfaceC65559Tmf interfaceC65559Tmf3 = interfaceC65559Tmf2;
        if (interfaceC65559Tmf2 == null) {
            if (cls.equals(int[].class)) {
                interfaceC65559Tmf = new Object();
            } else if (cls.equals(byte[].class)) {
                interfaceC65559Tmf = new Object();
            } else {
                throw AbstractC167007dF.A0c("No array pool found for: ", cls.getSimpleName());
            }
            map.put(cls, interfaceC65559Tmf);
            interfaceC65559Tmf3 = interfaceC65559Tmf;
        }
        return interfaceC65559Tmf3;
    }

    public static void A02(C63361SiK c63361SiK, int i) {
        while (c63361SiK.A00 > i) {
            Object A00 = c63361SiK.A02.A00();
            Rs8.A00(A00);
            Class<?> cls = A00.getClass();
            InterfaceC65559Tmf A002 = c63361SiK.A00(cls);
            int i2 = c63361SiK.A00;
            int Acf = A002.Acf(A00);
            c63361SiK.A00 = i2 - (A002.B0y() * Acf);
            c63361SiK.A03(cls, Acf);
            android.util.Log.isLoggable(A002.getTag(), 2);
        }
    }

    private void A03(Class cls, int i) {
        Map map = this.A04;
        Map map2 = (Map) map.get(cls);
        if (map2 == null) {
            map2 = new TreeMap();
            map.put(cls, map2);
        }
        Integer valueOf = Integer.valueOf(i);
        Number A0Q = AbstractC37300Gc1.A0Q(valueOf, map2);
        if (A0Q != null) {
            int intValue = A0Q.intValue();
            if (intValue == 1) {
                map2.remove(valueOf);
                return;
            } else {
                AbstractC37301Gc2.A1T(valueOf, map2, intValue - 1);
                return;
            }
        }
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("Tried to decrement empty size, size: ");
        A1C.append(i);
        throw AbstractC166987dD.A15(AbstractC167017dG.A0n(this, ", this: ", A1C));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.QBE, X.SAV] */
    public C63361SiK(int i) {
        this.A02 = new SPZ();
        this.A03 = new SAV();
        this.A04 = AbstractC166987dD.A1G();
        this.A05 = AbstractC166987dD.A1G();
        this.A01 = i;
    }

    public static Object A01(C63798Sts c63798Sts, C63361SiK c63361SiK, Class cls) {
        InterfaceC65559Tmf A00 = c63361SiK.A00(cls);
        Object A01 = c63361SiK.A02.A01(c63798Sts);
        if (A01 != null) {
            int i = c63361SiK.A00;
            int Acf = A00.Acf(A01);
            c63361SiK.A00 = i - (A00.B0y() * Acf);
            c63361SiK.A03(cls, Acf);
            return A01;
        }
        android.util.Log.isLoggable(A00.getTag(), 2);
        return A00.CsG(c63798Sts.A00);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.QBE, X.SAV] */
    public C63361SiK() {
        this.A02 = new SPZ();
        this.A03 = new SAV();
        this.A04 = AbstractC166987dD.A1G();
        this.A05 = AbstractC166987dD.A1G();
        this.A01 = 4194304;
    }
}
