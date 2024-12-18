package androidx.compose.foundation;

import X.AbstractC111324zv;
import X.AbstractC166987dD;
import X.AbstractC167007dF;
import X.AbstractC25225BEi;
import X.AbstractC25235BEs;
import X.AbstractC25236BEt;
import X.AbstractC53644Nnp;
import X.C14360o3;
import X.C25756BZv;
import X.C28729CmL;
import X.C58J;
import X.C58N;

/* loaded from: classes5.dex */
public final class ScrollSemanticsElement extends C58N {
    public final C28729CmL A00;
    public final boolean A01 = true;
    public final boolean A02;

    public ScrollSemanticsElement(C28729CmL c28729CmL, boolean z) {
        this.A00 = c28729CmL;
        this.A02 = z;
    }

    @Override // X.C58N
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ScrollSemanticsElement) {
                ScrollSemanticsElement scrollSemanticsElement = (ScrollSemanticsElement) obj;
                if (!C14360o3.A0K(this.A00, scrollSemanticsElement.A00) || this.A01 != scrollSemanticsElement.A01 || this.A02 != scrollSemanticsElement.A02) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.BZv, X.58J] */
    @Override // X.C58N
    public final /* bridge */ /* synthetic */ C58J A00() {
        C28729CmL c28729CmL = this.A00;
        boolean z = this.A02;
        ?? c58j = new C58J();
        c58j.A00 = c28729CmL;
        c58j.A01 = z;
        return c58j;
    }

    @Override // X.C58N
    public final /* bridge */ /* synthetic */ void A01(C58J c58j) {
        C25756BZv c25756BZv = (C25756BZv) c58j;
        c25756BZv.A00 = this.A00;
        c25756BZv.A01 = this.A02;
    }

    @Override // X.C58N
    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A02, AbstractC167007dF.A0D(this.A01, AbstractC25225BEi.A05(AbstractC166987dD.A0G(this.A00), AbstractC53644Nnp.A00())));
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("ScrollSemanticsElement(state=");
        A1C.append(this.A00);
        AbstractC25235BEs.A1M(A1C, AbstractC111324zv.A00(3436));
        AbstractC25235BEs.A1L(A1C, ", flingBehavior=");
        A1C.append(", isScrollable=");
        A1C.append(this.A01);
        A1C.append(", isVertical=");
        return AbstractC25236BEt.A0a(A1C, this.A02);
    }
}
