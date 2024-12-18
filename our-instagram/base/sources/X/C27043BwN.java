package X;

import com.instagram.common.session.UserSession;
import com.instagram.wonderwall.model.WallInfo;
import com.instagram.wonderwall.model.WallPostItem;
import com.instagram.wonderwall.repository.WallPendingPostManager;
import com.instagram.wonderwall.repository.WallPostComposerRepository;

/* renamed from: X.BwN, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27043BwN extends AbstractC61132qb {
    public final UserSession A00;
    public final WallInfo A01;
    public final WallPostItem A02;
    public final String A03;

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        C26234Biy c26234Biy;
        String str;
        WallInfo wallInfo = this.A01;
        UserSession userSession = this.A00;
        String str2 = this.A03;
        boolean A1W = AbstractC167007dF.A1W(str2);
        WallPostItem wallPostItem = this.A02;
        AbstractC167017dG.A1N(userSession, wallInfo);
        WallPendingPostManager A00 = CZ2.A00(userSession);
        C38321qM A0h = AbstractC25229BEm.A0h(userSession, str2);
        if (A0h != null) {
            String id = A0h.getId();
            if (id == null) {
                id = "";
            }
            c26234Biy = new C26234Biy(A0h.A09, A0h, id);
        } else {
            c26234Biy = null;
        }
        if (wallPostItem == null || (str = AnonymousClass001.A0E(wallPostItem.Bez().A03.getUsername(), '@', ' ')) == null) {
            str = "";
        }
        return new C25868BcP(userSession, wallInfo, new WallPostComposerRepository(userSession, c26234Biy, wallInfo, A00, str), A1W);
    }

    public C27043BwN(UserSession userSession, WallInfo wallInfo, WallPostItem wallPostItem, String str) {
        AbstractC167017dG.A1P(userSession, wallInfo);
        this.A00 = userSession;
        this.A01 = wallInfo;
        this.A02 = wallPostItem;
        this.A03 = str;
    }
}
