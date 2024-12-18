package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Pj7, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C57718Pj7 extends C0YY implements InterfaceC16660sJ {
    public static final C57718Pj7 A00 = new C57718Pj7();

    public C57718Pj7() {
        super(1);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AbstractC52972be abstractC52972be = (AbstractC52972be) obj;
        C14360o3.A0B(abstractC52972be, 0);
        UserSession userSession = (UserSession) abstractC52972be.A00(C55575OmD.A00);
        if (userSession != null) {
            C54703OEf c54703OEf = (C54703OEf) abstractC52972be.A00(C55574OmC.A00);
            if (c54703OEf != null) {
                C147236jz c147236jz = (C147236jz) abstractC52972be.A00(C55572OmA.A00);
                if (c147236jz != null) {
                    C206329Bp c206329Bp = (C206329Bp) abstractC52972be.A00(C55573OmB.A00);
                    if (c206329Bp != null) {
                        C54477O5f c54477O5f = new C54477O5f(userSession);
                        InterfaceC11380iw interfaceC11380iw = c54703OEf.A00.A00;
                        String str = c147236jz.A02;
                        String str2 = c206329Bp.A01;
                        AbstractC25233BEq.A0w(1, interfaceC11380iw, str, str2);
                        return new C38317GtC(userSession, c54703OEf.A01, c54703OEf.A03, c54477O5f, new NSU(interfaceC11380iw, userSession, AbstractC57842kx.A00(userSession), c54477O5f, str, str2));
                    }
                    throw AbstractC166987dD.A14("No viewer session found");
                }
                throw AbstractC166987dD.A14("No viewer parameters found");
            }
            throw AbstractC166987dD.A14("No use case provider found");
        }
        throw AbstractC166987dD.A14("No UserSession set");
    }
}
