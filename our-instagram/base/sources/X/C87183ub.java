package X;

/* renamed from: X.3ub, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C87183ub extends C0T6 {
    public final C206289Bl A00;
    public final C87173ua A01;
    public final InterfaceC87123uV A02;
    public final InterfaceC87073uP A03;
    public final InterfaceC87093uR A04;
    public final C76623c7 A05;
    public final String A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;

    public C87183ub(C206289Bl c206289Bl, C87173ua c87173ua, InterfaceC87123uV interfaceC87123uV, InterfaceC87073uP interfaceC87073uP, InterfaceC87093uR interfaceC87093uR, C76623c7 c76623c7, String str, boolean z, boolean z2, boolean z3) {
        C14360o3.A0B(interfaceC87073uP, 2);
        C14360o3.A0B(interfaceC87123uV, 11);
        this.A05 = c76623c7;
        this.A03 = interfaceC87073uP;
        this.A04 = interfaceC87093uR;
        this.A06 = str;
        this.A09 = z;
        this.A08 = z2;
        this.A01 = c87173ua;
        this.A00 = c206289Bl;
        this.A07 = z3;
        this.A02 = interfaceC87123uV;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C87183ub) {
                C87183ub c87183ub = (C87183ub) obj;
                if (!C14360o3.A0K(this.A05, c87183ub.A05) || !C14360o3.A0K(this.A03, c87183ub.A03) || !C14360o3.A0K(this.A04, c87183ub.A04) || !C14360o3.A0K(this.A06, c87183ub.A06) || this.A09 != c87183ub.A09 || this.A08 != c87183ub.A08 || !C14360o3.A0K(this.A01, c87183ub.A01) || !C14360o3.A0K(this.A00, c87183ub.A00) || this.A07 != c87183ub.A07 || !C14360o3.A0K(this.A02, c87183ub.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = ((((((((this.A05.hashCode() * 31) + this.A03.hashCode()) * 31) + AbstractC53644Nnp.A00()) * 31) + this.A04.hashCode()) * 31) + this.A06.hashCode()) * 31;
        int i = 1237;
        if (this.A09) {
            i = 1231;
        }
        int i2 = (hashCode + i) * 31;
        int i3 = 1237;
        if (this.A08) {
            i3 = 1231;
        }
        int hashCode2 = (((((i2 + i3) * 31) + this.A01.hashCode()) * 31) + this.A00.hashCode()) * 31;
        int i4 = 1237;
        if (this.A07) {
            i4 = 1231;
        }
        return ((hashCode2 + i4) * 31) + this.A02.hashCode();
    }
}
