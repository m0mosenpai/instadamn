package com.instagram.settings2.core.model;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC55145Od4;
import X.C14360o3;

/* loaded from: classes9.dex */
public final class FbtLinkTokenValue extends AbstractC55145Od4 {
    public final AbstractC55145Od4 A00;
    public final AbstractC55145Od4 A01;
    public final String A02;

    @Override // X.AbstractC55145Od4
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FbtLinkTokenValue) {
                FbtLinkTokenValue fbtLinkTokenValue = (FbtLinkTokenValue) obj;
                if (!C14360o3.A0K(this.A02, fbtLinkTokenValue.A02) || !C14360o3.A0K(this.A00, fbtLinkTokenValue.A00) || !C14360o3.A0K(this.A01, fbtLinkTokenValue.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.AbstractC55145Od4
    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A01, AbstractC166997dE.A0J(this.A00, AbstractC166987dD.A0J(this.A02)));
    }

    public FbtLinkTokenValue(AbstractC55145Od4 abstractC55145Od4, AbstractC55145Od4 abstractC55145Od42, String str) {
        this.A02 = str;
        this.A00 = abstractC55145Od4;
        this.A01 = abstractC55145Od42;
    }
}
