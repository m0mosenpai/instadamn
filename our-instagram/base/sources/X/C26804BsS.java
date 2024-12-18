package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;

/* renamed from: X.BsS, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26804BsS extends AbstractC59962oe implements InterfaceC60072op, InterfaceC60122ou {
    public static final String __redex_internal_original_name = "AiCreationAdvancedSettingsEditExampleDialogueFragment";
    public InterfaceC56362iU A00;
    public boolean A01;
    public final InterfaceC09390do A04 = AbstractC60492pY.A02(this);
    public final String A06 = "ai_creation_advanced_settings_edit_example_dialog_fragment";
    public final InterfaceC09390do A05 = AbstractC25225BEi.A0a(DGW.A00(this, 41), DGW.A00(this, 42), new C29898DGm(16, null, this), AbstractC25235BEs.A0y());
    public final InterfaceC09390do A02 = AbstractC09440dt.A01(DGW.A00(this, 38));
    public final InterfaceC09390do A03 = DH6.A01(this, "add_example_dialog_entry_point", EnumC09460dv.A02, 0);

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        InterfaceC09390do interfaceC09390do = this.A03;
        this.A01 = C14360o3.A0K(interfaceC09390do.getValue(), "settings_edit_example_dialogue");
        InterfaceC09390do interfaceC09390do2 = this.A02;
        AbstractC25226BEj.A0q(interfaceC09390do2).A0Q(AbstractC25225BEi.A15(interfaceC09390do), C25879Bce.A03(this.A05), "advanced_settings_creation");
        if (AbstractC28459ChB.A03(AbstractC166987dD.A0r(this.A04))) {
            C25531Mh A00 = C28484Chc.A00(AbstractC25226BEj.A0q(interfaceC09390do2));
            if (AbstractC25226BEj.A1Z(A00)) {
                A00.A0k("advanced_settings_screen_example_dialogue_response_field_regeneration_icon_rendered");
                AbstractC25233BEq.A18(A00, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, "creation");
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
        A0q.A0L(A15, C25879Bce.A03(interfaceC09390do3), "advanced_settings_creation");
        Object value = AbstractC25226BEj.A0n(interfaceC09390do3).A0O.getValue();
        if (value != null) {
            C26012Bf0 c26012Bf0 = (C26012Bf0) value;
            C50679MYx c50679MYx = c26012Bf0.A01;
            String A1A = AbstractC25228BEl.A1A(c50679MYx.A00);
            C50679MYx c50679MYx2 = c26012Bf0.A02;
            if (C14360o3.A0K(A1A, c50679MYx2.A00) && C14360o3.A0K(AbstractC25228BEl.A1A(c50679MYx.A01), c50679MYx2.A01)) {
                AbstractC25226BEj.A0n(interfaceC09390do3).A05();
                return false;
            }
            AbstractC25226BEj.A0q(interfaceC09390do).A0N(AbstractC25225BEi.A15(interfaceC09390do2), C25879Bce.A03(interfaceC09390do3), "advanced_settings_creation");
            AbstractC27520CCq.A00(requireContext(), DGW.A00(this, 39), DGW.A00(this, 40), 2131952780, 2131952779);
            return true;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        boolean A10 = AbstractC25236BEt.A10(interfaceC56362iU);
        int i = 2131952671;
        if (this.A01) {
            i = 2131952771;
        }
        interfaceC56362iU.Efu(i);
        interfaceC56362iU.AAF(new ViewOnClickListenerC28668ClG(A10 ? 1 : 0, interfaceC56362iU, this), 2131961124);
        this.A00 = interfaceC56362iU;
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A06;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1748386732);
        ComposeView A00 = AbstractC25319BIo.A00(this, new C30505Dbo(this, 28), 813578144);
        C0f9.A09(-443084201, A02);
        return A00;
    }
}
