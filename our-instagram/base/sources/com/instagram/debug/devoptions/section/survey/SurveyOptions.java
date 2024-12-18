package com.instagram.debug.devoptions.section.survey;

import X.AbstractC018607g;
import X.AbstractC03240Dh;
import X.AbstractC166987dD;
import X.AbstractC167017dG;
import X.AbstractC25225BEi;
import X.AbstractC59962oe;
import X.C0f9;
import X.C140966Yy;
import X.GHY;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.intf.DeveloperOptionsSection;
import java.util.List;

/* loaded from: classes8.dex */
public final class SurveyOptions implements DeveloperOptionsSection {
    public static final SurveyOptions INSTANCE = new Object();

    @Override // com.instagram.debug.devoptions.intf.DeveloperOptionsSection
    public List getItems(final UserSession userSession, final FragmentActivity fragmentActivity, AbstractC59962oe abstractC59962oe, AbstractC018607g abstractC018607g) {
        AbstractC167017dG.A1N(userSession, fragmentActivity);
        return AbstractC166987dD.A1J(new GHY(fragmentActivity, new View.OnClickListener() { // from class: com.instagram.debug.devoptions.section.survey.SurveyOptions$getItems$1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int A05 = C0f9.A05(-1240259112);
                Bundle A0b = AbstractC166987dD.A0b();
                AbstractC03240Dh.A00(A0b, UserSession.this);
                C140966Yy A0r = AbstractC25225BEi.A0r(fragmentActivity, UserSession.this);
                A0r.A0B(A0b, new SessionSurveyInternalSettingsFragment());
                A0r.A08();
                A0r.A04();
                C0f9.A0C(-146398089, A05);
            }
        }, 2131958420));
    }

    @Override // com.instagram.debug.devoptions.intf.DeveloperOptionsSection
    public int getTitleRes() {
        return 2131958406;
    }
}
