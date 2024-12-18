package androidx.compose.foundation;

import X.C119145aW;
import X.C14360o3;
import X.C58N;
import X.C5AH;
import X.C6L5;

/* loaded from: classes3.dex */
public final class BorderModifierNodeElement extends C58N {
    public final float A00;
    public final C6L5 A01;
    public final C5AH A02;

    @Override // X.C58N
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BorderModifierNodeElement) {
                BorderModifierNodeElement borderModifierNodeElement = (BorderModifierNodeElement) obj;
                if (!C119145aW.A01(this.A00, borderModifierNodeElement.A00) || !C14360o3.A0K(this.A01, borderModifierNodeElement.A01) || !C14360o3.A0K(this.A02, borderModifierNodeElement.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("BorderModifierNodeElement(width=");
        sb.append((Object) C119145aW.A00(this.A00));
        sb.append(", brush=");
        sb.append(this.A01);
        sb.append(", shape=");
        sb.append(this.A02);
        sb.append(')');
        return sb.toString();
    }

    @Override // X.C58N
    public final int hashCode() {
        return (((Float.floatToIntBits(this.A00) * 31) + this.A01.hashCode()) * 31) + this.A02.hashCode();
    }

    public BorderModifierNodeElement(C6L5 c6l5, C5AH c5ah, float f) {
        this.A00 = f;
        this.A01 = c6l5;
        this.A02 = c5ah;
    }
}
