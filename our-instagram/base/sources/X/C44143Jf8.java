package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.perf.constants.ThreadFetchReason;
import com.instagram.direct.store.InboxNetworkSource;
import java.util.List;

/* renamed from: X.Jf8, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44143Jf8 extends AnonymousClass935 {
    public final /* synthetic */ InboxNetworkSource A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C44143Jf8(UserSession userSession, InboxNetworkSource inboxNetworkSource) {
        super(userSession);
        this.A00 = inboxNetworkSource;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, X.1vN] */
    @Override // X.AnonymousClass935
    public final /* bridge */ /* synthetic */ void A06(UserSession userSession, Object obj) {
        int A03 = C0f9.A03(-1731872400);
        K8J k8j = (K8J) obj;
        int A032 = C0f9.A03(1034367442);
        boolean A1a = AbstractC167017dG.A1a(userSession, k8j);
        List list = k8j.A01;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C43707JUs c43707JUs = ((C47405Kwu) list.get(i)).A00;
            if (c43707JUs != null) {
                C2DS c2ds = this.A00.A0B;
                c2ds.CoS("NetworkTaskCallback");
                c2ds.ELu(c2ds.FBa(c43707JUs, c43707JUs.A0q, c43707JUs, A1a).BKb());
            }
        }
        AbstractC25651Mw.A00(userSession).E4s(new Object());
        for (String str : k8j.A00) {
            ThreadFetchReason threadFetchReason = ThreadFetchReason.BROADCAST_CHANNEL_INBOX_UPDATE;
            C14360o3.A0B(str, A1a ? 1 : 0);
            LL3.A03(userSession, threadFetchReason, null, 20, str, A1a);
        }
        C0f9.A0A(-1061961095, A032);
        C0f9.A0A(1994926609, A03);
    }
}
