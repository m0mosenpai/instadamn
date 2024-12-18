package X;

import android.os.Message;
import com.instagram.ui.widget.shutterbutton.ShutterButton;
import java.io.File;
import java.util.HashMap;

/* renamed from: X.Ans, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C24169Ans implements InterfaceC184828Hx {
    public final int A00;
    public final Object A01;

    public C24169Ans(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC184828Hx
    public final void DmU() {
        C22975AAz c22975AAz;
        switch (this.A00) {
            case 0:
                c22975AAz = ((AX0) this.A01).A08;
                break;
            case 1:
                c22975AAz = ((AAM) this.A01).A02;
                break;
            case 2:
                InterfaceC1810081c interfaceC1810081c = ((C198818qe) this.A01).A09.A00.A08;
                C14360o3.A0B(interfaceC1810081c, 0);
                interfaceC1810081c.E4u(new Object());
                return;
            case 3:
                ((C25865BcK) ((C214729fA) this.A01).A0A.getValue()).A01(C23823AgY.A00);
                return;
            default:
                C23874AhT c23874AhT = (C23874AhT) this.A01;
                C22C.A0C(AnonymousClass229.A01(c23874AhT.A06), "AUDIO_CONTROLS_VOICEOVER_RECORD");
                if (!AbstractC23451Ch.A07(c23874AhT.A05, "android.permission.RECORD_AUDIO")) {
                    AbstractC23451Ch.A04(c23874AhT.A04, c23874AhT, "android.permission.RECORD_AUDIO");
                    return;
                }
                c23874AhT.A09.A01();
                ShutterButton shutterButton = c23874AhT.A01;
                if (shutterButton != null) {
                    shutterButton.setMode(EnumC131445wb.A02);
                }
                C185458Kn c185458Kn = c23874AhT.A02;
                if (c185458Kn == null) {
                    return;
                }
                c185458Kn.A02.sendMessage(Message.obtain());
                return;
        }
        C214899fR c214899fR = c22975AAz.A00;
        AAB A01 = c214899fR.A01();
        AKN akn = A01.A03;
        C22812A4f c22812A4f = A01.A02;
        HashMap A1G = AbstractC166987dD.A1G();
        A1G.putAll(c22812A4f.A00);
        AWL awl = A01.A00;
        C14360o3.A0B(awl, 1);
        C22936A9g c22936A9g = new C22936A9g();
        C224669vr c224669vr = A4B.A02;
        C14360o3.A0B(c224669vr, 0);
        c22936A9g.A03 = AbstractC166987dD.A1a(A1G.get(c224669vr));
        C224669vr c224669vr2 = A4B.A03;
        C14360o3.A0B(c224669vr2, 0);
        c22936A9g.A05 = AbstractC166987dD.A1a(A1G.get(c224669vr2));
        C14360o3.A0B(c224669vr, 0);
        c22936A9g.A04 = AbstractC166987dD.A1a(A1G.get(c224669vr));
        C224669vr c224669vr3 = A4B.A01;
        C14360o3.A0B(c224669vr3, 0);
        boolean containsKey = A1G.containsKey(c224669vr3);
        if (containsKey) {
            c22936A9g.A00 = (File) A1G.get(c224669vr3);
        }
        akn.A08.DfO(new C23494AbA(true));
        ((InterfaceC178817wt) akn.A0A.Aq0(InterfaceC178817wt.A01)).getHandler().post(new RunnableC24825Ayl(c22936A9g, awl, akn, containsKey));
        C23656Adr.A00(EnumC223239t9.A0Z, c214899fR.A02());
    }
}
