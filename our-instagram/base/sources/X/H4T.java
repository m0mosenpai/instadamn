package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;

/* loaded from: classes7.dex */
public final class H4T extends C0T6 implements InterfaceC43510JJw {
    public final String A00;

    @Override // X.InterfaceC43510JJw
    public final H4T Exw() {
        return this;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof H4T) && C14360o3.A0K(this.A00, ((H4T) obj).A00));
    }

    @Override // X.InterfaceC43510JJw
    public final String getUrl() {
        return this.A00;
    }

    public final int hashCode() {
        return AbstractC167017dG.A0O(this.A00);
    }

    public H4T(String str) {
        this.A00 = str;
    }

    @Override // X.InterfaceC43510JJw
    public final TreeUpdaterJNI F7o() {
        LinkedHashMap A0X = AbstractC37300Gc1.A0X();
        String str = this.A00;
        if (str != null) {
            AbstractC37300Gc1.A13(str, A0X);
        }
        return AbstractC37300Gc1.A05("XDTPhoto3DInfo", AbstractC06930Yk.A0B(A0X));
    }
}
