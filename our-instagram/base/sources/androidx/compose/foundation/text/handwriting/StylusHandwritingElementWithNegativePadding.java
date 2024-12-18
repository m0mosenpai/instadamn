package androidx.compose.foundation.text.handwriting;

import X.AbstractC166987dD;
import X.AbstractC167017dG;
import X.C14360o3;
import X.C25779BaI;
import X.C58J;
import X.C58N;
import X.InterfaceC16820sZ;

/* loaded from: classes5.dex */
public final class StylusHandwritingElementWithNegativePadding extends C58N {
    public final InterfaceC16820sZ A00;

    @Override // X.C58N
    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof StylusHandwritingElementWithNegativePadding) && C14360o3.A0K(this.A00, ((StylusHandwritingElementWithNegativePadding) obj).A00));
    }

    @Override // X.C58N
    public final int hashCode() {
        return this.A00.hashCode();
    }

    @Override // X.C58N
    public final /* bridge */ /* synthetic */ C58J A00() {
        return new C25779BaI(this.A00);
    }

    @Override // X.C58N
    public final /* bridge */ /* synthetic */ void A01(C58J c58j) {
        ((C25779BaI) c58j).A00 = this.A00;
    }

    public StylusHandwritingElementWithNegativePadding(InterfaceC16820sZ interfaceC16820sZ) {
        this.A00 = interfaceC16820sZ;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("StylusHandwritingElementWithNegativePadding(onHandwritingSlopExceeded=");
        return AbstractC167017dG.A0o(this.A00, A1C);
    }
}
