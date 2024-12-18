package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.ESr, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32491ESr extends C1P1 {
    public final /* synthetic */ C33623EtZ A00;

    public C32491ESr(C33623EtZ c33623EtZ) {
        this.A00 = c33623EtZ;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A03 = C0f9.A03(-1571565771);
        C9GR.A08(this.A00.A01, 2131962075, 0);
        C0f9.A0A(-1112237237, A03);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, X.1vN] */
    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C0f9.A03(1131793410);
        C32186ECh c32186ECh = (C32186ECh) obj;
        int A032 = C0f9.A03(-1282762359);
        C33623EtZ c33623EtZ = this.A00;
        AbstractC12990ll abstractC12990ll = c33623EtZ.A02;
        if (abstractC12990ll instanceof UserSession) {
            UserSession userSession = (UserSession) abstractC12990ll;
            User A10 = AbstractC166987dD.A10(userSession);
            A10.A0Y();
            AbstractC31172DnG.A1R(userSession, A10);
            AbstractC25651Mw.A00(userSession).E4s(new Object());
        }
        c33623EtZ.A00.post(new GOU(AbstractC31181DnP.A0C(c32186ECh.A01, c32186ECh.A00), this));
        C0f9.A0A(-690971758, A032);
        C0f9.A0A(-1142724741, A03);
    }
}
