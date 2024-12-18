package X;

import com.google.protobuf.UnsafeUtil;
import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* renamed from: X.Sb9, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC63034Sb9 {
    public Unsafe A00;

    public static Object A00(Object obj, long j) {
        return UnsafeUtil.A02.A00.getObject(obj, j);
    }

    public byte A01(long j) {
        boolean z = this instanceof RYt;
        throw AbstractC43592JPx.A11();
    }

    public byte A02(Object obj, long j) {
        boolean z = this instanceof RYt;
        boolean z2 = UnsafeUtil.A08;
        int i = UnsafeUtil.A02.A00.getInt(obj, (-4) & j);
        if (z) {
            if (z2) {
                return AbstractC58323PtF.A00(i, j ^ (-1));
            }
            return AbstractC58323PtF.A00(i, j);
        }
        if (z2) {
            return AbstractC58323PtF.A00(i, j ^ (-1));
        }
        return AbstractC58323PtF.A00(i, j);
    }

    public double A03(Object obj, long j) {
        return Double.longBitsToDouble(this.A00.getLong(obj, j));
    }

    public float A04(Object obj, long j) {
        return Float.intBitsToFloat(this.A00.getInt(obj, j));
    }

    public final int A05(Class cls) {
        return this.A00.arrayBaseOffset(cls);
    }

    public final int A06(Object obj, long j) {
        return this.A00.getInt(obj, j);
    }

    public final long A07(Object obj, long j) {
        return this.A00.getLong(obj, j);
    }

    public final long A08(Field field) {
        return this.A00.objectFieldOffset(field);
    }

    public final Object A09(Object obj, long j) {
        return this.A00.getObject(obj, j);
    }

    public final void A0A(Class cls) {
        this.A00.arrayIndexScale(cls);
    }

    public void A0B(Object obj, long j, byte b) {
        boolean z = UnsafeUtil.A08;
        long j2 = (-4) & j;
        int A06 = UnsafeUtil.A02.A06(obj, j2);
        int i = (int) j;
        if (z) {
            UnsafeUtil.A05(obj, j2, AbstractC58321PtD.A07(i ^ (-1), A06, b));
        } else {
            UnsafeUtil.A05(obj, j2, AbstractC58321PtD.A07(i, A06, b));
        }
    }

    public final void A0E(Object obj, long j, int i) {
        this.A00.putInt(obj, j, i);
    }

    public final void A0F(Object obj, long j, long j2) {
        this.A00.putLong(obj, j, j2);
    }

    public final void A0G(Object obj, long j, Object obj2) {
        this.A00.putObject(obj, j, obj2);
    }

    public void A0H(Object obj, long j, boolean z) {
        boolean z2 = UnsafeUtil.A08;
        byte b = z ? (byte) 1 : (byte) 0;
        long j2 = (-4) & j;
        int A06 = UnsafeUtil.A02.A06(obj, j2);
        int i = (int) j;
        if (z2) {
            UnsafeUtil.A05(obj, j2, AbstractC58321PtD.A07(i ^ (-1), A06, b));
        } else {
            UnsafeUtil.A05(obj, j2, AbstractC58321PtD.A07(i, A06, b));
        }
    }

    public void A0I(byte[] bArr, long j, long j2, long j3) {
        boolean z = this instanceof RYt;
        throw AbstractC43592JPx.A11();
    }

    public boolean A0J() {
        try {
            Class<?> cls = this.A00.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            cls.getMethod("arrayBaseOffset", Class.class);
            cls.getMethod("arrayIndexScale", Class.class);
            Class cls2 = Long.TYPE;
            cls.getMethod("getInt", Object.class, cls2);
            cls.getMethod("putInt", Object.class, cls2, Integer.TYPE);
            cls.getMethod("getLong", Object.class, cls2);
            cls.getMethod("putLong", Object.class, cls2, cls2);
            cls.getMethod("getObject", Object.class, cls2);
            cls.getMethod("putObject", Object.class, cls2, Object.class);
            return true;
        } catch (Throwable th) {
            UnsafeUtil.A07(th);
            return false;
        }
    }

    public boolean A0K() {
        try {
            Class<?> cls = this.A00.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            cls.getMethod("getLong", Object.class, Long.TYPE);
            if (UnsafeUtil.A03() == null) {
                return false;
            }
            return true;
        } catch (Throwable th) {
            UnsafeUtil.A07(th);
            return false;
        }
    }

    public boolean A0L(Object obj, long j) {
        byte A00;
        byte A002;
        boolean z = this instanceof RYt;
        boolean z2 = UnsafeUtil.A08;
        int i = UnsafeUtil.A02.A00.getInt(obj, (-4) & j);
        if (z) {
            if (z2) {
                A002 = AbstractC58323PtF.A00(i, j ^ (-1));
            } else {
                A002 = AbstractC58323PtF.A00(i, j);
            }
            return AbstractC167007dF.A1M(A002);
        }
        if (z2) {
            A00 = AbstractC58323PtF.A00(i, j ^ (-1));
        } else {
            A00 = AbstractC58323PtF.A00(i, j);
        }
        return AbstractC167007dF.A1M(A00);
    }

    public AbstractC63034Sb9(Unsafe unsafe) {
        this.A00 = unsafe;
    }

    public void A0C(Object obj, long j, double d) {
        A0F(obj, j, Double.doubleToLongBits(d));
    }

    public void A0D(Object obj, long j, float f) {
        A0E(obj, j, Float.floatToIntBits(f));
    }
}
