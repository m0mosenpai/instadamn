package X;

import com.instagram.common.session.UserSession;
import com.instagram.share.facebook.upsell.data.CLNoticeRepository;

/* loaded from: classes9.dex */
public final class ND3 extends AbstractC61132qb {
    public final UserSession A00;
    public final EnumC201878wK A01;
    public final CLNoticeRepository A02;
    public final String A03;

    public ND3(UserSession userSession, EnumC201878wK enumC201878wK, CLNoticeRepository cLNoticeRepository, String str) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
        this.A02 = cLNoticeRepository;
        this.A01 = enumC201878wK;
        this.A03 = str;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        return new C50997Mg4(this.A00, this.A01, this.A02, this.A03);
    }
}
