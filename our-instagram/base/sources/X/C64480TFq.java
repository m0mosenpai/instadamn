package X;

import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import java.security.SecureRandom;
import org.json.JSONObject;

/* renamed from: X.TFq, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64480TFq implements InterfaceC12870lZ {
    public int A00;
    public final long A01 = new SecureRandom().nextLong();
    public final C18920wW A02;
    public final String A03;
    public final String A04;
    public final InterfaceC11380iw A05;

    public static final void A01(C64480TFq c64480TFq, String str) {
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c64480TFq.A02, "lead_gen_ctc_app_state_change");
        JSONObject A0q = AbstractC31171DnF.A0q();
        A0q.put("ei", c64480TFq.A04);
        A00(A0f, c64480TFq, AbstractC166987dD.A19(A0q));
        A0f.AAP("app_state", str);
        A0f.Cht();
    }

    public final void A02(boolean z) {
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A02, "lead_gen_ctc_app_state_change");
        JSONObject A0q = AbstractC31171DnF.A0q();
        A0q.put("ei", this.A04);
        A00(A0f, this, AbstractC166987dD.A19(A0q));
        A0f.AAP("app_state", "click_to_call_clicked");
        A0f.A7v("granted_permission", Boolean.valueOf(z));
        A0f.Cht();
    }

    public C64480TFq(UserSession userSession, String str, String str2) {
        this.A04 = str;
        this.A03 = str2;
        C19270xB c19270xB = new C19270xB("call_ads_confirmation_dialog");
        this.A05 = c19270xB;
        this.A02 = AbstractC12220kQ.A01(c19270xB, userSession);
        this.A00 = 2;
        C218914p.A05(this);
    }

    public static void A00(InterfaceC02590Ai interfaceC02590Ai, C64480TFq c64480TFq, String str) {
        interfaceC02590Ai.AAk("tracking_codes", AbstractC16960so.A1N(str));
        interfaceC02590Ai.A9K("click_session_id", Long.valueOf(c64480TFq.A01));
        interfaceC02590Ai.AAP(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, AnonymousClass001.A0R("ig_", c64480TFq.A03));
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppBackgrounded() {
        int A03 = C0f9.A03(1532548339);
        A01(this, "app_did_enter_background");
        this.A00--;
        C0f9.A0A(1980649339, A03);
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppForegrounded() {
        int A03 = C0f9.A03(-746197616);
        A01(this, "app_did_become_active");
        int i = this.A00 - 1;
        this.A00 = i;
        if (i == 0) {
            C218914p.A06(this);
        }
        C0f9.A0A(2101259717, A03);
    }
}
