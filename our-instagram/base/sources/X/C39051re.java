package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;

/* renamed from: X.1re, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C39051re extends C0T6 implements InterfaceC39061rf {
    public final String A00;

    public C39051re(String str) {
        C14360o3.A0B(str, 1);
        this.A00 = str;
    }

    @Override // X.InterfaceC39061rf
    public final C39051re Ev8() {
        return this;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C39051re) && C14360o3.A0K(this.A00, ((C39051re) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    @Override // X.InterfaceC39061rf
    public final String AxC() {
        return this.A00;
    }

    @Override // X.InterfaceC39061rf
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str = this.A00;
        if (str != null) {
            linkedHashMap.put("detection_method", str);
        }
        return new TreeUpdaterJNI("XDTIGMediaGenAIDetectionMethodResponse", AbstractC06930Yk.A0B(linkedHashMap));
    }
}
