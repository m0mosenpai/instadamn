package X;

import com.facebook.R;
import com.facebook.common.dextricks.JITProfilePQR;
import com.instagram.react.modules.base.IgReactQEModule;

/* renamed from: X.Kmg, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46785Kmg {
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0005. Please report as an issue. */
    public static final Integer A00(Integer num) {
        int i;
        switch (AbstractC43592JPx.A03(num, 0)) {
            case 4:
            case 8:
                i = R.attr.igds_color_gradient_pink;
                return Integer.valueOf(i);
            case 5:
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                i = R.attr.igds_color_gradient_orange;
                return Integer.valueOf(i);
            case 6:
                i = R.attr.igds_color_success;
                return Integer.valueOf(i);
            case 7:
                i = R.attr.igds_color_gradient_blue;
                return Integer.valueOf(i);
            case 9:
            default:
                return null;
            case 10:
            case 11:
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
            case 14:
                i = R.attr.igds_color_gradient_purple;
                return Integer.valueOf(i);
        }
    }
}
