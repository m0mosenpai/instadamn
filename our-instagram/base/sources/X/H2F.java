package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;

/* loaded from: classes7.dex */
public final class H2F extends C0T6 implements InterfaceC43499JJl {
    public final String A00;

    @Override // X.InterfaceC43499JJl
    public final H2F Eql() {
        return this;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof H2F) && C14360o3.A0K(this.A00, ((H2F) obj).A00));
    }

    @Override // X.InterfaceC43499JJl
    public final String ArU() {
        return this.A00;
    }

    public final int hashCode() {
        return AbstractC167017dG.A0O(this.A00);
    }

    public H2F(String str) {
        this.A00 = str;
    }

    @Override // X.InterfaceC43499JJl
    public final TreeUpdaterJNI F7o() {
        LinkedHashMap A0X = AbstractC37300Gc1.A0X();
        String str = this.A00;
        if (str != null) {
            A0X.put("contextual_feed_title", str);
        }
        return AbstractC37300Gc1.A05("XDTAfiInterestsPostSelectionCtaExtraData", AbstractC06930Yk.A0B(A0X));
    }
}
