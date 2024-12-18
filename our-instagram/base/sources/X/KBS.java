package X;

import android.content.Context;
import android.os.Bundle;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ListView;
import com.facebook.R;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.ui.widget.spinner.SpinnerImageView;

/* loaded from: classes8.dex */
public final class KBS extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "ImmersiveAvatarHomeFragment";
    public ListView A00;
    public C55555Olp A01;
    public C44418JkD A02;
    public SpinnerImageView A03;
    public Boolean A04;
    public final C48240LWp A05;
    public final InterfaceC09390do A06;
    public final InterfaceC09390do A07;
    public final InterfaceC09390do A08;
    public final InterfaceC09390do A09 = C50254MHj.A01(this, 2);
    public final InterfaceC09390do A0A;

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "immersive_avatar_home";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        View A0S = AbstractC166997dE.A0S(view, R.id.avatar_home_button_back);
        this.A03 = (SpinnerImageView) view.requireViewById(R.id.avatar_home_loading_spinner);
        ViewOnClickListenerC48064LPp.A00(A0S, 3, this);
        SpinnerImageView spinnerImageView = this.A03;
        if (spinnerImageView != null) {
            AbstractC31171DnF.A1M(spinnerImageView);
        }
        ((C44515JmL) this.A07.getValue()).A00();
    }

    public static final void A00(KBS kbs, boolean z) {
        ListView listView = kbs.A00;
        if (listView != null) {
            int childCount = listView.getChildCount();
            int i = 0;
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = listView.getChildAt(i2);
                C14360o3.A07(childAt);
                View A0S = AbstractC166997dE.A0S(childAt, R.id.entrypoint_icon);
                int A0E = AbstractC167017dG.A0E(kbs.requireContext());
                int width = A0S.getWidth() + A0E + AbstractC167017dG.A04(kbs.requireContext());
                if (z) {
                    View A0S2 = AbstractC166997dE.A0S(childAt, R.id.entrypoint_label);
                    Object systemService = kbs.requireContext().getSystemService("window");
                    C14360o3.A0C(systemService, AbstractC58317Pt9.A00(2));
                    Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
                    A0S2.measure(defaultDisplay.getWidth(), defaultDisplay.getHeight());
                    width += A0S2.getMeasuredWidth();
                }
                i = Math.max(i, width);
            }
            AbstractC43592JPx.A1G(listView, i);
        }
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A0A);
    }

    public KBS() {
        C50254MHj A02 = C50254MHj.A02(this, 0);
        C50254MHj A022 = C50254MHj.A02(this, 6);
        EnumC09460dv enumC09460dv = EnumC09460dv.A02;
        InterfaceC09390do A00 = C50254MHj.A00(A022, enumC09460dv, 7);
        this.A07 = AbstractC25225BEi.A0a(C50254MHj.A02(A00, 8), A02, new MHV(31, (Object) null, A00), AbstractC25225BEi.A1D(C44515JmL.class));
        C37048GUe c37048GUe = new C37048GUe(this, 49);
        InterfaceC09390do A002 = C50254MHj.A00(C50254MHj.A02(this, 9), enumC09460dv, 10);
        this.A06 = AbstractC25225BEi.A0a(C50254MHj.A02(A002, 11), c37048GUe, new MHV(32, (Object) null, A002), AbstractC25225BEi.A1D(C44509JmF.class));
        C50254MHj A023 = C50254MHj.A02(this, 1);
        InterfaceC09390do A003 = C50254MHj.A00(C50254MHj.A02(this, 3), enumC09460dv, 4);
        this.A08 = AbstractC25225BEi.A0a(C50254MHj.A02(A003, 5), A023, new MHV(30, (Object) null, A003), AbstractC25225BEi.A1D(C44474Jlg.class));
        this.A05 = new C48240LWp(this, 0);
        this.A0A = AbstractC60492pY.A02(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Boolean bool;
        int A02 = C0f9.A02(-1122495287);
        super.onCreate(bundle);
        InterfaceC09390do interfaceC09390do = this.A09;
        ((C006802i) interfaceC09390do.getValue()).markerStart(116928509);
        ((C006802i) interfaceC09390do.getValue()).markerAnnotate(116928509, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, "ig_self_profile");
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            bool = AbstractC31174DnI.A0n(bundle2, "coin_flip_enabled");
        } else {
            bool = null;
        }
        this.A04 = bool;
        C0f9.A09(-239361489, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-979288913);
        C14360o3.A0B(layoutInflater, 0);
        this.A01 = new C55555Olp(null, AbstractC166987dD.A0r(this.A0A));
        View inflate = layoutInflater.inflate(R.layout.avatar_immersive_home_fragment, viewGroup, false);
        C55555Olp c55555Olp = this.A01;
        if (c55555Olp != null) {
            this.mLifecycleRegistry.A09(c55555Olp);
        }
        C55555Olp c55555Olp2 = this.A01;
        if (c55555Olp2 != null) {
            Context requireContext = requireContext();
            AbstractC43592JPx.A1T(inflate);
            c55555Olp2.A00(requireContext, (ViewGroup) inflate, new C50526MSf(3, 0, false), "", AbstractC25235BEs.A0S(this));
        }
        this.A00 = (ListView) inflate.requireViewById(R.id.entrypoints_list);
        C07S c07s = C07S.STARTED;
        C07X viewLifecycleOwner = getViewLifecycleOwner();
        C57312k6 A00 = C07Y.A00(viewLifecycleOwner);
        MCQ mcq = new MCQ(viewLifecycleOwner, c07s, this, null, 32);
        AnonymousClass191 anonymousClass191 = AnonymousClass191.A00;
        AbstractC23641Du.A05(anonymousClass191, mcq, A00);
        C07X A0K = AbstractC31173DnH.A0K(this, anonymousClass191, new MBq(this, null, 16), AbstractC25229BEm.A0a(this));
        C07X A0K2 = AbstractC31173DnH.A0K(this, anonymousClass191, new MCQ(A0K, c07s, this, null, 34), C07Y.A00(A0K));
        AbstractC23641Du.A05(anonymousClass191, new MCQ(A0K2, c07s, this, null, 33), C07Y.A00(A0K2));
        C55555Olp c55555Olp3 = this.A01;
        if (c55555Olp3 != null) {
            AbstractC52922bZ A0Z = AbstractC25225BEi.A0Z(this.A06);
            AbstractC23641Du.A05(anonymousClass191, new MCJ(c55555Olp3, A0Z, null, 12), AbstractC141776au.A00(A0Z));
        }
        C07X viewLifecycleOwner2 = getViewLifecycleOwner();
        AbstractC23641Du.A05(anonymousClass191, new MCQ(viewLifecycleOwner2, c07s, this, null, 35), C07Y.A00(viewLifecycleOwner2));
        C0f9.A09(-1585305026, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(465578382);
        C55555Olp c55555Olp = this.A01;
        if (c55555Olp != null) {
            this.mLifecycleRegistry.A0A(c55555Olp);
        }
        super.onDestroyView();
        C0f9.A09(148828524, A02);
    }
}
