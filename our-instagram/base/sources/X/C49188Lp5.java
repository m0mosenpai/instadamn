package X;

import android.content.Context;
import com.facebook.common.stringformat.StringFormatUtil;
import com.instagram.common.session.UserSession;
import com.instagram.direct.model.messaginguser.MessagingUser;
import com.instagram.model.direct.messageid.DirectMessageIdentifier;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: X.Lp5, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49188Lp5 implements InterfaceC50469MPx {
    public final Context A00;
    public final UserSession A01;
    public final AnonymousClass988 A02;
    public final C7IM A03;
    public final C47762L7i A04;

    @Override // X.InterfaceC50469MPx
    public final boolean AFd(C99E c99e, InterfaceC50520MRx interfaceC50520MRx, int i) {
        C14360o3.A0B(interfaceC50520MRx, 0);
        if (interfaceC50520MRx.BeK(i) != null && LIQ.A00(c99e, interfaceC50520MRx, i) == C2EY.A0k) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC50469MPx
    public final C47908LEc AWs(Context context, C51760Mtj c51760Mtj, C99E c99e, MessagingUser messagingUser, L8R l8r, InterfaceC50520MRx interfaceC50520MRx, Map map, java.util.Set set, int i, boolean z) {
        C1583978z c1583978z;
        C14360o3.A0B(context, 0);
        AbstractC25234BEr.A1P(l8r, interfaceC50520MRx, messagingUser);
        AbstractC167017dG.A1T(set, map);
        interfaceC50520MRx.BtD(i);
        C47762L7i c47762L7i = this.A04;
        C2EY c2ey = C2EY.A0k;
        C162777Qo A00 = c47762L7i.A00(c99e, null, null, messagingUser, l8r, interfaceC50520MRx, c2ey, set, i);
        UserSession userSession = this.A01;
        C7IM c7im = this.A03;
        AnonymousClass988 anonymousClass988 = this.A02;
        C7QL A002 = Ko8.A00(c99e, anonymousClass988, c7im, messagingUser, interfaceC50520MRx, false, false, AbstractC09440dt.A01(MGL.A00), i);
        boolean A04 = LKZ.A04(userSession, l8r, map);
        boolean A01 = LCG.A01(l8r);
        l8r.A00();
        String formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe("instagram://msys_thread/%s/group_polls/%s", Long.valueOf(interfaceC50520MRx.C7P(i)), interfaceC50520MRx.BeK(i));
        C14360o3.A0A(formatStrLocaleSafe);
        C9C9 A09 = JQ1.A09(messagingUser, formatStrLocaleSafe);
        Context context2 = this.A00;
        List A1J = AbstractC166987dD.A1J(new C9CP(null, AbstractC166997dE.A0p(context2, 2131960150), "web_url", formatStrLocaleSafe, null, null));
        DirectMessageIdentifier directMessageIdentifier = new DirectMessageIdentifier(null, interfaceC50520MRx.BSx(i), null);
        EnumC910243u enumC910243u = EnumC910243u.SINGLE;
        String BeN = interfaceC50520MRx.BeN(i);
        if (BeN == null) {
            BeN = "";
        }
        ArrayList A1E = AbstractC166987dD.A1E();
        A1E.add(new C45034JwP("Dummy Option 1", AbstractC166987dD.A1J(AbstractC25225BEi.A0t("")), 100, 0L));
        A1E.add(new C45034JwP("Dummy Option 2", AbstractC166987dD.A1J(AbstractC25225BEi.A0t("")), 50, 0L));
        A1E.add(new C45034JwP("Dummy Option 3", AbstractC166987dD.A1J(AbstractC25225BEi.A0t("")), 0, 0L));
        Long BeK = interfaceC50520MRx.BeK(i);
        if (BeK != null) {
            c1583978z = new C1583978z(null, BeN, null, A1E, BeK.longValue());
        } else {
            c1583978z = null;
        }
        return new C47908LEc(C05F.A00, LKZ.A02(interfaceC50520MRx, i), new K0K(new C1576676a(A00, new C7QY(null, null, null, A09, null, null, null, null, LLL.A00(context2, anonymousClass988, messagingUser, interfaceC50520MRx, c2ey, MGK.A00, i, A04, A01), A002, null, null, null, null, c1583978z, null, enumC910243u, null, directMessageIdentifier, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, A1J, null, null, 0, 0, 0, false, false, false, false, false, false, false, false, false, false), interfaceC50520MRx.BSx(i))), null);
    }

    public C49188Lp5(Context context, UserSession userSession, AnonymousClass988 anonymousClass988, C7IM c7im) {
        this.A00 = context;
        this.A03 = c7im;
        this.A01 = userSession;
        this.A02 = anonymousClass988;
        this.A04 = Ko2.A00(context, userSession, anonymousClass988, c7im);
    }
}
