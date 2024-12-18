package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;

/* loaded from: classes9.dex */
public final class N4K extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "ProfileCardNuxBottomSheetFragment";
    public C54601OAc A00;
    public final InterfaceC09390do A02 = AbstractC60492pY.A02(this);
    public final String A01 = "https://help.instagram.com/347751748650214";

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        AbstractC31172DnG.A1B(view.getContext(), view, AbstractC53242c7.A02(getContext()));
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(825975794);
        ComposeView A00 = AbstractC25319BIo.A00(this, new C30189DRu(this, 24), -769171997);
        C0f9.A09(1376967171, A02);
        return A00;
    }
}
