package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;

/* renamed from: X.Mr7, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51614Mr7 extends C0T6 {
    public final int A00;
    public final long A01;
    public final UQ7 A02;
    public final Integer A03;
    public final Integer A04;
    public final boolean A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51614Mr7) {
                C51614Mr7 c51614Mr7 = (C51614Mr7) obj;
                if (this.A01 != c51614Mr7.A01 || !C14360o3.A0K(this.A02, c51614Mr7.A02) || this.A03 != c51614Mr7.A03 || this.A05 != c51614Mr7.A05 || this.A04 != c51614Mr7.A04 || this.A00 != c51614Mr7.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str;
        int A0J = AbstractC166997dE.A0J(this.A02, AbstractC25235BEs.A03(this.A01));
        int intValue = this.A03.intValue();
        switch (intValue) {
            case 1:
                str = "TOP";
                break;
            case 2:
                str = "LEFT";
                break;
            case 3:
                str = "BOTTOM";
                break;
            case 4:
                str = "RIGHT";
                break;
            case 5:
                str = "SCALE";
                break;
            case 6:
                str = "FADE";
                break;
            default:
                str = NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED;
                break;
        }
        return ((AbstractC167007dF.A0D(this.A05, AbstractC25231BEo.A0H(str, intValue, A0J) * 31) + OR3.A00(this.A04)) * 31) + this.A00;
    }

    public C51614Mr7(UQ7 uq7, Integer num, Integer num2, int i, long j, boolean z) {
        this.A01 = j;
        this.A02 = uq7;
        this.A03 = num;
        this.A05 = z;
        this.A04 = num2;
        this.A00 = i;
    }
}
