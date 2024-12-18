package com.instagram.wellbeing.timespent.activity;

import X.AbstractC12990ll;
import X.AbstractC166997dE;
import X.AbstractC18680vv;
import X.AbstractC31171DnF;
import X.AbstractC31173DnH;
import X.C00O;
import X.C023409i;
import X.C09Y;
import X.C0f9;
import X.C14240no;
import X.C1VE;
import X.C1VH;
import X.C72743Nv;
import X.EnumC33408Epf;
import android.os.Bundle;
import com.facebook.R;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class TimeSpentDashboardActivity extends BaseFragmentActivity {
    public UserSession A00;

    @Override // X.InterfaceC12980lk
    public final /* bridge */ /* synthetic */ AbstractC12990ll getSession() {
        UserSession userSession = this.A00;
        if (userSession == null) {
            AbstractC31171DnF.A0y();
            throw C00O.createAndThrow();
        }
        return userSession;
    }

    @Override // com.instagram.base.activity.BaseFragmentActivity
    public final void A0j(Bundle bundle) {
        C1VE c1ve;
        if (getSupportFragmentManager().A0O(R.id.layout_container_main) == null && (c1ve = C1VE.A02) != null) {
            C1VH A00 = C1VE.A00(c1ve);
            EnumC33408Epf enumC33408Epf = EnumC33408Epf.A03;
            UserSession userSession = this.A00;
            if (userSession == null) {
                AbstractC31171DnF.A0y();
                throw C00O.createAndThrow();
            }
            C72743Nv A01 = A00.A01(userSession, enumC33408Epf);
            C14240no c14240no = new C14240no(getSupportFragmentManager());
            c14240no.A0A(A01, R.id.layout_container_main);
            c14240no.A00();
        }
    }

    @Override // android.app.Activity
    public final void finish() {
        super.finish();
        overridePendingTransition(R.anim.left_in, R.anim.right_out);
    }

    @Override // com.instagram.base.activity.BaseFragmentActivity, com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int A00 = C0f9.A00(595417369);
        C09Y c09y = C023409i.A0A;
        Bundle A0A = AbstractC31173DnH.A0A(this);
        if (A0A != null) {
            this.A00 = c09y.A06(A0A);
            super.onCreate(bundle);
            overridePendingTransition(R.anim.right_in, R.anim.left_out);
            C0f9.A07(-1583341520, A00);
            return;
        }
        IllegalStateException A0g = AbstractC166997dE.A0g();
        C0f9.A07(-746640960, A00);
        throw A0g;
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, X.InterfaceC12980lk
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        UserSession userSession = this.A00;
        if (userSession == null) {
            AbstractC31171DnF.A0y();
            throw C00O.createAndThrow();
        }
        return userSession;
    }
}
