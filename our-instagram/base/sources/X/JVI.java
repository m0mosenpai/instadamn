package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;

/* loaded from: classes8.dex */
public final class JVI extends AbstractC129515tG implements InterfaceC129555tK {
    public final C7QX A00;
    public final C7QL A01;
    public final C101594hU A02;
    public final C7Q5 A03;
    public final Integer A04;
    public final Integer A05;
    public final String A06;
    public final String A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JVI(C7QX c7qx, C7QL c7ql, C101594hU c101594hU, C7Q5 c7q5, Integer num, Integer num2, String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        super(c7qx);
        AbstractC25229BEm.A1I(num, 3, num2);
        this.A08 = z;
        this.A04 = num;
        this.A09 = z2;
        this.A0A = z3;
        this.A05 = num2;
        this.A03 = c7q5;
        this.A0C = z4;
        this.A02 = c101594hU;
        this.A01 = c7ql;
        this.A00 = c7qx;
        this.A0D = z5;
        this.A0B = z6;
        this.A06 = str;
        this.A07 = str2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof JVI) {
                JVI jvi = (JVI) obj;
                if (this.A08 != jvi.A08 || this.A04 != jvi.A04 || this.A09 != jvi.A09 || this.A0A != jvi.A0A || this.A05 != jvi.A05 || !C14360o3.A0K(this.A03, jvi.A03) || this.A0C != jvi.A0C || !C14360o3.A0K(this.A02, jvi.A02) || !C14360o3.A0K(this.A01, jvi.A01) || !C14360o3.A0K(this.A00, jvi.A00) || this.A0D != jvi.A0D || this.A0B != jvi.A0B || !C14360o3.A0K(this.A06, jvi.A06) || !C14360o3.A0K(this.A07, jvi.A07)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str;
        String str2;
        int A08 = (AbstractC25225BEi.A08(this.A08) + AbstractC53644Nnp.A00()) * 31;
        int intValue = this.A04.intValue();
        switch (intValue) {
            case 0:
                str = "PLAY_VM_FROM_OTHERS";
                break;
            case 1:
                str = "REPLAY_VM_FROM_OTHERS";
                break;
            case 2:
                str = "REPLAY_VM_FROM_ME";
                break;
            case 3:
                str = "FAILED";
                break;
            case 4:
                str = "TOAST_SENDING_PHOTO";
                break;
            case 5:
                str = "TOAST_SENDING_VIDEO";
                break;
            default:
                str = NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED;
                break;
        }
        int A0D = AbstractC167007dF.A0D(this.A0A, AbstractC167007dF.A0D(this.A09, AbstractC25231BEo.A0H(str, intValue, A08)));
        int intValue2 = this.A05.intValue();
        switch (intValue2) {
            case 0:
                str2 = "FAILED";
                break;
            case 1:
                str2 = "UPLOADED";
                break;
            default:
                str2 = "DEFAULT";
                break;
        }
        return ((AbstractC167007dF.A0D(this.A0B, AbstractC167007dF.A0D(this.A0D, AbstractC166997dE.A0J(this.A00, AbstractC166997dE.A0J(this.A01, (AbstractC167007dF.A0D(this.A0C, (AbstractC25231BEo.A0H(str2, intValue2, A0D) + AbstractC167017dG.A0M(this.A03)) * 31) + AbstractC167017dG.A0M(this.A02)) * 31)))) + AbstractC167017dG.A0O(this.A06)) * 31) + AbstractC25227BEk.A07(this.A07);
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
