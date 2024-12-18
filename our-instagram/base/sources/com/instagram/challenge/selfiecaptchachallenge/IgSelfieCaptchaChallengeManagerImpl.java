package com.instagram.challenge.selfiecaptchachallenge;

import X.AbstractC10360h2;
import X.AbstractC12990ll;
import X.AbstractC166987dD;
import X.AbstractC167007dF;
import X.AbstractC167027dH;
import X.AbstractC16960so;
import X.C23313AUy;
import X.C63961Swl;
import X.C85R;
import X.EnumC142606cM;
import X.TF9;
import android.app.Activity;
import android.os.Bundle;
import java.util.List;

/* loaded from: classes4.dex */
public final class IgSelfieCaptchaChallengeManagerImpl {
    public static final List A00 = AbstractC16960so.A1Q("UNKNOWN", "LEFT", "UP", "RIGHT", "DOWN");

    public final synchronized void A00(Activity activity, Bundle bundle, AbstractC10360h2 abstractC10360h2, AbstractC12990ll abstractC12990ll, TF9 tf9, String str, String str2, String str3, String str4) {
        AbstractC167027dH.A13(abstractC12990ll, abstractC10360h2, bundle);
        AbstractC167007dF.A1H(str2, 5, tf9);
        C85R.A00(AbstractC166987dD.A0O(activity), abstractC12990ll).A01(new C23313AUy(new C63961Swl(activity, bundle, abstractC10360h2, this, abstractC12990ll, tf9, str4, str3, str2, str)), EnumC142606cM.A01);
    }
}
