package X;

/* loaded from: classes10.dex */
public final class RF2 extends S70 {
    public final long A04 = 10485760;
    public final int A01 = 200;
    public final int A00 = 10000;
    public final long A03 = 604800000;
    public final int A02 = 81920;

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof S70)) {
                return false;
            }
            RF2 rf2 = (RF2) ((S70) obj);
            if (this.A04 != rf2.A04 || this.A01 != rf2.A01 || this.A00 != rf2.A00 || this.A03 != rf2.A03 || this.A02 != rf2.A02) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        long j = this.A04;
        int i = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.A01) * 1000003) ^ this.A00) * 1000003;
        long j2 = this.A03;
        return this.A02 ^ ((i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003);
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("EventStoreConfig{maxStorageSizeInBytes=");
        A1C.append(this.A04);
        A1C.append(", loadBatchSize=");
        A1C.append(this.A01);
        A1C.append(", criticalSectionEnterTimeoutMs=");
        A1C.append(this.A00);
        A1C.append(", eventCleanUpAge=");
        A1C.append(this.A03);
        A1C.append(", maxBlobByteSizePerRow=");
        A1C.append(this.A02);
        return AbstractC166997dE.A0x("}", A1C);
    }
}
