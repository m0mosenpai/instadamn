package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.store.InboxNetworkSource;
import java.util.HashSet;

/* loaded from: classes8.dex */
public final class K8W extends AnonymousClass935 {
    public final /* synthetic */ InboxNetworkSource A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K8W(UserSession userSession, InboxNetworkSource inboxNetworkSource) {
        super(userSession);
        this.A00 = inboxNetworkSource;
    }

    @Override // X.AnonymousClass935
    public final /* bridge */ /* synthetic */ void A03(UserSession userSession, Object obj) {
        int A03 = C0f9.A03(1823298152);
        int A032 = C0f9.A03(1798866416);
        this.A00.A09.A0U(new HashSet(AbstractC166987dD.A1J(C47092Dx.A00)), false, true);
        C0f9.A0A(-1442453988, A032);
        C0f9.A0A(326274030, A03);
    }

    @Override // X.AnonymousClass935
    public final /* bridge */ /* synthetic */ void A06(UserSession userSession, Object obj) {
        int A03 = C0f9.A03(-127353723);
        EBX ebx = (EBX) obj;
        int A0G = AbstractC25231BEo.A0G(ebx, -1884669997);
        InboxNetworkSource inboxNetworkSource = this.A00;
        C2DS c2ds = inboxNetworkSource.A0B;
        boolean z = ebx.A00;
        C2DU c2du = (C2DU) c2ds;
        synchronized (c2du) {
            c2du.A03 = Boolean.valueOf(z);
        }
        inboxNetworkSource.A09.A0U(new HashSet(AbstractC166987dD.A1J(C47092Dx.A00)), ebx.A00, false);
        inboxNetworkSource.A06.E4s(new C129285sq(ebx.A00));
        C0f9.A0A(267995655, A0G);
        C0f9.A0A(584528408, A03);
    }
}
