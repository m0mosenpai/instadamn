package androidx.compose.foundation.layout;

import X.C14360o3;
import X.C58N;
import X.InterfaceC118245Wl;

/* loaded from: classes3.dex */
public final class HorizontalAlignElement extends C58N {
    public final InterfaceC118245Wl A00;

    @Override // X.C58N
    public final boolean equals(Object obj) {
        HorizontalAlignElement horizontalAlignElement;
        if (this == obj) {
            return true;
        }
        if ((obj instanceof HorizontalAlignElement) && (horizontalAlignElement = (HorizontalAlignElement) obj) != null) {
            return C14360o3.A0K(this.A00, horizontalAlignElement.A00);
        }
        return false;
    }

    @Override // X.C58N
    public final int hashCode() {
        return this.A00.hashCode();
    }

    public HorizontalAlignElement(InterfaceC118245Wl interfaceC118245Wl) {
        this.A00 = interfaceC118245Wl;
    }
}
