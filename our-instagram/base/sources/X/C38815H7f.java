package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;

/* renamed from: X.H7f, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38815H7f extends C0T6 implements JK5 {
    public final C38814H7e A00;

    @Override // X.JK5
    public final C38815H7f F5d() {
        return this;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C38815H7f) && C14360o3.A0K(this.A00, ((C38815H7f) obj).A00));
    }

    @Override // X.JK5
    public final /* bridge */ /* synthetic */ JK4 BHI() {
        return this.A00;
    }

    public final int hashCode() {
        return AbstractC167017dG.A0M(this.A00);
    }

    public C38815H7f(C38814H7e c38814H7e) {
        this.A00 = c38814H7e;
    }

    @Override // X.JK5
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap A0X = AbstractC37300Gc1.A0X();
        if (BHI() != null) {
            JK4 BHI = BHI();
            if (BHI != null) {
                treeUpdaterJNI = BHI.F7o();
            } else {
                treeUpdaterJNI = null;
            }
            A0X.put("incentive", treeUpdaterJNI);
        }
        return AbstractC37300Gc1.A05("XDTShoppingNetegoInStoryRichDestination", AbstractC06930Yk.A0B(A0X));
    }
}
