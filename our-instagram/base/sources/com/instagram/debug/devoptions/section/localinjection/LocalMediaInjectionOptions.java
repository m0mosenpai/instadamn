package com.instagram.debug.devoptions.section.localinjection;

import X.AbstractC018607g;
import X.AbstractC166987dD;
import X.AbstractC167017dG;
import X.AbstractC25225BEi;
import X.AbstractC25229BEm;
import X.AbstractC25235BEs;
import X.AbstractC59962oe;
import X.C0f9;
import X.C35119FeM;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.intf.DeveloperOptionsSection;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes8.dex */
public final class LocalMediaInjectionOptions implements DeveloperOptionsSection {
    public static final LocalMediaInjectionOptions INSTANCE = new Object();

    @Override // com.instagram.debug.devoptions.intf.DeveloperOptionsSection
    public List getItems(final UserSession userSession, final FragmentActivity fragmentActivity, AbstractC59962oe abstractC59962oe, AbstractC018607g abstractC018607g) {
        boolean A1a = AbstractC167017dG.A1a(userSession, fragmentActivity);
        ArrayList A1E = AbstractC166987dD.A1E();
        AbstractC25235BEs.A1C(fragmentActivity, new View.OnClickListener() { // from class: com.instagram.debug.devoptions.section.localinjection.LocalMediaInjectionOptions$getItems$1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int A05 = C0f9.A05(252626990);
                AbstractC25229BEm.A18(new InjectMediaToolFragment(), AbstractC25225BEi.A0r(FragmentActivity.this, userSession));
                C0f9.A0C(1219938743, A05);
            }
        }, A1E, 2131958170);
        A1E.add(new C35119FeM(A1a));
        return A1E;
    }

    @Override // com.instagram.debug.devoptions.intf.DeveloperOptionsSection
    public int getTitleRes() {
        return 2131958214;
    }
}
