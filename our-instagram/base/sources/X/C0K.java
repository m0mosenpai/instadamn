package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.igds.components.bottomsheet.BottomSheetFragment;

/* loaded from: classes5.dex */
public final class C0K extends AbstractC26782Bs6 {
    public static final String __redex_internal_original_name = "OpalNuxFragment";
    public InterfaceC31039Dkd A00;
    public boolean A01;

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "opal_nux_bottomsheet_fragment";
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return AbstractC166987dD.A0r(super.A00);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C3DN A00;
        Fragment A09;
        int A02 = C0f9.A02(1777476702);
        FragmentActivity activity = getActivity();
        if (activity != null && (A00 = C3DN.A00.A00(activity)) != null && (A09 = A00.A09()) != null) {
            ((BottomSheetFragment) A09).A0T(8);
        }
        ComposeView A022 = AbstractC25319BIo.A02(this, C5UA.A04(new C30496Dbf(this, 49), -1414057275, true), true, false);
        C0f9.A09(137060014, A02);
        return A022;
    }
}
