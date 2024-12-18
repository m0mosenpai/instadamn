package X;

import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.instagram.react.modules.base.IgReactQEModule;

/* renamed from: X.Ruw, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC61864Ruw {
    public static String A00(int i) {
        if (i == 15) {
            return "CAMERA_PERF_TIME_TO_FIRST_FRAME";
        }
        if (i == 16) {
            return "CAMERA_PERF_CAPTURE_PHOTO";
        }
        if (i == 21) {
            return "CAMERA_PERF_TIME_TO_FIRST_FRAME_AFTER_CAMERA_OPEN";
        }
        if (i == 22) {
            return "CAMERA_PERF_CAPTURE_PHOTO_OS";
        }
        if (i == 35) {
            return "CAMERA_PERF_CAPTURE_PHOTO_PREVIEW";
        }
        if (i == 36) {
            return "CAMERA_PERF_CAPTURE_PHOTO_NATIVE";
        }
        if (i == 43) {
            return "CAMERA_PERF_RECORDING";
        }
        if (i == 44) {
            return "CAMERA_PERF_AUDIOPIPELINE_INIT";
        }
        switch (i) {
            case 2:
                return "CAMERA_PERF_CAPTURE_IMAGE";
            case 3:
                return "CAMERA_PERF_START_AUDIO_SESSION";
            case 4:
                return "CAMERA_PERF_START_CAMERA_SESSION";
            case 5:
                return "CAMERA_PERF_START_RECORDING_VIDEO";
            case 6:
                return "CAMERA_PERF_STOP_RECORDING_VIDEO";
            case 7:
                return "CAMERA_PERF_UPDATE_CAPTURE_DEVICE_POSITION";
            default:
                switch (i) {
                    case 11:
                        return "CAMERA_PERF_STOP_AUDIO_SESSION";
                    case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                        return "CAMERA_PERF_STOP_CAMERA_SESSION";
                    case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                        return "CAMERA_PERF_START_AUDIO_AND_CAMERA_SESSION";
                    default:
                        switch (i) {
                            case 25:
                                return "CAMERA_PERF_HW_START_CAMERA_SESSION";
                            case 27:
                                return "CAMERA_PERF_HW_TIME_TO_FIRST_FRAME_AFTER_CAMERA_OPEN";
                            case 3328:
                                return "CAMERA_PERF_FC_CAMERA_SWITCH";
                            case 4403:
                                return "CAMERA_PERF_FC_CAPTURE_PHOTO";
                            case 4729:
                                return "CAMERA_PERF_ONECAMERA_CONNECT";
                            case 7672:
                                return "CAMERA_PERF_FC_LOGGING_OVERHEAD";
                            case 7774:
                                return "CAMERA_PERF_CAMERA_1_ENFORCED_FOR_TESTING";
                            case 8764:
                                return "CAMERA_PERF_ONECAMERA_CREATION";
                            case 9699:
                                return "CAMERA_PERF_FC_POST_CAPTURE_VIDEO";
                            case 10348:
                                return "CAMERA_PERF_DUMMY_AR_LOGGER";
                            case 11618:
                                return "CAMERA_PERF_FC_POST_CAPTURE_PHOTO";
                            case 11788:
                                return "CAMERA_PERF_FC_RECORDING";
                            case 14300:
                                return "CAMERA_PERF_CAPTURE_COORDINATOR_TIME_TO_FIRST_FRAME";
                            case 15276:
                                return "CAMERA_PERF_FC_CAMERA_SESSION";
                            case 15644:
                                return "CAMERA_PERF_FC_CAMERA_OPEN";
                            default:
                                switch (i) {
                                    case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                                        return "CAMERA_PERF_PREPARE_CAMERA_SESSION";
                                    case 30:
                                        return "CAMERA_PERF_START_CAMERA_SESSION_TO_FIRST_HARDWARE_FRAME";
                                    case 31:
                                        return "CAMERA_PERF_FIRST_HARDWARE_FRAME_TO_FIRST_USER_FRAME";
                                    case 32:
                                        return "CAMERA_PERF_CAPTURE_POST_PHOTO";
                                    default:
                                        return "UNDEFINED_QPL_EVENT";
                                }
                        }
                }
        }
    }
}
