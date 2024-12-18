package androidx.compose.ui.input.key;

import X.C14360o3;
import X.C58N;
import X.InterfaceC16660sJ;

/* loaded from: classes3.dex */
public final class KeyInputElement extends C58N {
    public final InterfaceC16660sJ A00;
    public final InterfaceC16660sJ A01;

    @Override // X.C58N
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof KeyInputElement) {
                KeyInputElement keyInputElement = (KeyInputElement) obj;
                if (!C14360o3.A0K(this.A00, keyInputElement.A00) || !C14360o3.A0K(this.A01, keyInputElement.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.C58N
    public final int hashCode() {
        InterfaceC16660sJ interfaceC16660sJ = this.A00;
        int hashCode = (interfaceC16660sJ == null ? 0 : interfaceC16660sJ.hashCode()) * 31;
        InterfaceC16660sJ interfaceC16660sJ2 = this.A01;
        return hashCode + (interfaceC16660sJ2 != null ? interfaceC16660sJ2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("KeyInputElement(onKeyEvent=");
        sb.append(this.A00);
        sb.append(", onPreKeyEvent=");
        sb.append(this.A01);
        sb.append(')');
        return sb.toString();
    }

    public KeyInputElement(InterfaceC16660sJ interfaceC16660sJ, InterfaceC16660sJ interfaceC16660sJ2) {
        this.A00 = interfaceC16660sJ;
        this.A01 = interfaceC16660sJ2;
    }
}
