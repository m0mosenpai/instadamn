package X;

/* renamed from: X.BFb, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25242BFb {
    public final long A00;

    public static /* synthetic */ long A01(float f, float f2, int i, long j) {
        if ((i & 1) != 0) {
            f = AbstractC25231BEo.A00(j);
        }
        if ((i & 2) != 0) {
            f2 = Float.intBitsToFloat((int) (4294967295L & j));
        }
        return (Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L);
    }

    public static final long A02(long j, long j2) {
        float A01 = AbstractC25227BEk.A01(j) - AbstractC25227BEk.A01(j2);
        float intBitsToFloat = Float.intBitsToFloat((int) (j & 4294967295L)) - Float.intBitsToFloat((int) (j2 & 4294967295L));
        return (Float.floatToRawIntBits(A01) << 32) | (Float.floatToRawIntBits(intBitsToFloat) & 4294967295L);
    }

    public static final long A03(long j, long j2) {
        float A01 = AbstractC25227BEk.A01(j) + AbstractC25227BEk.A01(j2);
        float intBitsToFloat = Float.intBitsToFloat((int) (j & 4294967295L)) + Float.intBitsToFloat((int) (j2 & 4294967295L));
        return (Float.floatToRawIntBits(A01) << 32) | (Float.floatToRawIntBits(intBitsToFloat) & 4294967295L);
    }

    public final boolean equals(Object obj) {
        long j = this.A00;
        if (!(obj instanceof C25242BFb) || j != ((C25242BFb) obj).A00) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC25228BEl.A03(this.A00);
    }

    public final String toString() {
        long j = this.A00;
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append('(');
        A1C.append(AbstractC25231BEo.A00(j));
        A1C.append(", ");
        A1C.append(AbstractC25232BEp.A00(j));
        return AbstractC166997dE.A0x(") px/sec", A1C);
    }

    public static final float A00(long j) {
        return AbstractC25232BEp.A00(j);
    }
}
