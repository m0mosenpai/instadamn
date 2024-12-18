package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.EVz, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32574EVz extends AbstractC61132qb {
    public final UserSession A00;

    public C32574EVz(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.instagram.settings.common.birthday.repository.BirthdayCenterRepository, java.lang.Object] */
    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        return new C50937Mf6(this.A00, new Object());
    }
}
