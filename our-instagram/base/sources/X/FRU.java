package X;

import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;

/* loaded from: classes6.dex */
public final class FRU {
    public final C18920wW A00;
    public final InterfaceC11380iw A01;
    public final UserSession A02;

    public final void A00(EnumC33505Ere enumC33505Ere) {
        C14360o3.A0B(enumC33505Ere, 0);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A00, "instagram_action_private_list");
        if (A0f.isSampled()) {
            C32018E4u.A00(A0f, "create_list");
            A0f.A8R(enumC33505Ere, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
            A0f.A9K("private_list_id", null);
            A0f.AAP("private_list_name", null);
            A0f.Cht();
        }
    }

    public final void A01(EnumC33505Ere enumC33505Ere) {
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A00, "instagram_action_private_list");
        if (A0f.isSampled()) {
            C32018E4u.A00(A0f, "view_lists");
            A0f.A8R(enumC33505Ere, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
            A0f.A9K("private_list_id", null);
            A0f.AAP("private_list_name", null);
            A0f.Cht();
        }
    }

    public FRU(InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        AbstractC167017dG.A1P(userSession, interfaceC11380iw);
        this.A02 = userSession;
        this.A01 = interfaceC11380iw;
        this.A00 = AbstractC12220kQ.A01(interfaceC11380iw, userSession);
    }

    public final void A02(EnumC33505Ere enumC33505Ere, String str, String str2) {
        AbstractC167017dG.A1P(str, str2);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A00, "instagram_action_private_list");
        if (A0f.isSampled()) {
            C32018E4u.A00(A0f, "edit_list");
            A0f.A8R(enumC33505Ere, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
            A0f.A9K("private_list_id", AbstractC166997dE.A0j(str));
            A0f.AAP("private_list_name", str2);
            A0f.Cht();
        }
    }
}
