package X;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* loaded from: classes10.dex */
public abstract class SQH {
    public Unsafe A00;

    public byte A00(Object obj, long j) {
        boolean z = this instanceof RaG;
        boolean z2 = C63388Sj4.A07;
        int i = C63388Sj4.A01.A00.getInt(obj, (-4) & j);
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

    public double A01(Object obj, long j) {
        return Double.longBitsToDouble(this.A00.getLong(obj, j));
    }

    public float A02(Object obj, long j) {
        return Float.intBitsToFloat(this.A00.getInt(obj, j));
    }

    public final int A03(Class cls) {
        return this.A00.arrayBaseOffset(cls);
    }

    public final int A04(Object obj, long j) {
        return this.A00.getInt(obj, j);
    }

    public final long A05(Object obj, long j) {
        return this.A00.getLong(obj, j);
    }

    public final Object A06(Object obj, long j) {
        return this.A00.getObject(obj, j);
    }

    public final void A07(Class cls) {
        this.A00.arrayIndexScale(cls);
    }

    public final void A0A(Object obj, long j, int i) {
        this.A00.putInt(obj, j, i);
    }

    public final void A0B(Object obj, long j, long j2) {
        this.A00.putLong(obj, j, j2);
    }

    public final void A0C(Object obj, long j, Object obj2) {
        this.A00.putObject(obj, j, obj2);
    }

    public void A0D(Object obj, long j, boolean z) {
        boolean z2 = this instanceof RaG;
        boolean z3 = C63388Sj4.A07;
        byte b = z ? (byte) 1 : (byte) 0;
        long j2 = (-4) & j;
        SQH sqh = C63388Sj4.A01;
        int i = sqh.A00.getInt(obj, j2);
        int i2 = (int) j;
        if (z2) {
            if (z3) {
                sqh.A0A(obj, j2, AbstractC58321PtD.A07(i2 ^ (-1), i, b));
                return;
            } else {
                sqh.A0A(obj, j2, AbstractC58321PtD.A07(i2, i, b));
                return;
            }
        }
        if (z3) {
            sqh.A0A(obj, j2, AbstractC58321PtD.A07(i2 ^ (-1), i, b));
        } else {
            sqh.A0A(obj, j2, AbstractC58321PtD.A07(i2, i, b));
        }
    }

    public final void A0E(Field field) {
        this.A00.objectFieldOffset(field);
    }

    public boolean A0F() {
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
            C63388Sj4.A05(th);
            return false;
        }
    }

    public boolean A0G() {
        try {
            Class<?> cls = this.A00.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            cls.getMethod("getLong", Object.class, Long.TYPE);
            if (C63388Sj4.A02() == null) {
                return false;
            }
            return true;
        } catch (Throwable th) {
            C63388Sj4.A05(th);
            return false;
        }
    }

    public boolean A0H(Object obj, long j) {
        byte A00;
        byte A002;
        boolean z = this instanceof RaG;
        boolean z2 = C63388Sj4.A07;
        int i = C63388Sj4.A01.A00.getInt(obj, (-4) & j);
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

    public SQH(Unsafe unsafe) {
        this.A00 = unsafe;
    }

    public void A08(Object obj, long j, double d) {
        A0B(obj, j, Double.doubleToLongBits(d));
    }

    public void A09(Object obj, long j, float f) {
        A0A(obj, j, Float.floatToIntBits(f));
    }
}
