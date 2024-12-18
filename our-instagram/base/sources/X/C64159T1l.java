package X;

import java.util.Map;

/* renamed from: X.T1l, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64159T1l implements InterfaceC65500TlP {
    public final /* synthetic */ C63196Sey A00;

    public C64159T1l(C63196Sey c63196Sey) {
        this.A00 = c63196Sey;
    }

    @Override // X.InterfaceC65500TlP
    public final void DBk() {
        C63196Sey c63196Sey = this.A00;
        Object obj = c63196Sey.A06.get();
        if (c63196Sey.A00 != null && obj != null) {
            synchronized (c63196Sey) {
                Map map = c63196Sey.A08;
                EnumC61137Rfr enumC61137Rfr = EnumC61137Rfr.A06;
                EnumC61113RfT enumC61113RfT = EnumC61113RfT.A03;
                map.put(enumC61137Rfr, enumC61113RfT);
                map.put(EnumC61137Rfr.A07, enumC61113RfT);
                map.put(EnumC61137Rfr.A05, enumC61113RfT);
                C63196Sey.A01(c63196Sey);
            }
        }
    }

    @Override // X.InterfaceC65500TlP
    public final /* bridge */ /* synthetic */ void DBm(Object obj) {
        Map map = (Map) obj;
        if (map == null) {
            this.A00.A05.logError("Model download callback succeeded but results null", null);
            DBk();
            return;
        }
        C63196Sey c63196Sey = this.A00;
        synchronized (c63196Sey) {
            Map map2 = c63196Sey.A08;
            EnumC61137Rfr enumC61137Rfr = EnumC61137Rfr.A06;
            EnumC61113RfT enumC61113RfT = EnumC61113RfT.A02;
            map2.put(enumC61137Rfr, enumC61113RfT);
            EnumC61137Rfr enumC61137Rfr2 = EnumC61137Rfr.A07;
            map2.put(enumC61137Rfr2, enumC61113RfT);
            EnumC61137Rfr enumC61137Rfr3 = EnumC61137Rfr.A05;
            map2.put(enumC61137Rfr3, enumC61113RfT);
            Map map3 = c63196Sey.A07;
            map3.put(enumC61137Rfr, map.get(EnumC61112RfS.A03));
            map3.put(enumC61137Rfr2, map.get(EnumC61112RfS.A04));
            map3.put(enumC61137Rfr3, map.get(EnumC61112RfS.A02));
            C63196Sey.A00(c63196Sey);
        }
    }
}
