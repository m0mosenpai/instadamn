package X;

import android.app.Application;
import com.instagram.common.session.UserSession;

/* renamed from: X.JlH, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44449JlH extends C193578hc {
    public final UserSession A00;
    public final KPI A01;
    public final InterfaceC09390do A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C44449JlH(Application application, UserSession userSession, KPI kpi) {
        super(application);
        AbstractC167027dH.A13(application, userSession, kpi);
        this.A00 = userSession;
        this.A01 = kpi;
        this.A02 = C50255MHk.A01(this, EnumC09460dv.A02, 42);
    }
}
