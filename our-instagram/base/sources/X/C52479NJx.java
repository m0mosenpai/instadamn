package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.NJx, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52479NJx extends OX6 {
    public C05A A00;
    public boolean A01;
    public final UserSession A02;
    public final AbstractC55082Oac A03;
    public final KZH A04;
    public final C23031Ai A05;
    public final C0UO A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C52479NJx(UserSession userSession, AbstractC55082Oac abstractC55082Oac, KZH kzh) {
        super(abstractC55082Oac);
        AbstractC167007dF.A1D(abstractC55082Oac, 1, userSession);
        this.A03 = abstractC55082Oac;
        this.A02 = userSession;
        this.A04 = kzh;
        this.A05 = AbstractC23021Ah.A00(userSession);
        this.A01 = true;
        C008002u A1H = AbstractC25225BEi.A1H(new C50526MSf(3, 5, false));
        this.A00 = A1H;
        this.A06 = A1H;
    }
}
