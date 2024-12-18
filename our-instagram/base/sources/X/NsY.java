package X;

import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment;
import com.instagram.creation.capture.quickcapture.sundial.edit.model.ClipsTimelineEditorConfig;

/* loaded from: classes9.dex */
public abstract class NsY {
    public static final ClipsStackedTimelineFragment A00(UserSession userSession, TargetViewSizeProvider targetViewSizeProvider, EnumC222689s9 enumC222689s9, EnumC222759sG enumC222759sG, ClipsTimelineEditorConfig clipsTimelineEditorConfig, C5JK c5jk, String str, String str2, boolean z, boolean z2) {
        C183348Bh A00 = AbstractC183338Bg.A00(userSession);
        C1QT c1qt = A00.A0J;
        long j = A00.A0A;
        AHF ahf = new AHF(c1qt);
        ahf.A01 = j;
        ahf.A04("launch_stacked_timeline");
        Bundle A0b = AbstractC166987dD.A0b();
        AbstractC03240Dh.A00(A0b, userSession);
        A0b.putSerializable("ARG_CLIPS_CREATION_TYPE", c5jk);
        A0b.putSerializable("ARG_EDITOR_TRANSITION_SOURCE", enumC222689s9);
        A0b.putSerializable("ARG_EDITOR_CONFIG", clipsTimelineEditorConfig);
        A0b.putString("ARG_SELECTED_STICKER_ID", null);
        A0b.putString("ARG_SELECTED_AUDIO_ID", str);
        A0b.putBoolean("ARG_SWIPE_TO_ENTER_TIMELINE", z);
        A0b.putParcelable("ARG_TARGET_VIEW_SIZE_PROVIDER", targetViewSizeProvider);
        A0b.putSerializable("ARG_OPEN_TIMELINE_STATE", enumC222759sG);
        A0b.putString("ARG_CLIPS_DRAFT_SESSION_ID", str2);
        A0b.putBoolean("ARG_IS_BASEL", z2);
        ClipsStackedTimelineFragment clipsStackedTimelineFragment = new ClipsStackedTimelineFragment();
        clipsStackedTimelineFragment.setArguments(A0b);
        return clipsStackedTimelineFragment;
    }
}
