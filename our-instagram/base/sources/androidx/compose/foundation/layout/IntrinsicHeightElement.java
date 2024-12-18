package androidx.compose.foundation.layout;

import X.C58N;
import X.InterfaceC16660sJ;

/* loaded from: classes3.dex */
public final class IntrinsicHeightElement extends C58N {
    public final Integer A00;
    public final boolean A01 = true;
    public final InterfaceC16660sJ A02;

    public IntrinsicHeightElement(Integer num, InterfaceC16660sJ interfaceC16660sJ) {
        this.A00 = num;
        this.A02 = interfaceC16660sJ;
    }

    @Override // X.C58N
    public final boolean equals(Object obj) {
        IntrinsicHeightElement intrinsicHeightElement;
        if (this == obj) {
            return true;
        }
        if (obj instanceof IntrinsicHeightElement) {
            intrinsicHeightElement = (IntrinsicHeightElement) obj;
        } else {
            intrinsicHeightElement = null;
        }
        return intrinsicHeightElement != null && this.A00 == intrinsicHeightElement.A00 && this.A01 == intrinsicHeightElement.A01;
    }

    @Override // X.C58N
    public final int hashCode() {
        String str;
        int intValue = this.A00.intValue();
        if (1 != intValue) {
            str = "Min";
        } else {
            str = "Max";
        }
        int hashCode = (str.hashCode() + intValue) * 31;
        int i = 1237;
        if (this.A01) {
            i = 1231;
        }
        return hashCode + i;
    }
}
