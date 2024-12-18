package X;

import com.instagram.api.schemas.MediaType;
import com.instagram.common.session.UserSession;

/* renamed from: X.BpA, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26613BpA extends AbstractC77583di {
    public final int A00;
    public final MediaType A01;
    public final C25814BbV A02;
    public final InterfaceC11380iw A03;
    public final UserSession A04;
    public final String A05;

    public C26613BpA(MediaType mediaType, C25814BbV c25814BbV, InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str, int i) {
        AbstractC167007dF.A1G(userSession, 1, interfaceC11380iw);
        this.A04 = userSession;
        this.A05 = str;
        this.A01 = mediaType;
        this.A00 = i;
        this.A03 = interfaceC11380iw;
        this.A02 = c25814BbV;
    }

    @Override // X.AbstractC77583di
    public final C78053eX A0Y(C77993eR c77993eR) {
        C14360o3.A0B(c77993eR, 0);
        Object A00 = AbstractC77183d4.A00(c77993eR, new D8L(43, c77993eR, this), new Object[]{this.A04, this.A05, this.A01});
        long A0A = AbstractC25225BEi.A0A(this.A00);
        return AbstractC25225BEi.A0g(null, new C2YX(A0A, A0A), AbstractC25229BEm.A0c(c77993eR, AbstractC25230BEn.A0i(C28975CqQ.A00, 3), C29730DAa.A00, new C50369MLw(31, this, A00)));
    }
}
