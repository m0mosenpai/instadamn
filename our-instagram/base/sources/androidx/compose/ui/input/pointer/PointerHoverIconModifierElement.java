package androidx.compose.ui.input.pointer;

import X.AbstractC166987dD;
import X.AbstractC25236BEt;
import X.AbstractC53644Nnp;
import X.BFZ;
import X.BXI;
import X.C14360o3;
import X.C58J;
import X.C58N;
import X.C5ES;
import X.DRU;

/* loaded from: classes5.dex */
public final class PointerHoverIconModifierElement extends C58N {
    public final C5ES A00;

    @Override // X.C58N
    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof PointerHoverIconModifierElement) && C14360o3.A0K(this.A00, ((PointerHoverIconModifierElement) obj).A00));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.BXI, X.58J] */
    @Override // X.C58N
    public final /* bridge */ /* synthetic */ C58J A00() {
        C5ES c5es = this.A00;
        ?? c58j = new C58J();
        c58j.A00 = c5es;
        return c58j;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [X.0oO, java.lang.Object] */
    @Override // X.C58N
    public final /* bridge */ /* synthetic */ void A01(C58J c58j) {
        BXI bxi = (BXI) c58j;
        C5ES c5es = this.A00;
        if (!C14360o3.A0K(bxi.A00, c5es)) {
            bxi.A00 = c5es;
            if (bxi.A01) {
                ?? obj = new Object();
                obj.A00 = true;
                BFZ.A03(bxi, DRU.A00(obj, 28));
                if (obj.A00) {
                    BXI.A01(bxi);
                }
            }
        }
    }

    @Override // X.C58N
    public final int hashCode() {
        return AbstractC166987dD.A0G(this.A00) + AbstractC53644Nnp.A00();
    }

    public PointerHoverIconModifierElement(C5ES c5es) {
        this.A00 = c5es;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("PointerHoverIconModifierElement(icon=");
        A1C.append(this.A00);
        A1C.append(", overrideDescendants=");
        return AbstractC25236BEt.A0a(A1C, false);
    }
}
