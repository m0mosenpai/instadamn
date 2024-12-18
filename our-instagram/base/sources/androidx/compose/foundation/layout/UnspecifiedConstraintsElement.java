package androidx.compose.foundation.layout;

import X.C119145aW;
import X.C58N;

/* loaded from: classes3.dex */
public final class UnspecifiedConstraintsElement extends C58N {
    public final float A00;
    public final float A01;

    @Override // X.C58N
    public final boolean equals(Object obj) {
        if (!(obj instanceof UnspecifiedConstraintsElement)) {
            return false;
        }
        UnspecifiedConstraintsElement unspecifiedConstraintsElement = (UnspecifiedConstraintsElement) obj;
        if (!C119145aW.A01(this.A01, unspecifiedConstraintsElement.A01) || !C119145aW.A01(this.A00, unspecifiedConstraintsElement.A00)) {
            return false;
        }
        return true;
    }

    @Override // X.C58N
    public final int hashCode() {
        return (Float.floatToIntBits(this.A01) * 31) + Float.floatToIntBits(this.A00);
    }

    public UnspecifiedConstraintsElement(float f, float f2) {
        this.A01 = f;
        this.A00 = f2;
    }
}
