package X;

import com.facebook.xanalytics.XAnalyticsAdapterHolder;
import com.facebook.xanalytics.XAnalyticsHolder;
import com.instagram.common.session.UserSession;

/* renamed from: X.Oq5, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55795Oq5 implements C1K4 {
    public final /* synthetic */ UserSession A00;

    public C55795Oq5(UserSession userSession) {
        this.A00 = userSession;
    }

    @Override // X.C1K4
    public final XAnalyticsHolder CI3() {
        XAnalyticsAdapterHolder xAnalyticsAdapterHolder = XAnalyticsAdapterHolder.$redex_init_class;
        return new XAnalyticsAdapterHolder(new C12250kT(null, this.A00, "IGRTCEngine"));
    }
}
