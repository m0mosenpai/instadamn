package com.instagram.settings2.core.model;

import X.AbstractC166987dD;
import X.AbstractC55145Od4;
import X.C14360o3;
import java.util.List;

/* loaded from: classes9.dex */
public final class FbtWithTokensValue extends AbstractC55145Od4 {
    public final int A00;
    public final List A01;

    @Override // X.AbstractC55145Od4
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FbtWithTokensValue) {
                FbtWithTokensValue fbtWithTokensValue = (FbtWithTokensValue) obj;
                if (this.A00 != fbtWithTokensValue.A00 || !C14360o3.A0K(this.A01, fbtWithTokensValue.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.AbstractC55145Od4
    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A01, this.A00 * 31);
    }

    public FbtWithTokensValue(int i, List list) {
        this.A00 = i;
        this.A01 = list;
    }
}
