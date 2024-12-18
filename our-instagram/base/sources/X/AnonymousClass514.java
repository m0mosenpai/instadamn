package X;

import com.instagram.common.session.UserSession;
import java.util.UUID;

/* renamed from: X.514, reason: invalid class name */
/* loaded from: classes3.dex */
public final class AnonymousClass514 extends AbstractRunnableC14200nk {
    public final /* synthetic */ InterfaceC1116050z A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ C36981nv A02;
    public final /* synthetic */ Integer A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnonymousClass514(InterfaceC1116050z interfaceC1116050z, UserSession userSession, C36981nv c36981nv, Integer num) {
        super(589, 3, false, false);
        this.A03 = num;
        this.A02 = c36981nv;
        this.A01 = userSession;
        this.A00 = interfaceC1116050z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (C218914p.A08()) {
            Integer num = this.A03;
            if (num == C05F.A00) {
                C36981nv c36981nv = this.A02;
                UserSession userSession = this.A01;
                C93W c93w = new C93W(userSession, c36981nv.A00);
                C1ON A01 = c93w.A01(userSession, UUID.randomUUID().toString());
                C1ON A00 = c93w.A00(userSession);
                C1P3.A00(C1P2.A00(userSession), C207869Hs.A00, null, new V3Y(userSession, c36981nv), A01, A00, "explore_prefetch", C36981nv.A03, true, true);
                return;
            }
            if (num != C05F.A01) {
                return;
            }
            C36981nv c36981nv2 = this.A02;
            UserSession userSession2 = this.A01;
            InterfaceC1116050z interfaceC1116050z = this.A00;
            if (C18U.A06(C06090Tz.A05, userSession2, 36315142488722487L)) {
                C67943V3i c67943V3i = new C67943V3i(interfaceC1116050z, userSession2, c36981nv2);
                A2G.A00(c36981nv2.A00, userSession2).A01(c67943V3i, AbstractC202778xv.A00(), C93X.A00(C05F.A0j));
                return;
            }
            C67944V3j c67944V3j = new C67944V3j(interfaceC1116050z, userSession2, c36981nv2);
            C1P3 A002 = C1P2.A00(userSession2);
            C207869Hs c207869Hs = C207869Hs.A00;
            C2044593e c2044593e = new C2044593e(userSession2);
            c2044593e.A08 = C93X.A00(C05F.A0j).A06;
            c2044593e.A0A = UUID.randomUUID().toString();
            c2044593e.A0I = true;
            c2044593e.A0H = false;
            c2044593e.A01 = c36981nv2.A00;
            C1P3.A00(A002, c207869Hs, null, c67944V3j, c2044593e.A02(null), null, "explore_prefetch", 21600L, true, false);
            return;
        }
        InterfaceC1116050z interfaceC1116050z2 = this.A00;
        if (interfaceC1116050z2 == null) {
            return;
        }
        interfaceC1116050z2.AVi("explore_popular_background_prefetch");
    }
}
