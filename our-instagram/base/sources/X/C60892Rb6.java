package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.facebook.R;
import com.facebook.common.callercontext.CallerContext;
import com.instagram.business.instantexperiences.IGInstantExperiencesParameters;
import com.instagram.business.instantexperiences.ui.InstantExperiencesBrowserChrome;
import com.instagram.business.instantexperiences.ui.InstantExperiencesWebViewContainerLayout;
import com.instagram.common.api.base.CacheBehaviorLogger;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.Stack;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;

/* renamed from: X.Rb6, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C60892Rb6 extends C53Z implements InterfaceC60072op {
    public static final String __redex_internal_original_name = "InstantExperiencesBrowserFragment";
    public C64454TEq A00;
    public C64455TEr A01;
    public boolean A02 = false;
    public IGInstantExperiencesParameters A03;
    public SCI A04;
    public InstantExperiencesBrowserChrome A05;
    public C63283Sgi A06;

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "instant_experiences_browser";
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        C63283Sgi c63283Sgi = this.A06;
        Stack stack = c63283Sgi.A0D;
        WebView webView = (WebView) stack.peek();
        if (webView != null) {
            if (webView.canGoBack()) {
                webView.goBack();
                return true;
            }
            if (stack.size() > 1) {
                C63283Sgi.A02(c63283Sgi);
                return true;
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, com.google.common.util.concurrent.SettableFuture] */
    /* JADX WARN: Type inference failed for: r11v0, types: [X.RsA, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [X.Swx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object, X.Rs9] */
    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String message;
        int A02 = C0f9.A02(733139151);
        View inflate = layoutInflater.inflate(R.layout.instant_experiences_browser_fragment, viewGroup, false);
        SPX spx = new SPX(getSession());
        SYP syp = new SYP(requireContext(), AnonymousClass780.A00(requireContext()).A00);
        CallerContext callerContext = C63971Swx.A06;
        UserSession session = getSession();
        Bundle requireArguments = requireArguments();
        ?? obj = new Object();
        obj.A05 = false;
        obj.A04 = AbstractC166987dD.A1E();
        obj.A03 = AbstractC166987dD.A1G();
        obj.A02 = session;
        obj.A00 = requireArguments;
        obj.A01 = syp;
        C62898SWe c62898SWe = new C62898SWe(obj, spx, Executors.newSingleThreadExecutor(), Executors.newSingleThreadExecutor());
        c62898SWe.A03.execute(new TN4(c62898SWe, new C63900SvY(c62898SWe, new Object())));
        SHH shh = new SHH(c62898SWe, syp, spx, Executors.newSingleThreadExecutor());
        ExecutorC64804TUs executorC64804TUs = new ExecutorC64804TUs(this, 4);
        String string = requireArguments().getString("website_url");
        try {
            IGInstantExperiencesParameters iGInstantExperiencesParameters = new IGInstantExperiencesParameters(AnonymousClass001.A11("{\"whitelisted_domains\": \"https://fbplugins.herokuapp.com\", \"feature_list\": {\"is_autofill_enabled\": true, \"is_autofill_save_enabled\": true, \"is_payment_enabled\": true}, \"page_name\": \"IX Test\",\"business_id\": \"", requireArguments().getString("business_id"), "\",\"website_uri\": \"", string, "\"}"), Long.valueOf(new Random().nextLong()));
            this.A03 = iGInstantExperiencesParameters;
            String string2 = requireArguments().getString(CacheBehaviorLogger.SOURCE);
            C18C.A07(string2, "Source cannot be null");
            iGInstantExperiencesParameters.A01 = string2;
            this.A03.A02 = requireArguments().getString("surface");
            this.A03.A00 = requireArguments().getString("app_id");
            this.A05 = (InstantExperiencesBrowserChrome) inflate.requireViewById(R.id.instant_experiences_browser_chrome);
            View findViewById = inflate.findViewById(R.id.instant_experiences_browser_progress_bar);
            this.A00 = new C64454TEq();
            this.A01 = new C64455TEr(shh, getSession(), executorC64804TUs);
            this.A04 = new SCI(executorC64804TUs);
            Context requireContext = requireContext();
            UserSession session2 = getSession();
            InstantExperiencesWebViewContainerLayout instantExperiencesWebViewContainerLayout = (InstantExperiencesWebViewContainerLayout) inflate.requireViewById(R.id.instant_experiences_webview_container);
            ?? obj2 = new Object();
            ?? obj3 = new Object();
            IGInstantExperiencesParameters iGInstantExperiencesParameters2 = this.A03;
            findViewById.getClass();
            C63283Sgi c63283Sgi = new C63283Sgi(requireContext, (ProgressBar) findViewById, obj3, c62898SWe, shh, obj2, iGInstantExperiencesParameters2, this, instantExperiencesWebViewContainerLayout, session2);
            this.A06 = c63283Sgi;
            InstantExperiencesBrowserChrome instantExperiencesBrowserChrome = this.A05;
            UserSession session3 = getSession();
            instantExperiencesBrowserChrome.A08 = c63283Sgi;
            instantExperiencesBrowserChrome.A09 = session3;
            instantExperiencesBrowserChrome.A0A = new ExecutorC64804TUs(instantExperiencesBrowserChrome, 3);
            instantExperiencesBrowserChrome.A06 = AbstractC166997dE.A0T(instantExperiencesBrowserChrome, R.id.instant_experiences_chrome_title);
            instantExperiencesBrowserChrome.A05 = AbstractC166997dE.A0T(instantExperiencesBrowserChrome, R.id.instant_experiences_chrome_subtitle);
            instantExperiencesBrowserChrome.A04 = AbstractC166997dE.A0T(instantExperiencesBrowserChrome, R.id.instant_experiences_chrome_loading);
            instantExperiencesBrowserChrome.A03 = AbstractC31173DnH.A0I(instantExperiencesBrowserChrome, R.id.instant_experiences_overflow_menu);
            instantExperiencesBrowserChrome.A06.setVisibility(8);
            instantExperiencesBrowserChrome.A05.setVisibility(8);
            instantExperiencesBrowserChrome.A04.setVisibility(0);
            C63283Sgi c63283Sgi2 = instantExperiencesBrowserChrome.A08;
            c63283Sgi2.A0B.add(new C63904Svf(instantExperiencesBrowserChrome));
            ImageView A0I = AbstractC31173DnH.A0I(instantExperiencesBrowserChrome, R.id.instant_experiences_back_button);
            instantExperiencesBrowserChrome.A02 = A0I;
            A0I.setColorFilter(-7829368);
            instantExperiencesBrowserChrome.A03.setColorFilter(-7829368);
            FrameLayout frameLayout = (FrameLayout) instantExperiencesBrowserChrome.requireViewById(R.id.instant_experiences_back_button_container);
            instantExperiencesBrowserChrome.A01 = frameLayout;
            frameLayout.setOnClickListener(ViewOnClickListenerC63508Sob.A00(instantExperiencesBrowserChrome, 66));
            instantExperiencesBrowserChrome.A03.setOnClickListener(new ViewOnClickListenerC35690FpP(instantExperiencesBrowserChrome, 51));
            this.A05.A07 = new C64456TEs(this);
            ArrayList A1E = AbstractC166987dD.A1E();
            A1E.add(this.A00);
            A1E.add(this.A01);
            SCI sci = this.A04;
            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            SLy sLy = new SLy(sci, A1E, atomicBoolean);
            Iterator it = A1E.iterator();
            while (it.hasNext()) {
                ((InterfaceC65452TkO) it.next()).C07().A00.add(sLy);
            }
            inflate.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC66229U4z(2, inflate, sLy, atomicBoolean));
            sLy.A00();
            WebView webView = (WebView) this.A06.A0D.peek();
            webView.getClass();
            string.getClass();
            webView.loadUrl(string);
            this.A02 = false;
            C0f9.A09(1710480561, A02);
            return inflate;
        } catch (JSONException e) {
            if (e.getMessage() == null) {
                message = "No error details";
            } else {
                message = e.getMessage();
            }
            C0K8.A05(C60892Rb6.class, message, e);
            IllegalStateException A14 = AbstractC166987dD.A14("mIXParams cannot be null");
            C0f9.A09(997043351, A02);
            throw A14;
        }
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(-584013345);
        super.onDestroy();
        C0f9.A09(-1063733712, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(-384031703);
        super.onPause();
        C0f9.A09(-1588754703, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(1154434063);
        super.onResume();
        C0f9.A09(1216117113, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        int A02 = C0f9.A02(-646118361);
        super.onStop();
        C0f9.A09(-949994176, A02);
    }
}
