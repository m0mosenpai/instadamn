package X;

import com.instagram.common.session.UserSession;
import com.instagram.schools.management.data.SchoolSettingsRepository;

/* renamed from: X.Bw0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27021Bw0 extends AbstractC61132qb {
    public final UserSession A00;
    public final SchoolSettingsRepository A01;

    public C27021Bw0(UserSession userSession, SchoolSettingsRepository schoolSettingsRepository) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = schoolSettingsRepository;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        UserSession userSession = this.A00;
        SchoolSettingsRepository schoolSettingsRepository = this.A01;
        if (schoolSettingsRepository == null) {
            schoolSettingsRepository = SchoolSettingsRepository.A01(userSession);
        }
        return new C25856BcB(userSession, schoolSettingsRepository);
    }
}
