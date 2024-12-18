package X;

import java.util.List;
import java.util.Map;

/* renamed from: X.Ipu, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42393Ipu implements InterfaceC43071ya {
    public final /* synthetic */ C39148HLb A02;
    public final Map A01 = AbstractC166987dD.A1I();
    public final Map A00 = AbstractC166987dD.A1I();

    @Override // X.InterfaceC43071ya
    public final void ATP(C59062n7 c59062n7, InterfaceC57162jr interfaceC57162jr) {
        boolean A1R = AbstractC167007dF.A1R(0, c59062n7, interfaceC57162jr);
        Object obj = c59062n7.A03;
        C38321qM c38321qM = (C38321qM) obj;
        String id = c38321qM.getId();
        if (id != null) {
            int A01 = AbstractC37301Gc2.A01(c59062n7, interfaceC57162jr);
            if (A01 != 0 && A01 != A1R) {
                A01(id, 0.0f);
                Number number = (Number) this.A00.remove(id);
                if (number != null) {
                    long longValue = number.longValue();
                    C39148HLb c39148HLb = this.A02;
                    if (longValue >= c39148HLb.A04) {
                        C14360o3.A06(obj);
                        if (C1VN.A00 != null && c39148HLb.A00 < c39148HLb.A03) {
                            C14120nc.A00().ATO(new C39102HJa(c38321qM, this, c39148HLb, id, longValue));
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            A01(id, interfaceC57162jr.CGk(c59062n7));
        }
    }

    public C42393Ipu(C39148HLb c39148HLb) {
        this.A02 = c39148HLb;
    }

    public static final List A00(C42393Ipu c42393Ipu, String str, java.util.Set set, java.util.Set set2, int i, boolean z) {
        List AbA = ((C25381Ls) ((InterfaceC25391Lt) c42393Ipu.A02.A0B.getValue())).A00.AbA();
        C14360o3.A0B(AbA, 0);
        return AbstractC224517h.A02(AbstractC224517h.A07(AbstractC224517h.A04(new MIG(set2, set, str, 9, z), new C0eN(AbA)), i));
    }

    private final void A01(String str, float f) {
        Map map = this.A01;
        Number A0Q = AbstractC37300Gc1.A0Q(str, map);
        double d = f;
        double d2 = this.A02.A01;
        if (A0Q != null) {
            if (d < d2) {
                long currentTimeMillis = System.currentTimeMillis() - A0Q.longValue();
                map.remove(str);
                Map map2 = this.A00;
                map2.put(str, Long.valueOf(currentTimeMillis + AbstractC25232BEp.A0t(AbstractC37300Gc1.A0Q(str, map2))));
                return;
            }
            return;
        }
        if (d < d2) {
            return;
        }
        map.put(str, AbstractC31173DnH.A0g());
    }
}
