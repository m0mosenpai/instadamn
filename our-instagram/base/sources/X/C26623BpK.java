package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.BpK, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26623BpK extends AbstractC77583di {
    public final UserSession A00;
    public final C42644Iu1 A01;
    public final C41V A02;
    public final InterfaceC60442pS A03;
    public final C75113Zb A04;
    public final boolean A05;
    public final int A06;
    public final int A07;
    public final C51722Yv A08;
    public final InterfaceC11380iw A09;
    public final C3VU A0A;
    public final C38321qM A0B;
    public final C57332k8 A0C;
    public final C33P A0D;

    public C26623BpK(C51722Yv c51722Yv, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C42644Iu1 c42644Iu1, C3VU c3vu, C41V c41v, C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS, C75113Zb c75113Zb, C57332k8 c57332k8, C33P c33p, int i, int i2, boolean z) {
        C14360o3.A0B(c38321qM, 4);
        this.A08 = c51722Yv;
        this.A06 = i;
        this.A00 = userSession;
        this.A0B = c38321qM;
        this.A04 = c75113Zb;
        this.A03 = interfaceC60442pS;
        this.A05 = z;
        this.A09 = interfaceC11380iw;
        this.A02 = c41v;
        this.A07 = i2;
        this.A0D = c33p;
        this.A0A = c3vu;
        this.A0C = c57332k8;
        this.A01 = c42644Iu1;
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, X.2YT] */
    @Override // X.AbstractC77583di
    public final C78053eX A0Y(C77993eR c77993eR) {
        C14360o3.A0B(c77993eR, 0);
        C105214ob c105214ob = new C105214ob(this.A00, this.A0A.AmT(), this.A0C);
        C38321qM c38321qM = this.A0B;
        C75113Zb c75113Zb = this.A04;
        int i = this.A06;
        int i2 = this.A07;
        C33P c33p = this.A0D;
        EnumC74373Vt A02 = c33p.A02(c38321qM);
        EnumC79303gb A01 = c33p.A01(c38321qM);
        Context A0A = AbstractC25227BEk.A0A(c77993eR);
        InterfaceC60442pS interfaceC60442pS = this.A03;
        C38321qM A1e = c38321qM.A1e(i);
        if (A1e == null) {
            A1e = c38321qM;
        }
        C105224oc A00 = c105214ob.A00(A0A, c38321qM, A1e, interfaceC60442pS, c75113Zb, A01, A02, null, null, c38321qM.A0C.AmB(), c38321qM.A3U(), c38321qM.A3T(), c38321qM.A3V(), i, i2, false);
        return AbstractC25225BEi.A0g(this.A08, new Object(), AbstractC25229BEm.A0c(c77993eR, AbstractC25230BEn.A0i(C28986Cqb.A00, 4), DCH.A00, new C50364MLq(28, A00, c77993eR, this)));
    }
}
