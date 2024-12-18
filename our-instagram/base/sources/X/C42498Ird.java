package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Ird, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42498Ird implements JG2 {
    public final UserSession A00;
    public final JG2 A01;
    public final C61552rI A02;

    @Override // X.JG2
    public final void DOu(C38321qM c38321qM, C75113Zb c75113Zb, String str, InterfaceC16820sZ interfaceC16820sZ, int i) {
        AbstractC167017dG.A1N(c38321qM, c75113Zb);
        C14360o3.A0B(str, 3);
        if (!AbstractC37301Gc2.A1a(this.A00, c38321qM)) {
            this.A02.A00("LIKE");
        }
        this.A01.DOu(c38321qM, c75113Zb, str, interfaceC16820sZ, i);
    }

    public C42498Ird(UserSession userSession, JG2 jg2, C61552rI c61552rI) {
        AbstractC167027dH.A13(jg2, userSession, c61552rI);
        this.A01 = jg2;
        this.A00 = userSession;
        this.A02 = c61552rI;
    }
}
