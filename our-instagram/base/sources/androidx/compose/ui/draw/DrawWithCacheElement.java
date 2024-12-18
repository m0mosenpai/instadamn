package androidx.compose.ui.draw;

import X.AbstractC166987dD;
import X.AbstractC167017dG;
import X.C137576Ld;
import X.C14360o3;
import X.C58J;
import X.C58N;
import X.C6CI;
import X.InterfaceC16660sJ;

/* loaded from: classes5.dex */
public final class DrawWithCacheElement extends C58N {
    public final InterfaceC16660sJ A00;

    @Override // X.C58N
    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof DrawWithCacheElement) && C14360o3.A0K(this.A00, ((DrawWithCacheElement) obj).A00));
    }

    @Override // X.C58N
    public final int hashCode() {
        return this.A00.hashCode();
    }

    @Override // X.C58N
    public final /* bridge */ /* synthetic */ C58J A00() {
        return new C6CI(new C137576Ld(), this.A00);
    }

    @Override // X.C58N
    public final /* bridge */ /* synthetic */ void A01(C58J c58j) {
        C6CI c6ci = (C6CI) c58j;
        c6ci.A01 = this.A00;
        c6ci.COw();
    }

    public DrawWithCacheElement(InterfaceC16660sJ interfaceC16660sJ) {
        this.A00 = interfaceC16660sJ;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("DrawWithCacheElement(onBuildDrawCache=");
        return AbstractC167017dG.A0o(this.A00, A1C);
    }
}
