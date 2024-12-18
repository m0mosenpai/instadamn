package X;

/* renamed from: X.RTk, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C60799RTk extends RT9 {
    public final int A00;
    public final int A01;
    public final SY8 A02;

    public final int A01() {
        SY8 sy8 = this.A02;
        if (sy8 == SY8.A03) {
            return this.A01;
        }
        if (sy8 != SY8.A04 && sy8 != SY8.A01 && sy8 != SY8.A02) {
            throw AbstractC166987dD.A14("Unknown variant");
        }
        return this.A01 + 5;
    }

    public final boolean equals(Object o) {
        if (!(o instanceof C60799RTk)) {
            return false;
        }
        C60799RTk c60799RTk = (C60799RTk) o;
        if (c60799RTk.A00 != this.A00 || c60799RTk.A01() != A01() || c60799RTk.A02 != this.A02) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC58321PtD.A0C(C60799RTk.class, Integer.valueOf(this.A00), Integer.valueOf(this.A01), this.A02);
    }

    public C60799RTk(SY8 keySizeBytes, int tagSizeBytes, int variant) {
        this.A00 = tagSizeBytes;
        this.A01 = variant;
        this.A02 = keySizeBytes;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("AES-CMAC Parameters (variant: ");
        AbstractC58322PtE.A1R(A1C, this.A02);
        A1C.append(this.A01);
        A1C.append("-byte tags, and ");
        A1C.append(this.A00);
        return AbstractC166997dE.A0x("-byte key)", A1C);
    }
}
