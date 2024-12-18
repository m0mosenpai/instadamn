package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.StoryPromptType;
import com.instagram.modal.ModalActivity;
import com.instagram.reels.prompt.model.PromptStickerModel;

/* loaded from: classes5.dex */
public abstract class CFI {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        C8JW c8jw;
        Object A03 = c6fw.A03(0);
        C14360o3.A0C(A03, "null cannot be cast to non-null type com.instagram.common.bloks.component.base.BloksModel");
        C102884kP c102884kP = (C102884kP) A03;
        String str = "";
        String str2 = "";
        String A0K = c102884kP.A0K();
        if (A0K != null) {
            str2 = A0K;
        }
        String str3 = "";
        String A0L = c102884kP.A0L(45);
        if (A0L != null) {
            str3 = A0L;
        }
        String str4 = null;
        String A0L2 = c102884kP.A0L(46);
        if (A0L2 != null) {
            str4 = A0L2;
        }
        int A032 = c102884kP.A03(44, 0);
        String A0E = c102884kP.A0E();
        if (A0E != null) {
            str = A0E;
        }
        int i = !str.equals("ENABLED") ? 1 : 0;
        boolean A0U = c102884kP.A0U(false);
        boolean A0S = c102884kP.A0S(40, false);
        String str5 = null;
        String A0L3 = c102884kP.A0L(140);
        if (A0L3 != null) {
            str5 = A0L3;
        }
        boolean A0S2 = c102884kP.A0S(42, false);
        PromptStickerModel promptStickerModel = new PromptStickerModel(null, StoryPromptType.A05, null, C05F.A00, str3, str2, str4, str5, null, C16930sl.A00, A032, i, A0U, A0S, A0S2);
        if (promptStickerModel.A01 == 0) {
            AbstractC12990ll A0B = C6BQ.A0B(c6fq);
            C14360o3.A0C(A0B, "null cannot be cast to non-null type com.instagram.common.session.UserSession");
            FragmentActivity A04 = C6BQ.A04(c6fq);
            if (promptStickerModel.A07) {
                c8jw = C8JW.A0B;
            } else {
                c8jw = C8JW.A07;
            }
            AbstractC25228BEl.A1G(A04, CJ9.A00(c8jw, promptStickerModel, str2), A0B, ModalActivity.class, AbstractC111324zv.A00(361));
        }
        return null;
    }
}
