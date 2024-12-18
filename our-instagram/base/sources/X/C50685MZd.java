package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import com.instagram.settings2.core.viewmodel.SettingsScreenViewModel;

/* renamed from: X.MZd, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50685MZd extends AbstractC59962oe implements InterfaceC60122ou, InterfaceC55792hK {
    public static final String __redex_internal_original_name = "SettingsScreenFragment";
    public C189478aR A00;
    public final InterfaceC09390do A01;
    public final InterfaceC09390do A02;
    public final InterfaceC09390do A03;
    public final InterfaceC09390do A04;
    public final InterfaceC09390do A05;
    public final InterfaceC09390do A06 = AbstractC60492pY.A02(this);
    public final InterfaceC09390do A07;
    public final InterfaceC09390do A08;

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        interfaceC56362iU.EkF(false);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        C3DI c3di = this._fragmentVisibilityDetector;
        if (c3di != null) {
            c3di.A01(this);
            super.onViewCreated(view, bundle);
            C07S c07s = C07S.STARTED;
            C07X viewLifecycleOwner = getViewLifecycleOwner();
            AbstractC166987dD.A1Z(new C57166PZk(c07s, this, viewLifecycleOwner, null, 12), C07Y.A00(viewLifecycleOwner));
            if (bundle != null) {
                A00(this).A05();
            }
            if (this.A05.getValue() == EnumC72365Xc1.A07) {
                MSY.A1Q(this.A04);
                return;
            }
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    public static final SettingsScreenViewModel A00(C50685MZd c50685MZd) {
        return (SettingsScreenViewModel) c50685MZd.A08.getValue();
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return MSZ.A0t((EnumC72365Xc1) this.A05.getValue());
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A06);
    }

    public C50685MZd() {
        EnumC09460dv enumC09460dv = EnumC09460dv.A02;
        this.A05 = AbstractC09440dt.A00(enumC09460dv, new C43205J8c(this, 4));
        this.A03 = AbstractC09440dt.A00(enumC09460dv, new C43205J8c(this, 2));
        this.A01 = AbstractC09440dt.A00(enumC09460dv, new C37061GUv(this, 47));
        C43205J8c c43205J8c = new C43205J8c(this, 8);
        InterfaceC09390do A00 = AbstractC09440dt.A00(enumC09460dv, new C43205J8c(new C43205J8c(this, 5), 6));
        this.A08 = AbstractC25225BEi.A0a(new C43205J8c(A00, 7), c43205J8c, new C57252Pba(30, null, A00), AbstractC25225BEi.A1D(SettingsScreenViewModel.class));
        this.A07 = C1XM.A00(C57453Pep.A00);
        this.A02 = C1XM.A00(new C43205J8c(this, 1));
        this.A04 = AbstractC09440dt.A00(enumC09460dv, new C43205J8c(this, 3));
    }

    @Override // X.InterfaceC55792hK
    public final void DIC(Fragment fragment, boolean z) {
        SettingsScreenViewModel A00 = A00(this);
        if (z) {
            A00.A05();
        } else {
            AbstractC25229BEm.A1R(A00.A03);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-316401911);
        ComposeView A00 = AbstractC25319BIo.A00(this, new DSA(49, bundle, this), 48778782);
        C0f9.A09(-509036986, A02);
        return A00;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(2067766378);
        super.onResume();
        C0f9.A09(-395960216, A02);
    }
}
