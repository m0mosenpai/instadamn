package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes5.dex */
public final class C07 extends AbstractC63592ug {
    public final C675432t A00;
    public final C63452uS A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C07(C675432t c675432t, UserSession userSession, InterfaceC60442pS interfaceC60442pS, InterfaceC63482uV interfaceC63482uV, C63452uS c63452uS) {
        super(C1BX.A03.A01(AbstractC62752tE.A00(userSession, AbstractC111324zv.A00(2411))), userSession, null, interfaceC60442pS, interfaceC63482uV, 1008, 0L, false);
        C14360o3.A0B(interfaceC63482uV, 5);
        this.A00 = c675432t;
        this.A01 = c63452uS;
    }

    @Override // X.AbstractC63592ug
    public final String A02() {
        return null;
    }

    @Override // X.AbstractC63592ug
    public final /* bridge */ /* synthetic */ C82713mZ A01(Object obj, Object obj2) {
        C84923qg c84923qg = (C84923qg) obj;
        C14360o3.A0B(c84923qg, 0);
        if (!c84923qg.A02() && c84923qg.A06 == EnumC84933qh.A09 && c84923qg.A07 != null) {
            return this.A00.A01(c84923qg, null);
        }
        return null;
    }

    @Override // X.AbstractC63592ug
    public final String A04() {
        return "feed_comment";
    }
}
