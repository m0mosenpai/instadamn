package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;

/* renamed from: X.Brn, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26766Brn extends AbstractC59962oe implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "AiCreationNuxFragment";
    public final InterfaceC09390do A02 = AbstractC25225BEi.A0a(C29909DGx.A01(this, 15), C29909DGx.A01(this, 16), new C29898DGm(26, null, this), AbstractC25235BEs.A0y());
    public final InterfaceC09390do A00 = DH6.A01(this, "AiStudioArgumentKeys.creation_entry_point", EnumC09460dv.A02, 3);
    public final InterfaceC09390do A01 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "ai_creation_nux_fragment";
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

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        AbstractC25235BEs.A1H(interfaceC56362iU);
        interfaceC56362iU.Efu(2131952707);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-173475070);
        super.onCreate(bundle);
        InterfaceC09390do interfaceC09390do = this.A02;
        C27271C1v c27271C1v = AbstractC25226BEj.A0n(interfaceC09390do).A00;
        AbstractC25231BEo.A1I(c27271C1v, ((C4A7) c27271C1v).A01, 42);
        C25879Bce A0n = AbstractC25226BEj.A0n(interfaceC09390do);
        Object value = this.A00.getValue();
        C14360o3.A0B(value, 0);
        A0n.A09.Egh(value);
        C0f9.A09(1635861915, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-951826302);
        ComposeView A00 = AbstractC25319BIo.A00(this, new C30505Dbo(this, 38), -175024416);
        C0f9.A09(1259589505, A02);
        return A00;
    }
}
