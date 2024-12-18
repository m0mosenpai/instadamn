package androidx.compose.foundation.lazy;

import X.C14360o3;
import X.C58N;
import X.InterfaceC74963Ym;

/* loaded from: classes3.dex */
public final class ParentSizeElement extends C58N {
    public final float A00;
    public final InterfaceC74963Ym A01;
    public final InterfaceC74963Ym A02;

    @Override // X.C58N
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ParentSizeElement)) {
            return false;
        }
        ParentSizeElement parentSizeElement = (ParentSizeElement) obj;
        return this.A00 == parentSizeElement.A00 && C14360o3.A0K(this.A02, parentSizeElement.A02) && C14360o3.A0K(this.A01, parentSizeElement.A01);
    }

    @Override // X.C58N
    public final int hashCode() {
        int i;
        InterfaceC74963Ym interfaceC74963Ym = this.A02;
        int i2 = 0;
        if (interfaceC74963Ym != null) {
            i = interfaceC74963Ym.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * 31;
        InterfaceC74963Ym interfaceC74963Ym2 = this.A01;
        if (interfaceC74963Ym2 != null) {
            i2 = interfaceC74963Ym2.hashCode();
        }
        return ((i3 + i2) * 31) + Float.floatToIntBits(this.A00);
    }

    public ParentSizeElement(InterfaceC74963Ym interfaceC74963Ym, InterfaceC74963Ym interfaceC74963Ym2, float f) {
        this.A00 = f;
        this.A02 = interfaceC74963Ym;
        this.A01 = interfaceC74963Ym2;
    }
}
