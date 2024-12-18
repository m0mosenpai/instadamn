package X;

import java.util.Iterator;

/* loaded from: classes11.dex */
public final class WUA implements InterfaceC65635Tpw, InterfaceC65338TiJ {
    public final int A00;
    public final Object A01;

    public WUA(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0004. Please report as an issue. */
    @Override // X.InterfaceC65635Tpw
    public final void onSuccess() {
        C66542ULx c66542ULx;
        String str;
        int i = this.A00;
        Object obj = this.A01;
        switch (i) {
            case 0:
                AbstractC69673VtI abstractC69673VtI = (AbstractC69673VtI) obj;
                Iterator it = abstractC69673VtI.A00.iterator();
                while (it.hasNext()) {
                    abstractC69673VtI.A00((InterfaceC65338TiJ) it.next());
                }
                return;
            case 1:
                c66542ULx = (C66542ULx) obj;
                str = "PIN_ADDRESS_SHARED";
                AbstractC66543ULy.A04(c66542ULx, null, str);
                C66542ULx.A01(c66542ULx);
                return;
            case 2:
                c66542ULx = (C66542ULx) obj;
                str = "LOADED";
                AbstractC66543ULy.A04(c66542ULx, null, str);
                C66542ULx.A01(c66542ULx);
                return;
            default:
                AbstractC69673VtI abstractC69673VtI2 = (AbstractC69673VtI) obj;
                Iterator it2 = abstractC69673VtI2.A00.iterator();
                while (it2.hasNext()) {
                    abstractC69673VtI2.A00((InterfaceC65338TiJ) it2.next());
                }
                return;
        }
    }

    @Override // X.InterfaceC65338TiJ
    public final void onError(Throwable th) {
        throw C00O.createAndThrow();
    }
}
