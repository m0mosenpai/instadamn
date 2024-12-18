package X;

import com.facebook.common.dextricks.JITProfilePQR;
import com.instagram.react.modules.base.IgReactQEModule;
import kotlin.Deprecated;

@Deprecated(message = "The preferred format is [CameraDestination] and [CameraTools] (CameraConfiguration)")
/* renamed from: X.8nW, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC197018nW {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "rich-text";
            case 2:
                return "normal";
            case 3:
                return "boomerang";
            case 4:
                return "handsfree";
            case 5:
                return "igtv";
            case 6:
                return "layout";
            case 7:
                return "photobooth";
            case 8:
                return "stopmotion";
            case 9:
                return "clips_v2";
            case 10:
                return "feed";
            case 11:
                return "dual";
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                return "templates";
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                return "unknown";
            default:
                return "live";
        }
    }
}
