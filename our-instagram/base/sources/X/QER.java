package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* loaded from: classes10.dex */
public final class QER extends AbstractC63399SjU {
    public RiT A00;
    public String A01;
    public String A02;
    public final UserSession A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QER(Context context, UserSession userSession, String str) {
        super(str);
        RiT riT;
        C14360o3.A0B(userSession, 2);
        this.A03 = userSession;
        this.A01 = C1QM.A00.A02.A00;
        if (context != null) {
            if (AbstractC72723Nt.A00(context)) {
                riT = RiT.DARK;
            } else {
                riT = RiT.LIGHT;
            }
        } else {
            riT = null;
        }
        this.A00 = riT;
        this.A02 = AbstractC11060iN.A00(userSession).BdA();
    }

    public final void A0G(Integer num, String str, String str2, long j) {
        C25531Mh A0A;
        C0Zx c0Zx;
        int intValue = num.intValue();
        if (intValue != 1) {
            if (intValue != 0) {
                if (intValue == 2) {
                    A0A = AbstractC31171DnF.A0A(AbstractC166987dD.A0f(A0C(), "user_click_fbpaycheckout_cancel"), 403);
                    if (AbstractC25226BEj.A1Z(A0A)) {
                        A0A.A0u(str2);
                        AbstractC58323PtF.A1E(C2O5.A0G, A0A);
                        C0Zx c0Zx2 = new C0Zx();
                        c0Zx2.A06("target_name", "lite_checkout");
                        AbstractC58322PtE.A1I(A0A, c0Zx2, "lite_checkout");
                        c0Zx = new C0Zx();
                        c0Zx.A06("checkout_flow", "checkout_init");
                        AbstractC63399SjU.A08(c0Zx, this);
                    } else {
                        return;
                    }
                } else {
                    throw B4Z.A00();
                }
            } else {
                A0A = AbstractC31171DnF.A0A(AbstractC166987dD.A0f(A0C(), "client_load_loading_init"), 79);
                if (!AbstractC25226BEj.A1Z(A0A)) {
                    return;
                }
                A0A.A0u(str2);
                AbstractC58323PtF.A1E(C2O5.A0G, A0A);
                C0Zx c0Zx3 = new C0Zx();
                c0Zx3.A06("target_name", "lite_checkout");
                AbstractC58322PtE.A1I(A0A, c0Zx3, "lite_checkout");
                c0Zx = new C0Zx();
                c0Zx.A06("checkout_flow", "checkout_init");
                AbstractC63399SjU.A08(c0Zx, this);
            }
        } else {
            A0A = AbstractC31171DnF.A0A(AbstractC166987dD.A0f(A0C(), "client_create_fbpaycheckout_init"), 29);
            if (!AbstractC25226BEj.A1Z(A0A)) {
                return;
            }
            A0A.A0u(str2);
            AbstractC58323PtF.A1E(C2O5.A0G, A0A);
            C0Zx c0Zx4 = new C0Zx();
            c0Zx4.A06("target_name", "lite_checkout");
            AbstractC58322PtE.A1I(A0A, c0Zx4, "lite_checkout");
            c0Zx = new C0Zx();
            AbstractC63399SjU.A08(c0Zx, this);
            c0Zx.A06("checkout_flow", "checkout_init");
        }
        c0Zx.A06("navigation_chain", this.A01);
        c0Zx.A06("external_session_id", this.A02);
        c0Zx.A05("ad_id", Long.valueOf(j));
        c0Zx.A06("click_source", "");
        c0Zx.A06("iaw_session_id", str);
        A0A.A0N(c0Zx, "custom_fields");
        A0A.Cht();
    }
}
