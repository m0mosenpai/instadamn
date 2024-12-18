package X;

import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.react.modules.base.IgReactQEModule;

/* renamed from: X.9Nh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC209259Nh {
    public static final int[] A02(EnumC209229Ne enumC209229Ne) {
        C14360o3.A0B(enumC209229Ne, 0);
        int[] iArr = (int[]) EnumC209229Ne.A00.get(enumC209229Ne);
        if (iArr == null) {
            return new int[2];
        }
        return iArr;
    }

    public static final int A00(EnumC209229Ne enumC209229Ne) {
        int ordinal;
        if (enumC209229Ne == null) {
            ordinal = -1;
        } else {
            ordinal = enumC209229Ne.ordinal();
        }
        switch (ordinal) {
            case 0:
                return -8519535;
            case 1:
                return -6094770;
            case 2:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            default:
                return -14277082;
            case 3:
                return -2660595;
            case 4:
                return -13130240;
            case 11:
                return -6092870;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                return -1226410;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                return -160462;
            case 14:
                return -2973647;
            case Process.SIGTERM /* 15 */:
                return -10960094;
            case 16:
                return -16738826;
        }
    }

    public static final EnumC209229Ne A01(EnumC209229Ne enumC209229Ne, Integer num, Integer num2) {
        if (num != null && num2 != null) {
            for (EnumC209229Ne enumC209229Ne2 : EnumC209229Ne.values()) {
                int[] iArr = (int[]) EnumC209229Ne.A00.get(enumC209229Ne2);
                if (iArr != null && iArr[0] == num.intValue() && iArr[1] == num2.intValue()) {
                    return enumC209229Ne2;
                }
            }
        }
        return enumC209229Ne;
    }
}
