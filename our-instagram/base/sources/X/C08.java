package X;

import com.instagram.common.session.UserSession;
import java.util.List;

/* loaded from: classes5.dex */
public final class C08 extends AbstractC63592ug {
    public final C675432t A00;
    public final C63452uS A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C08(C675432t c675432t, UserSession userSession, InterfaceC60442pS interfaceC60442pS, InterfaceC63482uV interfaceC63482uV, C63452uS c63452uS) {
        super(C1BX.A03.A01(AbstractC62752tE.A00(userSession, AbstractC111324zv.A00(2902))), userSession, null, interfaceC60442pS, interfaceC63482uV, 1008, 0L, false);
        AbstractC167007dF.A1G(c675432t, 1, interfaceC63482uV);
        this.A00 = c675432t;
        this.A01 = c63452uS;
    }

    @Override // X.AbstractC63592ug
    public final String A02() {
        return null;
    }

    @Override // X.AbstractC63592ug
    public final /* bridge */ /* synthetic */ C82713mZ A01(Object obj, Object obj2) {
        C45127Jxw c45127Jxw;
        List list;
        C84923qg c84923qg;
        C37644Ghd c37644Ghd = (C37644Ghd) obj2;
        if (c37644Ghd == null || (c45127Jxw = c37644Ghd.A0A) == null || (list = (List) c45127Jxw.A00) == null || (c84923qg = (C84923qg) AbstractC001800i.A0J(list)) == null) {
            return null;
        }
        c84923qg.A0N = true;
        if (c84923qg.A02()) {
            return null;
        }
        return this.A00.A01(c84923qg, true);
    }

    @Override // X.AbstractC63592ug
    public final String A04() {
        return "feed_comment";
    }
}
