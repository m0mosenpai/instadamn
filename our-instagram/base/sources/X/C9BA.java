package X;

/* renamed from: X.9BA, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9BA extends C0T6 {
    public final int A00;
    public final boolean A01;
    public final boolean A02;

    public C9BA(boolean z, boolean z2, int i) {
        this.A00 = i;
        switch (i) {
            case 0:
            case 1:
                this.A01 = z;
                this.A02 = z2;
                return;
            default:
                this.A02 = z;
                this.A01 = z2;
                return;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            int r0 = r2.A00
            switch(r0) {
                case 0: goto L20;
                case 1: goto L24;
                default: goto L5;
            }
        L5:
            if (r2 == r3) goto L3c
            r1 = 2
            boolean r0 = r3 instanceof X.C9BA
            if (r0 == 0) goto L1e
            X.9BA r3 = (X.C9BA) r3
            int r0 = r3.A00
            if (r0 != r1) goto L1e
            boolean r1 = r2.A02
            boolean r0 = r3.A02
            if (r1 != r0) goto L1e
            boolean r1 = r2.A01
            boolean r0 = r3.A01
        L1c:
            if (r1 == r0) goto L3c
        L1e:
            r0 = 0
            return r0
        L20:
            if (r2 == r3) goto L3c
            r1 = 0
            goto L27
        L24:
            if (r2 == r3) goto L3c
            r1 = 1
        L27:
            boolean r0 = r3 instanceof X.C9BA
            if (r0 == 0) goto L1e
            X.9BA r3 = (X.C9BA) r3
            int r0 = r3.A00
            if (r0 != r1) goto L1e
            boolean r1 = r2.A01
            boolean r0 = r3.A01
            if (r1 != r0) goto L1e
            boolean r1 = r2.A02
            boolean r0 = r3.A02
            goto L1c
        L3c:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9BA.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i;
        boolean z;
        if (2 - this.A00 != 0) {
            int i2 = 1237;
            if (this.A01) {
                i2 = 1231;
            }
            i = i2 * 31;
            z = this.A02;
        } else {
            int i3 = 1237;
            if (this.A02) {
                i3 = 1231;
            }
            i = i3 * 31;
            z = this.A01;
        }
        int i4 = 1237;
        if (z) {
            i4 = 1231;
        }
        return i + i4;
    }
}
