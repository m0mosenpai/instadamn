package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;

/* renamed from: X.4v4, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C108794v4 extends C0T6 implements InterfaceC108804v5 {
    public final boolean A00;

    @Override // X.InterfaceC108804v5
    public final C108794v4 Eut() {
        return this;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C108794v4) && this.A00 == ((C108794v4) obj).A00);
    }

    @Override // X.InterfaceC108804v5
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("badges_always_on_enabled", Boolean.valueOf(this.A00));
        return new TreeUpdaterJNI("XDTIGLiveBadgesUFI", AbstractC06930Yk.A0B(linkedHashMap));
    }

    public final int hashCode() {
        if (!this.A00) {
            return 1237;
        }
        return 1231;
    }

    public C108794v4(boolean z) {
        this.A00 = z;
    }
}
