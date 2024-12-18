package X;

/* loaded from: classes9.dex */
public final class OLQ {
    public final int A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof OLQ) && this.A00 == ((OLQ) obj).A00);
    }

    public final int hashCode() {
        return this.A00;
    }

    public final String toString() {
        return AbstractC25235BEs.A0q("ZeroBalanceDetectionHttpResponse(statusCode=", this.A00);
    }

    public OLQ(int i) {
        this.A00 = i;
    }
}
