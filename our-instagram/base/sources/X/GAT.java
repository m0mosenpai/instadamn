package X;

import android.os.Bundle;

/* loaded from: classes6.dex */
public final class GAT implements GZK {
    public final /* synthetic */ EMR A00;
    public final /* synthetic */ String A01;

    public GAT(EMR emr, String str) {
        this.A00 = emr;
        this.A01 = str;
    }

    @Override // X.GZK
    public final void DFf() {
        EMR emr = this.A00;
        EVN evn = emr.A02;
        if (evn != null) {
            evn.A00();
        }
        C9GR.A01(emr.requireContext(), "cp_acquisition_phone", 2131974293, 1);
    }

    @Override // X.GZK
    public final void Dq1(R1L r1l) {
        EMR emr = this.A00;
        EVN evn = emr.A02;
        if (evn != null) {
            evn.A00();
        }
        if (r1l != null) {
            C60019Qsf A0E = r1l.A0E();
            if (A0E != null && A0E.getRequiredBooleanField(0, "auto_confirmed")) {
                InterfaceC37264GbH interfaceC37264GbH = emr.A01;
                if (interfaceC37264GbH != null) {
                    interfaceC37264GbH.CnE(1);
                    return;
                }
                return;
            }
            C60019Qsf A0E2 = r1l.A0E();
            if (A0E2 != null && A0E2.getRequiredBooleanField(1, "code_sent")) {
                String str = this.A01;
                Bundle A0b = AbstractC166987dD.A0b();
                A0b.putString("nux_contact_point", str);
                A0b.putBoolean("nux_contact_point_is_phone", true);
                AbstractC31172DnG.A1A();
                EMS ems = new EMS();
                AbstractC31179DnN.A0y(ems, AbstractC31173DnH.A0J(A0b, ems, emr), emr.A06);
                return;
            }
        }
        C9GR.A01(emr.requireContext(), "cp_acquisition_phone", 2131974293, 1);
    }
}
