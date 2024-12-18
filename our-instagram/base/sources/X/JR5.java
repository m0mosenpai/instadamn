package X;

import java.util.Map;

/* loaded from: classes8.dex */
public final /* synthetic */ class JR5 implements InterfaceC42241xE {
    public final /* synthetic */ C42411xV A00;
    public final /* synthetic */ C75363a3 A01;
    public final /* synthetic */ String A02;

    public /* synthetic */ JR5(C42411xV c42411xV, C75363a3 c75363a3, String str) {
        this.A00 = c42411xV;
        this.A01 = c75363a3;
        this.A02 = str;
    }

    @Override // X.InterfaceC42241xE
    public final void accept(Object obj) {
        C42411xV c42411xV = this.A00;
        C75363a3 c75363a3 = this.A01;
        String str = this.A02;
        C42571xl c42571xl = c42411xV.A09;
        synchronized (c42571xl) {
            c42571xl.A03.get(str);
        }
        C42941yM c42941yM = c42411xV.A06;
        if (c42941yM != null) {
            Map map = c42941yM.A02;
            java.util.Set set = (java.util.Set) map.get(str);
            if (set == null) {
                set = AbstractC166987dD.A1H();
                map.put(str, set);
            }
            set.add(c75363a3);
        }
    }
}
