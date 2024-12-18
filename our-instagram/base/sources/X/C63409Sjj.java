package X;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import java.util.logging.Level;
import sun.misc.Unsafe;

/* renamed from: X.Sjj, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63409Sjj {
    public static final long A00;
    public static final boolean A01;
    public static final SQ6 A02;
    public static final Class A03;
    public static final Unsafe A04;
    public static final boolean A05;
    public static final boolean A06;

    public static boolean A0P() {
        return A06;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ff A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x010e  */
    static {
        /*
            Method dump skipped, instructions count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63409Sjj.<clinit>():void");
    }

    public static double A00(Object obj, long j) {
        return A02.A00(obj, j);
    }

    public static float A01(Object obj, long j) {
        return A02.A01(obj, j);
    }

    public static int A02(Class cls) {
        if (A06) {
            return A02.A00.arrayBaseOffset(cls);
        }
        return -1;
    }

    public static int A03(Object obj, long j) {
        return A02.A00.getInt(obj, j);
    }

    public static long A04(Object obj, long j) {
        return A02.A00.getLong(obj, j);
    }

    public static Object A05(Class cls) {
        try {
            return A04.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    public static Object A06(Object obj, long j) {
        return A02.A00.getObject(obj, j);
    }

    public static Field A07() {
        Field A08 = A08("effectiveDirectAddress");
        if (A08 != null || ((A08 = A08("address")) != null && A08.getType() == Long.TYPE)) {
            return A08;
        }
        return null;
    }

    public static Field A08(String str) {
        try {
            return Buffer.class.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Unsafe A09() {
        try {
            return (Unsafe) AccessController.doPrivileged(new TS2());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void A0A(Class cls) {
        if (A06) {
            A02.A00.arrayIndexScale(cls);
        }
    }

    public static void A0B(Object obj, long j, byte b) {
        Unsafe unsafe = A02.A00;
        long j2 = (-4) & j;
        unsafe.putInt(obj, j2, AbstractC58321PtD.A07(((int) j) ^ (-1), unsafe.getInt(obj, j2), b));
    }

    public static void A0C(Object obj, long j, byte b) {
        Unsafe unsafe = A02.A00;
        long j2 = (-4) & j;
        unsafe.putInt(obj, j2, AbstractC58321PtD.A07((int) j, unsafe.getInt(obj, j2), b));
    }

    public static void A0F(Object obj, long j, double d) {
        A02.A03(obj, j, d);
    }

    public static void A0G(Object obj, long j, float f) {
        A02.A04(obj, j, f);
    }

    public static void A0H(Object obj, long j, int i) {
        A02.A00.putInt(obj, j, i);
    }

    public static void A0I(Object obj, long j, long j2) {
        A02.A00.putLong(obj, j, j2);
    }

    public static void A0J(Object obj, long j, Object obj2) {
        A02.A00.putObject(obj, j, obj2);
    }

    public static void A0K(Object obj, long j, boolean z) {
        A02.A05(obj, j, z);
    }

    public static /* bridge */ /* synthetic */ void A0N(Throwable th) {
        AbstractC58319PtB.A17(C63409Sjj.class).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
    }

    public static void A0O(byte[] bArr, byte b, long j) {
        A02.A02(bArr, A00 + j, b);
    }

    public static boolean A0Q(Class cls) {
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

    public static boolean A0R(Object obj, long j) {
        return A02.A06(obj, j);
    }
}
