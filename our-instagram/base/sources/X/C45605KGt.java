package X;

import android.app.Activity;
import android.app.Application;
import com.instagram.appreciation.analytics.LoggingFanData;
import com.instagram.appreciation.funding.AppreciationBuyAndSendViewModel;
import com.instagram.appreciation.gifting.repository.AppreciationGiftingDataSource;
import com.instagram.common.session.UserSession;

/* renamed from: X.KGt, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45605KGt extends AbstractC61132qb {
    public final int A00;
    public final int A01;
    public final Activity A02;
    public final LoggingFanData A03;
    public final InterfaceC11380iw A04;
    public final UserSession A05;
    public final String A06;
    public final String A07;

    public C45605KGt(Activity activity, LoggingFanData loggingFanData, InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str, String str2, int i, int i2) {
        AbstractC25233BEq.A0w(2, userSession, loggingFanData, str);
        C14360o3.A0B(str2, 7);
        this.A02 = activity;
        this.A05 = userSession;
        this.A03 = loggingFanData;
        this.A06 = str;
        this.A00 = i;
        this.A01 = i2;
        this.A07 = str2;
        this.A04 = interfaceC11380iw;
    }

    /* JADX WARN: Type inference failed for: r8v0, types: [X.LAw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v0, types: [X.Kjk, java.lang.Object] */
    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        Activity activity = this.A02;
        Application application = activity.getApplication();
        C14360o3.A07(application);
        String str = this.A06;
        int i = this.A00;
        int i2 = this.A01;
        String str2 = this.A07;
        UserSession userSession = this.A05;
        LoggingFanData loggingFanData = this.A03;
        L97 l97 = new L97(userSession, activity, loggingFanData.A03);
        AppreciationGiftingDataSource appreciationGiftingDataSource = new AppreciationGiftingDataSource(userSession);
        C14360o3.A0B(userSession, 0);
        Ld3 ld3 = (Ld3) userSession.A01(Ld3.class, new C29897DGl(35, l97, appreciationGiftingDataSource));
        return new AppreciationBuyAndSendViewModel(application, new LJB(loggingFanData, this.A04, userSession), new Object(), new Object(), ld3, str, str2, i, i2);
    }
}
