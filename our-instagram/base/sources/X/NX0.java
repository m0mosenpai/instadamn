package X;

import java.util.Map;

/* loaded from: classes9.dex */
public final class NX0 extends C1810281e {
    public InterfaceC57827Pkt A00;
    public final Map A01;
    public final java.util.Set A02;

    public final void A06(InterfaceC57827Pkt interfaceC57827Pkt, InterfaceC57827Pkt interfaceC57827Pkt2, Object obj, Object obj2) {
        C14360o3.A0B(obj2, 3);
        A03(obj.getClass(), interfaceC57827Pkt, interfaceC57827Pkt2);
        A03(obj2.getClass(), interfaceC57827Pkt2, interfaceC57827Pkt);
    }

    @Override // X.C1810281e
    public final void A04(Object obj) {
        if (obj instanceof C52528NMa) {
            InterfaceC57827Pkt interfaceC57827Pkt = this.A00;
            if (interfaceC57827Pkt != null) {
                if (interfaceC57827Pkt.equals(super.A00.first)) {
                    obj = OS9.A00;
                    super.A04(obj);
                }
            }
            C14360o3.A0F("startState");
            throw C00O.createAndThrow();
        }
        if (this.A02.contains(obj)) {
            Map map = this.A01;
            Object obj2 = super.A00.first;
            C14360o3.A07(obj2);
            InterfaceC57827Pkt interfaceC57827Pkt2 = (InterfaceC57827Pkt) obj2;
            InterfaceC57827Pkt interfaceC57827Pkt3 = this.A00;
            if (interfaceC57827Pkt3 != null) {
                Object obj3 = map.get(new C51760Mtj(interfaceC57827Pkt2, interfaceC57827Pkt3, obj));
                if (obj3 != null) {
                    obj = obj3;
                }
            }
            C14360o3.A0F("startState");
            throw C00O.createAndThrow();
        }
        super.A04(obj);
    }

    public final void A08(InterfaceC57827Pkt interfaceC57827Pkt, Object obj) {
        A03(obj.getClass(), C56437P3y.A00, interfaceC57827Pkt);
        A03(OS9.class, interfaceC57827Pkt, C56436P3x.A00);
    }

    public NX0(InterfaceC57827Pkt interfaceC57827Pkt) {
        super(interfaceC57827Pkt);
        this.A02 = AbstractC31171DnF.A0l();
        this.A01 = AbstractC166987dD.A1I();
        A02(new C56743PGl(this, 0));
    }

    public final void A05(InterfaceC57827Pkt interfaceC57827Pkt, InterfaceC57827Pkt interfaceC57827Pkt2, Class cls) {
        A03(cls, interfaceC57827Pkt, interfaceC57827Pkt2);
        A03(OSA.class, interfaceC57827Pkt2, interfaceC57827Pkt);
    }

    public final void A07(InterfaceC57827Pkt interfaceC57827Pkt, Object obj) {
        A03(obj.getClass(), interfaceC57827Pkt, C56436P3x.A00);
    }
}
