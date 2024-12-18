package com.instagram.debug.devoptions.section.takeabreak;

import X.AbstractC018607g;
import X.AbstractC167017dG;
import X.AbstractC16960so;
import X.AbstractC23021Ah;
import X.AbstractC59962oe;
import X.AnonymousClass280;
import X.AnonymousClass282;
import X.C0f9;
import X.C14360o3;
import X.C9GR;
import X.GHY;
import X.InterfaceC19610xo;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.intf.DeveloperOptionsSection;
import java.util.List;

/* loaded from: classes5.dex */
public final class TakeABreakOptions implements DeveloperOptionsSection {
    public static final TakeABreakOptions INSTANCE = new Object();

    @Override // com.instagram.debug.devoptions.intf.DeveloperOptionsSection
    public List getItems(final UserSession userSession, final FragmentActivity fragmentActivity, AbstractC59962oe abstractC59962oe, AbstractC018607g abstractC018607g) {
        AbstractC167017dG.A1N(userSession, fragmentActivity);
        return AbstractC16960so.A1Q(new GHY(fragmentActivity, new View.OnClickListener() { // from class: com.instagram.debug.devoptions.section.takeabreak.TakeABreakOptions$getItems$1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int A05 = C0f9.A05(-167593512);
                AnonymousClass282 anonymousClass282 = AnonymousClass280.A01;
                UserSession userSession2 = UserSession.this;
                C14360o3.A0B(userSession2, 0);
                InterfaceC19610xo ARD = anonymousClass282.A06(userSession2).ARD();
                ARD.E77("HAS_USER_EVER_SET_BREAKS", false);
                ARD.apply();
                C9GR.A03(fragmentActivity, "Has seen take a break cleared", null, 1);
                C0f9.A0C(-1213260161, A05);
            }
        }, "Clear has seen Take a Break"), new GHY(fragmentActivity, new View.OnClickListener() { // from class: com.instagram.debug.devoptions.section.takeabreak.TakeABreakOptions$getItems$2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int A05 = C0f9.A05(76436014);
                AbstractC23021Ah.A00(UserSession.this).A0m(System.currentTimeMillis() - 172800000);
                C9GR.A00(fragmentActivity, "Take a Break upsell last seen time has been updated to two days ago", null, 1);
                C0f9.A0C(-1215120359, A05);
            }
        }, "Set Take a Break upsell last seen time to two days ago"));
    }

    @Override // com.instagram.debug.devoptions.intf.DeveloperOptionsSection
    public int getTitleRes() {
        return 2131958408;
    }
}
