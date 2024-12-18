package X;

/* renamed from: X.9gT, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C215539gT extends AbstractC192138fE {
    public final Throwable A00;
    public final C193028gi A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C215539gT) {
                C215539gT c215539gT = (C215539gT) obj;
                if (!C14360o3.A0K(this.A00, c215539gT.A00) || !C14360o3.A0K(this.A01, c215539gT.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A01, AbstractC166987dD.A0G(this.A00));
    }

    public C215539gT(C193028gi c193028gi, Throwable th) {
        super(c193028gi);
        this.A00 = th;
        this.A01 = c193028gi;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("Failure(exception=");
        A1C.append(this.A00);
        A1C.append(", fetchSummaryData=");
        return AbstractC167017dG.A0o(this.A01, A1C);
    }
}
