package androidx.compose.ui.focus;

import X.AbstractC166987dD;
import X.AbstractC167017dG;
import X.C14360o3;
import X.C25338BJh;
import X.C58J;
import X.C58N;
import X.C5E9;

/* loaded from: classes5.dex */
public final class FocusRequesterElement extends C58N {
    public final C25338BJh A00;

    @Override // X.C58N
    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof FocusRequesterElement) && C14360o3.A0K(this.A00, ((FocusRequesterElement) obj).A00));
    }

    @Override // X.C58N
    public final int hashCode() {
        return this.A00.hashCode();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.58J, X.5E9] */
    @Override // X.C58N
    public final /* bridge */ /* synthetic */ C58J A00() {
        C25338BJh c25338BJh = this.A00;
        ?? c58j = new C58J();
        c58j.A00 = c25338BJh;
        return c58j;
    }

    @Override // X.C58N
    public final /* bridge */ /* synthetic */ void A01(C58J c58j) {
        C5E9 c5e9 = (C5E9) c58j;
        c5e9.A00.A00.A0B(c5e9);
        C25338BJh c25338BJh = this.A00;
        c5e9.A00 = c25338BJh;
        c25338BJh.A00.A09(c5e9);
    }

    public FocusRequesterElement(C25338BJh c25338BJh) {
        this.A00 = c25338BJh;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("FocusRequesterElement(focusRequester=");
        return AbstractC167017dG.A0o(this.A00, A1C);
    }
}
