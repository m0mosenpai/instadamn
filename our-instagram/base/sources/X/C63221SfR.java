package X;

import java.util.Arrays;
import java.util.List;

/* renamed from: X.SfR, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63221SfR {
    public static final C63221SfR A02 = new C63221SfR("COMPOSITION");
    public InterfaceC65467Tkj A00;
    public final List A01;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C63221SfR c63221SfR = (C63221SfR) obj;
            if (this.A01.equals(c63221SfR.A01)) {
                InterfaceC65467Tkj interfaceC65467Tkj = this.A00;
                InterfaceC65467Tkj interfaceC65467Tkj2 = c63221SfR.A00;
                if (interfaceC65467Tkj != null) {
                    return interfaceC65467Tkj.equals(interfaceC65467Tkj2);
                }
                return interfaceC65467Tkj2 == null;
            }
        }
        return false;
    }

    public final int A00(String str, int i) {
        if (!"__container".equals(str)) {
            List list = this.A01;
            if (!AbstractC25226BEj.A1I(list, i).equals("**")) {
                return 1;
            }
            if (i != AbstractC31172DnG.A03(list, 1) && AbstractC25226BEj.A1I(list, i + 1).equals(str)) {
                return 2;
            }
        }
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x002c, code lost:
    
        if (r1.equals("*") != false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A01(java.lang.String r8, int r9) {
        /*
            r7 = this;
            java.util.List r3 = r7.A01
            int r0 = r3.size()
            r6 = 0
            if (r9 >= r0) goto L48
            int r0 = r3.size()
            r5 = 1
            int r0 = r0 - r5
            boolean r4 = X.AbstractC167007dF.A1P(r9, r0)
            java.lang.String r1 = X.AbstractC25226BEj.A1I(r3, r9)
            java.lang.String r2 = "**"
            boolean r0 = r1.equals(r2)
            if (r0 != 0) goto L49
            boolean r0 = r1.equals(r8)
            if (r0 != 0) goto L2e
            java.lang.String r0 = "*"
            boolean r1 = r1.equals(r0)
            r0 = 0
            if (r1 == 0) goto L2f
        L2e:
            r0 = 1
        L2f:
            if (r4 != 0) goto L45
            int r1 = r3.size()
            int r1 = r1 + (-2)
            if (r9 != r1) goto L48
            java.lang.Object r1 = X.AbstractC58320PtC.A0u(r3)
            java.lang.String r1 = (java.lang.String) r1
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L48
        L45:
            if (r0 == 0) goto L48
        L47:
            r6 = 1
        L48:
            return r6
        L49:
            if (r4 != 0) goto L81
            int r1 = r9 + 1
            java.lang.String r0 = X.AbstractC25226BEj.A1I(r3, r1)
            boolean r0 = r0.equals(r8)
            if (r0 == 0) goto L72
            int r0 = r3.size()
            int r0 = r0 + (-2)
            if (r9 == r0) goto L47
            int r0 = r3.size()
            int r0 = r0 + (-3)
            if (r9 != r0) goto L48
            java.lang.Object r0 = X.AbstractC58320PtC.A0u(r3)
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = r0.equals(r2)
            goto L45
        L72:
            int r0 = X.AbstractC31172DnG.A03(r3, r5)
            if (r1 < r0) goto L48
            java.lang.String r0 = X.AbstractC25226BEj.A1I(r3, r1)
            boolean r0 = r0.equals(r8)
            return r0
        L81:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63221SfR.A01(java.lang.String, int):boolean");
    }

    public final boolean A02(String str, int i) {
        if (!"__container".equals(str)) {
            List list = this.A01;
            if (i >= list.size() || (!AbstractC25226BEj.A1I(list, i).equals(str) && !AbstractC25226BEj.A1I(list, i).equals("**") && !AbstractC25226BEj.A1I(list, i).equals("*"))) {
                return false;
            }
        }
        return true;
    }

    public final boolean A03(String str, int i) {
        if ("__container".equals(str)) {
            return true;
        }
        List list = this.A01;
        if (i < AbstractC31172DnG.A03(list, 1) || AbstractC25226BEj.A1I(list, i).equals("**")) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.A01.hashCode() * 31) + AbstractC25235BEs.A06(this.A00);
    }

    public C63221SfR(C63221SfR c63221SfR) {
        this.A01 = AbstractC166987dD.A1F(c63221SfR.A01);
        this.A00 = c63221SfR.A00;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("KeyPath{keys=");
        A1C.append(this.A01);
        A1C.append(",resolved=");
        A1C.append(AbstractC167007dF.A1W(this.A00));
        return AbstractC167027dH.A0R(A1C);
    }

    public C63221SfR(String... strArr) {
        this.A01 = Arrays.asList(strArr);
    }
}
