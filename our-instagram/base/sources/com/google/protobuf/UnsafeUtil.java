package com.google.protobuf;

import X.AbstractC166987dD;
import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.AbstractC58319PtB;
import X.AbstractC63034Sb9;
import X.RYs;
import X.RYt;
import X.RYu;
import X.S92;
import X.TS4;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import sun.misc.Unsafe;

/* loaded from: classes10.dex */
public final class UnsafeUtil {
    public static final long A00;
    public static final long A01;
    public static final AbstractC63034Sb9 A02;
    public static final Unsafe A03 = A04();
    public static final boolean A04;
    public static final boolean A05;
    public static final boolean A06;
    public static final boolean A07;
    public static final boolean A08;
    public static final Class A09;

    static {
        boolean A0K;
        boolean A0J;
        long j;
        Class cls = S92.A00;
        A09 = cls;
        A07 = A09(Long.TYPE);
        boolean A092 = A09(Integer.TYPE);
        A06 = A092;
        Unsafe unsafe = A03;
        AbstractC63034Sb9 abstractC63034Sb9 = null;
        if (unsafe != null) {
            if (cls != null && !S92.A01) {
                if (A07) {
                    abstractC63034Sb9 = new RYt(unsafe);
                } else if (A092) {
                    abstractC63034Sb9 = new RYs(unsafe);
                }
            } else {
                abstractC63034Sb9 = new RYu(unsafe);
            }
        }
        A02 = abstractC63034Sb9;
        if (abstractC63034Sb9 == null) {
            A0K = false;
        } else {
            A0K = abstractC63034Sb9.A0K();
        }
        A05 = A0K;
        AbstractC63034Sb9 abstractC63034Sb92 = A02;
        if (abstractC63034Sb92 == null) {
            A0J = false;
        } else {
            A0J = abstractC63034Sb92.A0J();
        }
        A04 = A0J;
        A01 = A01(byte[].class);
        A01(boolean[].class);
        boolean z = A04;
        if (z) {
            abstractC63034Sb92.A0A(boolean[].class);
        }
        A01(int[].class);
        if (z) {
            abstractC63034Sb92.A0A(int[].class);
        }
        A01(long[].class);
        if (z) {
            abstractC63034Sb92.A0A(long[].class);
        }
        A01(float[].class);
        if (z) {
            abstractC63034Sb92.A0A(float[].class);
        }
        A01(double[].class);
        if (z) {
            abstractC63034Sb92.A0A(double[].class);
        }
        A01(Object[].class);
        if (z) {
            abstractC63034Sb92.A0A(Object[].class);
        }
        java.lang.reflect.Field A032 = A03();
        if (A032 != null && abstractC63034Sb92 != null) {
            j = abstractC63034Sb92.A08(A032);
        } else {
            j = -1;
        }
        A00 = j;
        A08 = AbstractC167007dF.A1X(ByteOrder.nativeOrder(), ByteOrder.BIG_ENDIAN);
    }

    public static byte A00(byte[] bArr, long j) {
        return A02.A02(bArr, A01 + j);
    }

    public static int A01(Class cls) {
        if (A04) {
            return A02.A05(cls);
        }
        return -1;
    }

    public static Object A02(Class cls) {
        try {
            return A03.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0007, code lost:
    
        if (X.S92.A01 != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.reflect.Field A03() {
        /*
            java.lang.Class r0 = X.S92.A00
            if (r0 == 0) goto L9
            boolean r1 = X.S92.A01
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.UnsafeUtil.A03():java.lang.reflect.Field");
    }

    public static Unsafe A04() {
        try {
            return (Unsafe) AccessController.doPrivileged(new TS4());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void A05(Object obj, long j, int i) {
        A02.A0E(obj, j, i);
    }

    public static void A06(Object obj, long j, Object obj2) {
        A02.A0G(obj, j, obj2);
    }

    public static void A07(Throwable th) {
        AbstractC58319PtB.A17(UnsafeUtil.class).log(Level.WARNING, AbstractC167017dG.A0n(th, "platform method missing - proto runtime falling back to safer methods: ", AbstractC166987dD.A1C()));
    }

    public static void A08(byte[] bArr, byte b, long j) {
        A02.A0B(bArr, A01 + j, b);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0009, code lost:
    
        if (X.S92.A01 != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean A09(java.lang.Class r8) {
        /*
            java.lang.Class<byte[]> r4 = byte[].class
            java.lang.Class r0 = X.S92.A00
            if (r0 == 0) goto Lb
            boolean r1 = X.S92.A01
            r0 = 1
            if (r1 == 0) goto Lc
        Lb:
            r0 = 0
        Lc:
            r7 = 0
            if (r0 != 0) goto L10
            return r7
        L10:
            java.lang.Class r3 = com.google.protobuf.UnsafeUtil.A09     // Catch: java.lang.Throwable -> L64
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.UnsafeUtil.A09(java.lang.Class):boolean");
    }
}
