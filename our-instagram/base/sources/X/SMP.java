package X;

import android.webkit.JavascriptInterface;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.secure.securewebview.SecureWebView;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public final class SMP {
    public SecureWebView A00;
    public String A01;
    public String A02;
    public final InterfaceC02550Ad A03;
    public final String A04 = SMP.class.getSimpleName();

    @JavascriptInterface
    public final void log(String str) {
        C14360o3.A0B(str, 0);
        String str2 = this.A04;
        try {
            JSONObject A17 = AbstractC58318PtA.A17(str);
            String string = A17.getString("event");
            String string2 = A17.getString(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
            String string3 = A17.getString("surface");
            C14360o3.A07(string3);
            EnumC39644HiZ valueOf = EnumC39644HiZ.valueOf(string3);
            String string4 = A17.getString("extra_data_json");
            InterfaceC02590Ai A0H = MSY.A0H(this.A03, "commerce_third_party_marketing_tag_fire");
            if (A0H.isSampled()) {
                A0H.AAP("event_type", string);
                A0H.AAP("global_site_tag_id", string2);
                A0H.A8R(valueOf, "surface");
                A0H.AAP("extra_data_json", string4);
                A0H.Cht();
            }
        } catch (JSONException e) {
            C0K8.A0F(str2, "JSONException when parsing message from WebView", e);
        }
    }

    public SMP(C6FG c6fg) {
        this.A03 = AbstractC12220kQ.A02(C6BQ.A0A(c6fg));
    }
}
