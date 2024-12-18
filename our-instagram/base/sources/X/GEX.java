package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.direct.aiagent.navigation.AiAgentThreadLauncher;

/* loaded from: classes6.dex */
public final class GEX implements GYB {
    public final FragmentActivity A00;
    public final InterfaceC11380iw A01;
    public final UserSession A02;

    @Override // X.GYB
    public final void CJ8(android.net.Uri uri, Bundle bundle) {
        C14360o3.A0B(uri, 0);
        String queryParameter = uri.getQueryParameter("bot_id");
        if (queryParameter != null && queryParameter.length() != 0) {
            UserSession userSession = this.A02;
            if (!AbstractC162267Oo.A03(userSession)) {
                AbstractC35257Fgr.A01(this.A00, userSession, EnumC33333EoS.A03, EnumC33519Ers.A0E.toString(), queryParameter, false);
            } else {
                AbstractC31265Don.A00();
                new AiAgentThreadLauncher(userSession).A08(this.A00, this.A01, queryParameter, null, null, null, true);
            }
        }
    }

    public GEX(FragmentActivity fragmentActivity, InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        this.A00 = fragmentActivity;
        this.A02 = userSession;
        this.A01 = interfaceC11380iw;
    }
}
