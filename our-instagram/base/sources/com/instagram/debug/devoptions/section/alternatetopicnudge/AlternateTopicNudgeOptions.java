package com.instagram.debug.devoptions.section.alternatetopicnudge;

import X.AbstractC018607g;
import X.AbstractC167017dG;
import X.AbstractC16960so;
import X.AbstractC31177DnL;
import X.AbstractC41670Ic2;
import X.AbstractC59962oe;
import X.C05F;
import X.C0f9;
import X.C9GR;
import X.GHY;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.intf.DeveloperOptionsSection;
import java.util.List;

/* loaded from: classes7.dex */
public final class AlternateTopicNudgeOptions implements DeveloperOptionsSection {
    public static final AlternateTopicNudgeOptions INSTANCE = new Object();

    @Override // com.instagram.debug.devoptions.intf.DeveloperOptionsSection
    public List getItems(final UserSession userSession, final FragmentActivity fragmentActivity, AbstractC59962oe abstractC59962oe, AbstractC018607g abstractC018607g) {
        AbstractC167017dG.A1N(userSession, fragmentActivity);
        return AbstractC16960so.A1Q(new GHY(fragmentActivity, new View.OnClickListener() { // from class: com.instagram.debug.devoptions.section.alternatetopicnudge.AlternateTopicNudgeOptions$getItems$1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int A05 = C0f9.A05(948352617);
                AbstractC41670Ic2.A02(UserSession.this, C05F.A00, AbstractC31177DnL.A06());
                C9GR.A03(fragmentActivity, "Added ALTERNATE_TOPIC_NUDGE entry", null, 1);
                C0f9.A0C(-1556841856, A05);
            }
        }, "Add Alternative Topic Nudge entry to NudgeTracker"), new GHY(fragmentActivity, new View.OnClickListener() { // from class: com.instagram.debug.devoptions.section.alternatetopicnudge.AlternateTopicNudgeOptions$getItems$2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int A05 = C0f9.A05(-1130348968);
                AbstractC41670Ic2.A01(UserSession.this, C05F.A00);
                C9GR.A03(fragmentActivity, "Cleared all entries for ALTERNATE_TOPIC_NUDGE", null, 1);
                C0f9.A0C(721064596, A05);
            }
        }, "Clear All Alternative Topic Nudge entries in NudgeTracker"), new GHY(fragmentActivity, new View.OnClickListener() { // from class: com.instagram.debug.devoptions.section.alternatetopicnudge.AlternateTopicNudgeOptions$getItems$3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int A05 = C0f9.A05(-1009278030);
                Integer num = C05F.A00;
                AbstractC41670Ic2.A02(UserSession.this, num, 1648142445L);
                AbstractC41670Ic2.A02(UserSession.this, num, 1648145403L);
                AbstractC41670Ic2.A02(UserSession.this, num, 1648147574L);
                C9GR.A03(fragmentActivity, "Cleared all entries for ALTERNATE_TOPIC_NUDGE", null, 1);
                C0f9.A0C(-738607270, A05);
            }
        }, "Add old entries to AlternativeTopicNudge history"));
    }

    @Override // com.instagram.debug.devoptions.intf.DeveloperOptionsSection
    public int getTitleRes() {
        return 2131958393;
    }
}
