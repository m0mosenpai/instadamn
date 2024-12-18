package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;

/* renamed from: X.3ou, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C84093ou extends C0T6 implements InterfaceC84103ov {
    public final boolean A00;

    @Override // X.InterfaceC84103ov
    public final C84093ou F4B() {
        return this;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C84093ou) && this.A00 == ((C84093ou) obj).A00);
    }

    @Override // X.InterfaceC84103ov
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("can_add_tag", Boolean.valueOf(this.A00));
        return new TreeUpdaterJNI("XDTClipsBrandedContentTagInfo", AbstractC06930Yk.A0B(linkedHashMap));
    }

    @Override // X.InterfaceC84103ov
    public final boolean getCanAddTag() {
        return this.A00;
    }

    public final int hashCode() {
        if (!this.A00) {
            return 1237;
        }
        return 1231;
    }

    public C84093ou(boolean z) {
        this.A00 = z;
    }
}
