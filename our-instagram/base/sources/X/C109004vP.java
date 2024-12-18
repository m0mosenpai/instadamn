package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;

/* renamed from: X.4vP, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C109004vP extends C0T6 implements InterfaceC109014vQ {
    public final boolean A00;

    @Override // X.InterfaceC109014vQ
    public final C109004vP Eus() {
        return this;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C109004vP) && this.A00 == ((C109004vP) obj).A00);
    }

    @Override // X.InterfaceC109014vQ
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("show_join_live_sheet", Boolean.valueOf(this.A00));
        return new TreeUpdaterJNI("XDTIGLiveBFFUpsell", AbstractC06930Yk.A0B(linkedHashMap));
    }

    public final int hashCode() {
        if (!this.A00) {
            return 1237;
        }
        return 1231;
    }

    public C109004vP(boolean z) {
        this.A00 = z;
    }
}
