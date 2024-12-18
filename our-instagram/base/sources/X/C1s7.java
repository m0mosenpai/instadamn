package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;

/* renamed from: X.1s7, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1s7 extends C0T6 implements InterfaceC39281s8 {
    public final Boolean A00;

    @Override // X.InterfaceC39281s8
    public final C1s7 Eua() {
        return this;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C1s7) && C14360o3.A0K(this.A00, ((C1s7) obj).A00));
    }

    public final int hashCode() {
        Boolean bool = this.A00;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    @Override // X.InterfaceC39281s8
    public final Boolean CXJ() {
        return this.A00;
    }

    @Override // X.InterfaceC39281s8
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Boolean bool = this.A00;
        if (bool != null) {
            linkedHashMap.put("isLeadGenAd", bool);
        }
        return new TreeUpdaterJNI("XDTIGClickToDirectLeadGenAdsInfoDict", AbstractC06930Yk.A0B(linkedHashMap));
    }

    public C1s7(Boolean bool) {
        this.A00 = bool;
    }
}
