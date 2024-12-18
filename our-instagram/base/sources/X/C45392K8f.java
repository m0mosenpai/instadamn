package X;

import com.instagram.common.session.UserSession;
import com.instagram.debug.log.DLog;
import com.instagram.debug.log.tags.DLogTag;
import java.util.List;

/* renamed from: X.K8f, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45392K8f extends AnonymousClass935 {
    public final C47978LIq A00;
    public final String A01;
    public final List A02;

    public C45392K8f(UserSession userSession, AnonymousClass776 anonymousClass776, C4KV c4kv, MR6 mr6, Integer num, String str, List list, boolean z) {
        super(userSession);
        this.A01 = str;
        this.A02 = list;
        this.A00 = new C47978LIq(anonymousClass776, c4kv, mr6, num, z);
    }

    @Override // X.AnonymousClass935
    public final void A02(UserSession userSession) {
        Object[] objArr;
        String str;
        int A0N = AbstractC167017dG.A0N(userSession, -855480200);
        String str2 = this.A01;
        DLogTag.DIRECT_HTTP direct_http = DLogTag.DIRECT_HTTP.INSTANCE;
        if (str2 != null) {
            objArr = new Object[]{str2};
            str = "fetchThread id=%s";
        } else {
            objArr = new Object[]{this.A02};
            str = "fetchByRecipients id=%s";
        }
        DLog.d(direct_http, str, objArr);
        C47978LIq c47978LIq = this.A00;
        C4KV c4kv = c47978LIq.A01;
        if (c4kv != null) {
            c4kv.A05(c47978LIq.A00);
        }
        MR6 mr6 = c47978LIq.A02;
        if (mr6 != null) {
            mr6.onStart();
        }
        C0f9.A0A(725112557, A0N);
    }

    @Override // X.AnonymousClass935
    public final /* bridge */ /* synthetic */ void A03(UserSession userSession, Object obj) {
        int A03 = C0f9.A03(1853144577);
        InterfaceC40821up interfaceC40821up = (InterfaceC40821up) obj;
        int A032 = C0f9.A03(-1977024374);
        C14360o3.A0B(userSession, 0);
        C47978LIq c47978LIq = this.A00;
        C4KV c4kv = c47978LIq.A01;
        if (c4kv != null) {
            c4kv.A0D(c47978LIq.A00, false, false);
        }
        MR6 mr6 = c47978LIq.A02;
        if (mr6 != null) {
            mr6.onFailureInBackground(interfaceC40821up);
        }
        C0f9.A0A(-1457799779, A032);
        C0f9.A0A(-1286755521, A03);
    }

    @Override // X.AnonymousClass935
    public final void A04(AbstractC115105If abstractC115105If, UserSession userSession) {
        int A03 = C0f9.A03(-122052962);
        AbstractC167017dG.A1N(userSession, abstractC115105If);
        this.A00.A01(abstractC115105If);
        C0f9.A0A(991783904, A03);
    }

    @Override // X.AnonymousClass935
    public final /* bridge */ /* synthetic */ void A05(UserSession userSession, Object obj) {
        int A03 = C0f9.A03(-132525023);
        C1574875f c1574875f = (C1574875f) obj;
        int A032 = C0f9.A03(-561850687);
        AbstractC167017dG.A1N(userSession, c1574875f);
        C47978LIq c47978LIq = this.A00;
        C47978LIq.A00(c1574875f.A02, c47978LIq);
        MR6 mr6 = c47978LIq.A02;
        if (mr6 != null) {
            mr6.onSuccess(c47978LIq.A05);
        }
        C0f9.A0A(1868897930, A032);
        C0f9.A0A(1595922237, A03);
    }

    @Override // X.AnonymousClass935
    public final /* bridge */ /* synthetic */ void A06(UserSession userSession, Object obj) {
        int A03 = C0f9.A03(914989532);
        C1574875f c1574875f = (C1574875f) obj;
        int A032 = C0f9.A03(693250840);
        AbstractC167017dG.A1N(userSession, c1574875f);
        this.A00.A02(userSession, c1574875f.A02);
        C0f9.A0A(-1323103755, A032);
        C0f9.A0A(451300487, A03);
    }
}
