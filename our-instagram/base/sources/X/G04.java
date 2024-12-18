package X;

import java.util.Map;

/* loaded from: classes6.dex */
public final class G04 implements InterfaceC13050lr {
    public final AbstractC12990ll A00;

    public G04(AbstractC12990ll abstractC12990ll) {
        C14360o3.A0B(abstractC12990ll, 1);
        this.A00 = abstractC12990ll;
    }

    public static final void A00(G04 g04, String str, String str2, String str3, Map map) {
        C25531Mh A0A = AbstractC31171DnF.A0A(AbstractC166987dD.A0f(AbstractC12220kQ.A02(g04.A00), "fx_unified_launcher_logging"), 161);
        if (AbstractC25226BEj.A1Z(A0A)) {
            A0A.A0R("fx_unified_launcher_logger_event", str);
            A0A.A0R("unified_launcher_error_message", str2);
            A0A.A0R("unified_launcher_product_flow", str3);
            A0A.A0R("unified_launcher_app_id", "com.bloks.www.fxcal.link.async");
            ((AbstractC02600Aj) A0A).A00.A9M("debug_test_data", map);
            A0A.Cht();
        }
    }

    @Override // X.InterfaceC13050lr
    public final void onUserSessionWillEnd(boolean z) {
        this.A00.A03(G04.class);
    }

    public G04() {
    }
}
