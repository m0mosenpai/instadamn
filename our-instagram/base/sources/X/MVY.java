package X;

import com.instagram.reels.prompt.model.PromptStickerModel;
import java.util.List;

/* loaded from: classes9.dex */
public final /* synthetic */ class MVY extends C03E implements InterfaceC16660sJ {
    public MVY(Object obj) {
        super(1, obj, BKA.class, "launchStoriesTemplateParticipation", "launchStoriesTemplateParticipation(Lcom/instagram/feed/media/Media;)V", 0);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C84823qW c84823qW;
        PromptStickerModel A0E;
        C38321qM c38321qM = (C38321qM) obj;
        BKA bka = (BKA) AbstractC25229BEm.A0o(c38321qM, this);
        List A3w = c38321qM.A3w(EnumC75383a5.A11);
        if (A3w != null && (c84823qW = (C84823qW) AbstractC001800i.A0J(A3w)) != null && (A0E = c84823qW.A0E()) != null) {
            new C146136iC(bka.A01, C22P.A47, bka.A04, null, null).A04(null, A0E, AbstractC23125AKj.A01(c84823qW), null);
        }
        return C0eB.A00;
    }
}
