package com.instagram.settings2.core.model;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC55145Od4;
import X.C14360o3;
import X.NVA;
import java.util.Collections;
import java.util.List;

/* loaded from: classes9.dex */
public final class ModalBodyItemValue extends AbstractC55145Od4 {
    public final AbstractC55145Od4 A00;
    public final AbstractC55145Od4 A01;
    public final AbstractC55145Od4 A02;

    public static List A00(AbstractC55145Od4 abstractC55145Od4, Object obj) {
        List singletonList = Collections.singletonList(new ModalBodyItemValue(abstractC55145Od4, new NVA(obj), null));
        C14360o3.A07(singletonList);
        return singletonList;
    }

    @Override // X.AbstractC55145Od4
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ModalBodyItemValue) {
                ModalBodyItemValue modalBodyItemValue = (ModalBodyItemValue) obj;
                if (!C14360o3.A0K(this.A01, modalBodyItemValue.A01) || !C14360o3.A0K(this.A02, modalBodyItemValue.A02) || !C14360o3.A0K(this.A00, modalBodyItemValue.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.AbstractC55145Od4
    public final int hashCode() {
        return AbstractC166997dE.A0J(this.A02, AbstractC166987dD.A0G(this.A01)) + AbstractC167017dG.A0M(this.A00);
    }

    public ModalBodyItemValue(AbstractC55145Od4 abstractC55145Od4, AbstractC55145Od4 abstractC55145Od42, AbstractC55145Od4 abstractC55145Od43) {
        this.A01 = abstractC55145Od4;
        this.A02 = abstractC55145Od42;
        this.A00 = abstractC55145Od43;
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
