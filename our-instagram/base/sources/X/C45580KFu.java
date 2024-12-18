package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.KFu, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45580KFu extends AbstractC61132qb {
    public final UserSession A00;
    public final Integer A01;

    public C45580KFu(UserSession userSession, Integer num) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = num;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        return new C44474Jlg(this.A00, this.A01);
    }
}
