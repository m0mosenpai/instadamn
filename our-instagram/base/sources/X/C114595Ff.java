package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;

/* renamed from: X.5Ff, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C114595Ff extends C0T6 implements InterfaceC104844nr {
    public final Boolean A00;

    @Override // X.InterfaceC104844nr
    public final C114595Ff Ets() {
        return this;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C114595Ff) && C14360o3.A0K(this.A00, ((C114595Ff) obj).A00));
    }

    public final int hashCode() {
        Boolean bool = this.A00;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    @Override // X.InterfaceC104844nr
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Boolean bool = this.A00;
        if (bool != null) {
            linkedHashMap.put("enable_reels_ads_nudge", bool);
        }
        return new TreeUpdaterJNI("XDTGestureToActionInfoDict", AbstractC06930Yk.A0B(linkedHashMap));
    }

    public C114595Ff(Boolean bool) {
        this.A00 = bool;
    }
}
