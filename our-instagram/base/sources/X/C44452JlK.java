package X;

import android.app.Application;
import com.instagram.common.session.UserSession;
import com.instagram.fanclub.api.FanClubApi;

/* renamed from: X.JlK, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44452JlK extends C193578hc {
    public final UserSession A00;
    public final C99694dm A01;
    public final FanClubApi A02;
    public final InterfaceC19390xP A03;
    public final C05A A04;
    public final C05A A05;
    public final C05A A06;
    public final C05A A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C44452JlK(Application application, UserSession userSession) {
        super(application);
        FanClubApi fanClubApi = new FanClubApi(userSession);
        boolean A1V = AbstractC167007dF.A1V(userSession);
        this.A00 = userSession;
        this.A02 = fanClubApi;
        this.A01 = AbstractC99684dl.A00(userSession);
        C16930sl c16930sl = C16930sl.A00;
        C008002u A00 = C10E.A00(c16930sl);
        this.A05 = A00;
        C008002u A002 = C10E.A00(c16930sl);
        this.A04 = A002;
        Boolean valueOf = Boolean.valueOf(A1V);
        C008002u A1H = AbstractC25225BEi.A1H(valueOf);
        this.A07 = A1H;
        C008002u A1H2 = AbstractC25225BEi.A1H(valueOf);
        this.A06 = A1H2;
        this.A03 = new C43818JZg(26, new InterfaceC19390xP[]{A00, A002, A1H2, A1H}, this);
    }
}
