package com.instagram.urlhandlers.insightsexternal;

import X.AbstractC12990ll;
import X.AbstractC166987dD;
import X.AbstractC18680vv;
import X.AbstractC2044893h;
import X.AbstractC31172DnG;
import X.AbstractC31173DnH;
import X.AbstractC35178FfV;
import X.AbstractC35212Fg5;
import X.AbstractC35275FhA;
import X.C0f9;
import X.C14360o3;
import X.C1GJ;
import X.C1ON;
import X.C37484Gf2;
import X.InterfaceC11380iw;
import android.content.Intent;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.net.URLEncoder;

/* loaded from: classes6.dex */
public class InsightsExternalUrlHandlerActivity extends BaseFragmentActivity implements InterfaceC11380iw {
    public AbstractC18680vv A00;

    @Override // com.instagram.base.activity.BaseFragmentActivity
    public final void A0j(Bundle bundle) {
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "insights_external_url_handler";
    }

    @Override // X.InterfaceC12980lk
    public final /* bridge */ /* synthetic */ AbstractC12990ll getSession() {
        return this.A00;
    }

    @Override // com.instagram.base.activity.BaseFragmentActivity, com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i;
        int A00 = C0f9.A00(1155522125);
        super.onCreate(bundle);
        Intent intent = getIntent();
        Bundle A08 = AbstractC31172DnG.A08(intent);
        A08.getClass();
        this.A00 = AbstractC31172DnG.A0V(A08);
        A08.putString("media_id", intent.getStringExtra("media_id"));
        AbstractC18680vv abstractC18680vv = this.A00;
        if (!(abstractC18680vv instanceof UserSession)) {
            AbstractC35178FfV.A00().A00(this, A08, this.A00);
        } else {
            UserSession userSession = (UserSession) abstractC18680vv;
            String string = A08.getString("media_id");
            if (string != null) {
                String encode = URLEncoder.encode(string);
                AbstractC31173DnH.A1C(A08, userSession);
                C1ON A04 = AbstractC2044893h.A04(userSession, encode);
                A04.A00 = new C37484Gf2(22, this, userSession);
                C1GJ.A03(A04);
                i = -869657981;
            } else {
                String stringExtra = intent.getStringExtra("pk");
                if (stringExtra != null && !AbstractC31172DnG.A1Z(userSession, stringExtra)) {
                    A08.putString("destination_id", "mainfeed");
                    AbstractC35275FhA.A03(this, A08);
                    i = -917220224;
                } else {
                    User A10 = AbstractC166987dD.A10(userSession);
                    C14360o3.A0B(userSession, 0);
                    AbstractC35212Fg5.A03(this, this, userSession, A10, true);
                }
            }
            C0f9.A07(i, A00);
        }
        i = 1618001620;
        C0f9.A07(i, A00);
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, X.InterfaceC12980lk
    public final AbstractC18680vv getSession() {
        return this.A00;
    }
}
