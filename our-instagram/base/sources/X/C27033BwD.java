package X;

import com.instagram.common.session.UserSession;
import com.instagram.wonderwall.model.WallPostItem;

/* renamed from: X.BwD, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27033BwD extends AbstractC61132qb {
    public final UserSession A00;
    public final WallPostItem A01;
    public final boolean A02;

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        return new C25884Bck(this.A00, this.A01, this.A02);
    }

    public C27033BwD(UserSession userSession, WallPostItem wallPostItem, boolean z) {
        AbstractC167017dG.A1P(userSession, wallPostItem);
        this.A00 = userSession;
        this.A01 = wallPostItem;
        this.A02 = z;
    }
}
