package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class L7T {
    public C45020JwB A00;
    public final C47775L7x A01;
    public final C13920nI A02;
    public final C2056398n A03;

    public L7T(UserSession userSession) {
        C2056398n A00 = AbstractC2056298m.A00(userSession);
        C06090Tz c06090Tz = C06090Tz.A05;
        int A07 = AbstractC25225BEi.A07(c06090Tz, userSession, 36603515183829956L);
        int A072 = AbstractC25225BEi.A07(c06090Tz, userSession, 36603515183895493L);
        int A073 = AbstractC25225BEi.A07(c06090Tz, userSession, 36603515183961030L);
        C13920nI c13920nI = C13920nI.A00;
        AbstractC167007dF.A1G(A00, 1, c13920nI);
        this.A03 = A00;
        this.A02 = c13920nI;
        InterfaceC19630xq interfaceC19630xq = A00.A00;
        C45020JwB c45020JwB = new C45020JwB(interfaceC19630xq.getInt("stickers_suggestions_impressions_count", 0), interfaceC19630xq.getInt("stickers_suggestions_trigger_count", 0), AbstractC31175DnJ.A03(interfaceC19630xq, "stickers_suggestions_cool_down_end"));
        this.A00 = c45020JwB;
        this.A01 = new C47775L7x(new C50251MHg(this, 14), A07, A072, A073, c45020JwB.A00, c45020JwB.A01, c45020JwB.A02);
    }

    public final void A00() {
        C47775L7x c47775L7x = this.A01;
        C45020JwB c45020JwB = new C45020JwB(c47775L7x.A00, c47775L7x.A01, c47775L7x.A02);
        if (!C14360o3.A0K(this.A00, c45020JwB)) {
            this.A00 = c45020JwB;
            C2056398n c2056398n = this.A03;
            int i = c45020JwB.A00;
            long j = c45020JwB.A02;
            int i2 = c45020JwB.A01;
            InterfaceC19610xo ARD = c2056398n.A00.ARD();
            ARD.E7D("stickers_suggestions_impressions_count", i);
            ARD.E7D("stickers_suggestions_trigger_count", i2);
            ARD.E7G("stickers_suggestions_cool_down_end", j);
            ARD.commit();
        }
    }
}
