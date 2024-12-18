package com.instagram.urlhandlers.fxcaligaccountscenter;

import X.AbstractC126965oa;
import X.AbstractC12990ll;
import X.AbstractC166987dD;
import X.AbstractC167007dF;
import X.AbstractC18680vv;
import X.AbstractC192798gL;
import X.AbstractC25227BEk;
import X.AbstractC31171DnF;
import X.AbstractC31172DnG;
import X.AbstractC31176DnK;
import X.AbstractC31177DnL;
import X.AbstractC35178FfV;
import X.C00O;
import X.C023409i;
import X.C06N;
import X.C09Y;
import X.C0K8;
import X.C0f9;
import X.C14360o3;
import X.C192108fB;
import X.C25020B4x;
import X.C32392EOt;
import X.C35756Fqt;
import X.C35975FuZ;
import X.C54s;
import X.C62862tP;
import X.C913045j;
import X.FVN;
import android.content.Intent;
import android.os.Bundle;
import com.facebook.react.views.webview.ReactWebViewManager;
import com.instagram.base.activity.IgFragmentActivity;
import com.instagram.common.session.UserSession;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class FxCalIGAccountsCenterRedirectActivity extends IgFragmentActivity {
    public AbstractC18680vv A00;
    public UserSession A01;
    public final C06N A02 = new C35756Fqt(this, 13);

    @Override // X.InterfaceC12980lk
    public final /* bridge */ /* synthetic */ AbstractC12990ll getSession() {
        return this.A00;
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i;
        int A00 = C0f9.A00(-1828986657);
        super.onCreate(bundle);
        Bundle A07 = AbstractC31176DnK.A07(this);
        if (A07 == null) {
            finish();
            i = -2100245310;
        } else {
            C09Y c09y = C023409i.A0A;
            this.A00 = c09y.A04(A07);
            Intent intent = getIntent();
            AbstractC18680vv abstractC18680vv = this.A00;
            if (abstractC18680vv == null) {
                finish();
                i = -1791513956;
            } else if (!(abstractC18680vv instanceof UserSession)) {
                AbstractC35178FfV.A01(this, A07, abstractC18680vv);
                i = -2112106082;
            } else {
                this.A01 = c09y.A06(A07);
                String A0a = AbstractC31171DnF.A0a(A07);
                if (A0a == null) {
                    finish();
                    i = -1315700057;
                } else {
                    getSupportFragmentManager().A0r(this.A02);
                    String queryParameter = AbstractC25227BEk.A0B(A0a).getQueryParameter("entrypoint");
                    if (queryParameter == null || queryParameter.length() == 0) {
                        queryParameter = "UNKNOWN";
                    }
                    String stringExtra = intent.getStringExtra("deeplink_destination");
                    if (!intent.hasExtra("entrypoint")) {
                        C0K8.A0E("FxCalIGAccountsCenterRedirectActivity", "No entrypoint provided");
                    }
                    CharSequence[] charSequenceArr = {stringExtra, queryParameter};
                    int i2 = 0;
                    while (true) {
                        if (AbstractC126965oa.A03(charSequenceArr[i2])) {
                            break;
                        }
                        i2++;
                        if (i2 >= 2) {
                            if (stringExtra != null) {
                                String stringExtra2 = intent.getStringExtra("deeplink_params");
                                UserSession userSession = this.A01;
                                if (userSession != null) {
                                    FVN.A01(userSession, true);
                                    UserSession userSession2 = this.A01;
                                    if (userSession2 != null) {
                                        C62862tP A0O = AbstractC31172DnG.A0O(this, new C35975FuZ(), userSession2);
                                        UserSession userSession3 = this.A01;
                                        if (userSession3 != null) {
                                            C913045j c913045j = C913045j.A00;
                                            C54s c54s = new C54s(c913045j);
                                            c54s.A0F("deeplink_destination", stringExtra);
                                            c54s.A0F("entrypoint", AbstractC167007dF.A0h(queryParameter));
                                            c54s.A0D("requested_screen_component_type", 2);
                                            c54s.A0D("cds_client_value", FVN.A00(userSession3));
                                            C54s c54s2 = new C54s(c913045j);
                                            if (stringExtra2 != null && stringExtra2.length() != 0) {
                                                try {
                                                    JSONObject jSONObject = new JSONObject(URLDecoder.decode(stringExtra2, ReactWebViewManager.HTML_ENCODING));
                                                    Iterator<String> keys = jSONObject.keys();
                                                    while (keys.hasNext()) {
                                                        String A1B = AbstractC166987dD.A1B(keys);
                                                        c54s2.A0F(A1B, jSONObject.getString(A1B));
                                                    }
                                                } catch (UnsupportedEncodingException | JSONException e) {
                                                    C0K8.A0H("FxCalIGAccountsCenterRedirectActivity", "Exception on resolving deeplink params", e);
                                                }
                                            }
                                            c54s.A0C(c54s2, "deeplink_params");
                                            AbstractC192798gL A05 = C192108fB.A05(userSession3, "com.bloks.www.fxcal.settings.async", new C25020B4x(AbstractC31177DnL.A0K(c54s, c913045j), 5));
                                            C32392EOt.A00(A05, A0O, 19);
                                            schedule(A05);
                                            i = -2107354509;
                                        }
                                    }
                                }
                                C14360o3.A0F("userSession");
                                throw C00O.createAndThrow();
                            }
                        }
                    }
                    finish();
                    i = 880165277;
                }
            }
        }
        C0f9.A07(i, A00);
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, X.InterfaceC12980lk
    public final AbstractC18680vv getSession() {
        return this.A00;
    }
}
