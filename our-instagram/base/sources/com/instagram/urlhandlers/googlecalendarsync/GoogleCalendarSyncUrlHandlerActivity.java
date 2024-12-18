package com.instagram.urlhandlers.googlecalendarsync;

import X.AbstractC07840b2;
import X.AbstractC08820cl;
import X.AbstractC12990ll;
import X.AbstractC166987dD;
import X.AbstractC18680vv;
import X.AbstractC31171DnF;
import X.AbstractC31173DnH;
import X.AbstractC31176DnK;
import X.AbstractC31177DnL;
import X.AbstractC31181DnP;
import X.AbstractC35178FfV;
import X.C0K8;
import X.C0f9;
import X.C140966Yy;
import X.C66277U6x;
import X.C72743Nv;
import X.W6d;
import android.net.Uri;
import android.os.Bundle;
import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class GoogleCalendarSyncUrlHandlerActivity extends BaseFragmentActivity {
    public AbstractC18680vv A00;

    @Override // com.instagram.base.activity.BaseFragmentActivity
    public final void A0j(Bundle bundle) {
    }

    @Override // X.InterfaceC12980lk
    public final /* bridge */ /* synthetic */ AbstractC12990ll getSession() {
        return this.A00;
    }

    @Override // com.instagram.base.activity.BaseFragmentActivity, com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        HashMap A1G;
        String str;
        int i;
        int A00 = C0f9.A00(1098937532);
        super.onCreate(bundle);
        this.A00 = AbstractC31171DnF.A0F(this);
        Bundle A07 = AbstractC31176DnK.A07(this);
        if (A07 == null) {
            finish();
            i = -1079162842;
        } else {
            String A0a = AbstractC31171DnF.A0a(A07);
            if (A0a == null) {
                finish();
                i = -521089291;
            } else {
                if (!(this.A00 instanceof UserSession)) {
                    AbstractC35178FfV.A00().A00(this, A07, this.A00);
                } else {
                    Uri A03 = AbstractC08820cl.A03(A0a);
                    if (A03.toString().contains("launch")) {
                        String queryParameter = A03.getQueryParameter("auth_url");
                        if (queryParameter != null) {
                            AbstractC07840b2.A03(this, AbstractC31177DnL.A07(queryParameter));
                        }
                        finish();
                    } else {
                        if (A03.toString().contains("success")) {
                            A1G = AbstractC166987dD.A1G();
                            JSONObject A0q = AbstractC31171DnF.A0q();
                            JSONObject A0q2 = AbstractC31171DnF.A0q();
                            try {
                                AbstractC31181DnP.A0Q(A03, IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATE, A0q);
                                AbstractC31181DnP.A0Q(A03, IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_CODE, A0q);
                                A0q2.put("server_params", A0q);
                                A1G.put("params", A0q2.toString());
                                str = "com.bloks.www.service.merchant.google.calendar.sync";
                            } catch (JSONException e) {
                                String message = e.getMessage();
                                if (message != null) {
                                    C0K8.A0C("GoogleCalendarSyncUrlHandlerActivity", message);
                                }
                                throw new RuntimeException(e);
                            }
                        } else if (A03.toString().contains(OptSvcAnalyticsStore.LOGGING_KEY_DEX2OAT_FAILURE)) {
                            A1G = AbstractC166987dD.A1G();
                            JSONObject A0q3 = AbstractC31171DnF.A0q();
                            JSONObject A0q4 = AbstractC31171DnF.A0q();
                            try {
                                AbstractC31181DnP.A0Q(A03, "error", A0q3);
                                A0q4.put("server_params", A0q3);
                                A1G.put("params", A0q4.toString());
                                str = "com.bloks.www.service.merchant.google.calendar.sync.failure";
                            } catch (JSONException e2) {
                                String message2 = e2.getMessage();
                                if (message2 != null) {
                                    C0K8.A0C("GoogleCalendarSyncUrlHandlerActivity", message2);
                                }
                                throw new RuntimeException(e2);
                            }
                        }
                        AbstractC18680vv abstractC18680vv = this.A00;
                        C66277U6x A01 = C66277U6x.A01(str, A1G);
                        IgBloksScreenConfig A0C = AbstractC31171DnF.A0C(abstractC18680vv);
                        AbstractC31171DnF.A10(getApplicationContext(), A0C, 2131963281);
                        C72743Nv A02 = W6d.A02(A0C, A01);
                        C140966Yy A0P = AbstractC31173DnH.A0P(this, abstractC18680vv);
                        A0P.A0D = false;
                        A0P.A0E(A02);
                        A0P.A04();
                    }
                }
                i = -1824512064;
            }
        }
        C0f9.A07(i, A00);
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, X.InterfaceC12980lk
    public final AbstractC18680vv getSession() {
        return this.A00;
    }
}
