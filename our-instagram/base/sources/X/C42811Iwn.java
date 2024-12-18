package X;

import com.instagram.common.session.UserSession;
import com.instagram.save.api.SaveApiUtil;

/* renamed from: X.Iwn, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42811Iwn implements AnonymousClass388 {
    public final UserSession A00;
    public final InterfaceC61432r6 A01;
    public final InterfaceC686136y A02;
    public final InterfaceC60442pS A03;
    public final C689838k A04;
    public final AnonymousClass388 A05;

    public C42811Iwn(UserSession userSession, InterfaceC686136y interfaceC686136y, InterfaceC60442pS interfaceC60442pS, C689838k c689838k, AnonymousClass388 anonymousClass388, InterfaceC61432r6 interfaceC61432r6) {
        C14360o3.A0B(c689838k, 5);
        this.A02 = interfaceC686136y;
        this.A00 = userSession;
        this.A03 = interfaceC60442pS;
        this.A05 = anonymousClass388;
        this.A04 = c689838k;
        this.A01 = interfaceC61432r6;
    }

    @Override // X.AnonymousClass375
    public final InterfaceC37202GaD CCt() {
        return this.A02.CCt();
    }

    @Override // X.AnonymousClass388
    public final void Di3(C38321qM c38321qM, C75113Zb c75113Zb, InterfaceC37202GaD interfaceC37202GaD, int i) {
        boolean A1a = AbstractC167017dG.A1a(c38321qM, c75113Zb);
        C14360o3.A0B(interfaceC37202GaD, 3);
        this.A05.Di3(c38321qM, c75113Zb, interfaceC37202GaD, i);
        UserSession userSession = this.A00;
        if (C57602kZ.A00(userSession).A0O(c38321qM)) {
            AbstractC37300Gc1.A11(this.A01, AnonymousClass317.A0L, c38321qM, c75113Zb);
        }
        if (SaveApiUtil.A09(userSession, c38321qM) && AbstractC81213jq.A00(c38321qM, c75113Zb.A03)) {
            C689838k c689838k = this.A04;
            if (!c689838k.A02(c38321qM, c75113Zb)) {
                if (C18U.A06(C06090Tz.A05, c689838k.A00, 2342159057941434273L)) {
                    AbstractC123605iZ.A00(userSession);
                    C123625ib.A00(userSession, c38321qM, this.A03, c75113Zb);
                    c75113Zb.A0m(A1a, A1a);
                }
            }
        }
    }

    @Override // X.AnonymousClass388
    public final void Di5(C38321qM c38321qM, C75113Zb c75113Zb, int i) {
        AbstractC167017dG.A1N(c38321qM, c75113Zb);
        if (C57602kZ.A00(this.A00).A0O(c38321qM)) {
            AbstractC37300Gc1.A11(this.A01, AnonymousClass317.A0L, c38321qM, c75113Zb);
        }
        this.A05.Di5(c38321qM, c75113Zb, i);
    }
}
