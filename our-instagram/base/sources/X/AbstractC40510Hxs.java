package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.StoryPromptType;
import com.instagram.common.session.UserSession;
import com.instagram.reels.prompt.model.PromptStickerModel;

/* renamed from: X.Hxs, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40510Hxs {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        C22P c22p;
        Object A03 = c6fw.A03(0);
        C14360o3.A0C(A03, "null cannot be cast to non-null type com.instagram.common.bloks.component.base.BloksModel");
        C102884kP c102884kP = (C102884kP) A03;
        Object A032 = c6fw.A03(1);
        AbstractC25225BEi.A1S(A032);
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
        int A033 = c102884kP.A03(44, 0);
        String A0E = c102884kP.A0E();
        if (A0E != null) {
            str = A0E;
        }
        int i = !str.equals("ENABLED") ? 1 : 0;
        boolean A0U = c102884kP.A0U(true);
        boolean A0S = c102884kP.A0S(40, false);
        String str5 = null;
        String A0L3 = c102884kP.A0L(140);
        if (A0L3 != null) {
            str5 = A0L3;
        }
        boolean A0S2 = c102884kP.A0S(42, false);
        PromptStickerModel promptStickerModel = new PromptStickerModel(null, StoryPromptType.A05, null, C05F.A00, str3, str2, str4, str5, null, C16930sl.A00, A033, i, A0U, A0S, A0S2);
        UserSession userSession = (UserSession) AbstractC31175DnJ.A0J(c6fq);
        FragmentActivity A04 = C6BQ.A04(c6fq);
        Fragment A01 = C6BQ.A01(c6fq);
        if (C14360o3.A0K(A032, "PROMPT_CARD")) {
            c22p = C22P.A08;
        } else if (C14360o3.A0K(A032, "PROMPT_TILE")) {
            c22p = C22P.A09;
        } else {
            c22p = C22P.A5N;
        }
        AbstractC41671Ic3.A02(A04, A01, c22p, userSession, null, promptStickerModel);
        return null;
    }
}
