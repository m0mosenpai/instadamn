package androidx.compose.animation;

import X.C14360o3;
import X.C58N;
import X.C5Y5;
import androidx.compose.ui.Alignment;

/* loaded from: classes3.dex */
public final class SizeAnimationModifierElement extends C58N {
    public final C5Y5 A00;
    public final Alignment A01;

    @Override // X.C58N
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SizeAnimationModifierElement) {
                SizeAnimationModifierElement sizeAnimationModifierElement = (SizeAnimationModifierElement) obj;
                if (!C14360o3.A0K(this.A00, sizeAnimationModifierElement.A00) || !C14360o3.A0K(this.A01, sizeAnimationModifierElement.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.C58N
    public final int hashCode() {
        return ((this.A00.hashCode() * 31) + this.A01.hashCode()) * 31;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SizeAnimationModifierElement(animationSpec=");
        sb.append(this.A00);
        sb.append(", alignment=");
        sb.append(this.A01);
        sb.append(", finishedListener=");
        sb.append((Object) null);
        sb.append(')');
        return sb.toString();
    }

    public SizeAnimationModifierElement(C5Y5 c5y5, Alignment alignment) {
        this.A00 = c5y5;
        this.A01 = alignment;
    }
}
