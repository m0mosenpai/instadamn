package X;

import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes12.dex */
public final class XN4 extends AbstractC17030sv {
    public final HashSet A00;
    public final Iterator A01;
    public final InterfaceC16660sJ A02;

    public XN4(Iterator it, InterfaceC16660sJ interfaceC16660sJ) {
        C14360o3.A0B(it, 1);
        this.A01 = it;
        this.A02 = interfaceC16660sJ;
        this.A00 = AbstractC166987dD.A1H();
    }

    @Override // X.AbstractC17030sv
    public final void A00() {
        int i;
        while (true) {
            Iterator it = this.A01;
            if (it.hasNext()) {
                Object next = it.next();
                if (this.A00.add(this.A02.invoke(next))) {
                    super.A01 = next;
                    i = 1;
                    break;
                }
            } else {
                i = 2;
                break;
            }
        }
        super.A00 = i;
    }
}
