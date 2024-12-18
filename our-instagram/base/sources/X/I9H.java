package X;

import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.model.androidlink.AndroidLink;
import com.instagram.react.modules.base.IgReactQEModule;

/* loaded from: classes7.dex */
public abstract class I9H {
    public static final String A00(AndroidLink androidLink) {
        Integer BNX = androidLink.BNX();
        if (BNX != null) {
            switch (((EnumC906041v) EnumC906041v.A01.get(BNX.intValue())).ordinal()) {
                case 0:
                    return "webclick";
                case 1:
                    return "appinstall";
                case 2:
                    return "deeplink";
                case 3:
                    return "phone";
                case 4:
                    return "map";
                case 5:
                    return "canvas_action";
                case 6:
                    return "leadads";
                case 7:
                    return "profilevisit";
                case 8:
                    return "clicktodirect";
                case 9:
                    return "shopping_sheet_action";
                case 10:
                    return "mini_shop_storefront";
                case 11:
                    return "shopping_pdp";
                case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                    return "mini_shop_collection";
                case 14:
                    return "igtv_channel";
                case Process.SIGTERM /* 15 */:
                    return "igtv_video";
                case 16:
                    return "clips_viewer_video";
                case 17:
                    return "audio_page";
                case 18:
                    return AbstractC111324zv.A00(2068);
                case Process.SIGSTOP /* 19 */:
                    return "ar_camera";
                case 20:
                    return "organic_shop_collection";
                case 21:
                    return "join_channel";
                default:
                    throw B4Z.A00();
            }
        }
        return "";
    }
}
