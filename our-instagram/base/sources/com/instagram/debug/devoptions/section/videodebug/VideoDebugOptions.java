package com.instagram.debug.devoptions.section.videodebug;

import X.AbstractC018607g;
import X.AbstractC166987dD;
import X.AbstractC167017dG;
import X.AbstractC25225BEi;
import X.AbstractC59962oe;
import X.C0f9;
import X.C140966Yy;
import X.GHY;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.intf.DeveloperOptionsSection;
import java.util.List;

/* loaded from: classes6.dex */
public final class VideoDebugOptions implements DeveloperOptionsSection {
    public static final VideoDebugOptions INSTANCE = new Object();

    @Override // com.instagram.debug.devoptions.intf.DeveloperOptionsSection
    public List getItems(final UserSession userSession, final FragmentActivity fragmentActivity, AbstractC59962oe abstractC59962oe, AbstractC018607g abstractC018607g) {
        AbstractC167017dG.A1N(userSession, fragmentActivity);
        return AbstractC166987dD.A1J(new GHY(fragmentActivity, new View.OnClickListener() { // from class: com.instagram.debug.devoptions.section.videodebug.VideoDebugOptions$getItems$1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int A05 = C0f9.A05(-775446031);
                C140966Yy A0r = AbstractC25225BEi.A0r(FragmentActivity.this, userSession);
                A0r.A0D(new VideoDebugSettingsFragment());
                A0r.A04();
                C0f9.A0C(384897931, A05);
            }
        }, fragmentActivity.getString(2131958461)));
    }

    @Override // com.instagram.debug.devoptions.intf.DeveloperOptionsSection
    public int getTitleRes() {
        return 2131958460;
    }
}
