package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;

/* renamed from: X.5HG, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5HG extends C0T6 implements C5HH {
    public final String A00;

    public C5HG(String str) {
        C14360o3.A0B(str, 1);
        this.A00 = str;
    }

    @Override // X.C5HH
    public final C5HG F4C() {
        return this;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C5HG) && C14360o3.A0K(this.A00, ((C5HG) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    @Override // X.C5HH
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str = this.A00;
        if (str != null) {
            linkedHashMap.put("display_label", str);
        }
        return new TreeUpdaterJNI("XDTClipsBreakingContentInfo", AbstractC06930Yk.A0B(linkedHashMap));
    }
}
