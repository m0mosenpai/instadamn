package X;

import com.instagram.api.schemas.ClipsMashupType;

/* loaded from: classes7.dex */
public class IMZ {
    public boolean A00;
    public ClipsMashupType A01;
    public C4GI A02;
    public Boolean A03;
    public Boolean A04;
    public Boolean A05;
    public Boolean A06;
    public Integer A07;
    public Integer A08;
    public String A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public final InterfaceC84163p3 A0E;

    public IMZ(InterfaceC84163p3 interfaceC84163p3) {
        this.A0E = interfaceC84163p3;
        this.A0A = interfaceC84163p3.getCanToggleMashupsAllowed();
        this.A09 = interfaceC84163p3.B8F();
        this.A0B = interfaceC84163p3.getHasBeenMashedUp();
        this.A03 = interfaceC84163p3.BCG();
        this.A0C = interfaceC84163p3.isCreatorRequestingMashup();
        this.A04 = interfaceC84163p3.CXM();
        this.A05 = interfaceC84163p3.CXN();
        this.A0D = interfaceC84163p3.isPivotPageAvailable();
        this.A06 = interfaceC84163p3.Cc6();
        this.A01 = interfaceC84163p3.BPi();
        this.A00 = interfaceC84163p3.getMashupsAllowed();
        this.A07 = interfaceC84163p3.BXE();
        this.A02 = interfaceC84163p3.BZr();
        this.A08 = interfaceC84163p3.Bgd();
    }

    public final C84153p2 A00() {
        C4GH c4gh;
        C1DY A0b = AbstractC25235BEs.A0b(AbstractC37301Gc2.A08());
        boolean z = this.A0A;
        String str = this.A09;
        boolean z2 = this.A0B;
        Boolean bool = this.A03;
        boolean z3 = this.A0C;
        Boolean bool2 = this.A04;
        Boolean bool3 = this.A05;
        boolean z4 = this.A0D;
        Boolean bool4 = this.A06;
        ClipsMashupType clipsMashupType = this.A01;
        boolean z5 = this.A00;
        Integer num = this.A07;
        C4GI c4gi = this.A02;
        if (c4gi != null) {
            c4gh = c4gi.F4Q(A0b);
        } else {
            c4gh = null;
        }
        return new C84153p2(clipsMashupType, c4gh, bool, bool2, bool3, bool4, num, this.A08, str, z, z2, z3, z4, z5);
    }
}
