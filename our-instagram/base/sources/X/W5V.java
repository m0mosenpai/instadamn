package X;

import com.shopify.checkout.models.OrderDetails$PaymentMethod$Companion;
import java.util.Map;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes11.dex */
public final class W5V {
    public static final C3R9[] A02;
    public static final OrderDetails$PaymentMethod$Companion Companion = new Object();
    public final String A00;
    public final Map A01;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.shopify.checkout.models.OrderDetails$PaymentMethod$Companion, java.lang.Object] */
    static {
        C3RD c3rd = C3RD.A01;
        A02 = new C3R9[]{null, new C3RL(c3rd, c3rd)};
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof W5V) {
                W5V w5v = (W5V) obj;
                if (!C14360o3.A0K(this.A00, w5v.A00) || !C14360o3.A0K(this.A01, w5v.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.A00.hashCode() * 31) + this.A01.hashCode();
    }

    public /* synthetic */ W5V(String str, Map map, int i) {
        if (3 != (i & 3)) {
            AbstractC68612VXn.A00(X14.A01, i, 3);
            throw C00O.createAndThrow();
        }
        this.A00 = str;
        this.A01 = map;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PaymentMethod(type=");
        sb.append(this.A00);
        sb.append(", details=");
        return AbstractC167017dG.A0o(this.A01, sb);
    }
}
