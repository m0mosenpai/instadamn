package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.JmP, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44519JmP extends AbstractC52922bZ {
    public final LFi A00;
    public final InterfaceC83713oG A01;
    public final C05A A02;
    public final UserSession A03;
    public final C2EC A04;

    public C44519JmP(UserSession userSession, C2EC c2ec, InterfaceC83713oG interfaceC83713oG) {
        AbstractC167017dG.A1P(userSession, interfaceC83713oG);
        this.A03 = userSession;
        this.A01 = interfaceC83713oG;
        this.A04 = c2ec;
        this.A02 = C10E.A00(KX3.A00);
        this.A00 = new LFi(userSession);
    }

    public final void A00() {
        Map A00 = C98S.A00();
        ArrayList A17 = AbstractC25225BEi.A17(A00.size());
        Iterator A15 = AbstractC166997dE.A15(A00);
        while (A15.hasNext()) {
            Map.Entry A1K = AbstractC166987dD.A1K(A15);
            int A0H = AbstractC166987dD.A0H(A1K.getKey());
            A17.add(new C45210Jzq(this.A00.A01(this.A01, AbstractC166987dD.A0H(A1K.getKey())), ((C98U) A1K.getValue()).A01, A0H, C98S.A01(this.A03, this.A04, (C98U) A1K.getValue())));
        }
        this.A02.Egh(new KX2(A17));
    }
}
