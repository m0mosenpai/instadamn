package X;

import com.google.common.util.concurrent.MoreExecutors;
import com.instagram.common.session.UserSession;

/* renamed from: X.KRs, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45863KRs extends C160757Ij {
    public final UserSession A00;

    @Override // X.C160757Ij
    public final int A08(C7VC c7vc) {
        C14360o3.A0B(c7vc, 0);
        if (c7vc instanceof C160787Im) {
            if (C18U.A06(C06090Tz.A05, this.A00, 36325781122594151L)) {
                C83403nh c83403nh = ((C160787Im) c7vc).A0e;
                C14360o3.A07(c83403nh);
                MoreExecutors.listeningDecorator(new C14140ne(1429850625, 3, false, false)).submit(new CallableC44082Je7(c83403nh, 5));
            }
        }
        return super.A08(c7vc);
    }

    public C45863KRs(UserSession userSession, InterfaceC13640mq interfaceC13640mq, C160737Ih c160737Ih) {
        super(interfaceC13640mq, c160737Ih);
        this.A00 = userSession;
    }
}
