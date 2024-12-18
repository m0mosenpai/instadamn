package androidx.compose.foundation.layout;

import X.C119145aW;
import X.C58N;
import X.InterfaceC16660sJ;

/* loaded from: classes3.dex */
public final class OffsetElement extends C58N {
    public final float A00;
    public final float A01;
    public final boolean A02;
    public final InterfaceC16660sJ A03;

    @Override // X.C58N
    public final boolean equals(Object obj) {
        OffsetElement offsetElement;
        if (this == obj) {
            return true;
        }
        if (obj instanceof OffsetElement) {
            offsetElement = (OffsetElement) obj;
        } else {
            offsetElement = null;
        }
        return offsetElement != null && C119145aW.A01(this.A00, offsetElement.A00) && C119145aW.A01(this.A01, offsetElement.A01) && this.A02 == offsetElement.A02;
    }

    @Override // X.C58N
    public final int hashCode() {
        int floatToIntBits = ((Float.floatToIntBits(this.A00) * 31) + Float.floatToIntBits(this.A01)) * 31;
        int i = 1237;
        if (this.A02) {
            i = 1231;
        }
        return floatToIntBits + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("OffsetModifierElement(x=");
        sb.append((Object) C119145aW.A00(this.A00));
        sb.append(", y=");
        sb.append((Object) C119145aW.A00(this.A01));
        sb.append(", rtlAware=");
        sb.append(this.A02);
        sb.append(')');
        return sb.toString();
    }

    public OffsetElement(InterfaceC16660sJ interfaceC16660sJ, float f, float f2, boolean z) {
        this.A00 = f;
        this.A01 = f2;
        this.A02 = z;
        this.A03 = interfaceC16660sJ;
    }
}
