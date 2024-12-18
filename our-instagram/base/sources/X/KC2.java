package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;

/* loaded from: classes8.dex */
public final class KC2 extends AbstractC59962oe implements InterfaceC60072op {
    public static final String __redex_internal_original_name = "FriendMapHidePlacesBottomSheetFragment";
    public final InterfaceC09390do A00;
    public final InterfaceC09390do A01;
    public final InterfaceC09390do A02 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A02);
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        LHE.A01(this, C50248MHd.A01(this, 22), true);
        return true;
    }

    public KC2() {
        C0YZ A1D = AbstractC25225BEi.A1D(C45999KXn.class);
        this.A00 = AbstractC25225BEi.A0a(C50248MHd.A01(this, 24), C50248MHd.A01(this, 25), new ME1(36, null, this), A1D);
        C50248MHd A01 = C50248MHd.A01(this, 23);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, C50248MHd.A01(C50248MHd.A01(this, 26), 27));
        this.A01 = AbstractC25225BEi.A0a(C50248MHd.A01(A00, 28), A01, new ME1(37, null, A00), AbstractC25225BEi.A1D(C45994KXi.class));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-148281810);
        ComposeView A00 = AbstractC25319BIo.A00(this, new C30191DRw(this, 29), -106968200);
        C0f9.A09(1125682225, A02);
        return A00;
    }
}
