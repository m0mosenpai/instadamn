package X;

import android.content.Context;

/* renamed from: X.1v3, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C40961v3 {
    public final Context A00;
    public final InterfaceC02550Ad A01;
    public final InterfaceC40711ue A02;
    public final C40681ub A03;
    public final InterfaceC08830cm A04;
    public final InterfaceC08830cm A05;
    public final InterfaceC08830cm A06;
    public final InterfaceC08830cm A07;
    public final InterfaceC09390do A08;
    public final InterfaceC09390do A09;
    public final InterfaceC09390do A0A;

    public C40961v3(C206319Bo c206319Bo) {
        InterfaceC08830cm interfaceC08830cm = (InterfaceC08830cm) c206319Bo.A00;
        if (interfaceC08830cm != null) {
            InterfaceC08830cm interfaceC08830cm2 = (InterfaceC08830cm) c206319Bo.A01;
            if (interfaceC08830cm2 != null) {
                InterfaceC08830cm interfaceC08830cm3 = (InterfaceC08830cm) c206319Bo.A02;
                if (interfaceC08830cm3 != null) {
                    InterfaceC02550Ad interfaceC02550Ad = (InterfaceC02550Ad) c206319Bo.A07;
                    C40681ub c40681ub = (C40681ub) c206319Bo.A04;
                    InterfaceC08830cm interfaceC08830cm4 = (InterfaceC08830cm) c206319Bo.A08;
                    Context context = (Context) c206319Bo.A05;
                    InterfaceC40711ue interfaceC40711ue = (InterfaceC40711ue) c206319Bo.A06;
                    C14360o3.A0B(context, 7);
                    this.A04 = interfaceC08830cm;
                    this.A05 = interfaceC08830cm2;
                    this.A07 = interfaceC08830cm3;
                    this.A01 = interfaceC02550Ad;
                    this.A03 = c40681ub;
                    this.A06 = interfaceC08830cm4;
                    this.A00 = context;
                    this.A02 = interfaceC40711ue;
                    EnumC09460dv enumC09460dv = EnumC09460dv.A04;
                    this.A08 = AbstractC09440dt.A00(enumC09460dv, new C206979Ec(this, 23));
                    this.A09 = AbstractC09440dt.A00(enumC09460dv, new C206979Ec(this, 24));
                    this.A0A = AbstractC09440dt.A00(enumC09460dv, new C206979Ec(this, 25));
                    return;
                }
                throw new IllegalArgumentException("Required value was null.");
            }
            throw new IllegalArgumentException("Required value was null.");
        }
        throw new IllegalArgumentException("Required value was null.");
    }
}
