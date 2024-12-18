package X;

import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.react.modules.base.IgReactQEModule;

/* renamed from: X.MsJ, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51688MsJ extends C0T6 {
    public boolean A00;
    public final int A01;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C51688MsJ(int r3) {
        /*
            r2 = this;
            r2.A01 = r3
            r1 = 0
            switch(r3) {
                case 0: goto L1d;
                case 1: goto L1b;
                case 2: goto L19;
                case 3: goto L17;
                case 4: goto L15;
                case 5: goto L13;
                case 6: goto L11;
                case 7: goto Lf;
                case 8: goto L6;
                case 9: goto L6;
                case 10: goto Lc;
                default: goto L6;
            }
        L6:
            r0 = 13
        L8:
            r2.<init>(r1, r0)
            return
        Lc:
            r0 = 10
            goto L8
        Lf:
            r0 = 7
            goto L8
        L11:
            r0 = 6
            goto L8
        L13:
            r0 = 5
            goto L8
        L15:
            r0 = 4
            goto L8
        L17:
            r0 = 3
            goto L8
        L19:
            r0 = 2
            goto L8
        L1b:
            r0 = 1
            goto L8
        L1d:
            r0 = 0
            goto L8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51688MsJ.<init>(int):void");
    }

    public final boolean equals(Object obj) {
        int i;
        switch (this.A01) {
            case 0:
                if (this != obj) {
                    i = 0;
                    break;
                } else {
                    return true;
                }
            case 1:
                if (this != obj) {
                    i = 1;
                    break;
                } else {
                    return true;
                }
            case 2:
                if (this != obj) {
                    i = 2;
                    break;
                } else {
                    return true;
                }
            case 3:
                if (this != obj) {
                    i = 3;
                    break;
                } else {
                    return true;
                }
            case 4:
                if (this != obj) {
                    i = 4;
                    break;
                } else {
                    return true;
                }
            case 5:
                if (this != obj) {
                    i = 5;
                    break;
                } else {
                    return true;
                }
            case 6:
                if (this != obj) {
                    i = 6;
                    break;
                } else {
                    return true;
                }
            case 7:
                if (this != obj) {
                    i = 7;
                    break;
                } else {
                    return true;
                }
            case 8:
                if (this != obj) {
                    i = 8;
                    break;
                } else {
                    return true;
                }
            case 9:
            default:
                return super.equals(obj);
            case 10:
                if (this != obj) {
                    i = 10;
                    break;
                } else {
                    return true;
                }
            case 11:
                if (this != obj) {
                    i = 11;
                    break;
                } else {
                    return true;
                }
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                if (this != obj) {
                    i = 12;
                    break;
                } else {
                    return true;
                }
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                if (this != obj) {
                    i = 13;
                    break;
                } else {
                    return true;
                }
            case 14:
                if (this != obj) {
                    i = 14;
                    break;
                } else {
                    return true;
                }
            case Process.SIGTERM /* 15 */:
                if (this != obj) {
                    i = 15;
                    break;
                } else {
                    return true;
                }
            case 16:
                if (this != obj) {
                    i = 16;
                    break;
                } else {
                    return true;
                }
            case 17:
                if (this != obj) {
                    i = 17;
                    break;
                } else {
                    return true;
                }
            case 18:
                if (this != obj) {
                    i = 18;
                    break;
                } else {
                    return true;
                }
            case Process.SIGSTOP /* 19 */:
                if (this != obj) {
                    i = 19;
                    break;
                } else {
                    return true;
                }
        }
        if (obj instanceof C51688MsJ) {
            C51688MsJ c51688MsJ = (C51688MsJ) obj;
            if (c51688MsJ.A01 != i || this.A00 != c51688MsJ.A00) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        switch (this.A01) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
            case 14:
            case Process.SIGTERM /* 15 */:
            case 16:
            case 17:
            case 18:
            case Process.SIGSTOP /* 19 */:
                if (!this.A00) {
                    return 1237;
                }
                return 1231;
            case 9:
            default:
                return super.hashCode();
        }
    }

    public C51688MsJ(boolean z, int i) {
        this.A01 = i;
        this.A00 = z;
    }
}
