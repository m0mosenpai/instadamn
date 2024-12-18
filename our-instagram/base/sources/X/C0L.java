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
public final class C0L extends AbstractC26782Bs6 {
    public static final String __redex_internal_original_name = "OpalProfilePicSelectorFragment";
    public CPE A00;

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "opal_profile_pic_selector_fragment";
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return AbstractC166987dD.A0r(super.A00);
    }

    @Override // X.AbstractC26782Bs6, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-753103657);
        super.onCreate(bundle);
        InterfaceC09390do interfaceC09390do = super.A00;
        AbstractC34277F9x.A00(this, AbstractC166987dD.A0r(interfaceC09390do), "surface_appear", "empty", "profile_picture_bottom_sheet", AbstractC166987dD.A0r(interfaceC09390do).userId, null);
        C0f9.A09(-828411963, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        boolean z;
        C3DN A00;
        Fragment A09;
        int A02 = C0f9.A02(-1298506792);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            z = bundle2.getBoolean("argument_show_remove_picture_option");
        } else {
            z = false;
        }
        FragmentActivity activity = getActivity();
        if (activity != null && (A00 = C3DN.A00.A00(activity)) != null && (A09 = A00.A09()) != null) {
            ((BottomSheetFragment) A09).A0T(8);
        }
        ComposeView A022 = AbstractC25319BIo.A02(this, C5UA.A04(new DS9(19, this, z), -168689063, true), true, false);
        C0f9.A09(-698833006, A02);
        return A022;
    }

    @Override // X.AbstractC26782Bs6, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(693926055);
        super.onDestroy();
        InterfaceC09390do interfaceC09390do = super.A00;
        AbstractC34277F9x.A00(this, AbstractC166987dD.A0r(interfaceC09390do), "surface_disappear", "empty", "profile_picture_bottom_sheet", AbstractC166987dD.A0r(interfaceC09390do).userId, null);
        C0f9.A09(1650800658, A02);
    }
}
