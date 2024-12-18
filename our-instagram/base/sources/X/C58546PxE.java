package X;

import java.lang.reflect.Field;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import sun.misc.Unsafe;

/* renamed from: X.PxE, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58546PxE {
    public static final long A00;
    public static final PxF A01;
    public static final Unsafe A02 = A03();
    public static final boolean A03;
    public static final boolean A04;
    public static final boolean A05;
    public static final boolean A06;
    public static final boolean A07;
    public static final Class A08;

    static {
        boolean A0I;
        boolean A0H;
        Class cls = AbstractC62372S8w.A00;
        A08 = cls;
        A06 = A08(Long.TYPE);
        boolean A082 = A08(Integer.TYPE);
        A05 = A082;
        Unsafe unsafe = A02;
        PxF pxF = null;
        if (unsafe != null) {
            if (cls != null && !AbstractC62372S8w.A01) {
                if (A06) {
                    pxF = new RVI(unsafe);
                } else if (A082) {
                    pxF = new RVH(unsafe);
                }
            } else {
                pxF = new RVJ(unsafe);
            }
        }
        A01 = pxF;
        if (pxF == null) {
            A0I = false;
        } else {
            A0I = pxF.A0I();
        }
        A04 = A0I;
        PxF pxF2 = A01;
        if (pxF2 == null) {
            A0H = false;
        } else {
            A0H = pxF2.A0H();
        }
        A03 = A0H;
        A00 = A00(byte[].class);
        A00(boolean[].class);
        boolean z = A03;
        if (z) {
            pxF2.A08(boolean[].class);
        }
        A00(int[].class);
        if (z) {
            pxF2.A08(int[].class);
        }
        A00(long[].class);
        if (z) {
            pxF2.A08(long[].class);
        }
        A00(float[].class);
        if (z) {
            pxF2.A08(float[].class);
        }
        A00(double[].class);
        if (z) {
            pxF2.A08(double[].class);
        }
        A00(Object[].class);
        if (z) {
            pxF2.A08(Object[].class);
        }
        Field A022 = A02();
        if (A022 != null && pxF2 != null) {
            pxF2.A0G(A022);
        }
        A07 = AbstractC167007dF.A1X(ByteOrder.nativeOrder(), ByteOrder.BIG_ENDIAN);
    }

    public static int A00(Class clazz) {
        if (A03) {
            return A01.A04(clazz);
        }
        return -1;
    }

    public static Object A01(Class clazz) {
        try {
            return A02.allocateInstance(clazz);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0007, code lost:
    
        if (X.AbstractC62372S8w.A01 != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.reflect.Field A02() {
        /*
            java.lang.Class r0 = X.AbstractC62372S8w.A00
            if (r0 == 0) goto L9
            boolean r1 = X.AbstractC62372S8w.A01
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
        throw new UnsupportedOperationException("Method not decompiled: X.C58546PxE.A02():java.lang.reflect.Field");
    }

    public static Unsafe A03() {
        try {
            return (Unsafe) AccessController.doPrivileged(new TS3());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void A04(Object target, long offset, int value) {
        A01.A0C(target, offset, value);
    }

    public static void A05(Object target, long offset, Object value) {
        A01.A0E(target, offset, value);
    }

    public static void A06(Throwable e) {
        AbstractC58319PtB.A17(C58546PxE.class).log(Level.WARNING, AbstractC167017dG.A0n(e, "platform method missing - proto runtime falling back to safer methods: ", AbstractC166987dD.A1C()));
    }

    public static void A07(byte[] target, byte index, long value) {
        A01.A09(target, A00 + value, index);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0009, code lost:
    
        if (X.AbstractC62372S8w.A01 != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean A08(java.lang.Class r8) {
        /*
            java.lang.Class<byte[]> r4 = byte[].class
            java.lang.Class r0 = X.AbstractC62372S8w.A00
            if (r0 == 0) goto Lb
            boolean r1 = X.AbstractC62372S8w.A01
            r0 = 1
            if (r1 == 0) goto Lc
        Lb:
            r0 = 0
        Lc:
            r7 = 0
            if (r0 != 0) goto L10
            return r7
        L10:
            java.lang.Class r3 = X.C58546PxE.A08     // Catch: java.lang.Throwable -> L64
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
        throw new UnsupportedOperationException("Method not decompiled: X.C58546PxE.A08(java.lang.Class):boolean");
    }
}
