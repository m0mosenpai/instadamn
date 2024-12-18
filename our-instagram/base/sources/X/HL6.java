package X;

import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.feed.ui.state.IntentAwareAdPivotState;

/* loaded from: classes7.dex */
public final class HL6 extends AbstractC37439GeJ implements InterfaceC60442pS {
    public static final String __redex_internal_original_name = "AdsChainingFeedController";
    public IntentAwareAdPivotState A00;
    public String A01;
    public String A02;
    public String A03;
    public final Bundle A05;
    public final IBV A06;
    public final C42948Iz0 A07;
    public final UserSession A08;
    public final JIJ A09;
    public final C37445GeP A0A;
    public final String A0B;
    public boolean A04 = true;
    public final java.util.Set A0C = AbstractC31171DnF.A0l();

    public HL6(Bundle bundle, UserSession userSession, JIJ jij, C37445GeP c37445GeP, InterfaceC669530m interfaceC669530m, String str) {
        C42948Iz0 c42948Iz0;
        this.A08 = userSession;
        this.A09 = jij;
        this.A05 = bundle;
        this.A0B = str;
        this.A0A = c37445GeP;
        if (interfaceC669530m instanceof C42948Iz0) {
            c42948Iz0 = (C42948Iz0) interfaceC669530m;
        } else {
            c42948Iz0 = null;
        }
        this.A07 = c42948Iz0;
        this.A06 = new IBV(this);
    }

    @Override // X.InterfaceC60442pS
    public final boolean isOrganicEligible() {
        return false;
    }

    @Override // X.InterfaceC60442pS
    public final boolean isSponsoredEligible() {
        return true;
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A0B;
    }
}
