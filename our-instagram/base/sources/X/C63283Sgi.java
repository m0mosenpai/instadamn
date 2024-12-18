package X;

import android.content.Context;
import android.webkit.CookieManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ProgressBar;
import com.facebook.react.views.webview.ReactWebViewManager;
import com.instagram.business.instantexperiences.IGInstantExperiencesParameters;
import com.instagram.business.instantexperiences.ui.InstantExperiencesBrowserChrome;
import com.instagram.business.instantexperiences.ui.InstantExperiencesWebViewContainerLayout;
import com.instagram.common.session.UserSession;
import java.util.List;
import java.util.Stack;
import java.util.concurrent.Executors;

/* renamed from: X.Sgi, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63283Sgi {
    public final Context A00;
    public final Rs9 A01;
    public final C62898SWe A02;
    public final SHH A03;
    public final C62698SMm A04;
    public final C61693RsA A05;
    public final IGInstantExperiencesParameters A06;
    public final C62561SGm A07;
    public final C60892Rb6 A08;
    public final Q4g A09;
    public final UserSession A0A;
    public final List A0B;
    public final List A0C;
    public final Stack A0D;
    public final InterfaceC65335TiG A0E;
    public final InterfaceC65337TiI A0F;
    public final InstantExperiencesWebViewContainerLayout A0G;

    public static final R7U A00(C63283Sgi c63283Sgi) {
        R7U r7u;
        R7U r7u2 = new R7U(c63283Sgi.A00, c63283Sgi.A05);
        C58717Q4q c58717Q4q = new C58717Q4q(r7u2, Executors.newSingleThreadExecutor());
        c58717Q4q.A00 = c63283Sgi.A04;
        r7u2.setWebViewClient(c58717Q4q);
        r7u2.addJavascriptInterface(new SQD(c58717Q4q, c63283Sgi.A06, new SZ1(c63283Sgi.A02, c63283Sgi.A03, r7u2, c63283Sgi.A08, c63283Sgi.A0A)), "_FBExtensions");
        String A0g = AnonymousClass001.A0g(C1FO.A00(), " ", AbstractC13670mt.A06("%s %s %s", "FBExtensions/0.1", "IGInstantExperience/0.1", "(autofill-enabled)"));
        C14360o3.A07(A0g);
        CookieManager.getInstance().setAcceptThirdPartyCookies(r7u2, true);
        WebSettings settings = r7u2.getSettings();
        settings.setSaveFormData(false);
        settings.setSavePassword(false);
        settings.setSupportZoom(true);
        settings.setBuiltInZoomControls(true);
        settings.setDisplayZoomControls(false);
        settings.setLoadWithOverviewMode(true);
        settings.setUseWideViewPort(true);
        settings.setJavaScriptEnabled(true);
        settings.setDatabaseEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setSupportMultipleWindows(true);
        settings.setUserAgentString(AnonymousClass001.A0g(settings.getUserAgentString(), " ", A0g));
        r7u2.setWebChromeClient(c63283Sgi.A09);
        c58717Q4q.A04.add(new C63907Svi(c63283Sgi));
        C62561SGm c62561SGm = c63283Sgi.A07;
        if (c62561SGm.A00 == -1) {
            c62561SGm.A00 = System.currentTimeMillis();
        }
        c58717Q4q.A06.add(new C62410SAk(SUG.A00));
        Stack stack = c63283Sgi.A0D;
        if (!stack.empty() && (r7u = (R7U) stack.peek()) != null) {
            C58717Q4q c58717Q4q2 = r7u.A00;
            C14360o3.A07(c58717Q4q2);
            c58717Q4q2.A05.remove(c63283Sgi.A0F);
        }
        C58717Q4q c58717Q4q3 = r7u2.A00;
        C14360o3.A07(c58717Q4q3);
        c58717Q4q3.A05.add(c63283Sgi.A0F);
        c58717Q4q3.A03.add(c63283Sgi.A0E);
        stack.push(r7u2);
        c63283Sgi.A0G.setWebView(r7u2);
        return r7u2;
    }

    public static String A01(InstantExperiencesBrowserChrome instantExperiencesBrowserChrome) {
        return ((WebView) instantExperiencesBrowserChrome.A08.A0D.peek()).getUrl();
    }

    public static final void A02(C63283Sgi c63283Sgi) {
        Stack stack = c63283Sgi.A0D;
        if (stack.size() > 1) {
            WebView webView = (WebView) stack.pop();
            webView.setVisibility(8);
            InstantExperiencesWebViewContainerLayout instantExperiencesWebViewContainerLayout = c63283Sgi.A0G;
            instantExperiencesWebViewContainerLayout.removeView(webView);
            webView.loadUrl(ReactWebViewManager.BLANK_URL);
            webView.setTag(null);
            webView.clearHistory();
            webView.removeAllViews();
            webView.onPause();
            webView.destroy();
            R7U r7u = (R7U) stack.peek();
            if (r7u != null) {
                r7u.setVisibility(0);
                r7u.onResume();
                instantExperiencesWebViewContainerLayout.setWebView(r7u);
                C62698SMm c62698SMm = c63283Sgi.A04;
                c62698SMm.A01.execute(new TN9(r7u, c62698SMm));
            }
        }
    }

    public C63283Sgi(Context context, ProgressBar progressBar, Rs9 rs9, C62898SWe c62898SWe, SHH shh, C61693RsA c61693RsA, IGInstantExperiencesParameters iGInstantExperiencesParameters, C60892Rb6 c60892Rb6, InstantExperiencesWebViewContainerLayout instantExperiencesWebViewContainerLayout, UserSession userSession) {
        AbstractC167017dG.A1R(userSession, instantExperiencesWebViewContainerLayout);
        C14360o3.A0B(iGInstantExperiencesParameters, 7);
        C14360o3.A0B(progressBar, 10);
        this.A0A = userSession;
        this.A0C = AbstractC58322PtE.A0z();
        this.A0B = AbstractC58322PtE.A0z();
        this.A0F = new C63909Svk(this);
        this.A0E = new C63905Svg(this);
        this.A0D = new Stack();
        this.A01 = rs9;
        this.A0G = instantExperiencesWebViewContainerLayout;
        this.A09 = new Q4g(context, progressBar, this);
        this.A00 = context;
        this.A05 = c61693RsA;
        this.A08 = c60892Rb6;
        this.A06 = iGInstantExperiencesParameters;
        this.A02 = c62898SWe;
        this.A03 = shh;
        this.A04 = new C62698SMm(Executors.newSingleThreadExecutor(), ExecutorC64800TUo.A00);
        this.A07 = new C62561SGm(iGInstantExperiencesParameters, userSession);
        A00(this);
    }
}
