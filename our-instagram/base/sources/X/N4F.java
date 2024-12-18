package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.facebook.react.modules.dialog.DialogModule;

/* loaded from: classes9.dex */
public final class N4F extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "SettingsScreenConfirmBottomSheetFragment";
    public O5X A00;
    public final InterfaceC09390do A01 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "settings_screen_confirm_bottom_sheet_fragment";
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A01);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(745445137);
        ComposeView A00 = AbstractC25319BIo.A00(this, new C30482DbR(requireArguments().getParcelableArrayList(DialogModule.KEY_ITEMS), 8), 1858612214);
        C0f9.A09(1088045334, A02);
        return A00;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        int A02 = C0f9.A02(1796892348);
        super.onStart();
        O5X o5x = this.A00;
        if (o5x != null) {
            C50685MZd.A00(o5x.A00).A0B(true);
        }
        C0f9.A09(758766651, A02);
    }
}
