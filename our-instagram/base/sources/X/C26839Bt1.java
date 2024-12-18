package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import com.instagram.profile.fragment.UserDetailTabController;

/* renamed from: X.Bt1, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26839Bt1 extends AbstractC59962oe implements InterfaceC152836uD {
    public static final String __redex_internal_original_name = "PotatoProfileTabFragment";
    public final InterfaceC09390do A00;
    public final InterfaceC09390do A01;
    public final String A02;

    @Override // X.InterfaceC152836uD
    public final Fragment ACb() {
        return this;
    }

    @Override // X.InterfaceC152836uD, X.InterfaceC152846uE
    public final String Bi9() {
        return AbstractC111324zv.A00(2923);
    }

    @Override // X.InterfaceC152836uD
    public final ViewGroup Br5() {
        return null;
    }

    @Override // X.InterfaceC152836uD
    public final void DcV(UserDetailTabController userDetailTabController) {
    }

    @Override // X.InterfaceC152836uD
    public final void Drq(boolean z) {
    }

    @Override // X.InterfaceC152836uD
    public final void Drv(boolean z) {
    }

    @Override // X.InterfaceC152836uD
    public final void Drw() {
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A00);
    }

    public C26839Bt1() {
        DGZ dgz = new DGZ(this, 22);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new DGZ(new DGZ((Object) this, 19), 20));
        this.A01 = AbstractC25225BEi.A0a(new DGZ(A00, 21), dgz, new C57255Pbd(36, null, A00), AbstractC25225BEi.A1D(C25819Bba.class));
        this.A00 = AbstractC60492pY.A02(this);
        this.A02 = "potato_profile_tab_fragment";
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A02;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(874474063);
        super.onCreate(bundle);
        String string = requireArguments().getString("arg_profile_user_id");
        if (string != null) {
            AbstractC52922bZ A0Z = AbstractC25225BEi.A0Z(this.A01);
            AbstractC166987dD.A1Z(new PXZ(A0Z, string, null, 14, true), AbstractC141776au.A00(A0Z));
        }
        C0f9.A09(956833479, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1277912816);
        ComposeView A00 = AbstractC25319BIo.A00(this, new C30189DRu(this, 7), -925584425);
        C0f9.A09(-987157414, A02);
        return A00;
    }
}
