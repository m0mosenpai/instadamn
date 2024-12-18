package com.instagram.settings2.core.model;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC55145Od4;
import X.C14360o3;

/* loaded from: classes9.dex */
public final class BloksNavigationRowDestinationValue extends AbstractC55145Od4 {
    public final AbstractC55145Od4 A00;
    public final AbstractC55145Od4 A01;
    public final DictionaryValue A02;
    public final String A03;

    @Override // X.AbstractC55145Od4
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BloksNavigationRowDestinationValue) {
                BloksNavigationRowDestinationValue bloksNavigationRowDestinationValue = (BloksNavigationRowDestinationValue) obj;
                if (!C14360o3.A0K(this.A03, bloksNavigationRowDestinationValue.A03) || !C14360o3.A0K(this.A00, bloksNavigationRowDestinationValue.A00) || !C14360o3.A0K(this.A01, bloksNavigationRowDestinationValue.A01) || !C14360o3.A0K(this.A02, bloksNavigationRowDestinationValue.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.AbstractC55145Od4
    public final int hashCode() {
        return (AbstractC166997dE.A0J(this.A01, AbstractC166997dE.A0J(this.A00, AbstractC166987dD.A0J(this.A03))) * 31) + AbstractC166997dE.A0I(this.A02);
    }

    public BloksNavigationRowDestinationValue(AbstractC55145Od4 abstractC55145Od4, AbstractC55145Od4 abstractC55145Od42, DictionaryValue dictionaryValue, String str) {
        this.A03 = str;
        this.A00 = abstractC55145Od4;
        this.A01 = abstractC55145Od42;
        this.A02 = dictionaryValue;
    }

    @Override // X.AbstractC55145Od4
    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append(super.toString());
        A1C.append(": { appId: ");
        A1C.append(this.A03);
        A1C.append(", navbarTitle: ");
        A1C.append(this.A00);
        A1C.append(", params: ");
        A1C.append(this.A02);
        A1C.append(" , showTabBar: ");
        return AbstractC55145Od4.A02(this.A01, A1C);
    }
}
