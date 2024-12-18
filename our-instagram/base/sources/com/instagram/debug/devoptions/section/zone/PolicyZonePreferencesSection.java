package com.instagram.debug.devoptions.section.zone;

import X.AbstractC018607g;
import X.AbstractC166987dD;
import X.AbstractC58320PtC;
import X.AbstractC59962oe;
import X.C0f9;
import X.C14360o3;
import X.C9GR;
import X.GHY;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.intf.DeveloperOptionsSection;
import java.util.List;

/* loaded from: classes6.dex */
public final class PolicyZonePreferencesSection implements DeveloperOptionsSection {
    public static final PolicyZonePreferencesSection INSTANCE = new Object();

    @Override // com.instagram.debug.devoptions.intf.DeveloperOptionsSection
    public List getItems(UserSession userSession, final FragmentActivity fragmentActivity, AbstractC59962oe abstractC59962oe, AbstractC018607g abstractC018607g) {
        C14360o3.A0B(fragmentActivity, 1);
        return AbstractC166987dD.A1J(GHY.A00(fragmentActivity, new View.OnClickListener() { // from class: com.instagram.debug.devoptions.section.zone.PolicyZonePreferencesSection$getItems$1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                String str;
                int A05 = C0f9.A05(484882810);
                FragmentActivity fragmentActivity2 = FragmentActivity.this;
                if (AbstractC58320PtC.A0Y().isEnabled()) {
                    str = "Yes";
                } else {
                    str = "No";
                }
                C9GR.A09(fragmentActivity2, str);
                C0f9.A0C(1894166045, A05);
            }
        }, 2131958182));
    }

    @Override // com.instagram.debug.devoptions.intf.DeveloperOptionsSection
    public int getTitleRes() {
        return 2131958266;
    }
}
