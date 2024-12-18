package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.instagram.aistudio.editor.AiSettingsRepository;

/* renamed from: X.Bsa, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26812Bsa extends AbstractC59962oe implements InterfaceC60072op, InterfaceC60122ou {
    public static final String __redex_internal_original_name = "AiEditExampleDialogueFragment";
    public InterfaceC56362iU A00;
    public boolean A01;
    public final InterfaceC09390do A04 = AbstractC60492pY.A02(this);
    public final String A06 = "ai_edit_example_dialogue_fragment";
    public final InterfaceC09390do A05 = AbstractC25225BEi.A0a(C29909DGx.A01(this, 33), C29909DGx.A01(this, 34), new C29898DGm(31, null, this), AbstractC25235BEs.A0x());
    public final InterfaceC09390do A02 = C29909DGx.A00(this, 29);
    public final InterfaceC09390do A03 = DH6.A01(this, "add_example_dialog_entry_point", EnumC09460dv.A02, 5);

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        interfaceC56362iU.EkS(true);
        int i = 2131952671;
        if (this.A01) {
            i = 2131952771;
        }
        interfaceC56362iU.Efu(i);
        interfaceC56362iU.AAF(new ViewOnClickListenerC28668ClG(1, interfaceC56362iU, this), 2131961124);
        this.A00 = interfaceC56362iU;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        InterfaceC09390do interfaceC09390do = this.A03;
        this.A01 = C14360o3.A0K(interfaceC09390do.getValue(), "settings_edit_example_dialogue");
        AbstractC25226BEj.A0q(this.A02).A0Q(AbstractC25225BEi.A15(interfaceC09390do), C25878Bcd.A02(this.A05), "basic_settings");
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
        A0q.A0L(A15, C25878Bcd.A02(interfaceC09390do3), "basic_settings");
        if (AbstractC25226BEj.A0o(interfaceC09390do3).A0I()) {
            AbstractC25226BEj.A0q(interfaceC09390do).A0N(AbstractC25225BEi.A15(interfaceC09390do2), C25878Bcd.A02(interfaceC09390do3), "basic_settings");
            AbstractC27520CCq.A00(requireContext(), C29909DGx.A01(this, 30), C29909DGx.A01(this, 31), 2131952780, 2131952779);
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A06;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(928772306);
        super.onCreate(bundle);
        String string = requireArguments().getString("user_message_text");
        String string2 = requireArguments().getString("bot_message_text");
        String string3 = requireArguments().getString("persona_id");
        boolean A0K = C14360o3.A0K(this.A03.getValue(), "in_thread_add_example_dialogue");
        boolean z = requireArguments().getBoolean("is_public_ai_agent");
        if (A0K && string3 != null && string3.length() != 0) {
            InterfaceC09390do interfaceC09390do = this.A05;
            AbstractC25226BEj.A0o(interfaceC09390do).A0D(string3);
            AiSettingsRepository aiSettingsRepository = AbstractC25226BEj.A0o(interfaceC09390do).A00;
            AbstractC166987dD.A1Z(new C50120MBu(aiSettingsRepository, string3, null, 1), ((C4A7) aiSettingsRepository).A01);
            if (string == null) {
                string = "";
            }
            if (string2 == null) {
                string2 = "";
            }
            AbstractC25226BEj.A0o(interfaceC09390do).A0B(new C50679MYx(string, string2, 5), -1, true, z);
        }
        C0f9.A09(455752068, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1434300909);
        ComposeView A00 = AbstractC25319BIo.A00(this, new C30505Dbo(this, 42), -1205945056);
        C0f9.A09(1055846866, A02);
        return A00;
    }
}
