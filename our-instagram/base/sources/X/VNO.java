package X;

import androidx.fragment.app.Fragment;

/* loaded from: classes11.dex */
public abstract class VNO {
    public static final void A00(Fragment fragment, InterfaceC71855X7n interfaceC71855X7n) {
        String str;
        AbstractC167017dG.A1N(interfaceC71855X7n, fragment);
        if (interfaceC71855X7n instanceof Wb1) {
            C14360o3.A07(C2FP.A02().A03.get());
            Wb1 wb1 = (Wb1) interfaceC71855X7n;
            String str2 = wb1.A01;
            Fragment A00 = ((SNK) C2FP.A02().A02.get()).A00(wb1.A00, str2);
            if (A00 != null) {
                Object obj = C2FP.A02().A03.get();
                C14360o3.A07(obj);
                AbstractC31177DnL.A16(A00, fragment.requireActivity(), ((C68761Vbe) obj).A00);
                return;
            }
            throw AbstractC166997dE.A0g();
        }
        if (interfaceC71855X7n instanceof C70516Waz) {
            C70516Waz c70516Waz = (C70516Waz) interfaceC71855X7n;
            Fragment fragment2 = fragment.mParentFragment;
            if (fragment2 instanceof C67751UxO) {
                str = "null cannot be cast to non-null type com.facebookpay.msc.bottomsheet.BSCBottomSheetDialogFragment";
            } else if ((fragment2 instanceof UDA) && !c70516Waz.A00) {
                str = "null cannot be cast to non-null type com.facebookpay.msc.widget.dialog.BSCDialogFragment";
            } else {
                Object obj2 = C2FP.A02().A03.get();
                C14360o3.A07(obj2);
                new C140966Yy(fragment.requireActivity(), ((C68761Vbe) obj2).A00).A06();
                return;
            }
            C14360o3.A0C(fragment2, str);
            ((C0SG) fragment2).A07();
            return;
        }
        if (!(interfaceC71855X7n instanceof Wb0)) {
            return;
        }
        C2FP.A07().A00(fragment.requireContext(), ((Wb0) interfaceC71855X7n).A00);
    }
}
