package X;

import java.util.Map;

/* renamed from: X.ItK, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42601ItK implements InterfaceC61772re, InterfaceC65232xL {
    public final int A00;
    public final Object A01;

    public C42601ItK(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC61772re, X.InterfaceC61782rf
    public final C75113Zb BRZ(C38321qM c38321qM) {
        int i = this.A00;
        C14360o3.A0B(c38321qM, 0);
        Object obj = this.A01;
        switch (i) {
            case 0:
                Map map = ((HCU) obj).A05;
                Object obj2 = map.get(c38321qM);
                if (obj2 == null) {
                    obj2 = AbstractC37303Gc4.A0E(c38321qM);
                    map.put(c38321qM, obj2);
                }
                return (C75113Zb) obj2;
            case 1:
                Map map2 = ((HCV) obj).A05;
                Object obj3 = map2.get(c38321qM);
                if (obj3 == null) {
                    obj3 = AbstractC37303Gc4.A0E(c38321qM);
                    map2.put(c38321qM, obj3);
                }
                return (C75113Zb) obj3;
            case 2:
                Map map3 = ((HCS) obj).A06;
                Object obj4 = map3.get(c38321qM);
                if (obj4 == null) {
                    obj4 = AbstractC37303Gc4.A0E(c38321qM);
                    map3.put(c38321qM, obj4);
                }
                return (C75113Zb) obj4;
            default:
                Map map4 = ((HCT) obj).A06;
                Object obj5 = map4.get(c38321qM);
                if (obj5 == null) {
                    obj5 = AbstractC37303Gc4.A0E(c38321qM);
                    map4.put(c38321qM, obj5);
                }
                return (C75113Zb) obj5;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.InterfaceC65232xL
    public final void CtR(C38321qM c38321qM) {
        InterfaceC09390do interfaceC09390do;
        switch (this.A00) {
            case 0:
                HEX.A00((HCU) this.A01);
                return;
            case 1:
                HEY.A00((HCV) this.A01);
                return;
            case 2:
                interfaceC09390do = ((HCS) this.A01).A07;
                C38975HEd.A00(interfaceC09390do);
                return;
            default:
                interfaceC09390do = ((HCT) this.A01).A07;
                C38975HEd.A00(interfaceC09390do);
                return;
        }
    }
}
