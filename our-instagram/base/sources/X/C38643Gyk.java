package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;

/* renamed from: X.Gyk, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38643Gyk extends C0T6 {
    public final int A00;
    public final EnumC99704do A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final InterfaceC16820sZ A05;
    public final boolean A06;
    public final boolean A07;
    public final Integer A08;

    public C38643Gyk(EnumC99704do enumC99704do, Integer num, String str, String str2, String str3, InterfaceC16820sZ interfaceC16820sZ, int i, boolean z, boolean z2) {
        C14360o3.A0B(str, 1);
        this.A03 = str;
        this.A04 = str2;
        this.A02 = str3;
        this.A01 = enumC99704do;
        this.A07 = z;
        this.A06 = z2;
        this.A00 = i;
        this.A08 = num;
        this.A05 = interfaceC16820sZ;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C38643Gyk) {
                C38643Gyk c38643Gyk = (C38643Gyk) obj;
                if (!C14360o3.A0K(this.A03, c38643Gyk.A03) || !C14360o3.A0K(this.A04, c38643Gyk.A04) || !C14360o3.A0K(this.A02, c38643Gyk.A02) || this.A01 != c38643Gyk.A01 || this.A07 != c38643Gyk.A07 || this.A06 != c38643Gyk.A06 || this.A00 != c38643Gyk.A00 || this.A08 != c38643Gyk.A08 || !C14360o3.A0K(this.A05, c38643Gyk.A05)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str;
        int A0D = (AbstractC167007dF.A0D(this.A06, AbstractC167007dF.A0D(this.A07, AbstractC166997dE.A0J(this.A01, AbstractC166997dE.A0K(this.A02, AbstractC166997dE.A0K(this.A04, AbstractC166987dD.A0J(this.A03)))))) + this.A00) * 31;
        int intValue = this.A08.intValue();
        switch (intValue) {
            case 1:
                str = "ONE_CLICK_CHECKOUT";
                break;
            case 2:
                str = "ADD_TO_CART";
                break;
            case 3:
                str = "VIEW_IN_CART";
                break;
            case 4:
                str = NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED;
                break;
            default:
                str = "EXTERNAL_LINK";
                break;
        }
        return AbstractC166987dD.A0I(this.A05, AbstractC25231BEo.A0H(str, intValue, A0D));
    }
}
