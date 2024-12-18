package X;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.headline.IgdsHeadline;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.N4y, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52125N4y extends AbstractC59962oe {
    public static final C55905Oru A06 = new Object();
    public static final String __redex_internal_original_name = "RecommendToFacebookOptimizedUpsellFragment";
    public View.OnClickListener A00;
    public View.OnClickListener A01;
    public IgdsHeadline A02;
    public C55011OVw A03;
    public InterfaceC16820sZ A04;
    public final InterfaceC09390do A05 = AbstractC60492pY.A02(this);

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A02 = (IgdsHeadline) requireView().requireViewById(R.id.headline);
        View A0S = AbstractC166997dE.A0S(requireView(), R.id.custom_button_container);
        A0S.setVisibility(0);
        TextView A0N = AbstractC167007dF.A0N(A0S, R.id.bb_primary_action);
        View A0R = AbstractC166997dE.A0R(A0S, R.id.bb_primary_action_container);
        View A0R2 = AbstractC166997dE.A0R(A0S, R.id.bb_secondary_action);
        TextView A0N2 = AbstractC167007dF.A0N(A0S, R.id.footer_above_action);
        A0R2.setVisibility(8);
        TextView A0T = AbstractC166997dE.A0T(A0S, R.id.bb_secondary_action_grey);
        A0T.setVisibility(0);
        ViewOnClickListenerC55466OkL.A02(A0R, 9, this);
        Context requireContext = requireContext();
        C55011OVw c55011OVw = this.A03;
        String str = "params";
        if (c55011OVw != null) {
            boolean A01 = c55011OVw.A01();
            int i = 2131955727;
            if (A01) {
                i = 2131955729;
            }
            A0N.setText(AbstractC166997dE.A0p(requireContext, i));
            ViewOnClickListenerC55466OkL.A02(A0T, 10, this);
            Context requireContext2 = requireContext();
            C55011OVw c55011OVw2 = this.A03;
            if (c55011OVw2 != null) {
                boolean A012 = c55011OVw2.A01();
                int i2 = 2131955730;
                if (A012) {
                    i2 = 2131955728;
                }
                A0T.setText(AbstractC166997dE.A0p(requireContext2, i2));
                Resources A09 = AbstractC31177DnL.A09(this);
                String A0v = AbstractC25227BEk.A0v(this, 2131972024);
                SpannableStringBuilder A0H = AbstractC25225BEi.A0H(MSZ.A0H(A09, A0v, 2131972075));
                AnonymousClass773.A05(A0H, new C50763MbU(this, 2), A0v);
                A0N2.setText(A0H);
                IgdsHeadline igdsHeadline = this.A02;
                str = "headlineView";
                if (igdsHeadline != null) {
                    igdsHeadline.setImageResource(R.drawable.ig_illustrations_illo_reels_distribution_refresh);
                    IgdsHeadline igdsHeadline2 = this.A02;
                    if (igdsHeadline2 != null) {
                        igdsHeadline2.setHeadline(2131955735);
                        C09530e4 A0o = AbstractC167007dF.A0o(getString(2131955731), R.drawable.instagram_facebook_circle_pano_outline_24);
                        C08730cb c08730cb = C17060sy.A01;
                        InterfaceC09390do interfaceC09390do = this.A05;
                        List A1Q = AbstractC16960so.A1Q(A0o, AbstractC167007dF.A0o(AbstractC31174DnI.A0w(this, AbstractC31176DnK.A0g(c08730cb, interfaceC09390do).getUsername(), 2131955732), R.drawable.instagram_user_circle_pano_outline_24), AbstractC167007dF.A0o(getString(2131955733), R.drawable.instagram_circle_play_pano_outline_24));
                        IgdsHeadline igdsHeadline3 = this.A02;
                        if (igdsHeadline3 != null) {
                            C35228FgL A013 = C35228FgL.A01(requireContext(), true);
                            Iterator it = A1Q.iterator();
                            while (it.hasNext()) {
                                C09530e4 A17 = AbstractC43592JPx.A17(it);
                                A013.A04(null, (CharSequence) A17.A00, AbstractC25229BEm.A0A(A17));
                            }
                            List A03 = A013.A03();
                            ArrayList A0i = AbstractC167007dF.A0i(A03);
                            Iterator it2 = A03.iterator();
                            while (it2.hasNext()) {
                                AbstractC50523MSb.A1Q(A0i, it2);
                            }
                            igdsHeadline3.setBulletList(A0i);
                            UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
                            C55011OVw c55011OVw3 = this.A03;
                            if (c55011OVw3 == null) {
                                C14360o3.A0F("params");
                                throw C00O.createAndThrow();
                            }
                            C35038FcB A014 = FXY.A01(A0r, c55011OVw3.A00);
                            if (A014 != null) {
                                A014.A00();
                            }
                            InterfaceC16820sZ interfaceC16820sZ = this.A04;
                            if (interfaceC16820sZ != null) {
                                interfaceC16820sZ.invoke();
                                return;
                            }
                            return;
                        }
                    }
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "recommend_to_facebook_optimization_upsell";
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A05);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(1629672347);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        C55011OVw c55011OVw = new C55011OVw(C82G.valueOf(AbstractC153636vY.A01(requireArguments, "ARG_UPSELL_ENTRY_POINT")), C82H.valueOf(AbstractC153636vY.A01(requireArguments, "ARG_UPSELL_VARIANT")), MYO.valueOf(AbstractC153636vY.A01(requireArguments, "ARG_MEDIA_SOURCE_TYPE")), requireArguments.getString("ARG_WATERFALL_ID"), requireArguments.getString("ARG_MODULE_NAME"), requireArguments.getString("ARG_DESIGN_VARIANT"), null, requireArguments.getInt("ARG_NUX_ATTEMPT_QPL_INSTANCE_KEY"));
        this.A03 = c55011OVw;
        String str = c55011OVw.A04;
        if (str != null) {
            EnumC53201Nfx.A01.get(str);
        }
        C0f9.A09(2005912866, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(503791938);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.fragment_share_to_fb_upsell_bottom_sheet, viewGroup, false);
        C0f9.A09(153723613, A02);
        return inflate;
    }
}
