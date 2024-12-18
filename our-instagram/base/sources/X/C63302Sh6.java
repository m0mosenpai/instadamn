package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.Sh6, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public class C63302Sh6 {
    public final long A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final Map A06 = AbstractC166987dD.A1G();

    public C63302Sh6(String str, String str2) {
        str2.getClass();
        this.A00 = System.currentTimeMillis();
        this.A05 = str;
        this.A04 = str2;
        this.A03 = "Unknown";
        this.A02 = "Unknown";
        this.A01 = "Unknown";
    }

    public static void A00(C63302Sh6 c63302Sh6, JSONObject jSONObject) {
        jSONObject.put(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, c63302Sh6.A05);
        jSONObject.put("time", AbstractC62801SRv.A00(c63302Sh6.A00));
    }

    public static void A01(C63302Sh6 c63302Sh6, JSONObject jSONObject, boolean z) {
        jSONObject.put("is_emp", z);
        jSONObject.put("d_model", c63302Sh6.A02);
        jSONObject.put("d_manuf", c63302Sh6.A01);
        jSONObject.put("locale", c63302Sh6.A03);
        JSONObject A00 = S1E.A00(c63302Sh6.A06);
        if (A00 != null) {
            jSONObject.put("extra_info", A00);
        }
    }

    public final JSONObject A02() {
        JSONObject A0q;
        String str;
        if (this instanceof C60543R6g) {
            C60543R6g c60543R6g = (C60543R6g) this;
            A0q = AbstractC31171DnF.A0q();
            try {
                A00(c60543R6g, A0q);
                JSONObject A0q2 = AbstractC31171DnF.A0q();
                A0q2.put("event", c60543R6g.A07);
                A0q2.put("exc", c60543R6g.A06);
                A0q2.put("actn", c60543R6g.A05);
                A0q2.put("ctnr", ((C63302Sh6) c60543R6g).A04);
                A0q2.put("scn_on", c60543R6g.A09);
                A0q2.put("s_boot", c60543R6g.A00);
                A0q2.put("s_mqtt", c60543R6g.A01);
                A0q2.put("s_net", c60543R6g.A02);
                A0q2.put("s_scn", c60543R6g.A03);
                A0q2.put("s_svc", c60543R6g.A04);
                A01(c60543R6g, A0q2, c60543R6g.A08);
                A0q.put("extra", A0q2);
                return A0q;
            } catch (JSONException e) {
                e = e;
                str = "FbnsServiceLifecycleEvent";
            }
        } else if (this instanceof C60544R6h) {
            C60544R6h c60544R6h = (C60544R6h) this;
            A0q = AbstractC31171DnF.A0q();
            try {
                A00(c60544R6h, A0q);
                JSONObject A0q3 = AbstractC31171DnF.A0q();
                A0q3.put("event", c60544R6h.A08);
                A0q3.put("apn", c60544R6h.A07);
                A0q3.put(PublicKeyCredentialControllerUtility.JSON_KEY_APPID, c60544R6h.A06);
                A0q3.put("exc", c60544R6h.A05);
                A0q3.put("ctnr", ((C63302Sh6) c60544R6h).A04);
                A0q3.put("scn_on", c60544R6h.A0A);
                A0q3.put("s_boot", c60544R6h.A00);
                A0q3.put("s_mqtt", c60544R6h.A01);
                A0q3.put("s_net", c60544R6h.A02);
                A0q3.put("s_scn", c60544R6h.A03);
                A0q3.put("s_svc", c60544R6h.A04);
                A01(c60544R6h, A0q3, c60544R6h.A09);
                A0q.put("extra", A0q3);
                return A0q;
            } catch (JSONException e2) {
                e = e2;
                str = "FbnsRegistrationLifecycleEvent";
            }
        } else if (this instanceof C60545R6i) {
            C60545R6i c60545R6i = (C60545R6i) this;
            A0q = AbstractC31171DnF.A0q();
            try {
                A00(c60545R6i, A0q);
                JSONObject A0q4 = AbstractC31171DnF.A0q();
                A0q4.put("event", c60545R6i.A08);
                A0q4.put("pnid", c60545R6i.A09);
                A0q4.put("dpn", c60545R6i.A07);
                A0q4.put("ctnr", ((C63302Sh6) c60545R6i).A04);
                A0q4.put("exc", c60545R6i.A06);
                A0q4.put("d_delay_ms", c60545R6i.A00);
                A0q4.put("scn_on", c60545R6i.A0B);
                A0q4.put("s_boot", c60545R6i.A01);
                A0q4.put("s_mqtt", c60545R6i.A02);
                A0q4.put("s_net", c60545R6i.A03);
                A0q4.put("s_scn", c60545R6i.A04);
                A0q4.put("s_svc", c60545R6i.A05);
                A01(c60545R6i, A0q4, c60545R6i.A0A);
                A0q.put("extra", A0q4);
                return A0q;
            } catch (JSONException e3) {
                e = e3;
                str = "FbnsNotifLifecycleEvent";
            }
        } else {
            A0q = AbstractC31171DnF.A0q();
            try {
                A00(this, A0q);
                A0q.put("locale", this.A03);
                A0q.put("d_model", this.A02);
                A0q.put("d_manuf", this.A01);
                A0q.put("net_type", "Unknown");
                A0q.putOpt("module", this.A04);
                Map map = this.A06;
                if (!map.isEmpty()) {
                    JSONObject A0q5 = AbstractC31171DnF.A0q();
                    Iterator A15 = AbstractC166997dE.A15(map);
                    while (A15.hasNext()) {
                        AbstractC50523MSb.A1T(A15, A0q5);
                    }
                    A0q.put("extra", A0q5);
                    return A0q;
                }
            } catch (JSONException e4) {
                e = e4;
                str = "AnalyticsEvent";
            }
            return A0q;
        }
        C0K8.A0I(str, "Failed to serialize", e);
        return A0q;
    }

    public final void A03(Map map) {
        String obj;
        Iterator A15 = AbstractC166997dE.A15(map);
        while (A15.hasNext()) {
            Map.Entry A1K = AbstractC166987dD.A1K(A15);
            String obj2 = A1K.getKey().toString();
            if (A1K.getValue() == null) {
                obj = "";
            } else {
                obj = A1K.getValue().toString();
            }
            this.A06.put(obj2, obj);
        }
    }

    public final String toString() {
        return A02().toString();
    }

    public C63302Sh6(String str, String str2, String str3, String str4, String str5) {
        str2.getClass();
        this.A00 = System.currentTimeMillis();
        this.A05 = str;
        this.A04 = str2;
        this.A03 = str3;
        this.A02 = str4;
        this.A01 = str5;
    }
}
