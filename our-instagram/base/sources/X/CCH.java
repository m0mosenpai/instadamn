package X;

import com.instagram.react.modules.base.IgReactQEModule;

/* loaded from: classes5.dex */
public abstract class CCH {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "BACKGROUND_COLOR";
            case 2:
                return "BACKGROUND_DRAWABLE";
            case 3:
                return AbstractC111324zv.A00(1599);
            case 4:
                return MSV.A00(75);
            case 5:
                return "ROTATION";
            case 6:
                return "ROTATION_X";
            case 7:
                return "ROTATION_Y";
            case 8:
                return "SCALE_X";
            case 9:
                return "SCALE_Y";
            case 10:
                return "TRANSLATION_X";
            case 11:
                return "TRANSLATION_Y";
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                return "TRANSLATION_Z";
            default:
                return "ALPHA";
        }
    }
}
