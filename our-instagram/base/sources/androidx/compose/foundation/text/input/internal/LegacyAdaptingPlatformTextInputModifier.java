package androidx.compose.foundation.text.input.internal;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.BXF;
import X.BXJ;
import X.BXK;
import X.C14360o3;
import X.C58J;
import X.C58N;
import X.CWQ;

/* loaded from: classes5.dex */
public final class LegacyAdaptingPlatformTextInputModifier extends C58N {
    public final CWQ A00;
    public final BXJ A01;
    public final BXF A02;

    @Override // X.C58N
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof LegacyAdaptingPlatformTextInputModifier) {
                LegacyAdaptingPlatformTextInputModifier legacyAdaptingPlatformTextInputModifier = (LegacyAdaptingPlatformTextInputModifier) obj;
                if (!C14360o3.A0K(this.A01, legacyAdaptingPlatformTextInputModifier.A01) || !C14360o3.A0K(this.A00, legacyAdaptingPlatformTextInputModifier.A00) || !C14360o3.A0K(this.A02, legacyAdaptingPlatformTextInputModifier.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.C58N
    public final /* bridge */ /* synthetic */ C58J A00() {
        return new BXK(this.A00, this.A01, this.A02);
    }

    @Override // X.C58N
    public final /* bridge */ /* synthetic */ void A01(C58J c58j) {
        BXK bxk = (BXK) c58j;
        BXJ bxj = this.A01;
        if (bxk.A08) {
            bxk.A01.Eoa();
            bxk.A01.A02(bxk);
        }
        bxk.A01 = bxj;
        if (bxk.A08) {
            if (bxj.A00 == null) {
                bxj.A00 = bxk;
            } else {
                throw AbstractC166987dD.A14("Expected textInputModifierNode to be null");
            }
        }
        bxk.A00 = this.A00;
        bxk.A02 = this.A02;
    }

    @Override // X.C58N
    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A02, AbstractC166997dE.A0J(this.A00, AbstractC166987dD.A0G(this.A01)));
    }

    public LegacyAdaptingPlatformTextInputModifier(CWQ cwq, BXJ bxj, BXF bxf) {
        this.A01 = bxj;
        this.A00 = cwq;
        this.A02 = bxf;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("LegacyAdaptingPlatformTextInputModifier(serviceAdapter=");
        A1C.append(this.A01);
        A1C.append(", legacyTextFieldState=");
        A1C.append(this.A00);
        A1C.append(", textFieldSelectionManager=");
        return AbstractC167017dG.A0o(this.A02, A1C);
    }
}
