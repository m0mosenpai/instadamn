package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.cameraspec.CameraSpec;

/* loaded from: classes4.dex */
public abstract class A35 {
    public static final C50870Me1 A00(C52134N5i c52134N5i) {
        C14360o3.A0B(c52134N5i, 0);
        UserSession A06 = C023409i.A0A.A06(c52134N5i.requireArguments());
        FragmentActivity requireActivity = c52134N5i.requireActivity();
        Fragment fragment = c52134N5i.mParentFragment;
        if (fragment == null) {
            fragment = c52134N5i;
        }
        CameraSpec cameraSpec = (CameraSpec) AbstractC153636vY.A00(c52134N5i.requireArguments(), CameraSpec.class, "camera_spec");
        String A01 = AbstractC153636vY.A01(c52134N5i.requireArguments(), "clips_session_id");
        return (C50870Me1) new C52942bb(new C52329NDs(fragment, requireActivity, new C26086BgF(C9JF.A00(c52134N5i.requireArguments().getString("auto_created_source_acr_type")), (Long) null, (Long) null, c52134N5i.requireArguments().getString("auto_created_collection_id")), A06, (C1810981l) new C52942bb(new C1810881k(c52134N5i.requireActivity(), A06, false, false), c52134N5i.requireActivity()).A00(C1810981l.class), cameraSpec, A01, c52134N5i.requireArguments().getIntegerArrayList("predefined_video_highlights_start_time_in_ms"), c52134N5i.requireArguments().getInt("prefilled_reels_duration_in_ms"), c52134N5i.requireArguments().getBoolean("should_use_max_duration"), c52134N5i.requireArguments().getBoolean("should_close_camera_on_exit")), c52134N5i).A00(C50870Me1.class);
    }
}
