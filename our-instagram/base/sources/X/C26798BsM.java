package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.facebook.R;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;

/* renamed from: X.BsM, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26798BsM extends AbstractC59962oe implements InterfaceC60072op, InterfaceC60122ou {
    public static final String __redex_internal_original_name = "AiCreationAdvancedSettingsFragment";
    public InterfaceC56362iU A00;
    public final InterfaceC09390do A03 = AbstractC60492pY.A02(this);
    public final String A04 = "kirby_ai_advanced_settings_fragment";
    public final InterfaceC09390do A02 = AbstractC25225BEi.A0a(C29909DGx.A01(this, 1), DGW.A00(this, 49), new C29898DGm(18, null, this), AbstractC25235BEs.A0y());
    public final InterfaceC09390do A01 = AbstractC09440dt.A01(DGW.A00(this, 48));

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        Boolean bool;
        boolean z;
        C14360o3.A0B(interfaceC56362iU, 0);
        interfaceC56362iU.EkS(true);
        InterfaceC09390do interfaceC09390do = this.A02;
        C26072Bg1 c26072Bg1 = (C26072Bg1) AbstractC25226BEj.A0n(interfaceC09390do).A0D.getValue();
        if (c26072Bg1 != null) {
            bool = Boolean.valueOf(c26072Bg1.A05);
        } else {
            bool = null;
        }
        int i = 2131952679;
        if (AbstractC166997dE.A1Z(bool, true)) {
            i = 2131952707;
        }
        interfaceC56362iU.Efu(i);
        if (AbstractC166997dE.A1Z(bool, false)) {
            C3LO c3lo = new C3LO();
            c3lo.A0K = getString(2131961124);
            c3lo.A0D = R.style.ActionBarTextButton;
            ViewOnClickListenerC28667ClF.A02(c3lo, interfaceC56362iU, this, 3);
            C26072Bg1 c26072Bg12 = (C26072Bg1) AbstractC25226BEj.A0n(interfaceC09390do).A0D.getValue();
            if (c26072Bg12 != null) {
                z = c26072Bg12.A06;
            } else {
                z = false;
            }
            interfaceC56362iU.ARk(0, z);
        }
        this.A00 = interfaceC56362iU;
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A03);
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        AbstractC25226BEj.A0n(this.A02).A06();
        C25531Mh A02 = C28484Chc.A02(this.A01);
        if (AbstractC25226BEj.A1Z(A02)) {
            A02.A0k("ai_creation_advanced_settings_back_button_clicked");
            A02.Cht();
            return false;
        }
        return false;
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A04;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1460829817);
        ComposeView A00 = AbstractC25319BIo.A00(this, new C30505Dbo(this, 34), -2094393572);
        C0f9.A09(-1444003746, A02);
        return A00;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(-1360112077);
        InterfaceC09390do interfaceC09390do = this.A01;
        C25531Mh A022 = C28484Chc.A02(interfaceC09390do);
        if (AbstractC25226BEj.A1Z(A022)) {
            A022.A0k("ai_creation_advanced_settings_screen_shown");
            A022.Cht();
        }
        if (AbstractC28459ChB.A03(AbstractC166987dD.A0r(this.A03))) {
            C25531Mh A00 = C28484Chc.A00(AbstractC25226BEj.A0q(interfaceC09390do));
            if (AbstractC25226BEj.A1Z(A00)) {
                A00.A0k("advanced_settings_screen_field_regeneration_icon_rendered");
                AbstractC25233BEq.A18(A00, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, "creation");
            }
        }
        super.onResume();
        C0f9.A09(-1942994029, A02);
    }
}
