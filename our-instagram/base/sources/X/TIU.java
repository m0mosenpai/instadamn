package X;

import java.lang.reflect.Method;
import java.util.Deque;
import java.util.Iterator;
import java.util.logging.Level;

/* loaded from: classes10.dex */
public final class TIU implements Cloneable {
    public C63026Saw A00;
    public boolean A01;
    public final TIY A02;
    public final C62696SMk A03;
    public final boolean A04;

    public final void A00(InterfaceC65534Tm4 interfaceC65534Tm4) {
        Object obj;
        synchronized (this) {
            if (!this.A01) {
                this.A01 = true;
            } else {
                throw AbstractC166987dD.A14("Already Executed");
            }
        }
        C63026Saw c63026Saw = this.A00;
        C63220SfQ c63220SfQ = C63220SfQ.A01;
        if (c63220SfQ instanceof C65163Tec) {
            C62574SGz c62574SGz = ((C65163Tec) c63220SfQ).A05;
            Method method = c62574SGz.A00;
            if (method != null) {
                try {
                    obj = method.invoke(null, new Object[0]);
                    c62574SGz.A01.invoke(obj, "response.body().close()");
                } catch (Exception unused) {
                }
            }
            obj = null;
        } else if (C63220SfQ.A00.isLoggable(Level.FINE)) {
            obj = new Throwable("response.body().close()");
        } else {
            obj = null;
        }
        c63026Saw.A00 = obj;
        C62950SYs c62950SYs = this.A02.A0J;
        C65148TeN c65148TeN = new C65148TeN(interfaceC65534Tm4, this);
        synchronized (c62950SYs) {
            Deque<C65148TeN> deque = c62950SYs.A01;
            deque.add(c65148TeN);
            TIU tiu = c65148TeN.A02;
            if (!tiu.A04) {
                String str = tiu.A03.A03.A02;
                Iterator it = c62950SYs.A02.iterator();
                while (true) {
                    if (it.hasNext()) {
                        r5 = (C65148TeN) it.next();
                        if (r5.A02.A03.A03.A02.equals(str)) {
                            break;
                        }
                    } else {
                        for (C65148TeN c65148TeN2 : deque) {
                            if (c65148TeN2.A02.A03.A03.A02.equals(str)) {
                            }
                        }
                    }
                }
                c65148TeN.A01 = c65148TeN2.A01;
            }
        }
        C62950SYs.A00(c62950SYs);
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        TIY tiy = this.A02;
        TIU tiu = new TIU(tiy, this.A03, this.A04);
        tiu.A00 = new C63026Saw(tiy, tiu);
        return tiu;
    }

    public TIU(TIY tiy, C62696SMk c62696SMk, boolean z) {
        this.A02 = tiy;
        this.A03 = c62696SMk;
        this.A04 = z;
    }
}
