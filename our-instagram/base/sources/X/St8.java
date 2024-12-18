package X;

import java.io.File;
import java.io.IOException;

/* loaded from: classes10.dex */
public final class St8 implements InterfaceC65631Tps {
    @Override // X.InterfaceC65319Thy
    public final /* bridge */ /* synthetic */ boolean AS0(C63729Ssj c63729Ssj, File file, Object obj) {
        try {
            AbstractC63086Sc9.A01(file, ((Q2P) ((InterfaceC65558Tme) obj).get()).A09.A00.A0E.A09.asReadOnlyBuffer());
            return true;
        } catch (IOException e) {
            if (android.util.Log.isLoggable("GifEncoder", 5)) {
                android.util.Log.w("GifEncoder", "Failed to encode GIF drawable data", e);
                return false;
            }
            return false;
        }
    }

    @Override // X.InterfaceC65631Tps
    public final Integer B1o(C63729Ssj c63729Ssj) {
        return C05F.A00;
    }
}
