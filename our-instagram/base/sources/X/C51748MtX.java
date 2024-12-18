package X;

import com.instagram.common.typedurl.ImageUrl;
import java.util.List;

/* renamed from: X.MtX, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51748MtX extends C0T6 {
    public final int A00;
    public final Object A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C51748MtX(int r7) {
        /*
            r6 = this;
            r0 = r6
            r6.A00 = r7
            r3 = 0
            X.0sl r1 = X.C16930sl.A00
            int r7 = 1 - r7
            if (r7 == 0) goto L11
            r2 = 3
        Lb:
            r4 = r3
            r5 = r3
            r0.<init>(r1, r2, r3, r4, r5)
            return
        L11:
            r2 = 1
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51748MtX.<init>(int):void");
    }

    public static boolean A00(Object obj, int i) {
        if ((obj instanceof C51748MtX) && ((C51748MtX) obj).A00 == i) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0026 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x000e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r3) {
        /*
            Method dump skipped, instructions count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51748MtX.equals(java.lang.Object):boolean");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int hashCode() {
        /*
            r3 = this;
            int r0 = r3.A00
            switch(r0) {
                case 0: goto L88;
                case 1: goto L70;
                case 2: goto L51;
                case 3: goto L3e;
                case 4: goto L35;
                case 5: goto L20;
                default: goto L5;
            }
        L5:
            boolean r0 = r3.A03
            int r1 = X.AbstractC25225BEi.A08(r0)
            boolean r0 = r3.A02
            int r2 = X.AbstractC167007dF.A0D(r0, r1)
            java.lang.Object r0 = r3.A01
            if (r0 != 0) goto L4c
            r0 = 0
        L16:
            int r2 = r2 + r0
            int r1 = r2 * 31
            boolean r0 = r3.A04
        L1b:
            int r0 = X.AbstractC166987dD.A0K(r0, r1)
            return r0
        L20:
            java.lang.Object r0 = r3.A01
            int r1 = X.AbstractC166987dD.A0G(r0)
            boolean r0 = r3.A03
            int r2 = X.AbstractC167007dF.A0D(r0, r1)
            boolean r1 = r3.A04
            r0 = 1237(0x4d5, float:1.733E-42)
            if (r1 == 0) goto L82
            r0 = 1231(0x4cf, float:1.725E-42)
            goto L82
        L35:
            boolean r0 = r3.A03
            int r1 = X.AbstractC25225BEi.A08(r0)
            boolean r0 = r3.A02
            goto L46
        L3e:
            boolean r0 = r3.A02
            int r1 = X.AbstractC25225BEi.A08(r0)
            boolean r0 = r3.A03
        L46:
            int r2 = X.AbstractC167007dF.A0D(r0, r1)
            java.lang.Object r0 = r3.A01
        L4c:
            int r0 = r0.hashCode()
            goto L16
        L51:
            boolean r0 = r3.A03
            int r2 = X.AbstractC25225BEi.A08(r0)
            java.lang.Object r0 = r3.A01
            int r1 = X.AbstractC166987dD.A0H(r0)
            switch(r1) {
                case 1: goto L67;
                case 2: goto L6a;
                case 3: goto L6d;
                default: goto L60;
            }
        L60:
            java.lang.String r0 = "NONE"
        L62:
            int r1 = X.AbstractC25226BEj.A02(r0, r1)
            goto L96
        L67:
            java.lang.String r0 = "DRAG_TO_REORDER"
            goto L62
        L6a:
            java.lang.String r0 = "AUDIO_ADJUST"
            goto L62
        L6d:
            java.lang.String r0 = "TAP_TO_TRIM"
            goto L62
        L70:
            boolean r0 = r3.A03
            int r1 = X.AbstractC25225BEi.A08(r0)
            boolean r0 = r3.A04
            int r2 = X.AbstractC167007dF.A0D(r0, r1)
            java.lang.Object r0 = r3.A01
            int r0 = r0.hashCode()
        L82:
            int r2 = r2 + r0
            int r1 = r2 * 31
            boolean r0 = r3.A02
            goto L1b
        L88:
            java.lang.Object r0 = r3.A01
            int r2 = X.AbstractC166987dD.A0G(r0)
            boolean r0 = r3.A03
            r1 = 1237(0x4d5, float:1.733E-42)
            if (r0 == 0) goto L96
            r1 = 1231(0x4cf, float:1.725E-42)
        L96:
            int r2 = r2 + r1
            int r2 = r2 * 31
            boolean r1 = r3.A02
            r0 = 1237(0x4d5, float:1.733E-42)
            if (r1 == 0) goto L16
            r0 = 1231(0x4cf, float:1.725E-42)
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51748MtX.hashCode():int");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C51748MtX(Integer num, int i, boolean z, boolean z2, boolean z3) {
        this((i & 2) != 0 ? C05F.A00 : num, z, (i & 4) != 0 ? false : z2, (i & 8) != 0 ? false : z3);
        this.A00 = 2;
    }

    public C51748MtX(Integer num, boolean z, boolean z2, boolean z3) {
        this.A00 = 2;
        this.A03 = z;
        this.A01 = num;
        this.A02 = z2;
        this.A04 = z3;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    public C51748MtX(List list, int i, boolean z, boolean z2, boolean z3) {
        this.A00 = i;
        switch (i) {
            case 1:
                this.A03 = z;
                this.A04 = z2;
                this.A01 = list;
                this.A02 = z3;
                return;
            case 2:
            default:
                this.A03 = z;
                this.A02 = z2;
                this.A01 = list;
                this.A04 = z3;
                return;
            case 3:
                this.A02 = z;
                this.A03 = z2;
                this.A01 = list;
                this.A04 = z3;
                return;
        }
    }

    public C51748MtX(List list, boolean z, boolean z2, boolean z3) {
        this.A00 = 0;
        this.A01 = list;
        this.A03 = z;
        this.A02 = z2;
        this.A04 = z3;
    }

    public C51748MtX(InterfaceC57956Pn2 interfaceC57956Pn2, boolean z, boolean z2, boolean z3) {
        this.A00 = 5;
        this.A01 = interfaceC57956Pn2;
        this.A03 = z;
        this.A04 = z2;
        this.A02 = z3;
    }

    public C51748MtX(ImageUrl imageUrl, boolean z, boolean z2, boolean z3) {
        this.A00 = 6;
        this.A03 = z;
        this.A02 = z2;
        this.A01 = imageUrl;
        this.A04 = z3;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C51748MtX(boolean z) {
        this((List) C16930sl.A00, true, false, z);
        this.A00 = 0;
    }
}
