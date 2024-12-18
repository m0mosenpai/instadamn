package X;

import com.instagram.common.session.UserSession;
import com.instagram.stickersearch.AvatarStickerInteractor;

/* loaded from: classes8.dex */
public final class KGD extends AbstractC61132qb {
    public final C18920wW A00;
    public final UserSession A01;
    public final String A02;

    public KGD(C18920wW c18920wW, UserSession userSession, String str) {
        C14360o3.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = c18920wW;
        this.A02 = str;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        return new C44486Jls(this.A00, new AvatarStickerInteractor(null, this.A01, 30), this.A02);
    }
}
