package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;

/* renamed from: X.BsL, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26797BsL extends AbstractC59962oe implements InterfaceC60072op, InterfaceC60122ou {
    public static final String __redex_internal_original_name = "AiConversationFragment";
    public InterfaceC56362iU A00;
    public final InterfaceC09390do A02 = AbstractC60492pY.A02(this);
    public final String A04 = "ai_conversation_fragment";
    public final InterfaceC09390do A01 = AbstractC09440dt.A01(DGW.A00(this, 29));
    public final InterfaceC09390do A03 = AbstractC25225BEi.A0a(DGW.A00(this, 32), DGW.A00(this, 33), new C29898DGm(14, null, this), AbstractC25235BEs.A0x());

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        boolean z;
        C14360o3.A0B(interfaceC56362iU, 0);
        interfaceC56362iU.EkS(true);
        interfaceC56362iU.Efu(2131952821);
        ViewOnClickListenerC28667ClF.A03(interfaceC56362iU, this, 1, 2131961124);
        JWd jWd = (JWd) AbstractC25226BEj.A0o(this.A03).A0D.getValue();
        if (jWd != null) {
            z = jWd.A02;
        } else {
            z = false;
        }
        interfaceC56362iU.ARk(0, z);
        this.A00 = interfaceC56362iU;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C28484Chc A0q = AbstractC25226BEj.A0q(this.A01);
        String A02 = C25878Bcd.A02(this.A03);
        C25531Mh A00 = C28484Chc.A00(A0q);
        if (AbstractC25226BEj.A1Z(A00)) {
            A00.A0i(AbstractC25233BEq.A0m(A00, "settings_conversation_shown", A02));
            A00.Cht();
        }
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A02);
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        InterfaceC09390do interfaceC09390do = this.A01;
        C28484Chc A0q = AbstractC25226BEj.A0q(interfaceC09390do);
        InterfaceC09390do interfaceC09390do2 = this.A03;
        String A02 = C25878Bcd.A02(interfaceC09390do2);
        boolean A0K = AbstractC25226BEj.A0o(interfaceC09390do2).A0K();
        boolean A0J = AbstractC25226BEj.A0o(interfaceC09390do2).A0J();
        C25531Mh A00 = C28484Chc.A00(A0q);
        if (AbstractC25226BEj.A1Z(A00)) {
            A00.A0k("settings_conversation_back_clicked");
            A00.A0w(AbstractC25233BEq.A0p("has_icebreaker_changed", String.valueOf(A0J), AbstractC166987dD.A1L("has_welcome_message_changed", String.valueOf(A0K))));
            A00.A0i(AbstractC25233BEq.A0n(A02));
            A00.Cht();
        }
        JWd jWd = (JWd) AbstractC25226BEj.A0o(interfaceC09390do2).A0D.getValue();
        if (jWd == null || !jWd.A02) {
            return false;
        }
        C28484Chc A0q2 = AbstractC25226BEj.A0q(interfaceC09390do);
        String A022 = C25878Bcd.A02(interfaceC09390do2);
        C25531Mh A002 = C28484Chc.A00(A0q2);
        if (AbstractC25226BEj.A1Z(A002)) {
            A002.A0i(AbstractC25233BEq.A0m(A002, "settings_conversation_exit_confirmation_shown", A022));
            A002.Cht();
        }
        AbstractC27520CCq.A00(requireContext(), DGW.A00(this, 30), DGW.A00(this, 31), 2131952734, 2131952733);
        return true;
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A04;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(344145880);
        ComposeView A00 = AbstractC25319BIo.A00(this, new C30505Dbo(this, 26), 568693854);
        C0f9.A09(1742872607, A02);
        return A00;
    }
}
