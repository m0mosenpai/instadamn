package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class NK5 extends OX6 {
    public final AbstractC55082Oac A00;
    public final C0UO A01;
    public final UserSession A02;
    public final C50997Mg4 A03;

    public final void A08() {
        C05A c05a = this.A03.A04;
        c05a.getValue();
        do {
        } while (!c05a.AIi(c05a.getValue(), C52488NKg.A00));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NK5(UserSession userSession, AbstractC55082Oac abstractC55082Oac, C50997Mg4 c50997Mg4) {
        super(abstractC55082Oac);
        AbstractC167017dG.A1R(userSession, c50997Mg4);
        this.A00 = abstractC55082Oac;
        this.A02 = userSession;
        this.A03 = c50997Mg4;
        this.A01 = c50997Mg4.A05;
    }
}
