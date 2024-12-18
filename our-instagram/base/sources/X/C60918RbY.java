package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.react.views.webview.ReactWebViewManager;
import com.facebook.secure.securewebview.SecureWebView;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.RbY, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C60918RbY extends AbstractC65806TuP {
    public final InterfaceC02550Ad A00;

    @Override // X.AbstractC65806TuP
    public final /* bridge */ /* synthetic */ Object A0K(View view, C6FG c6fg, C102884kP c102884kP, Object obj) {
        WebView webView = (WebView) view;
        AbstractC167017dG.A1O(webView, c102884kP);
        String A0E = c102884kP.A0E();
        if (A0E != null) {
            String A0G = c102884kP.A0G();
            if (A0G != null) {
                webView.loadDataWithBaseURL(A0E, A0G, ReactWebViewManager.HTML_MIME_TYPE, ReactWebViewManager.HTML_ENCODING, null);
                return null;
            }
            throw AbstractC166987dD.A18("source cannot be null");
        }
        throw AbstractC166987dD.A18("baseUrl cannot be null");
    }

    @Override // X.InterfaceC50822Vd
    public final /* bridge */ /* synthetic */ Object ALq(Context context) {
        C14360o3.A0B(context, 0);
        SecureWebView secureWebView = new SecureWebView(context);
        AbstractC58321PtD.A1C(secureWebView);
        AbstractC58321PtD.A1B(secureWebView);
        secureWebView.getSettings().setJavaScriptEnabled(true);
        secureWebView.addJavascriptInterface(this, "_MetaCommerceThirdPartyMarketingTag");
        return secureWebView;
    }

    @JavascriptInterface
    public final void log(String str) {
        C14360o3.A0B(str, 0);
        try {
            JSONObject A17 = AbstractC58318PtA.A17(str);
            String string = A17.getString("event");
            String string2 = A17.getString(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
            String string3 = A17.getString("surface");
            C14360o3.A07(string3);
            EnumC39644HiZ valueOf = EnumC39644HiZ.valueOf(string3);
            String string4 = A17.getString("extra_data_json");
            InterfaceC02590Ai A0H = MSY.A0H(this.A00, "commerce_third_party_marketing_tag_fire");
            if (A0H.isSampled()) {
                A0H.AAP("event_type", string);
                A0H.AAP("global_site_tag_id", string2);
                A0H.A8R(valueOf, "surface");
                A0H.AAP("extra_data_json", string4);
                A0H.Cht();
            }
        } catch (JSONException e) {
            C0K8.A0F("BkBloksComponentsCommerceMarketingTagRenderUnit", "JSONException when parsing message from WebView", e);
        }
    }

    @Override // X.AbstractC65806TuP
    public final /* bridge */ /* synthetic */ void A0M(View view, C6FG c6fg, C102884kP c102884kP, Object obj, Object obj2) {
        ViewGroup viewGroup = (ViewGroup) view;
        C14360o3.A0B(viewGroup, 0);
        viewGroup.removeAllViews();
    }

    public C60918RbY(C6FG c6fg, C102884kP c102884kP) {
        super(c6fg, c102884kP);
        this.A00 = AbstractC12220kQ.A02(C6BQ.A0A(c6fg));
    }

    @Override // X.AbstractC65806TuP
    public final /* bridge */ /* synthetic */ View A0J(Context context) {
        throw C00O.createAndThrow();
    }
}
