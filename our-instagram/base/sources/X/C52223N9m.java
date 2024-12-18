package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.N9m, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52223N9m extends C1P1 {
    public final /* synthetic */ C166057bY A00;
    public final /* synthetic */ InterfaceC58140Pq5 A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ C38321qM A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ java.util.Set A05;

    public C52223N9m(C166057bY c166057bY, InterfaceC58140Pq5 interfaceC58140Pq5, UserSession userSession, C38321qM c38321qM, String str, java.util.Set set) {
        this.A00 = c166057bY;
        this.A04 = str;
        this.A03 = c38321qM;
        this.A05 = set;
        this.A01 = interfaceC58140Pq5;
        this.A02 = userSession;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        String str;
        int A03 = C0f9.A03(1384445892);
        C14360o3.A0B(abstractC115105If, 0);
        C166057bY c166057bY = this.A00;
        String str2 = this.A04;
        InterfaceC40821up interfaceC40821up = (InterfaceC40821up) abstractC115105If.A00();
        if (interfaceC40821up != null) {
            str = interfaceC40821up.getErrorCode();
        } else {
            str = null;
        }
        C166057bY.A00(c166057bY, str2, AbstractC111324zv.A00(4251), null, str, c166057bY.A01);
        C55217Oeg.A07(this.A01, this.A03, this.A05, false);
        C0f9.A0A(1928008742, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C0f9.A03(1304054642);
        N2Y n2y = (N2Y) obj;
        int A0N = AbstractC167017dG.A0N(n2y, 7481160);
        InterfaceC58218PrO F7f = n2y.F7f();
        C166057bY c166057bY = this.A00;
        C166057bY.A01(c166057bY, this.A04, AbstractC111324zv.A00(5432), c166057bY.A01);
        C38321qM c38321qM = this.A03;
        java.util.Set set = this.A05;
        InterfaceC58140Pq5 interfaceC58140Pq5 = this.A01;
        C51779Muj c51779Muj = (C51779Muj) F7f;
        C55217Oeg.A05(C55217Oeg.A00(c51779Muj.A00), interfaceC58140Pq5, c38321qM, c51779Muj.A01, c51779Muj.A03, c51779Muj.A02, set);
        C0f9.A0A(1168819405, A0N);
        C0f9.A0A(1167812256, A03);
    }
}
