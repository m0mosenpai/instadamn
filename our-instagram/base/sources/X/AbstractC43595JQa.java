package X;

import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.react.modules.base.IgReactQEModule;

/* renamed from: X.JQa, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC43595JQa {
    public static final String A00(int i) {
        switch (i) {
            case 1:
                return "notif_received_sync";
            case 2:
                return "notif_revoked";
            case 3:
                return "notif_suppressed";
            case 4:
                return "notif_logged_out_user";
            case 5:
                return "notif_displayed";
            case 6:
                return "notif_duplicate_dropped";
            case 7:
                return "notif_error";
            case 8:
                return "notif_sync_gen";
            case 9:
                return "notif_sync_sent";
            case 10:
                return "notif_engine_processing_app_layer_stage";
            case 11:
                return "notif_engine_processing_callback_stage";
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                return "notif_engine_processing_core_stage";
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                return "notif_engine_processing_integrator_stage";
            case 14:
                return "notif_clicked";
            case Process.SIGTERM /* 15 */:
                return "notif_dismissed";
            case 16:
                return "notif_enqueued_for_display";
            case 17:
                return "notif_received_push_hpke_encrypted";
            case 18:
                return "notif_hpke_decryption_failed";
            case Process.SIGSTOP /* 19 */:
                return "notif_fcm_deleted";
            case 20:
                return "notif_received_push_compressed";
            default:
                return "notif_decompression_failed";
        }
    }
}
