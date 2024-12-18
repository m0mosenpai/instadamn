package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.MVd, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50592MVd extends AbstractC64412w0 {
    public C07R A00;
    public C07R A01;
    public final UserSession A02;
    public final InterfaceC60442pS A03;
    public final InterfaceC43589JPu A04;
    public final C07T A05;
    public final C07T A06;

    public C50592MVd(C07T c07t, C07T c07t2, UserSession userSession, InterfaceC60442pS interfaceC60442pS, InterfaceC43589JPu interfaceC43589JPu) {
        super(0L, 0.5f);
        this.A06 = c07t;
        this.A05 = c07t2;
        this.A03 = interfaceC60442pS;
        this.A02 = userSession;
        this.A04 = interfaceC43589JPu;
        C008302x A00 = C0JE.A00(new C9D3(c07t, (InterfaceC23621Ds) null, 8, 42));
        C12T c12t = C12P.A00;
        AnonymousClass137 A06 = AnonymousClass131.A00.A06();
        AbstractC18560vj.A03(AbstractC57302k5.A00(c07t), MSW.A1I(new C57153PYx(this, null, 18), AbstractC011604e.A01(A06, A00)));
        AbstractC18560vj.A03(AbstractC57302k5.A00(c07t), MSW.A1I(new C57153PYx(this, null, 19), AbstractC011604e.A01(A06, C0JE.A00(new C9D3(c07t2, (InterfaceC23621Ds) null, 8, 42)))));
    }

    @Override // X.AbstractC64412w0
    public final /* bridge */ /* synthetic */ void A00(Object obj, long j, Object obj2) {
        String str;
        C37644Ghd c37644Ghd = (C37644Ghd) obj2;
        C14360o3.A0B(c37644Ghd, 1);
        C07R c07r = this.A01;
        C07R c07r2 = C07R.ON_PAUSE;
        if (c07r != c07r2 && c07r != C07R.ON_STOP) {
            str = "IN_VIEWER_DISMISS";
        } else if (this.A00 != c07r2 && c07r != C07R.ON_STOP) {
            str = "USER_LEFT_REEL_VIEWER";
        } else {
            str = "USER_LEFT_APP";
        }
        InterfaceC60442pS interfaceC60442pS = this.A03;
        UserSession userSession = this.A02;
        InterfaceC43589JPu interfaceC43589JPu = this.A04;
        int A06 = c37644Ghd.A06();
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC60442pS, userSession), "instagram_clips_ghost_screen_time_spent");
        AbstractC25229BEm.A1A(A0f, interfaceC60442pS);
        AbstractC25229BEm.A19(A0f, A06);
        AbstractC25225BEi.A1P(A0f, interfaceC43589JPu.CGJ());
        A0f.A9K("timespent", Long.valueOf(j));
        AbstractC25225BEi.A1N(A0f, String.valueOf(AbstractC25225BEi.A14()));
        AbstractC25232BEp.A1L(A0f, "ghost_screen_outcome", str);
    }
}
