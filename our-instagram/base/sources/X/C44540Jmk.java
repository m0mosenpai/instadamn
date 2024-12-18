package X;

import com.instagram.common.session.UserSession;
import com.instagram.stickersearch.AvatarStickerInteractor;
import com.instagram.stickersearch.AvatarStickerPreRenderInteractor;

/* renamed from: X.Jmk, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44540Jmk extends AbstractC52922bZ {
    public final UserSession A00;
    public final AvatarStickerPreRenderInteractor A01;
    public final Integer A02;
    public final C05A A03;
    public final AvatarStickerInteractor A04;

    private final void A00(EnumC143276dS enumC143276dS, EnumC143286dT enumC143286dT, InterfaceC16660sJ interfaceC16660sJ) {
        AbstractC25232BEp.A1J(this, new PZ3(enumC143276dS, interfaceC16660sJ, this, null, 33), this.A04.A03(null, enumC143276dS, enumC143286dT, null, null, null, true, false));
    }

    public final void A01() {
        EnumC143276dS enumC143276dS;
        if (this.A02.intValue() == 0) {
            EnumC143286dT enumC143286dT = EnumC143286dT.A0F;
            UserSession userSession = this.A00;
            if (C18U.A06(AbstractC166997dE.A0U(userSession), userSession, 36315876928261792L)) {
                enumC143276dS = EnumC143276dS.A0S;
            } else {
                enumC143276dS = EnumC143276dS.A0T;
            }
            A00(enumC143276dS, enumC143286dT, AbstractC43592JPx.A18(this, 35));
            return;
        }
        throw B4Z.A00();
    }

    public final void A02() {
        if (this.A02.intValue() == 0) {
            A00(EnumC143276dS.A0U, EnumC143286dT.A0F, AbstractC43592JPx.A18(this, 36));
            return;
        }
        throw B4Z.A00();
    }

    public C44540Jmk(UserSession userSession, AvatarStickerInteractor avatarStickerInteractor, AvatarStickerPreRenderInteractor avatarStickerPreRenderInteractor, Integer num) {
        AbstractC167017dG.A1P(num, userSession);
        this.A02 = num;
        this.A00 = userSession;
        this.A04 = avatarStickerInteractor;
        this.A01 = avatarStickerPreRenderInteractor;
        this.A03 = C10E.A00(KZs.A00);
    }
}
