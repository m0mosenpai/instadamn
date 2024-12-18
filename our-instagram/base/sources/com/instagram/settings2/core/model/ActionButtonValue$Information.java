package com.instagram.settings2.core.model;

import X.AbstractC166987dD;
import X.AbstractC52735NUy;
import X.AbstractC55145Od4;
import X.C14360o3;

/* loaded from: classes9.dex */
public final class ActionButtonValue$Information extends AbstractC52735NUy {
    public final AbstractC55145Od4 A00;

    @Override // X.AbstractC55145Od4
    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof ActionButtonValue$Information) && C14360o3.A0K(this.A00, ((ActionButtonValue$Information) obj).A00));
    }

    @Override // X.AbstractC55145Od4
    public final int hashCode() {
        return this.A00.hashCode();
    }

    public ActionButtonValue$Information(AbstractC55145Od4 abstractC55145Od4) {
        this.A00 = abstractC55145Od4;
    }

    @Override // X.AbstractC55145Od4
    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        AbstractC55145Od4.A03(A1C, super.toString());
        return AbstractC55145Od4.A02(this.A00, A1C);
    }
}
