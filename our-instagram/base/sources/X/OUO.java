package X;

import com.instagram.api.schemas.StoryPromptType;
import com.instagram.common.session.UserSession;
import com.instagram.reels.prompt.model.PromptStickerModel;

/* loaded from: classes9.dex */
public final class OUO {
    public Boolean A00;
    public final InterfaceC11380iw A01;
    public final UserSession A02;
    public final InterfaceC09390do A03;
    public final PromptStickerModel A04;
    public final String A05;
    public final String A06;
    public final String A07;

    public OUO(InterfaceC11380iw interfaceC11380iw, UserSession userSession, PromptStickerModel promptStickerModel, String str, String str2, String str3) {
        AbstractC25233BEq.A0x(1, userSession, str2, str3);
        C14360o3.A0B(promptStickerModel, 6);
        this.A02 = userSession;
        this.A01 = interfaceC11380iw;
        this.A05 = str;
        this.A06 = str2;
        this.A07 = str3;
        this.A04 = promptStickerModel;
        this.A03 = C57539PgD.A01(this, 19);
    }

    public static final void A00(OUO ouo, String str, String str2) {
        long j;
        Long l;
        try {
            PromptStickerModel promptStickerModel = ouo.A04;
            if (promptStickerModel.A03() != StoryPromptType.A06) {
                InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC37300Gc1.A0C(ouo.A03), "reel_prompt_sticker_interaction");
                String str3 = ouo.A05;
                if (str3 == null) {
                    str3 = promptStickerModel.A05();
                }
                AbstractC37300Gc1.A0l(A0f, str3);
                AbstractC31171DnF.A1C(A0f, str);
                String str4 = promptStickerModel.A03;
                C14360o3.A0B(str4, 0);
                Long A0k = AbstractC003100w.A0k(10, str4);
                if (A0k != null) {
                    j = A0k.longValue();
                } else {
                    j = -1;
                }
                A0f.A9K("prompt_id", Long.valueOf(j));
                A0f.A9K("prompt_participant_count", AbstractC31171DnF.A0V(promptStickerModel.A00.BbW()));
                A0f.AAP("tray_session_id", ouo.A06);
                AbstractC25225BEi.A1P(A0f, ouo.A07);
                if (str2 == null) {
                    l = null;
                } else {
                    l = AbstractC003100w.A0k(10, str2);
                }
                A0f.A9K("prompt_participant_id", l);
                A0f.A7v("prompt_attribution_showing", ouo.A00);
                A0f.Cht();
            }
        } catch (NumberFormatException e) {
            C0K8.A0C("PromptStickerLogger", e.getMessage());
        }
    }
}
