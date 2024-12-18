package X;

import com.instagram.common.session.UserSession;
import com.instagram.stickersearch.api.AvatarStickerSearchRepository;

/* renamed from: X.KZn, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C46042KZn extends AbstractC46518KiH {
    public final C51758Mth A00;
    public final EnumC143276dS A01;
    public final EnumC143286dT A02;
    public final UserSession A03;
    public final AvatarStickerSearchRepository A04;
    public final C05A A05;

    public /* synthetic */ C46042KZn(C51758Mth c51758Mth, EnumC143276dS enumC143276dS, EnumC143286dT enumC143286dT, UserSession userSession) {
        AvatarStickerSearchRepository avatarStickerSearchRepository = new AvatarStickerSearchRepository(c51758Mth, enumC143286dT, userSession);
        AbstractC167017dG.A1P(userSession, enumC143286dT);
        this.A03 = userSession;
        this.A02 = enumC143286dT;
        this.A01 = enumC143276dS;
        this.A00 = c51758Mth;
        this.A04 = avatarStickerSearchRepository;
        this.A05 = avatarStickerSearchRepository.A06;
    }
}
