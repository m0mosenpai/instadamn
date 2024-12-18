package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.model.messaginguser.MessagingUser;
import com.instagram.model.direct.threadkey.impl.MsysPendingRecipient;
import com.instagram.user.model.User;

/* renamed from: X.GVb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C37066GVb extends C0YY implements InterfaceC16660sJ {
    public static final C37066GVb A00 = new C37066GVb();

    public C37066GVb() {
        super(1);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        User A0T = AbstractC31178DnM.A0T((UserSession) obj);
        if (A0T.BTC() == null) {
            AbstractC166987dD.A1T(C18950wb.A01, "messaging_user_fbid_null", 20134884);
        }
        MsysPendingRecipient A002 = AbstractC34821FVx.A00(A0T);
        return C42221xC.A09(new MessagingUser(null, Long.valueOf(A002.A01), A002.A07, A002.A00, true));
    }
}
