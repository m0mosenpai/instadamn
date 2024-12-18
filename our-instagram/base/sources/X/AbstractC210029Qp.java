package X;

import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.react.modules.base.IgReactQEModule;

/* renamed from: X.9Qp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC210029Qp {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "scene_capture_type";
            case 2:
                return MSV.A00(1108);
            case 3:
                return "date_time_digitized";
            case 4:
                return "software";
            case 5:
                return "maker_note";
            case 6:
                return "camera_make";
            case 7:
                return AbstractC111324zv.A00(776);
            case 8:
                return "xmp_data";
            case 9:
                return "image_description";
            case 10:
                return MSV.A00(1287);
            case 11:
                return "exposure_time";
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                return "aperture";
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                return "shutter_speed";
            case 14:
                return "focal_length";
            case Process.SIGTERM /* 15 */:
                return "flash";
            case 16:
                return "lens_model";
            case 17:
                return "metering_mode";
            case 18:
                return "focal_plane_x_resolution";
            case Process.SIGSTOP /* 19 */:
                return "focal_plane_y_resolution";
            case 20:
                return "focal_plane_resolution_unit";
            default:
                return "scene_type";
        }
    }
}
