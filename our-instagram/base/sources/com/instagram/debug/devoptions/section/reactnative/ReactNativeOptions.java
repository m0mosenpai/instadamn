package com.instagram.debug.devoptions.section.reactnative;

import X.AbstractC018607g;
import X.AbstractC166987dD;
import X.AbstractC167017dG;
import X.AbstractC27401Ut;
import X.AbstractC59962oe;
import X.C0f9;
import X.C64501TGn;
import X.GHY;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.intf.DeveloperOptionsSection;
import java.util.List;

/* loaded from: classes6.dex */
public final class ReactNativeOptions implements DeveloperOptionsSection {
    public static final ReactNativeOptions INSTANCE = new Object();

    @Override // com.instagram.debug.devoptions.intf.DeveloperOptionsSection
    public List getItems(final UserSession userSession, final FragmentActivity fragmentActivity, AbstractC59962oe abstractC59962oe, AbstractC018607g abstractC018607g) {
        AbstractC167017dG.A1N(userSession, fragmentActivity);
        return AbstractC166987dD.A1J(GHY.A00(fragmentActivity, new View.OnClickListener() { // from class: com.instagram.debug.devoptions.section.reactnative.ReactNativeOptions$getItems$1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int A05 = C0f9.A05(-1352026755);
                AbstractC27401Ut.getInstance();
                C64501TGn A01 = new C64501TGn(UserSession.this).A01("RNRouteExplorerRoute");
                A01.A07 = fragmentActivity.getResources().getString(2131971509);
                A01.A02(fragmentActivity);
                C0f9.A0C(-100400740, A05);
            }
        }, 2131971509));
    }

    @Override // com.instagram.debug.devoptions.intf.DeveloperOptionsSection
    public int getTitleRes() {
        return 2131958302;
    }
}
