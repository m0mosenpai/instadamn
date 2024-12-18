package X;

import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.instagram.common.session.UserSession;

/* loaded from: classes5.dex */
public abstract class CJ7 {
    public static final void A00(UserSession userSession, String str, String str2, String str3, int i, int i2, int i3, boolean z) {
        C14360o3.A0B(userSession, 0);
        long parseLong = Long.parseLong(userSession.userId);
        EnumC31512Dsw A00 = C31514Dsy.A00(str);
        Long valueOf = Long.valueOf(parseLong);
        double A002 = C1Q9.A00();
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A02(userSession), "switcher_impression");
        long A0L = AbstractC166987dD.A0L(System.currentTimeMillis() - C1CC.A07);
        if (A0f.isSampled()) {
            A0f.A9K("raw_initiator_account_id", valueOf);
            A0f.A9K("initiator_identity_id", valueOf);
            AbstractC25234BEr.A0x(A00, A0f, str2, A002);
            A0f.A7v("is_cds", AbstractC166997dE.A0b());
            EnumC31511Dsv enumC31511Dsv = EnumC31511Dsv.INSTAGRAM;
            C09530e4 A0o = AbstractC167007dF.A0o(enumC31511Dsv, i);
            EnumC31511Dsv enumC31511Dsv2 = EnumC31511Dsv.FACEBOOK;
            Integer valueOf2 = Integer.valueOf(i3);
            A0f.A9M("number_of_account_logged_in_by_type", AbstractC06930Yk.A02(AbstractC25229BEm.A1b(enumC31511Dsv2, valueOf2, A0o)));
            A0f.A9M("number_of_account_shown_by_type", AbstractC06930Yk.A02(AbstractC25229BEm.A1b(enumC31511Dsv2, valueOf2, AbstractC167007dF.A0o(enumC31511Dsv, i2))));
            A0f.A8R(enumC31511Dsv, "initiator_account_type");
            A0f.AAP(OptSvcAnalyticsStore.LOGGING_KEY_STEP, str3);
            A0f.A7v("snooze_eligible", Boolean.valueOf(z));
            A0f.A9K("num_ig_horizontal_accounts_without_gql_data", Long.valueOf(A0L));
            A0f.A7v("shared_accounts_flows_enabled", false);
            A0f.Cht();
        }
    }
}
