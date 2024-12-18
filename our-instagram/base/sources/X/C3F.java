package X;

/* loaded from: classes5.dex */
public final class C3F extends AbstractC27453C9v {
    public final long A00;
    public final long A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C3F) {
                C3F c3f = (C3F) obj;
                if (this.A01 != c3f.A01 || this.A00 != c3f.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A03 = AbstractC25227BEk.A03(this.A01);
        long j = this.A00;
        return A03 + ((int) (j ^ (j >>> 32)));
    }

    public C3F(long j, long j2) {
        this.A01 = j;
        this.A00 = j2;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("BaselineCap(capSpacing=");
        A1C.append((Object) C2Z3.A04(this.A01));
        A1C.append(", baselineSpacing=");
        return AbstractC167017dG.A0o(C2Z3.A04(this.A00), A1C);
    }
}
