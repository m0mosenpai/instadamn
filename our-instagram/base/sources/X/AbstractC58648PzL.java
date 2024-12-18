package X;

import com.facebook.common.dextricks.JITProfilePQR;
import com.instagram.react.modules.base.IgReactQEModule;

/* renamed from: X.PzL, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC58648PzL {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 0:
                return "TRANSCODER_QUEUE";
            case 1:
                return "VIDEO_TRANSCODER";
            case 2:
                return "PLAYER_VIDEO_DEMUX_DECODE";
            case 3:
                return "VIDEO_DEMUX_DECODE";
            case 4:
                return "VIDEO_ENCODE_MUX";
            case 5:
                return "UPLOADER_FLOW";
            case 6:
                return "UPLOADER_NETWORK_CHANGE";
            case 7:
                return "FB_UPLOADER";
            case 8:
                return "TRANSCODER_REVERSAL_QUEUE";
            case 9:
                return "PLAYER_TRANSCODER_REVERSAL_QUEUE";
            case 10:
                return "PLAYER_PRELOAD_QUEUE";
            case 11:
                return "PLAYER_AUDIO_PRELOAD_QUEUE";
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                return "AUDIO_PRELOAD_QUEUE";
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                return "QUALITY_SCORE";
            case 14:
                return "SMART_CREATION_SDK";
            default:
                return "MEDIA_ACCURACY";
        }
    }
}
