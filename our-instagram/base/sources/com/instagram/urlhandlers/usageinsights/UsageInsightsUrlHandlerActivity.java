package com.instagram.urlhandlers.usageinsights;

import X.AbstractC08760ce;
import X.AbstractC12990ll;
import X.AbstractC18680vv;
import X.AbstractC25225BEi;
import X.AbstractC31171DnF;
import X.AbstractC31172DnG;
import X.AbstractC31174DnI;
import X.C08600cO;
import X.C0K8;
import X.C0f9;
import X.C140966Yy;
import X.C1VE;
import X.EnumC33408Epf;
import android.content.Intent;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class UsageInsightsUrlHandlerActivity extends BaseFragmentActivity {
    @Override // com.instagram.base.activity.BaseFragmentActivity
    public final void A0j(Bundle bundle) {
    }

    @Override // X.InterfaceC12980lk
    public final /* bridge */ /* synthetic */ AbstractC12990ll getSession() {
        return AbstractC31171DnF.A0F(this);
    }

    @Override // com.instagram.base.activity.BaseFragmentActivity, com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String str;
        int i;
        int A00 = C0f9.A00(-228067465);
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (intent == null) {
            finish();
            i = 788910210;
        } else {
            Bundle A08 = AbstractC31172DnG.A08(intent);
            if (A08 == null) {
                finish();
                i = 273764332;
            } else {
                UserSession A0G = AbstractC31171DnF.A0G(A08);
                if (A0G == null) {
                    finish();
                    i = -293455118;
                } else {
                    C08600cO c08600cO = new C08600cO();
                    c08600cO.A01();
                    c08600cO.A02(AbstractC08760ce.A0m, "com.instagram.android");
                    try {
                        c08600cO.A00().A02(this, getIntent(), null);
                        C1VE c1ve = C1VE.A02;
                        if (c1ve != null) {
                            C140966Yy A0r = AbstractC25225BEi.A0r(this, A0G);
                            A0r.A0D(C1VE.A00(c1ve).A01(A0G, EnumC33408Epf.A0B));
                            A0r.A0F = true;
                            AbstractC31174DnI.A1L(A0r);
                        }
                    } catch (IllegalStateException e) {
                        e = e;
                        str = "Failed to verify caller";
                        C0K8.A0F("usage_insights_url_handler", str, e);
                        finish();
                        i = -96932578;
                        C0f9.A07(i, A00);
                    } catch (SecurityException e2) {
                        e = e2;
                        str = "Security issue with caller";
                        C0K8.A0F("usage_insights_url_handler", str, e);
                        finish();
                        i = -96932578;
                        C0f9.A07(i, A00);
                    }
                    i = -96932578;
                }
            }
        }
        C0f9.A07(i, A00);
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, X.InterfaceC12980lk
    public final AbstractC18680vv getSession() {
        return AbstractC31171DnF.A0F(this);
    }
}
