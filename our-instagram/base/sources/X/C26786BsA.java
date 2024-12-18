package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import java.util.HashMap;

/* renamed from: X.BsA, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26786BsA extends AbstractC59962oe implements InterfaceC60072op {
    public static final String __redex_internal_original_name = "CheckoutOnboardingFragment";
    public UserSession A00;
    public boolean A01;

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "CHECKOUT_ONBOARDING_FRAGMENT";
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        return false;
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        UserSession userSession = this.A00;
        if (userSession != null) {
            return userSession;
        }
        C14360o3.A0F("session");
        throw C00O.createAndThrow();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String str;
        int A02 = C0f9.A02(-833703849);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            if (bundle2.getBoolean(AbstractC111324zv.A00(4733))) {
                str = "com.bloks.www.bloks.commerce.onboarding.mcc.start.async";
            } else {
                str = "com.bloks.www.bloks.commerce.onboarding.start.async";
            }
            UserSession A06 = C023409i.A0A.A06(bundle2);
            this.A00 = A06;
            C62862tP A04 = C62862tP.A04(requireActivity(), new C19270xB("CHECKOUT_ONBOARDING_FRAGMENT"), A06);
            UserSession userSession = this.A00;
            if (userSession != null) {
                Bundle bundle3 = this.mArguments;
                if (bundle3 != null) {
                    String string = bundle3.getString("waterfall_id");
                    String string2 = bundle3.getString(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
                    String string3 = bundle3.getString("prior_module");
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
                    C54s c54s2 = new C54s(c913045j);
                    c54s2.A0C(c54s, AbstractC111324zv.A00(266));
                    HashMap A1G = AbstractC166987dD.A1G();
                    A1G.put("params", c54s2.toString());
                    AbstractC192798gL A05 = C192108fB.A05(userSession, str, A1G);
                    A05.A00(new C26911BuE(4, A04, this));
                    schedule(A05);
                    C0f9.A09(-752721039, A02);
                    return;
                }
                throw AbstractC166997dE.A0g();
            }
            C14360o3.A0F("session");
            throw C00O.createAndThrow();
        }
        IllegalStateException A0g = AbstractC166997dE.A0g();
        C0f9.A09(-1948161066, A02);
        throw A0g;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-959268696);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout_recyclerview, viewGroup, false);
        C0f9.A09(-893191388, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(-1303110990);
        super.onResume();
        if (this.A01) {
            AbstractC25226BEj.A1P(this);
        }
        C0f9.A09(816546192, A02);
    }
}
