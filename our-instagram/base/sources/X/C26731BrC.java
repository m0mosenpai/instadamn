package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;

/* renamed from: X.BrC, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26731BrC extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "SchoolManagementBottomSheetFragment";
    public C27894CRf A00;
    public boolean A02;
    public String A01 = "";
    public final InterfaceC09390do A04 = AbstractC60492pY.A02(this);
    public final InterfaceC09390do A03 = AbstractC09440dt.A01(new C29886DGa(this, 5));

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "school_management";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        AbstractC25226BEj.A12(this.A03).A03(EnumC39642HiX.PROFILE_BIO, C8n.RELIABILITY_PAGE_GENERAL);
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A04);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1565315747);
        ComposeView A00 = AbstractC25319BIo.A00(this, new C30189DRu(this, 44), -385763565);
        C0f9.A09(1856158685, A02);
        return A00;
    }
}
