package X;

import java.lang.reflect.Field;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import sun.misc.Unsafe;

/* renamed from: X.Sj4, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63388Sj4 {
    public static final long A00;
    public static final SQH A01;
    public static final Unsafe A02 = A03();
    public static final boolean A03;
    public static final boolean A04;
    public static final boolean A05;
    public static final boolean A06;
    public static final boolean A07;
    public static final Class A08;

    static {
        boolean A0G;
        boolean A0F;
        Class cls = S97.A00;
        A08 = cls;
        A06 = A06(Long.TYPE);
        boolean A062 = A06(Integer.TYPE);
        A05 = A062;
        Unsafe unsafe = A02;
        SQH sqh = null;
        if (unsafe != null) {
            if (cls != null && !S97.A01) {
                if (A06) {
                    sqh = new RaG(unsafe);
                } else if (A062) {
                    sqh = new RaF(unsafe);
                }
            } else {
                sqh = new RaH(unsafe);
            }
        }
        A01 = sqh;
        if (sqh == null) {
            A0G = false;
        } else {
            A0G = sqh.A0G();
        }
        A04 = A0G;
        SQH sqh2 = A01;
        if (sqh2 == null) {
            A0F = false;
        } else {
            A0F = sqh2.A0F();
        }
        A03 = A0F;
        A00 = A00(byte[].class);
        A00(boolean[].class);
        boolean z = A03;
        if (z) {
            sqh2.A07(boolean[].class);
        }
        A00(int[].class);
        if (z) {
            sqh2.A07(int[].class);
        }
        A00(long[].class);
        if (z) {
            sqh2.A07(long[].class);
        }
        A00(float[].class);
        if (z) {
            sqh2.A07(float[].class);
        }
        A00(double[].class);
        if (z) {
            sqh2.A07(double[].class);
        }
        A00(Object[].class);
        if (z) {
            sqh2.A07(Object[].class);
        }
        Field A022 = A02();
        if (A022 != null && sqh2 != null) {
            sqh2.A0E(A022);
        }
        A07 = AbstractC167007dF.A1X(ByteOrder.nativeOrder(), ByteOrder.BIG_ENDIAN);
    }

    public static int A00(Class cls) {
        if (A03) {
            return A01.A03(cls);
        }
        return -1;
    }

    public static Object A01(Class cls) {
        try {
            return A02.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0007, code lost:
    
        if (X.S97.A01 != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.reflect.Field A02() {
        /*
            java.lang.Class r0 = X.S97.A00
            if (r0 == 0) goto L9
            boolean r1 = X.S97.A01
            r0 = 1
            if (r1 == 0) goto La
        L9:
            r0 = 0
        La:
            if (r0 == 0) goto L19
            java.lang.Class<java.nio.Buffer> r1 = java.nio.Buffer.class
            java.lang.String r0 = "effectiveDirectAddress"
            java.lang.reflect.Field r2 = r1.getDeclaredField(r0)     // Catch: java.lang.Throwable -> L15
            goto L16
        L15:
            r2 = 0
        L16:
            if (r2 == 0) goto L19
            return r2
        L19:
            java.lang.Class<java.nio.Buffer> r1 = java.nio.Buffer.class
            java.lang.String r0 = "address"
            java.lang.reflect.Field r2 = r1.getDeclaredField(r0)     // Catch: java.lang.Throwable -> L22
            goto L23
        L22:
            r2 = 0
        L23:
            if (r2 == 0) goto L2e
            java.lang.Class r1 = r2.getType()
            java.lang.Class r0 = java.lang.Long.TYPE
            if (r1 != r0) goto L2e
            return r2
        L2e:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63388Sj4.A02():java.lang.reflect.Field");
    }

    public static Unsafe A03() {
        try {
            return (Unsafe) AccessController.doPrivileged(new TS5());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void A04(Object obj, long j, Object obj2) {
        A01.A0C(obj, j, obj2);
    }

    public static void A05(Throwable th) {
        AbstractC58319PtB.A17(C63388Sj4.class).log(Level.WARNING, AbstractC167017dG.A0n(th, "platform method missing - proto runtime falling back to safer methods: ", AbstractC166987dD.A1C()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0009, code lost:
    
        if (X.S97.A01 != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean A06(java.lang.Class r8) {
        /*
            java.lang.Class<byte[]> r4 = byte[].class
            java.lang.Class r0 = X.S97.A00
            if (r0 == 0) goto Lb
            boolean r1 = X.S97.A01
            r0 = 1
            if (r1 == 0) goto Lc
        Lb:
            r0 = 0
        Lc:
            r7 = 0
            if (r0 != 0) goto L10
            return r7
        L10:
            java.lang.Class r3 = X.C63388Sj4.A08     // Catch: java.lang.Throwable -> L64
            java.lang.String r1 = "peekLong"
            java.lang.Class r6 = java.lang.Boolean.TYPE     // Catch: java.lang.Throwable -> L64
            r5 = 1
            java.lang.Class[] r0 = new java.lang.Class[]{r8, r6}     // Catch: java.lang.Throwable -> L64
            r3.getMethod(r1, r0)     // Catch: java.lang.Throwable -> L64
            java.lang.String r1 = "pokeLong"
            java.lang.Class r0 = java.lang.Long.TYPE     // Catch: java.lang.Throwable -> L64
            java.lang.Class[] r0 = new java.lang.Class[]{r8, r0, r6}     // Catch: java.lang.Throwable -> L64
            r3.getMethod(r1, r0)     // Catch: java.lang.Throwable -> L64
            java.lang.String r1 = "pokeInt"
            java.lang.Class r2 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> L64
            java.lang.Class[] r0 = new java.lang.Class[]{r8, r2, r6}     // Catch: java.lang.Throwable -> L64
            r3.getMethod(r1, r0)     // Catch: java.lang.Throwable -> L64
            java.lang.String r1 = "peekInt"
            java.lang.Class[] r0 = new java.lang.Class[]{r8, r6}     // Catch: java.lang.Throwable -> L64
            r3.getMethod(r1, r0)     // Catch: java.lang.Throwable -> L64
            java.lang.String r1 = "pokeByte"
            java.lang.Class r0 = java.lang.Byte.TYPE     // Catch: java.lang.Throwable -> L64
            java.lang.Class[] r0 = new java.lang.Class[]{r8, r0}     // Catch: java.lang.Throwable -> L64
            r3.getMethod(r1, r0)     // Catch: java.lang.Throwable -> L64
            java.lang.String r1 = "peekByte"
            java.lang.Class[] r0 = new java.lang.Class[]{r8}     // Catch: java.lang.Throwable -> L64
            r3.getMethod(r1, r0)     // Catch: java.lang.Throwable -> L64
            java.lang.String r1 = "pokeByteArray"
            java.lang.Class[] r0 = new java.lang.Class[]{r8, r4, r2, r2}     // Catch: java.lang.Throwable -> L64
            r3.getMethod(r1, r0)     // Catch: java.lang.Throwable -> L64
            java.lang.String r1 = "peekByteArray"
            java.lang.Class[] r0 = new java.lang.Class[]{r8, r4, r2, r2}     // Catch: java.lang.Throwable -> L64
            r3.getMethod(r1, r0)     // Catch: java.lang.Throwable -> L64
            return r5
        L64:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63388Sj4.A06(java.lang.Class):boolean");
    }
}
