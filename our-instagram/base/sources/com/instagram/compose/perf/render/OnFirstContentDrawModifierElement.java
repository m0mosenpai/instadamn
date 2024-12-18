package com.instagram.compose.perf.render;

import X.C14360o3;
import X.C58N;
import X.InterfaceC16820sZ;

/* loaded from: classes3.dex */
public final class OnFirstContentDrawModifierElement extends C58N {
    public final InterfaceC16820sZ A00;

    @Override // X.C58N
    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof OnFirstContentDrawModifierElement) && C14360o3.A0K(this.A00, ((OnFirstContentDrawModifierElement) obj).A00));
    }

    @Override // X.C58N
    public final int hashCode() {
        return this.A00.hashCode();
    }

    public OnFirstContentDrawModifierElement(InterfaceC16820sZ interfaceC16820sZ) {
        this.A00 = interfaceC16820sZ;
    }
}
