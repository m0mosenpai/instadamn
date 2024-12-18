package androidx.compose.foundation.layout;

import X.AbstractC72509XfO;
import X.C58N;

/* loaded from: classes3.dex */
public final class FillElement extends C58N {
    public final float A00;
    public final Integer A01;

    @Override // X.C58N
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FillElement) {
                FillElement fillElement = (FillElement) obj;
                if (this.A01 != fillElement.A01 || this.A00 != fillElement.A00) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.C58N
    public final int hashCode() {
        return (AbstractC72509XfO.A00(this.A01) * 31) + Float.floatToIntBits(this.A00);
    }

    public FillElement(Integer num, float f) {
        this.A01 = num;
        this.A00 = f;
    }
}
