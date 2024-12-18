package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.EkB, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33164EkB extends AbstractC33572Esk {
    public final UserSession A00;
    public final InterfaceC19630xq A01;

    public C33164EkB(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = C1AT.A01(userSession).A03(C1AV.A2u);
    }

    public static final FLL A00(C33164EkB c33164EkB, String str) {
        if (!C2TN.A00(c33164EkB.A00)) {
            return null;
        }
        InterfaceC19630xq interfaceC19630xq = c33164EkB.A01;
        String string = interfaceC19630xq.getString(AbstractC31173DnH.A0r("deep_link_launch:%s:%s:%s", "product_details_page", str, "merchant_id"), null);
        String string2 = interfaceC19630xq.getString(AbstractC31173DnH.A0r("deep_link_launch:%s:%s:%s", "product_details_page", str, "merchant_username"), null);
        String string3 = interfaceC19630xq.getString(AbstractC31173DnH.A0r("deep_link_launch:%s:%s:%s", "product_details_page", str, "product_id"), null);
        if (string == null || string2 == null || string3 == null) {
            return null;
        }
        return new FLL(string, string2, string3);
    }

    public static final void A01(FLL fll, C33164EkB c33164EkB, String str) {
        if (C2TN.A00(c33164EkB.A00)) {
            InterfaceC19610xo ARD = c33164EkB.A01.ARD();
            ARD.E7K(AbstractC31173DnH.A0r("deep_link_launch:%s:%s:%s", "product_details_page", str, "merchant_id"), fll.A00);
            ARD.E7K(AbstractC31173DnH.A0r("deep_link_launch:%s:%s:%s", "product_details_page", str, "merchant_username"), fll.A01);
            ARD.E7K(AbstractC31173DnH.A0r("deep_link_launch:%s:%s:%s", "product_details_page", str, "product_id"), fll.A02);
            ARD.apply();
        }
    }
}
