package com.instagram.settings2.core.model;

import X.AbstractC166987dD;
import X.AbstractC55145Od4;
import X.C14360o3;
import java.util.List;

/* loaded from: classes9.dex */
public final class AndValue extends AbstractC55145Od4 {
    public final List A00;

    public AndValue(List list) {
        this.A00 = list;
        if (list.size() > 1) {
        } else {
            throw AbstractC166987dD.A14("AndValue must have 2 or more values");
        }
    }

    @Override // X.AbstractC55145Od4
    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof AndValue) && C14360o3.A0K(this.A00, ((AndValue) obj).A00));
    }

    @Override // X.AbstractC55145Od4
    public final int hashCode() {
        return this.A00.hashCode();
    }

    @Override // X.AbstractC55145Od4
    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        AbstractC55145Od4.A03(A1C, super.toString());
        return AbstractC55145Od4.A02(this.A00, A1C);
    }
}
