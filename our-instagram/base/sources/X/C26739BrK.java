package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;

/* renamed from: X.BrK, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26739BrK extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "AiCreationBottomSheetNuxFragment";
    public final InterfaceC09390do A02 = AbstractC25225BEi.A0a(C29909DGx.A01(this, 2), C29909DGx.A01(this, 3), new C29898DGm(19, null, this), AbstractC25235BEs.A0y());
    public final InterfaceC09390do A00 = DH6.A01(this, "AiStudioArgumentKeys.creation_entry_point", EnumC09460dv.A02, 2);
    public final InterfaceC09390do A01 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "ai_creation_bottom_sheet_nux_fragment";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C28484Chc A03 = C28484Chc.A03(this.A01);
        String A15 = AbstractC25225BEi.A15(this.A00);
        InterfaceC09390do interfaceC09390do = this.A02;
        A03.A06(C25879Bce.A01(interfaceC09390do), A15, C25879Bce.A02(interfaceC09390do));
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A01);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-1774034084);
        super.onCreate(bundle);
        C27271C1v c27271C1v = AbstractC25226BEj.A0n(this.A02).A00;
        AbstractC25231BEo.A1I(c27271C1v, ((C4A7) c27271C1v).A01, 42);
        C0f9.A09(744579984, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1673132233);
        ComposeView A00 = AbstractC25319BIo.A00(this, new C30505Dbo(this, 35), 1538077036);
        C0f9.A09(-1136788882, A02);
        return A00;
    }
}
