package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;

/* renamed from: X.4us, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C108674us extends C0T6 implements InterfaceC108684ut {
    public final boolean A00;

    @Override // X.InterfaceC108684ut
    public final C108674us Ev6() {
        return this;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C108674us) && this.A00 == ((C108674us) obj).A00);
    }

    @Override // X.InterfaceC108684ut
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("enabled", Boolean.valueOf(this.A00));
        return new TreeUpdaterJNI("XDTIGLiveViewerToViewerWaves", AbstractC06930Yk.A0B(linkedHashMap));
    }

    public final int hashCode() {
        if (!this.A00) {
            return 1237;
        }
        return 1231;
    }

    public C108674us(boolean z) {
        this.A00 = z;
    }
}
