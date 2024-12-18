package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;

/* renamed from: X.4vS, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C109034vS extends C0T6 implements InterfaceC109044vT {
    public final boolean A00;

    @Override // X.InterfaceC109044vT
    public final C109034vS Euz() {
        return this;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C109034vS) && this.A00 == ((C109034vS) obj).A00);
    }

    @Override // X.InterfaceC109044vT
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("viewer_poll_enabled", Boolean.valueOf(this.A00));
        return new TreeUpdaterJNI("XDTIGLiveGamesConfig", AbstractC06930Yk.A0B(linkedHashMap));
    }

    public final int hashCode() {
        if (!this.A00) {
            return 1237;
        }
        return 1231;
    }

    public C109034vS(boolean z) {
        this.A00 = z;
    }
}
