package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;

/* renamed from: X.5Fl, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5Fl extends C0T6 implements InterfaceC104954oA {
    public final String A00;

    @Override // X.InterfaceC104954oA
    public final C5Fl F7C() {
        return this;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C5Fl) && C14360o3.A0K(this.A00, ((C5Fl) obj).A00));
    }

    public final int hashCode() {
        String str = this.A00;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @Override // X.InterfaceC104954oA
    public final String AZG() {
        return this.A00;
    }

    @Override // X.InterfaceC104954oA
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str = this.A00;
        if (str != null) {
            linkedHashMap.put("ad_info_text", str);
        }
        return new TreeUpdaterJNI("XDTReelsMultiAdsInfo", AbstractC06930Yk.A0B(linkedHashMap));
    }

    public C5Fl(String str) {
        this.A00 = str;
    }
}
