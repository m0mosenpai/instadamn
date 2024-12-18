package X;

import android.content.Context;
import com.facebookpay.shippingaddress.model.ShippingAddress;
import java.util.List;

/* renamed from: X.VwZ, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC69848VwZ {
    public static final Wac A00(ShippingAddress shippingAddress) {
        String A1A;
        String str = shippingAddress.A00;
        if (str != null && (A1A = AbstractC25228BEl.A1A(str)) != null && !AbstractC001900j.A0T(A1A)) {
            List A0Q = AbstractC001900j.A0Q(A1A, new char[]{' '}, 0);
            if (!A0Q.isEmpty()) {
                A0Q.get(0);
            }
            if (A0Q.size() > 1) {
                A0Q.get(1);
            }
        }
        return new Wac(shippingAddress.A08, shippingAddress.A09, shippingAddress.A01, shippingAddress.A07, shippingAddress.A02, shippingAddress.A06);
    }

    public static final String A01(Context context, EnumC61212RhC enumC61212RhC) {
        int i;
        C14360o3.A0B(context, 1);
        int ordinal = enumC61212RhC.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                return "";
            }
            i = 2131961408;
        } else {
            i = 2131961405;
        }
        return AbstractC166997dE.A0p(context, i);
    }
}
