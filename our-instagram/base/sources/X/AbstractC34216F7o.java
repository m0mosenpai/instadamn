package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.F7o, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34216F7o {
    public static final void A00(EnumC33517Erq enumC33517Erq, UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        String str = userSession.userId;
        if (str != null && str.length() != 0) {
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A02(userSession), "fx_settings_birthday");
            A0f.A8R(enumC33517Erq, "event");
            A0f.A9K("initiator_account_id", AbstractC25231BEo.A0j(0, userSession.userId));
            A0f.A7v("is_cds", false);
            A0f.Cht();
        }
    }
}
