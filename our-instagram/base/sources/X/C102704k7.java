package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;

/* renamed from: X.4k7, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C102704k7 extends C0T6 implements InterfaceC102714k8 {
    public final String A00;

    @Override // X.InterfaceC102714k8
    public final C102704k7 EwE() {
        return this;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C102704k7) && C14360o3.A0K(this.A00, ((C102704k7) obj).A00));
    }

    public final int hashCode() {
        String str = this.A00;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @Override // X.InterfaceC102714k8
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str = this.A00;
        if (str != null) {
            linkedHashMap.put("background_color", str);
        }
        return new TreeUpdaterJNI("XDTMediaBackgroundColor", AbstractC06930Yk.A0B(linkedHashMap));
    }

    @Override // X.InterfaceC102714k8
    public final String getBackgroundColor() {
        return this.A00;
    }

    public C102704k7(String str) {
        this.A00 = str;
    }
}
