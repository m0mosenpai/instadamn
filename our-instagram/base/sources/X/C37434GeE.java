package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.feed.intf.ContextualFeedNetworkConfig;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.GeE, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37434GeE extends AbstractC37439GeJ implements InterfaceC60442pS {
    public static final String __redex_internal_original_name = "ProfileContextualFeedController";
    public C38321qM A00;
    public User A01;
    public final Bundle A02;
    public final Fragment A03;
    public final InterfaceC41501vz A04;
    public final UserSession A05;
    public final JIJ A06;
    public final ContextualFeedNetworkConfig A07;
    public final C154786xT A08;
    public final String A09;
    public final List A0A;
    public final boolean A0B;
    public final InterfaceC154766xR A0C;

    public C37434GeE(Fragment fragment, UserSession userSession, C1GL c1gl, JIJ jij, ContextualFeedNetworkConfig contextualFeedNetworkConfig, InterfaceC38371qR interfaceC38371qR, String str, boolean z) {
        C38321qM c38321qM;
        C14360o3.A0B(contextualFeedNetworkConfig, 1);
        this.A07 = contextualFeedNetworkConfig;
        this.A05 = userSession;
        this.A09 = str;
        this.A03 = fragment;
        this.A0B = z;
        this.A06 = jij;
        this.A04 = new C42261Inl(this, 4);
        this.A0A = AbstractC166987dD.A1E();
        this.A02 = AbstractC166987dD.A0b();
        C38029GoI c38029GoI = new C38029GoI(this);
        this.A0C = c38029GoI;
        if (interfaceC38371qR != null) {
            c38321qM = interfaceC38371qR.BQN();
        } else {
            c38321qM = null;
        }
        this.A00 = c38321qM;
        String str2 = contextualFeedNetworkConfig.A01;
        C154786xT c154786xT = new C154786xT(fragment.requireContext(), userSession, c1gl, null, c38029GoI, AbstractC37452GeW.A00(this.A07.A00), null, str2, AbstractC167007dF.A1W(str2));
        this.A08 = c154786xT;
        String str3 = contextualFeedNetworkConfig.A03;
        C154806xV c154806xV = c154786xT.A03.A03;
        c154806xV.A09 = str3;
        c154806xV.A08 = contextualFeedNetworkConfig.A02;
    }

    @Override // X.InterfaceC60442pS
    public final boolean isOrganicEligible() {
        return true;
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A09;
    }

    @Override // X.InterfaceC60442pS
    public final boolean isSponsoredEligible() {
        return C18U.A06(C06090Tz.A05, this.A05, 36315808208719422L);
    }
}
