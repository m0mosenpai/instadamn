package X;

import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;

/* renamed from: X.Sja, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63405Sja {
    public static final SPW A00;
    public static final boolean A01;
    public static final boolean A02;
    public static final Class A03;
    public static final Unsafe A04;

    /* JADX WARN: Code restructure failed: missing block: B:14:0x005c, code lost:
    
        if (java.nio.Buffer.class.getDeclaredField("effectiveDirectAddress") == null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0134, code lost:
    
        if (r1 == null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0142, code lost:
    
        if (r1.getType() == r5) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0144, code lost:
    
        if (r1 == null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0146, code lost:
    
        if (r9 == null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0148, code lost:
    
        r9.A00.objectFieldOffset(r1);
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0155  */
    static {
        /*
            Method dump skipped, instructions count: 345
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63405Sja.<clinit>():void");
    }

    public static int A00(Object obj, long j) {
        return A00.A00.getInt(obj, j);
    }

    public static long A01(Object obj, long j) {
        return A00.A00.getLong(obj, j);
    }

    public static Object A02(Object obj, long j) {
        return A00.A00.getObject(obj, j);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.security.PrivilegedExceptionAction] */
    public static Unsafe A03() {
        try {
            return (Unsafe) AccessController.doPrivileged((PrivilegedExceptionAction) new Object());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void A04(Class cls) {
        try {
            A04.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    public static void A05(Class cls) {
        if (A02) {
            A00.A00.arrayBaseOffset(cls);
        }
    }

    public static void A06(Class cls) {
        if (A02) {
            A00.A00.arrayIndexScale(cls);
        }
    }

    public static void A07(Object obj, long j, int i) {
        A00.A00.putInt(obj, j, i);
    }

    public static void A08(Object obj, long j, long j2) {
        A00.A00.putLong(obj, j, j2);
    }

    public static void A09(Object obj, long j, Object obj2) {
        A00.A00.putObject(obj, j, obj2);
    }

    public static /* synthetic */ void A0A(Object obj, long j, boolean z) {
        Unsafe unsafe = A00.A00;
        long j2 = (-4) & j;
        int i = ((((int) j) ^ (-1)) & 3) << 3;
        unsafe.putInt(obj, j2, ((z ? 1 : 0) << i) | (((255 << i) ^ (-1)) & unsafe.getInt(obj, j2)));
    }

    public static /* synthetic */ void A0B(Object obj, long j, boolean z) {
        Unsafe unsafe = A00.A00;
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        unsafe.putInt(obj, j2, ((z ? 1 : 0) << i) | (((255 << i) ^ (-1)) & unsafe.getInt(obj, j2)));
    }

    public static boolean A0C(Class cls) {
        try {
            Class cls2 = A03;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }
}
