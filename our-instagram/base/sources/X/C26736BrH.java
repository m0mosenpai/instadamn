package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;

/* renamed from: X.BrH, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26736BrH extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "SchoolOnboardingAddCompletionBottomSheetFragment";
    public final InterfaceC09390do A05 = AbstractC60492pY.A02(this);
    public final InterfaceC09390do A04 = AbstractC09440dt.A01(new C29886DGa(this, 6));
    public String A01 = "";
    public InterfaceC16820sZ A03 = C29813DDf.A00;
    public String A02 = "";
    public EnumC39642HiX A00 = EnumC39642HiX.QP;

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "school_onboarding";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C29138Ct5 A12 = AbstractC25226BEj.A12(this.A04);
        EnumC39642HiX enumC39642HiX = this.A00;
        C8n c8n = C8n.SUCCESS_BOTTOMSHEET;
        String str = this.A02;
        AbstractC167027dH.A12(enumC39642HiX, c8n, str);
        AbstractC25234BEr.A0v(enumC39642HiX, c8n, C29138Ct5.A00(A12), "ig_school_registration_page_impression", str);
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A05);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1369517863);
        ComposeView A00 = AbstractC25319BIo.A00(this, new C30189DRu(this, 45), -2056508171);
        C0f9.A09(736081157, A02);
        return A00;
    }
}
