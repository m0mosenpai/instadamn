package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.store.InboxNetworkSource;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.LXo, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48265LXo implements InterfaceC24551Hy {
    public final UserSession A01;
    public final C45393K8g A02;
    public final String A03;
    public final /* synthetic */ InboxNetworkSource A05;
    public final Map A04 = AbstractC166987dD.A1G();
    public boolean A00 = true;

    private final C99Z A00(K7u k7u) {
        C99Z c99z;
        synchronized (k7u) {
            Map map = this.A04;
            c99z = (C99Z) map.get(k7u);
            if (c99z == null) {
                C07880b8 c07880b8 = C07950bF.A04;
                UserSession userSession = this.A01;
                C47239KuC c47239KuC = k7u.A00;
                if (c47239KuC == null) {
                    AbstractC31171DnF.A0w();
                    throw C00O.createAndThrow();
                }
                c99z = C2057899d.parseFromJson(c07880b8.A01(userSession, c47239KuC.A00));
                map.put(k7u, c99z);
                C14360o3.A0A(c99z);
            } else {
                map.remove(k7u);
            }
        }
        return c99z;
    }

    @Override // X.InterfaceC24551Hy
    public final /* synthetic */ void DVR() {
    }

    public C48265LXo(UserSession userSession, C45393K8g c45393K8g, InboxNetworkSource inboxNetworkSource, String str) {
        this.A05 = inboxNetworkSource;
        this.A01 = userSession;
        this.A02 = c45393K8g;
        this.A03 = str;
    }

    @Override // X.InterfaceC24551Hy
    public final void DFq(AbstractC115105If abstractC115105If, InterfaceC26451Qa interfaceC26451Qa) {
        this.A02.A04(C7J2.A00(), this.A01);
    }

    @Override // X.InterfaceC24551Hy
    public final /* bridge */ /* synthetic */ void DVQ(InterfaceC40801un interfaceC40801un, InterfaceC26451Qa interfaceC26451Qa, C3JX c3jx) {
        K7u k7u = (K7u) interfaceC40801un;
        C14360o3.A0B(k7u, 2);
        try {
            this.A02.A07(this.A01, A00(k7u));
        } catch (IOException e) {
            C0K8.A0F("PendingInboxStreamingApiCallback", "onNewData", e);
            this.A02.A04(C7J2.A00(), this.A01);
        }
    }

    @Override // X.InterfaceC24551Hy
    public final /* bridge */ /* synthetic */ void DVS(InterfaceC40801un interfaceC40801un, InterfaceC26451Qa interfaceC26451Qa, C3JX c3jx) {
        K7u k7u = (K7u) interfaceC40801un;
        C14360o3.A0B(k7u, 2);
        try {
            C99Z A00 = A00(k7u);
            UserSession userSession = this.A01;
            if (C18U.A06(C06090Tz.A05, userSession, 36323397415873738L)) {
                AbstractC207749He.A00().A00(userSession).A01(userSession, null, A00, this.A03);
            }
            InboxNetworkSource inboxNetworkSource = this.A05;
            Iterator it = inboxNetworkSource.A0C.iterator();
            while (it.hasNext()) {
                ((C1P1) it.next()).onSuccessInBackground(A00);
            }
            inboxNetworkSource.A09.A0O(inboxNetworkSource.A08, A00, inboxNetworkSource.A0A, C4I3.A03, this.A00);
            this.A00 = false;
        } catch (IOException e) {
            C0K8.A0F("PendingInboxStreamingApiCallback", "onNewDataInBackground", e);
        }
    }

    @Override // X.InterfaceC24551Hy
    public final void Dg4() {
        this.A02.A01(this.A01);
    }

    @Override // X.InterfaceC24551Hy
    public final void DgK() {
        this.A02.A02(this.A01);
    }

    @Override // X.InterfaceC24551Hy
    public final void D6Z(InterfaceC26451Qa interfaceC26451Qa, C3JX c3jx) {
    }

    @Override // X.InterfaceC24551Hy
    public final void DFs(AbstractC115105If abstractC115105If, InterfaceC26451Qa interfaceC26451Qa) {
    }

    @Override // X.InterfaceC24551Hy
    public final void Dgo(InterfaceC26451Qa interfaceC26451Qa, C3JX c3jx) {
    }
}
