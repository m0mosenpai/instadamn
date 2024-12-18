package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.7eV, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C167757eV extends AbstractC77583di {
    public final int A00;
    public final InterfaceC11380iw A01;
    public final UserSession A02;
    public final C148336m3 A03;
    public final InterfaceC16660sJ A04;

    public C167757eV(InterfaceC11380iw interfaceC11380iw, UserSession userSession, C148336m3 c148336m3, InterfaceC16660sJ interfaceC16660sJ, int i) {
        C14360o3.A0B(userSession, 2);
        C14360o3.A0B(interfaceC11380iw, 3);
        C14360o3.A0B(interfaceC16660sJ, 5);
        this.A03 = c148336m3;
        this.A02 = userSession;
        this.A01 = interfaceC11380iw;
        this.A00 = i;
        this.A04 = interfaceC16660sJ;
    }

    @Override // X.AbstractC77583di
    public final C78053eX A0Y(C77993eR c77993eR) {
        C14360o3.A0B(c77993eR, 0);
        int i = this.A00;
        long j = i | 9221401712017801216L;
        return new C78053eX(null, new C2YX(j, j), new C2YP(new C51532Yb(C77603dk.A00, C167777eX.A00, 3, true), C167767eW.A00, new C9F3(41, this, AbstractC77183d4.A00(c77993eR, new C206879Ds(this, 37), new Object[]{Integer.valueOf(i)})), c77993eR.A01()));
    }
}
