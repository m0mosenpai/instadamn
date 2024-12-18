package com.instagram.creator.agent.suggestedreplies.deeplink;

import X.AbstractC08820cl;
import X.AbstractC166987dD;
import X.AbstractC167017dG;
import X.AbstractC23021Ah;
import X.AbstractC25225BEi;
import X.AbstractC25227BEk;
import X.AbstractC25229BEm;
import X.AbstractC25230BEn;
import X.C06090Tz;
import X.C09530e4;
import X.C140966Yy;
import X.C14360o3;
import X.C18U;
import X.C23031Ai;
import X.C26800BsO;
import X.C45471KBg;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.urlhandler.UserSessionUrlHandlerActivity;

/* loaded from: classes5.dex */
public final class SuggestedRepliesSettingsUrlHandlerActivity extends UserSessionUrlHandlerActivity {
    @Override // com.instagram.base.activity.BaseFragmentActivity
    public final void A0j(Bundle bundle) {
    }

    @Override // com.instagram.urlhandler.UserSessionUrlHandlerActivity
    public final void A0n(Bundle bundle, Bundle bundle2, UserSession userSession) {
        String string;
        Fragment c26800BsO;
        C09530e4[] A1b;
        AbstractC167017dG.A1P(userSession, bundle2);
        if (C18U.A06(C06090Tz.A06, userSession, 36321237047387379L) && (string = bundle2.getString("original_url")) != null && string.length() != 0) {
            String queryParameter = AbstractC08820cl.A03(string).getQueryParameter("entrypoint");
            boolean A0K = C14360o3.A0K(queryParameter, "qp");
            C23031Ai A00 = AbstractC23021Ah.A00(userSession);
            if (AbstractC167017dG.A1b(A00, A00.A1a, C23031Ai.A8c, 387) && !A0K) {
                c26800BsO = new C45471KBg();
                A1b = AbstractC25230BEn.A1b("entrypoint", queryParameter);
            } else {
                c26800BsO = new C26800BsO();
                A1b = AbstractC25229BEm.A1b("entrypoint", queryParameter, AbstractC166987dD.A1L("should_open_settings", Boolean.valueOf(C14360o3.A0K(queryParameter, "prodash_tools"))));
            }
            AbstractC25227BEk.A1C(c26800BsO, A1b);
            C140966Yy A0r = AbstractC25225BEi.A0r(this, userSession);
            A0r.A0D(c26800BsO);
            A0r.A0D = false;
            A0r.A04();
            return;
        }
        finish();
    }
}
