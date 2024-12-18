package X;

/* renamed from: X.RTl, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C60800RTl extends RT9 {
    public final int A00;
    public final int A01;
    public final SYC A02;
    public final SY9 A03;

    public final int A01() {
        SY9 sy9 = this.A03;
        if (sy9 == SY9.A03) {
            return this.A01;
        }
        if (sy9 != SY9.A04 && sy9 != SY9.A01 && sy9 != SY9.A02) {
            throw AbstractC166987dD.A14("Unknown variant");
        }
        return this.A01 + 5;
    }

    public final boolean equals(Object o) {
        if (!(o instanceof C60800RTl)) {
            return false;
        }
        C60800RTl c60800RTl = (C60800RTl) o;
        if (c60800RTl.A00 != this.A00 || c60800RTl.A01() != A01() || c60800RTl.A03 != this.A03 || c60800RTl.A02 != this.A02) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC58322PtE.A09(C60800RTl.class, Integer.valueOf(this.A00), Integer.valueOf(this.A01), this.A03, this.A02);
    }

    public C60800RTl(SYC keySizeBytes, SY9 tagSizeBytes, int variant, int hashType) {
        this.A00 = variant;
        this.A01 = hashType;
        this.A03 = tagSizeBytes;
        this.A02 = keySizeBytes;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("HMAC Parameters (variant: ");
        A1C.append(this.A03);
        A1C.append(", hashType: ");
        AbstractC58322PtE.A1R(A1C, this.A02);
        A1C.append(this.A01);
        A1C.append("-byte tags, and ");
        A1C.append(this.A00);
        return AbstractC166997dE.A0x("-byte key)", A1C);
    }
}
