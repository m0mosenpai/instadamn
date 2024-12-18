package com.instagram.urlhandlers.fundraiserexternal;

import X.AbstractC12990ll;
import X.AbstractC166987dD;
import X.AbstractC18680vv;
import X.AbstractC192798gL;
import X.AbstractC31171DnF;
import X.AbstractC31172DnG;
import X.AbstractC35178FfV;
import X.C023409i;
import X.C06N;
import X.C09Y;
import X.C0f9;
import X.C14360o3;
import X.C192108fB;
import X.C1GJ;
import X.C32392EOt;
import X.C35756Fqt;
import X.C35974FuY;
import X.C62862tP;
import android.content.Intent;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.HashMap;

/* loaded from: classes6.dex */
public final class FundraiserExternalUrlHandlerActivity extends BaseFragmentActivity {
    public AbstractC18680vv A00;
    public final C06N A01 = new C35756Fqt(this, 12);

    @Override // com.instagram.base.activity.BaseFragmentActivity
    public final void A0j(Bundle bundle) {
    }

    @Override // X.InterfaceC12980lk
    public final /* bridge */ /* synthetic */ AbstractC12990ll getSession() {
        return this.A00;
    }

    @Override // com.instagram.base.activity.BaseFragmentActivity, com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int A00 = C0f9.A00(-222218453);
        super.onCreate(bundle);
        Intent intent = getIntent();
        Bundle A08 = AbstractC31172DnG.A08(intent);
        C09Y c09y = C023409i.A0A;
        C14360o3.A0A(A08);
        AbstractC18680vv A04 = c09y.A04(A08);
        this.A00 = A04;
        HashMap A1G = AbstractC166987dD.A1G();
        A1G.put("fundraiser_id", intent.getStringExtra("fundraiser_id"));
        A1G.put("source_name", intent.getStringExtra("source_name"));
        getSupportFragmentManager().A0r(this.A01);
        if (!(A04 instanceof UserSession)) {
            AbstractC35178FfV.A01(this, A08, A04);
        } else {
            AbstractC31171DnF.A1Q(A04);
            C62862tP A0O = AbstractC31172DnG.A0O(this, new C35974FuY(), A04);
            AbstractC192798gL A05 = C192108fB.A05(A04, "com.instagram.social_impact.fundraiser.personal.details.full_screen_action", A1G);
            C32392EOt.A00(A05, A0O, 18);
            C1GJ.A03(A05);
        }
        C0f9.A07(1363554571, A00);
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, X.InterfaceC12980lk
    public final AbstractC18680vv getSession() {
        return this.A00;
    }
}
