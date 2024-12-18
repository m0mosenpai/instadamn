package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Vrw, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69593Vrw {
    public final InterfaceC11380iw A00;
    public final C19260xA A01;
    public final UserSession A02;
    public final InterfaceC71951XCd A03;

    public final void A00(C38321qM c38321qM, int i, int i2) {
        C14360o3.A0B(c38321qM, 0);
        InterfaceC71951XCd interfaceC71951XCd = this.A03;
        int C4p = interfaceC71951XCd.C4p();
        C19280xC A00 = AbstractC40594HzE.A00(this.A00, this.A01, c38321qM, null, i, i2);
        A00.A09(AbstractC111324zv.A00(2639), Boolean.valueOf(AbstractC167007dF.A1N(C4p)));
        A00.A04(AbstractC69959Vya.A00(c38321qM).A00());
        EnumC68206VFy C4m = interfaceC71951XCd.C4m();
        int C4p2 = interfaceC71951XCd.C4p();
        A00.A0C("feed_type", C4m.toString());
        A00.A0B("tab_index", Long.valueOf(C4p2));
        AbstractC31173DnH.A1S(A00, this.A02);
    }

    public C69593Vrw(InterfaceC11380iw interfaceC11380iw, C19260xA c19260xA, UserSession userSession, InterfaceC71951XCd interfaceC71951XCd) {
        AbstractC167017dG.A1R(userSession, interfaceC71951XCd);
        this.A00 = interfaceC11380iw;
        this.A02 = userSession;
        this.A03 = interfaceC71951XCd;
        this.A01 = c19260xA;
    }
}
