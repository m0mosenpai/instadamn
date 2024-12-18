package X;

import android.webkit.JavascriptInterface;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.android.instantexperiences.jscall.InstantExperiencesJSBridgeCall;
import com.instagram.business.instantexperiences.IGInstantExperiencesParameters;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public final class SQD {
    public String A00;
    public String A01;
    public final IGInstantExperiencesParameters A02;
    public final SZ1 A03;

    public SQD(C58717Q4q c58717Q4q, IGInstantExperiencesParameters iGInstantExperiencesParameters, SZ1 sz1) {
        C14360o3.A0B(iGInstantExperiencesParameters, 2);
        this.A03 = sz1;
        this.A02 = iGInstantExperiencesParameters;
        c58717Q4q.A05.add(new C63908Svj(this));
    }

    @JavascriptInterface
    public final void canMakePayment(String str) {
        try {
            SZ1 sz1 = this.A03;
            String str2 = this.A01;
            C14360o3.A0A(str2);
            IGInstantExperiencesParameters iGInstantExperiencesParameters = this.A02;
            String str3 = this.A00;
            if (str3 == null) {
                C14360o3.A0F("hostUrl");
                throw C00O.createAndThrow();
            }
            sz1.A01(new InstantExperiencesJSBridgeCall(iGInstantExperiencesParameters, str2, str3, AbstractC58318PtA.A17(str)));
        } catch (JSONException e) {
            C0K8.A0F("InstantExperiencesJSBridge", "Failed to canMakePayment", e);
            throw e;
        }
    }

    @JavascriptInterface
    public final void paymentsCheckout(String str) {
        try {
            SZ1 sz1 = this.A03;
            String str2 = this.A01;
            IGInstantExperiencesParameters iGInstantExperiencesParameters = this.A02;
            String str3 = this.A00;
            if (str3 == null) {
                C14360o3.A0F("hostUrl");
                throw C00O.createAndThrow();
            }
            sz1.A01(new InstantExperiencesJSBridgeCall(iGInstantExperiencesParameters, str2, str3, AbstractC58318PtA.A17(str)));
        } catch (JSONException e) {
            C0K8.A0F("InstantExperiencesJSBridge", "Failed to paymentsCheckout", e);
            throw e;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.facebook.android.instantexperiences.payment.chargerequest.PaymentsChargeRequestCall, com.facebook.android.instantexperiences.jscall.InstantExperiencesJSBridgeCall] */
    @JavascriptInterface
    public final void paymentsCheckoutChargeRequestErrorReturn(String str) {
        try {
            SZ1 sz1 = this.A03;
            String str2 = this.A01;
            C14360o3.A0A(str2);
            IGInstantExperiencesParameters iGInstantExperiencesParameters = this.A02;
            String str3 = this.A00;
            if (str3 == null) {
                C14360o3.A0F("hostUrl");
                throw C00O.createAndThrow();
            }
            ?? instantExperiencesJSBridgeCall = new InstantExperiencesJSBridgeCall(iGInstantExperiencesParameters, str2, str3, AbstractC58318PtA.A17(str));
            instantExperiencesJSBridgeCall.A00 = "error";
            sz1.A01(instantExperiencesJSBridgeCall);
        } catch (JSONException e) {
            C0K8.A0F("InstantExperiencesJSBridge", "Failed to paymentsCheckoutChargeRequestErrorReturn", e);
            throw e;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.facebook.android.instantexperiences.payment.chargerequest.PaymentsChargeRequestCall, com.facebook.android.instantexperiences.jscall.InstantExperiencesJSBridgeCall] */
    @JavascriptInterface
    public final void paymentsCheckoutChargeRequestSuccessReturn(String str) {
        try {
            SZ1 sz1 = this.A03;
            String str2 = this.A01;
            C14360o3.A0A(str2);
            IGInstantExperiencesParameters iGInstantExperiencesParameters = this.A02;
            String str3 = this.A00;
            if (str3 == null) {
                C14360o3.A0F("hostUrl");
                throw C00O.createAndThrow();
            }
            ?? instantExperiencesJSBridgeCall = new InstantExperiencesJSBridgeCall(iGInstantExperiencesParameters, str2, str3, AbstractC58318PtA.A17(str));
            instantExperiencesJSBridgeCall.A00 = "success";
            sz1.A01(instantExperiencesJSBridgeCall);
        } catch (JSONException e) {
            C0K8.A0F("InstantExperiencesJSBridge", "Failed to paymentsCheckoutChargeRequestSuccessReturn", e);
            throw e;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.facebook.android.instantexperiences.payment.chargerequest.PaymentsChargeRequestCall, com.facebook.android.instantexperiences.jscall.InstantExperiencesJSBridgeCall] */
    @JavascriptInterface
    public final void paymentsCheckoutChargeRequestUnknownReturn(String str) {
        try {
            SZ1 sz1 = this.A03;
            String str2 = this.A01;
            C14360o3.A0A(str2);
            IGInstantExperiencesParameters iGInstantExperiencesParameters = this.A02;
            String str3 = this.A00;
            if (str3 == null) {
                C14360o3.A0F("hostUrl");
                throw C00O.createAndThrow();
            }
            ?? instantExperiencesJSBridgeCall = new InstantExperiencesJSBridgeCall(iGInstantExperiencesParameters, str2, str3, AbstractC58318PtA.A17(str));
            instantExperiencesJSBridgeCall.A00 = "unknown";
            sz1.A01(instantExperiencesJSBridgeCall);
        } catch (JSONException e) {
            C0K8.A0F("InstantExperiencesJSBridge", "Failed to paymentsCheckoutChargeRequestUnknownReturn", e);
            throw e;
        }
    }

    @JavascriptInterface
    public final void requestAutoFill(String str) {
        try {
            SZ1 sz1 = this.A03;
            String str2 = this.A01;
            C14360o3.A0A(str2);
            IGInstantExperiencesParameters iGInstantExperiencesParameters = this.A02;
            String str3 = this.A00;
            if (str3 == null) {
                C14360o3.A0F("hostUrl");
                throw C00O.createAndThrow();
            }
            JSONObject A17 = AbstractC58318PtA.A17(str);
            C14360o3.A0B(str2, 1);
            sz1.A01(new InstantExperiencesJSBridgeCall(iGInstantExperiencesParameters, str2, str3, A17));
        } catch (JSONException e) {
            C0K8.A0F("InstantExperiencesJSBridge", "Failed to requestAutoFill", e);
        }
    }

    @JavascriptInterface
    public final void saveAutofillData(String str) {
        try {
            SZ1 sz1 = this.A03;
            String str2 = this.A01;
            C14360o3.A0A(str2);
            IGInstantExperiencesParameters iGInstantExperiencesParameters = this.A02;
            String str3 = this.A00;
            if (str3 == null) {
                C14360o3.A0F("hostUrl");
                throw C00O.createAndThrow();
            }
            JSONObject A17 = AbstractC58318PtA.A17(str);
            C14360o3.A0B(str2, 1);
            sz1.A01(new InstantExperiencesJSBridgeCall(iGInstantExperiencesParameters, str2, str3, A17));
        } catch (JSONException e) {
            C0K8.A0F("InstantExperiencesJSBridge", "Failed to saveAutofillData", e);
        }
    }

    @JavascriptInterface
    public final void initializeCallbackHandler(String str) {
        try {
            this.A01 = AbstractC58318PtA.A17(str).getString(PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
        } catch (JSONException e) {
            C0K8.A0F("InstantExperiencesJSBridge", "Failed to initializeCallbackHandler", e);
        }
    }
}
