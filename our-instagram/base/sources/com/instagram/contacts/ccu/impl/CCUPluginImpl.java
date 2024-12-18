package com.instagram.contacts.ccu.impl;

import X.AbstractC167017dG;
import X.C218914p;
import X.C36161Fxb;
import android.content.Context;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class CCUPluginImpl {
    public void initScheduler(Context context, UserSession userSession) {
        AbstractC167017dG.A1N(context, userSession);
        if (userSession.A00(C36161Fxb.class) == null) {
            C36161Fxb c36161Fxb = new C36161Fxb(context, userSession);
            C218914p.A05(c36161Fxb);
            userSession.A04(C36161Fxb.class, c36161Fxb);
        }
    }

    public CCUPluginImpl(int i) {
    }

    public CCUPluginImpl() {
    }
}
