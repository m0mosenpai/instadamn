package com.instagram.settings2.core.model;

import X.AbstractC166987dD;
import X.AbstractC55145Od4;
import X.C14360o3;

/* loaded from: classes9.dex */
public final class FbtTextTokenValue extends AbstractC55145Od4 {
    public final AbstractC55145Od4 A00;
    public final String A01;

    @Override // X.AbstractC55145Od4
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FbtTextTokenValue) {
                FbtTextTokenValue fbtTextTokenValue = (FbtTextTokenValue) obj;
                if (!C14360o3.A0K(this.A01, fbtTextTokenValue.A01) || !C14360o3.A0K(this.A00, fbtTextTokenValue.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.AbstractC55145Od4
    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A00, AbstractC166987dD.A0J(this.A01));
    }

    public FbtTextTokenValue(AbstractC55145Od4 abstractC55145Od4, String str) {
        this.A01 = str;
        this.A00 = abstractC55145Od4;
    }
}
