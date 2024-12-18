package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.modal.ModalActivity;

/* renamed from: X.Wlq, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70982Wlq implements GYB {
    public final Fragment A00;
    public final InterfaceC11380iw A01;
    public final UserSession A02;

    @Override // X.GYB
    public final void CJ8(android.net.Uri uri, Bundle bundle) {
        UserSession userSession = this.A02;
        InterfaceC11380iw interfaceC11380iw = this.A01;
        C34925FaB.A00(new C34925FaB(interfaceC11380iw, userSession), null, null, null, null, "welcome_message_settings_qp_setup_button_click", "source_qp", null);
        F3H.A00(interfaceC11380iw, userSession).A00();
        Bundle bundle2 = new Bundle();
        bundle2.putString(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, "inbox_qp");
        Fragment fragment = this.A00;
        new C6XJ(fragment.requireActivity(), bundle2, userSession, ModalActivity.class, AbstractC111324zv.A00(390)).A0C(fragment.requireActivity());
    }

    public C70982Wlq(Fragment fragment, InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        this.A00 = fragment;
        this.A02 = userSession;
        this.A01 = interfaceC11380iw;
    }
}
