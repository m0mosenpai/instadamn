package X;

/* loaded from: classes10.dex */
public final class RF0 extends AbstractC61293RlD {
    public final long A00;
    public final long A01 = 86400000;
    public final java.util.Set A02;

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof AbstractC61293RlD)) {
                return false;
            }
            RF0 rf0 = (RF0) ((AbstractC61293RlD) obj);
            if (this.A00 != rf0.A00 || this.A01 != rf0.A01 || !this.A02.equals(rf0.A02)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        long j = this.A00;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        long j2 = this.A01;
        return this.A02.hashCode() ^ ((i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003);
    }

    public RF0(java.util.Set set, long j) {
        this.A00 = j;
        this.A02 = set;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("ConfigValue{delta=");
        A1C.append(this.A00);
        A1C.append(", maxAllowedDelay=");
        A1C.append(this.A01);
        A1C.append(", flags=");
        return JQ0.A0l(this.A02, A1C);
    }
}
