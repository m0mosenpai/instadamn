package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.webkit.WebView;
import androidx.fragment.app.FragmentActivity;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.session.UserSession;
import com.instagram.simplewebview.SimpleWebViewConfig;
import java.util.HashMap;

/* renamed from: X.EkD, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33166EkD extends Rb0 implements InterfaceC60072op {
    public static final String __redex_internal_original_name = "IACWebviewFragment";
    public SimpleWebViewConfig A00;
    public InterfaceC60152ox A01;
    public C3I9 A02;
    public String A03;

    @Override // X.Rb0
    public final boolean A03(android.net.Uri uri, WebView webView) {
        AbstractC18680vv abstractC18680vv = super.A03;
        if (abstractC18680vv != null) {
            String obj = uri.toString();
            if (C14360o3.A0K(obj, "https://instagram.com/linking/iac_monetization_status")) {
                Context context = getContext();
                HashMap A1G = AbstractC166987dD.A1G();
                HashMap A1G2 = AbstractC166987dD.A1G();
                HashMap A0h = AbstractC31177DnL.A0h();
                IgBloksScreenConfig A0C = AbstractC31171DnF.A0C(abstractC18680vv);
                A0C.A0P = C05F.A01;
                C66277U6x A02 = C66277U6x.A02(MSV.A00(1040), AbstractC191768eY.A01(A1G), A1G2);
                AbstractC31178DnM.A1M(A02, 719983200);
                A02.A03 = null;
                A02.A02 = null;
                AbstractC31174DnI.A18(context, A0C, A02, A0h);
                return true;
            }
            Integer num = C05F.A01;
            if (C14360o3.A0K(obj, "https://instagram.com/linking/iac_monetization_support_inbox")) {
                C66277U6x A01 = C66277U6x.A01("com.instagram.pro_home.monetization_platform.support.contact_support_screen", AbstractC166987dD.A1G());
                FragmentActivity requireActivity = requireActivity();
                IgBloksScreenConfig A0C2 = AbstractC31171DnF.A0C(abstractC18680vv);
                A0C2.A0P = num;
                A01.A04(requireActivity, A0C2);
                return true;
            }
            if (C14360o3.A0K(obj, "https://instagram.com/linking/iac_professional_dashboard")) {
                HashMap A1G3 = AbstractC166987dD.A1G();
                A1G3.put("origin", "self_profile");
                C62862tP A03 = C62862tP.A03(this, abstractC18680vv, null);
                AbstractC192798gL A022 = C192108fB.A02(null, abstractC18680vv, "com.instagram.pro_home.action", A1G3);
                C32394EOv.A00(A022, A03, abstractC18680vv, 0);
                C1GJ.A03(A022);
                return true;
            }
            return super.A03(uri, webView);
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.Rb0, X.InterfaceC60072op
    public final boolean onBackPressed() {
        WebView webView = super.A02;
        if (webView == null) {
            return super.onBackPressed();
        }
        String url = webView.getUrl();
        String str = this.A03;
        if (str == null) {
            C14360o3.A0F("liveChatUrl");
            throw C00O.createAndThrow();
        }
        if (url != null && url.equals(str)) {
            return false;
        }
        WebView webView2 = super.A02;
        if (webView2 != null) {
            webView2.goBack();
            return true;
        }
        return true;
    }

    @Override // X.Rb0, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        IllegalStateException A14;
        int i;
        SimpleWebViewConfig simpleWebViewConfig;
        int A02 = C0f9.A02(-1073977154);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        String str = null;
        if (bundle2 != null) {
            str = bundle2.getString(MSV.A00(775));
        }
        if (str != null) {
            this.A03 = str;
            Bundle bundle3 = this.mArguments;
            if (bundle3 != null && (simpleWebViewConfig = (SimpleWebViewConfig) bundle3.getParcelable(MSV.A00(2))) != null) {
                this.A00 = simpleWebViewConfig;
                Activity rootActivity = getRootActivity();
                if (rootActivity != null) {
                    AbstractC18680vv abstractC18680vv = super.A03;
                    AbstractC31171DnF.A1Q(abstractC18680vv);
                    int A0G = AbstractC53242c7.A0G(rootActivity, AbstractC57322k7.A01((UserSession) abstractC18680vv));
                    this.A02 = C3I7.A01(this, false, false);
                    this.A01 = new G0N(this, A0G);
                    C0f9.A09(-802411819, A02);
                    return;
                }
                A14 = AbstractC166987dD.A14("Required value was null.");
                i = -364047269;
            } else {
                A14 = AbstractC166987dD.A14("Required value was null.");
                i = -1127538672;
            }
        } else {
            A14 = AbstractC166987dD.A14("Required value was null.");
            i = -646488503;
        }
        C0f9.A09(i, A02);
        throw A14;
    }

    @Override // X.Rb0, androidx.fragment.app.Fragment
    public final void onStart() {
        int A02 = C0f9.A02(129280892);
        super.onStart();
        C3I9 c3i9 = this.A02;
        String str = "keyboardHeightChangeDetector";
        if (c3i9 != null) {
            InterfaceC60152ox interfaceC60152ox = this.A01;
            if (interfaceC60152ox == null) {
                str = "onKeyboardHeightChangeListener";
            } else {
                c3i9.A9e(interfaceC60152ox);
                C3I9 c3i92 = this.A02;
                if (c3i92 != null) {
                    c3i92.Dnr(getRootActivity());
                    C0f9.A09(1990900736, A02);
                    return;
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.Rb0, androidx.fragment.app.Fragment
    public final void onStop() {
        int A02 = C0f9.A02(-982738957);
        super.onStop();
        C3I9 c3i9 = this.A02;
        String str = "keyboardHeightChangeDetector";
        if (c3i9 != null) {
            InterfaceC60152ox interfaceC60152ox = this.A01;
            if (interfaceC60152ox == null) {
                str = "onKeyboardHeightChangeListener";
            } else {
                c3i9.EFx(interfaceC60152ox);
                C3I9 c3i92 = this.A02;
                if (c3i92 != null) {
                    c3i92.onStop();
                    C0f9.A09(-406493147, A02);
                    return;
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }
}
