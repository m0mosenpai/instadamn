package X;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.facebook.CustomTabMainActivity;
import com.facebook.browser.lite.pixelrequestbuffer.igpixelrequestbuffer.IGPixelRequestBuffer;
import com.facebook.login.LoginClient$Request;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Syr, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64075Syr implements InterfaceC65487Tl7 {
    public String A00 = null;
    public String A01;
    public final C63209SfE A02;
    public final C63209SfE A03;
    public final AbstractC12990ll A04;
    public final String A05;

    /* JADX WARN: Removed duplicated region for block: B:62:0x0100  */
    @Override // X.InterfaceC65487Tl7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean Cv2(android.content.Intent r12, int r13, int r14) {
        /*
            Method dump skipped, instructions count: 333
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64075Syr.Cv2(android.content.Intent, int, int):boolean");
    }

    @Override // X.InterfaceC65487Tl7
    public final void F8i(LoginClient$Request loginClient$Request) {
        List<ResolveInfo> queryIntentServices;
        String str = this.A01;
        if (str.isEmpty()) {
            this.A02.A02();
            return;
        }
        AbstractC12990ll abstractC12990ll = this.A04;
        if (abstractC12990ll != null) {
            AbstractC62273S4s.A00(abstractC12990ll, "web_auth_attempted", loginClient$Request.A01, null, loginClient$Request.A02);
        }
        Bundle A0b = AbstractC166987dD.A0b();
        java.util.Set set = loginClient$Request.A06;
        if (set.size() != 0) {
            A0b.putString("scope", TextUtils.join(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, set));
        }
        HashMap A1G = AbstractC166987dD.A1G();
        A1G.put("0_auth_logger_id", loginClient$Request.A04);
        A1G.put("3_method", "custom_tab");
        A1G.put("7_challenge", this.A05);
        A0b.putString(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATE, AbstractC31175DnJ.A0d(A1G));
        A0b.putString("cbt", String.valueOf(System.currentTimeMillis()));
        A0b.putString("redirect_uri", str);
        A0b.putString("app_id", loginClient$Request.A03);
        A0b.putString("e2e", C63209SfE.A01());
        A0b.putString("response_type", "token,signed_request,graph_domain,granted_scopes");
        A0b.putString("return_scopes", "true");
        A0b.putString("sso", "chrome_custom_tab");
        if (loginClient$Request.A00 == EnumC61140Rfu.A08) {
            A0b.putString("is_promote_auth", "true");
        }
        Collection collection = AbstractC62356S8d.A01;
        AbstractC63349Si6.A00(A0b, String.format("m.%s", IGPixelRequestBuffer.URL_PREFIX), AnonymousClass001.A0u("v2.3", "/", "dialog/", "oauth"));
        Fragment fragment = this.A03.A06;
        Intent A08 = MSW.A08(fragment.getActivity(), CustomTabMainActivity.class);
        A08.putExtra("CustomTabMainActivity.extra_action", "oauth");
        A08.putExtra("CustomTabMainActivity.extra_params", A0b);
        String str2 = this.A00;
        if (AbstractC63349Si6.A05(str2)) {
            Context context = C1L4.A00;
            Intent A0E = AbstractC58318PtA.A0E("android.support.customtabs.action.CustomTabsService");
            PackageManager packageManager = context.getPackageManager();
            str2 = null;
            if (packageManager != null && (queryIntentServices = packageManager.queryIntentServices(A0E, 0)) != null) {
                HashSet A13 = AbstractC58319PtB.A13(S6X.A00);
                Iterator<ResolveInfo> it = queryIntentServices.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    ServiceInfo serviceInfo = it.next().serviceInfo;
                    if (serviceInfo != null && A13.contains(((PackageItemInfo) serviceInfo).packageName)) {
                        str2 = ((PackageItemInfo) serviceInfo).packageName;
                        break;
                    }
                }
            }
            this.A00 = str2;
        }
        A08.putExtra("CustomTabMainActivity.extra_chromePackage", str2);
        AbstractC58322PtE.A0Z().A0H(A08, fragment, 1);
    }

    public C64075Syr(C63209SfE c63209SfE, String str) {
        this.A01 = "";
        this.A03 = c63209SfE;
        this.A02 = c63209SfE;
        this.A01 = AnonymousClass001.A0R("fbconnect://cct.", C1L4.A00.getPackageName());
        this.A05 = str;
        Bundle bundle = c63209SfE.A06.mArguments;
        this.A04 = bundle != null ? C023409i.A0A.A04(bundle) : null;
    }
}
