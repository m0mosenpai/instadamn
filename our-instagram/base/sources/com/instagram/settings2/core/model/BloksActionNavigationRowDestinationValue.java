package com.instagram.settings2.core.model;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC55145Od4;
import X.C14360o3;

/* loaded from: classes9.dex */
public final class BloksActionNavigationRowDestinationValue extends AbstractC55145Od4 {
    public final DictionaryValue A00;
    public final String A01;

    @Override // X.AbstractC55145Od4
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BloksActionNavigationRowDestinationValue) {
                BloksActionNavigationRowDestinationValue bloksActionNavigationRowDestinationValue = (BloksActionNavigationRowDestinationValue) obj;
                if (!C14360o3.A0K(this.A01, bloksActionNavigationRowDestinationValue.A01) || !C14360o3.A0K(this.A00, bloksActionNavigationRowDestinationValue.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.AbstractC55145Od4
    public final int hashCode() {
        return (AbstractC166987dD.A0J(this.A01) * 31) + AbstractC166997dE.A0I(this.A00);
    }

    public BloksActionNavigationRowDestinationValue(DictionaryValue dictionaryValue, String str) {
        this.A01 = str;
        this.A00 = dictionaryValue;
    }

    @Override // X.AbstractC55145Od4
    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append(super.toString());
        A1C.append(": { appId: ");
        A1C.append(this.A01);
        A1C.append(", params: ");
        return AbstractC55145Od4.A02(this.A00, A1C);
    }
}
