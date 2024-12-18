package X;

import android.app.Activity;
import android.graphics.RectF;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.creation.cameraconfiguration.CameraConfiguration;
import com.instagram.modal.TransparentModalActivity;
import com.instagram.model.direct.camera.DirectCameraViewModel;
import java.io.IOException;

/* renamed from: X.Kn9, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46814Kn9 {
    public static final void A00(RectF rectF, Fragment fragment, FragmentActivity fragmentActivity, C22P c22p, UserSession userSession, CameraConfiguration cameraConfiguration, AnonymousClass442 anonymousClass442, InterfaceC1119353f interfaceC1119353f, DirectCameraViewModel directCameraViewModel, C3o9 c3o9, Boolean bool, String str, String str2, String str3) {
        if (fragment.getContext() == null) {
            C0w9.A03("IgDirectThreadCameraNavigatorUtil", "Fragment Context is null!");
            return;
        }
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putParcelable("DirectReplyCameraFragments.ARG_REPLY_VIEW_MODEL", directCameraViewModel);
        AbstractC189688an.A00(c22p);
        A0b.putSerializable("DirectReplyCameraFragments.ARG_REPLY_ENTRY_POINT", c22p);
        A0b.putString("DirectReplyCameraFragments.ARG_REPLY_SEND_ATTRIBUTION", str2);
        A0b.putParcelable("DirectQuickReplyCameraFragment.REPLY_CAM_ARG_CAMERA_INIT_CONFIG", cameraConfiguration);
        if (rectF != null) {
            A0b.putParcelable("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_ENTRY_VIEW_BOUNDS", rectF);
        }
        if (str3 != null) {
            A0b.putString("DirectQuickReplyCameraFragment.REPLY_CAM_ARG_CAMERA_AR_EFFECT_ID", str3);
        }
        if (c3o9 != null) {
            AbstractC43826JZo.A01(A0b, c3o9, "DirectStoryViewerFragment.ARGUMENTS_THREAD_KEY");
        }
        if (anonymousClass442 != null) {
            try {
                A0b.putString("DirectReplyCameraFragments.REPLY_CAM_ARG_REPLIED_TO_MESSAGE", AbstractC43642JSa.A00(anonymousClass442));
            } catch (IOException unused) {
            }
        }
        if (bool != null) {
            A0b.putBoolean("DirectReplyCameraFragments.REPLY_CAM_ARG_INSERT_RAVEN_MEDIA_IN_COMPOSER", bool.booleanValue());
        }
        C6XJ A02 = C6XJ.A02((Activity) AbstractC13320mI.A00(fragmentActivity, Activity.class), A0b, userSession, TransparentModalActivity.class, str);
        A02.A0E(interfaceC1119353f);
        A02.A0A(fragment.getActivity(), 101);
        fragmentActivity.overridePendingTransition(0, 0);
    }
}
