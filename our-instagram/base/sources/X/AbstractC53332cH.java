package X;

import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.forker.Process;

/* renamed from: X.2cH, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC53332cH {
    public static String A00(EnumC53322cG enumC53322cG) {
        switch (enumC53322cG.ordinal()) {
            case 3:
                return "manifest_misaligned";
            case 10:
                return "player_warning";
            case 16:
                return "prefetch_canceled";
            case 18:
            case 22:
                return "live_video_segment_download";
            case Process.SIGSTOP /* 19 */:
                return "live_video_frame_displayed";
            case 24:
                return "live_video_custom_live_trace";
            case 28:
                return "prefetch_task_queue_start";
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                return "prefetch_task_queue_exit";
            case 30:
                return "prefetch_task_queue_complete";
            case 35:
                return "prefetch_task_data_fetch_issued";
            case 36:
                return "prefetch_task_data_fetch_completed";
            case 37:
                return "vod_vps_first_data_segment_cache_check_start";
            case 38:
                return "vod_vps_first_data_segment_cache_check_end";
            case 39:
                return "prefetch_task_cache_check";
            case 40:
                return "prefetch_task_queue_inserted";
            default:
                return null;
        }
    }
}
