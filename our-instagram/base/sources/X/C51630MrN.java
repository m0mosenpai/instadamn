package X;

/* renamed from: X.MrN, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51630MrN extends C0T6 {
    public final InterfaceC58104PpT A00;
    public final Integer A01;
    public final Integer A02;
    public final Long A03;
    public final String A04;
    public final String A05;
    public final boolean A06;
    public final String A07;
    public final String A08;

    public final boolean equals(Object obj) {
        if (obj instanceof C51630MrN) {
            C51630MrN c51630MrN = (C51630MrN) obj;
            if (this.A01 == c51630MrN.A01 && C14360o3.A0K(this.A03, c51630MrN.A03)) {
                InterfaceC58104PpT interfaceC58104PpT = this.A00;
                String Ar1 = interfaceC58104PpT.Ar1();
                InterfaceC58104PpT interfaceC58104PpT2 = c51630MrN.A00;
                if (C14360o3.A0K(Ar1, interfaceC58104PpT2.Ar1()) && interfaceC58104PpT.Ar7() == interfaceC58104PpT2.Ar7() && C14360o3.A0K(this.A04, c51630MrN.A04) && C14360o3.A0K(this.A05, c51630MrN.A05) && this.A06 == c51630MrN.A06 && C14360o3.A0K(this.A07, c51630MrN.A07) && C14360o3.A0K(this.A08, c51630MrN.A08)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str;
        int intValue = this.A01.intValue();
        switch (intValue) {
            case 1:
                str = "PAUSE";
                break;
            case 2:
                str = "STOP";
                break;
            default:
                str = "PLAY";
                break;
        }
        int A0F = AbstractC25228BEl.A0F(str, intValue);
        InterfaceC58104PpT interfaceC58104PpT = this.A00;
        int A0K = (AbstractC166997dE.A0K(interfaceC58104PpT.Ar1(), A0F) + AbstractC53739Npr.A00(interfaceC58104PpT.Ar7())) * 31;
        int i = 0;
        int A0D = ((AbstractC167007dF.A0D(this.A06, (((((A0K + AbstractC25235BEs.A06(this.A03)) * 31) + AbstractC31177DnL.A04(this.A04)) * 31) + AbstractC31177DnL.A04(this.A05)) * 31) * 31) + AbstractC31177DnL.A04(this.A07)) * 31;
        String str2 = this.A08;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return A0D + i;
    }

    public C51630MrN(InterfaceC58104PpT interfaceC58104PpT, Integer num, Integer num2, Long l, String str, String str2, String str3, String str4, boolean z) {
        AbstractC167017dG.A1P(num, interfaceC58104PpT);
        this.A01 = num;
        this.A00 = interfaceC58104PpT;
        this.A03 = l;
        this.A05 = str;
        this.A04 = str2;
        this.A07 = str3;
        this.A06 = z;
        this.A02 = num2;
        this.A08 = str4;
    }
}
