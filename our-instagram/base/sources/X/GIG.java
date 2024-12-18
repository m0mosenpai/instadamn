package X;

import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.instagram.common.session.UserSession;
import com.instagram.urlhandler.IgMeMessageUrlHandlerActivity;
import com.instagram.user.model.User;

/* loaded from: classes6.dex */
public final class GIG implements GZT {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ IgMeMessageUrlHandlerActivity A01;
    public final /* synthetic */ String A02;

    @Override // X.GZT
    public final void Dxq(C2045893s c2045893s) {
        C14360o3.A0B(c2045893s, 0);
        User A00 = C72W.A00(c2045893s);
        if (A00 == null) {
            Dxp();
            return;
        }
        IgMeMessageUrlHandlerActivity igMeMessageUrlHandlerActivity = this.A01;
        igMeMessageUrlHandlerActivity.finish();
        IgMeMessageUrlHandlerActivity.A00(igMeMessageUrlHandlerActivity, String.valueOf(igMeMessageUrlHandlerActivity.A00), "success");
        if (C18U.A06(C06090Tz.A05, igMeMessageUrlHandlerActivity.getSession(), 36314846135847791L)) {
            AbstractC18680vv session = igMeMessageUrlHandlerActivity.getSession();
            AbstractC31171DnF.A1Q(session);
            C7NF A002 = C7ND.A00((UserSession) session);
            String str = this.A02;
            if (str != null && str.length() != 0) {
                String id = A00.getId();
                A002.A02 = str;
                A002.A03 = id;
            } else {
                A002.A01();
            }
        }
        C36881nl A01 = C36881nl.A01(igMeMessageUrlHandlerActivity, AbstractC31171DnF.A0D(FEK.A00), this.A00, "ig_me_message_url_entry_point");
        AbstractC31179DnN.A1Q(A01, A00);
        A01.A0k = true;
        A01.A06();
    }

    public GIG(UserSession userSession, IgMeMessageUrlHandlerActivity igMeMessageUrlHandlerActivity, String str) {
        this.A01 = igMeMessageUrlHandlerActivity;
        this.A02 = str;
        this.A00 = userSession;
    }

    @Override // X.GZT
    public final void Dxp() {
        IgMeMessageUrlHandlerActivity igMeMessageUrlHandlerActivity = this.A01;
        IgMeMessageUrlHandlerActivity.A00(igMeMessageUrlHandlerActivity, String.valueOf(igMeMessageUrlHandlerActivity.A00), OptSvcAnalyticsStore.LOGGING_KEY_DEX2OAT_FAILURE);
        C12260kU.A0C(igMeMessageUrlHandlerActivity, AbstractC31176DnK.A06(igMeMessageUrlHandlerActivity));
    }
}
