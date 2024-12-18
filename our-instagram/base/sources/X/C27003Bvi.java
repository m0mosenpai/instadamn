package X;

import com.instagram.common.session.UserSession;
import com.instagram.schools.management.data.SchoolSettingsRepository;

/* renamed from: X.Bvi, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27003Bvi extends AbstractC61132qb {
    public final UserSession A00;

    public C27003Bvi(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        return new C25829Bbk(SchoolSettingsRepository.A01(this.A00));
    }
}
