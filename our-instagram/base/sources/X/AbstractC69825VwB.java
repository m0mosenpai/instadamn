package X;

/* renamed from: X.VwB, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC69825VwB {
    public static String A00(int i) {
        switch (i) {
            case 0:
                return "STANDARD_UNSPECIFIED";
            case 1:
                return "STANDARD_BT709";
            case 2:
                return "STANDARD_BT601_625";
            case 3:
                return "STANDARD_BT601_625_UNADJUSTED";
            case 4:
                return "STANDARD_BT601_525";
            case 5:
                return "STANDARD_BT601_525_UNADJUSTED";
            case 6:
                return "STANDARD_BT2020";
            case 7:
                return "STANDARD_BT2020_CONSTANT_LUMINANCE";
            case 8:
                return "STANDARD_BT470M";
            case 9:
                return "STANDARD_FILM";
            case 10:
                return "STANDARD_DCI_P3";
            case 11:
                return "STANDARD_ADOBE_RGB";
            default:
                return String.valueOf(i);
        }
    }

    public static String A01(int i) {
        switch (i) {
            case -1:
                return "TRANSFER_DISPLAY_P3";
            case 0:
                return "TRANSFER_UNSPECIFIED";
            case 1:
                return "TRANSFER_LINEAR";
            case 2:
            default:
                return String.valueOf(i);
            case 3:
                return "TRANSFER_SDR_VIDEO";
            case 4:
                return "TRANSFER_GAMMA2_2";
            case 5:
                return "TRANSFER_GAMMA2_6";
            case 6:
                return "TRANSFER_ST2084";
            case 7:
                return "TRANSFER_HLG";
            case 8:
                return "TRANSFER_GAMMA2_8";
        }
    }
}
