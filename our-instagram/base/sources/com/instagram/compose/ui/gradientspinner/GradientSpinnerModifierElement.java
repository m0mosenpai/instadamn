package com.instagram.compose.ui.gradientspinner;

import X.BHN;
import X.C119145aW;
import X.C14360o3;
import X.C25287BHf;
import X.C58N;
import X.InterfaceC16610sE;

/* loaded from: classes3.dex */
public final class GradientSpinnerModifierElement extends C58N {
    public final float A00;
    public final C25287BHf A01;
    public final BHN A02;
    public final InterfaceC16610sE A03;

    public GradientSpinnerModifierElement(C25287BHf c25287BHf, BHN bhn, InterfaceC16610sE interfaceC16610sE, float f) {
        C14360o3.A0B(interfaceC16610sE, 4);
        this.A01 = c25287BHf;
        this.A02 = bhn;
        this.A00 = f;
        this.A03 = interfaceC16610sE;
    }

    @Override // X.C58N
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof GradientSpinnerModifierElement) {
                GradientSpinnerModifierElement gradientSpinnerModifierElement = (GradientSpinnerModifierElement) obj;
                if (!C14360o3.A0K(this.A01, gradientSpinnerModifierElement.A01) || !C14360o3.A0K(this.A02, gradientSpinnerModifierElement.A02) || !C119145aW.A01(this.A00, gradientSpinnerModifierElement.A00) || !C14360o3.A0K(this.A03, gradientSpinnerModifierElement.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.C58N
    public final int hashCode() {
        return (((((this.A01.hashCode() * 31) + this.A02.hashCode()) * 31) + Float.floatToIntBits(this.A00)) * 31) + this.A03.hashCode();
    }
}
