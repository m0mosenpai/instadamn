package androidx.compose.ui.focus;

import X.AbstractC166987dD;
import X.AbstractC167017dG;
import X.C14360o3;
import X.C25741BZd;
import X.C58J;
import X.C58N;
import X.InterfaceC16660sJ;

/* loaded from: classes5.dex */
public final class FocusChangedElement extends C58N {
    public final InterfaceC16660sJ A00;

    @Override // X.C58N
    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof FocusChangedElement) && C14360o3.A0K(this.A00, ((FocusChangedElement) obj).A00));
    }

    @Override // X.C58N
    public final int hashCode() {
        return this.A00.hashCode();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.BZd, X.58J] */
    @Override // X.C58N
    public final /* bridge */ /* synthetic */ C58J A00() {
        InterfaceC16660sJ interfaceC16660sJ = this.A00;
        ?? c58j = new C58J();
        c58j.A00 = interfaceC16660sJ;
        return c58j;
    }

    @Override // X.C58N
    public final /* bridge */ /* synthetic */ void A01(C58J c58j) {
        ((C25741BZd) c58j).A00 = this.A00;
    }

    public FocusChangedElement(InterfaceC16660sJ interfaceC16660sJ) {
        this.A00 = interfaceC16660sJ;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("FocusChangedElement(onFocusChanged=");
        return AbstractC167017dG.A0o(this.A00, A1C);
    }
}
