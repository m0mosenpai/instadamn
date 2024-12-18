package X;

import com.instagram.realtimeclient.RealtimeConstants;

/* renamed from: X.OWq, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55017OWq {
    public final InterfaceC58268PsC A00;

    public static InterfaceC58268PsC A00(C55017OWq c55017OWq, Object obj) {
        C14360o3.A0B(obj, 0);
        return c55017OWq.A00;
    }

    public final void A02(String str, boolean z) {
        String str2;
        InterfaceC58268PsC A00 = A00(this, str);
        if (z) {
            str2 = "success";
        } else {
            str2 = RealtimeConstants.SEND_FAIL;
        }
        A00.Ci4(null, str, "lead_gen_manage_lead_forms_and_cta", "access_token_query", str2);
    }

    public final void A03(String str, boolean z) {
        String str2;
        InterfaceC58268PsC A00 = A00(this, str);
        if (z) {
            str2 = "success";
        } else {
            str2 = RealtimeConstants.SEND_FAIL;
        }
        A00.Ci4(null, str, "lead_gen_manage_lead_forms_and_cta", "available_forms_query", str2);
    }

    public C55017OWq(InterfaceC58268PsC interfaceC58268PsC) {
        this.A00 = interfaceC58268PsC;
    }

    public final void A01(String str) {
        InterfaceC58268PsC.A03(A00(this, str), str, "lead_gen_manage_lead_forms_and_cta", AbstractC43591JPw.A00(785));
    }
}
