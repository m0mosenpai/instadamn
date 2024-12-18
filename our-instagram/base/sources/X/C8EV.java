package X;

import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import org.webrtc.MediaStreamTrack;

/* renamed from: X.8EV, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8EV {
    public final InterfaceC11380iw A00;
    public final UserSession A01;

    public C8EV(InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(interfaceC11380iw, 2);
        this.A01 = userSession;
        this.A00 = interfaceC11380iw;
    }

    public static final void A00(C8EV c8ev, Integer num, Integer num2, Integer num3, Long l, String str) {
        String str2;
        String str3;
        UserSession userSession = c8ev.A01;
        C18920wW A01 = AbstractC12220kQ.A01(c8ev.A00, userSession);
        InterfaceC02590Ai A00 = A01.A00(A01.A00, "ig_sticker_anything_action_event");
        if (A00.isSampled()) {
            A00.AAP("action", str);
            String str4 = ((C22F) AnonymousClass229.A01(userSession)).A04.A0L;
            if (str4 == null) {
                str4 = "";
            }
            A00.AAP("camera_session_id", str4);
            switch (num.intValue()) {
                case 0:
                    str2 = "photo_post";
                    break;
                case 1:
                    str2 = "gallery";
                    break;
                case 2:
                    str2 = "story";
                    break;
                case 3:
                    str2 = "clip";
                    break;
                default:
                    str2 = "";
                    break;
            }
            A00.AAP("surface", str2);
            A00.A9K("num_of_dots_in_manual_seg", l);
            String str5 = null;
            if (num2 != null) {
                if (1 - num2.intValue() != 0) {
                    str3 = "photo";
                } else {
                    str3 = MediaStreamTrack.VIDEO_TRACK_KIND;
                }
            } else {
                str3 = null;
            }
            A00.AAP("media_type", str3);
            if (num3 != null) {
                str5 = AbstractC46682Kkz.A00(num3);
            }
            A00.AAP(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str5);
            A00.Cht();
        }
    }

    public static final void A01(C8EV c8ev, String str) {
        A00(c8ev, C05F.A0Y, null, null, null, str);
    }
}
