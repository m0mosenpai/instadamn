package com.instagram.compose.ui.capturable;

import X.C14360o3;
import X.C58J;
import X.C58N;
import X.O7E;

/* loaded from: classes5.dex */
public final class CapturableModifierNodeElement extends C58N {
    public final O7E A00;

    @Override // X.C58N
    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof CapturableModifierNodeElement) && C14360o3.A0K(this.A00, ((CapturableModifierNodeElement) obj).A00));
    }

    @Override // X.C58N
    public final int hashCode() {
        return this.A00.hashCode();
    }

    @Override // X.C58N
    public final /* bridge */ /* synthetic */ C58J A00() {
        return new CapturableModifierNode(this.A00);
    }

    @Override // X.C58N
    public final /* bridge */ /* synthetic */ void A01(C58J c58j) {
        CapturableModifierNode capturableModifierNode = (CapturableModifierNode) c58j;
        C14360o3.A0B(capturableModifierNode, 0);
        O7E o7e = this.A00;
        C14360o3.A0B(o7e, 0);
        capturableModifierNode.A00.Egh(o7e);
    }

    public CapturableModifierNodeElement(O7E o7e) {
        this.A00 = o7e;
    }
}
