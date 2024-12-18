package X;

import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.react.modules.base.IgReactQEModule;

/* renamed from: X.9CT, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9CT implements InterfaceC51732Yw {
    public final float A00;
    public final int A01;
    public final Object A02;

    public C9CT(Integer num, float f, int i) {
        this.A01 = i;
        this.A02 = num;
        this.A00 = f;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:42:0x00c1. Please report as an issue. */
    @Override // X.InterfaceC51732Yw
    public final void AC4(C50932Vp c50932Vp, C2XE c2xe) {
        EnumC77763e0 enumC77763e0;
        EnumC77763e0 enumC77763e02;
        EnumC77763e0 enumC77763e03;
        long j;
        int i;
        long j2;
        C50952Vr A02;
        long j3;
        long j4;
        long j5;
        switch (this.A01) {
            case 0:
                C14360o3.A0B(c50932Vp, 1);
                switch (((Number) this.A02).intValue()) {
                    case 0:
                        c50932Vp.A0D(this.A00);
                        return;
                    case 1:
                        c50932Vp.A08(this.A00);
                        return;
                    case 2:
                        c50932Vp.A0C(this.A00);
                        return;
                    case 3:
                        c50932Vp.A0A(this.A00);
                        return;
                    case 4:
                        c50932Vp.A0B(this.A00);
                        return;
                    case 5:
                        c50932Vp.A09(this.A00);
                        return;
                    case 6:
                        enumC77763e03 = EnumC77763e0.ALL;
                        c50932Vp.A0Q(enumC77763e03, this.A00);
                        return;
                    case 7:
                        enumC77763e03 = EnumC77763e0.START;
                        c50932Vp.A0Q(enumC77763e03, this.A00);
                        return;
                    case 8:
                        enumC77763e03 = EnumC77763e0.TOP;
                        c50932Vp.A0Q(enumC77763e03, this.A00);
                        return;
                    case 9:
                        enumC77763e03 = EnumC77763e0.END;
                        c50932Vp.A0Q(enumC77763e03, this.A00);
                        return;
                    case 10:
                        enumC77763e03 = EnumC77763e0.BOTTOM;
                        c50932Vp.A0Q(enumC77763e03, this.A00);
                        return;
                    case 11:
                        enumC77763e03 = EnumC77763e0.LEFT;
                        c50932Vp.A0Q(enumC77763e03, this.A00);
                        return;
                    case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                        enumC77763e03 = EnumC77763e0.RIGHT;
                        c50932Vp.A0Q(enumC77763e03, this.A00);
                        return;
                    case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                        enumC77763e03 = EnumC77763e0.HORIZONTAL;
                        c50932Vp.A0Q(enumC77763e03, this.A00);
                        return;
                    case 14:
                        enumC77763e03 = EnumC77763e0.VERTICAL;
                        c50932Vp.A0Q(enumC77763e03, this.A00);
                        return;
                    case Process.SIGTERM /* 15 */:
                        enumC77763e02 = EnumC77763e0.ALL;
                        c50932Vp.A0R(enumC77763e02, this.A00);
                        return;
                    case 16:
                        enumC77763e02 = EnumC77763e0.START;
                        c50932Vp.A0R(enumC77763e02, this.A00);
                        return;
                    case 17:
                        enumC77763e02 = EnumC77763e0.TOP;
                        c50932Vp.A0R(enumC77763e02, this.A00);
                        return;
                    case 18:
                        enumC77763e02 = EnumC77763e0.END;
                        c50932Vp.A0R(enumC77763e02, this.A00);
                        return;
                    case Process.SIGSTOP /* 19 */:
                        enumC77763e02 = EnumC77763e0.BOTTOM;
                        c50932Vp.A0R(enumC77763e02, this.A00);
                        return;
                    case 20:
                        enumC77763e02 = EnumC77763e0.LEFT;
                        c50932Vp.A0R(enumC77763e02, this.A00);
                        return;
                    case 21:
                        enumC77763e02 = EnumC77763e0.RIGHT;
                        c50932Vp.A0R(enumC77763e02, this.A00);
                        return;
                    case 22:
                        enumC77763e02 = EnumC77763e0.HORIZONTAL;
                        c50932Vp.A0R(enumC77763e02, this.A00);
                        return;
                    case 23:
                        enumC77763e02 = EnumC77763e0.VERTICAL;
                        c50932Vp.A0R(enumC77763e02, this.A00);
                        return;
                    default:
                        return;
                }
            case 1:
                C14360o3.A0B(c50932Vp, 1);
                switch (((Number) this.A02).intValue()) {
                    case 0:
                        c50932Vp.A04(this.A00);
                        return;
                    case 1:
                        c50932Vp.A06(this.A00);
                        return;
                    case 2:
                        c50932Vp.A07(this.A00);
                        return;
                    case 3:
                        c50932Vp.A05(this.A00);
                        return;
                    case 4:
                        c50932Vp.A03(this.A00);
                        return;
                    case 5:
                        enumC77763e0 = EnumC77763e0.ALL;
                        break;
                    case 6:
                        enumC77763e0 = EnumC77763e0.START;
                        break;
                    case 7:
                        enumC77763e0 = EnumC77763e0.TOP;
                        break;
                    case 8:
                        enumC77763e0 = EnumC77763e0.END;
                        break;
                    case 9:
                        enumC77763e0 = EnumC77763e0.BOTTOM;
                        break;
                    case 10:
                        enumC77763e0 = EnumC77763e0.LEFT;
                        break;
                    case 11:
                        enumC77763e0 = EnumC77763e0.RIGHT;
                        break;
                    case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                        enumC77763e0 = EnumC77763e0.HORIZONTAL;
                        break;
                    case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                        enumC77763e0 = EnumC77763e0.VERTICAL;
                        break;
                    default:
                        return;
                }
                c50932Vp.A0S(enumC77763e0, this.A00);
                return;
            default:
                C14360o3.A0B(c50932Vp, 1);
                int intValue = ((Number) this.A02).intValue();
                if (intValue != 0) {
                    if (intValue != 1) {
                        if (intValue != 2) {
                            if (intValue != 3) {
                                if (intValue == 4) {
                                    float f = this.A00;
                                    C50952Vr A022 = C50932Vp.A02(c50932Vp);
                                    A022.A04 = f;
                                    long j6 = A022.A0F;
                                    if (f == 1.0f) {
                                        j5 = j6 & (-524289);
                                    } else {
                                        j5 = j6 | 524288;
                                    }
                                    A022.A0F = j5;
                                    int i2 = c50932Vp.A01;
                                    i = i2 | 4;
                                    if (f == 1.0f) {
                                        i = i2 & (-5);
                                    }
                                } else {
                                    return;
                                }
                            } else {
                                float f2 = this.A00;
                                c50932Vp.A08 = true;
                                A02 = C50932Vp.A02(c50932Vp);
                                A02.A03 = f2;
                                j3 = A02.A0F;
                                j4 = 67108864;
                            }
                        } else {
                            float f3 = this.A00;
                            c50932Vp.A08 = true;
                            A02 = C50932Vp.A02(c50932Vp);
                            A02.A02 = f3;
                            j3 = A02.A0F;
                            j4 = 33554432;
                        }
                        A02.A0F = j3 | j4;
                        return;
                    }
                    float f4 = this.A00;
                    C50952Vr A023 = C50932Vp.A02(c50932Vp);
                    A023.A01 = f4;
                    long j7 = A023.A0F;
                    if (f4 == 0.0f) {
                        j2 = j7 & (-2097153);
                    } else {
                        j2 = j7 | 2097152;
                    }
                    A023.A0F = j2;
                    int i3 = c50932Vp.A01;
                    i = i3 | 16;
                    if (f4 == 0.0f) {
                        i = i3 & (-17);
                    }
                } else {
                    float f5 = this.A00;
                    C50952Vr A024 = C50932Vp.A02(c50932Vp);
                    A024.A00 = f5;
                    long j8 = A024.A0F;
                    if (f5 == 1.0f) {
                        j = j8 & (-1048577);
                    } else {
                        j = j8 | 1048576;
                    }
                    A024.A0F = j;
                    int i4 = c50932Vp.A01;
                    i = i4 | 8;
                    if (f5 == 1.0f) {
                        i = i4 & (-9);
                    }
                }
                c50932Vp.A01 = i;
                return;
        }
    }

    public final boolean equals(Object obj) {
        if (2 - this.A01 != 0) {
            return super.equals(obj);
        }
        if (this != obj) {
            if (obj instanceof C9CT) {
                C9CT c9ct = (C9CT) obj;
                if (c9ct.A01 != 2 || this.A02 != c9ct.A02 || Float.compare(this.A00, c9ct.A00) != 0) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        if (2 - this.A01 != 0) {
            return super.hashCode();
        }
        Integer num = (Integer) this.A02;
        return ((CCJ.A00(num).hashCode() + num.intValue()) * 31) + Float.floatToIntBits(this.A00);
    }

    public final String toString() {
        String str;
        if (2 - this.A01 != 0) {
            return super.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("FloatStyleItem(field=");
        Integer num = (Integer) this.A02;
        if (num != null) {
            str = CCJ.A00(num);
        } else {
            str = "null";
        }
        sb.append(str);
        sb.append(", value=");
        sb.append(this.A00);
        sb.append(')');
        return sb.toString();
    }
}
