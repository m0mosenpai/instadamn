package X;

import java.util.Iterator;

/* loaded from: classes12.dex */
public final class YD8 implements YOw {
    public int A00;
    public boolean A01;
    public final YDP A02 = new YDP();
    public final YDP A03 = new YDP();

    @Override // X.YOw
    public final void AGF(Xl5 xl5) {
        if (!this.A01) {
            this.A01 = true;
            Iterator it = this.A02.iterator();
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
        YDP ydp = this.A02;
        if (ydp.A00.isEmpty()) {
            this.A01 = true;
            interfaceC73607YNx.DD3(new YDP());
        } else {
            for (int i = 0; i < ydp.A00.size(); i++) {
                ((YOw) ydp.A00.get(i)).ELC(new YDD(interfaceC73607YNx, xl5, this, i), xl5, abstractC73413YCe);
            }
        }
    }
}
