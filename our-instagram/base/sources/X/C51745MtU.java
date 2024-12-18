package X;

import com.facebook.R;
import java.util.List;

/* renamed from: X.MtU, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51745MtU extends C0T6 {
    public int A00;
    public Object A01;
    public boolean A02;
    public final int A03;

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0029 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x000d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            int r0 = r2.A03
            switch(r0) {
                case 0: goto L2b;
                case 1: goto L2f;
                case 2: goto L33;
                case 3: goto L37;
                case 4: goto L3b;
                case 5: goto L3f;
                case 6: goto L57;
                case 7: goto L5b;
                default: goto L5;
            }
        L5:
            if (r2 == r3) goto L7c
            r1 = 8
        L9:
            boolean r0 = r3 instanceof X.C51745MtU
            if (r0 == 0) goto L29
            X.MtU r3 = (X.C51745MtU) r3
            int r0 = r3.A03
            if (r0 != r1) goto L29
            boolean r1 = r2.A02
            boolean r0 = r3.A02
            if (r1 != r0) goto L29
            int r1 = r2.A00
            int r0 = r3.A00
            if (r1 != r0) goto L29
            java.lang.Object r1 = r2.A01
            java.lang.Object r0 = r3.A01
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 != 0) goto L7c
        L29:
            r0 = 0
            return r0
        L2b:
            if (r2 == r3) goto L7c
            r1 = 0
            goto L9
        L2f:
            if (r2 == r3) goto L7c
            r1 = 1
            goto L9
        L33:
            if (r2 == r3) goto L7c
            r1 = 2
            goto L5e
        L37:
            if (r2 == r3) goto L7c
            r1 = 3
            goto L42
        L3b:
            if (r2 == r3) goto L7c
            r1 = 4
            goto L42
        L3f:
            if (r2 == r3) goto L7c
            r1 = 5
        L42:
            boolean r0 = r3 instanceof X.C51745MtU
            if (r0 == 0) goto L29
            X.MtU r3 = (X.C51745MtU) r3
            int r0 = r3.A03
            if (r0 != r1) goto L29
            java.lang.Object r1 = r2.A01
            java.lang.Object r0 = r3.A01
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 != 0) goto L6f
            goto L29
        L57:
            if (r2 == r3) goto L7c
            r1 = 6
            goto L9
        L5b:
            if (r2 == r3) goto L7c
            r1 = 7
        L5e:
            boolean r0 = r3 instanceof X.C51745MtU
            if (r0 == 0) goto L29
            X.MtU r3 = (X.C51745MtU) r3
            int r0 = r3.A03
            if (r0 != r1) goto L29
            java.lang.Object r1 = r2.A01
            java.lang.Object r0 = r3.A01
            if (r1 == r0) goto L6f
            goto L29
        L6f:
            int r1 = r2.A00
            int r0 = r3.A00
            if (r1 != r0) goto L29
            boolean r1 = r2.A02
            boolean r0 = r3.A02
            if (r1 == r0) goto L7c
            goto L29
        L7c:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51745MtU.equals(java.lang.Object):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int hashCode() {
        /*
            r3 = this;
            int r0 = r3.A03
            switch(r0) {
                case 2: goto L36;
                case 3: goto L2f;
                case 4: goto L29;
                case 5: goto L2f;
                case 6: goto L5;
                case 7: goto L29;
                case 8: goto L18;
                default: goto L5;
            }
        L5:
            boolean r0 = r3.A02
            int r1 = X.AbstractC25225BEi.A08(r0)
            int r0 = r3.A00
            int r1 = r1 + r0
            int r2 = r1 * 31
            java.lang.Object r0 = r3.A01
        L12:
            int r0 = r0.hashCode()
        L16:
            int r2 = r2 + r0
            return r2
        L18:
            boolean r0 = r3.A02
            int r1 = X.AbstractC25225BEi.A08(r0)
            int r0 = r3.A00
            int r1 = r1 + r0
            int r2 = r1 * 31
            java.lang.Object r0 = r3.A01
            if (r0 != 0) goto L12
            r0 = 0
            goto L16
        L29:
            java.lang.Object r0 = r3.A01
            if (r0 != 0) goto L31
            r0 = 0
            goto L45
        L2f:
            java.lang.Object r0 = r3.A01
        L31:
            int r0 = r0.hashCode()
            goto L45
        L36:
            java.lang.Object r0 = r3.A01
            int r1 = X.AbstractC166987dD.A0H(r0)
            switch(r1) {
                case 1: goto L55;
                case 2: goto L58;
                default: goto L3f;
            }
        L3f:
            java.lang.String r0 = "TrimStarted"
        L41:
            int r0 = X.AbstractC25226BEj.A02(r0, r1)
        L45:
            int r1 = r0 * 31
            int r0 = r3.A00
            int r1 = r1 + r0
            int r2 = r1 * 31
            boolean r1 = r3.A02
            r0 = 1237(0x4d5, float:1.733E-42)
            if (r1 == 0) goto L16
            r0 = 1231(0x4cf, float:1.725E-42)
            goto L16
        L55:
            java.lang.String r0 = "TrimUpdate"
            goto L41
        L58:
            java.lang.String r0 = "TrimCompleted"
            goto L41
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51745MtU.hashCode():int");
    }

    public final String toString() {
        StringBuilder A1C;
        String str;
        String str2;
        switch (this.A03) {
            case 2:
                A1C = AbstractC166987dD.A1C();
                A1C.append("StackedTimelineTrimEvent(state=");
                Number number = (Number) this.A01;
                if (number != null) {
                    switch (number.intValue()) {
                        case 1:
                            str = "TrimUpdate";
                            break;
                        case 2:
                            str = "TrimCompleted";
                            break;
                        default:
                            str = "TrimStarted";
                            break;
                    }
                } else {
                    str = "null";
                }
                A1C.append(str);
                A1C.append(", trimmerPositionMs=");
                A1C.append(this.A00);
                str2 = ", isLeftTrimHandle=";
                break;
            case 7:
                A1C = AbstractC166987dD.A1C();
                A1C.append("IgLiveSupporterInfo(supportTier=");
                A1C.append(this.A01);
                A1C.append(", badgesCount=");
                A1C.append(this.A00);
                str2 = ", showHighlight=";
                break;
            default:
                return super.toString();
        }
        A1C.append(str2);
        return AbstractC25236BEt.A0a(A1C, this.A02);
    }

    public C51745MtU(C5QE c5qe, int i, boolean z) {
        this.A03 = i;
        this.A02 = z;
        this.A00 = R.drawable.instagram_party_popper_pano_outline_24;
        this.A01 = c5qe;
    }

    public C51745MtU(Integer num, int i, boolean z) {
        this.A03 = 2;
        this.A01 = num;
        this.A00 = i;
        this.A02 = z;
    }

    public C51745MtU(List list, int i, int i2, boolean z) {
        this.A03 = i2;
        C14360o3.A0B(list, 1);
        this.A01 = list;
        this.A00 = i;
        this.A02 = z;
    }

    public C51745MtU(Object obj, int i, int i2, boolean z) {
        this.A03 = i2;
        this.A01 = obj;
        this.A00 = i;
        this.A02 = z;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C51745MtU(Integer num, int i, int i2, boolean z) {
        this(num, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? false : z);
        this.A03 = 2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C51745MtU() {
        this((Object) null, 0, 7, false);
        this.A03 = 7;
        this.A03 = 7;
    }
}
