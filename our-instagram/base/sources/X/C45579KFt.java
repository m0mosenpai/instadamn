package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.KFt, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45579KFt extends AbstractC61132qb {
    public final UserSession A00;
    public final Integer A01;

    public C45579KFt(UserSession userSession, Integer num) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = num;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        return new C44515JmL(this.A00, this.A01);
    }
}
