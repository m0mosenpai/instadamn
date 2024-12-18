package com.instagram.debug.devoptions.section.modernarchitecture;

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
import com.instagram.debug.devoptions.intf.DeveloperOptionsSection;
import com.instagram.debug.devoptions.modernarchitecture.RepositoryInfoFragment;
import java.util.List;

/* loaded from: classes5.dex */
public final class ModernArchitectureOptions implements DeveloperOptionsSection {
    public static final ModernArchitectureOptions INSTANCE = new Object();

    @Override // com.instagram.debug.devoptions.intf.DeveloperOptionsSection
    public List getItems(final UserSession userSession, final FragmentActivity fragmentActivity, AbstractC59962oe abstractC59962oe, AbstractC018607g abstractC018607g) {
        AbstractC167017dG.A1N(userSession, fragmentActivity);
        return AbstractC166987dD.A1J(new GHY(fragmentActivity, new View.OnClickListener() { // from class: com.instagram.debug.devoptions.section.modernarchitecture.ModernArchitectureOptions$getItems$1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int A05 = C0f9.A05(251540559);
                AbstractC25229BEm.A18(new RepositoryInfoFragment(), AbstractC25225BEi.A0r(FragmentActivity.this, userSession));
                C0f9.A0C(1072660896, A05);
            }
        }, 2131958315));
    }

    @Override // com.instagram.debug.devoptions.intf.DeveloperOptionsSection
    public int getTitleRes() {
        return 2131958066;
    }
}
