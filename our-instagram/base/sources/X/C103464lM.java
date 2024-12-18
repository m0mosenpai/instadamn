package X;

/* renamed from: X.4lM, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C103464lM implements InterfaceC73233Pz {
    public C39561sd A00;
    public C6T7 A01;
    public C103434lJ A02;
    public C914346k A03;
    public Integer A04;
    public Integer A05;
    public String A06;
    public String A07;
    public String A08;
    public boolean A09;

    public final C102884kP A00() {
        C914346k c914346k;
        C6T7 c6t7 = this.A01;
        if (c6t7 != null) {
            return AnonymousClass634.A02(c6t7.A02()).A06;
        }
        C103434lJ c103434lJ = this.A02;
        if (c103434lJ == null && (c914346k = this.A03) != null) {
            c103434lJ = AbstractC40567Hyn.A00(c914346k).A01;
            this.A02 = c103434lJ;
        }
        if (c103434lJ == null) {
            C0w9.A03("null_bloks_data", "Netego bloks layout should not be null");
            return null;
        }
        return c103434lJ.A01().A00;
    }

    public final C102824kJ A01() {
        C914346k c914346k;
        C103434lJ c103434lJ = this.A02;
        if (c103434lJ == null && (c914346k = this.A03) != null) {
            c103434lJ = AbstractC40567Hyn.A00(c914346k).A01;
            this.A02 = c103434lJ;
        }
        if (c103434lJ != null) {
            return c103434lJ.A01();
        }
        return null;
    }

    @Override // X.InterfaceC38381qS
    public final C1XV B5n() {
        return C1XV.A0A;
    }

    @Override // X.InterfaceC38381qS
    public final Integer BA3() {
        return this.A04;
    }

    @Override // X.InterfaceC38381qS
    public final InterfaceC39571se BK1() {
        return this.A00;
    }

    @Override // X.InterfaceC73233Pz
    public final Integer BWa() {
        return null;
    }

    @Override // X.InterfaceC38381qS
    public final String CAR() {
        return this.A08;
    }

    @Override // X.InterfaceC38381qS
    public final Integer CCj() {
        return C05F.A0N;
    }

    @Override // X.InterfaceC38381qS
    public final Integer CFr() {
        return this.A05;
    }

    @Override // X.InterfaceC38381qS, X.InterfaceC38411qV
    public final String getId() {
        return this.A06;
    }

    public C103464lM(InterfaceC103454lL interfaceC103454lL) {
        boolean booleanValue;
        C39561sd A00;
        C103444lK c103444lK = (C103444lK) interfaceC103454lL;
        String str = c103444lK.A06;
        this.A06 = str == null ? "" : str;
        this.A08 = c103444lK.A08;
        this.A02 = c103444lK.A01;
        this.A03 = c103444lK.A02;
        this.A05 = c103444lK.A05;
        this.A04 = c103444lK.A04;
        Boolean bool = c103444lK.A03;
        if (bool == null) {
            booleanValue = false;
        } else {
            booleanValue = bool.booleanValue();
        }
        this.A09 = booleanValue;
        InterfaceC39571se interfaceC39571se = c103444lK.A00;
        if (interfaceC39571se == null) {
            A00 = null;
        } else {
            A00 = interfaceC39571se.AKW().A00();
        }
        this.A00 = A00;
        this.A07 = c103444lK.A07;
    }

    public C103464lM() {
    }
}
