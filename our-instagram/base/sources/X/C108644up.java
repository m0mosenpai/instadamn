package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;

/* renamed from: X.4up, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C108644up extends C0T6 implements InterfaceC108654uq {
    public final boolean A00;

    @Override // X.InterfaceC108654uq
    public final C108644up Ev3() {
        return this;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C108644up) && this.A00 == ((C108644up) obj).A00);
    }

    @Override // X.InterfaceC108654uq
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("enabled", Boolean.valueOf(this.A00));
        return new TreeUpdaterJNI("XDTIGLiveUpvoteableQA", AbstractC06930Yk.A0B(linkedHashMap));
    }

    public final int hashCode() {
        if (!this.A00) {
            return 1237;
        }
        return 1231;
    }

    public C108644up(boolean z) {
        this.A00 = z;
    }
}
