package X;

import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;

/* loaded from: classes12.dex */
public final class YD0 implements YNw {
    public final C72741XmD A00;

    public static void A00(InterfaceC02590Ai interfaceC02590Ai, C72741XmD c72741XmD) {
        interfaceC02590Ai.A9K("carrier_id", Long.valueOf(c72741XmD.A00.C98().A00));
    }

    @Override // X.YNw
    public final /* bridge */ /* synthetic */ void CuU(YNq yNq, Object obj) {
        String str;
        AbstractC72503XfI abstractC72503XfI = (AbstractC72503XfI) obj;
        if (abstractC72503XfI instanceof XY9) {
            C72741XmD c72741XmD = this.A00;
            XY9 xy9 = (XY9) abstractC72503XfI;
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c72741XmD.A01, "ig_carrier_signal_v2_client_run");
            if (A0f.isSampled()) {
                A0f.A9K("count_all", AbstractC31171DnF.A0V(xy9.A02));
                A0f.A9K("count_error", AbstractC31171DnF.A0V(xy9.A00));
                A0f.A9K("count_success", AbstractC31171DnF.A0V(xy9.A03));
                A0f.A7v("was_state_changed", AbstractC166997dE.A0a());
                A0f.A9K("count_on_cooldown", AbstractC31171DnF.A0V(xy9.A01));
                A00(A0f, c72741XmD);
                if (xy9.A04.intValue() != 0) {
                    str = "SUCCESS";
                } else {
                    str = "CONFIG_FETCH_ERROR";
                }
                A0f.AAP(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATE, str);
                A0f.Cht();
            }
        }
        if (abstractC72503XfI instanceof XYA) {
            C72741XmD c72741XmD2 = this.A00;
            XYA xya = (XYA) abstractC72503XfI;
            InterfaceC02590Ai A0f2 = AbstractC166987dD.A0f(c72741XmD2.A01, "ig_carrier_signal_v2_client_ping");
            if (A0f2.isSampled()) {
                A0f2.A7v(MSV.A00(219), Boolean.valueOf(xya.A04));
                A0f2.AAP("key", xya.A02);
                A0f2.AAP("url", xya.A03);
                A00(A0f2, c72741XmD2);
                A0f2.AAP("error", xya.A01);
                A0f2.A9K("http_response_code", AbstractC31171DnF.A0V(xya.A00));
                A0f2.A7v("was_state_changed", AbstractC166997dE.A0a());
                A0f2.Cht();
            }
        }
        if (abstractC72503XfI instanceof XYV) {
            C72741XmD c72741XmD3 = this.A00;
            XYV xyv = (XYV) abstractC72503XfI;
            InterfaceC02590Ai A0f3 = AbstractC166987dD.A0f(c72741XmD3.A01, "carrier_signal_ping_funnel_client_ping_start");
            if (A0f3.isSampled()) {
                A0f3.AAP("ping_group_id", xyv.A02);
                A0f3.AAP("ping_id", xyv.A03);
                A0f3.AAP("carrier_signal_url", xyv.A01.A02);
                A00(A0f3, c72741XmD3);
                A0f3.Cht();
            }
        }
        if (abstractC72503XfI instanceof C72209XYd) {
            C72741XmD c72741XmD4 = this.A00;
            C72209XYd c72209XYd = (C72209XYd) abstractC72503XfI;
            XYV xyv2 = (XYV) ((AbstractC72210XYe) c72209XYd).A00;
            InterfaceC02590Ai A0f4 = AbstractC166987dD.A0f(c72741XmD4.A01, "carrier_signal_ping_funnel_client_ping_end");
            if (A0f4.isSampled()) {
                A0f4.AAP("ping_group_id", xyv2.A02);
                A0f4.AAP("ping_id", xyv2.A03);
                A0f4.AAP("carrier_signal_url", xyv2.A01.A02);
                A00(A0f4, c72741XmD4);
                A0f4.A9K("ping_response_status", AbstractC31171DnF.A0V(c72209XYd.A00));
                A0f4.Cht();
            }
        }
    }

    public YD0(C72741XmD c72741XmD) {
        this.A00 = c72741XmD;
    }
}
