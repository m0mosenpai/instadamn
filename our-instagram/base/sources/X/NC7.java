package X;

import com.instagram.common.session.UserSession;
import com.instagram.reels.prompt.model.PromptStickerModel;
import com.instagram.reels.prompt.mvvm.data.PromptStickerViewerRepository;

/* loaded from: classes9.dex */
public final class NC7 extends AbstractC61132qb {
    public final UserSession A00;
    public final PromptStickerModel A01;

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        UserSession userSession = this.A00;
        return new C50950MfJ(userSession, this.A01, new PromptStickerViewerRepository(new O4A(userSession)));
    }

    public NC7(UserSession userSession, PromptStickerModel promptStickerModel) {
        AbstractC167017dG.A1P(userSession, promptStickerModel);
        this.A00 = userSession;
        this.A01 = promptStickerModel;
    }
}
