package androidx.compose.ui.layout;

import X.AbstractC119215ad;
import X.C25748BZm;
import X.C58J;
import X.C58N;
import X.InterfaceC16660sJ;

/* loaded from: classes5.dex */
public final class OnSizeChangedModifier extends C58N {
    public final InterfaceC16660sJ A00;

    @Override // X.C58N
    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof OnSizeChangedModifier) && this.A00 == ((OnSizeChangedModifier) obj).A00;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.BZm, X.58J] */
    @Override // X.C58N
    public final /* bridge */ /* synthetic */ C58J A00() {
        InterfaceC16660sJ interfaceC16660sJ = this.A00;
        ?? c58j = new C58J();
        c58j.A01 = interfaceC16660sJ;
        c58j.A00 = AbstractC119215ad.A00(Integer.MIN_VALUE, Integer.MIN_VALUE);
        return c58j;
    }

    @Override // X.C58N
    public final /* bridge */ /* synthetic */ void A01(C58J c58j) {
        C25748BZm c25748BZm = (C25748BZm) c58j;
        c25748BZm.A01 = this.A00;
        c25748BZm.A00 = AbstractC119215ad.A00(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    @Override // X.C58N
    public final int hashCode() {
        return this.A00.hashCode();
    }

    public OnSizeChangedModifier(InterfaceC16660sJ interfaceC16660sJ) {
        this.A00 = interfaceC16660sJ;
    }
}
