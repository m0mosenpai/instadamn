package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;

/* renamed from: X.3vR, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C87593vR extends C0T6 implements InterfaceC87603vS {
    public final Boolean A00;

    @Override // X.InterfaceC87603vS
    public final C87593vR EvM() {
        return this;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C87593vR) && C14360o3.A0K(this.A00, ((C87593vR) obj).A00));
    }

    public final int hashCode() {
        Boolean bool = this.A00;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    @Override // X.InterfaceC87603vS
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Boolean bool = this.A00;
        if (bool != null) {
            linkedHashMap.put("should_disable", bool);
        }
        return new TreeUpdaterJNI("XDTIGPersistentIABMetadata", AbstractC06930Yk.A0B(linkedHashMap));
    }

    public C87593vR(Boolean bool) {
        this.A00 = bool;
    }
}
