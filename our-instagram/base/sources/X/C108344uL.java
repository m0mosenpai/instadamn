package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;

/* renamed from: X.4uL, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C108344uL extends C0T6 implements InterfaceC104964oB {
    public final Integer A00;

    @Override // X.InterfaceC104964oB
    public final C108344uL EvX() {
        return this;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C108344uL) && C14360o3.A0K(this.A00, ((C108344uL) obj).A00));
    }

    public final int hashCode() {
        Integer num = this.A00;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    @Override // X.InterfaceC104964oB
    public final Integer BPL() {
        return this.A00;
    }

    @Override // X.InterfaceC104964oB
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Integer num = this.A00;
        if (num != null) {
            linkedHashMap.put("loop_count", num);
        }
        return new TreeUpdaterJNI("XDTIGStoryAdsShortVideoDict", AbstractC06930Yk.A0B(linkedHashMap));
    }

    public C108344uL(Integer num) {
        this.A00 = num;
    }
}
