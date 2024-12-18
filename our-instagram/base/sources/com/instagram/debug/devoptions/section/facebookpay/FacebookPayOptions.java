package com.instagram.debug.devoptions.section.facebookpay;

import X.AbstractC018607g;
import X.AbstractC167017dG;
import X.AbstractC16960so;
import X.AbstractC59962oe;
import X.C05F;
import X.C0f9;
import X.C12260kU;
import X.C66277U6x;
import X.GHY;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.fbpay.IgECPPlaygroundActivity;
import com.instagram.debug.devoptions.intf.DeveloperOptionsSection;
import java.util.List;

/* loaded from: classes5.dex */
public final class FacebookPayOptions implements DeveloperOptionsSection {
    public static final FacebookPayOptions INSTANCE = new Object();

    @Override // com.instagram.debug.devoptions.intf.DeveloperOptionsSection
    public List getItems(final UserSession userSession, final FragmentActivity fragmentActivity, AbstractC59962oe abstractC59962oe, AbstractC018607g abstractC018607g) {
        AbstractC167017dG.A1N(userSession, fragmentActivity);
        return AbstractC16960so.A1Q(new GHY(fragmentActivity, new View.OnClickListener() { // from class: com.instagram.debug.devoptions.section.facebookpay.FacebookPayOptions$getItems$1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int A05 = C0f9.A05(-1026261208);
                C12260kU.A0C(FragmentActivity.this, IgECPPlaygroundActivity.Companion.getActivityIntent(FragmentActivity.this));
                C0f9.A0C(-1462685768, A05);
            }
        }, fragmentActivity.getString(2131957757)), new GHY(fragmentActivity, new View.OnClickListener() { // from class: com.instagram.debug.devoptions.section.facebookpay.FacebookPayOptions$getItems$2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int A05 = C0f9.A05(648592298);
                C66277U6x A00 = C66277U6x.A00("com.bloks.www.fbpay.ecp.playground");
                FragmentActivity fragmentActivity2 = FragmentActivity.this;
                IgBloksScreenConfig igBloksScreenConfig = new IgBloksScreenConfig(userSession);
                igBloksScreenConfig.A0R = "";
                igBloksScreenConfig.A0U = fragmentActivity2.getResources().getString(2131957755);
                igBloksScreenConfig.A0P = C05F.A01;
                A00.A04(fragmentActivity2, igBloksScreenConfig);
                C0f9.A0C(-1709450148, A05);
            }
        }, fragmentActivity.getString(2131957755)));
    }

    @Override // com.instagram.debug.devoptions.intf.DeveloperOptionsSection
    public int getTitleRes() {
        return 2131957767;
    }
}
