package androidx.compose.ui.layout;

import X.C14360o3;
import X.C58N;
import X.InterfaceC16610sE;

/* loaded from: classes3.dex */
public final class LayoutElement extends C58N {
    public final InterfaceC16610sE A00;

    @Override // X.C58N
    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof LayoutElement) && C14360o3.A0K(this.A00, ((LayoutElement) obj).A00));
    }

    @Override // X.C58N
    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("LayoutElement(measure=");
        sb.append(this.A00);
        sb.append(')');
        return sb.toString();
    }

    public LayoutElement(InterfaceC16610sE interfaceC16610sE) {
        this.A00 = interfaceC16610sE;
    }
}
