package com.instagram.settings2.core.model;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC55145Od4;
import X.C16930sl;
import X.EnumC72363Xbz;
import X.GGX;
import X.InterfaceC37109GWu;
import java.util.List;

/* loaded from: classes6.dex */
public final class DerivedBooleanValue extends AbstractC55145Od4 {
    public final EnumC72363Xbz A00;

    /* JADX WARN: Failed to find 'out' block for switch in B:24:0x003d. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    @Override // X.AbstractC55145Od4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A07(com.instagram.common.session.UserSession r6, com.instagram.settings2.core.session.AbstractValueResolverImpl r7, X.InterfaceC23621Ds r8) {
        /*
            Method dump skipped, instructions count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.settings2.core.model.DerivedBooleanValue.A07(com.instagram.common.session.UserSession, com.instagram.settings2.core.session.AbstractValueResolverImpl, X.1Ds):java.lang.Object");
    }

    @Override // X.AbstractC55145Od4
    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof DerivedBooleanValue) && this.A00 == ((DerivedBooleanValue) obj).A00);
    }

    @Override // X.AbstractC55145Od4
    public final int hashCode() {
        return this.A00.hashCode();
    }

    public DerivedBooleanValue(EnumC72363Xbz enumC72363Xbz) {
        this.A00 = enumC72363Xbz;
    }

    @Override // X.AbstractC55145Od4
    public final InterfaceC37109GWu A05() {
        return GGX.A00;
    }

    @Override // X.AbstractC55145Od4
    public final List A08() {
        return C16930sl.A00;
    }

    @Override // X.AbstractC55145Od4
    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append(super.toString());
        A1C.append(": { ");
        A1C.append(this.A00);
        return AbstractC166997dE.A0x(" }", A1C);
    }
}
