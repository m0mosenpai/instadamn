package X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.1xl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C42571xl implements InterfaceC42591xn {
    public final C42521xg A00;
    public final Map A01 = new HashMap();
    public final Map A03 = new HashMap();
    public final Map A02 = new HashMap();

    @Override // X.InterfaceC42591xn
    public final synchronized C3AR BUk(String str) {
        return (C3AR) this.A03.get(str);
    }

    @Override // X.InterfaceC42591xn
    public final synchronized C89483yo BfU(String str) {
        C89483yo c89483yo;
        if (str != null) {
            c89483yo = (C89483yo) this.A01.get(str);
        } else {
            c89483yo = null;
        }
        return c89483yo;
    }

    @Override // X.InterfaceC42591xn
    public final synchronized C3AX BkA(String str) {
        C3AX c3ax;
        C3AY c3ay = (C3AY) this.A02.get(str);
        if (c3ay != null) {
            c3ax = (C3AX) c3ay.A00;
        } else {
            c3ax = null;
        }
        return c3ax;
    }

    public final synchronized void A00(String str, boolean z, int i) {
        if (str != null) {
            Map map = this.A01;
            C89483yo c89483yo = (C89483yo) map.get(str);
            if (c89483yo == null) {
                c89483yo = new C89483yo();
                map.put(str, c89483yo);
            }
            if (z) {
                c89483yo.A02 = 512;
                c89483yo.A03 = 0;
                if (i != -1) {
                    i++;
                }
                c89483yo.A01 = i;
            } else {
                c89483yo.A03++;
            }
        }
    }

    public C42571xl(C42521xg c42521xg) {
        this.A00 = c42521xg;
    }
}
