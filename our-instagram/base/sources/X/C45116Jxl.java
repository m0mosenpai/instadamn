package X;

import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.react.modules.base.IgReactQEModule;

/* renamed from: X.Jxl, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45116Jxl extends C0T6 {
    public String A00;
    public String A01;
    public String A02;
    public final int A03;

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0003. Please report as an issue. */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C45116Jxl(java.lang.String r5, int r6, int r7) {
        /*
            r4 = this;
            r2 = 0
            r4.A03 = r7
            switch(r7) {
                case 5: goto L48;
                case 6: goto L34;
                case 11: goto L2b;
                case 14: goto L22;
                case 19: goto L19;
                default: goto L6;
            }
        L6:
            r3 = r2
            r0 = r6 & 1
            java.lang.String r1 = ""
            if (r0 == 0) goto Le
            r5 = r1
        Le:
            r0 = r6 & 4
            if (r0 == 0) goto L13
            r3 = r1
        L13:
            r0 = 20
        L15:
            r4.<init>(r5, r2, r3, r0)
            return
        L19:
            r3 = r2
            r0 = r6 & 1
            if (r0 == 0) goto L1f
            r5 = r2
        L1f:
            r0 = 19
            goto L15
        L22:
            r3 = r2
            r0 = r6 & 1
            if (r0 == 0) goto L28
            r5 = r2
        L28:
            r0 = 14
            goto L15
        L2b:
            r3 = r2
            r0 = r6 & 1
            if (r0 == 0) goto L31
            r5 = r2
        L31:
            r0 = 11
            goto L15
        L34:
            r3 = r2
            r0 = r6 & 1
            java.lang.String r1 = ""
            if (r0 == 0) goto L3c
            r5 = r1
        L3c:
            r0 = r6 & 2
            if (r0 == 0) goto L41
            r2 = r1
        L41:
            r0 = r6 & 4
            if (r0 == 0) goto L46
            r3 = r1
        L46:
            r0 = 6
            goto L15
        L48:
            r0 = 5
            r4.<init>(r5, r2, r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C45116Jxl.<init>(java.lang.String, int, int):void");
    }

    public static boolean A00(Object obj, int i) {
        if ((obj instanceof C45116Jxl) && ((C45116Jxl) obj).A03 == i) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x011b A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:97:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r3) {
        /*
            Method dump skipped, instructions count: 336
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C45116Jxl.equals(java.lang.Object):boolean");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    public final int hashCode() {
        int A0O;
        String str;
        int A0J;
        String str2;
        int hashCode;
        int A0O2;
        int A0J2;
        String str3;
        String str4;
        int A0J3;
        String str5;
        int i;
        String str6;
        switch (this.A03) {
            case 0:
            case 4:
            case 6:
            case 16:
                A0J3 = AbstractC166987dD.A0J(this.A01);
                str5 = this.A02;
                i = AbstractC166997dE.A0K(str5, A0J3);
                str6 = this.A00;
                A0J2 = str6.hashCode();
                return i + A0J2;
            case 1:
                i = AbstractC166997dE.A0K(this.A01, AbstractC166987dD.A0J(this.A00));
                str6 = this.A02;
                if (str6 == null) {
                    A0J2 = 0;
                    return i + A0J2;
                }
                A0J2 = str6.hashCode();
                return i + A0J2;
            case 2:
            case 11:
            case Process.SIGSTOP /* 19 */:
                A0O = AbstractC167017dG.A0O(this.A00) * 31;
                str = this.A01;
                A0J2 = (A0O + AbstractC167017dG.A0O(str)) * 31;
                str3 = this.A02;
                i = AbstractC25227BEk.A07(str3);
                return i + A0J2;
            case 3:
            case 9:
                hashCode = AbstractC167017dG.A0O(this.A00) * 31;
                A0J = AbstractC25227BEk.A07(this.A01);
                i = (hashCode + A0J) * 31;
                str6 = this.A02;
                A0J2 = str6.hashCode();
                return i + A0J2;
            case 5:
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                A0O2 = AbstractC166987dD.A0J(this.A02);
                str4 = this.A00;
                A0J2 = (A0O2 + AbstractC167017dG.A0O(str4)) * 31;
                str3 = this.A01;
                i = AbstractC25227BEk.A07(str3);
                return i + A0J2;
            case 7:
                A0J3 = AbstractC166987dD.A0J(this.A02);
                str5 = this.A01;
                i = AbstractC166997dE.A0K(str5, A0J3);
                str6 = this.A00;
                A0J2 = str6.hashCode();
                return i + A0J2;
            case 8:
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                A0J = AbstractC166987dD.A0J(this.A00);
                str2 = this.A01;
                hashCode = str2.hashCode();
                i = (hashCode + A0J) * 31;
                str6 = this.A02;
                A0J2 = str6.hashCode();
                return i + A0J2;
            case 10:
            default:
                return super.hashCode();
            case 14:
            case 17:
                A0O2 = AbstractC167017dG.A0O(this.A00) * 31;
                str4 = this.A02;
                A0J2 = (A0O2 + AbstractC167017dG.A0O(str4)) * 31;
                str3 = this.A01;
                i = AbstractC25227BEk.A07(str3);
                return i + A0J2;
            case Process.SIGTERM /* 15 */:
                A0J2 = (AbstractC166987dD.A0J(this.A02) + AbstractC167017dG.A0O(this.A01)) * 31;
                str3 = this.A00;
                i = AbstractC25227BEk.A07(str3);
                return i + A0J2;
            case 18:
                A0O2 = AbstractC167017dG.A0O(this.A02) * 31;
                str4 = this.A00;
                A0J2 = (A0O2 + AbstractC167017dG.A0O(str4)) * 31;
                str3 = this.A01;
                i = AbstractC25227BEk.A07(str3);
                return i + A0J2;
            case 20:
                A0J = AbstractC166987dD.A0J(this.A00);
                str2 = this.A01;
                if (str2 == null) {
                    hashCode = 0;
                    i = (hashCode + A0J) * 31;
                    str6 = this.A02;
                    A0J2 = str6.hashCode();
                    return i + A0J2;
                }
                hashCode = str2.hashCode();
                i = (hashCode + A0J) * 31;
                str6 = this.A02;
                A0J2 = str6.hashCode();
                return i + A0J2;
            case 21:
                A0O = AbstractC167017dG.A0O(this.A01) * 31;
                str = this.A00;
                A0J2 = (A0O + AbstractC167017dG.A0O(str)) * 31;
                str3 = this.A02;
                i = AbstractC25227BEk.A07(str3);
                return i + A0J2;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    public C45116Jxl(String str, String str2, String str3, int i) {
        this.A03 = i;
        switch (i) {
            case 0:
            case 4:
            case 6:
            case 16:
                AbstractC167027dH.A13(str, str2, str3);
                this.A01 = str;
                this.A02 = str2;
                this.A00 = str3;
                return;
            case 1:
                AbstractC167017dG.A1P(str, str2);
                this.A00 = str;
                this.A01 = str2;
                this.A02 = str3;
                return;
            case 2:
            case 11:
            case Process.SIGSTOP /* 19 */:
                this.A00 = str;
                this.A01 = str2;
                this.A02 = str3;
                return;
            case 3:
            case 9:
                C14360o3.A0B(str3, 3);
                this.A00 = str;
                this.A01 = str2;
                this.A02 = str3;
                return;
            case 5:
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                C14360o3.A0B(str, 1);
                this.A02 = str;
                this.A00 = str2;
                this.A01 = str3;
                return;
            case 7:
                AbstractC167017dG.A1P(str, str2);
                this.A02 = str;
                this.A01 = str2;
                this.A00 = str3;
                return;
            case 8:
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                AbstractC167017dG.A1P(str, str2);
                C14360o3.A0B(str3, 3);
                this.A00 = str;
                this.A01 = str2;
                this.A02 = str3;
                return;
            case 10:
                AbstractC167017dG.A1Q(str, str3);
                this.A01 = str;
                this.A00 = str2;
                this.A02 = str3;
                return;
            case 14:
            case 17:
                this.A00 = str;
                this.A02 = str2;
                this.A01 = str3;
                return;
            case Process.SIGTERM /* 15 */:
                C14360o3.A0B(str, 1);
                this.A02 = str;
                this.A01 = str2;
                this.A00 = str3;
                return;
            case 18:
                this.A02 = str;
                this.A00 = str2;
                this.A01 = str3;
                return;
            case 20:
                C14360o3.A0B(str, 1);
                C14360o3.A0B(str3, 3);
                this.A00 = str;
                this.A01 = str2;
                this.A02 = str3;
                return;
            default:
                this.A01 = str;
                this.A00 = str2;
                this.A02 = str3;
                return;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C45116Jxl() {
        this(null, null, null, 19);
        this.A03 = 19;
        this.A03 = 19;
    }
}
