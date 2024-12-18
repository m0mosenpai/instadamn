package X;

/* renamed from: X.QIr, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58913QIr extends C0T6 {
    public long A00;
    public long A01;
    public final int A02;

    public C58913QIr(long j, long j2, int i) {
        this.A02 = i;
        switch (i) {
            case 0:
            case 1:
                this.A01 = j;
                this.A00 = j2;
                return;
            default:
                this.A00 = j;
                this.A01 = j2;
                return;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            int r0 = r5.A02
            switch(r0) {
                case 0: goto L24;
                case 1: goto L28;
                default: goto L5;
            }
        L5:
            if (r5 == r6) goto L42
            r1 = 2
            boolean r0 = r6 instanceof X.C58913QIr
            if (r0 == 0) goto L22
            X.QIr r6 = (X.C58913QIr) r6
            int r0 = r6.A02
            if (r0 != r1) goto L22
            long r3 = r5.A00
            long r1 = r6.A00
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L22
            long r3 = r5.A01
            long r1 = r6.A01
        L1e:
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L42
        L22:
            r0 = 0
            return r0
        L24:
            if (r5 == r6) goto L42
            r1 = 0
            goto L2b
        L28:
            if (r5 == r6) goto L42
            r1 = 1
        L2b:
            boolean r0 = r6 instanceof X.C58913QIr
            if (r0 == 0) goto L22
            X.QIr r6 = (X.C58913QIr) r6
            int r0 = r6.A02
            if (r0 != r1) goto L22
            long r3 = r5.A01
            long r1 = r6.A01
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L22
            long r3 = r5.A00
            long r1 = r6.A00
            goto L1e
        L42:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58913QIr.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i;
        long j;
        if (2 - this.A02 != 0) {
            long j2 = this.A01;
            i = ((int) (j2 ^ (j2 >>> 32))) * 31;
            j = this.A00;
        } else {
            long j3 = this.A00;
            i = ((int) (j3 ^ (j3 >>> 32))) * 31;
            j = this.A01;
        }
        return AbstractC58321PtD.A08(j, i);
    }

    public final String toString() {
        if (this.A02 != 0) {
            return super.toString();
        }
        return AnonymousClass001.A0Y("ScreenTimeInterval(startTime=", ", endTime=", ')', this.A01, this.A00);
    }
}
