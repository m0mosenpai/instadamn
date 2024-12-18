package X;

import com.facebook.xanalytics.XAnalyticsAdapterHolder;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class O6A {
    public final XAnalyticsAdapterHolder A00;

    public O6A(UserSession userSession) {
        XAnalyticsAdapterHolder xAnalyticsAdapterHolder = XAnalyticsAdapterHolder.$redex_init_class;
        this.A00 = new XAnalyticsAdapterHolder(new T2D(userSession));
    }
}
