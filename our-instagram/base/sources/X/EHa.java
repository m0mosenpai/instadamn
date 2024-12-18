package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;

/* loaded from: classes6.dex */
public final class EHa extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "AiAgentBottomSheetNuxFragment";
    public final InterfaceC09390do A01 = C37050GUg.A00(this, 44);
    public final InterfaceC09390do A00 = AbstractC09440dt.A01(new C37050GUg(this, 43));
    public final InterfaceC09390do A02 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1091910342);
        ComposeView A00 = AbstractC25319BIo.A00(this, new C30190DRv(this, 13), -1093971386);
        C0f9.A09(1876967959, A02);
        return A00;
    }
}
