package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import com.facebookpay.widget.navibar.NavigationBar;

/* loaded from: classes11.dex */
public final class WGJ {
    public static final /* synthetic */ WGJ A00 = new Object();

    public static final void A01(Fragment fragment) {
        C14360o3.A0B(fragment, 0);
        Fragment fragment2 = fragment.mParentFragment;
        C14360o3.A0C(fragment2, "null cannot be cast to non-null type com.facebookpay.widget.bottomsheet.base.FBPayBottomSheetDialogFragment");
        ((C0SG) fragment2).A07();
    }

    public static final void A00(View.OnClickListener onClickListener, Fragment fragment) {
        Fragment fragment2 = fragment.mParentFragment;
        C14360o3.A0C(fragment2, "null cannot be cast to non-null type com.facebookpay.widget.bottomsheet.base.FBPayBottomSheetDialogFragment");
        C67752UxP c67752UxP = (C67752UxP) fragment2;
        AbstractC31171DnF.A1S(c67752UxP, onClickListener, c67752UxP.A0H, C67752UxP.A0X, 11);
    }

    public static final void A02(Fragment fragment) {
        boolean z;
        InterfaceC08430c6 interfaceC08430c6 = fragment.mParentFragment;
        C14360o3.A0C(interfaceC08430c6, "null cannot be cast to non-null type com.facebookpay.widget.bottomsheet.base.BottomSheetDialogController");
        C67752UxP c67752UxP = (C67752UxP) ((InterfaceC72028XFq) interfaceC08430c6);
        NavigationBar navigationBar = c67752UxP.A06;
        if (navigationBar != null) {
            navigationBar.setVisibility(8);
            z = false;
        } else {
            z = true;
        }
        c67752UxP.A07 = z;
    }

    public static final void A03(Fragment fragment, VET vet, String str) {
        Fragment fragment2 = fragment.mParentFragment;
        C14360o3.A0C(fragment2, "null cannot be cast to non-null type com.facebookpay.widget.bottomsheet.base.FBPayBottomSheetDialogFragment");
        C67752UxP c67752UxP = (C67752UxP) fragment2;
        InterfaceC16530ry interfaceC16530ry = c67752UxP.A0G;
        C0YR[] c0yrArr = C67752UxP.A0X;
        AbstractC31171DnF.A1S(c67752UxP, vet, interfaceC16530ry, c0yrArr, 2);
        AbstractC31171DnF.A1S(c67752UxP, str, c67752UxP.A0F, c0yrArr, 16);
    }

    public static final void A04(Fragment fragment, String str, String str2) {
        Fragment fragment2 = fragment.mParentFragment;
        C14360o3.A0C(fragment2, "null cannot be cast to non-null type com.facebookpay.widget.bottomsheet.base.FBPayBottomSheetDialogFragment");
        C67752UxP c67752UxP = (C67752UxP) fragment2;
        InterfaceC16530ry interfaceC16530ry = c67752UxP.A0R;
        C0YR[] c0yrArr = C67752UxP.A0X;
        AbstractC31171DnF.A1S(c67752UxP, str, interfaceC16530ry, c0yrArr, 6);
        AbstractC31171DnF.A1S(c67752UxP, str2, c67752UxP.A0P, c0yrArr, 18);
    }

    public static final void A05(Fragment fragment, boolean z) {
        Fragment fragment2 = fragment.mParentFragment;
        C14360o3.A0C(fragment2, "null cannot be cast to non-null type com.facebookpay.widget.bottomsheet.base.FBPayBottomSheetDialogFragment");
        C67752UxP c67752UxP = (C67752UxP) fragment2;
        AbstractC167007dF.A1L(c67752UxP, c67752UxP.A0D, C67752UxP.A0X, 19, z);
    }
}
