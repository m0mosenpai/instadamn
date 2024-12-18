package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.reels.prompt.model.PromptStickerModel;
import java.util.List;

/* renamed from: X.GjY, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37759GjY extends AbstractC37765Gjg {
    public static final C37759GjY A00 = new Object();

    public static final PromptStickerModel A00(C38321qM c38321qM) {
        List A3w;
        if (c38321qM == null || (A3w = c38321qM.A3w(EnumC75383a5.A0I)) == null || A3w.isEmpty()) {
            return null;
        }
        return ((C84823qW) A3w.get(0)).A0E();
    }

    public static final void A01(Fragment fragment, C1P1 c1p1, UserSession userSession, C38321qM c38321qM, boolean z) {
        String str;
        String str2;
        PromptStickerModel A002 = A00(c38321qM);
        if (A002 != null && (str = A002.A03) != null) {
            C25621Ms A0c = AbstractC167017dG.A0c(userSession);
            A0c.A0B("clips/pin_for_v2_prompt/");
            AbstractC31173DnH.A1N(A0c);
            A0c.A9s("media_id", c38321qM.A2u());
            A0c.A9s("prompt_id", str);
            if (z) {
                str2 = "pin";
            } else {
                str2 = "unpin";
            }
            C1ON A0T = AbstractC31172DnG.A0T(A0c, "action", str2);
            int i = 2131976185;
            if (z) {
                i = 2131969667;
            }
            Context requireContext = fragment.requireContext();
            C6WQ c6wq = new C6WQ(requireContext, true);
            C57312k6 A0a = AbstractC25229BEm.A0a(fragment);
            c6wq.A00(requireContext.getString(i));
            A0T.A00 = new NA5(requireContext, c1p1, userSession, c38321qM, c6wq, A0a, z);
            C1GJ.A03(A0T);
        }
    }

    public final boolean A02(UserSession userSession, C38321qM c38321qM) {
        C14360o3.A0B(userSession, 0);
        PromptStickerModel A002 = A00(c38321qM);
        if (A002 == null || c38321qM == null || !c38321qM.A5P() || c38321qM.A5H() || c38321qM.A2O() == C05F.A0C || !C14360o3.A0K(A002.A04, AbstractC111324zv.A00(2060)) || A002.A0E || !C14360o3.A0K(AbstractC166997dE.A0Y(userSession), A002.A02)) {
            return false;
        }
        return true;
    }
}
