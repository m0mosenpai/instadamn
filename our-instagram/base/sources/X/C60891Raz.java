package X;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.facebook.common.dextricks.DexStore;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.business.boost.webview.BoostWebViewAdPreviewFragment$Config;
import kotlin.Deprecated;
import org.apache.http.util.EncodingUtils;

/* renamed from: X.Raz, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C60891Raz extends AbstractC59962oe implements InterfaceC60072op, InterfaceC60122ou {
    public static final java.util.Set A0A = AbstractC31171DnF.A0k(AbstractC16960so.A1Q("geo", "maps", "mailto", "sms", "tel"));
    public static final String __redex_internal_original_name = "BoostWebViewAdPreviewFragment";
    public View A00;
    public ValueCallback A01;
    public WebView A02;
    public BoostWebViewAdPreviewFragment$Config A03;
    public int A04;
    public Handler A05;
    public GestureDetector.OnGestureListener A06;
    public SLK A07;
    public final InterfaceC08100bW A08 = AbstractC31175DnJ.A0B();
    public final InterfaceC09390do A09;

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        BoostWebViewAdPreviewFragment$Config boostWebViewAdPreviewFragment$Config = this.A03;
        if (boostWebViewAdPreviewFragment$Config != null) {
            if (boostWebViewAdPreviewFragment$Config.A07) {
                interfaceC56362iU.EkF(false);
                return;
            }
            String str = boostWebViewAdPreviewFragment$Config.A02;
            if (str != null) {
                if (boostWebViewAdPreviewFragment$Config.A0A) {
                    interfaceC56362iU.Ehk(str);
                } else {
                    interfaceC56362iU.setTitle(str);
                }
            }
            BoostWebViewAdPreviewFragment$Config boostWebViewAdPreviewFragment$Config2 = this.A03;
            if (boostWebViewAdPreviewFragment$Config2 != null) {
                interfaceC56362iU.EkH(ViewOnClickListenerC63508Sob.A00(this, 64), boostWebViewAdPreviewFragment$Config2.A0C);
                BoostWebViewAdPreviewFragment$Config boostWebViewAdPreviewFragment$Config3 = this.A03;
                if (boostWebViewAdPreviewFragment$Config3 != null) {
                    interfaceC56362iU.EkS(boostWebViewAdPreviewFragment$Config3.A0B);
                    return;
                }
            }
        }
        C14360o3.A0F(DexStore.CONFIG_FILENAME);
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "boost_webview_ad_preview_fragment";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        FragmentActivity requireActivity = requireActivity();
        C14360o3.A0C(requireActivity, AbstractC43591JPw.A00(6));
        ((BaseFragmentActivity) requireActivity).A0a();
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A09);
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        WebView webView = this.A02;
        if (webView != null) {
            boolean equals = "file:///android_asset/webview_error.html".equals(webView.getUrl());
            BoostWebViewAdPreviewFragment$Config boostWebViewAdPreviewFragment$Config = this.A03;
            if (boostWebViewAdPreviewFragment$Config == null) {
                C14360o3.A0F(DexStore.CONFIG_FILENAME);
                throw C00O.createAndThrow();
            }
            if (boostWebViewAdPreviewFragment$Config.A05 && !equals && webView.canGoBack()) {
                webView.goBack();
                return true;
            }
            return false;
        }
        return false;
    }

    public C60891Raz() {
        SLK slk;
        FragmentActivity activity = getActivity();
        if (activity != null) {
            slk = new SLK(activity, new TLX(activity));
        } else {
            slk = null;
        }
        this.A07 = slk;
        this.A06 = new UMB(this, 1);
        this.A09 = AbstractC60492pY.A02(this);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    @Deprecated(message = "Deprecated in Java")
    public final void onActivityResult(int i, int i2, Intent intent) {
        android.net.Uri[] uriArr;
        super.onActivityResult(i, i2, intent);
        if (i == 101) {
            if (i2 == -1 && intent != null && intent.getData() != null) {
                try {
                    android.net.Uri data = intent.getData();
                    if (data != null) {
                        C54846OMr c54846OMr = new C54846OMr();
                        c54846OMr.A01(requireActivity(), data);
                        android.net.Uri fromFile = android.net.Uri.fromFile(c54846OMr.A00());
                        ValueCallback valueCallback = this.A01;
                        if (valueCallback != null) {
                            if (fromFile == null) {
                                uriArr = null;
                            } else {
                                uriArr = new android.net.Uri[]{fromFile};
                            }
                            valueCallback.onReceiveValue(uriArr);
                            this.A01 = null;
                            return;
                        }
                        return;
                    }
                    return;
                } catch (SecurityException unused) {
                    StringBuilder A1C = AbstractC166987dD.A1C();
                    A1C.append("failed to open file from uri = ");
                    C0w9.A03(__redex_internal_original_name, AbstractC166997dE.A0v(intent.getData(), A1C));
                    return;
                }
            }
            ValueCallback valueCallback2 = this.A01;
            if (valueCallback2 != null) {
                valueCallback2.onReceiveValue(null);
                this.A01 = null;
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-2015385986);
        super.onCreate(bundle);
        this.A03 = (BoostWebViewAdPreviewFragment$Config) AbstractC153636vY.A00(requireArguments(), BoostWebViewAdPreviewFragment$Config.class, "simple_web_view_config");
        C0f9.A09(519024963, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        IllegalStateException A14;
        int i;
        int A02 = C0f9.A02(-1915800286);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.boost_webview_layout, viewGroup, false);
        C14360o3.A0C(inflate, AbstractC111324zv.A00(1));
        ViewOnClickListenerC63508Sob.A01(AbstractC166997dE.A0S(inflate, R.id.boost_webview_back_button), 65, this);
        this.A00 = inflate.requireViewById(R.id.loading_indicator);
        this.A02 = (WebView) inflate.requireViewById(R.id.boost_webview_container);
        Context requireContext = requireContext();
        AbstractC12990ll A0o = AbstractC166987dD.A0o(this.A09);
        if (A0o != null) {
            C62817SSp.A00(A0o, null);
        }
        WebView webView = this.A02;
        if (webView != null) {
            webView.setScrollBarStyle(0);
            webView.setDownloadListener(new C63522Sop(webView, this));
            webView.setWebChromeClient(new C58713Q4i(this, 3));
            WebSettings settings = webView.getSettings();
            C14360o3.A07(settings);
            settings.setJavaScriptEnabled(true);
            BoostWebViewAdPreviewFragment$Config boostWebViewAdPreviewFragment$Config = this.A03;
            if (boostWebViewAdPreviewFragment$Config != null) {
                if (boostWebViewAdPreviewFragment$Config.A04 || C1QD.A01(boostWebViewAdPreviewFragment$Config.A03)) {
                    settings.setUserAgentString(AbstractC58320PtC.A0x(settings));
                }
                webView.setWebViewClient(new Q4r(0, this, webView));
                SLK slk = this.A07;
                if (slk != null) {
                    webView.addJavascriptInterface(slk, "js_interface");
                }
                GestureDetector.OnGestureListener onGestureListener = this.A06;
                Handler handler = new Handler();
                this.A05 = handler;
                ViewOnTouchListenerC63511Soe.A00(webView, 8, new GestureDetector(requireContext, onGestureListener, handler));
                BoostWebViewAdPreviewFragment$Config boostWebViewAdPreviewFragment$Config2 = this.A03;
                if (boostWebViewAdPreviewFragment$Config2 != null) {
                    String str = boostWebViewAdPreviewFragment$Config2.A03;
                    if (str != null) {
                        String str2 = boostWebViewAdPreviewFragment$Config2.A01;
                        if (str2 != null && str2.length() != 0) {
                            byte[] bytes = EncodingUtils.getBytes(str2, "BASE64");
                            if (bytes != null) {
                                webView.postUrl(str, bytes);
                            } else {
                                A14 = AbstractC166987dD.A14("Required value was null.");
                                i = 167805542;
                            }
                        } else {
                            webView.loadUrl(str);
                        }
                    }
                    C0f9.A09(548298778, A02);
                    return inflate;
                }
            }
            C14360o3.A0F(DexStore.CONFIG_FILENAME);
            throw C00O.createAndThrow();
        }
        A14 = AbstractC166987dD.A14("Required value was null.");
        i = -335784419;
        C0f9.A09(i, A02);
        throw A14;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(2029127600);
        this.A00 = null;
        WebView webView = this.A02;
        if (webView != null) {
            webView.destroy();
        }
        this.A02 = null;
        super.onDestroyView();
        C0f9.A09(-1944355319, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        int A02 = C0f9.A02(-136584630);
        super.onStart();
        if (getRootActivity() instanceof InterfaceC53712dA) {
            ComponentCallbacks2 rootActivity = getRootActivity();
            String A00 = AbstractC111324zv.A00(36);
            C14360o3.A0C(rootActivity, A00);
            this.A04 = ((InterfaceC53712dA) rootActivity).C4u();
            BoostWebViewAdPreviewFragment$Config boostWebViewAdPreviewFragment$Config = this.A03;
            if (boostWebViewAdPreviewFragment$Config == null) {
                C14360o3.A0F(DexStore.CONFIG_FILENAME);
                throw C00O.createAndThrow();
            }
            if (boostWebViewAdPreviewFragment$Config.A06 && (getRootActivity() instanceof InterfaceC53712dA)) {
                ComponentCallbacks2 rootActivity2 = getRootActivity();
                C14360o3.A0C(rootActivity2, A00);
                ((InterfaceC53712dA) rootActivity2).EfL(8);
            }
        }
        C0f9.A09(-602917374, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        int A02 = C0f9.A02(932865812);
        super.onStop();
        if (getRootActivity() instanceof InterfaceC53712dA) {
            ComponentCallbacks2 rootActivity = getRootActivity();
            C14360o3.A0C(rootActivity, AbstractC111324zv.A00(36));
            ((InterfaceC53712dA) rootActivity).EfL(this.A04);
        }
        C0f9.A09(487013335, A02);
    }
}
