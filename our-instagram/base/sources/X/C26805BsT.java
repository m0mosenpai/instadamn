package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;

/* renamed from: X.BsT, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26805BsT extends AbstractC59962oe implements InterfaceC60072op, InterfaceC60122ou {
    public static final String __redex_internal_original_name = "AiCreationAdvancedSettingsEditInstructionFragment";
    public InterfaceC56362iU A00;
    public boolean A01;
    public final InterfaceC09390do A04 = AbstractC60492pY.A02(this);
    public final String A06 = "ai_creation_advanced_settings_edit_instruction_fragment";
    public final InterfaceC09390do A05 = AbstractC25225BEi.A0a(DGW.A00(this, 46), DGW.A00(this, 47), new C29898DGm(17, null, this), AbstractC25235BEs.A0y());
    public final InterfaceC09390do A02 = AbstractC09440dt.A01(DGW.A00(this, 43));
    public final InterfaceC09390do A03 = DH6.A01(this, "add_instruction_entry_point", EnumC09460dv.A02, 1);

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        InterfaceC09390do interfaceC09390do = this.A03;
        this.A01 = C14360o3.A0K(interfaceC09390do.getValue(), "settings_edit_instruction");
        AbstractC25226BEj.A0q(this.A02).A0W(AbstractC25225BEi.A15(interfaceC09390do), C25879Bce.A03(this.A05), "advanced_settings_creation");
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
        A0q.A0R(A15, C25879Bce.A03(interfaceC09390do3), "advanced_settings_creation");
        Object value = AbstractC25226BEj.A0n(interfaceC09390do3).A0P.getValue();
        if (value != null) {
            C26008Bew c26008Bew = (C26008Bew) value;
            if (AbstractC25225BEi.A1a(AbstractC25228BEl.A1A(c26008Bew.A01), c26008Bew.A02)) {
                AbstractC25226BEj.A0q(interfaceC09390do).A0U(AbstractC25225BEi.A15(interfaceC09390do2), C25879Bce.A03(interfaceC09390do3), "advanced_settings_creation");
                AbstractC27520CCq.A00(requireContext(), DGW.A00(this, 44), DGW.A00(this, 45), 2131952790, 2131952789);
                return true;
            }
            return false;
        }
        throw AbstractC166997dE.A0g();
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
        ViewOnClickListenerC28667ClF.A03(interfaceC56362iU, this, 2, 2131961124);
        C26008Bew c26008Bew = (C26008Bew) AbstractC25226BEj.A0n(this.A05).A0P.getValue();
        if (c26008Bew != null) {
            z = c26008Bew.A04;
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
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(930827939);
        ComposeView A00 = AbstractC25319BIo.A00(this, new C30505Dbo(this, 29), -121421280);
        C0f9.A09(-1112058733, A02);
        return A00;
    }
}
