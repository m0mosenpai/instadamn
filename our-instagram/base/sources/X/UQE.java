package X;

import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.react.modules.base.IgReactQEModule;

/* loaded from: classes11.dex */
public final class UQE extends C0T6 {
    public String A00;
    public String A01;
    public final int A02;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public UQE(String str, String str2, int i) {
        this.A02 = i;
        switch (i) {
            case 0:
            case 1:
            case 4:
            case 8:
            case 11:
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                AbstractC167017dG.A1P(str, str2);
                break;
            case 2:
            case 5:
            case 14:
                break;
            case 3:
            case 9:
            case Process.SIGTERM /* 15 */:
                AbstractC167017dG.A1P(str, str2);
                this.A01 = str;
                this.A00 = str2;
                return;
            case 6:
                this.A01 = str;
                this.A00 = str2;
                return;
            case 7:
            case 10:
            default:
                C14360o3.A0B(str, 1);
                this.A01 = str;
                this.A00 = str2;
                return;
        }
        this.A00 = str;
        this.A01 = str2;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0082 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            int r0 = r2.A02
            switch(r0) {
                case 0: goto La;
                case 1: goto Le;
                case 2: goto L12;
                case 3: goto L16;
                case 4: goto L1a;
                case 5: goto L1e;
                case 6: goto L22;
                case 7: goto L26;
                case 8: goto L2a;
                case 9: goto L2f;
                case 10: goto L34;
                case 11: goto L5;
                case 12: goto L39;
                case 13: goto L3e;
                case 14: goto L43;
                case 15: goto L60;
                default: goto L5;
            }
        L5:
            boolean r0 = super.equals(r3)
            return r0
        La:
            if (r2 == r3) goto L84
            r1 = 0
            goto L47
        Le:
            if (r2 == r3) goto L84
            r1 = 1
            goto L47
        L12:
            if (r2 == r3) goto L84
            r1 = 2
            goto L47
        L16:
            if (r2 == r3) goto L84
            r1 = 3
            goto L64
        L1a:
            if (r2 == r3) goto L84
            r1 = 4
            goto L47
        L1e:
            if (r2 == r3) goto L84
            r1 = 5
            goto L47
        L22:
            if (r2 == r3) goto L84
            r1 = 6
            goto L64
        L26:
            if (r2 == r3) goto L84
            r1 = 7
            goto L64
        L2a:
            if (r2 == r3) goto L84
            r1 = 8
            goto L47
        L2f:
            if (r2 == r3) goto L84
            r1 = 9
            goto L64
        L34:
            if (r2 == r3) goto L84
            r1 = 10
            goto L64
        L39:
            if (r2 == r3) goto L84
            r1 = 12
            goto L47
        L3e:
            if (r2 == r3) goto L84
            r1 = 13
            goto L47
        L43:
            if (r2 == r3) goto L84
            r1 = 14
        L47:
            boolean r0 = r3 instanceof X.UQE
            if (r0 == 0) goto L82
            X.UQE r3 = (X.UQE) r3
            int r0 = r3.A02
            if (r0 != r1) goto L82
            java.lang.String r1 = r2.A00
            java.lang.String r0 = r3.A00
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto L82
            java.lang.String r1 = r2.A01
            java.lang.String r0 = r3.A01
            goto L7c
        L60:
            if (r2 == r3) goto L84
            r1 = 15
        L64:
            boolean r0 = r3 instanceof X.UQE
            if (r0 == 0) goto L82
            X.UQE r3 = (X.UQE) r3
            int r0 = r3.A02
            if (r0 != r1) goto L82
            java.lang.String r1 = r2.A01
            java.lang.String r0 = r3.A01
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto L82
            java.lang.String r1 = r2.A00
            java.lang.String r0 = r3.A00
        L7c:
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 != 0) goto L84
        L82:
            r0 = 0
            return r0
        L84:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.UQE.equals(java.lang.Object):boolean");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    public final int hashCode() {
        int hashCode;
        int A0O;
        int hashCode2;
        String str;
        switch (this.A02) {
            case 0:
            case 1:
            case 4:
            case 8:
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                hashCode2 = this.A00.hashCode() * 31;
                str = this.A01;
                return hashCode2 + str.hashCode();
            case 2:
            case 5:
            case 14:
                hashCode = 0;
                A0O = AbstractC167017dG.A0O(this.A00) * 31;
                String str2 = this.A01;
                if (str2 != null) {
                    hashCode = str2.hashCode();
                }
                return A0O + hashCode;
            case 3:
            case 6:
            case 9:
            case Process.SIGTERM /* 15 */:
                hashCode2 = this.A01.hashCode() * 31;
                str = this.A00;
                return hashCode2 + str.hashCode();
            case 7:
            case 10:
                hashCode = this.A01.hashCode() * 31;
                A0O = AbstractC167017dG.A0O(this.A00);
                return A0O + hashCode;
            case 11:
            default:
                return super.hashCode();
        }
    }

    public final String toString() {
        if (1 - this.A02 != 0) {
            return super.toString();
        }
        return AnonymousClass001.A0v("SeriesSelectionModel(id=", this.A00, ", title=", this.A01, ')');
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public UQE(int r3) {
        /*
            r2 = this;
            r2.A02 = r3
            int r3 = 13 - r3
            if (r3 == 0) goto Ld
            r1 = 0
            r0 = 14
        L9:
            r2.<init>(r1, r1, r0)
            return
        Ld:
            java.lang.String r1 = ""
            r0 = 13
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.UQE.<init>(int):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public UQE(String str) {
        this(str, null, 10);
        this.A02 = 10;
    }
}
