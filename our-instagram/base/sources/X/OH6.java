package X;

import android.os.Bundle;

/* loaded from: classes9.dex */
public final class OH6 {
    public final /* synthetic */ N6t A00;

    public final void A00(EnumC53172NfT enumC53172NfT) {
        C14360o3.A0B(enumC53172NfT, 0);
        C51000Mg7 c51000Mg7 = (C51000Mg7) this.A00.A05.getValue();
        OAS oas = c51000Mg7.A03;
        String name = enumC53172NfT.name();
        C14360o3.A0B(name, 0);
        InterfaceC58268PsC interfaceC58268PsC = oas.A00;
        if (interfaceC58268PsC != null) {
            String str = oas.A01;
            Bundle A0b = AbstractC166987dD.A0b();
            String str2 = oas.A02;
            if (str2 != null) {
                A0b.putString("form_id", str2);
            }
            A0b.putString("question_type", name);
            InterfaceC58268PsC.A00(A0b, interfaceC58268PsC, str, "lead_gen_creatives_context_card", "creatives_context_card_see_all_click");
        }
        C05A c05a = c51000Mg7.A07;
        java.util.Set A0j = AbstractC001800i.A0j(AbstractC31172DnG.A0w(c05a));
        A0j.add(enumC53172NfT);
        c05a.Egh(A0j);
    }

    public OH6(N6t n6t) {
        this.A00 = n6t;
    }
}
