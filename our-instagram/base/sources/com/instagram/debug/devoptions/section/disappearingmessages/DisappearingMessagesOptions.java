package com.instagram.debug.devoptions.section.disappearingmessages;

import X.AbstractC018607g;
import X.AbstractC167017dG;
import X.AbstractC16960so;
import X.AbstractC23021Ah;
import X.AbstractC31175DnJ;
import X.AbstractC59962oe;
import X.C0f9;
import X.C14360o3;
import X.GHY;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.intf.DeveloperOptionsSection;
import java.util.List;

/* loaded from: classes6.dex */
public final class DisappearingMessagesOptions implements DeveloperOptionsSection {
    public static final DisappearingMessagesOptions INSTANCE = new Object();

    @Override // com.instagram.debug.devoptions.intf.DeveloperOptionsSection
    public List getItems(final UserSession userSession, final FragmentActivity fragmentActivity, AbstractC59962oe abstractC59962oe, AbstractC018607g abstractC018607g) {
        AbstractC167017dG.A1N(userSession, fragmentActivity);
        return AbstractC16960so.A1Q(new GHY(fragmentActivity, new View.OnClickListener() { // from class: com.instagram.debug.devoptions.section.disappearingmessages.DisappearingMessagesOptions$getItems$1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int A05 = C0f9.A05(1482761590);
                UserSession userSession2 = UserSession.this;
                C14360o3.A0B(userSession2, 0);
                AbstractC23021Ah.A00(userSession2).A0e(0L);
                AbstractC31175DnJ.A0m(fragmentActivity, "DM NUX State Set to `Never Seen a DM NUX`");
                C0f9.A0C(-1391555611, A05);
            }
        }, "Disappearing Messages NUX: Set Never Seen"), new GHY(fragmentActivity, new View.OnClickListener() { // from class: com.instagram.debug.devoptions.section.disappearingmessages.DisappearingMessagesOptions$getItems$2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int A05 = C0f9.A05(293138359);
                UserSession userSession2 = UserSession.this;
                C14360o3.A0B(userSession2, 0);
                AbstractC23021Ah.A00(userSession2).A0e(2L);
                AbstractC31175DnJ.A0m(fragmentActivity, "DM NUX State Set to `Seen a non-E2EE DM NUX`");
                C0f9.A0C(126656096, A05);
            }
        }, "Disappearing Messages NUX: Set Seen Non-E2EE"));
    }

    @Override // com.instagram.debug.devoptions.intf.DeveloperOptionsSection
    public int getTitleRes() {
        return 2131958399;
    }
}
