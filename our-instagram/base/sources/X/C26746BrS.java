package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;

/* renamed from: X.BrS, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26746BrS extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "SchoolRemovalBottomSheetFragment";
    public InterfaceC30999Djy A01;
    public EnumC39642HiX A00 = EnumC39642HiX.PROFILE_BIO;
    public final InterfaceC09390do A05 = AbstractC60492pY.A02(this);
    public final InterfaceC09390do A03 = AbstractC09440dt.A00(EnumC09460dv.A02, new C29886DGa(this, 34));
    public final InterfaceC09390do A04 = AbstractC09440dt.A01(new C29886DGa(this, 36));
    public String A02 = "";

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "school_management";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        AbstractC25226BEj.A12(this.A04).A03(EnumC39642HiX.PROFILE_BIO, C8n.REMOVE_SCHOOL);
    }

    public static final void A00(C26746BrS c26746BrS) {
        C41451vu c41451vu = C41451vu.A01;
        C146106i8 c146106i8 = new C146106i8();
        AbstractC25226BEj.A1N(c26746BrS.requireActivity(), c146106i8, 2131972297);
        c146106i8.A0I = c26746BrS.requireActivity().getString(2131972296);
        c146106i8.A0R = true;
        AbstractC166997dE.A1O(c41451vu, c146106i8.A00());
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A05);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1904608467);
        ComposeView A00 = AbstractC25319BIo.A00(this, C30482DbR.A00(this, 3), -937430967);
        C0f9.A09(-1334137104, A02);
        return A00;
    }
}
