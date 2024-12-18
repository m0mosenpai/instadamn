package X;

import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;

/* renamed from: X.4AA, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4AA {
    public final C006802i A00;

    public C4AA(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = C006802i.A0p;
    }

    public final void A00(Integer num) {
        String str;
        C006802i c006802i = this.A00;
        c006802i.markerStart(275915176);
        switch (num.intValue()) {
            case 0:
                str = "direct_notes_tray";
                break;
            case 1:
                str = "content_note";
                break;
            case 2:
                str = "friends_map_note";
                break;
            case 3:
                str = "profile_wall";
                break;
            case 4:
                str = "profile_note";
                break;
            case 5:
                str = "feed_netego";
                break;
            default:
                str = "music_note_reshare";
                break;
        }
        c006802i.markerAnnotate(275915176, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str);
    }
}
