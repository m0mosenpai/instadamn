package X;

import com.instagram.shopping.model.recon.ShoppingReconFeedEndpoint;

/* renamed from: X.Gyp, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38648Gyp extends C0T6 {
    public final C38581Gxk A00;
    public final ShoppingReconFeedEndpoint A01;
    public final Integer A02;
    public final String A03;
    public final InterfaceC09390do A04 = J8V.A00(this, 0);
    public final InterfaceC09390do A05 = J8V.A00(this, 1);
    public final InterfaceC16820sZ A06;
    public final InterfaceC16820sZ A07;
    public final InterfaceC16820sZ A08;
    public final InterfaceC16660sJ A09;
    public final boolean A0A;

    public C38648Gyp(C38581Gxk c38581Gxk, ShoppingReconFeedEndpoint shoppingReconFeedEndpoint, Integer num, String str, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16820sZ interfaceC16820sZ3, InterfaceC16660sJ interfaceC16660sJ, boolean z) {
        this.A01 = shoppingReconFeedEndpoint;
        this.A03 = str;
        this.A0A = z;
        this.A00 = c38581Gxk;
        this.A02 = num;
        this.A08 = interfaceC16820sZ;
        this.A09 = interfaceC16660sJ;
        this.A07 = interfaceC16820sZ2;
        this.A06 = interfaceC16820sZ3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C38648Gyp) {
                C38648Gyp c38648Gyp = (C38648Gyp) obj;
                if (!C14360o3.A0K(this.A01, c38648Gyp.A01) || !C14360o3.A0K(this.A03, c38648Gyp.A03) || this.A0A != c38648Gyp.A0A || !C14360o3.A0K(this.A00, c38648Gyp.A00) || this.A02 != c38648Gyp.A02 || !C14360o3.A0K(this.A08, c38648Gyp.A08) || !C14360o3.A0K(this.A09, c38648Gyp.A09) || !C14360o3.A0K(this.A07, c38648Gyp.A07) || !C14360o3.A0K(this.A06, c38648Gyp.A06)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str;
        int A0J = AbstractC166997dE.A0J(this.A00, AbstractC167007dF.A0D(this.A0A, (AbstractC166987dD.A0G(this.A01) + AbstractC167017dG.A0O(this.A03)) * 31));
        int intValue = this.A02.intValue();
        switch (intValue) {
            case 1:
                str = "AnyWithFallbackDiskCache";
                break;
            case 2:
                str = "NetworkOnly";
                break;
            default:
                str = "AnyWithPrimaryDiskCache";
                break;
        }
        return AbstractC166987dD.A0I(this.A06, AbstractC166997dE.A0J(this.A07, AbstractC166997dE.A0J(this.A09, AbstractC166997dE.A0J(this.A08, AbstractC25231BEo.A0H(str, intValue, A0J)))));
    }
}
