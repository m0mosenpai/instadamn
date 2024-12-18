package X;

import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;

/* renamed from: X.8c7, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C190498c7 {
    public final C18920wW A00;

    public final void A00(boolean z, boolean z2, int i) {
        EnumC223389tV enumC223389tV;
        C18920wW c18920wW = this.A00;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "direct_group_story_mention_toggle_state_changed");
        if (z2) {
            if (z) {
                enumC223389tV = EnumC223389tV.ON;
            } else {
                enumC223389tV = EnumC223389tV.OFF;
            }
        } else if (z) {
            enumC223389tV = EnumC223389tV.DEFAULT_ON;
        } else {
            enumC223389tV = EnumC223389tV.DEFAULT_OFF;
        }
        if (A00.isSampled()) {
            A00.A8R(enumC223389tV, "action");
            A00.AAP(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, "IG_STORY");
            A00.A9K("tagged_user_count", Long.valueOf(i));
            A00.Cht();
        }
    }

    public C190498c7(InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        this.A00 = AbstractC12220kQ.A01(interfaceC11380iw, userSession);
    }
}
