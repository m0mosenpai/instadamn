package X;

/* renamed from: X.FyO, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36210FyO implements InterfaceC66482zP {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Integer A03;
    public final Integer A04;
    public final Integer A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final InterfaceC16820sZ A0A;

    public C36210FyO(Integer num, Integer num2, Integer num3, String str, String str2, String str3, String str4, InterfaceC16820sZ interfaceC16820sZ, int i, int i2, int i3) {
        C14360o3.A0B(str2, 7);
        this.A01 = i;
        this.A02 = i2;
        this.A04 = num;
        this.A05 = num2;
        this.A03 = num3;
        this.A07 = str;
        this.A06 = str2;
        this.A08 = str3;
        this.A09 = str4;
        this.A00 = i3;
        this.A0A = interfaceC16820sZ;
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return String.valueOf(this.A02);
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C36210FyO c36210FyO = (C36210FyO) obj;
        if (c36210FyO != null && this.A01 == c36210FyO.A01 && this.A02 == c36210FyO.A02 && C14360o3.A0K(this.A04, c36210FyO.A04)) {
            return true;
        }
        return false;
    }
}
