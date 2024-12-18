package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;

/* renamed from: X.3op, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C84053op extends C0T6 implements InterfaceC84063oq {
    public final String A00;

    @Override // X.InterfaceC84063oq
    public final C84053op Er6() {
        return this;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C84053op) && C14360o3.A0K(this.A00, ((C84053op) obj).A00));
    }

    public final int hashCode() {
        String str = this.A00;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @Override // X.InterfaceC84063oq
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str = this.A00;
        if (str != null) {
            linkedHashMap.put("best_audio_cluster_id", str);
        }
        return new TreeUpdaterJNI("XDTAudioRankingInfo", AbstractC06930Yk.A0B(linkedHashMap));
    }

    @Override // X.InterfaceC84063oq
    public final String getBestAudioClusterId() {
        return this.A00;
    }

    public C84053op(String str) {
        this.A00 = str;
    }
}
