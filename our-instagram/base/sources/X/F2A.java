package X;

import java.util.HashMap;

/* loaded from: classes6.dex */
public abstract class F2A {
    public static final C32050E6c A00(C32048E6a c32048E6a) {
        String str;
        Integer num;
        C14360o3.A0B(c32048E6a, 0);
        String str2 = c32048E6a.A07;
        E6X e6x = c32048E6a.A00;
        HashMap hashMap = c32048E6a.A09;
        InterfaceC37236Gal interfaceC37236Gal = c32048E6a.A01;
        if (interfaceC37236Gal != null) {
            str = ((E7c) interfaceC37236Gal).A00;
        } else {
            str = null;
        }
        Long l = c32048E6a.A06;
        if (l != null) {
            num = Integer.valueOf((int) l.longValue());
        } else {
            num = null;
        }
        return new C32050E6c(e6x, null, c32048E6a.A02, num, C05F.A0N, str2, str, c32048E6a.A08, hashMap, AbstractC167007dF.A1T(c32048E6a.A03), AbstractC31177DnL.A1a(c32048E6a.A04), false);
    }
}
