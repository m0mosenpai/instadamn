package com.instagram.monetization.impl;

import X.AbstractC166987dD;
import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.AbstractC31171DnF;
import X.C05F;
import X.C06090Tz;
import X.C18U;
import X.C66277U6x;
import X.InterfaceC11380iw;
import X.LL0;
import X.N5G;
import X.W6d;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.api.schemas.UserMonetizationProductType;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class MonetizationFragmentFactoryImpl implements InterfaceC11380iw {
    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "com.instagram.monetization.impl.MonetizationFragmentFactoryImpl";
    }

    public final Fragment A00(UserMonetizationProductType userMonetizationProductType, UserSession userSession, String str, boolean z) {
        AbstractC167017dG.A1N(userSession, userMonetizationProductType);
        if (userMonetizationProductType == UserMonetizationProductType.A06) {
            boolean z2 = true;
            boolean A1M = AbstractC167007dF.A1M("eligible_pending_opt_in".equals(str) ? 1 : 0);
            boolean equals = "not_eligible".equals(str);
            if (!equals || C18U.A06(C06090Tz.A05, userSession, 36314670042188551L)) {
                z2 = false;
            }
            if (!A1M && !z2) {
                if (equals) {
                    LL0.A01(this, userSession, C05F.A01);
                }
            } else {
                Bundle A0b = AbstractC166987dD.A0b();
                A0b.putString("ARGUMENT_PRODUCT_TYPE", userMonetizationProductType.A00);
                if (str != null) {
                    A0b.putString("ARGUMENT_ELIGIBILITY", str);
                }
                A0b.putBoolean("ARGUMENT_TEMPORARY_INELIGIBILITY_STATUS", z);
                N5G n5g = new N5G();
                n5g.setArguments(A0b);
                return n5g;
            }
        }
        return W6d.A02(AbstractC31171DnF.A0C(userSession), C66277U6x.A00("com.bloks.www.ig.creator_monetization.screens.creator_monetization_status"));
    }
}
