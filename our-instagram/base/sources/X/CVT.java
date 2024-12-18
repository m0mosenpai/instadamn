package X;

/* loaded from: classes5.dex */
public final class CVT {
    public final int A00;
    public final C7D A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CVT) {
                CVT cvt = (CVT) obj;
                if (this.A00 != cvt.A00 || this.A01 != cvt.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A01, this.A00 * 31);
    }

    public CVT(C7D c7d, int i) {
        this.A00 = i;
        this.A01 = c7d;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("FeedbackBadOption(titleResId=");
        A1C.append(this.A00);
        A1C.append(", feedbackSource=");
        return AbstractC167017dG.A0o(this.A01, A1C);
    }
}
