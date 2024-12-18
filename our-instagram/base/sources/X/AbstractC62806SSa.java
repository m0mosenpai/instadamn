package X;

import android.content.Context;
import android.view.ViewGroup;
import android.webkit.CookieManager;
import android.webkit.WebChromeClient;
import android.webkit.WebViewClient;
import com.facebook.secure.securewebview.SecureWebView;
import com.instagram.common.session.UserSession;
import java.net.HttpCookie;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.SSa, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC62806SSa {
    public static final void A01(SecureWebView secureWebView, UserSession userSession, List list) {
        List<HttpCookie> list2;
        secureWebView.getSettings().setSaveFormData(false);
        secureWebView.getSettings().setSavePassword(false);
        secureWebView.getSettings().setSupportZoom(false);
        secureWebView.getSettings().setBuiltInZoomControls(false);
        secureWebView.getSettings().setSupportMultipleWindows(true);
        secureWebView.getSettings().setDisplayZoomControls(false);
        secureWebView.getSettings().setUseWideViewPort(false);
        secureWebView.getSettings().setJavaScriptEnabled(true);
        secureWebView.getSettings().setDatabaseEnabled(true);
        secureWebView.getSettings().setDomStorageEnabled(true);
        secureWebView.getSettings().setDatabasePath(AbstractC23881Ey.A00().AXd(null, 239398057).getPath());
        secureWebView.getSettings().setMixedContentMode(0);
        secureWebView.setVerticalScrollBarEnabled(false);
        secureWebView.setHorizontalScrollBarEnabled(false);
        secureWebView.getSettings().setUserAgentString(AbstractC58320PtC.A0x(secureWebView.getSettings()));
        CookieManager.getInstance().setAcceptThirdPartyCookies(secureWebView, true);
        boolean A06 = C18U.A06(C06090Tz.A05, userSession, 36312518263571611L);
        Context context = secureWebView.getContext();
        if (A06) {
            C14360o3.A07(context);
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    String A1B = AbstractC166987dD.A1B(it);
                    if (A1B != null && A1B.length() != 0 && AbstractC43592JPx.A1a("fr=", 1, A1B)) {
                        list2 = HttpCookie.parse(A1B);
                        break;
                    }
                }
            }
        } else {
            C14360o3.A07(context);
        }
        list2 = null;
        C62817SSp.A00(userSession, list2);
    }

    public static final void A00(SecureWebView secureWebView) {
        if (secureWebView != null) {
            try {
                secureWebView.stopLoading();
                secureWebView.resumeTimers();
                secureWebView.setTag(null);
                secureWebView.clearHistory();
                secureWebView.removeAllViews();
                secureWebView.setOnTouchListener(null);
                secureWebView.setWebChromeClient(new WebChromeClient());
                secureWebView.setWebViewClient(new WebViewClient());
                secureWebView.clearView();
                secureWebView.onPause();
                secureWebView.destroy();
                if (secureWebView.getParent() instanceof ViewGroup) {
                    AbstractC124845kp.A01(secureWebView).removeView(secureWebView);
                }
            } catch (Exception unused) {
            }
        }
    }
}
