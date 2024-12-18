package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;

/* renamed from: X.5HJ, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5HJ extends C0T6 implements C5HK {
    public final String A00;

    public C5HJ(String str) {
        C14360o3.A0B(str, 1);
        this.A00 = str;
    }

    @Override // X.C5HK
    public final C5HJ F4D() {
        return this;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C5HJ) && C14360o3.A0K(this.A00, ((C5HJ) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    @Override // X.C5HK
    public final String C50() {
        return this.A00;
    }

    @Override // X.C5HK
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str = this.A00;
        if (str != null) {
            linkedHashMap.put("tag_name", str);
        }
        return new TreeUpdaterJNI("XDTClipsChallengeInfo", AbstractC06930Yk.A0B(linkedHashMap));
    }
}
