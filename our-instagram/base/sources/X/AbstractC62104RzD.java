package X;

import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.forker.Process;
import com.instagram.react.modules.base.IgReactQEModule;

/* renamed from: X.RzD, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC62104RzD {
    public static String A00(int i) {
        if (i == 5) {
            return "THREED_PHOTOS_GLB_CREATION";
        }
        if (i == 14) {
            return "THREED_PHOTOS_PROCESSOR_PROCESS";
        }
        if (i == 31) {
            return "THREED_PHOTOS_RESIZE_FALLBACK_PHOTO";
        }
        if (i == 33) {
            return "THREED_PHOTOS_RENDERER_CREATED";
        }
        if (i == 2084) {
            return "THREED_PHOTOS_FB4A_RENDERER_E2E";
        }
        if (i == 11245) {
            return "THREED_PHOTOS_MODEL_DOWNLOAD";
        }
        if (i == 13894) {
            return "THREED_PHOTOS_PHOTO3D_CREATION_USER_FLOW";
        }
        if (i == 14366) {
            return "THREED_PHOTOS_DEPTH_PHOTO_PROCESSOR";
        }
        switch (i) {
            case 10:
                return "THREED_PHOTOS_CNN_DEPTH_GENERATION";
            case 11:
                return "THREED_PHOTOS_VOLTRON_DOWNLOAD_ANDROID";
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                return "THREED_PHOTOS_PARSE_DEPTH_DATA";
            default:
                switch (i) {
                    case 17:
                        return "THREED_PHOTOS_PROCESSOR_INIT_DEEP_IMAGE";
                    case 18:
                        return "THREED_PHOTOS_PROCESSOR_FIX_DEPTH_CC";
                    case Process.SIGSTOP /* 19 */:
                        return "THREED_PHOTOS_PROCESSOR_BOUNDARY_INIT";
                    case 20:
                        return "THREED_PHOTOS_PROCESSOR_SHRINK_FOREGROUND";
                    case 21:
                        return "THREED_PHOTOS_PROCESSOR_EXPAND_BACKGROUND";
                    default:
                        switch (i) {
                            case 23:
                                return "THREED_PHOTOS_PROCESSOR_EXPAND_OUTSIDE_IN_PLACE";
                            case 24:
                                return "THREED_PHOTOS_PROCESSOR_CREATE_ATLAS";
                            case 25:
                                return "THREED_PHOTOS_PROCESSOR_INPAINT_ATLAS";
                            case 26:
                                return "THREED_PHOTOS_PROCESSOR_PAD_ATLAS";
                            case 27:
                                return "THREED_PHOTOS_PROCESSOR_CREATE_MESH";
                            case 28:
                                return "THREED_PHOTOS_PROCESSOR_ADD_FRAME";
                            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                                return "THREED_PHOTOS_CREATION_E2E";
                            default:
                                return "UNDEFINED_QPL_EVENT";
                        }
                }
        }
    }
}
