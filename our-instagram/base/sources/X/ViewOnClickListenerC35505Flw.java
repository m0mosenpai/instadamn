package X;

import android.view.View;
import com.instagram.common.session.UserSession;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.Flw, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ViewOnClickListenerC35505Flw implements View.OnClickListener {
    public final /* synthetic */ UserSession A00;

    public ViewOnClickListenerC35505Flw(UserSession userSession) {
        this.A00 = userSession;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(1184619926);
        UserSession userSession = this.A00;
        HashMap A0F = AbstractC23021Ah.A00(userSession).A0F();
        if (!A0F.isEmpty()) {
            C18920wW A02 = AbstractC12220kQ.A02(userSession);
            Map A0n = AbstractC167007dF.A0n("reason", "exit_settings_session_before_returning_to_profile");
            C25531Mh A0A = AbstractC31179DnN.A0A(A02, "ig_user_resets_supervision_upsell_eligibility");
            A0A.A0w(A0n);
            A0A.Cht();
        }
        A0F.remove("UPDATE_ACCOUNT_PRIVACY_SETTING");
        A0F.remove("UPDATE_SCC_SETTING");
        A0F.remove("UPDATE_MESSAGING_SETTING");
        AbstractC23021Ah.A00(userSession).A17(A0F);
        C0f9.A0C(1101185458, A05);
    }
}
