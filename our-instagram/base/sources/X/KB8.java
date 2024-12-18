package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;

/* loaded from: classes8.dex */
public final class KB8 extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "FriendMapPagerBottomSheetFragment";
    public final InterfaceC09390do A00;
    public final InterfaceC09390do A02;
    public final InterfaceC09390do A04;
    public final InterfaceC09390do A03 = AbstractC60492pY.A02(this);
    public final InterfaceC09390do A01 = C50248MHd.A00(this, 42);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A03);
    }

    public KB8() {
        C50248MHd A01 = C50248MHd.A01(this, 47);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, C50248MHd.A01(C50248MHd.A01(this, 44), 45));
        this.A04 = AbstractC25225BEi.A0a(C50248MHd.A01(A00, 46), A01, new ME1(39, null, A00), AbstractC25225BEi.A1D(C27228Bzn.class));
        this.A00 = C50248MHd.A00(this, 37);
        this.A02 = C50248MHd.A00(this, 43);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-610182232);
        ComposeView A00 = AbstractC25319BIo.A00(this, new C30191DRw(this, 31), -1485420948);
        C0f9.A09(-1447008322, A02);
        return A00;
    }
}
