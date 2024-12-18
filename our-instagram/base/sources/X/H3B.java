package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes7.dex */
public final class H3B extends C0T6 implements JJM {
    public final List A00;

    @Override // X.JJM
    public final H3B EtG() {
        return this;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof H3B) && C14360o3.A0K(this.A00, ((H3B) obj).A00));
    }

    public final int hashCode() {
        return AbstractC167017dG.A0M(this.A00);
    }

    public H3B(List list) {
        this.A00 = list;
    }

    @Override // X.JJM
    public final TreeUpdaterJNI F7o() {
        LinkedHashMap A0X = AbstractC37300Gc1.A0X();
        List list = this.A00;
        if (list != null) {
            A0X.put("grid_media_ids", list);
        }
        return AbstractC37300Gc1.A05("XDTExploreShareableGridTappableData", AbstractC06930Yk.A0B(A0X));
    }
}
