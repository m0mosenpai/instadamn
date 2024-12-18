package X;

import com.shopify.checkout.AndroidWebView$JSMessage$Companion;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes11.dex */
public final class W5R {
    public static final AndroidWebView$JSMessage$Companion Companion = new Object();
    public final String A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof W5R) {
                W5R w5r = (W5R) obj;
                if (!C14360o3.A0K(this.A01, w5r.A01) || !C14360o3.A0K(this.A00, w5r.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.A01.hashCode() * 31) + this.A00.hashCode();
    }

    public final String toString() {
        return AnonymousClass001.A0v("JSMessage(name=", this.A01, ", body=", this.A00, ')');
    }

    public /* synthetic */ W5R(String str, String str2, int i) {
        if (3 != (i & 3)) {
            AbstractC68612VXn.A00(C71746X0l.A01, i, 3);
            throw C00O.createAndThrow();
        }
        this.A01 = str;
        this.A00 = str2;
    }
}
