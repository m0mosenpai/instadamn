package X;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.widget.TextView;

/* loaded from: classes10.dex */
public final class Q7b extends AbstractC72483Mv {
    public final InterfaceC09390do A00;
    public final InterfaceC09390do A01;

    public Q7b() {
        C57545PgJ c57545PgJ = new C57545PgJ(this, 41);
        EnumC09460dv enumC09460dv = EnumC09460dv.A02;
        InterfaceC09390do A00 = AbstractC09440dt.A00(enumC09460dv, new C57545PgJ(c57545PgJ, 42));
        C0YZ c0yz = new C0YZ(C44455JlN.class);
        this.A01 = new C60842q8(new C57545PgJ(A00, 43), new C57254Pbc(29, A00, this), new C57254Pbc(28, null, A00), c0yz);
        InterfaceC09390do A002 = AbstractC09440dt.A00(enumC09460dv, new C57545PgJ(new C57545PgJ(this, 40), 44));
        C0YZ c0yz2 = new C0YZ(Q8Y.class);
        this.A00 = new C60842q8(new C57545PgJ(A002, 45), new C57254Pbc(31, A002, this), new C57254Pbc(30, null, A002), c0yz2);
    }

    @Override // X.C0SG
    public final Dialog A0F(Bundle bundle) {
        Context requireContext = requireContext();
        InterfaceC09390do interfaceC09390do = this.A00;
        DialogC58693Q0w dialogC58693Q0w = new DialogC58693Q0w(requireContext, (C38628GyV) Q8Y.A00(interfaceC09390do).A01);
        AbstractC58323PtF.A1I(AbstractC58318PtA.A0L(this.A01), C05F.A15, C05F.A01, C05F.A0C, new C09530e4[0]);
        dialogC58693Q0w.A03.setText(((UQ7) Q8Y.A00(interfaceC09390do).A03).A01);
        dialogC58693Q0w.A00.setText(((UQ7) Q8Y.A00(interfaceC09390do).A03).A00);
        TextView textView = dialogC58693Q0w.A01;
        textView.setText(((UQ7) Q8Y.A00(interfaceC09390do).A03).A02);
        ViewOnClickListenerC63509Soc.A00(textView, 10, this, dialogC58693Q0w);
        TextView textView2 = dialogC58693Q0w.A02;
        textView2.setText(((UQ7) Q8Y.A00(interfaceC09390do).A03).A03);
        ViewOnClickListenerC63509Soc.A00(textView2, 11, this, dialogC58693Q0w);
        return dialogC58693Q0w;
    }
}
