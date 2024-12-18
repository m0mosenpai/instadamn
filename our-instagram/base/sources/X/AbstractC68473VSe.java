package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;

/* renamed from: X.VSe, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68473VSe {
    public static final void A00(EnumC33493ErS enumC33493ErS, VHh vHh, UserSession userSession, String str) {
        C18920wW A02 = AbstractC12220kQ.A02(userSession);
        InterfaceC02590Ai A00 = A02.A00(A02.A00, "direct_thread_null_state_action");
        if (A00.isSampled()) {
            A00.AAP(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str);
            A00.AAP(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, "null_state");
            A00.A8R(enumC33493ErS, "action");
            A00.A8R(vHh, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
            A00.Cht();
        }
    }
}
