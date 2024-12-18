package X;

import com.instagram.common.session.UserSession;
import com.instagram.friendmap.configs.FriendMapLaunchConfig;

/* renamed from: X.KGc, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45588KGc extends AbstractC61132qb {
    public final UserSession A00;
    public final LLR A01;
    public final FriendMapLaunchConfig A02;
    public final LJ4 A03;

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        UserSession userSession = this.A00;
        return new C45999KXn(userSession, this.A01, this.A02, AbstractC92954Eo.A00(userSession), this.A03);
    }

    public C45588KGc(UserSession userSession, LLR llr, FriendMapLaunchConfig friendMapLaunchConfig, LJ4 lj4) {
        AbstractC167017dG.A1Q(userSession, llr);
        this.A00 = userSession;
        this.A03 = lj4;
        this.A01 = llr;
        this.A02 = friendMapLaunchConfig;
    }
}
