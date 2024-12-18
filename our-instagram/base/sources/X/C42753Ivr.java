package X;

import com.instagram.adshistory.fragment.RecentAdActivityFragment;
import com.instagram.common.session.UserSession;

/* renamed from: X.Ivr, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42753Ivr implements GY9 {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ C38321qM A01;
    public final /* synthetic */ IDW A02;
    public final /* synthetic */ String A03;

    @Override // X.GY9
    public final void DqA(Boolean bool) {
        if (AbstractC166997dE.A1Z(bool, true)) {
            C3YS.A00(this.A00).A02(this.A01, true);
            IEF ief = C6WF.A00;
            if (ief != null) {
                C131845xK.A00(ief.A00, new C6FW(AbstractC166987dD.A1E()), ief.A01);
            }
            this.A02.A00.A0A.CvC("remove_from_ad_activity", null);
            IBW ibw = AbstractC39678HjA.A00;
            if (ibw != null) {
                String str = this.A03;
                RecentAdActivityFragment recentAdActivityFragment = ibw.A00;
                if (recentAdActivityFragment.requireActivity().hasWindowFocus()) {
                    RecentAdActivityFragment.A01(recentAdActivityFragment, str);
                } else {
                    recentAdActivityFragment.A06 = str;
                }
            }
        }
    }

    public C42753Ivr(UserSession userSession, C38321qM c38321qM, IDW idw, String str) {
        this.A00 = userSession;
        this.A01 = c38321qM;
        this.A02 = idw;
        this.A03 = str;
    }
}
