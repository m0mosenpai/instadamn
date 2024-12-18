package X;

import java.util.Iterator;

/* loaded from: classes12.dex */
public final class XMd extends AbstractC42051wv {
    public final Iterable A00;

    @Override // X.AbstractC42051wv
    public final void A02(InterfaceC42071wx interfaceC42071wx) {
        try {
            Iterator it = this.A00.iterator();
            if (it.hasNext()) {
                XMZ xmz = new XMZ(interfaceC42071wx, it);
                interfaceC42071wx.Dpc(xmz);
                if (xmz.A02) {
                    return;
                }
                while (!xmz.A05) {
                    try {
                        Iterator it2 = xmz.A04;
                        Object next = it2.next();
                        AbstractC42141x4.A01(next, "The iterator returned a null value");
                        InterfaceC42071wx interfaceC42071wx2 = xmz.A03;
                        interfaceC42071wx2.DVo(next);
                        if (!xmz.A05) {
                            try {
                                if (!it2.hasNext()) {
                                    if (!xmz.A05) {
                                        interfaceC42071wx2.onComplete();
                                        return;
                                    }
                                    return;
                                }
                            } catch (Throwable th) {
                                AbstractC62281S5a.A00(th);
                                interfaceC42071wx2.onError(th);
                                return;
                            }
                        } else {
                            return;
                        }
                    } catch (Throwable th2) {
                        AbstractC62281S5a.A00(th2);
                        xmz.A03.onError(th2);
                        return;
                    }
                }
                return;
            }
            interfaceC42071wx.Dpc(EnumC137086Im.INSTANCE);
            interfaceC42071wx.onComplete();
        } catch (Throwable th3) {
            AbstractC62281S5a.A00(th3);
            interfaceC42071wx.Dpc(EnumC137086Im.INSTANCE);
            interfaceC42071wx.onError(th3);
        }
    }

    public XMd(Iterable iterable) {
        this.A00 = iterable;
    }
}
