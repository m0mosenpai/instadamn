package androidx.compose.foundation.layout;

import X.C119145aW;
import X.C58N;
import X.InterfaceC16660sJ;

/* loaded from: classes3.dex */
public final class PaddingElement extends C58N {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public boolean A04 = true;
    public final InterfaceC16660sJ A05;

    public PaddingElement(InterfaceC16660sJ interfaceC16660sJ, float f, float f2, float f3, float f4) {
        this.A02 = f;
        this.A03 = f2;
        this.A01 = f3;
        this.A00 = f4;
        this.A05 = interfaceC16660sJ;
        if ((f >= 0.0f || C119145aW.A01(f, Float.NaN)) && ((f2 >= 0.0f || C119145aW.A01(f2, Float.NaN)) && ((f3 >= 0.0f || C119145aW.A01(f3, Float.NaN)) && (f4 >= 0.0f || C119145aW.A01(f4, Float.NaN))))) {
        } else {
            throw new IllegalArgumentException("Padding must be non-negative");
        }
    }

    @Override // X.C58N
    public final boolean equals(Object obj) {
        PaddingElement paddingElement;
        if (obj instanceof PaddingElement) {
            paddingElement = (PaddingElement) obj;
        } else {
            paddingElement = null;
        }
        if (paddingElement == null || !C119145aW.A01(this.A02, paddingElement.A02) || !C119145aW.A01(this.A03, paddingElement.A03) || !C119145aW.A01(this.A01, paddingElement.A01) || !C119145aW.A01(this.A00, paddingElement.A00) || this.A04 != paddingElement.A04) {
            return false;
        }
        return true;
    }

    @Override // X.C58N
    public final int hashCode() {
        int floatToIntBits = ((((((Float.floatToIntBits(this.A02) * 31) + Float.floatToIntBits(this.A03)) * 31) + Float.floatToIntBits(this.A01)) * 31) + Float.floatToIntBits(this.A00)) * 31;
        int i = 1237;
        if (this.A04) {
            i = 1231;
        }
        return floatToIntBits + i;
    }
}
