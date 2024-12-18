package com.facebook.browser.lite.extensions.autofill.base.jsbridge;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC25226BEj;
import X.AbstractC31171DnF;
import X.AbstractC31173DnH;
import X.AbstractC31174DnI;
import X.AbstractC31175DnJ;
import X.AbstractC31177DnL;
import X.AbstractC58318PtA;
import X.AbstractC58320PtC;
import X.AbstractC58322PtE;
import X.AbstractC62771SQn;
import X.AbstractC62772SQo;
import X.AbstractC63045SbP;
import X.AbstractC63232Sfk;
import X.AbstractC63254SgB;
import X.AbstractC63387Sj3;
import X.AbstractC63402SjX;
import X.AnonymousClass001;
import X.C01T;
import X.C05F;
import X.C06090Tz;
import X.C0K8;
import X.C0f9;
import X.C14360o3;
import X.C18U;
import X.C26061Bfo;
import X.C43031yW;
import X.C45126Jxv;
import X.C51760Mtj;
import X.C58883QEt;
import X.C5G6;
import X.C61602RqR;
import X.C62620SJd;
import X.C63021Sam;
import X.C63024Sau;
import X.C63305ShB;
import X.C63380Siu;
import X.EnumC61149RgA;
import X.QDr;
import X.QF6;
import X.QIf;
import X.QIl;
import X.RunnableC64548TJk;
import X.RunnableC64550TJm;
import X.RunnableC64715TQw;
import X.S8U;
import X.SKK;
import X.SMR;
import X.SOY;
import X.STG;
import X.TNB;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.util.Patterns;
import android.webkit.JavascriptInterface;
import android.widget.Toast;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.browser.lite.bridge.BrowserLiteJSBridgeProxy;
import com.facebook.browser.lite.extensions.autofill.model.AutofillData;
import com.facebook.browser.lite.ipc.BrowserLiteJSBridgeCall;
import com.facebook.browser.lite.ipc.BrowserLiteJSBridgeCallback;
import com.facebook.browser.lite.webview.SystemWebView;
import com.facebook.businessextension.jscalls.BusinessExtensionJSBridgeCall;
import com.facebook.businessextension.jscalls.RequestAutofillJSBridgeCall;
import com.facebook.businessextension.jscalls.RequestAutofillJSBridgeCallData;
import com.facebook.businessextension.jscalls.SaveAutofillDataJSBridgeCall;
import com.facebook.businessextension.jscalls.SaveAutofillDataJSBridgeCallData;
import com.google.common.collect.ImmutableMap;
import com.google.gson.Gson;
import com.instagram.common.session.UserSession;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public class AutofillSharedJSBridgeProxy extends BrowserLiteJSBridgeProxy {
    public int A00;
    public Long A01;
    public String A02;
    public String A03;
    public final Intent A04;
    public final SOY A05;
    public final C5G6 A06;
    public final SKK A07;
    public final WeakReference A08;
    public final BrowserLiteJSBridgeCallback A09;

    /* loaded from: classes10.dex */
    public final class AutofillJSBridgeCallback extends BrowserLiteJSBridgeCallback.Stub {
        public /* synthetic */ AutofillJSBridgeCallback() {
            C0f9.A0A(1344741880, C0f9.A03(2070390607));
            C0f9.A0A(-1278671524, C0f9.A03(1494410591));
        }

        /* JADX WARN: Type inference failed for: r6v0, types: [com.facebook.businessextension.jscalls.RequestAutofillJSBridgeCall, com.facebook.browser.lite.ipc.BrowserLiteJSBridgeCall] */
        @Override // com.facebook.browser.lite.ipc.BrowserLiteJSBridgeCallback
        public final void D1G(Bundle bundle, BrowserLiteJSBridgeCall browserLiteJSBridgeCall, int i) {
            Runnable runnableC64548TJk;
            int i2;
            String str;
            LinkedHashSet linkedHashSet;
            boolean z;
            C06090Tz c06090Tz;
            C58883QEt A0K;
            CharSequence charSequence;
            int A03 = C0f9.A03(-976148486);
            AutofillSharedJSBridgeProxy autofillSharedJSBridgeProxy = AutofillSharedJSBridgeProxy.this;
            WeakReference weakReference = autofillSharedJSBridgeProxy.A08;
            C58883QEt A0K2 = AbstractC58318PtA.A0K(weakReference);
            if (A0K2 == null) {
                i2 = -779279474;
            } else {
                String str2 = browserLiteJSBridgeCall.A04;
                if (str2.equals("requestAutoFill")) {
                    Context context = browserLiteJSBridgeCall.A00;
                    String str3 = browserLiteJSBridgeCall.A03;
                    Bundle bundle2 = browserLiteJSBridgeCall.A01;
                    String str4 = browserLiteJSBridgeCall.A05;
                    Bundle bundle3 = browserLiteJSBridgeCall.A02;
                    if (bundle2 == null) {
                        bundle2 = AbstractC166987dD.A0b();
                    }
                    ?? browserLiteJSBridgeCall2 = new BrowserLiteJSBridgeCall(context, bundle2, bundle3, str3, "requestAutoFill", str4);
                    C5G6 c5g6 = autofillSharedJSBridgeProxy.A06;
                    C62620SJd c62620SJd = c5g6.A00;
                    C14360o3.A0B(c62620SJd, 1);
                    QIl qIl = c62620SJd.A00;
                    Bundle bundle4 = browserLiteJSBridgeCall2.A02;
                    RequestAutofillJSBridgeCallData requestAutofillJSBridgeCallData = (RequestAutofillJSBridgeCallData) AbstractC58320PtC.A0r(bundle4, "requestAutofillData");
                    if (requestAutofillJSBridgeCallData == null) {
                        str = null;
                    } else {
                        str = requestAutofillJSBridgeCallData.A00;
                    }
                    qIl.A00 = str;
                    qIl.A07 = browserLiteJSBridgeCall2.A04();
                    RequestAutofillJSBridgeCallData requestAutofillJSBridgeCallData2 = (RequestAutofillJSBridgeCallData) AbstractC58320PtC.A0r(bundle4, "requestAutofillData");
                    if (requestAutofillJSBridgeCallData2 == null) {
                        linkedHashSet = null;
                    } else {
                        linkedHashSet = requestAutofillJSBridgeCallData2.A01;
                    }
                    qIl.A04 = linkedHashSet;
                    QIf qIf = c62620SJd.A08;
                    qIf.A01 = (String) AbstractC58320PtC.A0r(bundle4, "callbackID");
                    qIf.A00 = "requestAutoFill";
                    qIf.A02 = browserLiteJSBridgeCall2.A05;
                    Integer valueOf = Integer.valueOf(browserLiteJSBridgeCall2.A01.getInt("instanceKey", 0));
                    ArrayList A1E = AbstractC166987dD.A1E();
                    ArrayList A05 = AbstractC63402SjX.A05(bundle.getStringArrayList("BrowserLiteIntent.EXTRA_AUTOFILL_ENTRY_JSON_STRINGS"));
                    if (!A05.isEmpty()) {
                        ArrayList A1E2 = AbstractC166987dD.A1E();
                        Iterator it = A05.iterator();
                        while (it.hasNext()) {
                            C45126Jxv A00 = AbstractC62772SQo.A00(AbstractC58318PtA.A12(((AutofillData) it.next()).A00));
                            if (A00 != null) {
                                A1E2.add(A00);
                            }
                        }
                        c62620SJd.A0C.A00 = A1E2;
                        AutofillData autofillData = (AutofillData) A05.get(0);
                        C51760Mtj c51760Mtj = c62620SJd.A0N;
                        if (c51760Mtj.A00 != null || c51760Mtj.A02 != null) {
                            C43031yW c43031yW = c5g6.A04;
                            String A04 = C18U.A04(C06090Tz.A05, c43031yW.A00, 36885750375187126L);
                            C14360o3.A0A(A04);
                            if (!A04.equals("control")) {
                                autofillData = AbstractC63045SbP.A00(c62620SJd, c43031yW);
                            }
                        }
                        C14360o3.A0B(autofillData, 0);
                        String str5 = qIl.A00;
                        if (str5 != null && (charSequence = (CharSequence) Collections.unmodifiableMap(autofillData.A00).get(str5)) != null && charSequence.length() != 0) {
                            A1E.add(autofillData);
                        }
                    }
                    Context A032 = autofillSharedJSBridgeProxy.A03();
                    if (!A1E.isEmpty() && A032 != null && (A0K = AbstractC58318PtA.A0K(weakReference)) != null) {
                        AutofillData autofillData2 = (AutofillData) A1E.get(0);
                        C14360o3.A0B(autofillData2, 0);
                        String A1A = AbstractC166987dD.A1A("email", autofillData2.A00);
                        boolean z2 = true;
                        if (A1A == null || !AbstractC31175DnJ.A1Z(A1A, Patterns.EMAIL_ADDRESS)) {
                            z2 = false;
                        }
                        A0K.A0R = z2;
                        A0K.A0S = AbstractC62771SQn.A00(A032, autofillData2);
                    }
                    if (autofillSharedJSBridgeProxy.A03() != null && !A1E.isEmpty()) {
                        C43031yW c43031yW2 = c5g6.A04;
                        Iterator it2 = A1E.iterator();
                        while (it2.hasNext()) {
                            Map map = ((AutofillData) it2.next()).A00;
                            if (map.get("email") != null || map.get("tel") != null) {
                                z = true;
                                break;
                            }
                        }
                        z = false;
                        UserSession userSession = c43031yW2.A00;
                        if (z) {
                            c06090Tz = C06090Tz.A05;
                        } else {
                            c06090Tz = C06090Tz.A06;
                        }
                        if (AbstractC31177DnL.A1U(c06090Tz, userSession, 36322800416795215L)) {
                            Context A033 = autofillSharedJSBridgeProxy.A03();
                            Iterator it3 = A1E.iterator();
                            while (it3.hasNext()) {
                                AutofillData autofillData3 = (AutofillData) it3.next();
                                Set set = qIl.A07;
                                if (set != null && autofillData3 != null && set.contains("tel") && set.contains("email")) {
                                    Map map2 = autofillData3.A00;
                                    String A1A2 = AbstractC166987dD.A1A("email", map2);
                                    if (A1A2 == null || !AbstractC31175DnJ.A1Z(A1A2, Patterns.EMAIL_ADDRESS)) {
                                        map2.remove("email");
                                    }
                                    if (!AbstractC62771SQn.A00(A033, autofillData3)) {
                                        map2.remove("tel");
                                    }
                                }
                            }
                            ListIterator listIterator = A1E.listIterator();
                            while (listIterator.hasNext()) {
                                AutofillData autofillData4 = (AutofillData) listIterator.next();
                                if (autofillData4 != null) {
                                    Map map3 = autofillData4.A00;
                                    if (!map3.isEmpty()) {
                                        TreeSet treeSet = new TreeSet(map3.keySet());
                                        treeSet.removeAll(Arrays.asList(PublicKeyCredentialControllerUtility.JSON_KEY_ID, "ent_id", "usage_frequency"));
                                        if (!AbstractC25226BEj.A1b(treeSet)) {
                                        }
                                    }
                                    listIterator.remove();
                                }
                            }
                        }
                    }
                    if (!A1E.isEmpty()) {
                        A0K2.A0A(autofillSharedJSBridgeProxy, valueOf, A1E);
                    } else {
                        autofillSharedJSBridgeProxy.A05.A02(A0K2.A03(), C05F.A0u, qIl.A00);
                        STG.A00(new RunnableC64548TJk(A0K2));
                        C63021Sam c63021Sam = c5g6.A02;
                        c63021Sam.A03(valueOf, "prompt_name", "NO_PROMPTED_AUTOFILL", 772805755);
                        c63021Sam.A01(valueOf, null, 772805755);
                    }
                } else if (str2.equals("saveAutofillData")) {
                    if (A0K2.A0T) {
                        runnableC64548TJk = new RunnableC64550TJm(A0K2);
                        STG.A00(runnableC64548TJk);
                    }
                } else if (str2.equals("hideAutoFillBar")) {
                    runnableC64548TJk = new RunnableC64548TJk(A0K2);
                    STG.A00(runnableC64548TJk);
                }
                i2 = -1262187364;
            }
            C0f9.A0A(i2, A03);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0017 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0016 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private org.json.JSONObject A00(java.lang.String r5) {
        /*
            r4 = this;
            r3 = 0
            org.json.JSONObject r2 = X.AbstractC58318PtA.A17(r5)     // Catch: org.json.JSONException -> L12
            java.lang.String r0 = "nonce"
            java.lang.String r1 = r2.optString(r0)     // Catch: org.json.JSONException -> L13
            java.lang.String r0 = r4.A02     // Catch: org.json.JSONException -> L13
            boolean r0 = r1.equals(r0)     // Catch: org.json.JSONException -> L13
            goto L14
        L12:
            r2 = r3
        L13:
            r0 = 0
        L14:
            if (r0 == 0) goto L17
            return r2
        L17:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.browser.lite.extensions.autofill.base.jsbridge.AutofillSharedJSBridgeProxy.A00(java.lang.String):org.json.JSONObject");
    }

    public final void A0B(Bundle bundle) {
        SMR smr;
        QIf qIf = this.A06.A00.A08;
        String str = qIf.A00;
        if (str != null) {
            if (str.equals("getNonce")) {
                smr = BusinessExtensionJSBridgeCall.A02(bundle, this.A03);
            } else if (str.equals("requestAutoFill")) {
                smr = BusinessExtensionJSBridgeCall.A02(bundle, this.A03);
                A0D(C05F.A01, bundle.getString("callback_result"));
            } else {
                C0K8.A0O("AutofillSharedJSBridgeProxy", "No valid callback found for call: %s", str);
                smr = null;
            }
            String str2 = qIf.A02;
            String str3 = this.A03;
            C14360o3.A0B(str3, 1);
            QF6 A05 = A05();
            if (A05 != null && smr != null) {
                ((SystemWebView) A05).A04.post(new RunnableC64715TQw(this, smr, A05, str2, str3));
            }
        }
    }

    @JavascriptInterface
    public void selectedContactFieldTag(String str) {
    }

    private void A02(String str) {
        C58883QEt A0K = AbstractC58318PtA.A0K(this.A08);
        if (A0K != null) {
            AbstractC63402SjX.A0A(A0K.A03(), this.A06, this.A05.A00(str, false).A00());
        }
    }

    /* JADX WARN: Type inference failed for: r9v0, types: [com.facebook.businessextension.jscalls.SaveAutofillDataJSBridgeCall, com.facebook.browser.lite.ipc.BrowserLiteJSBridgeCall] */
    public final SaveAutofillDataJSBridgeCall A0A(JSONObject jSONObject) {
        C58883QEt A0K = AbstractC58318PtA.A0K(this.A08);
        if (A0K != null) {
            A0K.A0e.put(AbstractC63387Sj3.A02(A0K.A0Y.A00.A09.A01), AbstractC63402SjX.A00(jSONObject));
        }
        Context A03 = A03();
        String A06 = A06();
        Bundle A04 = A04();
        String A07 = A07();
        Bundle A01 = BusinessExtensionJSBridgeCall.A01(jSONObject);
        JSONObject jSONObject2 = jSONObject.getJSONObject("raw_autofill_data");
        ImmutableMap immutableMap = null;
        if (jSONObject2 != null) {
            HashMap A1G = AbstractC166987dD.A1G();
            Iterator<String> keys = jSONObject2.keys();
            while (keys.hasNext()) {
                try {
                    String A1B = AbstractC166987dD.A1B(keys);
                    JSONArray jSONArray = jSONObject2.getJSONArray(A1B);
                    ArrayList A1E = AbstractC166987dD.A1E();
                    for (int i = 0; i < jSONArray.length(); i++) {
                        Object obj = jSONArray.get(i);
                        if (obj instanceof String) {
                            A1E.add(obj);
                        } else {
                            StringBuilder A1C = AbstractC166987dD.A1C();
                            throw new JSONException(AbstractC166997dE.A0v(AbstractC58318PtA.A0X(obj, "Value was not a String, was ", A1C), A1C));
                        }
                    }
                    A1G.put(A1B, A1E);
                } catch (JSONException e) {
                    AbstractC63254SgB.A00("SaveAutofillDataJSBridgeCall", "Failed to parse raw autofill data", e, e);
                }
            }
            immutableMap = ImmutableMap.copyOf((Map) A1G);
        }
        A01.putParcelable("saveAutofillDataData", new SaveAutofillDataJSBridgeCallData(immutableMap));
        if (A04 == null) {
            A04 = AbstractC166987dD.A0b();
        }
        return new BrowserLiteJSBridgeCall(A03, A04, A01, A06, "saveAutofillData", A07);
    }

    public final void A0C(BrowserLiteJSBridgeCall browserLiteJSBridgeCall) {
        BrowserLiteJSBridgeCallback browserLiteJSBridgeCallback = this.A09;
        C63305ShB A00 = C63305ShB.A00();
        C63305ShB.A02(new QDr(A00, browserLiteJSBridgeCall, browserLiteJSBridgeCallback), A00, false);
    }

    @JavascriptInterface
    public void initializeCallbackHandler(String str) {
        try {
            this.A03 = AbstractC58318PtA.A17(str).getString(PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
            A01(this, str);
            Integer num = C05F.A00;
            HashMap A1G = AbstractC166987dD.A1G();
            ArrayList A1E = AbstractC166987dD.A1E();
            HashMap A1G2 = AbstractC166987dD.A1G();
            A1G2.put("jsExperimentName", "set_autofill_notify_focus_event_enabled");
            C5G6 c5g6 = this.A06;
            UserSession userSession = c5g6.A04.A00;
            C06090Tz c06090Tz = C06090Tz.A06;
            Boolean A0c = AbstractC166997dE.A0c(c06090Tz, userSession, 36322800416074310L);
            C14360o3.A0A(A0c);
            A1G2.put("jsExperimentValue", A0c);
            HashMap A1G3 = AbstractC166987dD.A1G();
            A1G3.put("jsExperimentName", "set_autofill_contact_dropdowns_enabled");
            AbstractC31173DnH.A1Y("jsExperimentValue", A1G3, true);
            HashMap A1G4 = AbstractC166987dD.A1G();
            A1G4.put("jsExperimentName", "use_contact_js_autofill_input_setter_v2");
            Boolean A0c2 = AbstractC166997dE.A0c(c06090Tz, userSession, 36322800416008773L);
            C14360o3.A0A(A0c2);
            A1G4.put("jsExperimentValue", A0c2);
            HashMap A1G5 = AbstractC166987dD.A1G();
            A1G5.put("jsExperimentName", "enable_contact_softkeyboard");
            AbstractC31173DnH.A1Y("jsExperimentValue", A1G5, false);
            HashMap A1G6 = AbstractC166987dD.A1G();
            A1G6.put("jsExperimentName", "enable_autofill_perf_js_qpl");
            C06090Tz c06090Tz2 = C06090Tz.A05;
            Boolean A0c3 = AbstractC166997dE.A0c(c06090Tz2, userSession, 36322800421186182L);
            C14360o3.A0A(A0c3);
            A1G6.put("jsExperimentValue", A0c3);
            HashMap A1G7 = AbstractC166987dD.A1G();
            A1G7.put("jsExperimentName", "autofill_prompts_only_at_field_tapped_enabled_shopify");
            Boolean A0c4 = AbstractC166997dE.A0c(c06090Tz2, userSession, 36322800421841550L);
            C14360o3.A0A(A0c4);
            A1G7.put("jsExperimentValue", A0c4);
            HashMap A1G8 = AbstractC166987dD.A1G();
            A1G8.put("jsExperimentName", "autofill_prompts_only_at_field_tapped_enabled_shopify_checkout");
            Boolean A0c5 = AbstractC166997dE.A0c(c06090Tz2, userSession, 36322800421907087L);
            C14360o3.A0A(A0c5);
            A1G8.put("jsExperimentValue", A0c5);
            HashMap A1G9 = AbstractC166987dD.A1G();
            A1G9.put("jsExperimentName", "notify_android_for_form_submission");
            Boolean A0c6 = AbstractC166997dE.A0c(c06090Tz2, userSession, 36322800422496919L);
            C14360o3.A0A(A0c6);
            A1G9.put("jsExperimentValue", A0c6);
            A1E.add(A1G2);
            A1E.add(A1G3);
            A1E.add(A1G4);
            A1E.add(A1G5);
            A1E.add(A1G6);
            A1E.add(A1G7);
            A1E.add(A1G8);
            A1E.add(A1G9);
            A1G.put("jsExperiments", A1E);
            A0D(num, new Gson().A0B(A1G));
            if (!C18U.A06(c06090Tz2, userSession, 36322800418040416L) && AbstractC31177DnL.A1U(c06090Tz2, userSession, 36322800417122898L)) {
                Integer num2 = C05F.A0C;
                HashMap A1G10 = AbstractC166987dD.A1G();
                A1G10.put("instanceKey", String.valueOf(c5g6.A02.A00(null, 772803488, 0)));
                A0D(num2, new Gson().A0B(A1G10));
            }
        } catch (JSONException e) {
            Log.e("AutofillSharedJSBridgeProxy", "Exception parsing initializeCallbackHandler call", e);
        }
    }

    @JavascriptInterface
    public void notifyAutofillFocusoutEventV2(String str) {
        JSONObject A00 = A00(str);
        if (A00 != null) {
            String optString = A00.optString("action");
            HashMap A12 = AbstractC31174DnI.A12(A00.optString("fieldName"), A00.optString("fieldNameScenario"));
            if (!optString.equals("FILL_FIELD_END") && !optString.equals("EDIT_FIELD_END")) {
                throw AbstractC166987dD.A12("Notify focus out event action is not supported");
            }
            C63024Sau c63024Sau = this.A06.A01;
            c63024Sau.A02(null, new C26061Bfo((Integer) null, (Integer) null, (Long) null, (Long) null, (String) null, (String) null, (String) null, (String) null, (Map) A12, 1022, false), AbstractC63232Sfk.A00(c63024Sau.A00), optString);
        }
    }

    @JavascriptInterface
    public void requestAutoFill(String str) {
        C58883QEt A0K;
        Bundle bundle;
        String str2;
        C5G6 c5g6 = this.A06;
        C43031yW c43031yW = c5g6.A04;
        if (!c43031yW.A07(false) && (A0K = AbstractC58318PtA.A0K(this.A08)) != null) {
            A02("JS_REQUEST_AUTOFILL");
            C63021Sam c63021Sam = c5g6.A02;
            int i = 0;
            Integer A00 = c63021Sam.A00(null, 772805755, 0);
            c63021Sam.A03(A00, "prompt_type", "CONTACT_AUTOFILL", 772805755);
            JSONObject A002 = A00(str);
            if (A002 == null) {
                this.A05.A02(A0K.A03(), C05F.A01, null);
                c63021Sam.A03(A00, "prompt_name", "NO_PROMPTED_AUTOFILL", 772805755);
                c63021Sam.A01(A00, null, 772805755);
                SKK skk = this.A07;
                String A0g = AnonymousClass001.A0g(str, ";\n nonce: ", this.A02);
                C14360o3.A0B(A0g, 0);
                skk.A00.AEp(A0g, 772816852).report();
                return;
            }
            if (this.A01 == null) {
                this.A01 = AbstractC31173DnH.A0g();
                C61602RqR A003 = this.A05.A00("FIRST_FORM_INTERACTION", false);
                A003.A0A = c5g6.A00.A06.A06;
                try {
                    JSONArray jSONArray = new JSONArray(A002.getString("allFields"));
                    ArrayList A1E = AbstractC166987dD.A1E();
                    int length = jSONArray.length();
                    for (int i2 = 0; i2 < length; i2 = AbstractC58322PtE.A0C(A1E, jSONArray, i2)) {
                    }
                    C01T.A1C(A1E);
                    str2 = TextUtils.join(", ", A1E);
                } catch (JSONException e) {
                    AbstractC63254SgB.A00("AutofillSharedUtil", "Failed to parseAllFields", e, e);
                    str2 = null;
                }
                A003.A06 = str2;
                A003.A0F = AbstractC63402SjX.A03(A002);
                A003.A0G = AbstractC63402SjX.A04(A002);
                A003.A08 = A07();
                AbstractC63402SjX.A0B(c5g6, A0K, A003);
                A0K.A0F = this.A01;
                C14360o3.A0A(AbstractC166997dE.A0c(C06090Tz.A05, c43031yW.A00, 36322800419744374L));
            }
            Intent intent = this.A04;
            if (intent != null && intent.getBooleanExtra("BrowserLiteIntent.EXTRA_AUTOFILL_DEBUG_KEY", false)) {
                Toast.makeText(A03(), "requestAutofill", 0).show();
            }
            C62620SJd c62620SJd = c5g6.A00;
            C14360o3.A0B(c62620SJd, 0);
            if (!AbstractC167007dF.A1X(c62620SJd.A0K.A03, EnumC61149RgA.A04)) {
                this.A05.A02(A0K.A03(), C05F.A0C, AbstractC63402SjX.A04(A002));
                c63021Sam.A03(A00, "prompt_name", "NO_PROMPTED_AUTOFILL", 772805755);
                c63021Sam.A01(A00, null, 772805755);
                return;
            }
            if (A04() == null) {
                bundle = AbstractC166987dD.A0b();
            } else {
                bundle = (Bundle) A04().clone();
            }
            if (A00 != null) {
                i = A00.intValue();
            }
            bundle.putInt("instanceKey", i);
            A0C(new BrowserLiteJSBridgeCall(A03(), bundle, RequestAutofillJSBridgeCall.A03(A002), A06(), "requestAutoFill", A07()));
        }
    }

    @JavascriptInterface
    public void saveAutofillData(String str) {
        long currentTimeMillis;
        Bundle bundle;
        C58883QEt A0K = AbstractC58318PtA.A0K(this.A08);
        if (A0K != null) {
            A02("JS_SAVE_AUTOFILL_DATA");
            C5G6 c5g6 = this.A06;
            C63021Sam c63021Sam = c5g6.A02;
            Integer A00 = c63021Sam.A00(null, 772805755, 0);
            c63021Sam.A03(A00, "prompt_type", "SAVE_CONTACT_AUTOFILL", 772805755);
            JSONObject A002 = A00(str);
            if (A002 == null) {
                c63021Sam.A03(A00, "prompt_name", "NO_PROMPTED_AUTOFILL", 772805755);
                c63021Sam.A01(A00, null, 772805755);
                return;
            }
            Long l = this.A01;
            if (l == null) {
                currentTimeMillis = 0;
            } else {
                currentTimeMillis = System.currentTimeMillis() - l.longValue();
            }
            Long valueOf = Long.valueOf(currentTimeMillis);
            C61602RqR A003 = this.A05.A00("FORM_COMPLETION", false);
            A003.A02 = valueOf.longValue();
            int i = this.A00 + 1;
            this.A00 = i;
            A003.A00 = i;
            C62620SJd c62620SJd = c5g6.A00;
            A003.A0A = c62620SJd.A06.A06;
            A003.A08 = A07();
            A003.A06 = AbstractC63402SjX.A03(A002);
            A003.A0F = AbstractC63402SjX.A03(A002);
            A003.A0G = AbstractC63402SjX.A04(A002);
            AbstractC63402SjX.A0B(c5g6, A0K, A003);
            Intent intent = this.A04;
            if (intent != null && intent.getBooleanExtra("BrowserLiteIntent.EXTRA_AUTOFILL_DEBUG_KEY", false)) {
                Toast.makeText(A03(), "saveAutofillData", 0).show();
            }
            if (!AbstractC167007dF.A1X(c62620SJd.A0K.A03, EnumC61149RgA.A04)) {
                c63021Sam.A03(A00, "prompt_name", "NO_PROMPTED_AUTOFILL", 772805755);
                c63021Sam.A01(A00, null, 772805755);
                return;
            }
            AutofillData A004 = AbstractC63402SjX.A00(A002);
            A0K.A0A = A004;
            if (A002.has("autofillFields")) {
                try {
                    bundle = RequestAutofillJSBridgeCall.A03(A002);
                } catch (JSONException unused) {
                    bundle = Bundle.EMPTY;
                }
            } else {
                bundle = Bundle.EMPTY;
            }
            A0K.A08(bundle, this, A004, A00);
        }
    }

    public AutofillSharedJSBridgeProxy(Intent intent, SOY soy, C5G6 c5g6, SKK skk, QF6 qf6, String str, WeakReference weakReference) {
        super.A01 = str;
        A08(qf6);
        this.A09 = new AutofillJSBridgeCallback();
        this.A08 = weakReference;
        this.A04 = intent;
        this.A05 = soy;
        this.A06 = c5g6;
        this.A07 = skk;
    }

    public static void A01(AutofillSharedJSBridgeProxy autofillSharedJSBridgeProxy, String str) {
        if (autofillSharedJSBridgeProxy.A03() != null) {
            autofillSharedJSBridgeProxy.A02 = AbstractC166997dE.A0o();
            Context A03 = autofillSharedJSBridgeProxy.A03();
            String A06 = autofillSharedJSBridgeProxy.A06();
            Bundle A04 = autofillSharedJSBridgeProxy.A04();
            String A07 = autofillSharedJSBridgeProxy.A07();
            Bundle A01 = BusinessExtensionJSBridgeCall.A01(AbstractC58318PtA.A17(str));
            if (A04 == null) {
                A04 = AbstractC166987dD.A0b();
            }
            BrowserLiteJSBridgeCall browserLiteJSBridgeCall = new BrowserLiteJSBridgeCall(A03, A04, A01, A06, "getNonce", A07);
            C62620SJd c62620SJd = autofillSharedJSBridgeProxy.A06.A00;
            C14360o3.A0B(c62620SJd, 1);
            QIf qIf = c62620SJd.A08;
            Bundle bundle = browserLiteJSBridgeCall.A02;
            qIf.A01 = (String) AbstractC58320PtC.A0r(bundle, "callbackID");
            qIf.A00 = "getNonce";
            qIf.A02 = browserLiteJSBridgeCall.A05;
            String str2 = (String) AbstractC58320PtC.A0r(bundle, "callbackID");
            String str3 = autofillSharedJSBridgeProxy.A02;
            JSONObject A0q = AbstractC31171DnF.A0q();
            try {
                A0q.put("nonce", str3);
            } catch (JSONException e) {
                AbstractC63254SgB.A00("GetNonceJSBridgeCall", "Failed to set nonce result", e, e);
            }
            autofillSharedJSBridgeProxy.A0B(BusinessExtensionJSBridgeCall.A00(str2, A0q));
            C58883QEt A0K = AbstractC58318PtA.A0K(autofillSharedJSBridgeProxy.A08);
            if (A0K != null) {
                autofillSharedJSBridgeProxy.A01 = null;
                autofillSharedJSBridgeProxy.A00 = 0;
                c62620SJd.A06.A06 = AbstractC166997dE.A0o();
                A0K.A0L = null;
                A0K.A0C = null;
            }
        }
    }

    public final void A0D(Integer num, String str) {
        String str2;
        QF6 A05;
        try {
            Bundle A00 = BusinessExtensionJSBridgeCall.A00(null, AbstractC58318PtA.A17(str));
            String str3 = this.A03;
            String string = A00.getString("callback_result");
            switch (num.intValue()) {
                case 0:
                    str2 = "setJsExperimentValues";
                    break;
                case 1:
                    str2 = "setContactAutofillValueInAllFramesForIABIOS";
                    break;
                default:
                    str2 = "sendJsPing";
                    break;
            }
            SMR smr = new SMR(str3, "", string, str2, true);
            String str4 = this.A03;
            C14360o3.A0B(str4, 0);
            if (S8U.A00.contains(str4) && (A05 = A05()) != null) {
                ((SystemWebView) A05).A04.post(new TNB(smr, A05));
            }
        } catch (JSONException unused) {
        }
    }

    @JavascriptInterface
    public void autofillAppliedStatusesV2(String str) {
        JSONObject A00 = A00(str);
        if (A00 != null) {
            HashMap A1G = AbstractC166987dD.A1G();
            HashMap A1G2 = AbstractC166987dD.A1G();
            A1G2.put("DETECTION_SOURCE", "jsSdk");
            JSONArray jSONArray = A00.getJSONArray("autofillAppliedStatuses");
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                A1G2.put(jSONObject.getString("autoCompleteTag"), jSONObject.getString("autofillStatus"));
            }
            A1G.put("autofillAppliedStatuses", new Gson().A0B(A1G2));
            SOY soy = this.A05;
            C58883QEt A0K = AbstractC58318PtA.A0K(soy.A00);
            if (A0K != null) {
                C61602RqR A002 = soy.A00("AUTOFILL_APPLY_COMPLETED", false);
                Map map = A002.A0K;
                if (map == null) {
                    map = AbstractC166987dD.A1G();
                    A002.A0K = map;
                }
                map.putAll(A1G);
                A002.A06 = A0K.A0I;
                A002.A07 = A0K.A0J;
                A002.A0F = A0K.A0K;
                C63305ShB.A00().A07(null, A002.A00().A01());
            }
        }
    }

    @JavascriptInterface
    public void formSubmitted(String str) {
        C58883QEt A0K;
        if (A00(str) != null && (A0K = AbstractC58318PtA.A0K(this.A08)) != null) {
            String A07 = A07();
            C63380Siu c63380Siu = A0K.A05;
            if (c63380Siu != null) {
                AutofillData A00 = C58883QEt.A00(A0K, c63380Siu);
                c63380Siu.A0C = C05F.A0N;
                c63380Siu.A0N(A00, A07, false);
            }
        }
    }

    @JavascriptInterface
    public void getNonce(String str) {
        A01(this, str);
    }

    @JavascriptInterface
    public void hideAutoFillBar(String str) {
        JSONObject A00 = A00(str);
        if (A00 != null) {
            Context A03 = A03();
            String A06 = A06();
            Bundle A04 = A04();
            String A07 = A07();
            Bundle A01 = BusinessExtensionJSBridgeCall.A01(A00);
            if (A04 == null) {
                A04 = AbstractC166987dD.A0b();
            }
            A0C(new BrowserLiteJSBridgeCall(A03, A04, A01, A06, "hideAutoFillBar", A07));
        }
    }

    @JavascriptInterface
    public void jsPing(String str) {
        JSONObject A00 = A00(str);
        if (A00 != null) {
            this.A06.A02.A04(A00);
        }
    }

    @JavascriptInterface
    public void jsQPL(String str) {
        JSONObject A00 = A00(str);
        if (A00 != null) {
            this.A06.A02.A04(A00);
        }
    }
}
