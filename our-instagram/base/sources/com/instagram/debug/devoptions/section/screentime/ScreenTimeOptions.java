package com.instagram.debug.devoptions.section.screentime;

import X.AbstractC018607g;
import X.AbstractC167017dG;
import X.AbstractC16960so;
import X.AbstractC59962oe;
import X.C0f9;
import X.GHY;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.intf.DeveloperOptionsSection;
import com.instagram.screentime.IGScreenTimeApi;
import java.util.List;

/* loaded from: classes11.dex */
public final class ScreenTimeOptions implements DeveloperOptionsSection {
    public static final ScreenTimeOptions INSTANCE = new Object();

    @Override // com.instagram.debug.devoptions.intf.DeveloperOptionsSection
    public List getItems(final UserSession userSession, FragmentActivity fragmentActivity, AbstractC59962oe abstractC59962oe, AbstractC018607g abstractC018607g) {
        AbstractC167017dG.A1N(userSession, fragmentActivity);
        return AbstractC16960so.A1Q(new GHY(fragmentActivity, new View.OnClickListener() { // from class: com.instagram.debug.devoptions.section.screentime.ScreenTimeOptions$getItems$1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int A05 = C0f9.A05(-563847168);
                IGScreenTimeApi iGScreenTimeApi = (IGScreenTimeApi) UserSession.this.A00(IGScreenTimeApi.class);
                if (iGScreenTimeApi != null) {
                    iGScreenTimeApi.A02(false);
                }
                C0f9.A0C(1203287784, A05);
            }
        }, 2131958372), new GHY(fragmentActivity, new View.OnClickListener() { // from class: com.instagram.debug.devoptions.section.screentime.ScreenTimeOptions$getItems$2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int A05 = C0f9.A05(807294625);
                IGScreenTimeApi iGScreenTimeApi = (IGScreenTimeApi) UserSession.this.A00(IGScreenTimeApi.class);
                if (iGScreenTimeApi != null) {
                    iGScreenTimeApi.A02(true);
                }
                C0f9.A0C(725134585, A05);
            }
        }, 2131958370));
    }

    @Override // com.instagram.debug.devoptions.intf.DeveloperOptionsSection
    public int getTitleRes() {
        return 2131958371;
    }
}
