package X;

/* loaded from: classes10.dex */
public final class QIe extends C0T6 {
    public final long A00;
    public final Boolean A01;
    public final Long A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof QIe) {
                QIe qIe = (QIe) obj;
                if (!C14360o3.A0K(this.A01, qIe.A01) || !C14360o3.A0K(this.A02, qIe.A02) || this.A00 != qIe.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((AbstractC167017dG.A0M(this.A01) * 31) + AbstractC166997dE.A0I(this.A02)) * 31) + AbstractC25228BEl.A03(this.A00);
    }

    public QIe(Boolean bool, Long l, long j) {
        this.A01 = bool;
        this.A02 = l;
        this.A00 = j;
    }
}
