package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.HJz, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39127HJz extends AbstractC64162vb {
    public final UserSession A00;
    public final InterfaceC60442pS A01;
    public final InterfaceC16660sJ A02;

    public C39127HJz(UserSession userSession, InterfaceC60442pS interfaceC60442pS, InterfaceC16660sJ interfaceC16660sJ) {
        super(C1BX.A03.A02("igtv_browse_organic"));
        this.A00 = userSession;
        this.A01 = interfaceC60442pS;
        this.A02 = interfaceC16660sJ;
    }

    private final void A00(JPW jpw, String str) {
        InterfaceC60442pS interfaceC60442pS = this.A01;
        C82713mZ c82713mZ = new C82713mZ(interfaceC60442pS, str);
        this.A02.invoke(c82713mZ);
        C105824pt AiE = jpw.AiE();
        if (AiE != null) {
            String str2 = AiE.A0e;
            str2.getClass();
            c82713mZ.A61 = str2;
            C32U.A0B(this.A00, c82713mZ, AiE, interfaceC60442pS, C05F.A00);
            return;
        }
        C38321qM BQN = jpw.BQN();
        UserSession userSession = this.A00;
        C14360o3.A0A(BQN);
        c82713mZ.A0G(userSession, BQN);
        C32U.A0B(userSession, c82713mZ, BQN, interfaceC60442pS, C05F.A00);
        C57502kP A00 = AbstractC57492kO.A00(userSession);
        C39381HaL c39381HaL = (C39381HaL) ((AbstractC57542kT) A00.A04.get(C39381HaL.class));
        if (c39381HaL == null) {
            c39381HaL = new C39381HaL(new C25301Lk(AbstractC12290kX.A00, new C38078Gp7(1), 1762211433), userSession);
            A00.A03(c39381HaL, C39381HaL.class);
        }
        String A38 = BQN.A38();
        if (A38 != null) {
            IHP ihp = c39381HaL.A00;
            if (ihp == null) {
                ihp = new IHP();
                c39381HaL.A00 = ihp;
            }
            C41051IFu c41051IFu = ihp.A01;
            if (!c41051IFu.A01.contains(A38)) {
                c41051IFu.A01.add(A38);
            }
            ihp.A00++;
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.AbstractC64162vb
    public final /* bridge */ /* synthetic */ void A03(Object obj, Object obj2) {
        JPW jpw = (JPW) obj;
        C14360o3.A0B(jpw, 0);
        A00(jpw, "instagram_thumbnail_impression");
    }

    @Override // X.AbstractC64162vb
    public final /* bridge */ /* synthetic */ void A04(Object obj, Object obj2) {
        JPW jpw = (JPW) obj;
        C14360o3.A0B(jpw, 0);
        A00(jpw, "instagram_thumbnail_sub_impression");
    }
}
