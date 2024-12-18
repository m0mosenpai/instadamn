package X;

import com.google.protobuf.UnsafeUtil;
import sun.misc.Unsafe;

/* loaded from: classes10.dex */
public final class RYu extends AbstractC63034Sb9 {
    @Override // X.AbstractC63034Sb9
    public final byte A01(long j) {
        return this.A00.getByte(j);
    }

    @Override // X.AbstractC63034Sb9
    public final byte A02(Object obj, long j) {
        return this.A00.getByte(obj, j);
    }

    @Override // X.AbstractC63034Sb9
    public final double A03(Object obj, long j) {
        return this.A00.getDouble(obj, j);
    }

    @Override // X.AbstractC63034Sb9
    public final float A04(Object obj, long j) {
        return this.A00.getFloat(obj, j);
    }

    @Override // X.AbstractC63034Sb9
    public final void A0B(Object obj, long j, byte b) {
        this.A00.putByte(obj, j, b);
    }

    @Override // X.AbstractC63034Sb9
    public final void A0C(Object obj, long j, double d) {
        this.A00.putDouble(obj, j, d);
    }

    @Override // X.AbstractC63034Sb9
    public final void A0D(Object obj, long j, float f) {
        this.A00.putFloat(obj, j, f);
    }

    @Override // X.AbstractC63034Sb9
    public final void A0H(Object obj, long j, boolean z) {
        this.A00.putBoolean(obj, j, z);
    }

    @Override // X.AbstractC63034Sb9
    public final void A0I(byte[] bArr, long j, long j2, long j3) {
        this.A00.copyMemory((Object) null, j, bArr, UnsafeUtil.A01, j3);
    }

    @Override // X.AbstractC63034Sb9
    public final boolean A0K() {
        if (!super.A0K()) {
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
            UnsafeUtil.A07(th);
            return false;
        }
    }

    @Override // X.AbstractC63034Sb9
    public final boolean A0L(Object obj, long j) {
        return this.A00.getBoolean(obj, j);
    }

    public RYu(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // X.AbstractC63034Sb9
    public final boolean A0J() {
        if (!super.A0J()) {
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
            UnsafeUtil.A07(th);
            return false;
        }
    }
}
