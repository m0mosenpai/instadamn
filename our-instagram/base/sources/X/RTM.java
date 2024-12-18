package X;

/* loaded from: classes10.dex */
public final class RTM extends RT7 {
    public final int A00;
    public final SY0 A01;

    public final boolean equals(Object o) {
        if (!(o instanceof RTM)) {
            return false;
        }
        RTM rtm = (RTM) o;
        if (rtm.A00 != this.A00 || rtm.A01 != this.A01) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC58319PtB.A06(RTM.class, Integer.valueOf(this.A00), this.A01);
    }

    public RTM(SY0 keySizeBytes, int variant) {
        this.A00 = variant;
        this.A01 = keySizeBytes;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("AesGcmSiv Parameters (variant: ");
        AbstractC58322PtE.A1R(A1C, this.A01);
        A1C.append(this.A00);
        return AbstractC166997dE.A0x("-byte key)", A1C);
    }
}
