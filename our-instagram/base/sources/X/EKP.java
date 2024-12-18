package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;

/* loaded from: classes6.dex */
public final class EKP extends AbstractC59962oe implements InterfaceC60072op {
    public static final String __redex_internal_original_name = "OffsiteOnboardingFragment";
    public boolean A00;
    public UserSession A01;

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "OFFSITE_ONBOARDING_FRAGMENT";
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        return false;
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        UserSession userSession = this.A01;
        if (userSession == null) {
            AbstractC31171DnF.A0y();
            throw C00O.createAndThrow();
        }
        return userSession;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-558747248);
        super.onCreate(bundle);
        UserSession A0S = AbstractC31176DnK.A0S(this);
        this.A01 = A0S;
        if (A0S != null) {
            C62862tP A0O = AbstractC31172DnG.A0O(requireActivity(), new C35965FuP(), A0S);
            UserSession userSession = this.A01;
            if (userSession != null) {
                Bundle requireArguments = requireArguments();
                String string = requireArguments.getString("waterfall_id");
                String string2 = requireArguments.getString(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
                String string3 = requireArguments.getString("prior_module");
                String string4 = requireArguments.getString("presentation_style");
                C913045j c913045j = C913045j.A00;
                C54s c54s = new C54s(c913045j);
                if (string2 == null) {
                    string2 = "";
                }
                c54s.A0F(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, string2);
                if (string == null) {
                    string = "";
                }
                c54s.A0F("waterfall_id", string);
                if (string3 == null) {
                    string3 = "";
                }
                c54s.A0F("prior_module", string3);
                if (string4 == null) {
                    string4 = "";
                }
                c54s.A0F("presentation_style", string4);
                AbstractC192798gL A05 = C192108fB.A05(userSession, "com.bloks.www.bloks.commerce.offsite.onboarding.start.async", AbstractC31179DnN.A0f(c54s, c913045j));
                C32394EOv.A00(A05, A0O, this, 19);
                schedule(A05);
                C0f9.A09(-1416812703, A02);
                return;
            }
        }
        C14360o3.A0F("userSession");
        throw C00O.createAndThrow();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-77411302);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout_recyclerview, viewGroup, false);
        C0f9.A09(-182221466, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(-1340294721);
        super.onResume();
        if (this.A00) {
            AbstractC25226BEj.A1P(this);
        }
        C0f9.A09(677783267, A02);
    }
}
