package X;

import android.os.Bundle;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.NtC, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC53939NtC {
    public static final N6M A00(C22P c22p, C22P c22p2, UserSession userSession, EnumC76383bi enumC76383bi, Boolean bool, String str, String str2, String str3, String str4, String str5, String str6, List list, List list2, List list3, List list4, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        N6M n6m = new N6M();
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putParcelableArrayList("ClipsConstants.ARG_CLIPS_PEOPLE_TAG_LIST", AbstractC166987dD.A1F(list));
        A0b.putString("ClipsConstants.ARG_CLIPS_COLLABORATOR_TAG_ID", str);
        A0b.putStringArrayList("ClipsConstants.ARG_CLIPS_COLLABORATOR_TAG_IDS", AbstractC166987dD.A1F(list2));
        A0b.putParcelableArrayList("ClipsConstants.ARG_CLIPS_FB_USER_TAG_LIST", AbstractC166987dD.A1F(list4));
        A0b.putSerializable("ARGS_PRESELECTED_AUDIENCE", enumC76383bi);
        AbstractC31173DnH.A1C(A0b, userSession);
        A0b.putString("ClipsConstants.ARG_CLIPS_SHARE_SHEET_DRAFT_INFO_SESSION_ID", str2);
        A0b.putSerializable("ClipsConstants.ARG_CLIPS_SHARE_CAMERA_ENTRY_POINT ", c22p);
        if (list3 != null) {
            A0b.putStringArrayList("ClipsConstants.ARG_CLIPS_CONFIRMED_COLLABORATOR_TAG_IDS", AbstractC166987dD.A1F(list3));
        }
        if (str6 != null) {
            A0b.putString("ClipsConstants.ARG_CLIPS_MEDIA_ID", str6);
        }
        if (str4 != null) {
            A0b.putString("ClipsConstants.ARG_CLIPS_SHARE_SHEET_PENDING_MEDIA_KEY", str4);
        }
        if (str3 != null) {
            A0b.putString("ClipsConstants.ARG_CLIPS_SHARE_SHEET_VIDEO_PREVIEW_URL", str3);
        }
        A0b.putString("ClipsConstants.ARG_CLIPS_SHARE_SHEET_AUDIO_CLUSTER_ID_FOR_COLLAB_CHECK", str5);
        A0b.putBoolean("ClipsConstants.ARG_CLIPS_SHARE_SHEET_IS_EXCLUSIVE_REELS", z);
        A0b.putBoolean("ClipsConstants.ARG_CLIPS_SHARE_SHEET_IS_CONTENT_SCHEDULING_MEDIA", z2);
        A0b.putBoolean("ARG_CLIPS_SHARE_SHEET_IS_ADD_COLLABORATORS_MODE", z3);
        A0b.putBoolean("ARG_CLIPS_IS_ADD_COLLABORATORS_MODE_ENABLED_FOR_EDITIONS", z6);
        if (c22p2 != null) {
            A0b.putSerializable("ClipsConstants.ARG_CLIPS_SHARE_SHEET_ENTRY_POINT ", c22p2);
        }
        if (bool != null) {
            A0b.putBoolean("ClipsConstants.ARG_IS_CLIPS_ENTRY_POINT", bool.booleanValue());
        }
        A0b.putBoolean("ARG_CLIPS_SHARE_SHEET_IS_TRIAL_REEL", z4);
        A0b.putBoolean("ARG_CLIPS_SHARE_SHEET_HAS_CLIPS_SPINS", z5);
        n6m.setArguments(A0b);
        return n6m;
    }
}
