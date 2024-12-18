package com.instagram.business.instantexperiences;

import X.AbstractC166987dD;
import X.C14360o3;
import X.C2Fb;
import X.JQ0;
import X.MSW;
import X.SK7;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.instagram.business.instantexperiences.ui.InstantExperiencesBrowserActivity;
import com.instagram.common.api.base.CacheBehaviorLogger;
import com.instagram.common.session.UserSession;

/* loaded from: classes10.dex */
public final class InstantExperiencesLibImpl extends SK7 {
    @Override // X.SK7
    public Intent getInstantExperiencesIntent(Context context, String str, UserSession userSession, String str2, String str3, C2Fb c2Fb, String str4) {
        C14360o3.A0B(context, 0);
        JQ0.A1O(str, userSession, str2, str3, c2Fb);
        Intent A08 = MSW.A08(context, InstantExperiencesBrowserActivity.class);
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putString("IgSessionManager.SESSION_TOKEN_KEY", userSession.token);
        A0b.putString("business_id", str);
        A0b.putString("website_url", str2);
        A0b.putString(CacheBehaviorLogger.SOURCE, str3);
        A0b.putString("app_id", str4);
        A0b.putString("surface", c2Fb.toString());
        A08.putExtras(A0b);
        return A08;
    }
}
