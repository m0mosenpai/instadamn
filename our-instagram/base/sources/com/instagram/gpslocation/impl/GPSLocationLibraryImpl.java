package com.instagram.gpslocation.impl;

import X.AbstractC167027dH;
import X.AbstractC31171DnF;
import X.AbstractC31176DnK;
import X.C60930Rbk;
import X.InterfaceC65454TkQ;
import X.OGm;
import android.app.Activity;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class GPSLocationLibraryImpl extends OGm {
    public final UserSession A00;

    @Override // X.OGm
    public C60930Rbk createGooglePlayLocationSettingsController(Activity activity, UserSession userSession, InterfaceC65454TkQ interfaceC65454TkQ, String str, String str2) {
        AbstractC167027dH.A0a(0, activity, interfaceC65454TkQ, str, str2);
        return new C60930Rbk(activity, this.A00, interfaceC65454TkQ, str, str2);
    }

    public GPSLocationLibraryImpl(String str) {
        this.A00 = AbstractC31171DnF.A0G(AbstractC31176DnK.A09(str));
    }
}
