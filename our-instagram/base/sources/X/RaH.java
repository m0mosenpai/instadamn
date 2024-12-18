package X;

import sun.misc.Unsafe;

/* loaded from: classes10.dex */
public final class RaH extends SQH {
    @Override // X.SQH
    public final byte A00(Object obj, long j) {
        return this.A00.getByte(obj, j);
    }

    @Override // X.SQH
    public final double A01(Object obj, long j) {
        return this.A00.getDouble(obj, j);
    }

    @Override // X.SQH
    public final float A02(Object obj, long j) {
        return this.A00.getFloat(obj, j);
    }

    @Override // X.SQH
    public final void A08(Object obj, long j, double d) {
        this.A00.putDouble(obj, j, d);
    }

    @Override // X.SQH
    public final void A09(Object obj, long j, float f) {
        this.A00.putFloat(obj, j, f);
    }

    @Override // X.SQH
    public final void A0D(Object obj, long j, boolean z) {
        this.A00.putBoolean(obj, j, z);
    }

    @Override // X.SQH
    public final boolean A0G() {
        if (!super.A0G()) {
            return false;
        }
        try {
            Class<?> cls = this.A00.getClass();
            Class cls2 = Long.TYPE;
            cls.getMethod("getByte", cls2);
            cls.getMethod("putByte", cls2, Byte.TYPE);
            cls.getMethod("getInt", cls2);
            cls.getMethod("putInt", cls2, Integer.TYPE);
            cls.getMethod("getLong", cls2);
            cls.getMethod("putLong", cls2, cls2);
            cls.getMethod("copyMemory", cls2, cls2, cls2);
            cls.getMethod("copyMemory", Object.class, cls2, Object.class, cls2, cls2);
            return true;
        } catch (Throwable th) {
            C63388Sj4.A05(th);
            return false;
        }
    }

    @Override // X.SQH
    public final boolean A0H(Object obj, long j) {
        return this.A00.getBoolean(obj, j);
    }

    public RaH(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // X.SQH
    public final boolean A0F() {
        if (!super.A0F()) {
            return false;
        }
        try {
            Class<?> cls = this.A00.getClass();
            Class cls2 = Long.TYPE;
            cls.getMethod("getByte", Object.class, cls2);
            cls.getMethod("putByte", Object.class, cls2, Byte.TYPE);
            cls.getMethod("getBoolean", Object.class, cls2);
            cls.getMethod("putBoolean", Object.class, cls2, Boolean.TYPE);
            cls.getMethod("getFloat", Object.class, cls2);
            cls.getMethod("putFloat", Object.class, cls2, Float.TYPE);
            cls.getMethod("getDouble", Object.class, cls2);
            cls.getMethod("putDouble", Object.class, cls2, Double.TYPE);
            return true;
        } catch (Throwable th) {
            C63388Sj4.A05(th);
            return false;
        }
    }
}
