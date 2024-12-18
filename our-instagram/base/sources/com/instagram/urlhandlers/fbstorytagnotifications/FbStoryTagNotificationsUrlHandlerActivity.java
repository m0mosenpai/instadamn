package com.instagram.urlhandlers.fbstorytagnotifications;

import X.AbstractC001900j;
import X.AbstractC167017dG;
import X.AnonymousClass001;
import X.C06090Tz;
import X.C14360o3;
import X.C18950wb;
import X.C18U;
import X.InterfaceC11380iw;
import X.S8X;
import android.os.Bundle;
import com.facebook.common.stringformat.StringFormatUtil;
import com.instagram.urlhandler.UserSessionUrlHandlerActivity;

/* loaded from: classes6.dex */
public final class FbStoryTagNotificationsUrlHandlerActivity extends UserSessionUrlHandlerActivity implements InterfaceC11380iw {
    public static final String A00;
    public static final String A01;

    @Override // com.instagram.base.activity.BaseFragmentActivity
    public final void A0j(Bundle bundle) {
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "fb_story_tag_notifications";
    }

    static {
        String str = S8X.A01;
        A00 = AnonymousClass001.A0R(str, "storyviewer?bucketID=%s&storyID=%s");
        A01 = AnonymousClass001.A0R(str, "storyviewer?bucketID=%s&storyID=%s&mibextid=%s");
    }

    public static final String A01(FbStoryTagNotificationsUrlHandlerActivity fbStoryTagNotificationsUrlHandlerActivity, String str, String str2) {
        String formatStrLocaleSafe;
        String A04 = C18U.A04(C06090Tz.A05, ((UserSessionUrlHandlerActivity) fbStoryTagNotificationsUrlHandlerActivity).A00, 36883126144139759L);
        if (AbstractC001900j.A0T(A04)) {
            A02(fbStoryTagNotificationsUrlHandlerActivity, "Story mention tracker mibextid is not available", null);
            formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe("https://www.facebook.com/stories/%s/%s", str, str2);
        } else {
            formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe("https://www.facebook.com/stories/%s/%s?mibextid=%s", str, str2, A04);
        }
        C14360o3.A0A(formatStrLocaleSafe);
        return formatStrLocaleSafe;
    }

    public static final void A02(FbStoryTagNotificationsUrlHandlerActivity fbStoryTagNotificationsUrlHandlerActivity, String str, Throwable th) {
        if (((UserSessionUrlHandlerActivity) fbStoryTagNotificationsUrlHandlerActivity).A00 != null) {
            AbstractC167017dG.A1J(C18950wb.A01, AnonymousClass001.A0R("FbStoryTagNotificationsUrlHandlerActivity - ", str), th, 20134884);
        }
    }
}
