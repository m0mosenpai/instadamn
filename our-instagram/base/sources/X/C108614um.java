package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;

/* renamed from: X.4um, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C108614um extends C0T6 implements InterfaceC108624un {
    public final boolean A00;

    @Override // X.InterfaceC108624un
    public final C108614um Ev4() {
        return this;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C108614um) && this.A00 == ((C108614um) obj).A00);
    }

    @Override // X.InterfaceC108624un
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("enabled", Boolean.valueOf(this.A00));
        return new TreeUpdaterJNI("XDTIGLiveUseRsysRtcInfra", AbstractC06930Yk.A0B(linkedHashMap));
    }

    public final int hashCode() {
        if (!this.A00) {
            return 1237;
        }
        return 1231;
    }

    public C108614um(boolean z) {
        this.A00 = z;
    }
}
