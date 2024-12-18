package X;

import android.app.Activity;
import android.app.Application;
import com.instagram.appreciation.analytics.LoggingFanData;
import com.instagram.appreciation.funding.AppreciationFundingViewModel;
import com.instagram.common.session.UserSession;

/* renamed from: X.KGe, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45590KGe extends AbstractC61132qb {
    public final int A00;
    public final Activity A01;
    public final LoggingFanData A02;
    public final InterfaceC11380iw A03;
    public final UserSession A04;

    /* JADX WARN: Type inference failed for: r10v0, types: [X.LAx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0, types: [X.LAw, java.lang.Object] */
    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        Activity activity = this.A01;
        Application application = activity.getApplication();
        C14360o3.A07(application);
        int i = this.A00;
        LoggingFanData loggingFanData = this.A02;
        String str = loggingFanData.A03;
        UserSession userSession = this.A04;
        L97 l97 = new L97(userSession, activity, str);
        Object obj = new Object();
        C14360o3.A0B(userSession, 0);
        Ld1 ld1 = (Ld1) userSession.A01(Ld1.class, new C29897DGl(36, l97, obj));
        ?? obj2 = new Object();
        return new AppreciationFundingViewModel(application, new LJB(loggingFanData, this.A03, userSession), new Object(), C27S.A00().A00(userSession), obj2, ld1, LHp.A00, str, i);
    }

    public C45590KGe(Activity activity, LoggingFanData loggingFanData, InterfaceC11380iw interfaceC11380iw, UserSession userSession, int i) {
        AbstractC37302Gc3.A1U(userSession, loggingFanData);
        this.A00 = i;
        this.A01 = activity;
        this.A04 = userSession;
        this.A02 = loggingFanData;
        this.A03 = interfaceC11380iw;
    }
}
