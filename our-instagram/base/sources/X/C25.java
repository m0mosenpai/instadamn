package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;

/* loaded from: classes5.dex */
public final class C25 extends AbstractC26821Bsj {
    public static final String __redex_internal_original_name = "SchoolOnboardingSchoolSelectionFragment";
    public final InterfaceC09390do A00 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "school_selection_fragment";
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return A03();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(968029787);
        ComposeView A022 = AbstractC25319BIo.A02(this, C5UA.A03(C30482DbR.A00(this, 0), 1348734355), false, false);
        C0f9.A09(381168777, A02);
        return A022;
    }
}
