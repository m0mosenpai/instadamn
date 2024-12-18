package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger;
import com.instagram.business.ui.BusinessNavBar;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.colorfilter.ColorFilterAlphaImageView;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.user.model.User;

/* renamed from: X.EKt, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32306EKt extends AbstractC59962oe implements InterfaceC60072op, InterfaceC60122ou {
    public static final String __redex_internal_original_name = "InviteStoryFragment";
    public BusinessFlowAnalyticsLogger A00;
    public UserSession A01;
    public String A02;
    public InterfaceC37222GaX A03;
    public BusinessNavBar A04;
    public User A05;
    public final InterfaceC41501vz A06 = C31650DvG.A00(this, 6);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "invite_story_fragment";
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = this.A00;
        if (businessFlowAnalyticsLogger != null) {
            businessFlowAnalyticsLogger.Cid(new Y7A("invite_story", this.A02, null, null, null, null, null, null));
            return false;
        }
        return false;
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        interfaceC56362iU.Eha(ViewOnClickListenerC35690FpP.A00(this, 21), R.drawable.instagram_x_pano_outline_24).setColorFilter(C3DY.A00(AbstractC53242c7.A0F(requireContext(), R.attr.textColorPrimary)));
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return this.A01;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        this.A03 = AbstractC35211Fg4.A01(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-283750803);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        String A0j = AbstractC31173DnH.A0j(requireArguments, "ARG_TARGET_USER_ID");
        UserSession A0S = AbstractC31176DnK.A0S(this);
        this.A01 = A0S;
        this.A05 = C0BQ.A00(A0S).BOa(A0j);
        this.A02 = AbstractC31173DnH.A0j(requireArguments, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
        BusinessFlowAnalyticsLogger A00 = AbstractC35211Fg4.A00(this.A03, this, this.A01);
        this.A00 = A00;
        if (A00 != null) {
            A00.Clo(new Y7A("invite_story", this.A02, null, null, null, null, null, null));
        }
        C0f9.A09(1586457688, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-809956544);
        View inflate = layoutInflater.inflate(R.layout.stacked_value_props, viewGroup, false);
        TextView A09 = AbstractC31175DnJ.A09(inflate, R.id.title);
        UserSession userSession = this.A01;
        C08730cb c08730cb = C17060sy.A01;
        AbstractC31177DnL.A10(A09, this, AbstractC31173DnH.A0n(userSession, c08730cb), 2131964666);
        TextView A092 = AbstractC31175DnJ.A09(inflate, R.id.subtitle);
        String A0n = AbstractC31173DnH.A0n(this.A01, c08730cb);
        User user = this.A05;
        user.getClass();
        A092.setText(getString(2131964665, A0n, user.getUsername()));
        AbstractC31173DnH.A0D(inflate, R.id.divider).setVisibility(8);
        ColorFilterAlphaImageView colorFilterAlphaImageView = (ColorFilterAlphaImageView) inflate.findViewById(R.id.title_icon);
        if (colorFilterAlphaImageView != null) {
            colorFilterAlphaImageView.A04(0, 0);
            int dimensionPixelSize = AbstractC166997dE.A0N(this).getDimensionPixelSize(R.dimen.appreciation_reels_grid_item_width);
            colorFilterAlphaImageView.setImageResource(R.drawable.instagram_business_images_business_story);
            ViewGroup.LayoutParams layoutParams = colorFilterAlphaImageView.getLayoutParams();
            layoutParams.getClass();
            layoutParams.height = dimensionPixelSize;
            ViewGroup.LayoutParams layoutParams2 = colorFilterAlphaImageView.getLayoutParams();
            layoutParams2.getClass();
            layoutParams2.width = dimensionPixelSize;
            colorFilterAlphaImageView.setBackground(null);
        }
        BusinessNavBar businessNavBar = (BusinessNavBar) inflate.requireViewById(R.id.navigation_bar);
        this.A04 = businessNavBar;
        businessNavBar.setPrimaryButtonText(2131964664);
        this.A04.setPrimaryButtonOnclickListeners(ViewOnClickListenerC35690FpP.A00(this, 20));
        C41451vu.A01.A02(this.A06, C0KL.class);
        C0f9.A09(-1904983961, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(618727077);
        super.onDestroyView();
        C41451vu.A01.A03(this.A06, C0KL.class);
        C0f9.A09(-649485398, A02);
    }
}
