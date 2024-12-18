package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;

/* renamed from: X.3ok, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C84003ok extends C0T6 implements InterfaceC84013ol {
    public final boolean A00;

    @Override // X.InterfaceC84013ol
    public final C84003ok F4A() {
        return this;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C84003ok) && this.A00 == ((C84003ok) obj).A00);
    }

    @Override // X.InterfaceC84013ol
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("should_allow_restore", Boolean.valueOf(this.A00));
        return new TreeUpdaterJNI("XDTClipsAudioReattributionInfo", AbstractC06930Yk.A0B(linkedHashMap));
    }

    @Override // X.InterfaceC84013ol
    public final boolean getShouldAllowRestore() {
        return this.A00;
    }

    public final int hashCode() {
        if (!this.A00) {
            return 1237;
        }
        return 1231;
    }

    public C84003ok(boolean z) {
        this.A00 = z;
    }
}
