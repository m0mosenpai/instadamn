package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class NK1 extends OX6 {
    public Integer A00;
    public final UserSession A01;
    public final AbstractC55082Oac A02;
    public final C05A A03;
    public final C0UO A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NK1(UserSession userSession, AbstractC55082Oac abstractC55082Oac, boolean z, boolean z2, boolean z3) {
        super(abstractC55082Oac);
        C14360o3.A0B(userSession, 2);
        this.A02 = abstractC55082Oac;
        this.A01 = userSession;
        this.A05 = z;
        this.A06 = z2;
        this.A07 = z3;
        C008002u A1H = AbstractC25225BEi.A1H(new MUG(7));
        this.A03 = A1H;
        this.A04 = A1H;
        this.A00 = C05F.A00;
    }
}
