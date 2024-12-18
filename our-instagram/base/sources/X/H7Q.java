package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;

/* loaded from: classes7.dex */
public final class H7Q extends C0T6 implements JK3 {
    public final String A00;

    @Override // X.JK3
    public final H7Q F4q() {
        return this;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof H7Q) && C14360o3.A0K(this.A00, ((H7Q) obj).A00));
    }

    @Override // X.JK3
    public final String getBackgroundColor() {
        return this.A00;
    }

    public final int hashCode() {
        return AbstractC167017dG.A0O(this.A00);
    }

    public H7Q(String str) {
        this.A00 = str;
    }

    @Override // X.JK3
    public final TreeUpdaterJNI F7o() {
        LinkedHashMap A0X = AbstractC37300Gc1.A0X();
        String str = this.A00;
        if (str != null) {
            A0X.put("background_color", str);
        }
        return AbstractC37300Gc1.A05("XDTPotatoItemMediaInfo", AbstractC06930Yk.A0B(A0X));
    }
}
