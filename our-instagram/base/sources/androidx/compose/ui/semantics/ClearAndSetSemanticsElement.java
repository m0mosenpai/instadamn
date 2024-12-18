package androidx.compose.ui.semantics;

import X.AbstractC166987dD;
import X.AbstractC167017dG;
import X.C113505An;
import X.C14360o3;
import X.C58J;
import X.C58N;
import X.C5Zv;
import X.InterfaceC118625Ya;
import X.InterfaceC16660sJ;

/* loaded from: classes5.dex */
public final class ClearAndSetSemanticsElement extends C58N implements InterfaceC118625Ya {
    public final InterfaceC16660sJ A00;

    @Override // X.C58N
    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof ClearAndSetSemanticsElement) && C14360o3.A0K(this.A00, ((ClearAndSetSemanticsElement) obj).A00));
    }

    @Override // X.C58N
    public final int hashCode() {
        return this.A00.hashCode();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.5Zv, X.58J] */
    @Override // X.C58N
    public final /* bridge */ /* synthetic */ C58J A00() {
        InterfaceC16660sJ interfaceC16660sJ = this.A00;
        ?? c58j = new C58J();
        c58j.A02 = false;
        c58j.A01 = true;
        c58j.A00 = interfaceC16660sJ;
        return c58j;
    }

    @Override // X.C58N
    public final /* bridge */ /* synthetic */ void A01(C58J c58j) {
        ((C5Zv) c58j).A00 = this.A00;
    }

    @Override // X.InterfaceC118625Ya
    public final C113505An Bt8() {
        C113505An c113505An = new C113505An();
        c113505An.A01 = false;
        c113505An.A00 = true;
        this.A00.invoke(c113505An);
        return c113505An;
    }

    public ClearAndSetSemanticsElement(InterfaceC16660sJ interfaceC16660sJ) {
        this.A00 = interfaceC16660sJ;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("ClearAndSetSemanticsElement(properties=");
        return AbstractC167017dG.A0o(this.A00, A1C);
    }
}
