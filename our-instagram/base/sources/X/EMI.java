package X;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.nux.aymh.viewmodel.AymhViewModel;
import com.instagram.nux.ui.NetzDgTermsTextView;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public final class EMI extends AbstractC59962oe implements GZL {
    public static final String __redex_internal_original_name = "AymhLoginLandingFragment";
    public C31873Dzf A00;
    public AymhViewModel A01;
    public C35020Fbt A02;
    public final InterfaceC09390do A03 = AbstractC25235BEs.A0t(this, 38);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "aymh";
    }

    @Override // X.GZL
    public final void F8k(C51757Mtg c51757Mtg) {
        InterfaceC09390do interfaceC09390do = this.A03;
        interfaceC09390do.getValue();
        C006802i c006802i = C006802i.A0p;
        c006802i.markerStart(2293785);
        c006802i.markerAnnotate(2293785, "login_flow", "prod");
        C35031Fc4.A00.A01(AbstractC166987dD.A0o(interfaceC09390do), null, null, null, null, "aymh", c51757Mtg.A05());
        AymhViewModel aymhViewModel = this.A01;
        if (aymhViewModel == null) {
            C14360o3.A0F("aymhViewModel");
            throw C00O.createAndThrow();
        }
        aymhViewModel.A01(c51757Mtg, (C07270a1) interfaceC09390do.getValue(), null, null);
    }

    @Override // X.GZL
    public final void F8l(C51757Mtg c51757Mtg) {
        C193328hC A0b;
        String string;
        Intent intent;
        Bundle extras;
        String string2;
        AbstractC35102FdD.A02(AbstractC166987dD.A0o(this.A03), EnumC31713DwI.A0G, c51757Mtg.A05());
        List list = (List) c51757Mtg.A00;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((E6N) it.next()).A01 == C05F.A0Y) {
                    A0b = AbstractC31176DnK.A0b(this);
                    FragmentActivity activity = getActivity();
                    if (activity != null && (intent = activity.getIntent()) != null && (extras = intent.getExtras()) != null && (string2 = extras.getString("current_username")) != null && string2.length() != 0) {
                        string = AbstractC31174DnI.A0w(this, string2, 2131963012);
                    } else {
                        string = getString(2131963011);
                    }
                    C14360o3.A07(string);
                    A0b.A05 = string;
                    AbstractC31179DnN.A11(this, A0b, 2131963029);
                    A0b.A0d(null, AbstractC25227BEk.A0v(this, 2131968948));
                    AbstractC166987dD.A1W(A0b);
                }
            }
        }
        A0b = AbstractC31176DnK.A0b(this);
        A0b.A0A(2131972172);
        AbstractC31179DnN.A11(this, A0b, 2131972173);
        DialogInterfaceOnClickListenerC35455FkC.A01(A0b, c51757Mtg, this, 45, 2131972171);
        A0b.A0D(DialogInterfaceOnClickListenerC35455FkC.A00(c51757Mtg, this, 46));
        AbstractC166987dD.A1W(A0b);
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A03);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            if (AbstractC31171DnF.A0a(bundle2) != null && bundle2.getBoolean("ARGUMENT_SHOW_LOGIN_FOR_CONTENT_DIALOG")) {
                C193328hC A00 = AbstractC35254Fgn.A00(AbstractC31172DnG.A04(this));
                A00.A0A(2131965779);
                AbstractC31176DnK.A1W(A00);
                bundle2.remove("ARGUMENT_SHOW_LOGIN_FOR_CONTENT_DIALOG");
                return;
            }
            if (!bundle2.getBoolean("should_show_youth_regulation_block", false)) {
                return;
            }
            bundle2.remove("should_show_youth_regulation_block");
            Activity rootActivity = getRootActivity();
            if (rootActivity == null) {
                return;
            }
            FEC.A00.A00(rootActivity);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-1654388863);
        super.onCreate(bundle);
        FragmentActivity requireActivity = requireActivity();
        InterfaceC09390do interfaceC09390do = this.A03;
        AbstractC12990ll A0o = AbstractC166987dD.A0o(interfaceC09390do);
        C14360o3.A0B(A0o, 2);
        this.A02 = new C35020Fbt(requireActivity, A0o, false);
        registerLifecycleListener(new EVI(getActivity(), this, (C07270a1) interfaceC09390do.getValue(), EnumC31713DwI.A0G));
        C0f9.A09(-726101396, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        int A02 = C0f9.A02(1941793941);
        C14360o3.A0B(layoutInflater, 0);
        ViewGroup viewGroup2 = (ViewGroup) AbstractC31175DnJ.A07(layoutInflater, viewGroup, R.layout.one_tap_login_landing_fragment, false);
        viewGroup2.removeAllViews();
        AbstractC31175DnJ.A06(this).inflate(R.layout.aymh_multiple_users, viewGroup2);
        this.A00 = new C31873Dzf(this);
        View findViewById = viewGroup2.findViewById(R.id.aymh_recycler_view);
        C14360o3.A0C(findViewById, AbstractC111324zv.A00(9));
        RecyclerView recyclerView = (RecyclerView) findViewById;
        AbstractC31178DnM.A0z(this, recyclerView);
        C31873Dzf c31873Dzf = this.A00;
        if (c31873Dzf == null) {
            str = "aymhAdapter";
        } else {
            recyclerView.setAdapter(c31873Dzf);
            C31470DsE c31470DsE = new C31470DsE(this, 24);
            this.A01 = (AymhViewModel) AbstractC31175DnJ.A0A(this).A00(AymhViewModel.class);
            java.util.Set A07 = AbstractC16830sb.A07(EnumC33446EqJ.A07, EnumC33446EqJ.A0A, EnumC33446EqJ.A09, EnumC33446EqJ.A06, EnumC33446EqJ.A05);
            AymhViewModel aymhViewModel = this.A01;
            str = "aymhViewModel";
            if (aymhViewModel != null) {
                FragmentActivity requireActivity = requireActivity();
                InterfaceC09390do interfaceC09390do = this.A03;
                Object value = interfaceC09390do.getValue();
                C12L c12l = C12L.A00;
                AbstractC167027dH.A13(value, A07, c12l);
                AbstractC166987dD.A1Z(new JTH(requireActivity, aymhViewModel, A07, c12l, value, (InterfaceC23621Ds) null, 45), AbstractC141776au.A00(aymhViewModel));
                AymhViewModel aymhViewModel2 = this.A01;
                if (aymhViewModel2 != null) {
                    AbstractC31172DnG.A0F(aymhViewModel2.A08).A06(this, c31470DsE);
                    View findViewById2 = viewGroup2.findViewById(R.id.netz_dg_terms_text_view);
                    C14360o3.A0C(findViewById2, "null cannot be cast to non-null type com.instagram.nux.ui.NetzDgTermsTextView");
                    ((NetzDgTermsTextView) findViewById2).A00(AbstractC166987dD.A0o(interfaceC09390do));
                    TextView A0Q = AbstractC25230BEn.A0Q(viewGroup2, R.id.left_button);
                    AbstractC25227BEk.A12(A0Q, this, 2131975048);
                    AbstractC56952jT.A01(A0Q);
                    ViewOnClickListenerC35667Fp2.A00(A0Q, 17, this);
                    TextView A0Q2 = AbstractC25230BEn.A0Q(viewGroup2, R.id.right_button);
                    AbstractC25227BEk.A12(A0Q2, this, 2131968888);
                    AbstractC56952jT.A01(A0Q2);
                    ViewOnClickListenerC35667Fp2.A00(A0Q2, 18, this);
                    AbstractC35081Fcs.A01(A0Q, A0Q2);
                    View findViewById3 = viewGroup2.findViewById(R.id.login_landing_logo);
                    C14360o3.A0C(findViewById3, "null cannot be cast to non-null type android.widget.ImageView");
                    AbstractC31180DnO.A10(requireContext(), (ImageView) findViewById3);
                    C35203Ffv.A01(AbstractC166987dD.A0o(interfaceC09390do), "aymh");
                    C0f9.A09(-955211950, A02);
                    return viewGroup2;
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }
}
