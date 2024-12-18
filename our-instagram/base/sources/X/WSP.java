package X;

import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes11.dex */
public final class WSP implements InterfaceC71939XBo {
    public final WFa A00 = new WFa();

    @Override // X.InterfaceC71939XBo
    public final /* synthetic */ void reset() {
    }

    @Override // X.InterfaceC71939XBo
    public final void E3P(InterfaceC71874X8h interfaceC71874X8h, C70003VzN c70003VzN, byte[] bArr, int i, int i2) {
        W5G A00;
        WFa wFa = this.A00;
        wFa.A0Q(bArr, i2 + i);
        wFa.A0O(i);
        ArrayList arrayList = new ArrayList();
        while (true) {
            int i3 = wFa.A00 - wFa.A01;
            if (i3 > 0) {
                WDn.A03(AbstractC43593JPy.A1Z(i3, 8), "Incomplete Mp4Webvtt Top Level box header found.");
                int A01 = wFa.A01() - 8;
                if (wFa.A01() == 1987343459) {
                    CharSequence charSequence = null;
                    C69660Vt1 c69660Vt1 = null;
                    while (A01 > 0) {
                        WDn.A03(AbstractC43593JPy.A1Z(A01, 8), "Incomplete vtt cue box header found.");
                        int A012 = wFa.A01();
                        int A013 = wFa.A01();
                        int i4 = A012 - 8;
                        String str = new String(wFa.A02, wFa.A01, i4, AbstractC50482Ts.A05);
                        wFa.A0P(i4);
                        A01 = (A01 - 8) - i4;
                        if (A013 == 1937011815) {
                            C69653Vsu c69653Vsu = new C69653Vsu();
                            AbstractC70183WFl.A04(c69653Vsu, str);
                            c69660Vt1 = c69653Vsu.A00();
                        } else if (A013 == 1885436268) {
                            charSequence = AbstractC70183WFl.A00(null, str.trim(), Collections.emptyList());
                        }
                    }
                    if (charSequence == null) {
                        charSequence = "";
                    }
                    if (c69660Vt1 != null) {
                        c69660Vt1.A0E = charSequence;
                        A00 = c69660Vt1.A00();
                    } else {
                        C69653Vsu c69653Vsu2 = new C69653Vsu();
                        c69653Vsu2.A0A = charSequence;
                        A00 = c69653Vsu2.A00().A00();
                    }
                    arrayList.add(A00);
                } else {
                    wFa.A0P(A01);
                }
            } else {
                interfaceC71874X8h.accept(new C69037Vge(arrayList, -9223372036854775807L, -9223372036854775807L));
                return;
            }
        }
    }
}
