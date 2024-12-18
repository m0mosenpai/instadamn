package com.facebook.browser.lite.extensions.promoautofill.base;

import X.AbstractC12220kQ;
import X.AbstractC13230m9;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC25228BEl;
import X.AbstractC25231BEo;
import X.AbstractC31171DnF;
import X.AbstractC37300Gc1;
import X.AbstractC37301Gc2;
import X.AbstractC37302Gc3;
import X.AbstractC58318PtA;
import X.AbstractC58320PtC;
import X.AbstractC61735Rsq;
import X.AbstractC63223SfY;
import X.AnonymousClass001;
import X.C06090Tz;
import X.C0K8;
import X.C0YZ;
import X.C14360o3;
import X.C15W;
import X.C18U;
import X.C58882QEs;
import X.InterfaceC02590Ai;
import X.QF6;
import X.RunnableC64716TQx;
import X.SMR;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Base64;
import android.webkit.JavascriptInterface;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.browser.lite.bridge.BrowserLiteJSBridgeProxy;
import com.facebook.browser.lite.ipc.BrowserLiteJSBridgeCall;
import com.facebook.browser.lite.webview.SystemWebView;
import com.facebook.businessextension.jscalls.BusinessExtensionJSBridgeCall;
import com.facebook.businessextension.jscalls.promoautofill.GetPromoExtensionNonceJSBridgeCall;
import com.facebook.businessextension.jscalls.promoautofill.RequestPromoExtensionPromoCodeAutofillJSBridgeCall;
import com.facebook.iabadscontext.IgPromoAdsExtension;
import com.facebook.iabadscontext.IgPromoAdsPromoCode;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import com.instagram.realtimeclient.RealtimeConstants;
import java.nio.charset.Charset;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public final class PromoAutofillJSBridgeProxy extends BrowserLiteJSBridgeProxy {
    public static final String A05;
    public String A00;
    public String A01;
    public final Intent A02;
    public final C58882QEs A03;
    public final QF6 A04;

    private final void A00(Bundle bundle, BrowserLiteJSBridgeCall browserLiteJSBridgeCall) {
        SMR A02;
        String str = browserLiteJSBridgeCall.A04;
        if (!C14360o3.A0K(str, "getPromoExtensionNonce") && !C14360o3.A0K(str, "requestPromoExtensionPromoCodeAutofill")) {
            C0K8.A0C(A05, AnonymousClass001.A0S("PromoAutofillJSBridgeProxy - No valid callback found for call: ", str, ' '));
            A02 = null;
        } else {
            A02 = BusinessExtensionJSBridgeCall.A02(bundle, this.A01);
        }
        String str2 = this.A01;
        C14360o3.A0B(str2, 1);
        QF6 A052 = A05();
        if (A052 != null && A02 != null) {
            ((SystemWebView) A052).A04.post(new RunnableC64716TQx(this, A02, browserLiteJSBridgeCall, A052, str2));
        }
    }

    @JavascriptInterface
    public final void getPromoExtensionNonce(String str) {
        String A07;
        byte[] bytes;
        C14360o3.A0B(str, 0);
        Context A03 = A03();
        if (A03 != null && (A07 = A07()) != null) {
            String str2 = GetPromoExtensionNonceJSBridgeCall.A00;
            String A06 = A06();
            Bundle A04 = A04();
            Bundle A01 = BusinessExtensionJSBridgeCall.A01(AbstractC58318PtA.A17(str));
            if (A04 == null) {
                A04 = AbstractC166987dD.A0b();
            }
            BrowserLiteJSBridgeCall browserLiteJSBridgeCall = new BrowserLiteJSBridgeCall(A03, A04, A01, A06, "getPromoExtensionNonce", A07);
            this.A00 = AbstractC25231BEo.A0p();
            String str3 = (String) AbstractC58320PtC.A0r(browserLiteJSBridgeCall.A02, "callbackID");
            String str4 = this.A00;
            C58882QEs c58882QEs = this.A03;
            IgPromoAdsExtension igPromoAdsExtension = c58882QEs.A01;
            boolean z = igPromoAdsExtension.A03;
            StringBuilder A1C = AbstractC166987dD.A1C();
            A1C.append("\n        {\n          \"autofill\": {\n            \"enable\": ");
            A1C.append(z);
            A1C.append(",\n            \"shopifyBasedAutoApply\": {\n              \"promoCodes\": [\n                \"");
            A1C.append(c58882QEs.A01());
            String A0x = AbstractC166997dE.A0x("\"\n              ],\n              \"method\": \"URL\"\n            }\n          },\n          \"tasks\": {}\n        }\n        ", A1C);
            StringBuilder A1C2 = AbstractC166987dD.A1C();
            A1C2.append("\n        {\n          \"logging\": {\n            \"context\": {\n            \"iab_session_id\": \"");
            A1C2.append(c58882QEs.A04);
            A1C2.append("\",\n            \"offer_id\": \"");
            A1C2.append(((IgPromoAdsPromoCode) igPromoAdsExtension.A02.get(0)).A00);
            A1C2.append("\",\n            \"ad_id\": \"");
            A1C2.append(c58882QEs.A03);
            A1C2.append("\",\n            \"user_id\": \"");
            UserSession userSession = c58882QEs.A02;
            A1C2.append(userSession.userId);
            A1C2.append("\",\n            \"tracking_token\": \"");
            A1C2.append(c58882QEs.A05);
            A1C2.append("\",\n            \"has_promo_experience\": true\n            }\n          },\n          \"autofill\": {\n            \"enable\": ");
            A1C2.append(z);
            A1C2.append(",\n            \"shopifyBasedAutoApply\": {\n              \"promoCodes\": [\n                \"");
            A1C2.append(c58882QEs.A01());
            String A0x2 = AbstractC166997dE.A0x("\"\n              ],\n              \"method\": \"URL\",\n              \"supported3rdPartyCheckouts\": [\"SHOP_PAY\"]\n            }\n          },\n          \"tasks\": {\n            \"extract_ocp\": [\n              {\n                \"name\": \"EXTRACT_OCP\"\n              }\n            ]\n          }\n        }\n        ", A1C2);
            boolean A062 = C18U.A06(C06090Tz.A05, userSession, 36329942945907278L);
            Charset charset = C15W.A05;
            if (A062) {
                bytes = A0x2.getBytes(charset);
            } else {
                bytes = A0x.getBytes(charset);
            }
            C14360o3.A07(bytes);
            String encodeToString = Base64.encodeToString(bytes, 2);
            C14360o3.A07(encodeToString);
            C14360o3.A0B(str4, 1);
            JSONObject A0q = AbstractC31171DnF.A0q();
            try {
                A0q.put("nonce", str4);
                A0q.put("isDebug", false);
                A0q.put("performAutofillAction", z);
                A0q.put("configsInJSON", encodeToString);
            } catch (JSONException e) {
                C0K8.A0L(GetPromoExtensionNonceJSBridgeCall.A00, "Failed to set RETURN_PARM result", e, e);
            }
            A00(BusinessExtensionJSBridgeCall.A00(str3, A0q), browserLiteJSBridgeCall);
        }
    }

    @JavascriptInterface
    public final void initializePromoExtensionCallbackHandler(String str) {
        C14360o3.A0B(str, 0);
        try {
            String string = AbstractC58318PtA.A17(str).getString(PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
            C14360o3.A07(string);
            this.A01 = string;
        } catch (JSONException e) {
            C0K8.A0F(A05, "PromoAutofillJSBridgeProxy - Exception parsing initializePromoExtensionCallbackHandler call", e);
        }
    }

    @JavascriptInterface
    public final void requestPromoExtensionPromoCodeAutofill(String str) {
        Context A03;
        String A07;
        C14360o3.A0B(str, 0);
        try {
            if (C14360o3.A0K(AbstractC58318PtA.A17(str).optString("nonce"), this.A00) && (A03 = A03()) != null && (A07 = A07()) != null) {
                String str2 = RequestPromoExtensionPromoCodeAutofillJSBridgeCall.A00;
                String A06 = A06();
                Bundle A04 = A04();
                Bundle A01 = BusinessExtensionJSBridgeCall.A01(AbstractC58318PtA.A17(str));
                if (A04 == null) {
                    A04 = AbstractC166987dD.A0b();
                }
                BrowserLiteJSBridgeCall browserLiteJSBridgeCall = new BrowserLiteJSBridgeCall(A03, A04, A01, A06, "requestPromoExtensionPromoCodeAutofill", A07);
                String str3 = (String) AbstractC58320PtC.A0r(browserLiteJSBridgeCall.A02, "callbackID");
                String A012 = this.A03.A01();
                C14360o3.A0B(A012, 1);
                JSONObject A0q = AbstractC31171DnF.A0q();
                try {
                    A0q.put("promoCode", A012);
                } catch (JSONException e) {
                    C0K8.A0F(RequestPromoExtensionPromoCodeAutofillJSBridgeCall.A00, "Failed to set RETURN_PARM result", e);
                }
                A00(BusinessExtensionJSBridgeCall.A00(str3, A0q), browserLiteJSBridgeCall);
            }
        } catch (JSONException e2) {
            C0K8.A0F(A05, "PromoAutofillJSBridgeProxy - Request Param is NOT valid - ", e2);
        }
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [X.0iw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v26, types: [X.0iw, java.lang.Object] */
    @JavascriptInterface
    public final void sendPromoExtensionPromoCodeAutofillResult(String str) {
        String A01;
        String str2;
        InterfaceC02590Ai A0f;
        Long l;
        String str3;
        String str4;
        Long l2;
        C14360o3.A0B(str, 0);
        JSONObject A17 = AbstractC58318PtA.A17(str);
        C58882QEs c58882QEs = this.A03;
        LinkedHashMap A00 = AbstractC61735Rsq.A00(A17);
        Object obj = A00.get("result");
        if (C14360o3.A0K(obj, RealtimeConstants.SEND_FAIL)) {
            Context context = ((AbstractC63223SfY) c58882QEs).A00;
            if (context != null) {
                str4 = AbstractC167007dF.A0f(context, c58882QEs.A01(), 2131970277);
            } else {
                str4 = null;
            }
            C58882QEs.A00(c58882QEs, str4);
            UserSession userSession = c58882QEs.A02;
            String str5 = c58882QEs.A03;
            String str6 = ((IgPromoAdsPromoCode) c58882QEs.A01.A02.get(0)).A00;
            String A012 = c58882QEs.A01();
            A01 = String.valueOf(A00.get(DevServerEntity.COLUMN_DESCRIPTION));
            str2 = c58882QEs.A05;
            AbstractC37302Gc3.A1U(A012, A01);
            A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(new Object(), userSession), "ig_promo_ads_autofill_fail");
            if (A0f.isSampled()) {
                AbstractC37301Gc2.A0z(A0f, Long.parseLong(str5));
                if (str6 != null) {
                    l2 = AbstractC25228BEl.A13(str6);
                } else {
                    l2 = null;
                }
                A0f.A9K("offer_id", l2);
                A0f.AAP("promo_code", A012);
                str3 = "autofill_description";
            } else {
                return;
            }
        } else {
            if (!C14360o3.A0K(obj, "success")) {
                return;
            }
            UserSession userSession2 = c58882QEs.A02;
            String str7 = c58882QEs.A03;
            String str8 = ((IgPromoAdsPromoCode) c58882QEs.A01.A02.get(0)).A00;
            A01 = c58882QEs.A01();
            str2 = c58882QEs.A05;
            C14360o3.A0B(A01, 3);
            A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(new Object(), userSession2), "autofill_success");
            if (!A0f.isSampled()) {
                return;
            }
            AbstractC37301Gc2.A0z(A0f, Long.parseLong(str7));
            if (str8 != null) {
                l = AbstractC25228BEl.A13(str8);
            } else {
                l = null;
            }
            A0f.A9K("offer_id", l);
            str3 = "promo_code";
        }
        A0f.AAP(str3, A01);
        AbstractC37300Gc1.A0o(A0f, str2);
        A0f.Cht();
    }

    static {
        Map map = C0YZ.A03;
        String A01 = AbstractC13230m9.A01(PromoAutofillJSBridgeProxy.class);
        if (A01 == null) {
            A01 = "PromoAutofillJSBridgeProxy";
        }
        A05 = A01;
    }

    public PromoAutofillJSBridgeProxy(Intent intent, C58882QEs c58882QEs, QF6 qf6) {
        super.A01 = "_PromoExtensions";
        this.A04 = qf6;
        this.A03 = c58882QEs;
        this.A02 = intent;
        this.A01 = "";
        this.A00 = "";
        A08(qf6);
    }
}
