package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;

/* renamed from: X.5F3, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5F3 extends C0T6 implements C5F4 {
    public final boolean A00;

    @Override // X.C5F4
    public final C5F3 Evm() {
        return this;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C5F3) && this.A00 == ((C5F3) obj).A00);
    }

    @Override // X.C5F4
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("stories", Boolean.valueOf(this.A00));
        return new TreeUpdaterJNI("XDTIsCallToActionEnabledBySurfaceDict", AbstractC06930Yk.A0B(linkedHashMap));
    }

    public final int hashCode() {
        if (!this.A00) {
            return 1237;
        }
        return 1231;
    }

    public C5F3(boolean z) {
        this.A00 = z;
    }
}
