package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;

/* renamed from: X.4uy, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C108734uy extends C0T6 implements InterfaceC108744uz {
    public final boolean A00;

    @Override // X.InterfaceC108744uz
    public final C108734uy Euy() {
        return this;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C108734uy) && this.A00 == ((C108734uy) obj).A00);
    }

    @Override // X.InterfaceC108744uz
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("is_enabled_for_broadcast", Boolean.valueOf(this.A00));
        return new TreeUpdaterJNI("XDTIGLiveFriendChat", AbstractC06930Yk.A0B(linkedHashMap));
    }

    public final int hashCode() {
        if (!this.A00) {
            return 1237;
        }
        return 1231;
    }

    public C108734uy(boolean z) {
        this.A00 = z;
    }
}
