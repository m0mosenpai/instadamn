package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;

/* renamed from: X.BsU, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26806BsU extends AbstractC59962oe implements InterfaceC60072op, InterfaceC60122ou {
    public static final String __redex_internal_original_name = "AiSettingsAdvancedSettingsEditExampleDialogueFragment";
    public InterfaceC56362iU A00;
    public boolean A01;
    public final InterfaceC09390do A04 = AbstractC60492pY.A02(this);
    public final String A06 = "ai_settings_advanced_settings_edit_example_dialog_fragment";
    public final InterfaceC09390do A05 = AbstractC25225BEi.A0a(C29907DGv.A01(this, 24), C29907DGv.A01(this, 25), new C29898DGm(41, null, this), AbstractC25235BEs.A0x());
    public final InterfaceC09390do A02 = AbstractC09440dt.A01(C29907DGv.A01(this, 21));
    public final InterfaceC09390do A03 = DH6.A01(this, "add_example_dialog_entry_point", EnumC09460dv.A02, 7);

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        InterfaceC09390do interfaceC09390do = this.A03;
        this.A01 = C14360o3.A0K(interfaceC09390do.getValue(), "settings_edit_example_dialogue");
        InterfaceC09390do interfaceC09390do2 = this.A02;
        AbstractC25226BEj.A0q(interfaceC09390do2).A0Q(AbstractC25225BEi.A15(interfaceC09390do), C25878Bcd.A02(this.A05), "advanced_settings_editing");
        if (AbstractC28459ChB.A03(AbstractC166987dD.A0r(this.A04))) {
            C25531Mh A00 = C28484Chc.A00(AbstractC25226BEj.A0q(interfaceC09390do2));
            if (AbstractC25226BEj.A1Z(A00)) {
                A00.A0k("advanced_settings_screen_example_dialogue_response_field_regeneration_icon_rendered");
                AbstractC25233BEq.A18(A00, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, "settings");
            }
        }
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A04);
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        InterfaceC09390do interfaceC09390do = this.A02;
        C28484Chc A0q = AbstractC25226BEj.A0q(interfaceC09390do);
        InterfaceC09390do interfaceC09390do2 = this.A03;
        String A15 = AbstractC25225BEi.A15(interfaceC09390do2);
        InterfaceC09390do interfaceC09390do3 = this.A05;
        A0q.A0L(A15, C25878Bcd.A02(interfaceC09390do3), "advanced_settings_editing");
        if (AbstractC25226BEj.A0o(interfaceC09390do3).A0I()) {
            AbstractC25226BEj.A0q(interfaceC09390do).A0N(AbstractC25225BEi.A15(interfaceC09390do2), C25878Bcd.A02(interfaceC09390do3), "advanced_settings_editing");
            AbstractC27520CCq.A00(requireContext(), C29907DGv.A01(this, 22), C29907DGv.A01(this, 23), 2131952780, 2131952779);
            return true;
        }
        AbstractC25226BEj.A0o(interfaceC09390do3).A06();
        return false;
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        AbstractC25235BEs.A1H(interfaceC56362iU);
        int i = 2131952671;
        if (this.A01) {
            i = 2131952771;
        }
        interfaceC56362iU.Efu(i);
        interfaceC56362iU.AAF(new ViewOnClickListenerC28668ClG(2, interfaceC56362iU, this), 2131961124);
        this.A00 = interfaceC56362iU;
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A06;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(618705819);
        ComposeView A00 = AbstractC25319BIo.A00(this, new C30505Dbo(this, 49), 549432864);
        C0f9.A09(-1392440170, A02);
        return A00;
    }
}
