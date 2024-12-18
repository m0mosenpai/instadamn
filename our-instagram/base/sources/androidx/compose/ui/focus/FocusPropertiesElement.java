package androidx.compose.ui.focus;

import X.C14360o3;
import X.C58N;
import X.InterfaceC1130058j;

/* loaded from: classes3.dex */
public final class FocusPropertiesElement extends C58N {
    public final InterfaceC1130058j A00;

    @Override // X.C58N
    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof FocusPropertiesElement) && C14360o3.A0K(this.A00, ((FocusPropertiesElement) obj).A00));
    }

    @Override // X.C58N
    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FocusPropertiesElement(scope=");
        sb.append(this.A00);
        sb.append(')');
        return sb.toString();
    }

    public FocusPropertiesElement(InterfaceC1130058j interfaceC1130058j) {
        this.A00 = interfaceC1130058j;
    }
}
