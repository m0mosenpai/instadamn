package com.instagram.urlhandlers.igxfbnetego;

import X.AbstractC03270Dk;
import X.AbstractC111324zv;
import X.AbstractC12990ll;
import X.AbstractC18680vv;
import X.AbstractC25225BEi;
import X.AbstractC31171DnF;
import X.AbstractC31176DnK;
import X.AbstractC31364DqT;
import X.AbstractC31402Dr6;
import X.C0f9;
import X.C31368DqX;
import X.InterfaceC11380iw;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.fx.igxfb.IgxfbNetEgoCTABannerParams;

/* loaded from: classes6.dex */
public final class IgxfbNetegoUrlHandlerActivity extends BaseFragmentActivity implements InterfaceC11380iw {
    @Override // com.instagram.base.activity.BaseFragmentActivity
    public final void A0j(Bundle bundle) {
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "igxfb_netego";
    }

    @Override // X.InterfaceC12980lk
    public final /* bridge */ /* synthetic */ AbstractC12990ll getSession() {
        return AbstractC31171DnF.A0F(this);
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        if (getSupportFragmentManager().A0L() > 1) {
            super.onBackPressed();
        } else {
            finish();
        }
    }

    @Override // com.instagram.base.activity.BaseFragmentActivity, com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i;
        int A00 = C0f9.A00(-1635215782);
        super.onCreate(bundle);
        if (AbstractC31176DnK.A07(this) == null) {
            finish();
            i = -1002842815;
        } else {
            String stringExtra = getIntent().getStringExtra("link");
            String stringExtra2 = getIntent().getStringExtra("media_id");
            String stringExtra3 = getIntent().getStringExtra("qp_id");
            UserSession A002 = AbstractC03270Dk.A00(AbstractC31171DnF.A0F(this));
            C31368DqX A01 = AbstractC31402Dr6.A01(A002, "1807199", AbstractC111324zv.A00(5124), "igxfb_netego");
            if (stringExtra != null && stringExtra.length() != 0) {
                A01.A01 = new IgxfbNetEgoCTABannerParams(stringExtra, stringExtra2, stringExtra3);
            }
            C31368DqX.A02(AbstractC25225BEi.A0r(this, A002), A002, AbstractC31364DqT.A02(), A01);
            i = 331382616;
        }
        C0f9.A07(i, A00);
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, X.InterfaceC12980lk
    public final AbstractC18680vv getSession() {
        return AbstractC31171DnF.A0F(this);
    }
}
