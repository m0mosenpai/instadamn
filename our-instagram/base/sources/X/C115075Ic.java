package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;

/* renamed from: X.5Ic, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C115075Ic extends C0T6 implements InterfaceC115085Id {
    public final boolean A00;

    @Override // X.InterfaceC115085Id
    public final C115075Ic Erj() {
        return this;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C115075Ic) && this.A00 == ((C115075Ic) obj).A00);
    }

    @Override // X.InterfaceC115085Id
    public final boolean Apo() {
        return this.A00;
    }

    @Override // X.InterfaceC115085Id
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("comments_toggle_default_on", Boolean.valueOf(this.A00));
        return new TreeUpdaterJNI("XDTChannelsInfoDict", AbstractC06930Yk.A0B(linkedHashMap));
    }

    public final int hashCode() {
        if (!this.A00) {
            return 1237;
        }
        return 1231;
    }

    public C115075Ic(boolean z) {
        this.A00 = z;
    }
}
