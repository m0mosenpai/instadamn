package X;

import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.react.modules.base.IgReactQEModule;

/* loaded from: classes5.dex */
public abstract class CL6 {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 0:
                return "ButtonMediumHeight";
            case 1:
                return "ButtonLargeHeight";
            case 2:
                return "ButtonMediumCornerRadius";
            case 3:
                return "ButtonLargeCornerRadius";
            case 4:
                return "ButtonSmallPaddingHorizontal";
            case 5:
                return "ButtonMediumPaddingHorizontal";
            case 6:
                return "ButtonLargePaddingHorizontal";
            case 7:
                return "ButtonNoOutlineBorderWidth";
            case 8:
                return "ConsentSecondaryButtonOutlineBorderWidth";
            case 9:
                return "TextInputCornerRadius";
            case 10:
                return "TextInputMinHeight";
            case 11:
                return "TextInputMediumPadding";
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                return "TextInputEndPadding";
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                return "TextInputVerticalPadding";
            case 14:
                return "TextInputAddOnToInputSpacing";
            case Process.SIGTERM /* 15 */:
                return "TextInputIconButtonEndAddOnCornerRadius";
            case 16:
                return "TextInputIconButtonEndAddOnHeight";
            case 17:
                return "TextInputIconButtonEndAddOnWidth";
            case 18:
                return "MoreInputIconButtonEndAddOnCornerRadius";
            case Process.SIGSTOP /* 19 */:
                return "MoreInputIconButtonEndAddOnHeight";
            case 20:
                return "MoreInputIconButtonEndAddOnWidth";
            case 21:
                return "MoreInputIconButtonEndAddOnPaddingHorizontal";
            default:
                return "TextInputIconButtonEndAddOnPaddingHorizontal";
        }
    }
}
