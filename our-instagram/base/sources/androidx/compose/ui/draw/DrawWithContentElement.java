package androidx.compose.ui.draw;

import X.C14360o3;
import X.C58N;
import X.InterfaceC16660sJ;

/* loaded from: classes3.dex */
public final class DrawWithContentElement extends C58N {
    public final InterfaceC16660sJ A00;

    @Override // X.C58N
    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof DrawWithContentElement) && C14360o3.A0K(this.A00, ((DrawWithContentElement) obj).A00));
    }

    @Override // X.C58N
    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DrawWithContentElement(onDraw=");
        sb.append(this.A00);
        sb.append(')');
        return sb.toString();
    }

    public DrawWithContentElement(InterfaceC16660sJ interfaceC16660sJ) {
        this.A00 = interfaceC16660sJ;
    }
}
