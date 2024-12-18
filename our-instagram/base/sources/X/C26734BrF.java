package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;

/* renamed from: X.BrF, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26734BrF extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "PotatoLongPressBottomSheetFragment";
    public final InterfaceC09390do A02;
    public final InterfaceC09390do A04;
    public final String A05;
    public final InterfaceC09390do A03 = C1XM.A00(new DGZ(this, 32));
    public final InterfaceC09390do A00 = C1XM.A00(new DGZ(this, 24));
    public final InterfaceC09390do A01 = C1XM.A00(new DGZ(this, 28));

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C07S c07s = C07S.STARTED;
        C07X viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC166987dD.A1Z(new C57165PZj(c07s, this, viewLifecycleOwner, null, 11), C07Y.A00(viewLifecycleOwner));
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A02);
    }

    public C26734BrF() {
        DGZ dgz = new DGZ(this, 33);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new DGZ(new DGZ(this, 29), 30));
        this.A04 = AbstractC25225BEi.A0a(new DGZ(A00, 31), dgz, new C57255Pbd(38, null, A00), AbstractC25225BEi.A1D(C25843Bby.class));
        this.A02 = AbstractC60492pY.A02(this);
        this.A05 = "potato_long_press_bottom_sheet_fragment";
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A05;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1370598158);
        ComposeView A00 = AbstractC25319BIo.A00(this, new C30189DRu(this, 9), -1145003370);
        C0f9.A09(156692858, A02);
        return A00;
    }
}
