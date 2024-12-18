package X;

import java.util.Arrays;

/* loaded from: classes10.dex */
public final class RTQ extends RT7 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final SYA A04;
    public final C62930SXx A05;

    public final boolean equals(Object o) {
        if (!(o instanceof RTQ)) {
            return false;
        }
        RTQ rtq = (RTQ) o;
        if (rtq.A00 != this.A00 || rtq.A01 != this.A01 || rtq.A02 != this.A02 || rtq.A03 != this.A03 || rtq.A05 != this.A05 || rtq.A04 != this.A04) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{RTQ.class, Integer.valueOf(this.A00), Integer.valueOf(this.A01), Integer.valueOf(this.A02), Integer.valueOf(this.A03), this.A05, this.A04});
    }

    public RTQ(SYA aesKeySizeBytes, C62930SXx hmacKeySizeBytes, int ivSizeBytes, int tagSizeBytes, int variant, int hashType) {
        this.A00 = ivSizeBytes;
        this.A01 = tagSizeBytes;
        this.A02 = variant;
        this.A03 = hashType;
        this.A05 = hmacKeySizeBytes;
        this.A04 = aesKeySizeBytes;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("AesCtrHmacAead Parameters (variant: ");
        A1C.append(this.A05);
        A1C.append(", hashType: ");
        AbstractC58322PtE.A1R(A1C, this.A04);
        A1C.append(this.A02);
        A1C.append("-byte IV, and ");
        A1C.append(this.A03);
        A1C.append("-byte tags, and ");
        A1C.append(this.A00);
        A1C.append("-byte AES key, and ");
        A1C.append(this.A01);
        return AbstractC166997dE.A0x("-byte HMAC key)", A1C);
    }
}
