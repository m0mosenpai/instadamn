package androidx.compose.ui.layout;

import X.C58N;
import X.InterfaceC16660sJ;

/* loaded from: classes3.dex */
public final class OnGloballyPositionedElement extends C58N {
    public final InterfaceC16660sJ A00;

    @Override // X.C58N
    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof OnGloballyPositionedElement) && this.A00 == ((OnGloballyPositionedElement) obj).A00;
        }
        return true;
    }

    @Override // X.C58N
    public final int hashCode() {
        return this.A00.hashCode();
    }

    public OnGloballyPositionedElement(InterfaceC16660sJ interfaceC16660sJ) {
        this.A00 = interfaceC16660sJ;
    }
}
