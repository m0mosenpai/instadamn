package X;

/* renamed from: X.2RR, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C2RR {
    public static int A00;
    public static Boolean A01;
    public static Boolean A02;
    public static Boolean A03;

    public static final boolean A00() {
        Boolean bool = A02;
        if (bool == null) {
            bool = Boolean.valueOf(C20150ym.A07(AbstractC20070ye.A00(18298308732716251L)));
            A02 = bool;
            if (bool == null) {
                throw new IllegalStateException("Required value was null.");
            }
        }
        return bool.booleanValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0033, code lost:
    
        if (new java.util.Random().nextInt(r1) != 0) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean A02() {
        /*
            java.lang.Boolean r1 = X.C2RR.A03
            r2 = 1
            if (r1 != 0) goto L3c
            r0 = 18296341637955837(0x41006d000500fd, double:1.8914978178937097E-307)
            X.0tK r0 = X.AbstractC20070ye.A00(r0)
            boolean r0 = X.C20150ym.A07(r0)
            if (r0 == 0) goto L35
            r0 = 18296341638021374(0x41006d000600fe, double:1.8914978179196134E-307)
            X.0tK r0 = X.AbstractC20070ye.A00(r0)
            boolean r0 = X.C20150ym.A07(r0)
            if (r0 == 0) goto L35
            int r1 = X.C2RR.A00
            r0 = 100
            if (r1 < r0) goto L35
            java.util.Random r0 = new java.util.Random
            r0.<init>()
            int r1 = r0.nextInt(r1)
            r0 = 1
            if (r1 == 0) goto L36
        L35:
            r0 = 0
        L36:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            X.C2RR.A03 = r1
        L3c:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            boolean r0 = r0.equals(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2RR.A02():boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001f, code lost:
    
        if (new java.util.Random().nextInt(r1) != 0) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean A04() {
        /*
            java.lang.Boolean r0 = X.C2RR.A01
            if (r0 != 0) goto L32
            r0 = 18578031362769395(0x42009f000101f3, double:2.0028363905471925E-307)
            X.0tK r0 = X.AbstractC20070ye.A00(r0)
            long r2 = X.C20150ym.A01(r0)
            int r1 = (int) r2
            r0 = 1
            if (r1 < r0) goto L21
            java.util.Random r0 = new java.util.Random
            r0.<init>()
            int r1 = r0.nextInt(r1)
            r0 = 1
            if (r1 == 0) goto L22
        L21:
            r0 = 0
        L22:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            X.C2RR.A01 = r0
            if (r0 != 0) goto L32
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L32:
            boolean r0 = r0.booleanValue()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2RR.A04():boolean");
    }

    public static final boolean A01() {
        if (C20150ym.A07(AbstractC20070ye.A00(18296341637955837L)) && C20150ym.A07(AbstractC20070ye.A00(18296341637890300L))) {
            return true;
        }
        return false;
    }

    public static final boolean A03() {
        if (C20150ym.A07(AbstractC20070ye.A00(18296341637955837L)) && C20150ym.A07(AbstractC20070ye.A00(18296341637759226L))) {
            return true;
        }
        return false;
    }
}
