package com.instagram.settings2.core.model;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC55145Od4;
import X.C14360o3;

/* loaded from: classes9.dex */
public final class MetaAppInvokeDestinationValue extends AbstractC55145Od4 {
    public final AbstractC55145Od4 A00;
    public final AbstractC55145Od4 A01;
    public final AbstractC55145Od4 A02;
    public final AbstractC55145Od4 A03;

    @Override // X.AbstractC55145Od4
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof MetaAppInvokeDestinationValue) {
                MetaAppInvokeDestinationValue metaAppInvokeDestinationValue = (MetaAppInvokeDestinationValue) obj;
                if (!C14360o3.A0K(this.A01, metaAppInvokeDestinationValue.A01) || !C14360o3.A0K(this.A03, metaAppInvokeDestinationValue.A03) || !C14360o3.A0K(this.A02, metaAppInvokeDestinationValue.A02) || !C14360o3.A0K(this.A00, metaAppInvokeDestinationValue.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.AbstractC55145Od4
    public final int hashCode() {
        return AbstractC166997dE.A0J(this.A02, AbstractC166997dE.A0J(this.A03, AbstractC166987dD.A0G(this.A01))) + AbstractC167017dG.A0M(this.A00);
    }

    public MetaAppInvokeDestinationValue(AbstractC55145Od4 abstractC55145Od4, AbstractC55145Od4 abstractC55145Od42, AbstractC55145Od4 abstractC55145Od43, AbstractC55145Od4 abstractC55145Od44) {
        this.A01 = abstractC55145Od4;
        this.A03 = abstractC55145Od42;
        this.A02 = abstractC55145Od43;
        this.A00 = abstractC55145Od44;
    }

    @Override // X.AbstractC55145Od4
    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        AbstractC55145Od4.A03(A1C, super.toString());
        return AbstractC55145Od4.A02(this.A01, A1C);
    }
}
