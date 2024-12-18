package com.instagram.debug.image.sessionhelper;

import X.C14360o3;
import android.content.Context;
import com.instagram.common.session.UserSession;

/* loaded from: classes.dex */
public final class UserSessionStart {
    public static final UserSessionStart INSTANCE = new Object();

    public void onUserSessionStart(UserSession userSession, Context context, boolean z) {
        C14360o3.A0B(userSession, 0);
        ImageDebugSessionHelper.Companion.getInstance(userSession).updateModules();
    }
}
