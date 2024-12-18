package X;

import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.react.modules.base.IgReactQEModule;

/* renamed from: X.9ve, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC224539ve {
    public static String A00(int i) {
        switch (i) {
            case 0:
                return "fba_ok";
            case 1:
                return "fba_invalid";
            case 2:
                return "fba_plugin_not_found";
            case 3:
                return "fba_plugin_not_configured";
            case 4:
                return "fba_pending";
            case 5:
                return "fba_uninitialized";
            case 6:
                return "fba_invalid_num_inputs";
            case 7:
                return "fba_invalid_num_outputs";
            case 8:
                return "fba_invalid_num_channels";
            case 9:
                return "fba_invalid_params";
            case 10:
                return "fba_param_not_found";
            case 11:
                return "fba_node_connected";
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                return "fba_stream_started";
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                return "fba_stream_not_started";
            case 14:
                return "fba_eos";
            case Process.SIGTERM /* 15 */:
                return "fba_java_vm_already_set";
            case 16:
                return "fba_device_node_exists";
            case 17:
                return "fba_file_open_failed";
            case 18:
                return "fba_graph_full";
            case Process.SIGSTOP /* 19 */:
                return "fba_queue_full";
            case 20:
                return "fba_empty";
            case 21:
                return "fba_read_only";
            case 22:
                return "fba_unsupported";
            case 23:
                return "fba_unsupported_sample_rate";
            case 24:
                return "fba_unsupported_buffer_size";
            case 25:
                return "fba_unsupported_format";
            case 26:
                return "fba_needs_permission";
            case 27:
                return "fba_not_found";
            case 28:
                return "fba_bad_alloc";
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                return "fba_device_not_found";
            case 30:
                return "fba_busy";
            case 31:
                return "fba_plugin_dynamic_load_failed";
            case 32:
                return "fba_interface_uninitialized";
            case 33:
                return "fba_max_num_sample_rates_exceeded";
            case 34:
                return "fba_error";
            case 35:
                return "fba_timeout";
            case 36:
                return "FBA_STATUS_COUNT";
            default:
                return String.valueOf(i);
        }
    }
}
