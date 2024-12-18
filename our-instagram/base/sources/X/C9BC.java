package X;

import kotlinx.serialization.json.JsonObject;

/* renamed from: X.9BC, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9BC extends C0T6 {
    public final int A00;
    public final boolean A01;
    public final boolean A02;
    public final boolean A03;

    public C9BC(boolean z, boolean z2, boolean z3, int i) {
        this.A00 = i;
        switch (i) {
            case 0:
                this.A01 = z;
                this.A03 = z2;
                break;
            case 1:
                this.A03 = z;
                this.A01 = z2;
                break;
            default:
                this.A01 = z;
                this.A02 = z2;
                this.A03 = z3;
                return;
        }
        this.A02 = z3;
    }

    public final JsonObject A00() {
        C100744fd c100744fd = new C100744fd();
        c100744fd.A01("is_internet_available", AbstractC100754fe.A04(Boolean.valueOf(this.A01)));
        c100744fd.A01("is_java_memory_red", AbstractC100754fe.A04(Boolean.valueOf(this.A02)));
        c100744fd.A01("is_system_memory_red", AbstractC100754fe.A04(Boolean.valueOf(this.A03)));
        return c100744fd.A00();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            int r0 = r2.A00
            switch(r0) {
                case 0: goto L26;
                case 1: goto L3e;
                default: goto L5;
            }
        L5:
            if (r2 == r3) goto L5c
            r1 = 2
            boolean r0 = r3 instanceof X.C9BC
            if (r0 == 0) goto L24
            X.9BC r3 = (X.C9BC) r3
            int r0 = r3.A00
            if (r0 != r1) goto L24
            boolean r1 = r2.A01
            boolean r0 = r3.A01
            if (r1 != r0) goto L24
            boolean r1 = r2.A02
            boolean r0 = r3.A02
            if (r1 != r0) goto L24
            boolean r1 = r2.A03
            boolean r0 = r3.A03
        L22:
            if (r1 == r0) goto L5c
        L24:
            r0 = 0
            return r0
        L26:
            if (r2 == r3) goto L5c
            r1 = 0
            boolean r0 = r3 instanceof X.C9BC
            if (r0 == 0) goto L24
            X.9BC r3 = (X.C9BC) r3
            int r0 = r3.A00
            if (r0 != r1) goto L24
            boolean r1 = r2.A01
            boolean r0 = r3.A01
            if (r1 != r0) goto L24
            boolean r1 = r2.A03
            boolean r0 = r3.A03
            goto L55
        L3e:
            if (r2 == r3) goto L5c
            r1 = 1
            boolean r0 = r3 instanceof X.C9BC
            if (r0 == 0) goto L24
            X.9BC r3 = (X.C9BC) r3
            int r0 = r3.A00
            if (r0 != r1) goto L24
            boolean r1 = r2.A03
            boolean r0 = r3.A03
            if (r1 != r0) goto L24
            boolean r1 = r2.A01
            boolean r0 = r3.A01
        L55:
            if (r1 != r0) goto L24
            boolean r1 = r2.A02
            boolean r0 = r3.A02
            goto L22
        L5c:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9BC.equals(java.lang.Object):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int hashCode() {
        /*
            r3 = this;
            int r0 = r3.A00
            switch(r0) {
                case 0: goto L31;
                case 1: goto L24;
                default: goto L5;
            }
        L5:
            boolean r1 = r3.A01
            r0 = 1237(0x4d5, float:1.733E-42)
            if (r1 == 0) goto Ld
            r0 = 1231(0x4cf, float:1.725E-42)
        Ld:
            int r2 = r0 * 31
            boolean r1 = r3.A02
            r0 = 1237(0x4d5, float:1.733E-42)
            if (r1 == 0) goto L17
            r0 = 1231(0x4cf, float:1.725E-42)
        L17:
            int r2 = r2 + r0
            int r2 = r2 * 31
            boolean r1 = r3.A03
        L1c:
            r0 = 1237(0x4d5, float:1.733E-42)
            if (r1 == 0) goto L22
            r0 = 1231(0x4cf, float:1.725E-42)
        L22:
            int r2 = r2 + r0
            return r2
        L24:
            boolean r1 = r3.A03
            r0 = 1237(0x4d5, float:1.733E-42)
            if (r1 == 0) goto L2c
            r0 = 1231(0x4cf, float:1.725E-42)
        L2c:
            int r2 = r0 * 31
            boolean r1 = r3.A01
            goto L3d
        L31:
            boolean r1 = r3.A01
            r0 = 1237(0x4d5, float:1.733E-42)
            if (r1 == 0) goto L39
            r0 = 1231(0x4cf, float:1.725E-42)
        L39:
            int r2 = r0 * 31
            boolean r1 = r3.A03
        L3d:
            r0 = 1237(0x4d5, float:1.733E-42)
            if (r1 == 0) goto L43
            r0 = 1231(0x4cf, float:1.725E-42)
        L43:
            int r2 = r2 + r0
            int r2 = r2 * 31
            boolean r1 = r3.A02
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9BC.hashCode():int");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C9BC(int r2, int r3, boolean r4, boolean r5, boolean r6) {
        /*
            r1 = this;
            r1.A00 = r3
            r0 = r2 & 1
            if (r3 == 0) goto L18
            if (r0 == 0) goto L9
            r4 = 1
        L9:
            r0 = r2 & 2
            if (r0 == 0) goto Le
            r5 = 0
        Le:
            r0 = r2 & 4
            if (r0 == 0) goto L13
            r6 = 0
        L13:
            r0 = 2
        L14:
            r1.<init>(r4, r5, r6, r0)
            return
        L18:
            if (r0 == 0) goto L1b
            r4 = 0
        L1b:
            r0 = r2 & 2
            if (r0 == 0) goto L20
            r5 = 0
        L20:
            r0 = r2 & 4
            if (r0 == 0) goto L25
            r6 = 0
        L25:
            r0 = 0
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9BC.<init>(int, int, boolean, boolean, boolean):void");
    }
}
