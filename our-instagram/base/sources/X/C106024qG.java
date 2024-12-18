package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;

/* renamed from: X.4qG, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C106024qG extends C0T6 implements InterfaceC104944o7 {
    public final String A00;

    @Override // X.InterfaceC104944o7
    public final C106024qG Ey1() {
        return this;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C106024qG) && C14360o3.A0K(this.A00, ((C106024qG) obj).A00));
    }

    public final int hashCode() {
        String str = this.A00;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @Override // X.InterfaceC104944o7
    public final String AjQ() {
        return this.A00;
    }

    @Override // X.InterfaceC104944o7
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str = this.A00;
        if (str != null) {
            linkedHashMap.put("byline_text", str);
        }
        return new TreeUpdaterJNI("XDTPoliticalContext", AbstractC06930Yk.A0B(linkedHashMap));
    }

    public C106024qG(String str) {
        this.A00 = str;
    }
}
