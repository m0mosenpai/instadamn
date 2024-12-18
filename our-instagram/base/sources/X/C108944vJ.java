package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;

/* renamed from: X.4vJ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C108944vJ extends C0T6 implements InterfaceC108954vK {
    public final boolean A00;

    @Override // X.InterfaceC108954vK
    public final C108944vJ EuS() {
        return this;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C108944vJ) && this.A00 == ((C108944vJ) obj).A00);
    }

    @Override // X.InterfaceC108954vK
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("allow", Boolean.valueOf(this.A00));
        return new TreeUpdaterJNI("XDTIGAllow4PLiveWith", AbstractC06930Yk.A0B(linkedHashMap));
    }

    public final int hashCode() {
        if (!this.A00) {
            return 1237;
        }
        return 1231;
    }

    public C108944vJ(boolean z) {
        this.A00 = z;
    }
}
