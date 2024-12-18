package X;

import android.content.Context;
import android.view.View;
import android.view.ViewTreeObserver;
import com.instagram.common.session.UserSession;

/* renamed from: X.Soh, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC63514Soh implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;

    public ViewTreeObserverOnGlobalLayoutListenerC63514Soh(Context context, View view, UserSession userSession, String str, String str2) {
        this.A01 = view;
        this.A00 = context;
        this.A02 = userSession;
        this.A04 = str;
        this.A03 = str2;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        String str;
        Long l;
        View view = this.A01;
        if (view.getViewTreeObserver().isAlive()) {
            QER qer = new QER(this.A00, this.A02, "LITE_CHECKOUT");
            String str2 = this.A04;
            String str3 = this.A03;
            if (C18U.A06(C06090Tz.A05, qer.A03, 36315971417476957L)) {
                str = "show_merchant_branding";
            } else {
                str = "hide_merchant_branding";
            }
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(qer.A0C(), "client_load_shopslitecheckouteligibility_display");
            if (A0f.isSampled()) {
                A0f.AAP(AbstractC58347Ptn.A00(9, 10, 87), "");
                AbstractC58321PtD.A1E(C2O5.A0G, A0f);
                C0Zx c0Zx = new C0Zx();
                c0Zx.A06("target_name", "shops_lite_iaw_disclaimer");
                c0Zx.A06("view_name", str);
                A0f.AAQ(c0Zx, "event_payload");
                C0Zx c0Zx2 = new C0Zx();
                c0Zx2.A06("checkout_flow", "checkout_init");
                AbstractC63399SjU.A08(c0Zx2, qer);
                c0Zx2.A06("external_session_id", qer.A02);
                c0Zx2.A06("navigation_chain", qer.A01);
                if (str3 != null) {
                    l = AbstractC25228BEl.A13(str3);
                } else {
                    l = null;
                }
                c0Zx2.A05("ad_id", l);
                c0Zx2.A06("merchant_domain", "");
                c0Zx2.A06("tracking_codes", null);
                c0Zx2.A06("iaw_session_id", str2);
                A0f.AAQ(c0Zx2, "custom_fields");
                A0f.Cht();
            }
            view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }
}
