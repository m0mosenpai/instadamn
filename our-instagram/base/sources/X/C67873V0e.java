package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.api.schemas.AdsAPIInstagramPosition;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import java.util.Map;

/* renamed from: X.V0e, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67873V0e extends AbstractC59962oe implements XEK, InterfaceC60122ou {
    public static final String __redex_internal_original_name = "PromotePreviewV2Fragment";
    public View A00;
    public SpinnerImageView A01;
    public final InterfaceC09390do A02;
    public final InterfaceC09390do A03;

    @Override // X.XEK
    public final void D8d(boolean z) {
        AbstractC65702TsY.A0q();
        Bundle bundle = new Bundle();
        bundle.putBoolean("enable_back_button", false);
        C67865Uzw c67865Uzw = new C67865Uzw();
        c67865Uzw.setArguments(bundle);
        C189448aO A0g = AbstractC25231BEo.A0g(this.A02);
        AbstractC25225BEi.A1Q(A0g, false);
        AbstractC31177DnL.A14(this, c67865Uzw, A0g);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "promote_story_eligible_preview";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        AbstractC65703TsZ.A1K(this);
        this.A01 = AbstractC31180DnO.A0V(view);
        this.A00 = view.requireViewById(R.id.preview_screen_content_view);
        AbstractC31180DnO.A1F(getViewLifecycleOwner(), ((UFJ) this.A03.getValue()).A02, new C50368MLv(this, 3), 50);
        AbstractC65702TsY.A1M(AbstractC43594JPz.A0N(this.A02), VG4.A08);
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return (AbstractC18680vv) this.A02.getValue();
    }

    public C67873V0e() {
        X32 x32 = new X32(this, 17);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new X32(new X32(this, 14), 15));
        this.A03 = new C60842q8(new X32(A00, 16), x32, new C57253Pbb(45, null, A00), new C0YZ(UFJ.class));
        this.A02 = AbstractC60492pY.A02(this);
    }

    @Override // X.XEK
    public final void DF9() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            C70170WEm c70170WEm = C70170WEm.A00;
            UserSession userSession = (UserSession) this.A02.getValue();
            InterfaceC09390do interfaceC09390do = this.A03;
            C38321qM c38321qM = ((UFJ) interfaceC09390do.getValue()).A00;
            Map map = ((UFJ) interfaceC09390do.getValue()).A01;
            c70170WEm.A03(activity, ((UFJ) interfaceC09390do.getValue()).A03, userSession, c38321qM, ((UFJ) interfaceC09390do.getValue()).A07, ((UFJ) interfaceC09390do.getValue()).A09, map);
        }
    }

    @Override // X.XEK
    public final void DGW() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            C70170WEm c70170WEm = C70170WEm.A00;
            UserSession userSession = (UserSession) this.A02.getValue();
            InterfaceC09390do interfaceC09390do = this.A03;
            C38321qM c38321qM = ((UFJ) interfaceC09390do.getValue()).A00;
            Map map = ((UFJ) interfaceC09390do.getValue()).A01;
            c70170WEm.A04(activity, ((UFJ) interfaceC09390do.getValue()).A03, userSession, c38321qM, ((UFJ) interfaceC09390do.getValue()).A07, map, ((UFJ) interfaceC09390do.getValue()).A0A);
        }
    }

    @Override // X.XEK
    public final void Ddc() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            C70170WEm c70170WEm = C70170WEm.A00;
            UserSession userSession = (UserSession) this.A02.getValue();
            InterfaceC09390do interfaceC09390do = this.A03;
            C38321qM c38321qM = ((UFJ) interfaceC09390do.getValue()).A00;
            Map map = ((UFJ) interfaceC09390do.getValue()).A01;
            String str = ((UFJ) interfaceC09390do.getValue()).A07;
            c70170WEm.A02(activity, ((UFJ) interfaceC09390do.getValue()).A03, userSession, c38321qM, ((UFJ) interfaceC09390do.getValue()).A06, str, ((UFJ) interfaceC09390do.getValue()).A08, map);
        }
    }

    @Override // X.XEK
    public final void DpD() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            UserSession userSession = (UserSession) this.A02.getValue();
            Map map = ((UFJ) this.A03.getValue()).A01;
            C14360o3.A0B(userSession, 1);
            C70170WEm.A00(activity, (LEI) map.get(AdsAPIInstagramPosition.A0F), userSession);
        }
    }

    @Override // X.XEK
    public final void DpE() {
        AbstractC31177DnL.A0u(requireActivity(), (UserSession) this.A02.getValue(), C2Fb.A35, MSV.A00(467));
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        AbstractC25235BEs.A1H(interfaceC56362iU);
        interfaceC56362iU.Efu(2131970828);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-793286884);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.promote_preview, false);
        C0f9.A09(503513613, A02);
        return A0R;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-1268872605);
        super.onDestroyView();
        this.A00 = null;
        this.A01 = null;
        C0f9.A09(-2131691864, A02);
    }
}
