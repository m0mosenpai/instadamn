package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;

/* renamed from: X.921, reason: invalid class name */
/* loaded from: classes4.dex */
public final class AnonymousClass921 extends C0T6 implements AnonymousClass922 {
    public final String A00;

    public AnonymousClass921(String str) {
        C14360o3.A0B(str, 1);
        this.A00 = str;
    }

    @Override // X.AnonymousClass922
    public final AnonymousClass921 F3p() {
        return this;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass921) && C14360o3.A0K(this.A00, ((AnonymousClass921) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    @Override // X.AnonymousClass922
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str = this.A00;
        if (str != null) {
            linkedHashMap.put("pk", str);
        }
        return new TreeUpdaterJNI("XDTVisualRepliesOriginalMediaInfo", AbstractC06930Yk.A0B(linkedHashMap));
    }

    @Override // X.AnonymousClass922
    public final String getPk() {
        return this.A00;
    }
}
