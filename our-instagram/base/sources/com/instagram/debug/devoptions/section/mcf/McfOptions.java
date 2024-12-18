package com.instagram.debug.devoptions.section.mcf;

import X.AbstractC018607g;
import X.AbstractC166987dD;
import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.AbstractC59962oe;
import X.C17280tP;
import X.C36731GHa;
import X.C8S8;
import android.widget.CompoundButton;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.intf.DeveloperOptionsSection;
import java.util.List;

/* loaded from: classes5.dex */
public final class McfOptions implements DeveloperOptionsSection {
    public static final McfOptions INSTANCE = new Object();

    @Override // com.instagram.debug.devoptions.intf.DeveloperOptionsSection
    public List getItems(UserSession userSession, FragmentActivity fragmentActivity, AbstractC59962oe abstractC59962oe, AbstractC018607g abstractC018607g) {
        C17280tP A0y = AbstractC166987dD.A0y();
        return AbstractC166987dD.A1J(new C36731GHa(new CompoundButton.OnCheckedChangeListener() { // from class: com.instagram.debug.devoptions.section.mcf.McfOptions$getItems$1
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                C17280tP A0y2 = AbstractC166987dD.A0y();
                AbstractC167007dF.A1L(A0y2, A0y2.A1e, C17280tP.A4G, C8S8.DEFAULT_SWIPE_ANIMATION_DURATION, z);
            }
        }, 2131958212, AbstractC167017dG.A1b(A0y, A0y.A1e, C17280tP.A4G, C8S8.DEFAULT_SWIPE_ANIMATION_DURATION)));
    }

    @Override // com.instagram.debug.devoptions.intf.DeveloperOptionsSection
    public int getTitleRes() {
        return 2131958213;
    }
}
