package com.instagram.urlhandlers.accountstatus;

import X.AbstractC08820cl;
import X.AbstractC167017dG;
import X.C140966Yy;
import X.C14360o3;
import X.C37171oF;
import X.C72743Nv;
import X.EnumC72410Xcy;
import X.InterfaceC11380iw;
import X.VXN;
import android.net.Uri;
import android.os.Bundle;
import com.facebook.graphql.enums.EnumHelper;
import com.instagram.common.session.UserSession;
import com.instagram.urlhandler.UserSessionUrlHandlerActivity;

/* loaded from: classes11.dex */
public final class AccountStatusUrlHandlerActivity extends UserSessionUrlHandlerActivity implements InterfaceC11380iw {
    @Override // com.instagram.base.activity.BaseFragmentActivity
    public final void A0j(Bundle bundle) {
    }

    @Override // com.instagram.urlhandler.UserSessionUrlHandlerActivity
    public final void A0n(Bundle bundle, Bundle bundle2, UserSession userSession) {
        AbstractC167017dG.A1P(userSession, bundle2);
        String string = bundle2.getString("original_url");
        if (string == null) {
            finish();
            return;
        }
        Uri A03 = AbstractC08820cl.A03(string);
        C14360o3.A07(A03);
        String queryParameter = A03.getQueryParameter("location");
        C37171oF A00 = VXN.A00();
        EnumC72410Xcy enumC72410Xcy = (EnumC72410Xcy) EnumHelper.A00(queryParameter, EnumC72410Xcy.A1F);
        C14360o3.A07(enumC72410Xcy);
        C72743Nv A04 = C37171oF.A00(this, this, userSession, enumC72410Xcy, A00, null, null).A04();
        C140966Yy c140966Yy = new C140966Yy(this, userSession);
        c140966Yy.A0B(null, A04);
        c140966Yy.A0D = false;
        c140966Yy.A04();
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "account_status_url_handler";
    }
}
