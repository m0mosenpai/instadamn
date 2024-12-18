package com.instagram.settings2.core.model;

import X.AbstractC166987dD;
import X.AbstractC55145Od4;
import X.C14360o3;
import java.util.List;

/* loaded from: classes9.dex */
public final class DictionaryValue extends AbstractC55145Od4 {
    public final List A00;
    public final List A01;

    @Override // X.AbstractC55145Od4
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DictionaryValue) {
                DictionaryValue dictionaryValue = (DictionaryValue) obj;
                if (!C14360o3.A0K(this.A00, dictionaryValue.A00) || !C14360o3.A0K(this.A01, dictionaryValue.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.AbstractC55145Od4
    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A01, AbstractC166987dD.A0G(this.A00));
    }

    public DictionaryValue(List list, List list2) {
        this.A00 = list;
        this.A01 = list2;
    }

    @Override // X.AbstractC55145Od4
    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append(super.toString());
        A1C.append(": { keys: ");
        A1C.append(this.A00);
        A1C.append(", values: ");
        return AbstractC55145Od4.A02(this.A01, A1C);
    }
}
