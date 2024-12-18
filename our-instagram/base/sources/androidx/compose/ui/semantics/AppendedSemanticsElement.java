package androidx.compose.ui.semantics;

import X.C113505An;
import X.C14360o3;
import X.C58N;
import X.InterfaceC118625Ya;
import X.InterfaceC16660sJ;

/* loaded from: classes3.dex */
public final class AppendedSemanticsElement extends C58N implements InterfaceC118625Ya {
    public final InterfaceC16660sJ A00;
    public final boolean A01;

    @Override // X.C58N
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AppendedSemanticsElement) {
                AppendedSemanticsElement appendedSemanticsElement = (AppendedSemanticsElement) obj;
                if (this.A01 != appendedSemanticsElement.A01 || !C14360o3.A0K(this.A00, appendedSemanticsElement.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AppendedSemanticsElement(mergeDescendants=");
        sb.append(this.A01);
        sb.append(", properties=");
        sb.append(this.A00);
        sb.append(')');
        return sb.toString();
    }

    @Override // X.InterfaceC118625Ya
    public final C113505An Bt8() {
        C113505An c113505An = new C113505An();
        c113505An.A01 = this.A01;
        this.A00.invoke(c113505An);
        return c113505An;
    }

    @Override // X.C58N
    public final int hashCode() {
        int i = 1237;
        if (this.A01) {
            i = 1231;
        }
        return (i * 31) + this.A00.hashCode();
    }

    public AppendedSemanticsElement(InterfaceC16660sJ interfaceC16660sJ, boolean z) {
        this.A01 = z;
        this.A00 = interfaceC16660sJ;
    }
}
