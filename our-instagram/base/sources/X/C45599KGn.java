package X;

import android.app.Activity;
import com.instagram.appreciation.analytics.LoggingFanData;
import com.instagram.appreciation.gifting.repository.AppreciationGiftingDataSource;
import com.instagram.appreciation.gifting.repository.AppreciationGiftingRepository;
import com.instagram.common.session.UserSession;

/* renamed from: X.KGn, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45599KGn extends AbstractC61132qb {
    public final Activity A00;
    public final InterfaceC11380iw A01;
    public final UserSession A02;
    public final String A03;
    public final String A04;
    public final String A05;

    public C45599KGn(Activity activity, InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str, String str2, String str3) {
        AbstractC167027dH.A0a(1, userSession, str, str2, str3);
        this.A02 = userSession;
        this.A05 = str;
        this.A03 = str2;
        this.A04 = str3;
        this.A01 = interfaceC11380iw;
        this.A00 = activity;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.Kjq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0, types: [X.Kjo, java.lang.Object] */
    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        String A02 = AbstractC58442PvL.A02();
        UserSession userSession = this.A02;
        AppreciationGiftingRepository appreciationGiftingRepository = new AppreciationGiftingRepository(new AppreciationGiftingDataSource(userSession), new Object(), A02, AbstractC167017dG.A0j());
        ?? obj = new Object();
        LJ7 lj7 = new LJ7(new LoggingFanData(A02, this.A05, this.A03, this.A04), this.A01, userSession);
        C47740L6e c47740L6e = new C47740L6e(C006802i.A0p);
        L97 l97 = new L97(userSession, this.A00, A02);
        C14360o3.A0B(userSession, 0);
        return new C44552Jmy(lj7, c47740L6e, (C48504Lcv) userSession.A01(C48504Lcv.class, C50250MHf.A01(l97, 18)), obj, appreciationGiftingRepository);
    }
}
