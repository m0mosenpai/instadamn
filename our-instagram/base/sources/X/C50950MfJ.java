package X;

import com.instagram.common.session.UserSession;
import com.instagram.reels.prompt.model.PromptStickerModel;
import com.instagram.reels.prompt.mvvm.data.PromptStickerViewerRepository;
import java.util.List;

/* renamed from: X.MfJ, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50950MfJ extends AbstractC52922bZ {
    public int A00;
    public int A01;
    public List A02;
    public final C92694De A03;
    public final UserSession A04;
    public final PromptStickerModel A05;
    public final PromptStickerViewerRepository A06;
    public final InterfaceC06180Ui A07;
    public final C05A A08;

    public C50950MfJ(UserSession userSession, PromptStickerModel promptStickerModel, PromptStickerViewerRepository promptStickerViewerRepository) {
        AbstractC167017dG.A1P(userSession, promptStickerModel);
        this.A04 = userSession;
        this.A05 = promptStickerModel;
        this.A06 = promptStickerViewerRepository;
        this.A03 = AbstractC166177bl.A00(C92674Dc.A00);
        this.A08 = C10E.A00(C56548P8u.A00);
        this.A07 = MSY.A0t();
    }
}
