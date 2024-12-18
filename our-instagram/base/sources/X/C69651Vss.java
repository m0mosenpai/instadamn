package X;

import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;

/* renamed from: X.Vss, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69651Vss {
    public C67841UzE A00;
    public String A01;
    public boolean A02;
    public final UserSession A03;
    public final C69711Vu6 A04;
    public final C69711Vu6 A05;
    public final String A06;
    public final UserSession A07;
    public final VEB A08;
    public final String A09;

    public C69651Vss(UserSession userSession, VEB veb, C69711Vu6 c69711Vu6, String str, String str2) {
        AbstractC25229BEm.A1I(userSession, 1, c69711Vu6);
        this.A03 = userSession;
        this.A06 = str;
        this.A05 = c69711Vu6;
        this.A07 = userSession;
        this.A08 = veb;
        this.A09 = str;
        this.A01 = str2;
        this.A04 = c69711Vu6;
    }

    public final void A00(Fragment fragment, V01 v01) {
        if (!this.A02) {
            UserSession userSession = this.A07;
            VEB veb = this.A08;
            String str = this.A09;
            C25621Ms A0N = AbstractC31173DnH.A0N(userSession);
            A0N.A0B("civic_action/get_voting_info/");
            A0N.A9s(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, veb.A00);
            A0N.A0H("media_id", str);
            C1ON A0S = AbstractC31172DnG.A0S(A0N, C67841UzE.class, VyY.class);
            A0S.A00 = new C67954V3t(11, v01, this);
            C1GJ.A00(fragment.requireContext(), AbstractC018607g.A00(fragment), A0S);
        }
    }
}
