package X;

import sun.misc.Unsafe;

/* loaded from: classes10.dex */
public final class RVJ extends PxF {
    @Override // X.PxF
    public final byte A01(Object target, long offset) {
        return this.A00.getByte(target, offset);
    }

    @Override // X.PxF
    public final double A02(Object target, long offset) {
        return this.A00.getDouble(target, offset);
    }

    @Override // X.PxF
    public final float A03(Object target, long offset) {
        return this.A00.getFloat(target, offset);
    }

    @Override // X.PxF
    public final void A09(Object target, long offset, byte value) {
        this.A00.putByte(target, offset, value);
    }

    @Override // X.PxF
    public final void A0A(Object target, long offset, double value) {
        this.A00.putDouble(target, offset, value);
    }

    @Override // X.PxF
    public final void A0B(Object target, long offset, float value) {
        this.A00.putFloat(target, offset, value);
    }

    @Override // X.PxF
    public final void A0F(Object target, long offset, boolean value) {
        this.A00.putBoolean(target, offset, value);
    }

    @Override // X.PxF
    public final boolean A0I() {
        if (!super.A0I()) {
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
            C58546PxE.A06(th);
            return false;
        }
    }

    @Override // X.PxF
    public final boolean A0J(Object target, long offset) {
        return this.A00.getBoolean(target, offset);
    }

    public RVJ(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // X.PxF
    public final boolean A0H() {
        if (!super.A0H()) {
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
            C58546PxE.A06(th);
            return false;
        }
    }
}
