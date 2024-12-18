package X;

import android.os.Handler;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.EZu, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32670EZu extends AbstractRunnableC14200nk {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ C1VJ A01;
    public final /* synthetic */ User A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32670EZu(UserSession userSession, C1VJ c1vj, User user, String str, String str2, String str3, String str4) {
        super(151, 4, true, true);
        this.A00 = userSession;
        this.A06 = str;
        this.A03 = str2;
        this.A01 = c1vj;
        this.A02 = user;
        this.A05 = str3;
        this.A04 = str4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j;
        Long A0j;
        UserSession userSession = this.A00;
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A02(userSession), "igauthhelper_forced_logout");
        A0f.AAP("reason", "login_required_response_from_server");
        String str = this.A06;
        if (str != null && (A0j = AbstractC166997dE.A0j(str)) != null) {
            j = A0j.longValue();
        } else {
            j = 0;
        }
        A0f.A9K("reason_code", Long.valueOf(j));
        String str2 = this.A03;
        A0f.AAP("request", str2);
        A0f.Cht();
        C1VJ c1vj = this.A01;
        Handler handler = c1vj.A00;
        if (handler != null) {
            handler.postDelayed(new GR2(userSession, c1vj, this.A02, this.A05, this.A04, str, str2), 1000L);
        }
    }
}
