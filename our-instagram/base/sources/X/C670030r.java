package X;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.30r, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C670030r implements InterfaceC670130s {
    public final /* synthetic */ C669430l A00;

    @Override // X.InterfaceC670130s
    public final void CtX(int i) {
    }

    @Override // X.InterfaceC670130s
    public final void D7Y() {
    }

    @Override // X.InterfaceC670130s
    public final C101484hA DnX(Integer num, List list) {
        C101484hA DnX;
        EnumC669930q enumC669930q;
        int i;
        int intValue;
        C14360o3.A0B(list, 0);
        C14360o3.A0B(num, 1);
        C669430l c669430l = this.A00;
        if (c669430l.A0L == C05F.A00) {
            int i2 = c669430l.A02;
            if (i2 != 0 && i2 != -1) {
                c669430l.A0E = true;
                C16930sl c16930sl = C16930sl.A00;
                return new C101484hA(c16930sl, c16930sl);
            }
            if (!list.isEmpty()) {
                C75113Zb c75113Zb = c669430l.A05;
                Long l = null;
                if (c75113Zb == null) {
                    C14360o3.A0F("seedMediaMediaState");
                    throw C00O.createAndThrow();
                }
                c75113Zb.A2N = true;
                HBC hbc = c669430l.A08;
                if (hbc != null) {
                    if (I25.A00(c669430l.A0I, hbc)) {
                        enumC669930q = EnumC669930q.A04;
                    } else {
                        enumC669930q = EnumC669930q.A03;
                    }
                    Map map = c669430l.A0D;
                    Number number = (Number) map.get(enumC669930q);
                    if (number != null) {
                        i = number.intValue();
                    } else {
                        i = 0;
                    }
                    map.put(enumC669930q, Integer.valueOf(i + 1));
                    C64042vP c64042vP = c669430l.A0K;
                    int i3 = c669430l.A03;
                    if (hbc.A02() == C05F.A01) {
                        intValue = c669430l.A01;
                    } else {
                        Integer num2 = hbc.A01().A0G;
                        if (num2 != null) {
                            intValue = num2.intValue();
                        }
                        c64042vP.A0H(hbc, (Integer) c669430l.A0D.get(enumC669930q), l, "server_delivered_iaa", i3);
                    }
                    l = Long.valueOf(intValue);
                    c64042vP.A0H(hbc, (Integer) c669430l.A0D.get(enumC669930q), l, "server_delivered_iaa", i3);
                }
            }
        }
        InterfaceC670130s interfaceC670130s = c669430l.A0A;
        if (interfaceC670130s != null && (DnX = interfaceC670130s.DnX(num, list)) != null) {
            return DnX;
        }
        C16930sl c16930sl2 = C16930sl.A00;
        return new C101484hA(c16930sl2, c16930sl2);
    }

    public C670030r(C669430l c669430l) {
        this.A00 = c669430l;
    }

    @Override // X.InterfaceC670130s
    public final Map Bkt() {
        return new LinkedHashMap();
    }

    @Override // X.InterfaceC670130s
    public final /* synthetic */ C101484hA DnY(Integer num, Integer num2, List list) {
        throw new UnsupportedOperationException(AbstractC111324zv.A00(24));
    }
}
