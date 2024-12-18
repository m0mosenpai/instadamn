package X;

import com.instagram.common.session.UserSession;
import com.instagram.debug.log.DLog;
import com.instagram.debug.log.tags.DLogTag;

/* renamed from: X.K8d, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45390K8d extends AnonymousClass935 {
    public final C47978LIq A00;
    public final long A01;

    public C45390K8d(UserSession userSession, AnonymousClass776 anonymousClass776, C4KV c4kv, MR6 mr6, long j) {
        super(userSession);
        this.A01 = j;
        this.A00 = new C47978LIq(anonymousClass776, c4kv, mr6, null, false);
    }

    @Override // X.AnonymousClass935
    public final void A02(UserSession userSession) {
        int A03 = C0f9.A03(-456795715);
        C14360o3.A0B(userSession, 0);
        DLog.d(DLogTag.DIRECT_HTTP.INSTANCE, AnonymousClass001.A0Q("fetchThreadbyJid jid=", this.A01), new Object[0]);
        C47978LIq c47978LIq = this.A00;
        C4KV c4kv = c47978LIq.A01;
        if (c4kv != null) {
            c4kv.A05(c47978LIq.A00);
        }
        MR6 mr6 = c47978LIq.A02;
        if (mr6 != null) {
            mr6.onStart();
        }
        C0f9.A0A(-1740094838, A03);
    }

    @Override // X.AnonymousClass935
    public final /* bridge */ /* synthetic */ void A03(UserSession userSession, Object obj) {
        int A03 = C0f9.A03(1218078530);
        InterfaceC40821up interfaceC40821up = (InterfaceC40821up) obj;
        int A032 = C0f9.A03(415238010);
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
        C0f9.A0A(-882349096, A032);
        C0f9.A0A(1464208141, A03);
    }

    @Override // X.AnonymousClass935
    public final void A04(AbstractC115105If abstractC115105If, UserSession userSession) {
        int A03 = C0f9.A03(-2015454330);
        AbstractC167017dG.A1N(userSession, abstractC115105If);
        this.A00.A01(abstractC115105If);
        C0f9.A0A(1523148156, A03);
    }

    @Override // X.AnonymousClass935
    public final /* bridge */ /* synthetic */ void A05(UserSession userSession, Object obj) {
        int A03 = C0f9.A03(-1697807752);
        C43707JUs c43707JUs = (C43707JUs) obj;
        int A032 = C0f9.A03(871139162);
        AbstractC167017dG.A1N(userSession, c43707JUs);
        C47978LIq c47978LIq = this.A00;
        C47978LIq.A00(c43707JUs, c47978LIq);
        MR6 mr6 = c47978LIq.A02;
        if (mr6 != null) {
            mr6.onSuccess(c47978LIq.A05);
        }
        C0f9.A0A(789928093, A032);
        C0f9.A0A(-110526348, A03);
    }

    @Override // X.AnonymousClass935
    public final /* bridge */ /* synthetic */ void A06(UserSession userSession, Object obj) {
        int A03 = C0f9.A03(-1547684985);
        C43707JUs c43707JUs = (C43707JUs) obj;
        int A032 = C0f9.A03(734014793);
        AbstractC167017dG.A1N(userSession, c43707JUs);
        this.A00.A02(userSession, c43707JUs);
        C0f9.A0A(-125791485, A032);
        C0f9.A0A(-881767102, A03);
    }
}
