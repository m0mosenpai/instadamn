package androidx.compose.foundation.layout;

import X.C14360o3;
import X.C58N;
import X.InterfaceC1333460b;
import X.InterfaceC16660sJ;

/* loaded from: classes3.dex */
public final class PaddingValuesElement extends C58N {
    public final InterfaceC1333460b A00;
    public final InterfaceC16660sJ A01;

    @Override // X.C58N
    public final boolean equals(Object obj) {
        PaddingValuesElement paddingValuesElement;
        if ((obj instanceof PaddingValuesElement) && (paddingValuesElement = (PaddingValuesElement) obj) != null) {
            return C14360o3.A0K(this.A00, paddingValuesElement.A00);
        }
        return false;
    }

    @Override // X.C58N
    public final int hashCode() {
        return this.A00.hashCode();
    }

    public PaddingValuesElement(InterfaceC1333460b interfaceC1333460b, InterfaceC16660sJ interfaceC16660sJ) {
        this.A00 = interfaceC1333460b;
        this.A01 = interfaceC16660sJ;
    }
}
