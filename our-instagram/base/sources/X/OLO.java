package X;

/* loaded from: classes9.dex */
public final class OLO {
    public final int A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof OLO) && this.A00 == ((OLO) obj).A00);
    }

    public final int hashCode() {
        return this.A00;
    }

    public final String toString() {
        return AbstractC25235BEs.A0q("LoggingAnnotations(carrierId=", this.A00);
    }

    public OLO(int i) {
        this.A00 = i;
    }
}
