package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;

/* renamed from: X.4xH, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C109894xH extends C0T6 implements InterfaceC109904xI {
    public final String A00;

    @Override // X.InterfaceC109904xI
    public final C109894xH Eqg() {
        return this;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C109894xH) && C14360o3.A0K(this.A00, ((C109894xH) obj).A00));
    }

    public final int hashCode() {
        String str = this.A00;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @Override // X.InterfaceC109904xI
    public final String AyG() {
        return this.A00;
    }

    @Override // X.InterfaceC109904xI
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str = this.A00;
        if (str != null) {
            linkedHashMap.put(AbstractC111324zv.A00(4321), str);
        }
        return new TreeUpdaterJNI("XDTAffiliateInfo", AbstractC06930Yk.A0B(linkedHashMap));
    }

    public C109894xH(String str) {
        this.A00 = str;
    }
}
