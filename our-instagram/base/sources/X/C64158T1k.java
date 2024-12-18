package X;

import java.util.Map;

/* renamed from: X.T1k, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64158T1k implements InterfaceC65500TlP {
    public final /* synthetic */ C63196Sey A00;

    public C64158T1k(C63196Sey c63196Sey) {
        this.A00 = c63196Sey;
    }

    @Override // X.InterfaceC65500TlP
    public final void DBk() {
        C63196Sey c63196Sey = this.A00;
        Object obj = c63196Sey.A06.get();
        if (c63196Sey.A00 != null && obj != null) {
            synchronized (c63196Sey) {
                c63196Sey.A08.put(EnumC61137Rfr.A04, EnumC61113RfT.A03);
                C63196Sey.A01(c63196Sey);
            }
        }
    }

    @Override // X.InterfaceC65500TlP
    public final /* bridge */ /* synthetic */ void DBm(Object obj) {
        if (obj == null) {
            this.A00.A05.logError("Model download callback succeeded but path null", null);
            DBk();
            return;
        }
        C63196Sey c63196Sey = this.A00;
        synchronized (c63196Sey) {
            Map map = c63196Sey.A08;
            EnumC61137Rfr enumC61137Rfr = EnumC61137Rfr.A04;
            map.put(enumC61137Rfr, EnumC61113RfT.A02);
            c63196Sey.A07.put(enumC61137Rfr, obj);
            C63196Sey.A00(c63196Sey);
        }
    }
}
