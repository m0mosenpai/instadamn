package X;

import com.instagram.shopping.model.recon.ShoppingReconFeedEndpoint;
import java.util.List;

/* renamed from: X.MsR, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51696MsR extends C0T6 {
    public final Nm1 A00;
    public final ShoppingReconFeedEndpoint A01;
    public final Integer A02;
    public final List A03;
    public final List A04;

    public static final C51696MsR A00(Nm1 nm1, ShoppingReconFeedEndpoint shoppingReconFeedEndpoint, Integer num, List list, List list2) {
        C14360o3.A0B(shoppingReconFeedEndpoint, 0);
        AbstractC167027dH.A0a(1, list, list2, num, nm1);
        return new C51696MsR(nm1, shoppingReconFeedEndpoint, num, list, list2);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51696MsR) {
                C51696MsR c51696MsR = (C51696MsR) obj;
                if (!C14360o3.A0K(this.A01, c51696MsR.A01) || !C14360o3.A0K(this.A04, c51696MsR.A04) || !C14360o3.A0K(this.A03, c51696MsR.A03) || this.A02 != c51696MsR.A02 || !C14360o3.A0K(this.A00, c51696MsR.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str;
        int A0J = AbstractC166997dE.A0J(this.A03, AbstractC166997dE.A0J(this.A04, AbstractC166987dD.A0G(this.A01)));
        int intValue = this.A02.intValue();
        switch (intValue) {
            case 1:
                str = "Loading";
                break;
            case 2:
                str = "Error";
                break;
            default:
                str = "Idle";
                break;
        }
        return AbstractC166987dD.A0I(this.A00, AbstractC25231BEo.A0H(str, intValue, A0J));
    }

    public C51696MsR(Nm1 nm1, ShoppingReconFeedEndpoint shoppingReconFeedEndpoint, Integer num, List list, List list2) {
        this.A01 = shoppingReconFeedEndpoint;
        this.A04 = list;
        this.A03 = list2;
        this.A02 = num;
        this.A00 = nm1;
    }
}
