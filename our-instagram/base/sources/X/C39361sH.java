package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;

/* renamed from: X.1sH, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C39361sH extends C0T6 implements InterfaceC39371sI {
    public final Boolean A00;

    @Override // X.InterfaceC39371sI
    public final C39361sH EuV() {
        return this;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C39361sH) && C14360o3.A0K(this.A00, ((C39361sH) obj).A00));
    }

    public final int hashCode() {
        Boolean bool = this.A00;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    @Override // X.InterfaceC39371sI
    public final Boolean Bux() {
        return this.A00;
    }

    @Override // X.InterfaceC39371sI
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Boolean bool = this.A00;
        if (bool != null) {
            linkedHashMap.put("should_disable", bool);
        }
        return new TreeUpdaterJNI("XDTIGBrowserPeekMetadata", AbstractC06930Yk.A0B(linkedHashMap));
    }

    public C39361sH(Boolean bool) {
        this.A00 = bool;
    }
}