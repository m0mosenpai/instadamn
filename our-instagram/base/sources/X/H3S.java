package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes7.dex */
public final class H3S extends C0T6 implements JJO {
    public final List A00;

    public H3S(List list) {
        C14360o3.A0B(list, 1);
        this.A00 = list;
    }

    @Override // X.JJO
    public final H3S Etz() {
        return this;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof H3S) && C14360o3.A0K(this.A00, ((H3S) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    @Override // X.JJO
    public final TreeUpdaterJNI F7o() {
        LinkedHashMap A0X = AbstractC37300Gc1.A0X();
        List list = this.A00;
        if (list != null) {
            A0X.put(AbstractC111324zv.A00(966), list);
        }
        return AbstractC37300Gc1.A05("XDTGroupPollCreateModeInfo", AbstractC06930Yk.A0B(A0X));
    }
}
