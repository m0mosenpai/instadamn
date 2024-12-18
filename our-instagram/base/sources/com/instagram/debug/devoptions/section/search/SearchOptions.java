package com.instagram.debug.devoptions.section.search;

import X.AbstractC018607g;
import X.AbstractC166987dD;
import X.AbstractC167017dG;
import X.AbstractC25229BEm;
import X.AbstractC59962oe;
import X.C0f9;
import X.C140966Yy;
import X.GHY;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.intf.DeveloperOptionsSection;
import java.util.List;

/* loaded from: classes11.dex */
public final class SearchOptions implements DeveloperOptionsSection {
    public static final SearchOptions INSTANCE = new Object();

    @Override // com.instagram.debug.devoptions.intf.DeveloperOptionsSection
    public List getItems(final UserSession userSession, final FragmentActivity fragmentActivity, AbstractC59962oe abstractC59962oe, AbstractC018607g abstractC018607g) {
        AbstractC167017dG.A1N(userSession, fragmentActivity);
        return AbstractC166987dD.A1J(new GHY(fragmentActivity, new View.OnClickListener() { // from class: com.instagram.debug.devoptions.section.search.SearchOptions$getItems$1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int A05 = C0f9.A05(978908094);
                AbstractC25229BEm.A18(new SearchDebugSettingsFragment(), new C140966Yy(FragmentActivity.this, userSession));
                C0f9.A0C(2147163765, A05);
            }
        }, fragmentActivity.getString(2131958389)));
    }

    @Override // com.instagram.debug.devoptions.intf.DeveloperOptionsSection
    public int getTitleRes() {
        return 2131958387;
    }
}
