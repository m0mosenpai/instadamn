package X;

/* renamed from: X.JxA, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45080JxA extends C0T6 {
    public final QIz A00;
    public final boolean A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45080JxA) {
                C45080JxA c45080JxA = (C45080JxA) obj;
                if (this.A01 != c45080JxA.A01 || !C14360o3.A0K(this.A00, c45080JxA.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC25225BEi.A08(this.A01) + AbstractC167017dG.A0M(this.A00);
    }

    public C45080JxA(QIz qIz, boolean z) {
        this.A01 = z;
        this.A00 = qIz;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("ViewState(isLoading=");
        A1C.append(this.A01);
        A1C.append(", promotionInformationData=");
        return AbstractC167017dG.A0o(this.A00, A1C);
    }
}
