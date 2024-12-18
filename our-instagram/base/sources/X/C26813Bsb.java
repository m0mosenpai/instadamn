package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.instagram.aistudio.editor.AiSettingsRepository;

/* renamed from: X.Bsb, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26813Bsb extends AbstractC59962oe implements InterfaceC60072op, InterfaceC60122ou {
    public static final String __redex_internal_original_name = "AiEditInstructionFragment";
    public InterfaceC56362iU A00;
    public boolean A01;
    public final InterfaceC09390do A04 = AbstractC60492pY.A02(this);
    public final String A06 = "ai_edit_instruction_fragment";
    public final InterfaceC09390do A05 = AbstractC25225BEi.A0a(C29909DGx.A01(this, 43), C29909DGx.A01(this, 44), new C29898DGm(34, null, this), AbstractC25235BEs.A0x());
    public final InterfaceC09390do A02 = C29909DGx.A00(this, 38);
    public final InterfaceC09390do A03 = DH6.A01(this, "add_instruction_entry_point", EnumC09460dv.A02, 6);

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        InterfaceC09390do interfaceC09390do = this.A03;
        this.A01 = C14360o3.A0K(interfaceC09390do.getValue(), "settings_edit_instruction");
        AbstractC25226BEj.A0q(this.A02).A0W(AbstractC25225BEi.A15(interfaceC09390do), C25878Bcd.A02(this.A05), "basic_settings");
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
        A0q.A0R(A15, C25878Bcd.A02(interfaceC09390do3), "basic_settings");
        C26008Bew A00 = C25878Bcd.A00(interfaceC09390do3);
        if (A00 != null && AbstractC25225BEi.A1a(AbstractC25228BEl.A1A(A00.A01), A00.A02)) {
            AbstractC25226BEj.A0q(interfaceC09390do).A0U(AbstractC25225BEi.A15(interfaceC09390do2), C25878Bcd.A02(interfaceC09390do3), "basic_settings");
            AbstractC27520CCq.A00(requireContext(), C29909DGx.A01(this, 40), C29909DGx.A01(this, 41), 2131952790, 2131952789);
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        boolean z;
        boolean A10 = AbstractC25236BEt.A10(interfaceC56362iU);
        int i = 2131952673;
        if (this.A01) {
            i = 2131952775;
        }
        interfaceC56362iU.Efu(i);
        ViewOnClickListenerC28667ClF.A03(interfaceC56362iU, this, 6, 2131961124);
        C26008Bew A00 = C25878Bcd.A00(this.A05);
        if (A00 != null) {
            z = A00.A04;
        } else {
            z = false;
        }
        interfaceC56362iU.ARk(A10 ? 1 : 0, z);
        this.A00 = interfaceC56362iU;
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A06;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-259216125);
        super.onCreate(bundle);
        String string = requireArguments().getString("persona_id");
        boolean A0K = C14360o3.A0K(requireArguments().getString("add_instruction_entry_point"), "in_thread_instruction");
        boolean z = requireArguments().getBoolean("is_public_ai_agent");
        if (A0K && string != null && string.length() != 0) {
            InterfaceC09390do interfaceC09390do = this.A05;
            AbstractC25226BEj.A0o(interfaceC09390do).A0D(string);
            AiSettingsRepository aiSettingsRepository = AbstractC25226BEj.A0o(interfaceC09390do).A00;
            AbstractC166987dD.A1Z(new C50120MBu(aiSettingsRepository, string, null, 2), ((C4A7) aiSettingsRepository).A01);
            AbstractC25226BEj.A0o(interfaceC09390do).A0H(true, z);
        }
        C0f9.A09(1270352989, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-227367685);
        ComposeView A00 = AbstractC25319BIo.A00(this, new C30505Dbo(this, 43), -75436640);
        C0f9.A09(-118531783, A02);
        return A00;
    }
}
