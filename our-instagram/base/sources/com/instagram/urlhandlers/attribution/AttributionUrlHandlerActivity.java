package com.instagram.urlhandlers.attribution;

import X.AbstractC03270Dk;
import X.AbstractC12990ll;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC18680vv;
import X.AbstractC31176DnK;
import X.C023409i;
import X.C09Y;
import X.C0f9;
import X.C70151W8r;
import X.RunnableC71395Wt4;
import X.VPV;
import X.W4T;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class AttributionUrlHandlerActivity extends BaseFragmentActivity {
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
        int A00 = C0f9.A00(-1556058898);
        super.onCreate(bundle);
        W4T A002 = VPV.A00(this, AbstractC03270Dk.A00(getSession()));
        C70151W8r c70151W8r = A002.A04;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("event_name", "flush");
        C70151W8r.A01(AbstractC166987dD.A19(jSONObject), "info", c70151W8r);
        A002.A03.execute(new RunnableC71395Wt4(A002));
        finish();
        C0f9.A07(-1336508980, A00);
    }

    @Override // X.InterfaceC12980lk
    public final /* bridge */ /* synthetic */ AbstractC12990ll getSession() {
        return getSession();
    }
}
