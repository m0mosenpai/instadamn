package androidx.compose.foundation;

import X.C14360o3;
import X.C58N;
import X.C5XO;

/* loaded from: classes3.dex */
public final class FocusableElement extends C58N {
    public final C5XO A00;

    @Override // X.C58N
    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof FocusableElement) && C14360o3.A0K(this.A00, ((FocusableElement) obj).A00));
    }

    @Override // X.C58N
    public final int hashCode() {
        C5XO c5xo = this.A00;
        if (c5xo != null) {
            return c5xo.hashCode();
        }
        return 0;
    }

    public FocusableElement(C5XO c5xo) {
        this.A00 = c5xo;
    }
}
