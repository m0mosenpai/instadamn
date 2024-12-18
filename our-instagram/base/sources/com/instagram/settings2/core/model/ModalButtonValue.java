package com.instagram.settings2.core.model;

import X.AbstractC166987dD;
import X.AbstractC55145Od4;
import X.C14360o3;

/* loaded from: classes9.dex */
public final class ModalButtonValue extends AbstractC55145Od4 {
    public final AbstractC55145Od4 A00;
    public final AbstractC55145Od4 A01;

    @Override // X.AbstractC55145Od4
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ModalButtonValue) {
                ModalButtonValue modalButtonValue = (ModalButtonValue) obj;
                if (!C14360o3.A0K(this.A01, modalButtonValue.A01) || !C14360o3.A0K(this.A00, modalButtonValue.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.AbstractC55145Od4
    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A00, AbstractC166987dD.A0G(this.A01));
    }

    public ModalButtonValue(AbstractC55145Od4 abstractC55145Od4, AbstractC55145Od4 abstractC55145Od42) {
        this.A01 = abstractC55145Od4;
        this.A00 = abstractC55145Od42;
    }

    @Override // X.AbstractC55145Od4
    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        AbstractC55145Od4.A03(A1C, super.toString());
        A1C.append(this.A01);
        A1C.append(", ");
        return AbstractC55145Od4.A02(this.A00, A1C);
    }
}
