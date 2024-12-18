package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.facebook.common.callercontext.CallerContext;
import com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger;
import com.instagram.business.ui.BusinessNavBar;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.igds.components.headline.IgdsHeadline;

/* renamed from: X.EKw, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32309EKw extends AbstractC59962oe implements InterfaceC60072op, InterfaceC60122ou {
    public static final String __redex_internal_original_name = "CreatePostFragment";
    public BusinessFlowAnalyticsLogger A00;
    public UserSession A01;
    public String A02;
    public InterfaceC37222GaX A03;
    public BusinessNavBar A04;
    public String A05;
    public String A06;

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "create_post_fragment";
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = this.A00;
        if (businessFlowAnalyticsLogger != null) {
            businessFlowAnalyticsLogger.Cid(new Y7A("create_post", this.A02, null, null, null, null, null, null));
            return false;
        }
        return false;
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        interfaceC56362iU.Eha(new ViewOnClickListenerC35690FpP(this, 8), R.drawable.instagram_x_pano_outline_24).setColorFilter(C3DY.A00(AbstractC53242c7.A0F(requireContext(), R.attr.textColorPrimary)));
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return this.A01;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, X.1vN] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, X.1vN] */
    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 100 || i == 101 || i == 102) {
            if (i2 == -1 || i2 == 9683) {
                AbstractC25226BEj.A1Q(this);
                AbstractC25651Mw.A00(this.A01).E4s(new Object());
                AbstractC25651Mw.A00(this.A01).E4s(new Object());
                if (getContext() instanceof Activity) {
                    AbstractC31179DnN.A1K(this, 0);
                }
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        this.A03 = AbstractC35211Fg4.A01(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-641466168);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A01 = AbstractC31176DnK.A0S(this);
        this.A02 = AbstractC31173DnH.A0j(requireArguments, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
        this.A06 = requireArguments.getString("ARG_TITLE", requireContext().getString(2131973695));
        this.A05 = requireArguments.getString("ARG_SUB_TITLE", requireContext().getString(2131973694));
        BusinessFlowAnalyticsLogger A00 = AbstractC35211Fg4.A00(this.A03, this, this.A01);
        this.A00 = A00;
        if (A00 != null) {
            A00.Clo(new Y7A("create_post", this.A02, null, null, null, null, null, null));
        }
        C0f9.A09(532475056, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1505111734);
        View inflate = layoutInflater.inflate(R.layout.stacked_value_props, viewGroup, false);
        CallerContext callerContext = C35792FrU.A00;
        IgdsHeadline A0Q = AbstractC31179DnN.A0Q(inflate, R.id.stacked_value_props_headline);
        A0Q.EW2(R.drawable.instagram_new_post_outline_96, true);
        A0Q.setHeadline(this.A06);
        A0Q.setBody(this.A05);
        A0Q.setVisibility(0);
        int A01 = AbstractC31177DnL.A01(inflate, R.id.title_icon);
        AbstractC31172DnG.A1J(inflate, R.id.title, A01);
        AbstractC31172DnG.A1J(inflate, R.id.subtitle, A01);
        AbstractC31173DnH.A0D(inflate, R.id.divider).setVisibility(A01);
        BusinessNavBar businessNavBar = (BusinessNavBar) inflate.findViewById(R.id.navigation_bar);
        this.A04 = businessNavBar;
        if (businessNavBar != null) {
            businessNavBar.setPrimaryButtonText(2131956930);
            this.A04.A01(inflate.findViewById(R.id.scroll_view));
            this.A04.setPrimaryButtonOnclickListeners(new ViewOnClickListenerC35690FpP(this, 7));
        }
        C0f9.A09(667344933, A02);
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        int A02 = C0f9.A02(135705717);
        super.onStart();
        if (this.A02.equals("profile") && (getContext() instanceof Activity)) {
            AbstractC31179DnN.A1K(this, 8);
        }
        C0f9.A09(-227404053, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        int A02 = C0f9.A02(-487326068);
        super.onStop();
        if (this.A02.equals("profile") && (getContext() instanceof Activity)) {
            AbstractC31179DnN.A1K(this, 0);
        }
        C0f9.A09(-1333443333, A02);
    }
}
