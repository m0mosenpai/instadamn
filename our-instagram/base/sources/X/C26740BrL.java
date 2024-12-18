package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;

/* renamed from: X.BrL, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26740BrL extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "BlendContextBottomSheetFragment";
    public final InterfaceC09390do A00;
    public final InterfaceC09390do A01;
    public final InterfaceC09390do A02;
    public final InterfaceC09390do A03;
    public final InterfaceC09390do A04 = AbstractC60492pY.A02(this);
    public final InterfaceC09390do A05;

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return MSV.A00(985);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C07S c07s = C07S.STARTED;
        C07X viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC166987dD.A1Z(new C57159PZd(viewLifecycleOwner, c07s, this, null, 7), C07Y.A00(viewLifecycleOwner));
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A04);
    }

    public C26740BrL() {
        EnumC09460dv enumC09460dv = EnumC09460dv.A02;
        this.A00 = DH5.A01(this, AbstractC111324zv.A00(593), enumC09460dv, 41);
        this.A03 = DH5.A01(this, AbstractC111324zv.A00(594), enumC09460dv, 42);
        this.A02 = AbstractC09440dt.A00(enumC09460dv, new D6B(this));
        this.A01 = AbstractC09440dt.A00(enumC09460dv, new D6C(this));
        D88 d88 = new D88(this, 5);
        InterfaceC09390do A00 = AbstractC09440dt.A00(enumC09460dv, new D88(new D88(this, 2), 3));
        this.A05 = AbstractC25225BEi.A0a(new D88(A00, 4), d88, new D8K(34, null, A00), AbstractC25225BEi.A1D(C25859BcE.class));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(1085593548);
        super.onCreate(bundle);
        C25859BcE c25859BcE = (C25859BcE) this.A05.getValue();
        KZA kza = c25859BcE.A00;
        String str = c25859BcE.A02;
        C14360o3.A0B(str, 0);
        AbstractC166987dD.A1Z(new C50120MBu(kza, str, null, 27), ((C4A7) kza).A01);
        C0f9.A09(1074768953, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(325050229);
        ComposeView A00 = AbstractC25319BIo.A00(this, new C30506Dbp(this, 21), 1072562391);
        C0f9.A09(-62871644, A02);
        return A00;
    }
}
