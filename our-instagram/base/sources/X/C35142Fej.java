package X;

import com.instagram.common.session.UserSession;
import java.util.Map;

/* renamed from: X.Fej, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35142Fej {
    public static final C35142Fej A00 = new Object();

    public final void A01(UserSession userSession, boolean z, boolean z2, boolean z3, boolean z4) {
        C14360o3.A0B(userSession, 0);
        A00(userSession, "customer_details_page_info_copied", "", AbstractC167017dG.A0u("has_additional_info", String.valueOf(z4), AbstractC166987dD.A1L("has_address", String.valueOf(z)), AbstractC166987dD.A1L("has_phone_number", String.valueOf(z2)), AbstractC166987dD.A1L("has_email", String.valueOf(z3))));
    }

    public static final void A00(UserSession userSession, String str, String str2, Map map) {
        C12210kP c12210kP = new C12210kP(userSession);
        c12210kP.A01 = "business_inbox_customer_details";
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c12210kP.A00(), "direct_customer_details");
        if (A0f.isSampled()) {
            AbstractC31171DnF.A1C(A0f, str);
            A0f.A9M("event_data", map);
            A0f.AAk("participant_ids", AbstractC166987dD.A1J(str2));
            A0f.Cht();
        }
    }
}
