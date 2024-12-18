package X;

import com.instagram.realtimeclient.RealtimeConstants;

/* loaded from: classes9.dex */
public final class OH3 {
    public final InterfaceC58268PsC A00;

    public final void A00(String str, boolean z) {
        String str2;
        C14360o3.A0B(str, 0);
        InterfaceC58268PsC interfaceC58268PsC = this.A00;
        if (z) {
            str2 = "success";
        } else {
            str2 = RealtimeConstants.SEND_FAIL;
        }
        interfaceC58268PsC.Ci4(null, str, "lead_gen_form_list", "available_forms_query", str2);
    }

    public OH3(InterfaceC58268PsC interfaceC58268PsC) {
        this.A00 = interfaceC58268PsC;
    }
}
