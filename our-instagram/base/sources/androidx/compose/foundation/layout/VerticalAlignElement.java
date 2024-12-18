package androidx.compose.foundation.layout;

import X.C14360o3;
import X.C58N;
import X.InterfaceC118225Wj;

/* loaded from: classes3.dex */
public final class VerticalAlignElement extends C58N {
    public final InterfaceC118225Wj A00;

    @Override // X.C58N
    public final boolean equals(Object obj) {
        VerticalAlignElement verticalAlignElement;
        if (this == obj) {
            return true;
        }
        if ((obj instanceof VerticalAlignElement) && (verticalAlignElement = (VerticalAlignElement) obj) != null) {
            return C14360o3.A0K(this.A00, verticalAlignElement.A00);
        }
        return false;
    }

    @Override // X.C58N
    public final int hashCode() {
        return this.A00.hashCode();
    }

    public VerticalAlignElement(InterfaceC118225Wj interfaceC118225Wj) {
        this.A00 = interfaceC118225Wj;
    }
}
