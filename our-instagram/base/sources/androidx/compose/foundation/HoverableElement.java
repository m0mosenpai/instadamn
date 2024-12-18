package androidx.compose.foundation;

import X.C14360o3;
import X.C58N;
import X.C5XO;

/* loaded from: classes3.dex */
public final class HoverableElement extends C58N {
    public final C5XO A00;

    @Override // X.C58N
    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof HoverableElement) && C14360o3.A0K(((HoverableElement) obj).A00, this.A00));
    }

    @Override // X.C58N
    public final int hashCode() {
        return this.A00.hashCode() * 31;
    }

    public HoverableElement(C5XO c5xo) {
        this.A00 = c5xo;
    }
}
