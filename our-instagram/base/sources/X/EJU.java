package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.facebook.R;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;

/* loaded from: classes6.dex */
public final class EJU extends AbstractC59962oe implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "TwoFacLandingFragment";
    public Bundle A00;
    public ViewStub A01;
    public ViewStub A02;
    public boolean A03;
    public final InterfaceC09390do A06 = AbstractC60492pY.A02(this);
    public final InterfaceC09390do A04 = AbstractC09440dt.A01(new C57248PbW(this, 0));
    public final InterfaceC09390do A05 = AbstractC09440dt.A01(new C57248PbW(this, 1));
    public final InterfaceC09390do A07 = AbstractC09440dt.A01(new C57248PbW(this, 2));

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        AbstractC31175DnJ.A1I(interfaceC56362iU, getString(2131975912));
        interfaceC56362iU.EkG(this.A03);
        interfaceC56362iU.setIsLoading(this.A03);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return AbstractC31182DnR.A02();
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        ViewStub viewStub = this.A01;
        if (viewStub == null) {
            C14360o3.A0F("loadingViewStub");
            throw C00O.createAndThrow();
        }
        viewStub.inflate();
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A06);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(1131148672);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        InterfaceC09390do interfaceC09390do = this.A06;
        AbstractC12990ll A0o = AbstractC166987dD.A0o(interfaceC09390do);
        String A13 = AbstractC31172DnG.A13(requireArguments, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
        C14360o3.A07(A13);
        C14360o3.A0B(A0o, 0);
        if (!NetInfoModule.CONNECTION_TYPE_NONE.equals(A13)) {
            C1QE.A00(C34918Fa4.A01, "two_factor").A08();
            C34918Fa4.A00 = null;
        }
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(C34918Fa4.A01, A0o), "instagram_two_fac_setup_entry");
        A0f.AAP(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, A13);
        AbstractC31181DnP.A0c(A0f);
        A0f.Cht();
        AbstractC35075Fcm.A02(AbstractC166987dD.A0r(interfaceC09390do), "education");
        C0f9.A09(575795709, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-4914501);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.two_fac_landing_fragment, viewGroup, false);
        this.A01 = AbstractC31171DnF.A07(inflate, R.id.two_fac_loading_spinner_stub);
        this.A02 = AbstractC31171DnF.A07(inflate, R.id.two_fac_landing_success_stub);
        EVO.A01(this);
        C0f9.A09(2031407002, A02);
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        int A02 = C0f9.A02(770611821);
        super.onStart();
        C1ON A01 = AbstractC35177FfU.A01(requireContext(), AbstractC166987dD.A0r(this.A06));
        A01.A00 = (C1P1) this.A04.getValue();
        schedule(A01);
        C0f9.A09(1932334383, A02);
    }
}
