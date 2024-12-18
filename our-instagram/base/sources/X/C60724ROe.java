package X;

import sun.misc.Unsafe;

/* renamed from: X.ROe, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C60724ROe extends SQ6 {
    @Override // X.SQ6
    public final double A00(Object obj, long j) {
        return Double.longBitsToDouble(this.A00.getLong(obj, j));
    }

    @Override // X.SQ6
    public final float A01(Object obj, long j) {
        return Float.intBitsToFloat(this.A00.getInt(obj, j));
    }

    @Override // X.SQ6
    public final void A02(Object obj, long j, byte b) {
        if (C63409Sjj.A01) {
            C63409Sjj.A0B(obj, j, b);
        } else {
            C63409Sjj.A0C(obj, j, b);
        }
    }

    @Override // X.SQ6
    public final void A05(Object obj, long j, boolean z) {
        if (C63409Sjj.A01) {
            C63409Sjj.A0B(obj, j, r3 ? (byte) 1 : (byte) 0);
        } else {
            C63409Sjj.A0C(obj, j, r3 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // X.SQ6
    public final boolean A06(Object obj, long j) {
        boolean A1M;
        boolean A1M2;
        if (!C63409Sjj.A01) {
            A1M = AbstractC167007dF.A1M(AbstractC58323PtF.A00(C63409Sjj.A02.A00.getInt(obj, (-4) & j), j));
            return A1M;
        }
        A1M2 = AbstractC167007dF.A1M(AbstractC58323PtF.A00(C63409Sjj.A02.A00.getInt(obj, (-4) & j), j ^ (-1)));
        return A1M2;
    }

    public C60724ROe(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // X.SQ6
    public final void A03(Object obj, long j, double d) {
        this.A00.putLong(obj, j, Double.doubleToLongBits(d));
    }

    @Override // X.SQ6
    public final void A04(Object obj, long j, float f) {
        this.A00.putInt(obj, j, Float.floatToIntBits(f));
    }
}
