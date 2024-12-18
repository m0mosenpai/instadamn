package X;

import android.os.Bundle;

/* renamed from: X.Mfz, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50992Mfz extends AbstractC52922bZ {
    public final O88 A00;

    public final void A00(String str, boolean z) {
        O88 o88 = this.A00;
        InterfaceC58268PsC interfaceC58268PsC = o88.A00;
        String str2 = o88.A01;
        Bundle A0b = AbstractC166987dD.A0b();
        if (str != null && str.length() > 0) {
            A0b.putString("form_id", str);
        }
        A0b.putBoolean("is_standard_form", z);
        InterfaceC58268PsC.A00(A0b, interfaceC58268PsC, str2, "lead_gen_thank_you_dialog", "consumer_thank_you_screen_secondary_action");
    }

    public final void A01(String str, boolean z) {
        O88 o88 = this.A00;
        InterfaceC58268PsC interfaceC58268PsC = o88.A00;
        String str2 = o88.A01;
        Bundle A0b = AbstractC166987dD.A0b();
        if (str != null && str.length() > 0) {
            A0b.putString("form_id", str);
        }
        A0b.putBoolean("is_standard_form", z);
        InterfaceC58268PsC.A00(A0b, interfaceC58268PsC, str2, "lead_gen_thank_you_dialog", "consumer_thank_you_screen_done");
    }

    public final void A02(String str, boolean z) {
        O88 o88 = this.A00;
        InterfaceC58268PsC interfaceC58268PsC = o88.A00;
        String str2 = o88.A01;
        Bundle A0b = AbstractC166987dD.A0b();
        if (str != null && str.length() > 0) {
            A0b.putString("form_id", str);
        }
        A0b.putBoolean("is_standard_form", z);
        InterfaceC58268PsC.A01(A0b, interfaceC58268PsC, str2, "lead_gen_thank_you_dialog", "consumer_thank_you_screen_impression");
    }

    public C50992Mfz(O88 o88) {
        this.A00 = o88;
    }
}
