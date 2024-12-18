package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import java.util.Map;

/* renamed from: X.Rat, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C60885Rat extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "IGMerchantLoyaltyListFragment";
    public C126545np A00;
    public Q8U A01;
    public FrameLayout A02;
    public C62862tP A03;
    public C6T7 A04;
    public C57112jm A05;
    public String A06;
    public final InterfaceC09390do A07 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "merchant_loyalty_list_fragment";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        FrameLayout frameLayout = (FrameLayout) AbstractC166997dE.A0R(view, R.id.merchant_loyalty_container);
        this.A02 = frameLayout;
        this.A00 = new C126545np(requireContext());
        C57112jm c57112jm = this.A05;
        if (c57112jm == null) {
            str = "viewpointManager";
        } else {
            c57112jm.A08(frameLayout, C71163Hc.A00(this), new InterfaceC57142jp[0]);
            Q8U q8u = this.A01;
            if (q8u != null) {
                q8u.A00.A06(this, new C55562Olw(25, new DRQ(this, 12)));
                Q8U q8u2 = this.A01;
                if (q8u2 != null) {
                    A00((C192998gf) q8u2.A00.A02(), this);
                    return;
                }
            }
            str = "igViewModel";
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public static final void A00(C192998gf c192998gf, C60885Rat c60885Rat) {
        FrameLayout frameLayout;
        if (c192998gf != null && (frameLayout = c60885Rat.A02) != null) {
            frameLayout.setVisibility(0);
            C6T7 c6t7 = c60885Rat.A04;
            frameLayout.removeAllViews();
            if (c6t7 != null) {
                c6t7.A04();
            }
            Context requireContext = c60885Rat.requireContext();
            C1338462s c1338462s = c192998gf.A00;
            C62862tP c62862tP = c60885Rat.A03;
            if (c62862tP == null) {
                C14360o3.A0F("igBloksHost");
                throw C00O.createAndThrow();
            }
            C6T7 A00 = C6T7.A00(requireContext, c1338462s, c62862tP).A00();
            c60885Rat.A04 = A00;
            C126545np c126545np = c60885Rat.A00;
            if (c126545np != null) {
                A00.A07(c126545np);
                if (frameLayout.getChildCount() == 0) {
                    frameLayout.addView(A00.A00);
                    return;
                }
                throw AbstractC166987dD.A14("Trying to add root Bloks Hosting Component but already a root view present");
            }
        }
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A07);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(1659153280);
        super.onCreate(bundle);
        this.A06 = AbstractC153636vY.A01(requireArguments(), "sessionId");
        this.A05 = C57112jm.A00();
        AbstractC12990ll A0o = AbstractC166987dD.A0o(this.A07);
        C57112jm c57112jm = this.A05;
        if (c57112jm == null) {
            C14360o3.A0F("viewpointManager");
            throw C00O.createAndThrow();
        }
        this.A03 = C62862tP.A03(this, A0o, c57112jm);
        AbstractC52922bZ A00 = C63307ShD.A00(this).A00(Q8U.class);
        C14360o3.A0C(A00, "null cannot be cast to non-null type com.fbpay.hub.merchantloyalty.vm.MerchantLoyaltyViewModel<com.instagram.bloks.util.IgBloksRequestTask.BloksParseResultResponse>");
        this.A01 = (Q8U) A00;
        C0f9.A09(-54980623, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1756449573);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.fragment_merchant_loyalty_list_section, viewGroup, false);
        C0f9.A09(-1572799843, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        String str;
        int A02 = C0f9.A02(1643479786);
        super.onResume();
        Q8U q8u = this.A01;
        if (q8u == null) {
            str = "igViewModel";
        } else {
            requireContext();
            String str2 = this.A06;
            if (str2 == null) {
                str = "sessionId";
            } else {
                SW8 sw8 = q8u.A02;
                Map A0n = AbstractC167007dF.A0n("logging_session_id", str2);
                C60894Rb8 c60894Rb8 = new C60894Rb8(sw8);
                UserSession userSession = sw8.A01;
                C14360o3.A0B(userSession, 0);
                AbstractC192798gL A01 = C192108fB.A01(null, userSession, "com.bloks.www.fbpay.merchant_loyalty_list", null, A0n, 0, 0L, false);
                A01.A00(c60894Rb8);
                C1GJ.A03(A01);
                C0f9.A09(1465279899, A02);
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }
}
