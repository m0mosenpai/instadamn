package X;

/* loaded from: classes10.dex */
public final class QAG extends C50a {
    public final int A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof QAG) && this.A00 == ((QAG) obj).A00);
    }

    public final int hashCode() {
        return this.A00;
    }

    public final String toString() {
        return AnonymousClass001.A0I("ConstraintsNotMet(reason=", ')', this.A00);
    }

    public QAG(int i) {
        this.A00 = i;
    }
}
