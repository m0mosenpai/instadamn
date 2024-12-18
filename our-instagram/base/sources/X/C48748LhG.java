package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.store.InboxNetworkSource;

/* renamed from: X.LhG, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48748LhG implements MRP {
    public boolean A00;
    public final C2DS A01;
    public final LAH A02;

    @Override // X.MRP
    public final void AV5(AbstractC46972Dl abstractC46972Dl, C4I3 c4i3, String str) {
        C14360o3.A0B(c4i3, 2);
        this.A02.A03(EnumC46220Kcw.A06, c4i3, false);
    }

    @Override // X.MRP
    public final void Che(AbstractC46972Dl abstractC46972Dl, C4I3 c4i3) {
        C14360o3.A0B(c4i3, 1);
        this.A02.A02(EnumC46220Kcw.A06, c4i3);
    }

    @Override // X.MRP
    public final boolean Cnw() {
        return true;
    }

    @Override // X.MRP
    public final void EKd() {
    }

    @Override // X.MRP
    public final void EdV(AbstractC46972Dl abstractC46972Dl) {
    }

    @Override // X.MRP
    public final boolean Eia() {
        return true;
    }

    @Override // X.MRP
    public final void pause() {
    }

    @Override // X.MRP
    public final void start() {
    }

    @Override // X.MRP
    public final void stop() {
    }

    @Override // X.MRP
    public final boolean AFj(AbstractC46972Dl abstractC46972Dl, C4I3 c4i3) {
        InboxNetworkSource inboxNetworkSource = this.A02.A04;
        if (inboxNetworkSource == null) {
            C14360o3.A0F("directCurrentSource");
            throw C00O.createAndThrow();
        }
        return inboxNetworkSource.A03;
    }

    @Override // X.MRP
    public final boolean CLW() {
        return this.A02.A06();
    }

    @Override // X.MRP
    public final boolean CUG() {
        InboxNetworkSource inboxNetworkSource = this.A02.A04;
        if (inboxNetworkSource == null) {
            C14360o3.A0F("directCurrentSource");
            throw C00O.createAndThrow();
        }
        return inboxNetworkSource.A04;
    }

    @Override // X.MRP
    public final boolean isLoading() {
        return this.A02.A06();
    }

    public C48748LhG(UserSession userSession, InterfaceC50423MOd interfaceC50423MOd, C2DS c2ds) {
        this.A01 = c2ds;
        LAH lah = new LAH(userSession);
        this.A02 = lah;
        lah.A05(C2EB.A04);
        lah.A01(new C45388K8b(userSession, this, interfaceC50423MOd, 1));
    }
}
