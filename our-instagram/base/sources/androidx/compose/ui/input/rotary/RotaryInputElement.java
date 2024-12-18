package androidx.compose.ui.input.rotary;

import X.C14360o3;
import X.C58N;
import X.InterfaceC16660sJ;

/* loaded from: classes3.dex */
public final class RotaryInputElement extends C58N {
    public final InterfaceC16660sJ A00;

    @Override // X.C58N
    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof RotaryInputElement) && C14360o3.A0K(this.A00, ((RotaryInputElement) obj).A00));
    }

    @Override // X.C58N
    public final int hashCode() {
        InterfaceC16660sJ interfaceC16660sJ = this.A00;
        return (interfaceC16660sJ == null ? 0 : interfaceC16660sJ.hashCode()) * 31;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("RotaryInputElement(onRotaryScrollEvent=");
        sb.append(this.A00);
        sb.append(", onPreRotaryScrollEvent=");
        sb.append((Object) null);
        sb.append(')');
        return sb.toString();
    }

    public RotaryInputElement(InterfaceC16660sJ interfaceC16660sJ) {
        this.A00 = interfaceC16660sJ;
    }
}
