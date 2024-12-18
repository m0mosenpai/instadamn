package X;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.api.DevOptionsPreferenceAdapter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/* renamed from: X.El1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33213El1 extends AbstractC33235ElU implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "IgBloksNativeHybridFragment";
    public UserSession A00;
    public DevOptionsPreferenceAdapter A01;

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "ig_bloks_native_hybrid_options";
    }

    public static void A00(C33213El1 c33213El1, C65981Txa c65981Txa) {
        HashMap A01 = AbstractC191768eY.A01(AbstractC166987dD.A1G());
        IgBloksScreenConfig A0C = AbstractC31171DnF.A0C(c33213El1.A00);
        A0C.A0R = "com.bloks.www.bloks.demos.cds.nativebottomsheet";
        A0C.A0C = c65981Txa;
        C66277U6x A02 = C66277U6x.A02("com.bloks.www.bloks.demos.cds.nativebottomsheet", A01, Collections.emptyMap());
        A02.A00 = 719983200;
        A02.A06(c33213El1.requireContext(), A0C);
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        AbstractC25229BEm.A1G(interfaceC56362iU, 2131957844);
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return this.A00;
    }

    @Override // X.AbstractC33235ElU, X.AbstractC60672pq, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(624325669);
        super.onCreate(bundle);
        this.A00 = AbstractC31176DnK.A0S(this);
        C0f9.A09(556345493, A02);
    }

    @Override // X.AbstractC33235ElU, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        AbstractC31174DnI.A0G(this).setBackgroundColor(AbstractC53242c7.A00(requireContext()));
        Context context = getContext();
        ArrayList A1E = AbstractC166987dD.A1E();
        C31335Dq0.A03(A1E, 2131957860);
        AbstractC25235BEs.A1C(requireContext(), new ViewOnClickListenerC35683FpI(4, this, C62862tP.A03(this, this.A00, null)), A1E, 2131957845);
        AbstractC25235BEs.A1C(requireContext(), new Fp1(this, 31), A1E, 2131957859);
        AbstractC25235BEs.A1C(requireContext(), new Fp1(this, 34), A1E, 2131957862);
        C31335Dq0.A03(A1E, 2131957857);
        AbstractC25235BEs.A1C(requireContext(), new Fp1(this, 35), A1E, 2131957858);
        GHY.A01(AbstractC31173DnH.A07(this, new C31335Dq0("Bloks Screen Query Examples"), A1E), new Fp1(this, 36), "Simple Screen Query Example", A1E);
        GHY.A01(requireContext(), new Fp1(this, 37), "Prebundled Screen Query Example", A1E);
        C31335Dq0.A03(A1E, 2131957856);
        AbstractC25235BEs.A1C(requireContext(), new Fp1(this, 38), A1E, 2131957854);
        AbstractC25235BEs.A1C(requireContext(), new Fp1(this, 28), A1E, 2131957852);
        AbstractC25235BEs.A1C(requireContext(), new Fp1(this, 29), A1E, 2131957853);
        AbstractC25235BEs.A1C(requireContext(), new ViewOnClickListenerC35683FpI(3, this, context), A1E, 2131957855);
        AbstractC25235BEs.A1C(requireContext(), new Fp1(this, 30), A1E, 2131957851);
        C31335Dq0.A03(A1E, 2131957849);
        AbstractC25235BEs.A1C(requireContext(), new ViewOnClickListenerC35683FpI(5, this, context), A1E, 2131957850);
        C31335Dq0.A03(A1E, 2131957846);
        AbstractC25235BEs.A1C(requireContext(), new Fp1(this, 32), A1E, 2131957847);
        AbstractC25235BEs.A1C(requireContext(), new Fp1(this, 33), A1E, 2131957848);
        DevOptionsPreferenceAdapter devOptionsPreferenceAdapter = new DevOptionsPreferenceAdapter(getActivity(), this.A00, this);
        this.A01 = devOptionsPreferenceAdapter;
        devOptionsPreferenceAdapter.setUnfilteredItems(A1E);
        getScrollingViewProxy().EPJ(this.A01);
        this.A01.getFilter().filter(null);
    }
}
