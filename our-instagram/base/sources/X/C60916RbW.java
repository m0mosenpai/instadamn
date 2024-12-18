package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.views.webview.ReactWebViewManager;
import com.facebook.secure.securewebview.SecureWebView;

/* renamed from: X.RbW, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C60916RbW extends AbstractC65806TuP {
    @Override // X.InterfaceC50822Vd
    public final /* bridge */ /* synthetic */ Object ALq(Context context) {
        C14360o3.A0B(context, 0);
        return new Q4T(context);
    }

    @Override // X.AbstractC65806TuP
    public final /* bridge */ /* synthetic */ Object A0K(View view, C6FG c6fg, C102884kP c102884kP, Object obj) {
        ViewGroup viewGroup = (ViewGroup) view;
        AbstractC167027dH.A12(viewGroup, c6fg, c102884kP);
        SMP smp = (SMP) AnonymousClass634.A06(c6fg, c102884kP);
        if (smp != null) {
            SecureWebView secureWebView = smp.A00;
            if (secureWebView == null) {
                secureWebView = new SecureWebView(c6fg.A00);
                AbstractC58321PtD.A1C(secureWebView);
                AbstractC58321PtD.A1B(secureWebView);
                secureWebView.getSettings().setJavaScriptEnabled(true);
                secureWebView.addJavascriptInterface(smp, "_MetaCommerceThirdPartyMarketingTag");
                smp.A00 = secureWebView;
            }
            viewGroup.addView(secureWebView);
            String A0E = c102884kP.A0E();
            if (A0E != null) {
                String A0G = c102884kP.A0G();
                if (A0G != null) {
                    SecureWebView secureWebView2 = smp.A00;
                    if (secureWebView2 != null) {
                        if (A0E.equals(smp.A01) && A0G.equals(smp.A02)) {
                            return null;
                        }
                        smp.A02 = A0G;
                        smp.A01 = A0E;
                        secureWebView2.loadDataWithBaseURL(A0E, A0G, ReactWebViewManager.HTML_MIME_TYPE, ReactWebViewManager.HTML_ENCODING, null);
                        return null;
                    }
                    return null;
                }
                throw AbstractC166987dD.A18("source cannot be null");
            }
            throw AbstractC166987dD.A18("baseUrl cannot be null");
        }
        throw AbstractC166987dD.A18(AbstractC43591JPw.A00(523));
    }

    @Override // X.AbstractC65806TuP
    public final /* bridge */ /* synthetic */ void A0M(View view, C6FG c6fg, C102884kP c102884kP, Object obj, Object obj2) {
        ViewGroup viewGroup = (ViewGroup) view;
        C14360o3.A0B(viewGroup, 0);
        viewGroup.removeAllViews();
    }

    @Override // X.AbstractC65806TuP
    public final /* bridge */ /* synthetic */ View A0J(Context context) {
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC65806TuP
    public final boolean A0N(C102884kP c102884kP, C102884kP c102884kP2, Object obj, Object obj2) {
        AbstractC167017dG.A1O(c102884kP, c102884kP2);
        String A0E = c102884kP.A0E();
        if (A0E != null) {
            String A0E2 = c102884kP2.A0E();
            if (A0E2 != null) {
                String A0G = c102884kP.A0G();
                if (A0G != null) {
                    String A0G2 = c102884kP2.A0G();
                    if (A0G2 != null) {
                        if (A0E.equals(A0E2) && A0G.equals(A0G2)) {
                            return false;
                        }
                        return true;
                    }
                    throw AbstractC166987dD.A18("source cannot be null");
                }
                throw AbstractC166987dD.A18("source cannot be null");
            }
            throw AbstractC166987dD.A18("baseUrl cannot be null");
        }
        throw AbstractC166987dD.A18("baseUrl cannot be null");
    }
}
