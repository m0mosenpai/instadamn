package androidx.compose.foundation.layout;

import X.AbstractC122975hY;
import X.C14360o3;
import X.C25755BZu;
import X.C58J;
import X.C58N;

/* loaded from: classes5.dex */
public final class WithAlignmentLineElement extends C58N {
    public final AbstractC122975hY A00;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.BZu, X.58J] */
    @Override // X.C58N
    public final /* bridge */ /* synthetic */ C58J A00() {
        AbstractC122975hY abstractC122975hY = this.A00;
        ?? c58j = new C58J();
        c58j.A00 = abstractC122975hY;
        return c58j;
    }

    @Override // X.C58N
    public final /* bridge */ /* synthetic */ void A01(C58J c58j) {
        ((C25755BZu) c58j).A00 = this.A00;
    }

    @Override // X.C58N
    public final boolean equals(Object obj) {
        WithAlignmentLineElement withAlignmentLineElement;
        if (this == obj) {
            return true;
        }
        if ((obj instanceof WithAlignmentLineElement) && (withAlignmentLineElement = (WithAlignmentLineElement) obj) != null) {
            return C14360o3.A0K(this.A00, withAlignmentLineElement.A00);
        }
        return false;
    }

    @Override // X.C58N
    public final int hashCode() {
        return this.A00.hashCode();
    }

    public WithAlignmentLineElement(AbstractC122975hY abstractC122975hY) {
        this.A00 = abstractC122975hY;
    }
}
