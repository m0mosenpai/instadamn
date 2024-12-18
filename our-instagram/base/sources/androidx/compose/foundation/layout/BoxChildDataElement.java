package androidx.compose.foundation.layout;

import X.C14360o3;
import X.C58N;
import X.InterfaceC16660sJ;
import androidx.compose.ui.Alignment;

/* loaded from: classes3.dex */
public final class BoxChildDataElement extends C58N {
    public final Alignment A00;
    public final boolean A01;
    public final InterfaceC16660sJ A02;

    @Override // X.C58N
    public final boolean equals(Object obj) {
        BoxChildDataElement boxChildDataElement;
        if (this == obj) {
            return true;
        }
        if (obj instanceof BoxChildDataElement) {
            boxChildDataElement = (BoxChildDataElement) obj;
        } else {
            boxChildDataElement = null;
        }
        return boxChildDataElement != null && C14360o3.A0K(this.A00, boxChildDataElement.A00) && this.A01 == boxChildDataElement.A01;
    }

    @Override // X.C58N
    public final int hashCode() {
        int hashCode = this.A00.hashCode() * 31;
        int i = 1237;
        if (this.A01) {
            i = 1231;
        }
        return hashCode + i;
    }

    public BoxChildDataElement(Alignment alignment, InterfaceC16660sJ interfaceC16660sJ, boolean z) {
        this.A00 = alignment;
        this.A01 = z;
        this.A02 = interfaceC16660sJ;
    }
}
