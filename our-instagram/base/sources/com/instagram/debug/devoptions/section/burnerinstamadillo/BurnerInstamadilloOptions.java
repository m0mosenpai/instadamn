package com.instagram.debug.devoptions.section.burnerinstamadillo;

import X.AbstractC018607g;
import X.AbstractC166987dD;
import X.AbstractC167017dG;
import X.AbstractC25225BEi;
import X.AbstractC25229BEm;
import X.AbstractC59962oe;
import X.C0f9;
import X.GHY;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.direct.burner.BurnerSendSettingsFragment;
import com.instagram.debug.devoptions.intf.DeveloperOptionsSection;
import java.util.List;

/* loaded from: classes6.dex */
public final class BurnerInstamadilloOptions implements DeveloperOptionsSection {
    public static final BurnerInstamadilloOptions INSTANCE = new Object();

    @Override // com.instagram.debug.devoptions.intf.DeveloperOptionsSection
    public List getItems(final UserSession userSession, final FragmentActivity fragmentActivity, AbstractC59962oe abstractC59962oe, AbstractC018607g abstractC018607g) {
        AbstractC167017dG.A1N(userSession, fragmentActivity);
        return AbstractC166987dD.A1J(new GHY(fragmentActivity, new View.OnClickListener() { // from class: com.instagram.debug.devoptions.section.burnerinstamadillo.BurnerInstamadilloOptions$getItems$1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int A05 = C0f9.A05(-1405278355);
                AbstractC25229BEm.A18(new BurnerSendSettingsFragment(), AbstractC25225BEi.A0r(FragmentActivity.this, userSession));
                C0f9.A0C(1686443739, A05);
            }
        }, "Bulk Send"));
    }

    @Override // com.instagram.debug.devoptions.intf.DeveloperOptionsSection
    public int getTitleRes() {
        return 2131958396;
    }
}
