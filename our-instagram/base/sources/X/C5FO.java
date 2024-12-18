package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;

/* renamed from: X.5FO, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5FO extends C0T6 implements C5FP {
    public final C38321qM A00;

    @Override // X.C5FP
    public final C5FP EBL(C1DY c1dy) {
        return this;
    }

    @Override // X.C5FP
    public final C5FO F4W(C1DY c1dy) {
        return this;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C5FO) && C14360o3.A0K(this.A00, ((C5FO) obj).A00));
    }

    public final int hashCode() {
        C38321qM c38321qM = this.A00;
        if (c38321qM == null) {
            return 0;
        }
        return c38321qM.hashCode();
    }

    @Override // X.C5FP
    public final C38321qM BQN() {
        return this.A00;
    }

    @Override // X.C5FP
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C38321qM c38321qM = this.A00;
        if (c38321qM != null) {
            linkedHashMap.put("media", c38321qM.A1D());
        }
        return new TreeUpdaterJNI("XDTCommentMediaInfo", AbstractC06930Yk.A0B(linkedHashMap));
    }

    public C5FO(C38321qM c38321qM) {
        this.A00 = c38321qM;
    }
}
