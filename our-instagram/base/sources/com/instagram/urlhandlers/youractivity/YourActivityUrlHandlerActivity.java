package com.instagram.urlhandlers.youractivity;

import X.AbstractC111324zv;
import X.AbstractC12990ll;
import X.AbstractC166997dE;
import X.AbstractC18680vv;
import X.AbstractC31171DnF;
import X.AbstractC31174DnI;
import X.AbstractC31176DnK;
import X.AbstractC35178FfV;
import X.C023409i;
import X.C09Y;
import X.C0f9;
import X.C140966Yy;
import X.C66277U6x;
import X.W6d;
import android.content.Intent;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class YourActivityUrlHandlerActivity extends BaseFragmentActivity {
    @Override // com.instagram.base.activity.BaseFragmentActivity
    public final void A0j(Bundle bundle) {
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, X.InterfaceC12980lk
    public final AbstractC18680vv getSession() {
        C09Y c09y = C023409i.A0A;
        Bundle A07 = AbstractC31176DnK.A07(this);
        if (A07 != null) {
            return c09y.A04(A07);
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // com.instagram.base.activity.BaseFragmentActivity, com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i;
        Bundle bundleExtra;
        int A00 = C0f9.A00(496547428);
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (intent != null && (bundleExtra = intent.getBundleExtra("com.instagram.url.extra.BUNDLE")) != null) {
            String string = bundleExtra.getString("original_url");
            if (string != null && string.length() != 0) {
                AbstractC18680vv session = getSession();
                if (!(session instanceof UserSession)) {
                    AbstractC35178FfV.A01(this, bundleExtra, session);
                } else {
                    C66277U6x A002 = C66277U6x.A00(AbstractC111324zv.A00(371));
                    IgBloksScreenConfig A0C = AbstractC31171DnF.A0C(session);
                    A0C.A0U = "Your activity";
                    C140966Yy A0N = AbstractC31174DnI.A0N(W6d.A02(A0C, A002), this, session);
                    A0N.A0D = false;
                    A0N.A04();
                }
                i = -621034905;
            } else {
                finish();
                i = 342559816;
            }
        } else {
            finish();
            i = -350672374;
        }
        C0f9.A07(i, A00);
    }

    @Override // X.InterfaceC12980lk
    public final /* bridge */ /* synthetic */ AbstractC12990ll getSession() {
        return getSession();
    }
}
