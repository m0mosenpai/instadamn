package X;

import android.app.Application;
import com.instagram.common.session.UserSession;
import com.instagram.schools.tab.data.SchoolTabDataSource;
import com.instagram.user.follow.mvvm.data.FollowUserDataSourceImpl;

/* renamed from: X.NCf, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52290NCf extends AbstractC61132qb {
    public final Application A00;
    public final UserSession A01;
    public final String A02;

    public C52290NCf(Application application, UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = application;
        this.A02 = "schooltab_fragment";
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        UserSession userSession = this.A01;
        Application application = this.A00;
        C166257bu c166257bu = new C166257bu(userSession, new FollowUserDataSourceImpl(userSession, new C15750qV(application), C167997eu.A00(application, userSession, this.A02)), new C166237bs());
        C25671My A00 = AbstractC25651Mw.A00(userSession);
        C14360o3.A0B(userSession, 0);
        return new C51015MgN(A00, userSession, new NSQ(new SchoolTabDataSource(userSession)), c166257bu);
    }
}
