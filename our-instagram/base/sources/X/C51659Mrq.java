package X;

import java.util.List;

/* renamed from: X.Mrq, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51659Mrq extends C0T6 {
    public final C51739MtM A00;
    public final List A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51659Mrq) {
                C51659Mrq c51659Mrq = (C51659Mrq) obj;
                if (!C14360o3.A0K(this.A00, c51659Mrq.A00) || !C14360o3.A0K(this.A01, c51659Mrq.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A01, AbstractC166987dD.A0G(this.A00));
    }

    public C51659Mrq(C51739MtM c51739MtM, List list) {
        AbstractC167017dG.A1P(c51739MtM, list);
        this.A00 = c51739MtM;
        this.A01 = list;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("Ctas(selectedCta=");
        A1C.append(this.A00);
        A1C.append(", availableCtas=");
        return AbstractC167017dG.A0o(this.A01, A1C);
    }
}
