package X;

import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.Bp5, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26608Bp5 extends AbstractC77583di {
    public final C26949Buq A00;
    public final C166047bW A01;
    public final C25814BbV A02;
    public final UserSession A03;
    public final InterfaceC60442pS A04;

    @Override // X.AbstractC77583di
    public final C78053eX A0Y(C77993eR c77993eR) {
        int i;
        C14360o3.A0B(c77993eR, 0);
        Object obj = new Object();
        C26949Buq c26949Buq = this.A00;
        List C5D = c26949Buq.A00.C5D();
        if (C5D != null) {
            i = C5D.size();
        } else {
            i = 4;
        }
        return AbstractC25225BEi.A0g(C51722Yv.A02, new C29045CrY(i, c26949Buq.A01, c26949Buq.A03, c26949Buq.A02), AbstractC25229BEm.A0c(c77993eR, AbstractC25232BEp.A1A(C28977CqS.A00), C29732DAc.A00, new C30172DRc(12, obj, c77993eR, this)));
    }

    public C26608Bp5(C26949Buq c26949Buq, C166047bW c166047bW, C25814BbV c25814BbV, UserSession userSession, InterfaceC60442pS interfaceC60442pS) {
        AbstractC25234BEr.A1P(userSession, c26949Buq, c25814BbV);
        this.A03 = userSession;
        this.A00 = c26949Buq;
        this.A01 = c166047bW;
        this.A02 = c25814BbV;
        this.A04 = interfaceC60442pS;
    }
}
