package com.instagram.direct.avatar.stickers.search;

import X.AbstractC167017dG;
import X.AbstractC46518KiH;
import X.C05A;
import X.C10E;
import X.EnumC143276dS;
import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class AvatarLocalStickerSearchUseCase extends AbstractC46518KiH {
    public final UserSession A00;
    public final AvatarLocalStickerSearchRepository A01;
    public final C05A A02;

    public /* synthetic */ AvatarLocalStickerSearchUseCase(EnumC143276dS enumC143276dS, UserSession userSession) {
        AvatarLocalStickerSearchRepository avatarLocalStickerSearchRepository = new AvatarLocalStickerSearchRepository(enumC143276dS, userSession);
        AbstractC167017dG.A1P(userSession, enumC143276dS);
        this.A00 = userSession;
        this.A01 = avatarLocalStickerSearchRepository;
        this.A02 = C10E.A00(null);
    }
}
