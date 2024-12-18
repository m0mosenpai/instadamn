package X;

import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.react.modules.base.IgReactQEModule;

/* renamed from: X.MtP, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51740MtP extends C0T6 {
    public String A00;
    public boolean A01;
    public final int A02;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C51740MtP(int i, int i2, boolean z) {
        this((String) null, 22, z);
        boolean A1T;
        int i3;
        this.A02 = i2;
        switch (i2) {
            case 5:
                A1T = MSX.A1T(i, z);
                i3 = 5;
                break;
            case 6:
                A1T = MSX.A1T(i, z);
                i3 = 6;
                break;
            case 20:
                A1T = MSX.A1T(i, z);
                i3 = 20;
                break;
            case 21:
                A1T = MSX.A1T(i, z);
                r2 = (i & 2) != 0 ? "" : null;
                i3 = 21;
                break;
            default:
                return;
        }
        this(r2, i3, A1T);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00b4 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r3) {
        /*
            Method dump skipped, instructions count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51740MtP.equals(java.lang.Object):boolean");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int hashCode() {
        /*
            r3 = this;
            int r0 = r3.A02
            switch(r0) {
                case 0: goto L3b;
                case 1: goto L34;
                case 2: goto L34;
                case 3: goto L34;
                case 4: goto L23;
                case 5: goto La;
                case 6: goto La;
                case 7: goto L34;
                case 8: goto L34;
                case 9: goto L23;
                case 10: goto L34;
                case 11: goto L34;
                case 12: goto L3b;
                case 13: goto L5;
                case 14: goto L16;
                case 15: goto L34;
                case 16: goto L34;
                case 17: goto L34;
                case 18: goto L34;
                case 19: goto L16;
                case 20: goto La;
                case 21: goto L16;
                case 22: goto La;
                case 23: goto L23;
                default: goto L5;
            }
        L5:
            int r2 = super.hashCode()
            return r2
        La:
            boolean r0 = r3.A01
            int r2 = X.AbstractC25225BEi.A08(r0)
            java.lang.String r0 = r3.A00
            if (r0 != 0) goto L1e
            r0 = 0
            goto L32
        L16:
            boolean r0 = r3.A01
            int r2 = X.AbstractC25225BEi.A08(r0)
            java.lang.String r0 = r3.A00
        L1e:
            int r0 = r0.hashCode()
            goto L32
        L23:
            java.lang.String r0 = r3.A00
            if (r0 != 0) goto L36
            r0 = 0
        L28:
            int r2 = r0 * 31
            boolean r1 = r3.A01
            r0 = 1237(0x4d5, float:1.733E-42)
            if (r1 == 0) goto L32
            r0 = 1231(0x4cf, float:1.725E-42)
        L32:
            int r2 = r2 + r0
            return r2
        L34:
            java.lang.String r0 = r3.A00
        L36:
            int r0 = r0.hashCode()
            goto L28
        L3b:
            java.lang.String r0 = r3.A00
            int r2 = r0.hashCode()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51740MtP.hashCode():int");
    }

    public C51740MtP(String str, int i) {
        this.A02 = i;
        C14360o3.A0B(str, 1);
        this.A00 = str;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C51740MtP(int r4) {
        /*
            r3 = this;
            r3.A02 = r4
            switch(r4) {
                case 4: goto L12;
                case 5: goto L5;
                case 6: goto L5;
                case 7: goto Ld;
                default: goto L5;
            }
        L5:
            r2 = 0
            r1 = 0
            r0 = 23
        L9:
            r3.<init>(r2, r1, r0)
            return
        Ld:
            java.lang.String r2 = "REDIRECT"
            r1 = 0
            r0 = 7
            goto L9
        L12:
            r2 = 0
            r1 = 0
            r0 = 4
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51740MtP.<init>(int):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C51740MtP(String str, boolean z, int i) {
        this(str, 12);
        this.A02 = i;
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 7:
            case 10:
            case 11:
            case Process.SIGTERM /* 15 */:
            case 16:
            case 17:
            case 18:
                C14360o3.A0B(str, 1);
            case 4:
            case 8:
            case 9:
            case 23:
                this.A00 = str;
                break;
            case 5:
            case 6:
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
            case 14:
            case Process.SIGSTOP /* 19 */:
            case 20:
            case 21:
            case 22:
            default:
                C14360o3.A0B(str, 1);
                break;
        }
        this.A01 = z;
    }

    public C51740MtP(String str, int i, boolean z) {
        this.A02 = i;
        switch (i) {
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
            case Process.SIGSTOP /* 19 */:
            case 21:
                C14360o3.A0B(str, 2);
                break;
        }
        this.A01 = z;
        this.A00 = str;
    }
}
