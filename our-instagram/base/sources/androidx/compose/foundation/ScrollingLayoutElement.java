package androidx.compose.foundation;

import X.AbstractC166987dD;
import X.AbstractC53644Nnp;
import X.C14360o3;
import X.C25749BZo;
import X.C28729CmL;
import X.C58J;
import X.C58N;

/* loaded from: classes5.dex */
public final class ScrollingLayoutElement extends C58N {
    public final C28729CmL A00;
    public final boolean A01;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.58J, X.BZo] */
    @Override // X.C58N
    public final /* bridge */ /* synthetic */ C58J A00() {
        C28729CmL c28729CmL = this.A00;
        boolean z = this.A01;
        ?? c58j = new C58J();
        c58j.A00 = c28729CmL;
        c58j.A01 = z;
        return c58j;
    }

    @Override // X.C58N
    public final /* bridge */ /* synthetic */ void A01(C58J c58j) {
        C25749BZo c25749BZo = (C25749BZo) c58j;
        c25749BZo.A00 = this.A00;
        c25749BZo.A01 = this.A01;
    }

    @Override // X.C58N
    public final boolean equals(Object obj) {
        if (!(obj instanceof ScrollingLayoutElement)) {
            return false;
        }
        ScrollingLayoutElement scrollingLayoutElement = (ScrollingLayoutElement) obj;
        if (!C14360o3.A0K(this.A00, scrollingLayoutElement.A00) || this.A01 != scrollingLayoutElement.A01) {
            return false;
        }
        return true;
    }

    @Override // X.C58N
    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A01, (AbstractC166987dD.A0G(this.A00) + AbstractC53644Nnp.A00()) * 31);
    }

    public ScrollingLayoutElement(C28729CmL c28729CmL, boolean z) {
        this.A00 = c28729CmL;
        this.A01 = z;
    }
}
