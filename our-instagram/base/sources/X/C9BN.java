package X;

/* renamed from: X.9BN, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9BN extends C0T6 {
    public final int A00;
    public final long A01;
    public final Object A02;

    public C9BN(long j, Object obj, int i) {
        this.A00 = i;
        this.A01 = j;
        this.A02 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0024 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x000c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            int r0 = r5.A00
            switch(r0) {
                case 0: goto L26;
                case 1: goto L2a;
                case 2: goto L42;
                default: goto L5;
            }
        L5:
            if (r5 == r6) goto L5f
            r1 = 3
        L8:
            boolean r0 = r6 instanceof X.C9BN
            if (r0 == 0) goto L24
            X.9BN r6 = (X.C9BN) r6
            int r0 = r6.A00
            if (r0 != r1) goto L24
            long r3 = r5.A01
            long r1 = r6.A01
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L24
            java.lang.Object r1 = r5.A02
            java.lang.Object r0 = r6.A02
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 != 0) goto L5f
        L24:
            r0 = 0
            return r0
        L26:
            if (r5 == r6) goto L5f
            r1 = 0
            goto L8
        L2a:
            if (r5 == r6) goto L5f
            r1 = 1
            boolean r0 = r6 instanceof X.C9BN
            if (r0 == 0) goto L24
            X.9BN r6 = (X.C9BN) r6
            int r0 = r6.A00
            if (r0 != r1) goto L24
            java.lang.Object r1 = r5.A02
            java.lang.Object r0 = r6.A02
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 != 0) goto L56
            goto L24
        L42:
            if (r5 == r6) goto L5f
            r1 = 2
            boolean r0 = r6 instanceof X.C9BN
            if (r0 == 0) goto L24
            X.9BN r6 = (X.C9BN) r6
            int r0 = r6.A00
            if (r0 != r1) goto L24
            java.lang.Object r1 = r5.A02
            java.lang.Object r0 = r6.A02
            if (r1 == r0) goto L56
            goto L24
        L56:
            long r3 = r5.A01
            long r1 = r6.A01
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L5f
            goto L24
        L5f:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9BN.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int hashCode;
        int i;
        int i2;
        String str;
        switch (this.A00) {
            case 1:
                Object obj = this.A02;
                if (obj == null) {
                    hashCode = 0;
                } else {
                    hashCode = obj.hashCode();
                }
                i = hashCode * 31;
                long j = this.A01;
                i2 = (int) (j ^ (j >>> 32));
                break;
            case 2:
                int intValue = ((Number) this.A02).intValue();
                switch (intValue) {
                    case 1:
                        str = "FAIL";
                        break;
                    case 2:
                        str = "CANCEL";
                        break;
                    default:
                        str = "SUCCESS";
                        break;
                }
                hashCode = str.hashCode() + intValue;
                i = hashCode * 31;
                long j2 = this.A01;
                i2 = (int) (j2 ^ (j2 >>> 32));
                break;
            default:
                long j3 = this.A01;
                i = ((int) (j3 ^ (j3 >>> 32))) * 31;
                Object obj2 = this.A02;
                if (obj2 == null) {
                    i2 = 0;
                    break;
                } else {
                    i2 = obj2.hashCode();
                    break;
                }
        }
        return i + i2;
    }

    public final String toString() {
        String str;
        if (2 - this.A00 != 0) {
            return super.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Outcome(action=");
        Number number = (Number) this.A02;
        if (number != null) {
            switch (number.intValue()) {
                case 1:
                    str = "FAIL";
                    break;
                case 2:
                    str = "CANCEL";
                    break;
                default:
                    str = "SUCCESS";
                    break;
            }
        } else {
            str = "null";
        }
        sb.append(str);
        sb.append(AbstractC43591JPw.A00(103));
        sb.append(this.A01);
        sb.append(')');
        return sb.toString();
    }

    public C9BN(C1KR c1kr, Integer num) {
        this.A00 = 2;
        long j = ((C1KP) c1kr).A00;
        this.A00 = 2;
        this.A02 = num;
        this.A01 = j;
    }
}
