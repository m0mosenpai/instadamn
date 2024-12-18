package X;

import java.util.List;

/* loaded from: classes11.dex */
public final class WV0 implements YOm {
    public final double A00;
    public final double A01;
    public final String A02;
    public final String A03;

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0014. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    @Override // X.YOm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean Cne(X.WFT r7) {
        /*
            r6 = this;
            java.lang.String r1 = r7.A02
            java.lang.String r0 = "INT"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto Lb3
            long r0 = r7.A01
            double r3 = (double) r0
        Ld:
            java.lang.String r1 = r6.A02
            int r0 = r1.hashCode()
            r5 = 1
            switch(r0) {
                case 3244: goto L19;
                case 3309: goto L28;
                case 3464: goto L37;
                case 98322: goto L42;
                case 98694: goto L51;
                case 102680: goto L60;
                case 107485: goto L6f;
                case 108954: goto L7a;
                case 109854: goto L89;
                case 110226: goto L9e;
                default: goto L17;
            }
        L17:
            r5 = 0
            return r5
        L19:
            java.lang.String r0 = "eq"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L17
            double r1 = r6.A00
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L17
            return r5
        L28:
            java.lang.String r0 = "gt"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L17
            double r1 = r6.A00
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L17
            return r5
        L37:
            java.lang.String r0 = "lt"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L17
            double r1 = r6.A00
            goto Lae
        L42:
            java.lang.String r0 = "ccr"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L17
            double r1 = r6.A00
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L17
            goto L97
        L51:
            java.lang.String r0 = "cor"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L17
            double r1 = r6.A00
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L17
            goto Lac
        L60:
            java.lang.String r0 = "gte"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L17
            double r1 = r6.A00
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L17
            return r5
        L6f:
            java.lang.String r0 = "lte"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L17
            double r1 = r6.A00
            goto L99
        L7a:
            java.lang.String r0 = "neq"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L17
            double r1 = r6.A00
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L17
            return r5
        L89:
            java.lang.String r0 = "ocr"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L17
            double r1 = r6.A00
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L17
        L97:
            double r1 = r6.A01
        L99:
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L17
            return r5
        L9e:
            java.lang.String r0 = "oor"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L17
            double r1 = r6.A00
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L17
        Lac:
            double r1 = r6.A01
        Lae:
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L17
            return r5
        Lb3:
            java.lang.String r0 = "FLOAT"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto Lbf
            double r3 = r7.A00
            goto Ld
        Lbf:
            java.lang.String r1 = "Invalid value type"
            X.VI3 r0 = new X.VI3
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WV0.Cne(X.WFT):boolean");
    }

    @Override // X.YOm
    public final String getName() {
        return this.A03;
    }

    public WV0(String str, String str2, List list) {
        this.A03 = str;
        this.A02 = str2;
        char c = 65535;
        switch (str2.hashCode()) {
            case 98322:
                if (str2.equals("ccr")) {
                    c = 0;
                    break;
                }
                break;
            case 98694:
                if (str2.equals("cor")) {
                    c = 1;
                    break;
                }
                break;
            case 109854:
                if (str2.equals("ocr")) {
                    c = 2;
                    break;
                }
                break;
            case 110226:
                if (str2.equals("oor")) {
                    c = 3;
                    break;
                }
                break;
        }
        int size = list.size();
        switch (c) {
            case 0:
            case 1:
            case 2:
            case 3:
                if (size == 2) {
                    try {
                        double parseDouble = Double.parseDouble((String) list.get(0));
                        this.A00 = parseDouble;
                        double parseDouble2 = Double.parseDouble((String) list.get(1));
                        this.A01 = parseDouble2;
                        if (parseDouble >= parseDouble2) {
                            throw new VI3("Bad values order", str);
                        }
                        return;
                    } catch (NumberFormatException unused) {
                        throw new VI3("Bad number format", str);
                    }
                }
                throw new VI3("Mismatching number of values", str);
            default:
                if (size == 1) {
                    try {
                        this.A00 = Double.parseDouble((String) list.get(0));
                        return;
                    } catch (NumberFormatException unused2) {
                        throw new VI3("Bad number format", str);
                    }
                }
                throw new VI3("Mismatching number of values", str);
        }
    }
}
