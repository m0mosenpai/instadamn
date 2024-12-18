package X;

import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.model.reels.Reel;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Gmp, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37947Gmp implements InterfaceC11380iw {
    public static final C37947Gmp A00 = new Object();
    public static final String __redex_internal_original_name = "SuperlativeLoggingUtils";

    public static final void A01(String str, String str2) {
        C14360o3.A0B(str2, 1);
        C0w9.A03("Superlative", AnonymousClass001.A0g(str, " : ", str2));
    }

    public final void A02(UserSession userSession, Reel reel, C3G2 c3g2) {
        C14360o3.A0B(userSession, 0);
        if (reel.A0t()) {
            C18920wW A01 = AbstractC12220kQ.A01(this, userSession);
            String A0j = AbstractC167017dG.A0j();
            List A0O = reel.A0O(userSession);
            C14360o3.A07(A0O);
            Iterator it = AbstractC001800i.A0a(A0O).iterator();
            while (it.hasNext()) {
                AbstractC37303Gc4.A1B(A01, (C41181vS) it.next(), c3g2, "ig_story_standouts_card_eligible", A0j);
            }
        }
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "standouts";
    }

    public static final C22P A00(C3G2 c3g2) {
        switch (c3g2.ordinal()) {
            case 0:
                return C22P.A57;
            case 105:
                return C22P.A5A;
            case 106:
                return C22P.A55;
            case 107:
                return C22P.A58;
            case 108:
                return C22P.A56;
            case 109:
                return C22P.A59;
            case 110:
                return C22P.A5B;
            default:
                return C22P.A5N;
        }
    }

    public final void A03(UserSession userSession, C41181vS c41181vS, C3G2 c3g2) {
        AbstractC167017dG.A1O(userSession, c3g2);
        if (c41181vS.A1m()) {
            AbstractC37303Gc4.A1B(AbstractC12220kQ.A01(this, userSession), c41181vS, c3g2, "ig_story_standouts_card_impression", AbstractC167017dG.A0j());
        }
    }

    public final void A04(UserSession userSession, C3G2 c3g2, String str) {
        AbstractC167027dH.A12(userSession, str, c3g2);
        C18920wW A01 = AbstractC12220kQ.A01(this, userSession);
        String A0j = AbstractC167017dG.A0j();
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(A01, "ig_story_standouts_ineligible_bottom_sheet_impression");
        if (A0f.isSampled()) {
            AbstractC37300Gc1.A0o(A0f, A0j);
            A0f.AAP("reel_id_type", "superlativeReel");
            A0f.AAP("reel_id", str);
            A0f.AAP(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, A00(c3g2).name());
            A0f.Cht();
        }
    }
}
