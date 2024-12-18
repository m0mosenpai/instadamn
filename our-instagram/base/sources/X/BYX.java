package X;

import android.text.style.ClickableSpan;
import android.view.View;

/* loaded from: classes5.dex */
public final class BYX extends ClickableSpan {
    public final int A00;
    public final Object A01;

    public BYX(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        if (this.A00 != 0) {
            C3DO c3do = C3DN.A00;
            C26767Bro c26767Bro = (C26767Bro) this.A01;
            C189478aR A0x = AbstractC25228BEl.A0x(c26767Bro.requireActivity(), c3do);
            if (A0x != null) {
                InterfaceC09390do interfaceC09390do = c26767Bro.A02;
                C33211Ekz A00 = AbstractC34033F0m.A00(AbstractC166987dD.A0r(interfaceC09390do), "caption_settings", null, true, false, false, false);
                C189448aO A0g = AbstractC25231BEo.A0g(interfaceC09390do);
                AbstractC25226BEj.A1M(c26767Bro.requireContext(), A0g, 2131975719);
                A0x.A0F(A00, A0g);
                return;
            }
            return;
        }
        C27071Bwv c27071Bwv = (C27071Bwv) this.A01;
        C6UR c6ur = c27071Bwv.A01;
        if (c6ur == null) {
            return;
        }
        C9CI c9ci = c27071Bwv.A06;
        C14360o3.A0B(c9ci, 0);
        InterfaceC16660sJ interfaceC16660sJ = ((C6UQ) c6ur).A00.A00;
        if (interfaceC16660sJ == null) {
            return;
        }
        interfaceC16660sJ.invoke(c9ci.A06);
    }
}
