package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.facebook.R;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;

/* renamed from: X.BsK, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26796BsK extends AbstractC59962oe implements InterfaceC60072op, InterfaceC60122ou {
    public static final String __redex_internal_original_name = "AISettingsAdvancedSettingsFragment";
    public InterfaceC56362iU A00;
    public final InterfaceC09390do A02 = AbstractC60492pY.A02(this);
    public final String A04 = "kirby_ai_settings_advanced_settings_fragment";
    public final InterfaceC09390do A03 = AbstractC25225BEi.A0a(DGW.A00(this, 8), DGW.A00(this, 9), new C29898DGm(6, null, this), AbstractC25235BEs.A0x());
    public final InterfaceC09390do A01 = AbstractC09440dt.A01(DGW.A00(this, 7));

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A02);
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        AbstractC25226BEj.A0o(this.A03).A08();
        C25531Mh A02 = C28484Chc.A02(this.A01);
        if (AbstractC25226BEj.A1Z(A02)) {
            A02.A0k("ai_settings_advanced_settings_back_button_clicked");
            A02.Cht();
            return false;
        }
        return false;
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        boolean A10 = AbstractC25236BEt.A10(interfaceC56362iU);
        interfaceC56362iU.Efu(2131952679);
        C3LO c3lo = new C3LO();
        c3lo.A0K = getString(2131961124);
        c3lo.A0D = R.style.ActionBarTextButton;
        ViewOnClickListenerC28667ClF.A02(c3lo, interfaceC56362iU, this, A10 ? 1 : 0);
        this.A00 = interfaceC56362iU;
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A04;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1068023925);
        ComposeView A00 = AbstractC25319BIo.A00(this, new C30505Dbo(this, 20), -1499370284);
        C0f9.A09(-167606652, A02);
        return A00;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(1592641858);
        InterfaceC09390do interfaceC09390do = this.A01;
        C25531Mh A022 = C28484Chc.A02(interfaceC09390do);
        if (AbstractC25226BEj.A1Z(A022)) {
            A022.A0k("ai_settings_advanced_settings_screen_shown");
            A022.Cht();
        }
        if (AbstractC28459ChB.A03(AbstractC166987dD.A0r(this.A02))) {
            C25531Mh A00 = C28484Chc.A00(AbstractC25226BEj.A0q(interfaceC09390do));
            if (AbstractC25226BEj.A1Z(A00)) {
                A00.A0k("advanced_settings_screen_field_regeneration_icon_rendered");
                AbstractC25233BEq.A18(A00, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, "settings");
            }
        }
        super.onResume();
        C0f9.A09(2102672300, A02);
    }
}
