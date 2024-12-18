package androidx.compose.foundation;

import X.C1132359l;
import X.C14360o3;
import X.C58N;
import X.C5AH;
import X.C6L5;
import X.InterfaceC16660sJ;

/* loaded from: classes3.dex */
public final class BackgroundElement extends C58N {
    public final float A00 = 1.0f;
    public final long A01;
    public final C6L5 A02;
    public final C5AH A03;
    public final InterfaceC16660sJ A04;

    public BackgroundElement(C6L5 c6l5, C5AH c5ah, InterfaceC16660sJ interfaceC16660sJ, long j) {
        this.A01 = j;
        this.A02 = c6l5;
        this.A03 = c5ah;
        this.A04 = interfaceC16660sJ;
    }

    @Override // X.C58N
    public final boolean equals(Object obj) {
        BackgroundElement backgroundElement;
        if (obj instanceof BackgroundElement) {
            backgroundElement = (BackgroundElement) obj;
        } else {
            backgroundElement = null;
        }
        if (backgroundElement == null) {
            return false;
        }
        long j = this.A01;
        long j2 = backgroundElement.A01;
        long j3 = C1132359l.A01;
        if (j != j2 || !C14360o3.A0K(this.A02, backgroundElement.A02) || this.A00 != backgroundElement.A00 || !C14360o3.A0K(this.A03, backgroundElement.A03)) {
            return false;
        }
        return true;
    }

    @Override // X.C58N
    public final int hashCode() {
        int i;
        long j = this.A01;
        long j2 = C1132359l.A01;
        int i2 = ((int) (j ^ (j >>> 32))) * 31;
        C6L5 c6l5 = this.A02;
        if (c6l5 != null) {
            i = c6l5.hashCode();
        } else {
            i = 0;
        }
        return ((((i2 + i) * 31) + Float.floatToIntBits(this.A00)) * 31) + this.A03.hashCode();
    }
}
