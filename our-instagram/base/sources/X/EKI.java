package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;

/* loaded from: classes6.dex */
public final class EKI extends AbstractC59962oe implements InterfaceC60072op {
    public static final String __redex_internal_original_name = "DirectThreadSharedLinksFragment";
    public final InterfaceC09390do A02;
    public final InterfaceC09390do A03;
    public final InterfaceC09390do A01 = AbstractC60492pY.A02(this);
    public final String A00 = "direct_thread_shared_links";

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        return false;
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A01);
    }

    public EKI() {
        EnumC09460dv enumC09460dv = EnumC09460dv.A02;
        this.A02 = AbstractC09440dt.A00(enumC09460dv, new C37058GUs(this, 3));
        C37058GUs c37058GUs = new C37058GUs(this, 4);
        InterfaceC09390do A00 = AbstractC09440dt.A00(enumC09460dv, new C37058GUs(new C37058GUs(this, 0), 1));
        this.A03 = AbstractC25225BEi.A0a(new C37058GUs(A00, 2), c37058GUs, new C50170MDx(8, null, A00), AbstractC25225BEi.A1D(C50900MeV.class));
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A00;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(836685416);
        ComposeView A00 = AbstractC25319BIo.A00(this, new C30190DRv(this, 45), -862028196);
        C0f9.A09(-1301811825, A02);
        return A00;
    }
}
