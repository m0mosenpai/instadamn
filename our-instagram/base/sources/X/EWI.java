package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.messageid.MessageIdentifier;

/* loaded from: classes6.dex */
public final class EWI extends AbstractC61132qb {
    public final UserSession A00;
    public final L5U A01;
    public final InterfaceC60442pS A02;

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        UserSession userSession = this.A00;
        L5U l5u = this.A01;
        InterfaceC60442pS interfaceC60442pS = this.A02;
        C166017bT c166017bT = new C166017bT(AbstractC167967er.A00(userSession), userSession);
        String str = l5u.A0C;
        if (str != null) {
            return new Jn5(c166017bT, userSession, new LKh(userSession, new MessageIdentifier(l5u.A09, l5u.A07), str), l5u, interfaceC60442pS);
        }
        throw AbstractC166997dE.A0g();
    }

    public EWI(UserSession userSession, L5U l5u, InterfaceC60442pS interfaceC60442pS) {
        AbstractC167017dG.A1P(userSession, l5u);
        this.A00 = userSession;
        this.A01 = l5u;
        this.A02 = interfaceC60442pS;
    }
}
