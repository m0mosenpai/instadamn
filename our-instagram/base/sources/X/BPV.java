package X;

import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;
import com.instagram.reels.prompt.model.PromptStickerModel;

/* loaded from: classes5.dex */
public final /* synthetic */ class BPV extends C03E implements InterfaceC16620sF {
    public BPV(Object obj) {
        super(2, obj, BKA.class, "launchPromptPivotPage", "launchPromptPivotPage(Lcom/instagram/reels/prompt/model/PromptStickerModel;Ljava/lang/String;)V", 0);
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        PromptStickerModel promptStickerModel = (PromptStickerModel) obj;
        BKA A0h = AbstractC25235BEs.A0h(promptStickerModel, this);
        UserSession userSession = A0h.A04;
        AbstractC25228BEl.A1G(A0h.A01, CJ9.A00(C8JW.A0C, promptStickerModel, (String) obj2), userSession, ModalActivity.class, AbstractC111324zv.A00(361));
        return C0eB.A00;
    }
}
