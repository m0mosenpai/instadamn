package com.instagram.debug.devoptions.section.securityalerts;

import X.AbstractC018607g;
import X.AbstractC166987dD;
import X.AbstractC167017dG;
import X.AbstractC16960so;
import X.AbstractC25231BEo;
import X.AbstractC59962oe;
import X.AnonymousClass194;
import X.C0f9;
import X.C12L;
import X.C14360o3;
import X.C9GR;
import X.GHY;
import X.MCL;
import X.MCM;
import X.MCO;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.intf.DeveloperOptionsSection;
import java.util.List;

/* loaded from: classes5.dex */
public final class SecurityAlertsOptions implements DeveloperOptionsSection {
    public static final SecurityAlertsOptions INSTANCE = new Object();

    @Override // com.instagram.debug.devoptions.intf.DeveloperOptionsSection
    public List getItems(final UserSession userSession, final FragmentActivity fragmentActivity, AbstractC59962oe abstractC59962oe, AbstractC018607g abstractC018607g) {
        AbstractC167017dG.A1N(userSession, fragmentActivity);
        return AbstractC16960so.A1Q(new GHY(fragmentActivity, new View.OnClickListener() { // from class: com.instagram.debug.devoptions.section.securityalerts.SecurityAlertsOptions$getItems$1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int A05 = C0f9.A05(1789592762);
                UserSession userSession2 = UserSession.this;
                C14360o3.A0B(userSession2, 0);
                AbstractC166987dD.A1Z(new MCL(userSession2, null, 9), AnonymousClass194.A02(AbstractC25231BEo.A0e(C12L.A00)));
                C9GR.A00(fragmentActivity, "Mock login notification generated", null, 0);
                C0f9.A0C(1085443064, A05);
            }
        }, 2131958416), new GHY(fragmentActivity, new View.OnClickListener() { // from class: com.instagram.debug.devoptions.section.securityalerts.SecurityAlertsOptions$getItems$2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int A05 = C0f9.A05(-1097274407);
                UserSession userSession2 = UserSession.this;
                C14360o3.A0B(userSession2, 0);
                AbstractC166987dD.A1Z(new MCL(userSession2, null, 8), AnonymousClass194.A02(AbstractC25231BEo.A0e(C12L.A00)));
                C9GR.A00(fragmentActivity, "Mock keys changed notification generated", null, 0);
                C0f9.A0C(-366542172, A05);
            }
        }, 2131958414), new GHY(fragmentActivity, new View.OnClickListener() { // from class: com.instagram.debug.devoptions.section.securityalerts.SecurityAlertsOptions$getItems$3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int A05 = C0f9.A05(1690431208);
                UserSession userSession2 = UserSession.this;
                C14360o3.A0B(userSession2, 0);
                AbstractC166987dD.A1Z(new MCM(userSession2, null, 36), AnonymousClass194.A02(AbstractC25231BEo.A0e(C12L.A00)));
                C9GR.A00(fragmentActivity, "Mock login alert generated", null, 0);
                C0f9.A0C(-1660646226, A05);
            }
        }, 2131958415), new GHY(fragmentActivity, new View.OnClickListener() { // from class: com.instagram.debug.devoptions.section.securityalerts.SecurityAlertsOptions$getItems$4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int A05 = C0f9.A05(1938928619);
                UserSession userSession2 = UserSession.this;
                C14360o3.A0B(userSession2, 0);
                AbstractC166987dD.A1Z(new MCM(userSession2, null, 35), AnonymousClass194.A02(AbstractC25231BEo.A0e(C12L.A00)));
                C9GR.A00(fragmentActivity, "Mock keys changed alert generated", null, 0);
                C0f9.A0C(1952151632, A05);
            }
        }, 2131958413), new GHY(fragmentActivity, new View.OnClickListener() { // from class: com.instagram.debug.devoptions.section.securityalerts.SecurityAlertsOptions$getItems$5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int A05 = C0f9.A05(-26251461);
                UserSession userSession2 = UserSession.this;
                C14360o3.A0B(userSession2, 0);
                MCO.A04(userSession2, AnonymousClass194.A02(AbstractC25231BEo.A0e(C12L.A00)), 44);
                C9GR.A00(fragmentActivity, "Local data cleared", null, 0);
                C0f9.A0C(-1948429011, A05);
            }
        }, 2131958412));
    }

    @Override // com.instagram.debug.devoptions.intf.DeveloperOptionsSection
    public int getTitleRes() {
        return 2131958417;
    }
}
