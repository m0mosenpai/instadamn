package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;

/* renamed from: X.GnJ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37977GnJ extends C17T implements InterfaceC84063oq {
    @Override // X.InterfaceC84063oq
    public final C84053op Er6() {
        return new C84053op(A0i(-684077436));
    }

    @Override // X.InterfaceC84063oq
    public final TreeUpdaterJNI F7o() {
        LinkedHashMap A0X = AbstractC37300Gc1.A0X();
        if (A0i(-684077436) != null) {
            A0X.put("best_audio_cluster_id", A0i(-684077436));
        }
        return AbstractC37304Gc5.A07(this, A0X);
    }

    @Override // X.InterfaceC84063oq
    public final String getBestAudioClusterId() {
        return A0i(-684077436);
    }
}
