package X;

import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;

/* renamed from: X.FbU, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C34997FbU {
    public final C18920wW A00;
    public final String A01;

    public C34997FbU(InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str) {
        C14360o3.A0B(userSession, 1);
        this.A00 = AbstractC12220kQ.A01(interfaceC11380iw, userSession);
        this.A01 = str;
    }

    public static Boolean A00(InterfaceC02590Ai interfaceC02590Ai, C34997FbU c34997FbU, String str, boolean z) {
        interfaceC02590Ai.AAP("event", str);
        interfaceC02590Ai.AAP(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, c34997FbU.A01);
        interfaceC02590Ai.AAP("component", "toggle");
        interfaceC02590Ai.AAP(OptSvcAnalyticsStore.LOGGING_KEY_STEP, "ig_message_settings");
        return Boolean.valueOf(z);
    }

    public final void A01(String str, Boolean bool) {
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A00, "instagram_waverly_ig_event");
        AbstractC31171DnF.A1B(A0f, str);
        AbstractC31171DnF.A1G(A0f, this.A01);
        A0f.AAP("component", "toggle");
        AbstractC31171DnF.A1A(A0f, "ig_message_settings");
        A0f.A7v("attempted_toggle_value", bool);
        A0f.AAP("message_controls_settings_version", "v2");
        A0f.AAP("error_message", "Eligible For Toggle But No Toggle Value");
        A0f.AAP("error_identifier", "UNEXPECTED_VALUE");
        A0f.Cht();
    }
}
