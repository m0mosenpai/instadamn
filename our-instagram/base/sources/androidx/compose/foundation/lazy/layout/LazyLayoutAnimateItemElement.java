package androidx.compose.foundation.lazy.layout;

import X.AbstractC166987dD;
import X.AbstractC167017dG;
import X.AbstractC25235BEs;
import X.C137056Ij;
import X.C14360o3;
import X.C58J;
import X.C58N;
import X.C5Y5;

/* loaded from: classes5.dex */
public final class LazyLayoutAnimateItemElement extends C58N {
    public final C5Y5 A00;

    @Override // X.C58N
    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof LazyLayoutAnimateItemElement) && C14360o3.A0K(this.A00, ((LazyLayoutAnimateItemElement) obj).A00));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.58J, X.6Ij] */
    @Override // X.C58N
    public final /* bridge */ /* synthetic */ C58J A00() {
        C5Y5 c5y5 = this.A00;
        ?? c58j = new C58J();
        c58j.A00 = c5y5;
        return c58j;
    }

    @Override // X.C58N
    public final /* bridge */ /* synthetic */ void A01(C58J c58j) {
        ((C137056Ij) c58j).A00 = this.A00;
    }

    @Override // X.C58N
    public final int hashCode() {
        return AbstractC167017dG.A0M(this.A00) * 31;
    }

    public LazyLayoutAnimateItemElement(C5Y5 c5y5) {
        this.A00 = c5y5;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        AbstractC25235BEs.A1L(A1C, "LazyLayoutAnimateItemElement(fadeInSpec=");
        A1C.append(", placementSpec=");
        A1C.append(this.A00);
        A1C.append(", fadeOutSpec=");
        return AbstractC167017dG.A0o(null, A1C);
    }
}
