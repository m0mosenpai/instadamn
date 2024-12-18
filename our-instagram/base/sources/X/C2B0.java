package X;

import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.react.modules.base.IgReactQEModule;
import java.util.List;

/* renamed from: X.2B0, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C2B0 {
    public static List A00;
    public static List A01;
    public static boolean A02;

    public static final boolean A00(Integer num) {
        String str;
        C14360o3.A0B(num, 0);
        if (num != C05F.A00) {
            List list = A01;
            switch (num.intValue()) {
                case 0:
                    str = "SPECIAL VALUE WHEN WE SHIP IN CODE";
                    break;
                case 1:
                    str = "PreCaptureDialViewComponent";
                    break;
                case 2:
                    str = "ShoppingPreCaptureComponent";
                    break;
                case 3:
                    str = "PreCaptureTimeHandler";
                    break;
                case 4:
                    str = "PostCaptureTimeHandler";
                    break;
                case 5:
                    str = "GalleryControllerDelegate";
                    break;
                case 6:
                    str = "FlmConsentComponent";
                    break;
                case 7:
                    str = "MusicPrecaptureController";
                    break;
                case 8:
                    str = "CameraStickyToastComponent";
                    break;
                case 9:
                    str = "SmartCaptureComponent";
                    break;
                case 10:
                    str = "PhotoDumpPilesComponent";
                    break;
                case 11:
                    str = "LayoutPostCaptureComponent";
                    break;
                case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                    str = "MediaTransformGestureController";
                    break;
                case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                    str = "DualControllerComponent";
                    break;
                case 14:
                    str = "IgLiveComposeComponent";
                    break;
                case Process.SIGTERM /* 15 */:
                    str = "DecorBitmapHelper";
                    break;
                case 16:
                    str = "CaptureRuleSystemComponent_2";
                    break;
                case 17:
                    str = "PostCaptureCameraEffectFacade";
                    break;
                case 18:
                    str = "CrosspostingBloksUpsellManagerProvider";
                    break;
                case Process.SIGSTOP /* 19 */:
                    str = "EffectSliderController";
                    break;
                case 20:
                    str = "TextModeComposerComponent";
                    break;
                case 21:
                    str = "SwipeFilterGestureListener";
                    break;
                case 22:
                    str = "SafeClipsCaptureControllerDelegate";
                    break;
                case 23:
                    str = "CameraDestinationInterceptorController";
                    break;
                case 24:
                    str = "OffensiveContentWarningController";
                    break;
                case 25:
                    str = "CameraToolMenuComponent";
                    break;
                case 26:
                    str = "GenericEffectPickerController";
                    break;
                case 27:
                    str = "ClipsRemixController";
                    break;
                case 28:
                    str = "MiniGalleryComponent";
                    break;
                case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                    str = "AlignmentGuidesChromeController";
                    break;
                case 30:
                    str = "TooltipController";
                    break;
                case 31:
                    str = "VisibilityController";
                    break;
                case 32:
                    str = "PreCaptureButtonManager";
                    break;
                default:
                    str = "CameraEffectFacade";
                    break;
            }
            if (!list.contains(str) && !A00.contains(str)) {
                return false;
            }
        }
        return true;
    }

    static {
        C16930sl c16930sl = C16930sl.A00;
        A01 = c16930sl;
        A00 = c16930sl;
    }
}
