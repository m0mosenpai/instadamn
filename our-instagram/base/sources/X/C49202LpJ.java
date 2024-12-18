package X;

import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mci.Execution;
import com.instagram.common.session.UserSession;

/* renamed from: X.LpJ, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49202LpJ implements InterfaceC1352169w {
    public C132615yk A00;
    public C48524LdM A01;

    @Override // X.InterfaceC1352169w
    public final /* bridge */ /* synthetic */ void EgM(Object obj) {
        C1351969u c1351969u = (C1351969u) obj;
        C14360o3.A0B(c1351969u, 0);
        C42201xA c42201xA = C1334460n.A06;
        Mailbox mailbox = c1351969u.A01;
        C132615yk c132615yk = new C132615yk(mailbox);
        this.A00 = c132615yk;
        C218914p.A05(c132615yk.A03);
        UserSession userSession = c1351969u.A02;
        C48524LdM c48524LdM = (C48524LdM) userSession.A01(C48524LdM.class, MHJ.A00(userSession, 26));
        this.A01 = c48524LdM;
        if (c48524LdM != null) {
            if (c48524LdM.integrator == null) {
                Execution.executeAsync(new K4V(mailbox, c48524LdM), null, 1);
                return;
            }
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.InterfaceC1352169w
    public final void Epz() {
        C42201xA c42201xA = C1334460n.A06;
        C48524LdM c48524LdM = this.A01;
        if (c48524LdM != null) {
            c48524LdM.integrator = null;
            C132615yk c132615yk = this.A00;
            if (c132615yk != null) {
                C218914p.A06(c132615yk.A03);
                return;
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }
}
