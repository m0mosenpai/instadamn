package com.instagram.urlhandlers.businesssuitehub;

import X.AbstractC12990ll;
import X.AbstractC166997dE;
import X.AbstractC18680vv;
import X.AbstractC25225BEi;
import X.AbstractC31171DnF;
import X.AbstractC31172DnG;
import X.AbstractC31174DnI;
import X.AbstractC31175DnJ;
import X.AbstractC31176DnK;
import X.AbstractC35178FfV;
import X.C023409i;
import X.C09Y;
import X.C0f9;
import X.C140966Yy;
import X.C66277U6x;
import X.W6d;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import java.util.HashMap;

/* loaded from: classes6.dex */
public final class MetaBusinessSuiteHubUrlHandlerActivity extends BaseFragmentActivity {
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
        int A00 = C0f9.A00(-772057558);
        super.onCreate(bundle);
        Bundle A07 = AbstractC31176DnK.A07(this);
        if (A07 == null) {
            finish();
            i = -1684370951;
        } else {
            if (!AbstractC31172DnG.A1Y(this)) {
                AbstractC35178FfV.A03(A07, this);
            }
            if (AbstractC31171DnF.A0a(A07) == null) {
                finish();
                i = -1396329327;
            } else {
                String A0Y = AbstractC31175DnJ.A0Y(A07, "entry_ref");
                AbstractC18680vv session = getSession();
                HashMap A12 = AbstractC31174DnI.A12("entry_ref", A0Y);
                C140966Yy A0r = AbstractC25225BEi.A0r(this, session);
                C66277U6x A01 = C66277U6x.A01("com.instagram.hubs.meta_business_suite.mbs_hub.MBSHubScreen", A12);
                IgBloksScreenConfig A0C = AbstractC31171DnF.A0C(session);
                A0C.A0k = false;
                A0r.A0D(W6d.A02(A0C, A01));
                A0r.A0D = false;
                A0r.A04();
                i = -2142741207;
            }
        }
        C0f9.A07(i, A00);
    }

    @Override // X.InterfaceC12980lk
    public final /* bridge */ /* synthetic */ AbstractC12990ll getSession() {
        return getSession();
    }
}
