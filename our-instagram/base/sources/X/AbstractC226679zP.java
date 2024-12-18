package X;

import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.react.modules.base.IgReactQEModule;

/* renamed from: X.9zP, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC226679zP {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "library";
            case 2:
                return "3rd_party";
            case 3:
                return "archive_reel_share";
            case 4:
                return "poll_result_share";
            case 5:
                return AbstractC111324zv.A00(1215);
            case 6:
                return "feed_post_reshare";
            case 7:
                return "reel_clips_reshare";
            case 8:
                return "reel_igtv_reshare";
            case 9:
                return "visual_reply_remix";
            case 10:
                return AbstractC111324zv.A00(5142);
            case 11:
                return "archive_on_this_day_reshare";
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                return "activity_feed_on_this_day_reshare";
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                return AbstractC111324zv.A00(4186);
            case 14:
                return AbstractC111324zv.A00(1133);
            case Process.SIGTERM /* 15 */:
                return AbstractC111324zv.A00(5104);
            case 16:
                return AbstractC111324zv.A00(5383);
            case 17:
                return AbstractC111324zv.A00(3301);
            case 18:
                return "shoutout_share";
            case Process.SIGSTOP /* 19 */:
                return "guide_share";
            case 20:
                return "voting_share";
            case 21:
                return AbstractC43591JPw.A00(1081);
            case 22:
                return "info_center_fact_share";
            case 23:
                return "standalone_fundraiser_sticker_from_bloks";
            case 24:
                return AbstractC111324zv.A00(4522);
            case 25:
                return "remix_reply_reshare";
            case 26:
                return "unknown";
            default:
                return "camera";
        }
    }
}
