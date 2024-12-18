package X;

import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.react.modules.base.IgReactQEModule;
import org.webrtc.CameraVideoCapturer;

/* renamed from: X.Ryu, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC62085Ryu {
    public static String A00(int i) {
        if (i == 1) {
            return "SKYLIGHT_STARTUP";
        }
        if (i == 2) {
            return "SKYLIGHT_RENDER";
        }
        if (i == 3) {
            return "SKYLIGHT_PATCH_GRAPH_SYNC";
        }
        if (i == 4) {
            return "SKYLIGHT_IN_APP_TESTING";
        }
        switch (i) {
            case 7:
                return "SKYLIGHT_AUTO_SAVE_IOS";
            case 8:
                return "SKYLIGHT_PATCH_LIBRARY_LOAD";
            case 9:
                return "SKYLIGHT_BLOCK_INSTANCE_SYNC";
            case 10:
                return "SKYLIGHT_ASSET_SUMMARY_UPDATE";
            case 11:
                return "SKYLIGHT_PROJECT_OPEN";
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                return "SKYLIGHT_PROJECT_SAVE";
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                return "SKYLIGHT_PROJECT_PACKAGE_OPEN";
            case 14:
                return "SKYLIGHT_PROJECT_PACKAGE_SAVE";
            case Process.SIGTERM /* 15 */:
                return "SKYLIGHT_PROJECT_SAVE_AS";
            case 16:
                return "SKYLIGHT_PROJECT_CREATE";
            default:
                switch (i) {
                    case 18:
                        return "SKYLIGHT_PROJECT_OPEN_TOTAL";
                    case Process.SIGSTOP /* 19 */:
                        return "SKYLIGHT_PROJECT_CREATE_TOTAL";
                    case 20:
                        return "SKYLIGHT_PROJECT_WINDOW_CREATE";
                    default:
                        switch (i) {
                            case 22:
                                return "SKYLIGHT_APP_MOUSE_CLICK";
                            case 23:
                                return "SKYLIGHT_WELCOME_WINDOW_CREATE";
                            case 24:
                                return "SKYLIGHT_MENU_ITEM_CLICK";
                            case 25:
                                return "SKYLIGHT_SAMPLE_PROJECT_OPEN_TOTAL";
                            case 26:
                                return "SKYLIGHT_EFFECT_EXPORT_SETUP";
                            case 27:
                                return "SKYLIGHT_INSPECTOR_UPDATE";
                            case 28:
                                return "SKYLIGHT_ASSETS_TREE_UPDATE";
                            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                                return "SKYLIGHT_SCENE_TREE_UPDATE";
                            case 30:
                                return "SKYLIGHT_LAYERS_TREE_UPDATE";
                            case 31:
                                return "SKYLIGHT_ENGINE_TO_STUDIO_PROP_SYNC";
                            case 32:
                                return "SKYLIGHT_SYSTEM_RESOURCES";
                            case 33:
                                return "SKYLIGHT_MIRRORING_TIME";
                            case 34:
                                return "SKYLIGHT_EDITOR_TO_ENGINE_SYNC";
                            default:
                                switch (i) {
                                    case 36:
                                        return "SKYLIGHT_PATCH_EDITOR_OPENING";
                                    case 37:
                                        return "SKYLIGHT_LOGIN";
                                    case 38:
                                        return "SKYLIGHT_TEMPLATE_PROJECT_DOWNLOAD";
                                    case 39:
                                        return "SKYLIGHT_TEMPLATE_IMAGE_DOWNLOAD";
                                    case 40:
                                        return "SKYLIGHT_COMPRESSION_WORKER";
                                    default:
                                        switch (i) {
                                            case 1240:
                                                return "SKYLIGHT_GK_SAVE";
                                            case 1260:
                                                return "SKYLIGHT_PATCH_EDITOR_PORT_DRAGGING";
                                            case 1848:
                                                return "SKYLIGHT_ADD_EXPERIENCE_FLOW";
                                            case CameraVideoCapturer.CameraStatistics.CAMERA_OBSERVER_PERIOD_MS /* 2000 */:
                                                return "SKYLIGHT_LOGIN_FLOW";
                                            case 2572:
                                                return "SKYLIGHT_PATCH_EDITOR_LAYOUT";
                                            case 2738:
                                                return "SKYLIGHT_RUNTIME_SYNCHRONIZATION_RESET";
                                            case 2748:
                                                return "SKYLIGHT_COPY";
                                            case 2849:
                                                return "SKYLIGHT_GENERIC_FLOW";
                                            case 3082:
                                                return "SKYLIGHT_IMPORT_FLOW";
                                            case 3164:
                                                return "SKYLIGHT_PREVIEW_MEDIA_IMAGE_DOWNLOAD";
                                            case 3229:
                                                return "SKYLIGHT_VO_EXPORT_FLOW";
                                            case 3249:
                                                return "SKYLIGHT_USE_TEMPLATE_FLOW";
                                            case 3268:
                                                return "SKYLIGHT_FETCH_POPULAR_PLACES";
                                            case 3643:
                                                return "SKYLIGHT_REMOVE_UNUSED_ASSETS_FLOW";
                                            case 3699:
                                                return "SKYLIGHT_PATCH_EDITOR_CONN_INSERTED_PATCHES";
                                            case 3987:
                                                return "SKYLIGHT_ASSET_IMPORT";
                                            case 4663:
                                                return "SKYLIGHT_GK_FETCH";
                                            case 5031:
                                                return "SKYLIGHT_EDIT_MANUAL_CAPABILITY_FLOW";
                                            case 5163:
                                                return "SKYLIGHT_PROJECT_WINDOW_MANAGER_OPEN_DOCUMENT";
                                            case 5768:
                                                return "SKYLIGHT_SKYLIGHT_SAFE_ZONES";
                                            case 5805:
                                                return "SKYLIGHT_UPLOAD_EXPORT_EFFECT";
                                            case 5811:
                                                return "SKYLIGHT_BLOCK_EXTRACTION";
                                            case 6519:
                                                return "SKYLIGHT_HANDLE_APP_EVENT";
                                            case 6566:
                                                return "SKYLIGHT_WINDOW_RENDER";
                                            case 7048:
                                                return "SKYLIGHT_PROCESS_EXECUTION";
                                            case 7109:
                                                return "SKYLIGHT_GK_LOAD";
                                            case 7621:
                                                return "SKYLIGHT_CRASH_DUMP_CREATE";
                                            case 7722:
                                                return "SKYLIGHT_PUBLISH_UPLOAD";
                                            case 7811:
                                                return "SKYLIGHT_RUNTIME_SYNCHRONIZATION_SETUP";
                                            case 8164:
                                                return "SKYLIGHT_DI_CREATE_OBJECT";
                                            case 8448:
                                                return "SKYLIGHT_PROJECT_SYNC_UNSAVED_CHANGES";
                                            case 8522:
                                                return "SKYLIGHT_TEXTURE_COMPRESSION";
                                            case 8721:
                                                return "SKYLIGHT_UIDRIVER_GENERATE_HIERARCHY";
                                            case 8774:
                                                return "SKYLIGHT_OPEN_DOCUMENT";
                                            case 8962:
                                                return "SKYLIGHT_ADD_TRACKER_FLOW";
                                            case 9123:
                                                return "SKYLIGHT_TYPESCRIPT_DEFINITIONS_SETUP";
                                            case 9786:
                                                return "SKYLIGHT_RENDER_SETUP";
                                            case 10458:
                                                return "SKYLIGHT_PROFILER";
                                            case 11203:
                                                return "SKYLIGHT_PATCH_EDITOR_CONNECT_PORTS";
                                            case 11207:
                                                return "SKYLIGHT_COMMON_INTERFACE_STARTUP";
                                            case 11476:
                                                return "SKYLIGHT_PROFILER_STARTUP";
                                            case 11693:
                                                return "SKYLIGHT_DOCKING";
                                            case 11937:
                                                return "SKYLIGHT_EDIT_MANUAL_CAPABILITY";
                                            case 12869:
                                                return "SKYLIGHT_DUPLICATE";
                                            case 12871:
                                                return "SKYLIGHT_RUNTIME_SYNCHRONIZATION";
                                            case 13801:
                                                return "SKYLIGHT_PREVIEW_MEDIA_MEDIA_DOWNLOAD";
                                            case 14079:
                                                return "SKYLIGHT_USER_INPUT_LOOPBACK";
                                            case 14148:
                                                return "SKYLIGHT_LOGIN_REFRESH_FLOW";
                                            case 15056:
                                                return "SKYLIGHT_QML_WINDOW_CONTROLLER_CLOSING";
                                            case 15239:
                                                return "SKYLIGHT_SELECT_MEDIA_SIMULATOR_USER_FLOW";
                                            case 15443:
                                                return "SKYLIGHT_EVENT_LOSS";
                                            case 15454:
                                                return "SKYLIGHT_SCROLL_PERF";
                                            case 15841:
                                                return "SKYLIGHT_PASTE";
                                            case 15893:
                                                return "SKYLIGHT_PROJECT_SAVE_FLOW";
                                            default:
                                                return "UNDEFINED_QPL_EVENT";
                                        }
                                }
                        }
                }
        }
    }
}
