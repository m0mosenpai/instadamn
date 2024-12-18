package X;

import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.react.modules.base.IgReactQEModule;
import java.io.StringWriter;

/* renamed from: X.E6x, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32071E6x extends C0T6 {
    public int A00;
    public String A01;
    public final int A02;

    public C32071E6x(int i, String str, int i2) {
        this.A02 = i2;
        switch (i2) {
            case 1:
            case 3:
            case 8:
            case 17:
            case 18:
                C14360o3.A0B(str, 2);
                break;
        }
        this.A00 = i;
        this.A01 = str;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0023 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x000d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            int r0 = r2.A02
            switch(r0) {
                case 0: goto L25;
                case 1: goto L29;
                case 2: goto L2d;
                case 3: goto L31;
                case 4: goto L35;
                case 5: goto L39;
                case 6: goto L3d;
                case 7: goto L41;
                case 8: goto L45;
                case 9: goto L4a;
                case 10: goto L4f;
                case 11: goto L54;
                case 12: goto L59;
                case 13: goto L5e;
                case 14: goto L63;
                case 15: goto L68;
                case 16: goto L6d;
                case 17: goto L8c;
                default: goto L5;
            }
        L5:
            if (r2 == r3) goto L92
            r1 = 18
        L9:
            boolean r0 = r3 instanceof X.C32071E6x
            if (r0 == 0) goto L23
            X.E6x r3 = (X.C32071E6x) r3
            int r0 = r3.A02
            if (r0 != r1) goto L23
            int r1 = r2.A00
            int r0 = r3.A00
            if (r1 != r0) goto L23
            java.lang.String r1 = r2.A01
            java.lang.String r0 = r3.A01
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 != 0) goto L92
        L23:
            r0 = 0
            return r0
        L25:
            if (r2 == r3) goto L92
            r1 = 0
            goto L71
        L29:
            if (r2 == r3) goto L92
            r1 = 1
            goto L9
        L2d:
            if (r2 == r3) goto L92
            r1 = 2
            goto L71
        L31:
            if (r2 == r3) goto L92
            r1 = 3
            goto L9
        L35:
            if (r2 == r3) goto L92
            r1 = 4
            goto L71
        L39:
            if (r2 == r3) goto L92
            r1 = 5
            goto L71
        L3d:
            if (r2 == r3) goto L92
            r1 = 6
            goto L9
        L41:
            if (r2 == r3) goto L92
            r1 = 7
            goto L9
        L45:
            if (r2 == r3) goto L92
            r1 = 8
            goto L9
        L4a:
            if (r2 == r3) goto L92
            r1 = 9
            goto L71
        L4f:
            if (r2 == r3) goto L92
            r1 = 10
            goto L71
        L54:
            if (r2 == r3) goto L92
            r1 = 11
            goto L71
        L59:
            if (r2 == r3) goto L92
            r1 = 12
            goto L71
        L5e:
            if (r2 == r3) goto L92
            r1 = 13
            goto L71
        L63:
            if (r2 == r3) goto L92
            r1 = 14
            goto L9
        L68:
            if (r2 == r3) goto L92
            r1 = 15
            goto L71
        L6d:
            if (r2 == r3) goto L92
            r1 = 16
        L71:
            boolean r0 = r3 instanceof X.C32071E6x
            if (r0 == 0) goto L23
            X.E6x r3 = (X.C32071E6x) r3
            int r0 = r3.A02
            if (r0 != r1) goto L23
            java.lang.String r1 = r2.A01
            java.lang.String r0 = r3.A01
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto L23
            int r1 = r2.A00
            int r0 = r3.A00
            if (r1 == r0) goto L92
            goto L23
        L8c:
            if (r2 == r3) goto L92
            r1 = 17
            goto L9
        L92:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32071E6x.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        String str;
        int i;
        int i2;
        String str2;
        int hashCode;
        switch (this.A02) {
            case 1:
            case 3:
            case 8:
            case 17:
            case 18:
                i2 = this.A00 * 31;
                str2 = this.A01;
                hashCode = str2.hashCode();
                break;
            case 2:
            case 4:
            case 5:
            case 9:
            case 10:
            case 11:
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
            case Process.SIGTERM /* 15 */:
            case 16:
            default:
                str = this.A01;
                i = str.hashCode();
                i2 = i * 31;
                hashCode = this.A00;
                break;
            case 6:
            case 7:
            case 14:
                i2 = this.A00 * 31;
                str2 = this.A01;
                if (str2 == null) {
                    hashCode = 0;
                    break;
                }
                hashCode = str2.hashCode();
                break;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                str = this.A01;
                if (str == null) {
                    i = 0;
                    i2 = i * 31;
                    hashCode = this.A00;
                    break;
                }
                i = str.hashCode();
                i2 = i * 31;
                hashCode = this.A00;
        }
        return i2 + hashCode;
    }

    public final String toString() {
        StringBuilder A1C;
        switch (this.A02) {
            case 0:
                A1C = AbstractC166987dD.A1C();
                A1C.append("ParsedBillingPeriod(period=");
                A1C.append(this.A01);
                A1C.append(MSV.A00(636));
                A1C.append(this.A00);
                break;
            case 1:
                A1C = AbstractC166987dD.A1C();
                A1C.append("PurchasePriceCurrencyAmount(amountInHundredths=");
                A1C.append(this.A00);
                A1C.append(", currency=");
                A1C.append(this.A01);
                break;
            case 16:
                StringWriter stringWriter = new StringWriter();
                C17z A0S = AbstractC167007dF.A0S(stringWriter);
                String str = this.A01;
                if (str != null) {
                    A0S.A0S("channel_name", str);
                }
                A0S.A0Q("product_type", this.A00);
                String A0l = AbstractC167017dG.A0l(A0S, stringWriter);
                C14360o3.A07(A0l);
                return A0l;
            default:
                return super.toString();
        }
        return AbstractC167017dG.A0p(A1C);
    }

    public C32071E6x(String str, int i, int i2) {
        this.A02 = i2;
        switch (i2) {
            case 4:
            case 5:
            case 9:
            case 10:
            case 11:
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
            case Process.SIGTERM /* 15 */:
            case 16:
                C14360o3.A0B(str, 1);
                break;
        }
        this.A01 = str;
        this.A00 = i;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C32071E6x(int i) {
        this(i, (String) null, 14);
        this.A02 = 14;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C32071E6x() {
        this("", 0, 9);
        this.A02 = 9;
        this.A02 = 9;
    }
}
