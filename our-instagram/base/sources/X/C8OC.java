package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.8OC, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8OC extends AbstractC61132qb {
    public final int A00;
    public final UserSession A01;
    public final boolean A02;

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        return new C8OD(this.A01, this.A02, this.A00);
    }

    public C8OC(UserSession userSession, boolean z, int i) {
        this.A02 = z;
        this.A00 = i;
        this.A01 = userSession;
    }
}
