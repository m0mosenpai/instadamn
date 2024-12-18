package com.instagram.urlhandlers.crossapptagging;

import X.AbstractC001900j;
import X.C06090Tz;
import X.C14360o3;
import X.C18U;
import X.InterfaceC11380iw;
import android.os.Bundle;
import com.facebook.common.stringformat.StringFormatUtil;
import com.instagram.urlhandler.UserSessionUrlHandlerActivity;

/* loaded from: classes6.dex */
public final class XATUrlHandlerActivity extends UserSessionUrlHandlerActivity implements InterfaceC11380iw {
    @Override // com.instagram.base.activity.BaseFragmentActivity
    public final void A0j(Bundle bundle) {
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "cross_app_tagging_ig";
    }

    public static final String A01(XATUrlHandlerActivity xATUrlHandlerActivity, String str, String str2) {
        String formatStrLocaleSafe;
        String A04 = C18U.A04(C06090Tz.A05, ((UserSessionUrlHandlerActivity) xATUrlHandlerActivity).A00, 36879350867886347L);
        if (AbstractC001900j.A0T(A04)) {
            formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe("https://www.facebook.com/%s/posts/%s", str, str2);
        } else {
            formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe("https://www.facebook.com/%s/posts/%s?mibextid=%s", str, str2, A04);
        }
        C14360o3.A0A(formatStrLocaleSafe);
        return formatStrLocaleSafe;
    }
}
