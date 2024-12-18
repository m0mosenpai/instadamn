package X;

import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.common.dextricks.OdexSchemeArtXdex;
import com.facebook.forker.Process;
import com.instagram.react.modules.base.IgReactQEModule;

/* renamed from: X.9CU, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9CU implements InterfaceC51732Yw {
    public final int A00;
    public final long A01;
    public final Object A02;

    public C9CU(Integer num, int i, long j) {
        this.A00 = i;
        this.A02 = num;
        this.A01 = j;
    }

    public static C51722Yv A00(C51722Yv c51722Yv, Integer num, int i, long j) {
        return new C51722Yv(c51722Yv, new C9CU(num, i, j));
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:24:0x0073. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:61:0x00d7. Please report as an issue. */
    @Override // X.InterfaceC51732Yw
    public final void AC4(C50932Vp c50932Vp, C2XE c2xe) {
        EnumC222829sN enumC222829sN;
        EnumC77763e0 enumC77763e0;
        EnumC77763e0 enumC77763e02;
        EnumC77763e0 enumC77763e03;
        EnumC77763e0 enumC77763e04;
        int i = this.A00;
        C14360o3.A0B(c2xe, 0);
        C14360o3.A0B(c50932Vp, 1);
        long j = this.A01;
        C2XH c2xh = c2xe.A0D;
        C14360o3.A07(c2xh);
        switch (i) {
            case 0:
                int A00 = C2Z3.A00(c2xh, j);
                switch (((Number) this.A02).intValue()) {
                    case 0:
                        c50932Vp.A0L(A00);
                        return;
                    case 1:
                        c50932Vp.A0F(A00);
                        return;
                    case 2:
                        c50932Vp.A0K(A00);
                        return;
                    case 3:
                        c50932Vp.A0I(A00);
                        return;
                    case 4:
                        c50932Vp.A0J(A00);
                        return;
                    case 5:
                        c50932Vp.A0H(A00);
                        return;
                    case 6:
                        enumC77763e03 = EnumC77763e0.START;
                        c50932Vp.E3E(enumC77763e03, A00);
                        return;
                    case 7:
                        enumC77763e03 = EnumC77763e0.TOP;
                        c50932Vp.E3E(enumC77763e03, A00);
                        return;
                    case 8:
                        enumC77763e03 = EnumC77763e0.END;
                        c50932Vp.E3E(enumC77763e03, A00);
                        return;
                    case 9:
                        enumC77763e03 = EnumC77763e0.BOTTOM;
                        c50932Vp.E3E(enumC77763e03, A00);
                        return;
                    case 10:
                        enumC77763e03 = EnumC77763e0.LEFT;
                        c50932Vp.E3E(enumC77763e03, A00);
                        return;
                    case 11:
                        enumC77763e03 = EnumC77763e0.RIGHT;
                        c50932Vp.E3E(enumC77763e03, A00);
                        return;
                    case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                        enumC77763e03 = EnumC77763e0.HORIZONTAL;
                        c50932Vp.E3E(enumC77763e03, A00);
                        return;
                    case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                        enumC77763e03 = EnumC77763e0.VERTICAL;
                        c50932Vp.E3E(enumC77763e03, A00);
                        return;
                    case 14:
                        enumC77763e03 = EnumC77763e0.ALL;
                        c50932Vp.E3E(enumC77763e03, A00);
                        return;
                    case Process.SIGTERM /* 15 */:
                        enumC77763e02 = EnumC77763e0.START;
                        c50932Vp.A0T(enumC77763e02, A00);
                        return;
                    case 16:
                        enumC77763e02 = EnumC77763e0.TOP;
                        c50932Vp.A0T(enumC77763e02, A00);
                        return;
                    case 17:
                        enumC77763e02 = EnumC77763e0.END;
                        c50932Vp.A0T(enumC77763e02, A00);
                        return;
                    case 18:
                        enumC77763e02 = EnumC77763e0.BOTTOM;
                        c50932Vp.A0T(enumC77763e02, A00);
                        return;
                    case Process.SIGSTOP /* 19 */:
                        enumC77763e02 = EnumC77763e0.LEFT;
                        c50932Vp.A0T(enumC77763e02, A00);
                        return;
                    case 20:
                        enumC77763e02 = EnumC77763e0.RIGHT;
                        c50932Vp.A0T(enumC77763e02, A00);
                        return;
                    case 21:
                        enumC77763e02 = EnumC77763e0.HORIZONTAL;
                        c50932Vp.A0T(enumC77763e02, A00);
                        return;
                    case 22:
                        enumC77763e02 = EnumC77763e0.VERTICAL;
                        c50932Vp.A0T(enumC77763e02, A00);
                        return;
                    case 23:
                        enumC77763e02 = EnumC77763e0.ALL;
                        c50932Vp.A0T(enumC77763e02, A00);
                        return;
                    default:
                        return;
                }
            case 1:
                int A002 = C2Z3.A00(c2xh, j);
                switch (((Number) this.A02).intValue()) {
                    case 0:
                        c50932Vp.A0E(A002);
                        return;
                    case 1:
                        enumC77763e0 = EnumC77763e0.ALL;
                        c50932Vp.A0U(enumC77763e0, A002);
                        return;
                    case 2:
                        enumC77763e0 = EnumC77763e0.START;
                        c50932Vp.A0U(enumC77763e0, A002);
                        return;
                    case 3:
                        enumC77763e0 = EnumC77763e0.TOP;
                        c50932Vp.A0U(enumC77763e0, A002);
                        return;
                    case 4:
                        enumC77763e0 = EnumC77763e0.END;
                        c50932Vp.A0U(enumC77763e0, A002);
                        return;
                    case 5:
                        enumC77763e0 = EnumC77763e0.BOTTOM;
                        c50932Vp.A0U(enumC77763e0, A002);
                        return;
                    case 6:
                        enumC77763e0 = EnumC77763e0.LEFT;
                        c50932Vp.A0U(enumC77763e0, A002);
                        return;
                    case 7:
                        enumC77763e0 = EnumC77763e0.RIGHT;
                        c50932Vp.A0U(enumC77763e0, A002);
                        return;
                    case 8:
                        enumC77763e0 = EnumC77763e0.HORIZONTAL;
                        c50932Vp.A0U(enumC77763e0, A002);
                        return;
                    case 9:
                        enumC77763e0 = EnumC77763e0.VERTICAL;
                        c50932Vp.A0U(enumC77763e0, A002);
                        return;
                    case 10:
                        enumC222829sN = EnumC222829sN.COLUMN;
                        c50932Vp.A0V(enumC222829sN, A002);
                        return;
                    case 11:
                        enumC222829sN = EnumC222829sN.ROW;
                        c50932Vp.A0V(enumC222829sN, A002);
                        return;
                    case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                        enumC222829sN = EnumC222829sN.ALL;
                        c50932Vp.A0V(enumC222829sN, A002);
                        return;
                    default:
                        return;
                }
            default:
                int A003 = C2Z3.A00(c2xh, j);
                switch (((Number) this.A02).intValue()) {
                    case 0:
                        enumC77763e04 = EnumC77763e0.START;
                        break;
                    case 1:
                        enumC77763e04 = EnumC77763e0.TOP;
                        break;
                    case 2:
                        enumC77763e04 = EnumC77763e0.END;
                        break;
                    case 3:
                        enumC77763e04 = EnumC77763e0.BOTTOM;
                        break;
                    case 4:
                        enumC77763e04 = EnumC77763e0.LEFT;
                        break;
                    case 5:
                        enumC77763e04 = EnumC77763e0.RIGHT;
                        break;
                    case 6:
                        enumC77763e04 = EnumC77763e0.HORIZONTAL;
                        break;
                    case 7:
                        enumC77763e04 = EnumC77763e0.VERTICAL;
                        break;
                    case 8:
                        enumC77763e04 = EnumC77763e0.ALL;
                        break;
                    case 9:
                        float f = A003;
                        C50952Vr A02 = C50932Vp.A02(c50932Vp);
                        A02.A0F |= OdexSchemeArtXdex.STATE_DO_PERIODIC_PGO_COMP_NEEDED;
                        A02.A05 = f;
                        return;
                    default:
                        return;
                }
                C76973cj A01 = C50932Vp.A01(c50932Vp);
                A01.A02 |= 256;
                C2WG c2wg = A01.A07;
                if (c2wg == null) {
                    c2wg = new C2WG();
                }
                c2wg.A03(enumC77763e04, A003);
                A01.A07 = c2wg;
                return;
        }
    }

    public final boolean equals(Object obj) {
        int i;
        switch (this.A00) {
            case 0:
                if (this == obj) {
                    return true;
                }
                i = 0;
                break;
            case 1:
                if (this == obj) {
                    return true;
                }
                i = 1;
                break;
            default:
                if (this != obj) {
                    i = 2;
                    break;
                } else {
                    return true;
                }
        }
        if (obj instanceof C9CU) {
            C9CU c9cu = (C9CU) obj;
            if (c9cu.A00 == i && this.A02 == c9cu.A02 && this.A01 == c9cu.A01) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        String A00;
        int i = this.A00;
        Integer num = (Integer) this.A02;
        switch (i) {
            case 0:
                A00 = AbstractC61783Rtd.A00(num);
                break;
            case 1:
                A00 = AbstractC225129wb.A00(num);
                break;
            default:
                A00 = AbstractC225149wd.A00(num);
                break;
        }
        int hashCode = (A00.hashCode() + num.intValue()) * 31;
        long j = this.A01;
        return hashCode + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        StringBuilder sb;
        String A00;
        switch (this.A00) {
            case 0:
                sb = new StringBuilder();
                sb.append("CoreDimenStyleItem(field=");
                Integer num = (Integer) this.A02;
                if (num != null) {
                    A00 = AbstractC61783Rtd.A00(num);
                    break;
                }
                A00 = "null";
                break;
            case 1:
                sb = new StringBuilder();
                sb.append("FlexboxDimenStyleItem(field=");
                Integer num2 = (Integer) this.A02;
                if (num2 != null) {
                    A00 = AbstractC225129wb.A00(num2);
                    break;
                }
                A00 = "null";
                break;
            default:
                sb = new StringBuilder();
                sb.append("DimenStyleItem(field=");
                Integer num3 = (Integer) this.A02;
                if (num3 != null) {
                    A00 = AbstractC225149wd.A00(num3);
                    break;
                }
                A00 = "null";
                break;
        }
        sb.append(A00);
        sb.append(", value=");
        sb.append((Object) C2Z3.A04(this.A01));
        sb.append(')');
        return sb.toString();
    }
}
