package com.instagram.settings2.core.model;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC55145Od4;
import X.C14360o3;
import java.util.List;

/* loaded from: classes9.dex */
public final class ModalValue extends AbstractC55145Od4 {
    public final AbstractC55145Od4 A00;
    public final AbstractC55145Od4 A01;
    public final AbstractC55145Od4 A02;
    public final AbstractC55145Od4 A03;
    public final AbstractC55145Od4 A04;
    public final List A05;

    @Override // X.AbstractC55145Od4
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ModalValue) {
                ModalValue modalValue = (ModalValue) obj;
                if (!C14360o3.A0K(this.A04, modalValue.A04) || !C14360o3.A0K(this.A05, modalValue.A05) || !C14360o3.A0K(this.A01, modalValue.A01) || !C14360o3.A0K(this.A02, modalValue.A02) || !C14360o3.A0K(this.A03, modalValue.A03) || !C14360o3.A0K(this.A00, modalValue.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.AbstractC55145Od4
    public final int hashCode() {
        return ((((((AbstractC166997dE.A0J(this.A05, AbstractC166987dD.A0G(this.A04)) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC167017dG.A0M(this.A02)) * 31) + AbstractC167017dG.A0M(this.A03)) * 31) + AbstractC166997dE.A0I(this.A00);
    }

    public ModalValue(AbstractC55145Od4 abstractC55145Od4, AbstractC55145Od4 abstractC55145Od42, AbstractC55145Od4 abstractC55145Od43, AbstractC55145Od4 abstractC55145Od44, AbstractC55145Od4 abstractC55145Od45, List list) {
        this.A04 = abstractC55145Od4;
        this.A05 = list;
        this.A01 = abstractC55145Od42;
        this.A02 = abstractC55145Od43;
        this.A03 = abstractC55145Od44;
        this.A00 = abstractC55145Od45;
    }

    @Override // X.AbstractC55145Od4
    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        AbstractC55145Od4.A03(A1C, super.toString());
        A1C.append(this.A04);
        A1C.append(", ");
        A1C.append(this.A05);
        A1C.append(", ");
        A1C.append(this.A01);
        A1C.append(", ");
        A1C.append(this.A02);
        A1C.append(", ");
        A1C.append(this.A03);
        A1C.append(", ");
        return AbstractC55145Od4.A02(this.A00, A1C);
    }
}
