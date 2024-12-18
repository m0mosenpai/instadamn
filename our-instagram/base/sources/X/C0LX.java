package X;

import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.common.dextricks.StringTreeSet;
import com.facebook.forker.Process;
import com.instagram.debug.devoptions.direct.burner.BurnerSendSettingsHelper;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;

/* renamed from: X.0LX, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C0LX {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "all_app_mem_info";
            case 2:
                return "portal_app";
            case 3:
                return "analytics";
            case 4:
                return "anr_data";
            case 5:
                return "application_thread_process_state";
            case 6:
                return "app_config_info";
            case 7:
                return "app_exit_info";
            case 8:
                return "app_info";
            case 9:
                return "app_state";
            case 10:
                return "black_box";
            case 11:
                return "bluetooth_traffic";
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                return "composer_sessions";
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                return "core_dump";
            case 14:
                return "custom";
            case Process.SIGTERM /* 15 */:
                return "device_info";
            case 16:
                return "disk_info";
            case 17:
                return "extra_device_info";
            case 18:
                return "fury_traces";
            case Process.SIGSTOP /* 19 */:
                return "global_app_state";
            case 20:
                return "global_props";
            case 21:
                return "granular_exposures";
            case 22:
                return "lacrima_files";
            case 23:
                return "litho_debug_events";
            case 24:
                return "lmk_info";
            case 25:
                return "lmkd_info";
            case 26:
                return "logcat";
            case 27:
                return "logcat_intercept";
            case 28:
                return "mem_class_info";
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                return "memory";
            case 30:
                return "memory_stats";
            case 31:
                return "memory_timeline";
            case 32:
                return "mobile_config";
            case 33:
                return "msys_crash_reporter";
            case 34:
                return "nightwatch";
            case 35:
                return "oom_score";
            case 36:
                return "private_dirty_memory";
            case 37:
                return "qpl";
            case 38:
                return "runtime_permissions";
            case 39:
                return "attachment";
            case 40:
                return "systems_health_report";
            case Seq.NULL_REFNUM /* 41 */:
                return "simple_memory";
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                return "stack_traces";
            case 43:
                return "system_boot";
            case 44:
                return "system_health_stats";
            case 45:
                return "test_collector";
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                return "time_info";
            case 47:
                return "user_info";
            case 48:
                return "watermark";
            case 49:
                return "component_version";
            case BurnerSendSettingsHelper.MESSAGE_SEND_BATCH_SIZE /* 50 */:
                return "parcelable";
            case 51:
                return "stall";
            case 52:
                return "litho_message";
            case 53:
                return "wearable_info";
            case 54:
                return "wearable_session";
            case 55:
                return "anr_timer";
            case 56:
                return "ota_resources_version";
            case 57:
                return "state_post_crash";
            case 58:
                return "lmk_importance";
            case 59:
                return "memory_and_importance";
            case 60:
                return "foreground_stats";
            case 61:
                return "custom_app_data";
            case 62:
                return "faults";
            case StringTreeSet.PAYLOAD_MASK /* 63 */:
                return "lifecycle_history";
            case 64:
                return "night_watch_resources";
            case 65:
                return "app_timeout";
            case 66:
                return "native_libraries";
            case 67:
                return "native_library_update";
            case 68:
                return "battery_info";
            case 69:
                return "memory_trim";
            case 70:
                return "native_memory";
            case 71:
                return "persistent_looper_history";
            case 72:
                return "anr_message_queue";
            case 73:
                return "jest_e2e";
            case 74:
                return "touch_event";
            case 75:
                return "app_start";
            case 76:
                return "thread_local_stats";
            case 77:
                return "allocator_type";
            case 78:
                return "gpu_info";
            case 79:
                return "ux_session";
            case 80:
                return "object_count";
            case 81:
                return "user_session_switch_count";
            default:
                return "add_mem_info";
        }
    }
}
