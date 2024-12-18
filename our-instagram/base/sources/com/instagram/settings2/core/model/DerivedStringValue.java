package com.instagram.settings2.core.model;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC55145Od4;
import X.C16930sl;
import X.EnumC72360Xbw;
import X.GGX;
import X.InterfaceC37109GWu;
import java.util.List;

/* loaded from: classes6.dex */
public final class DerivedStringValue extends AbstractC55145Od4 {
    public final EnumC72360Xbw A00;

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0067, code lost:
    
        if (r0 != null) goto L28;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:24:0x003f. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    @Override // X.AbstractC55145Od4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A07(com.instagram.common.session.UserSession r6, com.instagram.settings2.core.session.AbstractValueResolverImpl r7, X.InterfaceC23621Ds r8) {
        /*
            r5 = this;
            r3 = 3
            boolean r0 = X.C57146PWy.A01(r8, r3)
            if (r0 == 0) goto L82
            r4 = r8
            X.PWy r4 = (X.C57146PWy) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L82
            int r2 = r2 - r1
            r4.A00 = r2
        L15:
            java.lang.Object r3 = r4.A02
            X.1JX r2 = X.C1JX.A02
            int r0 = r4.A00
            r1 = 1
            if (r0 == 0) goto L32
            if (r0 != r1) goto Lb1
            java.lang.Object r2 = r4.A01
            com.instagram.settings2.core.model.DerivedStringValue r2 = (com.instagram.settings2.core.model.DerivedStringValue) r2
            X.AbstractC09560e7.A00(r3)
        L27:
            X.3NY r3 = (X.C3NY) r3
            boolean r0 = r3 instanceof X.C3NX
            if (r0 == 0) goto L88
            X.3NX r3 = (X.C3NX) r3
            java.lang.Object r2 = r3.A00
        L31:
            return r2
        L32:
            X.AbstractC09560e7.A00(r3)
            X.Xbw r0 = r5.A00
            r4.A01 = r5
            r4.A00 = r1
            int r0 = r0.ordinal()
            switch(r0) {
                case 0: goto L47;
                case 1: goto L75;
                case 2: goto L59;
                case 3: goto L54;
                case 4: goto L70;
                case 5: goto L7a;
                default: goto L42;
            }
        L42:
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L47:
            com.instagram.user.model.User r0 = X.AbstractC166987dD.A10(r6)
            X.16a r0 = r0.A0I()
            if (r0 == 0) goto L69
            java.lang.String r0 = r0.A01
            goto L67
        L54:
            java.lang.Object r3 = com.instagram.settings2.extension.common.derivedvalues.DerivedValueProviderKt.A01(r6, r4)
            goto L7e
        L59:
            X.17P r0 = X.AbstractC31174DnI.A0m(r6)
            java.lang.Integer r0 = r0.Afv()
            if (r0 == 0) goto L69
            java.lang.String r0 = r0.toString()
        L67:
            if (r0 != 0) goto L6b
        L69:
            java.lang.String r0 = ""
        L6b:
            X.3NX r3 = X.AbstractC25225BEi.A0z(r0)
            goto L7e
        L70:
            java.lang.Object r3 = com.instagram.settings2.extension.common.derivedvalues.DerivedValueProviderKt.A02(r6, r4)
            goto L7e
        L75:
            java.lang.Object r3 = com.instagram.settings2.extension.common.derivedvalues.DerivedValueProviderKt.A00(r6, r4)
            goto L7e
        L7a:
            java.lang.Object r3 = com.instagram.settings2.extension.common.derivedvalues.DerivedValueProviderKt.A03(r6, r4)
        L7e:
            if (r3 == r2) goto L31
            r2 = r5
            goto L27
        L82:
            X.PWy r4 = new X.PWy
            r4.<init>(r5, r8, r3)
            goto L15
        L88:
            boolean r0 = r3 instanceof X.C194848jk
            if (r0 == 0) goto Lac
            java.lang.StringBuilder r1 = X.AbstractC166987dD.A1C()
            java.lang.String r0 = "Failed to get derived string value: "
            r1.append(r0)
            X.Xbw r0 = r2.A00
            r1.append(r0)
            java.lang.String r0 = " error: "
            r1.append(r0)
            X.8jk r3 = (X.C194848jk) r3
            java.lang.Object r0 = r3.A00
            java.lang.String r0 = X.AbstractC166997dE.A0v(r0, r1)
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A14(r0)
            throw r0
        Lac:
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        Lb1:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.settings2.core.model.DerivedStringValue.A07(com.instagram.common.session.UserSession, com.instagram.settings2.core.session.AbstractValueResolverImpl, X.1Ds):java.lang.Object");
    }

    @Override // X.AbstractC55145Od4
    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof DerivedStringValue) && this.A00 == ((DerivedStringValue) obj).A00);
    }

    @Override // X.AbstractC55145Od4
    public final int hashCode() {
        return this.A00.hashCode();
    }

    public DerivedStringValue(EnumC72360Xbw enumC72360Xbw) {
        this.A00 = enumC72360Xbw;
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
