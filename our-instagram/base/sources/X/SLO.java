package X;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.Locale;

/* loaded from: classes10.dex */
public final class SLO {
    public final QJl A00;
    public final C58719Q4u A01;

    public final void A00(String str) {
        String str2;
        String str3;
        RiN riN;
        String str4;
        String asString;
        QJl qJl = this.A00;
        AbstractC63399SjU abstractC63399SjU = qJl.A01;
        if (abstractC63399SjU != null) {
            String str5 = qJl.A02;
            String str6 = "";
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(abstractC63399SjU.A0C(), "shopify_onsite_sdk_webview_curl_performed");
            if (A0f.isSampled()) {
                RiP riP = RiP.JS_INJECTION;
                try {
                    Gson gson = abstractC63399SjU.A01;
                    JsonObject asJsonObject = ((JsonElement) gson.A08(str, JsonElement.class)).getAsJsonObject();
                    JsonElement jsonElement = asJsonObject.get("url");
                    if (jsonElement == null || (str2 = jsonElement.getAsString()) == null) {
                        str2 = "";
                    }
                    JsonElement jsonElement2 = asJsonObject.get("method");
                    if (jsonElement2 == null || (asString = jsonElement2.getAsString()) == null) {
                        str3 = "";
                    } else {
                        str3 = AbstractC166997dE.A10(Locale.ROOT, asString);
                    }
                    if (str3.length() > 0) {
                        riN = RiN.valueOf(AbstractC166997dE.A10(Locale.ROOT, str3));
                    } else {
                        riN = RiN.CONNECT;
                    }
                    JsonElement jsonElement3 = asJsonObject.get("body");
                    if (jsonElement3 == null || (str4 = ((JsonElement) gson.A05(jsonElement3, JsonElement.class)).getAsString()) == null) {
                        str4 = "";
                    }
                    A0f.A8R(riN, "api_request_method");
                    A0f.AAP("api_endpoint", str2);
                    A0f.AAP("request_body", str4);
                    String str7 = str5;
                    if (str5 == null) {
                        str7 = "";
                    }
                    A0f.AAP("checkout_session_id", str7);
                    A0f.A8R(riP, "request_type");
                    A0f.Cht();
                } catch (Exception e) {
                    A0f.A8R(RiN.CONNECT, "api_request_method");
                    A0f.AAP("api_endpoint", "");
                    A0f.AAP("request_body", "");
                    if (str5 == null) {
                        str5 = "";
                    }
                    A0f.AAP("checkout_session_id", str5);
                    String message = e.getMessage();
                    if (message != null) {
                        str6 = message;
                    }
                    A0f.AAP("error_message", str6);
                    A0f.AAP("error_stacktrace", C2Ql.A00(e));
                    A0f.A8R(riP, "request_type");
                    A0f.Cht();
                }
            }
        }
    }

    public SLO(QJl qJl, C58719Q4u c58719Q4u) {
        this.A00 = qJl;
        this.A01 = c58719Q4u;
    }
}
