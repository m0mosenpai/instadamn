package androidx.compose.foundation.lazy.layout;

import X.C14360o3;
import X.C58N;
import X.C6MH;

/* loaded from: classes3.dex */
public final class TraversablePrefetchStateModifierElement extends C58N {
    public final C6MH A00;

    @Override // X.C58N
    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof TraversablePrefetchStateModifierElement) && C14360o3.A0K(this.A00, ((TraversablePrefetchStateModifierElement) obj).A00));
    }

    @Override // X.C58N
    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TraversablePrefetchStateModifierElement(prefetchState=");
        sb.append(this.A00);
        sb.append(')');
        return sb.toString();
    }

    public TraversablePrefetchStateModifierElement(C6MH c6mh) {
        this.A00 = c6mh;
    }
}
