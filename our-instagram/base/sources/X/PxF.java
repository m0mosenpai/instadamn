package X;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* loaded from: classes10.dex */
public abstract class PxF {
    public Unsafe A00;

    public static Object A00(Object obj, long j) {
        return C58546PxE.A01.A00.getObject(obj, j);
    }

    public byte A01(Object target, long offset) {
        boolean z = this instanceof RVI;
        boolean z2 = C58546PxE.A07;
        int i = C58546PxE.A01.A00.getInt(target, (-4) & offset);
        if (z) {
            if (z2) {
                return AbstractC58323PtF.A00(i, offset ^ (-1));
            }
            return AbstractC58323PtF.A00(i, offset);
        }
        if (z2) {
            return AbstractC58323PtF.A00(i, offset ^ (-1));
        }
        return AbstractC58323PtF.A00(i, offset);
    }

    public double A02(Object target, long offset) {
        return Double.longBitsToDouble(this.A00.getLong(target, offset));
    }

    public float A03(Object target, long offset) {
        return Float.intBitsToFloat(this.A00.getInt(target, offset));
    }

    public final int A04(Class clazz) {
        return this.A00.arrayBaseOffset(clazz);
    }

    public final int A05(Object target, long offset) {
        return this.A00.getInt(target, offset);
    }

    public final long A06(Object target, long offset) {
        return this.A00.getLong(target, offset);
    }

    public final Object A07(Object target, long offset) {
        return this.A00.getObject(target, offset);
    }

    public final void A08(Class clazz) {
        this.A00.arrayIndexScale(clazz);
    }

    public void A09(Object target, long offset, byte value) {
        boolean z = C58546PxE.A07;
        long j = (-4) & offset;
        int A05 = C58546PxE.A01.A05(target, j);
        int i = (int) offset;
        if (z) {
            C58546PxE.A04(target, j, AbstractC58321PtD.A07(i ^ (-1), A05, value));
        } else {
            C58546PxE.A04(target, j, AbstractC58321PtD.A07(i, A05, value));
        }
    }

    public final void A0C(Object target, long offset, int value) {
        this.A00.putInt(target, offset, value);
    }

    public final void A0D(Object target, long offset, long value) {
        this.A00.putLong(target, offset, value);
    }

    public final void A0E(Object target, long offset, Object value) {
        this.A00.putObject(target, offset, value);
    }

    public void A0F(Object obj, long j, boolean z) {
        boolean z2 = C58546PxE.A07;
        byte b = z ? (byte) 1 : (byte) 0;
        long j2 = (-4) & j;
        int A05 = C58546PxE.A01.A05(obj, j2);
        int i = (int) j;
        if (z2) {
            C58546PxE.A04(obj, j2, AbstractC58321PtD.A07(i ^ (-1), A05, b));
        } else {
            C58546PxE.A04(obj, j2, AbstractC58321PtD.A07(i, A05, b));
        }
    }

    public final void A0G(Field field) {
        this.A00.objectFieldOffset(field);
    }

    public boolean A0H() {
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
            C58546PxE.A06(th);
            return false;
        }
    }

    public boolean A0I() {
        try {
            Class<?> cls = this.A00.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            cls.getMethod("getLong", Object.class, Long.TYPE);
            if (C58546PxE.A02() == null) {
                return false;
            }
            return true;
        } catch (Throwable th) {
            C58546PxE.A06(th);
            return false;
        }
    }

    public boolean A0J(Object target, long offset) {
        byte A00;
        byte A002;
        boolean z = this instanceof RVI;
        boolean z2 = C58546PxE.A07;
        int i = C58546PxE.A01.A00.getInt(target, (-4) & offset);
        if (z) {
            if (z2) {
                A002 = AbstractC58323PtF.A00(i, offset ^ (-1));
            } else {
                A002 = AbstractC58323PtF.A00(i, offset);
            }
            return AbstractC167007dF.A1M(A002);
        }
        if (z2) {
            A00 = AbstractC58323PtF.A00(i, offset ^ (-1));
        } else {
            A00 = AbstractC58323PtF.A00(i, offset);
        }
        return AbstractC167007dF.A1M(A00);
    }

    public PxF(Unsafe unsafe) {
        this.A00 = unsafe;
    }

    public void A0A(Object target, long offset, double value) {
        A0D(target, offset, Double.doubleToLongBits(value));
    }

    public void A0B(Object target, long offset, float value) {
        A0C(target, offset, Float.floatToIntBits(value));
    }
}
