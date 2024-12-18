package androidx.compose.ui.layout;

import X.AbstractC166987dD;
import X.AbstractC167017dG;
import X.C14360o3;
import X.C25742BZf;
import X.C58J;
import X.C58N;

/* loaded from: classes5.dex */
public final class LayoutIdElement extends C58N {
    public final Object A00;

    @Override // X.C58N
    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof LayoutIdElement) && C14360o3.A0K(this.A00, ((LayoutIdElement) obj).A00));
    }

    @Override // X.C58N
    public final int hashCode() {
        return this.A00.hashCode();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.BZf, X.58J] */
    @Override // X.C58N
    public final /* bridge */ /* synthetic */ C58J A00() {
        Object obj = this.A00;
        ?? c58j = new C58J();
        c58j.A00 = obj;
        return c58j;
    }

    @Override // X.C58N
    public final /* bridge */ /* synthetic */ void A01(C58J c58j) {
        ((C25742BZf) c58j).A00 = this.A00;
    }

    public LayoutIdElement(Object obj) {
        this.A00 = obj;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("LayoutIdElement(layoutId=");
        return AbstractC167017dG.A0o(this.A00, A1C);
    }
}
