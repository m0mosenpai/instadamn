package X;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.widget.TextView;
import java.util.Arrays;

/* loaded from: classes10.dex */
public final class Q7c extends AbstractC72483Mv {
    public final InterfaceC09390do A00;
    public final InterfaceC09390do A01;

    public Q7c() {
        C57545PgJ c57545PgJ = new C57545PgJ(this, 47);
        EnumC09460dv enumC09460dv = EnumC09460dv.A02;
        InterfaceC09390do A00 = AbstractC09440dt.A00(enumC09460dv, new C57545PgJ(c57545PgJ, 48));
        C0YZ c0yz = new C0YZ(C44455JlN.class);
        this.A01 = new C60842q8(new C57545PgJ(A00, 49), new C57254Pbc(33, A00, this), new C57254Pbc(32, null, A00), c0yz);
        InterfaceC09390do A13 = AbstractC58322PtE.A13(new C57545PgJ(this, 46), enumC09460dv, 0);
        C0YZ c0yz2 = new C0YZ(Q8Y.class);
        this.A00 = new C60842q8(new C57238PbM(A13, 1), new C57254Pbc(35, A13, this), new C57254Pbc(34, null, A13), c0yz2);
    }

    @Override // X.C0SG
    public final Dialog A0F(Bundle bundle) {
        Context requireContext = requireContext();
        InterfaceC09390do interfaceC09390do = this.A00;
        DialogC58693Q0w dialogC58693Q0w = new DialogC58693Q0w(requireContext, (C38628GyV) Q8Y.A00(interfaceC09390do).A01);
        AbstractC58318PtA.A0L(this.A01).A0E(new L2D(C05F.A15, C05F.A01, C05F.A0N, (C09530e4[]) Arrays.copyOf(new C09530e4[0], 0)));
        dialogC58693Q0w.A03.setText(((UPD) Q8Y.A00(interfaceC09390do).A05).A04);
        dialogC58693Q0w.A00.setText(((UPD) Q8Y.A00(interfaceC09390do).A05).A03);
        TextView textView = dialogC58693Q0w.A01;
        textView.setText(((UPD) Q8Y.A00(interfaceC09390do).A05).A05);
        C0fQ.A00(new ViewOnClickListenerC63509Soc(dialogC58693Q0w, this, 12), textView);
        TextView textView2 = dialogC58693Q0w.A02;
        textView2.setText(((UPD) Q8Y.A00(interfaceC09390do).A05).A01);
        textView2.setTextColor(((UPD) Q8Y.A00(interfaceC09390do).A05).A02);
        C0fQ.A00(new ViewOnClickListenerC63509Soc(dialogC58693Q0w, this, 13), textView2);
        return dialogC58693Q0w;
    }
}
