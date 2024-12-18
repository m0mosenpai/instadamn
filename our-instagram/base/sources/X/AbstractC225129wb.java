package X;

import com.instagram.react.modules.base.IgReactQEModule;

/* renamed from: X.9wb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC225129wb {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "POSITION_ALL";
            case 2:
                return "POSITION_START";
            case 3:
                return "POSITION_TOP";
            case 4:
                return "POSITION_END";
            case 5:
                return "POSITION_BOTTOM";
            case 6:
                return "POSITION_LEFT";
            case 7:
                return "POSITION_RIGHT";
            case 8:
                return "POSITION_HORIZONTAL";
            case 9:
                return "POSITION_VERTICAL";
            case 10:
                return "GAP_COLUMN";
            case 11:
                return "GAP_ROW";
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                return "GAP_ALL";
            default:
                return "FLEX_BASIS";
        }
    }
}
