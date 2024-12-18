package X;

/* renamed from: X.PxX, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58556PxX extends RT8 {
    public final int A00;
    public final SY3 A01;

    public final boolean equals(Object o) {
        if (!(o instanceof C58556PxX)) {
            return false;
        }
        C58556PxX c58556PxX = (C58556PxX) o;
        if (c58556PxX.A00 != this.A00 || c58556PxX.A01 != this.A01) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC58319PtB.A06(C58556PxX.class, Integer.valueOf(this.A00), this.A01);
    }

    public C58556PxX(SY3 keySizeBytes, int variant) {
        this.A00 = variant;
        this.A01 = keySizeBytes;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("AesSiv Parameters (variant: ");
        AbstractC58322PtE.A1R(A1C, this.A01);
        A1C.append(this.A00);
        return AbstractC166997dE.A0x("-byte key)", A1C);
    }
}
