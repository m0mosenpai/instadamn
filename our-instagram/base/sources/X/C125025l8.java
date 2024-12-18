package X;

/* renamed from: X.5l8, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C125025l8 extends C0T6 {
    public final C129805tk A00;
    public final String A01;
    public final InterfaceC09390do A02;
    public final InterfaceC09390do A03;
    public final InterfaceC09390do A04;
    public final InterfaceC09390do A05;
    public final InterfaceC09390do A06;
    public final InterfaceC16820sZ A07;
    public final InterfaceC16660sJ A08;
    public final InterfaceC19390xP A09;
    public final boolean A0A;
    public final boolean A0B;

    public C125025l8(C129805tk c129805tk, String str, InterfaceC09390do interfaceC09390do, InterfaceC09390do interfaceC09390do2, InterfaceC09390do interfaceC09390do3, InterfaceC09390do interfaceC09390do4, InterfaceC09390do interfaceC09390do5, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16660sJ interfaceC16660sJ, InterfaceC19390xP interfaceC19390xP, boolean z, boolean z2) {
        C14360o3.A0B(interfaceC09390do3, 7);
        C14360o3.A0B(interfaceC09390do4, 10);
        this.A01 = str;
        this.A02 = interfaceC09390do;
        this.A05 = interfaceC09390do2;
        this.A08 = interfaceC16660sJ;
        this.A09 = interfaceC19390xP;
        this.A0B = z;
        this.A04 = interfaceC09390do3;
        this.A07 = interfaceC16820sZ;
        this.A00 = c129805tk;
        this.A06 = interfaceC09390do4;
        this.A03 = interfaceC09390do5;
        this.A0A = z2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C125025l8) {
                C125025l8 c125025l8 = (C125025l8) obj;
                if (!C14360o3.A0K(this.A01, c125025l8.A01) || !C14360o3.A0K(this.A02, c125025l8.A02) || !C14360o3.A0K(this.A05, c125025l8.A05) || !C14360o3.A0K(this.A08, c125025l8.A08) || !C14360o3.A0K(this.A09, c125025l8.A09) || this.A0B != c125025l8.A0B || !C14360o3.A0K(this.A04, c125025l8.A04) || !C14360o3.A0K(this.A07, c125025l8.A07) || !C14360o3.A0K(this.A00, c125025l8.A00) || !C14360o3.A0K(this.A06, c125025l8.A06) || !C14360o3.A0K(this.A03, c125025l8.A03) || this.A0A != c125025l8.A0A) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = ((((((((this.A01.hashCode() * 31) + this.A02.hashCode()) * 31) + this.A05.hashCode()) * 31) + this.A08.hashCode()) * 31) + this.A09.hashCode()) * 31;
        int i = 1237;
        if (this.A0B) {
            i = 1231;
        }
        int hashCode4 = (((hashCode3 + i) * 31) + this.A04.hashCode()) * 31;
        InterfaceC16820sZ interfaceC16820sZ = this.A07;
        int i2 = 0;
        if (interfaceC16820sZ == null) {
            hashCode = 0;
        } else {
            hashCode = interfaceC16820sZ.hashCode();
        }
        int i3 = (hashCode4 + hashCode) * 31;
        C129805tk c129805tk = this.A00;
        if (c129805tk == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = c129805tk.hashCode();
        }
        int hashCode5 = (((i3 + hashCode2) * 31) + this.A06.hashCode()) * 31;
        InterfaceC09390do interfaceC09390do = this.A03;
        if (interfaceC09390do != null) {
            i2 = interfaceC09390do.hashCode();
        }
        int i4 = (hashCode5 + i2) * 31;
        int i5 = 1237;
        if (this.A0A) {
            i5 = 1231;
        }
        return i4 + i5;
    }
}
