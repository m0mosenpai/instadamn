package X;

import java.util.List;

/* loaded from: classes10.dex */
public final class SMQ {
    public final C02Q A00;
    public final InterfaceC65326Ti7 A01;
    public final String A02;
    public final List A03;
    public final Class A04;

    public SMQ(C02Q c02q, InterfaceC65326Ti7 interfaceC65326Ti7, Class cls, Class cls2, Class cls3, List list) {
        this.A04 = cls;
        this.A03 = list;
        this.A01 = interfaceC65326Ti7;
        this.A00 = c02q;
        this.A02 = AnonymousClass001.A15("Failed DecodePath{", cls.getSimpleName(), "->", cls2.getSimpleName(), "->", cls3.getSimpleName(), "}");
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("DecodePath{ dataClass=");
        A1C.append(this.A04);
        A1C.append(", decoders=");
        A1C.append(this.A03);
        A1C.append(", transcoder=");
        return AbstractC58320PtC.A11(this.A01, A1C);
    }
}
