package X;

import android.net.Uri;
import android.os.Bundle;
import android.util.LruCache;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.facebook.react.views.webview.ReactWebViewManager;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import net.trustly.android.sdk.views.TrustlyView;
import org.json.JSONObject;

/* renamed from: X.Rax, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C60889Rax extends AbstractC59962oe implements InterfaceC60072op {
    public static final String __redex_internal_original_name = "TrustlyAuthenticationFragment";
    public C64486TFw A00;
    public String A01;
    public TrustlyView A03;
    public InterfaceC65450TkM A04;
    public final InterfaceC09390do A05 = AbstractC60492pY.A02(this);
    public final String A06 = "trustly_authentication_fragment";
    public Map A02 = AbstractC06930Yk.A0E();

    /* JADX WARN: Removed duplicated region for block: B:49:0x01e2 A[Catch: Exception -> 0x024a, TryCatch #1 {Exception -> 0x024a, blocks: (B:29:0x00b4, B:31:0x00ba, B:32:0x00c0, B:34:0x00c8, B:35:0x00cf, B:37:0x00d5, B:39:0x00e2, B:41:0x0117, B:42:0x0122, B:44:0x0141, B:46:0x016f, B:47:0x01aa, B:49:0x01e2, B:50:0x01e8, B:51:0x01f4, B:53:0x01fa, B:55:0x0204, B:56:0x0209, B:59:0x0211, B:63:0x0221, B:65:0x0225, B:68:0x022c, B:71:0x0231, B:73:0x0238, B:75:0x023d, B:79:0x00db), top: B:28:0x00b4, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01fa A[Catch: Exception -> 0x024a, TryCatch #1 {Exception -> 0x024a, blocks: (B:29:0x00b4, B:31:0x00ba, B:32:0x00c0, B:34:0x00c8, B:35:0x00cf, B:37:0x00d5, B:39:0x00e2, B:41:0x0117, B:42:0x0122, B:44:0x0141, B:46:0x016f, B:47:0x01aa, B:49:0x01e2, B:50:0x01e8, B:51:0x01f4, B:53:0x01fa, B:55:0x0204, B:56:0x0209, B:59:0x0211, B:63:0x0221, B:65:0x0225, B:68:0x022c, B:71:0x0231, B:73:0x0238, B:75:0x023d, B:79:0x00db), top: B:28:0x00b4, inners: #0, #2 }] */
    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r21, android.os.Bundle r22) {
        /*
            Method dump skipped, instructions count: 602
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60889Rax.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public static final void A00(C60889Rax c60889Rax, String str, Map map, boolean z) {
        LruCache lruCache = AbstractC08820cl.A00;
        Uri.Builder buildUpon = android.net.Uri.parse(str).buildUpon();
        Iterator A15 = AbstractC166997dE.A15(map);
        while (A15.hasNext()) {
            Map.Entry A1K = AbstractC166987dD.A1K(A15);
            buildUpon.appendQueryParameter(AbstractC31172DnG.A17(A1K), AbstractC58318PtA.A0p(A1K));
        }
        String A19 = AbstractC166987dD.A19(buildUpon.build());
        InterfaceC65450TkM interfaceC65450TkM = c60889Rax.A04;
        if (interfaceC65450TkM != null) {
            interfaceC65450TkM.CyI(A19, z);
        }
        AbstractC25227BEk.A1B(c60889Rax);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A06;
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A05);
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        Object obj = this.A02.get("cancelUrl");
        AbstractC25225BEi.A1S(obj);
        A00(this, (String) obj, AbstractC06930Yk.A0E(), true);
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Bundle bundle2;
        int A02 = C0f9.A02(1791188585);
        super.onCreate(bundle);
        Bundle bundle3 = this.mArguments;
        if (bundle3 != null && bundle3.containsKey("redirected_from_deeplink") && (bundle2 = this.mArguments) != null && bundle2.getBoolean("redirected_from_deeplink")) {
            AbstractC25227BEk.A1B(this);
        }
        Bundle bundle4 = this.mArguments;
        if (bundle4 != null && bundle4.containsKey("establishData")) {
            String str = null;
            Bundle bundle5 = this.mArguments;
            if (bundle5 != null) {
                str = bundle5.getString("establishData");
            }
            this.A01 = str;
        } else {
            AbstractC25227BEk.A1B(this);
        }
        String str2 = this.A01;
        if (str2 != null) {
            str2 = URLDecoder.decode(str2, ReactWebViewManager.HTML_ENCODING);
        }
        JSONObject A17 = AbstractC58318PtA.A17(str2);
        HashMap A1G = AbstractC166987dD.A1G();
        Iterator<String> keys = A17.keys();
        C14360o3.A07(keys);
        while (keys.hasNext()) {
            String A1B = AbstractC166987dD.A1B(keys);
            String string = A17.getString(A1B);
            C14360o3.A07(string);
            A1G.put(A1B, string);
        }
        this.A02 = A1G;
        AbstractC12990ll A0M = AbstractC31178DnM.A0M(this.A05);
        C64486TFw c64486TFw = (C64486TFw) A0M.A01(C64486TFw.class, new C50150MDd(A0M, 24));
        this.A00 = c64486TFw;
        if (c64486TFw == null) {
            C14360o3.A0F("callbackManager");
            throw C00O.createAndThrow();
        }
        InterfaceC65450TkM interfaceC65450TkM = c64486TFw.A00;
        if (interfaceC65450TkM == null) {
            interfaceC65450TkM = new C64449TEl(this);
        }
        this.A04 = interfaceC65450TkM;
        C0f9.A09(1837345711, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1496130500);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.trustly_lightbox, viewGroup, false);
        C0f9.A09(2063760536, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(273188879);
        this.A03 = null;
        super.onDestroyView();
        C0f9.A09(-256034844, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(1198088040);
        super.onResume();
        TrustlyView trustlyView = this.A03;
        if (trustlyView != null) {
            trustlyView.A06.loadUrl("javascript:Paywithmybank.proceedToChooseAccount();");
        }
        C0f9.A09(899725450, A02);
    }
}
