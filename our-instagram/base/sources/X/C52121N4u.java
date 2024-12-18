package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import java.util.Currency;
import java.util.List;

/* renamed from: X.N4u, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52121N4u extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "UserPayViewerBottomSheetFragment";
    public C147716kw A00;
    public String A01;
    public final InterfaceC09390do A02 = C1XM.A00(C57489PfP.A00);
    public final InterfaceC09390do A04 = C57517Pfr.A00(this, 34);
    public final InterfaceC09390do A03 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C2GS c2gs = ((C54751OHg) this.A02.getValue()).A00;
        FragmentActivity activity = getActivity();
        C14360o3.A0C(activity, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
        c2gs.A06(activity, new C55560Olu(3, view, this));
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A03);
    }

    public static final String A00(String str, String str2) {
        StringBuilder A1C = AbstractC166987dD.A1C();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (Character.isDigit(charAt) || charAt == '.' || charAt == ',') {
                A1C.append(charAt);
            }
        }
        return AnonymousClass001.A0T(AbstractC166987dD.A19(A1C), Currency.getInstance(str2).getDisplayName(), ' ');
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-1116795751);
        super.onCreate(bundle);
        this.A01 = AbstractC153636vY.A01(requireArguments(), "arg_broadcast_id");
        OUD oud = (OUD) this.A04.getValue();
        InterfaceC09390do interfaceC09390do = this.A02;
        List A00 = ((C54751OHg) interfaceC09390do.getValue()).A00();
        C54751OHg c54751OHg = (C54751OHg) interfaceC09390do.getValue();
        C2GS c2gs = c54751OHg.A00;
        Object A022 = c2gs.A02();
        if (A022 != null) {
            C51646Mrd c51646Mrd = (C51646Mrd) A022;
            c51646Mrd.A0D = true;
            c2gs.A0A(c51646Mrd);
            ((C56138Ovy) oud.A04.getValue()).A04(new C55727Oot(c54751OHg, c51646Mrd), A00, null);
            C0f9.A09(-168856498, A02);
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1140037850);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.iglive_user_pay_viewer_bottom_sheet, viewGroup, false);
        C0f9.A09(-868018789, A02);
        return inflate;
    }
}
