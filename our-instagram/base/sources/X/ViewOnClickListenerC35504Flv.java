package X;

import android.net.Uri;
import android.view.View;
import com.facebook.react.views.webview.ReactWebViewManager;
import com.instagram.common.session.UserSession;
import com.instagram.fx.igxfb.IgxfbNetEgoCTABannerParams;
import java.net.URLDecoder;

/* renamed from: X.Flv, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ViewOnClickListenerC35504Flv implements View.OnClickListener {
    public final /* synthetic */ C34608FMr A00;

    public ViewOnClickListenerC35504Flv(C34608FMr c34608FMr) {
        this.A00 = c34608FMr;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Long l;
        int A05 = C0f9.A05(-1404543127);
        C34608FMr c34608FMr = this.A00;
        IgxfbNetEgoCTABannerParams igxfbNetEgoCTABannerParams = c34608FMr.A02;
        String decode = URLDecoder.decode(igxfbNetEgoCTABannerParams.A00, ReactWebViewManager.HTML_ENCODING);
        Long l2 = null;
        Uri.Builder A04 = AbstractC31175DnJ.A04(AbstractC111324zv.A00(2461));
        UserSession userSession = c34608FMr.A01;
        A04.appendQueryParameter("ref", C18U.A04(C06090Tz.A05, userSession, 36886983024313080L));
        C35243Fgc.A00(c34608FMr.A00, null, userSession, decode, AbstractC166987dD.A19(A04.build()), "igxfb_net_ego", "IGXFB_NET_EGO", "");
        C18920wW c18920wW = c34608FMr.A04;
        C14360o3.A0A(decode);
        C14360o3.A0B(decode, 3);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c18920wW, "instagram_pymr_fb_banner_click");
        if (A0f.isSampled()) {
            String str = userSession.userId;
            C14360o3.A0B(str, 0);
            A0f.A9K("entity_id", AbstractC003100w.A0k(10, str));
            String str2 = igxfbNetEgoCTABannerParams.A02;
            if (str2 != null) {
                l = AbstractC003100w.A0k(10, str2);
            } else {
                l = null;
            }
            A0f.A9K("netego_type", l);
            String str3 = igxfbNetEgoCTABannerParams.A01;
            if (str3 != null) {
                l2 = AbstractC003100w.A0k(10, str3);
            }
            A0f.A9K("media_id", l2);
            A0f.AAP("navigation_url", decode);
            A0f.Cht();
        }
        C0f9.A0C(1425170292, A05);
    }
}
