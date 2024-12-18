package X;

/* renamed from: X.3iH, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C80273iH extends C0T6 {
    public final InterfaceC16820sZ A00;
    public final InterfaceC16820sZ A01;
    public final InterfaceC16820sZ A02;
    public final InterfaceC16820sZ A03;
    public final InterfaceC16820sZ A04;
    public final InterfaceC16820sZ A05;
    public final InterfaceC16820sZ A06;
    public final InterfaceC16820sZ A07;
    public final InterfaceC16660sJ A08;
    public final InterfaceC16660sJ A09;
    public final InterfaceC16660sJ A0A;
    public final InterfaceC16660sJ A0B;
    public final InterfaceC16660sJ A0C;

    public C80273iH(InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16820sZ interfaceC16820sZ3, InterfaceC16820sZ interfaceC16820sZ4, InterfaceC16820sZ interfaceC16820sZ5, InterfaceC16820sZ interfaceC16820sZ6, InterfaceC16820sZ interfaceC16820sZ7, InterfaceC16820sZ interfaceC16820sZ8, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16660sJ interfaceC16660sJ2, InterfaceC16660sJ interfaceC16660sJ3, InterfaceC16660sJ interfaceC16660sJ4, InterfaceC16660sJ interfaceC16660sJ5) {
        C14360o3.A0B(interfaceC16820sZ3, 3);
        this.A00 = interfaceC16820sZ;
        this.A01 = interfaceC16820sZ2;
        this.A02 = interfaceC16820sZ3;
        this.A05 = interfaceC16820sZ4;
        this.A03 = interfaceC16820sZ5;
        this.A04 = interfaceC16820sZ6;
        this.A0B = interfaceC16660sJ;
        this.A0C = interfaceC16660sJ2;
        this.A0A = interfaceC16660sJ3;
        this.A09 = interfaceC16660sJ4;
        this.A08 = interfaceC16660sJ5;
        this.A06 = interfaceC16820sZ7;
        this.A07 = interfaceC16820sZ8;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C80273iH) {
                C80273iH c80273iH = (C80273iH) obj;
                if (!C14360o3.A0K(this.A00, c80273iH.A00) || !C14360o3.A0K(this.A01, c80273iH.A01) || !C14360o3.A0K(this.A02, c80273iH.A02) || !C14360o3.A0K(this.A05, c80273iH.A05) || !C14360o3.A0K(this.A03, c80273iH.A03) || !C14360o3.A0K(this.A04, c80273iH.A04) || !C14360o3.A0K(this.A0B, c80273iH.A0B) || !C14360o3.A0K(this.A0C, c80273iH.A0C) || !C14360o3.A0K(this.A0A, c80273iH.A0A) || !C14360o3.A0K(this.A09, c80273iH.A09) || !C14360o3.A0K(this.A08, c80273iH.A08) || !C14360o3.A0K(this.A06, c80273iH.A06) || !C14360o3.A0K(this.A07, c80273iH.A07)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((((((((((((((((((((this.A00.hashCode() * 31) + this.A01.hashCode()) * 31) + this.A02.hashCode()) * 31) + this.A05.hashCode()) * 31) + this.A03.hashCode()) * 31) + this.A04.hashCode()) * 31) + this.A0B.hashCode()) * 31) + this.A0C.hashCode()) * 31) + this.A0A.hashCode()) * 31) + this.A09.hashCode()) * 31) + this.A08.hashCode()) * 31) + this.A06.hashCode()) * 31) + this.A07.hashCode();
    }
}
