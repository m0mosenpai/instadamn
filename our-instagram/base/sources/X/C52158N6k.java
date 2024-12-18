package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.FragmentActivity;
import com.instagram.profilecard.domain.ProfileCardViewModel;

/* renamed from: X.N6k, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52158N6k extends AbstractC59962oe implements InterfaceC60442pS {
    public static final String __redex_internal_original_name = "ProfileCardFragment";
    public final InterfaceC09390do A03;
    public final InterfaceC09390do A05;
    public final InterfaceC09390do A01 = C1XM.A00(new C57244PbS(this, 41));
    public final InterfaceC09390do A02 = C1XM.A00(new C57244PbS(this, 42));
    public final InterfaceC09390do A04 = C1XM.A00(new C57244PbS(this, 43));
    public final InterfaceC09390do A00 = C1XM.A00(new C57244PbS(this, 40));

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    @Override // X.InterfaceC60442pS
    public final boolean isOrganicEligible() {
        return false;
    }

    @Override // X.InterfaceC60442pS
    public final boolean isSponsoredEligible() {
        return false;
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A03);
    }

    public C52158N6k() {
        C57244PbS c57244PbS = new C57244PbS(this, 47);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new C57244PbS(new C57244PbS(this, 44), 45));
        this.A05 = AbstractC25225BEi.A0a(new C57244PbS(A00, 46), c57244PbS, new C57257Pbf(22, null, A00), AbstractC25225BEi.A1D(ProfileCardViewModel.class));
        this.A03 = AbstractC60492pY.A02(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(2035468002);
        ProfileCardViewModel profileCardViewModel = (ProfileCardViewModel) this.A05.getValue();
        C25671My A00 = AbstractC25651Mw.A00(profileCardViewModel.A0F);
        A00.A01(profileCardViewModel.A0E, C36115Fwp.class);
        A00.A01(profileCardViewModel.A0A, C36099FwZ.class);
        A00.A01(profileCardViewModel.A0C, C36089FwP.class);
        A00.A01(profileCardViewModel.A0B, C36101Fwb.class);
        ComposeView A002 = AbstractC25319BIo.A00(this, new C30189DRu(this, 23), -1261705210);
        C0f9.A09(-365839002, A02);
        return A002;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(1444340892);
        super.onDestroy();
        InterfaceC09390do interfaceC09390do = this.A05;
        ProfileCardViewModel profileCardViewModel = (ProfileCardViewModel) interfaceC09390do.getValue();
        C25671My A00 = AbstractC25651Mw.A00(profileCardViewModel.A0F);
        A00.A02(profileCardViewModel.A0E, C36115Fwp.class);
        A00.A02(profileCardViewModel.A0A, C36099FwZ.class);
        A00.A02(profileCardViewModel.A0C, C36089FwP.class);
        A00.A02(profileCardViewModel.A0B, C36101Fwb.class);
        ProfileCardViewModel profileCardViewModel2 = (ProfileCardViewModel) interfaceC09390do.getValue();
        InterfaceC678133v interfaceC678133v = profileCardViewModel2.A03;
        if (interfaceC678133v != null) {
            interfaceC678133v.release();
        }
        profileCardViewModel2.A07 = false;
        C0f9.A09(2088062676, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(-2073347238);
        super.onPause();
        ProfileCardViewModel profileCardViewModel = (ProfileCardViewModel) this.A05.getValue();
        InterfaceC678133v interfaceC678133v = profileCardViewModel.A03;
        if (interfaceC678133v != null && interfaceC678133v.isPlaying()) {
            interfaceC678133v.pause();
            profileCardViewModel.A07 = true;
        }
        C0f9.A09(-1792002357, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        Window window;
        int A02 = C0f9.A02(1109005308);
        super.onResume();
        FragmentActivity activity = getActivity();
        if (activity != null && (window = activity.getWindow()) != null) {
            window.addFlags(512);
        }
        ProfileCardViewModel profileCardViewModel = (ProfileCardViewModel) this.A05.getValue();
        if (profileCardViewModel.A07) {
            InterfaceC678133v interfaceC678133v = profileCardViewModel.A03;
            if (interfaceC678133v != null) {
                interfaceC678133v.E4S();
            }
            profileCardViewModel.A07 = false;
        }
        C0f9.A09(1866608626, A02);
    }
}
