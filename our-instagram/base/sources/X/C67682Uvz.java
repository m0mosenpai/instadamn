package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;

/* renamed from: X.Uvz, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67682Uvz extends UF1 {
    @Override // X.UF1
    public final void A02() {
        AbstractC67710Uwb abstractC67710Uwb;
        super.A02();
        Bundle bundle = this.mArguments;
        if (bundle != null) {
            int i = bundle.getInt("fe_selector_view_model_class_id", -1);
            if (i != -1 && this.mParentFragment != null) {
                WFY A02 = C2FP.A02();
                Fragment requireParentFragment = requireParentFragment();
                while (requireParentFragment instanceof C67751UxO) {
                    requireParentFragment = requireParentFragment.requireParentFragment();
                }
                AbstractC52922bZ A05 = A02.A05(requireParentFragment, i);
                C14360o3.A0C(A05, "null cannot be cast to non-null type com.facebookpay.msc.filter.controller.FilterEntryPointOwner");
                abstractC67710Uwb = (AbstractC67710Uwb) A05;
            } else {
                abstractC67710Uwb = null;
            }
            C07W A01 = A01();
            C14360o3.A0C(A01, "null cannot be cast to non-null type com.facebookpay.msc.filter.controller.FilterOwner");
            ((X9h) A01).CNv(abstractC67710Uwb);
            return;
        }
        throw AbstractC166997dE.A0g();
    }
}
