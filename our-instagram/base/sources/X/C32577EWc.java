package X;

import com.instagram.common.session.UserSession;
import com.instagram.fanclub.api.FanClubApi;
import com.instagram.fanclub.promovideo.FanClubPromoAndWelcomeVideoApi;
import com.instagram.pendingmedia.store.PendingMediaStore;

/* renamed from: X.EWc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32577EWc extends AbstractC61132qb {
    public final UserSession A00;
    public final boolean A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;

    public C32577EWc(UserSession userSession, boolean z, boolean z2, boolean z3, boolean z4) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
        this.A02 = z;
        this.A03 = z2;
        this.A01 = z3;
        this.A04 = z4;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        EnumC31515Dsz enumC31515Dsz;
        boolean z = this.A02;
        boolean z2 = this.A03;
        if (z) {
            if (!z2) {
                enumC31515Dsz = EnumC31515Dsz.A05;
            } else {
                throw AbstractC166987dD.A12(AbstractC111324zv.A00(23));
            }
        } else {
            enumC31515Dsz = EnumC31515Dsz.A06;
        }
        UserSession userSession = this.A00;
        boolean z3 = this.A01;
        boolean z4 = this.A04;
        PendingMediaStore A00 = C25A.A00(userSession);
        EnumC31515Dsz enumC31515Dsz2 = enumC31515Dsz;
        FanClubPromoAndWelcomeVideoApi fanClubPromoAndWelcomeVideoApi = new FanClubPromoAndWelcomeVideoApi(enumC31515Dsz2, userSession, AbstractC99684dl.A00(userSession), new FanClubApi(userSession), C08730cb.A00(userSession));
        return new C44536Jmg(enumC31515Dsz, C12L.A00, AbstractC25651Mw.A00(userSession), userSession, FVI.A00(), fanClubPromoAndWelcomeVideoApi, A00, z3, z4);
    }
}
