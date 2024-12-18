package androidx.compose.foundation.lazy.layout;

import X.C14360o3;
import X.C58N;
import X.C6M3;
import X.InterfaceC137816Mf;
import X.InterfaceC16820sZ;

/* loaded from: classes3.dex */
public final class LazyLayoutSemanticsModifier extends C58N {
    public final C6M3 A00;
    public final InterfaceC137816Mf A01;
    public final InterfaceC16820sZ A02;
    public final boolean A03;
    public final boolean A04;

    @Override // X.C58N
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof LazyLayoutSemanticsModifier) {
                LazyLayoutSemanticsModifier lazyLayoutSemanticsModifier = (LazyLayoutSemanticsModifier) obj;
                if (this.A02 != lazyLayoutSemanticsModifier.A02 || !C14360o3.A0K(this.A01, lazyLayoutSemanticsModifier.A01) || this.A00 != lazyLayoutSemanticsModifier.A00 || this.A04 != lazyLayoutSemanticsModifier.A04 || this.A03 != lazyLayoutSemanticsModifier.A03) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.C58N
    public final int hashCode() {
        int hashCode = ((((this.A02.hashCode() * 31) + this.A01.hashCode()) * 31) + this.A00.hashCode()) * 31;
        int i = 1237;
        if (this.A04) {
            i = 1231;
        }
        int i2 = (hashCode + i) * 31;
        int i3 = 1237;
        if (this.A03) {
            i3 = 1231;
        }
        return i2 + i3;
    }

    public LazyLayoutSemanticsModifier(C6M3 c6m3, InterfaceC137816Mf interfaceC137816Mf, InterfaceC16820sZ interfaceC16820sZ, boolean z, boolean z2) {
        this.A02 = interfaceC16820sZ;
        this.A01 = interfaceC137816Mf;
        this.A00 = c6m3;
        this.A04 = z;
        this.A03 = z2;
    }
}
