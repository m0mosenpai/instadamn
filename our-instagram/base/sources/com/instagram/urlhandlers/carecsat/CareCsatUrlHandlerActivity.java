package com.instagram.urlhandlers.carecsat;

import X.AbstractC12990ll;
import X.AbstractC166987dD;
import X.AbstractC167017dG;
import X.AbstractC18680vv;
import X.AbstractC192798gL;
import X.AbstractC25227BEk;
import X.AbstractC31171DnF;
import X.AbstractC31176DnK;
import X.AbstractC31181DnP;
import X.AbstractC35178FfV;
import X.C023409i;
import X.C09Y;
import X.C0f9;
import X.C14360o3;
import X.C192108fB;
import X.C1GJ;
import X.C32392EOt;
import X.C35756Fqt;
import X.C62862tP;
import X.InterfaceC11380iw;
import android.net.Uri;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class CareCsatUrlHandlerActivity extends BaseFragmentActivity implements InterfaceC11380iw {
    @Override // com.instagram.base.activity.BaseFragmentActivity
    public final void A0j(Bundle bundle) {
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "care_csat_url_handler_activity";
    }

    @Override // X.InterfaceC12980lk
    public final /* bridge */ /* synthetic */ AbstractC12990ll getSession() {
        return AbstractC31171DnF.A0F(this);
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        finish();
    }

    @Override // com.instagram.base.activity.BaseFragmentActivity, com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i;
        int A00 = C0f9.A00(-1392076615);
        super.onCreate(bundle);
        Bundle A07 = AbstractC31176DnK.A07(this);
        if (A07 != null) {
            C09Y c09y = C023409i.A0A;
            if (c09y.A05(this) != null) {
                AbstractC18680vv A05 = c09y.A05(this);
                if (!(A05 instanceof UserSession)) {
                    AbstractC35178FfV.A01(this, A07, A05);
                    finish();
                    i = -1356109979;
                } else {
                    String A0a = AbstractC31171DnF.A0a(A07);
                    if (A0a == null) {
                        finish();
                        i = -92797707;
                    } else {
                        Uri A0B = AbstractC25227BEk.A0B(A0a);
                        if (A0B.getQueryParameter("survey_id") == null) {
                            finish();
                            i = -193361080;
                        } else {
                            AbstractC31181DnP.A0L(this, getWindow());
                            JSONObject A0q = AbstractC31171DnF.A0q();
                            JSONObject put = AbstractC31171DnF.A0q().put("server_params", A0q);
                            Set<String> queryParameterNames = A0B.getQueryParameterNames();
                            C14360o3.A07(queryParameterNames);
                            Iterator<String> it = queryParameterNames.iterator();
                            while (it.hasNext()) {
                                String A1B = AbstractC166987dD.A1B(it);
                                A0q.put(A1B, A0B.getQueryParameter(A1B));
                            }
                            HashMap A0r = AbstractC167017dG.A0r("params", put.toString());
                            C35756Fqt.A00(getSupportFragmentManager(), this, 4);
                            C62862tP A01 = C62862tP.A01(null, this, this, c09y.A05(this));
                            AbstractC192798gL A052 = C192108fB.A05(A05, "com.bloks.www.novi.care.start_survey_action", A0r);
                            C32392EOt.A00(A052, A01, 17);
                            C1GJ.A03(A052);
                            i = 66159902;
                        }
                    }
                }
                C0f9.A07(i, A00);
            }
        }
        finish();
        i = 1170363246;
        C0f9.A07(i, A00);
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStart() {
        int A00 = C0f9.A00(-302601122);
        overridePendingTransition(0, 0);
        super.onStart();
        C0f9.A07(1660134142, A00);
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, X.InterfaceC12980lk
    public final AbstractC18680vv getSession() {
        return AbstractC31171DnF.A0F(this);
    }
}
