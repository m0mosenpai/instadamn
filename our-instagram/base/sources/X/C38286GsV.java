package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.feed.ui.state.IntentAwareAdPivotState;
import com.instagram.search.common.analytics.SearchContext;
import java.util.List;

/* renamed from: X.GsV, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38286GsV extends AbstractC37439GeJ implements InterfaceC60442pS {
    public static final String __redex_internal_original_name = "IntentAwareAdFeedController";
    public IntentAwareAdPivotState A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;
    public String A0B;
    public final Bundle A0C;
    public final C39030HGg A0D;
    public final UserSession A0E;
    public final JIJ A0F;
    public final C37445GeP A0G;
    public final C669430l A0H;
    public final String A0I;
    public final Fragment A0K;
    public final C25671My A0L;
    public int A01 = -1;
    public int A00 = -1;
    public final java.util.Set A0J = AbstractC31171DnF.A0l();

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "intent_aware_ad_feed_contextual_feed_controller";
    }

    @Override // X.InterfaceC60442pS
    public final boolean isOrganicEligible() {
        return false;
    }

    @Override // X.InterfaceC60442pS
    public final boolean isSponsoredEligible() {
        return true;
    }

    public static final boolean A03(C38286GsV c38286GsV) {
        C71113Gx c71113Gx = C5MB.A00;
        if (c71113Gx.A01(Integer.valueOf(c38286GsV.A01))) {
            if (C18U.A06(C06090Tz.A06, c38286GsV.A0E, 36312874753328564L)) {
                return true;
            }
        }
        if (c71113Gx.A02(Integer.valueOf(c38286GsV.A01))) {
            if (C18U.A06(C06090Tz.A06, c38286GsV.A0E, 36312874759292418L)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public C38286GsV(Bundle bundle, Fragment fragment, UserSession userSession, JIJ jij, C37445GeP c37445GeP, InterfaceC669530m interfaceC669530m, String str) {
        C669430l c669430l;
        this.A0K = fragment;
        this.A0E = userSession;
        this.A0F = jij;
        this.A0I = str;
        this.A0G = c37445GeP;
        this.A0C = bundle;
        this.A0L = AbstractC25651Mw.A00(userSession);
        if (interfaceC669530m instanceof C669430l) {
            c669430l = (C669430l) interfaceC669530m;
        } else {
            c669430l = null;
        }
        this.A0H = c669430l;
        this.A0D = new C39030HGg(this, 10);
    }

    public static final void A02(C1DX c1dx, C38286GsV c38286GsV, String str, List list) {
        C38321qM A02 = c1dx.A02(str);
        if (A02 != null) {
            list.add(A02);
            IntentAwareAdPivotState intentAwareAdPivotState = c38286GsV.A02;
            if (intentAwareAdPivotState != null) {
                if (C14360o3.A0K(intentAwareAdPivotState.A05, str)) {
                    if (C18U.A06(C06090Tz.A06, c38286GsV.A0E, 36312874748151167L)) {
                        IntentAwareAdPivotState intentAwareAdPivotState2 = c38286GsV.A02;
                        if (intentAwareAdPivotState2 != null) {
                            intentAwareAdPivotState2.A05 = "";
                            c38286GsV.A0L.E4s(new C72233Lw(A02, null, null, new SearchContext(null, null, null, null, null, null, null, null), null));
                            return;
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            C14360o3.A0F("intentAwareAdPivotState");
            throw C00O.createAndThrow();
        }
    }
}
