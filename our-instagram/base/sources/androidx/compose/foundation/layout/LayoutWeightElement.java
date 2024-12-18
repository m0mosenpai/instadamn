package androidx.compose.foundation.layout;

import X.C58N;

/* loaded from: classes3.dex */
public final class LayoutWeightElement extends C58N {
    public final float A00;
    public final boolean A01;

    @Override // X.C58N
    public final boolean equals(Object obj) {
        LayoutWeightElement layoutWeightElement;
        if (this == obj) {
            return true;
        }
        if (obj instanceof LayoutWeightElement) {
            layoutWeightElement = (LayoutWeightElement) obj;
        } else {
            layoutWeightElement = null;
        }
        return layoutWeightElement != null && this.A00 == layoutWeightElement.A00 && this.A01 == layoutWeightElement.A01;
    }

    @Override // X.C58N
    public final int hashCode() {
        int floatToIntBits = Float.floatToIntBits(this.A00) * 31;
        int i = 1237;
        if (this.A01) {
            i = 1231;
        }
        return floatToIntBits + i;
    }

    public LayoutWeightElement(boolean z, float f) {
        this.A00 = f;
        this.A01 = z;
    }
}
