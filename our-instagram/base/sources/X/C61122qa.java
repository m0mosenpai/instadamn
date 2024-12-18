package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.2qa, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C61122qa extends AbstractC61132qb {
    public final UserSession A00;

    public C61122qa(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        return new C61142qc(this.A00);
    }
}
