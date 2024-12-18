package androidx.compose.foundation.lazy.layout;

import X.C14360o3;
import X.C58N;
import X.C6IO;

/* loaded from: classes3.dex */
public final class LazyLayoutItemAnimator$DisplayingDisappearingItemsElement extends C58N {
    public final C6IO A00;

    @Override // X.C58N
    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof LazyLayoutItemAnimator$DisplayingDisappearingItemsElement) && C14360o3.A0K(this.A00, ((LazyLayoutItemAnimator$DisplayingDisappearingItemsElement) obj).A00));
    }

    @Override // X.C58N
    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DisplayingDisappearingItemsElement(animator=");
        sb.append(this.A00);
        sb.append(')');
        return sb.toString();
    }

    public LazyLayoutItemAnimator$DisplayingDisappearingItemsElement(C6IO c6io) {
        this.A00 = c6io;
    }
}
