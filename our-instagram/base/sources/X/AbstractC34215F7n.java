package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.F7n, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34215F7n {
    public static final void A00(UserSession userSession, String str, String str2) {
        C14360o3.A0B(userSession, 0);
        String A0s = AbstractC31174DnI.A0s();
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A02(userSession), "fx_igpc_migration_upsell");
        AbstractC31171DnF.A1B(A0f, "linking_flow_initiated");
        A0f.AAP("linking_flow_entry_point", AbstractC167007dF.A0h(str));
        Long l = null;
        String str3 = userSession.userId;
        if (str3 != null) {
            l = AbstractC166997dE.A0j(str3);
        }
        A0f.A9K("initiator_account_id", l);
        A0f.A9K("initiator_account_type", 1L);
        A0f.A9K(AbstractC58317Pt9.A00(997), AbstractC166997dE.A0j(str2));
        A0f.AAP("app_device_id", A0s);
        A0f.AAP("debug_data", null);
        A0f.Cht();
    }
}
