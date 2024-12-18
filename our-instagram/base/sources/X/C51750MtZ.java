package X;

import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.MtZ, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51750MtZ extends C0T6 {
    public Object A00;
    public final int A01;

    public static boolean A00(Object obj, int i) {
        if ((obj instanceof C51750MtZ) && ((C51750MtZ) obj).A01 == i) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        int i;
        switch (this.A01) {
            case 0:
                if (this != obj) {
                    if (!A00(obj, 0)) {
                        return false;
                    }
                    return C14360o3.A0K(this.A00, ((C51750MtZ) obj).A00);
                }
                return true;
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
                if (this != obj) {
                    i = 9;
                    break;
                } else {
                    return true;
                }
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
                    if (!A00(obj, 14) || this.A00 != ((C51750MtZ) obj).A00) {
                        return false;
                    }
                    return true;
                }
                return true;
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
            default:
                if (this != obj) {
                    i = 18;
                    break;
                } else {
                    return true;
                }
        }
        if (!A00(obj, i) || !C14360o3.A0K(this.A00, ((C51750MtZ) obj).A00)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        if (14 - this.A01 != 0) {
            return this.A00.hashCode();
        }
        Integer num = (Integer) this.A00;
        return AbstractC25230BEn.A0C(num, AbstractC54317Nzb.A00(num));
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    public final String toString() {
        StringBuilder A1C;
        String str;
        String str2;
        switch (this.A01) {
            case 5:
                A1C = AbstractC166987dD.A1C();
                str = "IgFeedFundedIncentiveBannerSectionUiActions(onIncentiveButtonClick=";
                A1C.append(str);
                A1C.append(this.A00);
                return AbstractC167017dG.A0p(A1C);
            case 14:
                A1C = AbstractC166987dD.A1C();
                A1C.append("CtaStateUiState(state=");
                Integer num = (Integer) this.A00;
                if (num != null) {
                    str2 = AbstractC54317Nzb.A00(num);
                } else {
                    str2 = "null";
                }
                A1C.append(str2);
                return AbstractC167017dG.A0p(A1C);
            case 16:
                A1C = AbstractC166987dD.A1C();
                str = "CtdMimicryBannerUiAction(launchAdTools=";
                A1C.append(str);
                A1C.append(this.A00);
                return AbstractC167017dG.A0p(A1C);
            default:
                return super.toString();
        }
    }

    public C51750MtZ(AbstractC107294sa abstractC107294sa) {
        this.A01 = 13;
        this.A00 = abstractC107294sa;
    }

    public C51750MtZ(Integer num) {
        this.A01 = 14;
        this.A00 = num;
    }

    public C51750MtZ(List list, int i) {
        this.A01 = i;
        switch (i) {
            case 0:
            case 1:
            case 4:
            case 10:
                break;
            default:
                C14360o3.A0B(list, 1);
                break;
        }
        this.A00 = list;
    }

    public C51750MtZ(C51749MtY c51749MtY) {
        this.A01 = 3;
        C14360o3.A0B(c51749MtY, 1);
        this.A00 = c51749MtY;
    }

    public C51750MtZ(AbstractC55145Od4 abstractC55145Od4) {
        this.A01 = 2;
        C14360o3.A0B(abstractC55145Od4, 1);
        this.A00 = abstractC55145Od4;
    }

    public C51750MtZ(User user) {
        this.A01 = 17;
        C14360o3.A0B(user, 1);
        this.A00 = user;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C51750MtZ() {
        this(C107284sZ.A00);
        this.A01 = 13;
    }

    public C51750MtZ(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C51750MtZ(int r3) {
        /*
            r2 = this;
            r2.A01 = r3
            int r3 = 7 - r3
            if (r3 == 0) goto L10
            r1 = 8
        L8:
            r2.A01 = r1
            X.0sl r0 = X.C16930sl.A00
            r2.<init>(r0, r1)
            return
        L10:
            r1 = 7
            goto L8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51750MtZ.<init>(int):void");
    }
}
