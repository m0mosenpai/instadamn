package X;

/* renamed from: X.PzG, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58643PzG extends AbstractC61517Ros {
    public final int A00;
    public final long A01;

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof AbstractC61517Ros) {
                C58643PzG c58643PzG = (C58643PzG) ((AbstractC61517Ros) obj);
                if (this.A00 != c58643PzG.A00 || this.A01 != c58643PzG.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = this.A00 ^ 1000003;
        long j = this.A01;
        return (i * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        int i = this.A00;
        long j = this.A01;
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("EventRecord{eventType=");
        A1C.append(i);
        A1C.append(", eventTimestamp=");
        A1C.append(j);
        return AbstractC166997dE.A0x("}", A1C);
    }

    public C58643PzG(int i, long j) {
        this.A00 = i;
        this.A01 = j;
    }
}
