package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;

/* renamed from: X.Blc, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26393Blc extends AbstractC51572Yf {
    public final UserSession A00;
    public final CQZ A01;
    public final InterfaceC60442pS A02;
    public final C685736u A03;

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        C14360o3.A0B(c76223bS, 0);
        C51755Mte c51755Mte = (C51755Mte) AbstractC25525BQn.A00(c76223bS, this.A01.A00);
        if (C51755Mte.A00(c51755Mte, 23)) {
            C2XE c2xe = c76223bS.A05;
            ArrayList A1E = AbstractC166987dD.A1E();
            C14360o3.A0B(c2xe, 1);
            A1E.add(new C78003eS(null, null, C51722Yv.A02, null, C78003eS.A0C, null, "[Internal] AI Consumption unit native media grid", null, null, null, null, null));
            C38688GzT c38688GzT = (C38688GzT) c51755Mte.A00;
            C51755Mte c51755Mte2 = (C51755Mte) c38688GzT.A00;
            C51755Mte c51755Mte3 = (C51755Mte) c38688GzT.A02;
            C685736u c685736u = this.A03;
            long j = AbstractC27768CMj.A00;
            A1E.add(new C26394Bld(c51755Mte2, c51755Mte3, C9CU.A00(null, C05F.A0G, 0, j), c685736u));
            A1E.add(new C26394Bld((C51755Mte) c38688GzT.A03, (C51755Mte) c38688GzT.A01, AbstractC25234BEr.A0E(null, AbstractC25225BEi.A0n(C05F.A0E, 0, j), 0, j), c685736u));
            return new C2WF(null, null, null, A1E, false);
        }
        throw B4Z.A00();
    }

    public C26393Blc(UserSession userSession, CQZ cqz, InterfaceC60442pS interfaceC60442pS, C685736u c685736u) {
        AbstractC167017dG.A1Q(userSession, cqz);
        this.A00 = userSession;
        this.A02 = interfaceC60442pS;
        this.A01 = cqz;
        this.A03 = c685736u;
    }
}
