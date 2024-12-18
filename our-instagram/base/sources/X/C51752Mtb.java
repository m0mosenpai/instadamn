package X;

import com.facebook.R;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.facebook.common.dextricks.JITProfilePQR;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.react.modules.base.IgReactQEModule;
import java.util.Currency;
import java.util.List;

/* renamed from: X.Mtb, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51752Mtb extends C0T6 {
    public int A00;
    public int A01;
    public Object A02;
    public final int A03;

    public static boolean A00(Object obj, int i) {
        if ((obj instanceof C51752Mtb) && ((C51752Mtb) obj).A03 == i) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0027 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x000f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r3) {
        /*
            Method dump skipped, instructions count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51752Mtb.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int hashCode;
        int i;
        int i2;
        Object obj;
        int A00;
        int i3;
        int i4;
        switch (this.A03) {
            case 0:
            case 5:
            case 14:
                i3 = this.A00 * 31;
                i4 = this.A01;
                i = (i3 + i4) * 31;
                obj = this.A02;
                i2 = obj.hashCode();
                break;
            case 1:
            case 10:
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
            default:
                i3 = this.A01 * 31;
                i4 = this.A00;
                i = (i3 + i4) * 31;
                obj = this.A02;
                i2 = obj.hashCode();
                break;
            case 2:
                A00 = OR3.A00((Integer) this.A02);
                i = ((A00 * 31) + this.A01) * 31;
                i2 = this.A00;
                break;
            case 3:
            case 8:
                i = ((this.A01 * 31) + this.A00) * 31;
                obj = this.A02;
                if (obj == null) {
                    i2 = 0;
                    break;
                }
                i2 = obj.hashCode();
                break;
            case 4:
            case 9:
            case 11:
                A00 = this.A02.hashCode();
                i = ((A00 * 31) + this.A01) * 31;
                i2 = this.A00;
                break;
            case 6:
                hashCode = this.A02.hashCode();
                i = ((hashCode * 31) + this.A00) * 31;
                i2 = this.A01;
                break;
            case 7:
                Integer num = (Integer) this.A02;
                hashCode = AbstractC25230BEn.A0C(num, AbstractC53901Nsa.A00(num));
                i = ((hashCode * 31) + this.A00) * 31;
                i2 = this.A01;
                break;
        }
        return i + i2;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    public final String toString() {
        StringBuilder A1C;
        String str;
        int i;
        String str2;
        String str3;
        switch (this.A03) {
            case 2:
                A1C = AbstractC166987dD.A1C();
                A1C.append("RoundedCornerRenderData(renderType=");
                Number number = (Number) this.A02;
                if (number != null) {
                    switch (number.intValue()) {
                        case 1:
                            str = "MASK";
                            break;
                        case 2:
                            str = NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED;
                            break;
                        default:
                            str = "OVERLAY";
                            break;
                    }
                } else {
                    str = "null";
                }
                A1C.append(str);
                A1C.append(AbstractC111324zv.A00(575));
                A1C.append(this.A01);
                A1C.append(", backgroundColor=");
                i = this.A00;
                A1C.append(i);
                return AbstractC167017dG.A0p(A1C);
            case 3:
                A1C = AbstractC166987dD.A1C();
                A1C.append("CoverImage(width=");
                MSX.A1O(A1C, this.A01);
                A1C.append(this.A00);
                A1C.append(AbstractC111324zv.A00(579));
                A1C.append(this.A02);
                return AbstractC167017dG.A0p(A1C);
            case 4:
            case 5:
            default:
                return super.toString();
            case 6:
                A1C = AbstractC166987dD.A1C();
                A1C.append("MetaData(trackType=");
                A1C.append(this.A02);
                A1C.append(", deltaPx=");
                A1C.append(this.A00);
                str2 = ", trackRow=";
                A1C.append(str2);
                i = this.A01;
                A1C.append(i);
                return AbstractC167017dG.A0p(A1C);
            case 7:
                A1C = AbstractC166987dD.A1C();
                A1C.append("StackedTimelineSpeedEvent(state=");
                Integer num = (Integer) this.A02;
                if (num != null) {
                    str3 = AbstractC53901Nsa.A00(num);
                } else {
                    str3 = "null";
                }
                A1C.append(str3);
                A1C.append(", newDurationMs=");
                A1C.append(this.A00);
                str2 = ", previousDurationMs=";
                A1C.append(str2);
                i = this.A01;
                A1C.append(i);
                return AbstractC167017dG.A0p(A1C);
        }
    }

    public C51752Mtb(EnumC53170NfR enumC53170NfR, int i, int i2) {
        this.A03 = 6;
        C14360o3.A0B(enumC53170NfR, 1);
        this.A02 = enumC53170NfR;
        this.A00 = i;
        this.A01 = i2;
    }

    public C51752Mtb(Integer num, int i, int i2, int i3) {
        this.A03 = i3;
        C14360o3.A0B(num, 1);
        this.A02 = num;
        if (2 - i3 != 0) {
            this.A00 = i;
            this.A01 = i2;
        } else {
            this.A01 = i;
            this.A00 = i2;
        }
    }

    public C51752Mtb(Currency currency, int i, int i2) {
        this.A03 = 5;
        C14360o3.A0B(currency, 3);
        this.A00 = i;
        this.A01 = i2;
        this.A02 = currency;
    }

    public C51752Mtb(EnumC53152Nf7 enumC53152Nf7, int i, int i2) {
        this.A03 = 11;
        this.A02 = enumC53152Nf7;
        this.A01 = i;
        this.A00 = i2;
    }

    public C51752Mtb(C51750MtZ c51750MtZ, int i, int i2, int i3) {
        this.A03 = i3;
        C14360o3.A0B(c51750MtZ, 3);
        this.A01 = i;
        this.A00 = i2;
        this.A02 = c51750MtZ;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C51752Mtb(InterfaceC16820sZ interfaceC16820sZ) {
        this(interfaceC16820sZ, R.drawable.instagram_arrow_left_pano_outline_24, 2131963913, 10);
        this.A03 = 10;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C51752Mtb(EnumC53170NfR enumC53170NfR) {
        this(enumC53170NfR, 0, -1);
        this.A03 = 6;
    }

    public C51752Mtb(Object obj, int i, int i2, int i3) {
        this.A03 = i3;
        this.A01 = i;
        this.A00 = i2;
        this.A02 = obj;
    }

    public C51752Mtb(List list, int i, int i2, int i3) {
        this.A03 = i3;
        if (i3 != 0) {
            this.A01 = i;
            this.A00 = i2;
        } else {
            this.A00 = i;
            this.A01 = i2;
        }
        this.A02 = list;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C51752Mtb(int i, Integer num) {
        this(num, i, 0, 7);
        this.A03 = 7;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C51752Mtb(ImageUrl imageUrl) {
        this(imageUrl, 0, 0, 3);
        this.A03 = 3;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C51752Mtb() {
        this((Object) null, 0, 0, 3);
        this.A03 = 3;
        this.A03 = 3;
    }
}
