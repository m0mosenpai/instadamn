package X;

import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.react.modules.base.IgReactQEModule;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

/* renamed from: X.7bY, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C166057bY {
    public final C1QT A00;
    public final ConcurrentHashMap A01;
    public final ConcurrentHashMap A02;
    public final ConcurrentHashMap A03;
    public final UserSession A04;

    public C166057bY(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A04 = userSession;
        this.A00 = C1QS.A00(userSession);
        this.A03 = new ConcurrentHashMap();
        this.A01 = new ConcurrentHashMap();
        this.A02 = new ConcurrentHashMap();
    }

    public final void A02(EnumC120785dO enumC120785dO, EnumC40111tc enumC40111tc, String str, String str2, int i, long j, boolean z) {
        String str3;
        int ordinal;
        C14360o3.A0B(str2, 7);
        C1QT c1qt = this.A00;
        Integer num = C05F.A0Y;
        if (enumC120785dO == EnumC120785dO.VIEW_ALL_COMMENTS) {
            str3 = "post_comment_from_view_all_comments";
        } else {
            str3 = "post_comment";
        }
        long A00 = c1qt.A00(num, str3, "comment_post_click");
        ConcurrentHashMap concurrentHashMap = this.A03;
        if (concurrentHashMap.contains(str2)) {
            C0f5 AEp = C18950wb.A01.AEp("comment_user_flow_logging", 817896325);
            AEp.ABW("post_comment_flow", "Attempting to start a marker that has already started.");
            AEp.report();
            return;
        }
        concurrentHashMap.put(str2, Long.valueOf(A00));
        c1qt.flowAnnotate(A00, "analytics_module", str);
        c1qt.flowAnnotate(A00, AbstractC43591JPw.A00(403), z);
        c1qt.flowAnnotate(A00, "delay_internal", TimeUnit.MILLISECONDS.toSeconds(j));
        c1qt.flowAnnotate(A00, "comment_count", i);
        c1qt.flowAnnotate(A00, "media_type", enumC40111tc.name());
        c1qt.flowAnnotate(A00, "mvvm_comments", true);
        if (enumC120785dO == null) {
            ordinal = -1;
        } else {
            ordinal = enumC120785dO.ordinal();
        }
        String str4 = "carousel_slide_mention";
        switch (ordinal) {
            case -1:
            case 10:
                str4 = "unknown";
                break;
            case 0:
                str4 = "feed_comment_button";
                break;
            case 1:
                str4 = "view_all_comments";
                break;
            case 2:
                str4 = "notification";
                break;
            case 3:
                str4 = "feed_caption";
                break;
            case 4:
                str4 = "preview_comment";
                break;
            case 5:
                str4 = "direct_comment_share";
                break;
            case 6:
                str4 = "reels_video_comment_button";
                break;
            case 7:
                str4 = "peek_comments";
                break;
            case 8:
                str4 = "activity_feed";
                break;
            case 9:
                str4 = "visual_reply";
                break;
            case 11:
                str4 = "deep_link";
                break;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                str4 = "broadcast_channel";
                break;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
            case 14:
                break;
            case Process.SIGTERM /* 15 */:
                str4 = "story_comment_share_sticker";
                break;
            case 16:
                str4 = "comment_view_replies";
                break;
            case 17:
                str4 = "social_share_tab";
                break;
            case 18:
                str4 = "reels_preview_comment";
                break;
            case Process.SIGSTOP /* 19 */:
                str4 = "reels_social_context";
                break;
            case 20:
                str4 = "reels_social_context_bubble";
                break;
            case 21:
                str4 = "poll_indicator";
                break;
            case 22:
                str4 = "content_notes_overflow_preview";
                break;
            case 23:
                str4 = "content_notes_production_nux";
                break;
            case 24:
                str4 = "feed_social_context_bubble";
                break;
            case 25:
                str4 = "reels_inline_comment";
                break;
            case 26:
                str4 = "testimonial";
                break;
            default:
                throw new RuntimeException();
        }
        c1qt.flowAnnotate(A00, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str4);
    }

    public final void A03(String str) {
        C14360o3.A0B(str, 0);
        Number number = (Number) this.A03.get(str);
        if (number != null) {
            this.A00.flowMarkPoint(number.longValue(), "request_start");
        }
    }

    public final void A04(String str, boolean z) {
        C1QT c1qt = this.A00;
        long A00 = c1qt.A00(C05F.A0Y, "delete_comment", "comment_post_click");
        ConcurrentHashMap concurrentHashMap = this.A01;
        if (concurrentHashMap.contains(str)) {
            C0f5 AEp = C18950wb.A01.AEp("comment_user_flow_logging", 817896325);
            AEp.ABW("delete_comment_flow", "Attempting to start a marker that has already started.");
            AEp.report();
        } else {
            c1qt.flowAnnotate(A00, "mvvm_comments", z);
            concurrentHashMap.put(str, Long.valueOf(A00));
        }
    }

    public static final void A00(C166057bY c166057bY, String str, String str2, String str3, String str4, Map map) {
        Number number = (Number) map.get(str);
        if (number == null) {
            C0f5 AEp = C18950wb.A01.AEp("comment_user_flow_logging", 817896325);
            AEp.ABW(str2, "Attempted to fail marker that was never started.");
            AEp.report();
            return;
        }
        if (str3 != null && str3.length() != 0) {
            c166057bY.A00.flowAnnotate(number.longValue(), "comment_error_key", str3);
        }
        if (str4 != null && str4.length() != 0) {
            c166057bY.A00.flowAnnotate(number.longValue(), "comment_error_code", str3);
        }
        c166057bY.A00.flowEndFail(number.longValue(), str2, null);
        map.remove(str);
    }

    public static final void A01(C166057bY c166057bY, String str, String str2, Map map) {
        Number number = (Number) map.get(str);
        if (number == null) {
            C0f5 AEp = C18950wb.A01.AEp("comment_user_flow_logging", 817896325);
            AEp.ABW(str2, "Attempted to end marker that was never started.");
            AEp.report();
        } else {
            c166057bY.A00.flowEndSuccess(number.longValue());
            map.remove(str);
        }
    }
}
