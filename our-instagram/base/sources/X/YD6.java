package X;

import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes12.dex */
public final class YD6 implements YOw {
    public boolean A00;
    public final C72863XpS A01 = new C72863XpS();

    @Override // X.YOw
    public final void AGF(Xl5 xl5) {
        if (!this.A00) {
            this.A00 = true;
            C72863XpS c72863XpS = this.A01;
            YDP ydp = new YDP();
            Iterator A14 = AbstractC166997dE.A14(c72863XpS.A00);
            while (A14.hasNext()) {
                ydp.A00(AbstractC166987dD.A1K(A14).getValue());
            }
            Iterator it = ydp.iterator();
            while (it.hasNext()) {
                ((YOw) it.next()).AGF(xl5);
            }
        }
    }

    @Override // X.YOw
    public final void ELC(InterfaceC73607YNx interfaceC73607YNx, Xl5 xl5, AbstractC73413YCe abstractC73413YCe) {
        if (abstractC73413YCe != null) {
            throw AbstractC166987dD.A15("effectId");
        }
        C72863XpS c72863XpS = this.A01;
        HashSet A1H = AbstractC166987dD.A1H();
        Iterator it = c72863XpS.A00.keySet().iterator();
        while (it.hasNext()) {
            A1H.add(it.next());
        }
        Iterator it2 = A1H.iterator();
        while (it2.hasNext()) {
            Number number = (Number) it2.next();
            int intValue = number.intValue();
            YOw yOw = (YOw) c72863XpS.A00.get(number);
            yOw.ELC(new YDE(yOw, interfaceC73607YNx, xl5, this, intValue), xl5, abstractC73413YCe);
        }
    }
}
