package X;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;

/* loaded from: classes6.dex */
public final class EI9 extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "AiAgentAssistantBrazilUkNuxBottomsheetFragment";
    public final InterfaceC09390do A02 = AbstractC60492pY.A02(this);
    public final InterfaceC09390do A00 = C37050GUg.A00(this, 39);
    public final InterfaceC09390do A01 = C37050GUg.A00(this, 40);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C189478aR A0x = AbstractC25228BEl.A0x(getActivity(), C3DN.A00);
        int color = requireContext().getColor(R.color.meta_ai_invocation_brazil_nux_default_color);
        if (A0x != null) {
            A0x.A03.A0S(color);
        }
        InterfaceC09390do interfaceC09390do = this.A02;
        L7V l7v = new L7V(requireContext(), AbstractC166987dD.A0r(interfaceC09390do), new C48724Lgs(0, A0x, view));
        AbstractC12990ll A0o = AbstractC166987dD.A0o(interfaceC09390do);
        C06090Tz c06090Tz = C06090Tz.A05;
        l7v.A00(C18U.A04(c06090Tz, A0o, 36887717464638229L));
        AbstractC13880nE.A0O(view);
        String string = AbstractC166997dE.A0N(this).getString(2131966460);
        String string2 = AbstractC31180DnO.A02(this, string).getString(2131966458);
        String string3 = AbstractC31180DnO.A02(this, string2).getString(2131966459);
        String string4 = AbstractC31180DnO.A02(this, string3).getString(2131966456);
        String A0q = AbstractC166997dE.A0q(AbstractC31180DnO.A02(this, string4), 2131966457);
        String A04 = C18U.A04(c06090Tz, AbstractC166987dD.A0o(interfaceC09390do), 36883353779896835L);
        String A042 = C18U.A04(c06090Tz, AbstractC166987dD.A0o(interfaceC09390do), 36883353779831298L);
        String A043 = C18U.A04(c06090Tz, AbstractC166987dD.A0o(interfaceC09390do), 36883353780093446L);
        String A044 = C18U.A04(c06090Tz, AbstractC166987dD.A0o(interfaceC09390do), 36883353780027909L);
        String A045 = C18U.A04(c06090Tz, AbstractC166987dD.A0o(interfaceC09390do), 36883353779765761L);
        SpannableStringBuilder A0H = AbstractC25225BEi.A0H(AbstractC166997dE.A0N(this).getString(2131952602, string, string2, string3, A0q));
        SpannableStringBuilder A0H2 = AbstractC25225BEi.A0H(AbstractC166997dE.A0r(AbstractC166997dE.A0N(this), string4, 2131952571));
        AnonymousClass773.A03(A0H, new C33265Elz(this, A04, AbstractC31179DnN.A01(this), 3), string);
        AnonymousClass773.A03(A0H, new C33265Elz(this, A042, AbstractC31179DnN.A01(this), 4), string2);
        AnonymousClass773.A03(A0H, new C33265Elz(this, A044, AbstractC31179DnN.A01(this), 5), string3);
        AnonymousClass773.A03(A0H, new C33265Elz(this, A045, AbstractC31179DnN.A01(this), 6), A0q);
        AnonymousClass773.A03(A0H2, new C33265Elz(this, A043, AbstractC31179DnN.A01(this), 7), string4);
        TextView A0e = AbstractC166987dD.A0e(view, R.id.footer_text_1);
        AbstractC25227BEk.A11(A0e);
        A0e.setText(A0H);
        TextView A0e2 = AbstractC166987dD.A0e(view, R.id.footer_text_2);
        AbstractC25227BEk.A11(A0e2);
        A0e2.setText(A0H2);
        ((C64P) view.findViewById(R.id.interstitial_bottom_button_layout)).setPrimaryAction(AbstractC166997dE.A0N(this).getString(2131952574), ViewOnClickListenerC35681FpG.A00(this, 8));
        AbstractC31172DnG.A0c(this.A00).A07((EnumC33519Ers) this.A01.getValue());
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1433936359);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.layout_ai_agent_assistant_disclaimer_interstitial_brazil, false);
        C0f9.A09(-1681011846, A02);
        return A0R;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-614326777);
        super.onDestroyView();
        if (!AbstractC162267Oo.A02(AbstractC166987dD.A0r(this.A02))) {
            AbstractC31172DnG.A0c(this.A00).A06((EnumC33519Ers) this.A01.getValue());
        }
        C0f9.A09(20457820, A02);
    }
}
