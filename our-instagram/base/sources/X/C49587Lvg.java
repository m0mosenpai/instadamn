package X;

import com.facebook.msys.mca.MailboxFeature;
import com.instagram.common.session.UserSession;
import java.util.HashMap;

/* renamed from: X.Lvg, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49587Lvg implements C0JG {
    public final C116155Nu A00;
    public final InterfaceC16660sJ A01;

    public C49587Lvg(C116155Nu c116155Nu, InterfaceC16660sJ interfaceC16660sJ) {
        C14360o3.A0B(interfaceC16660sJ, 2);
        this.A00 = c116155Nu;
        this.A01 = interfaceC16660sJ;
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [X.5tM, com.facebook.msys.mca.MailboxFeature] */
    @Override // X.C0JG
    public final void ATM(UserSession userSession, InterfaceC03960Jm interfaceC03960Jm) {
        Object obj;
        Integer num;
        boolean A1R = AbstractC167007dF.A1R(0, userSession, interfaceC03960Jm);
        if (AbstractC47132Ef.A00(userSession).A02()) {
            C60J.A00(userSession).A09(false);
            C116155Nu c116155Nu = this.A00;
            MRU A00 = JQX.A00(c116155Nu.A0j);
            Long l = c116155Nu.A0K;
            C14360o3.A07(l);
            A00.Cn5("handle_armadillo_push_operation", l.longValue());
            HashMap A01 = LCJ.A01(c116155Nu);
            if (AbstractC166987dD.A1a(AbstractC31172DnG.A0y(AbstractC47132Ef.A00(userSession).A1F)) && !c116155Nu.A1M && !c116155Nu.A1Q && !c116155Nu.A1P) {
                if (A01 != null) {
                    obj = A01.get("notify");
                } else {
                    obj = null;
                }
                if (!C14360o3.A0K(obj, "0") && (num = c116155Nu.A0I) != null && num.intValue() == A1R) {
                    this.A01.invoke(c116155Nu);
                }
            }
            C14360o3.A0A(new MailboxFeature(JVC.A00.A00(userSession)).A00(new LUR(4, interfaceC03960Jm, userSession, A01, this), A01));
            return;
        }
        interfaceC03960Jm.AIn(null);
        C116155Nu c116155Nu2 = this.A00;
        MRU A002 = JQX.A00(c116155Nu2.A0j);
        Long l2 = c116155Nu2.A0K;
        C14360o3.A07(l2);
        A002.DW6(l2.longValue());
    }
}
