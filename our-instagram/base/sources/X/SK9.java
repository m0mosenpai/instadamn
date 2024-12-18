package X;

import android.graphics.Path;
import java.util.List;

/* loaded from: classes10.dex */
public final class SK9 {
    public final List A00 = AbstractC166987dD.A1E();

    public final void A00(Path path) {
        List list = this.A00;
        int size = list.size();
        while (true) {
            size--;
            if (size >= 0) {
                C63665SrY c63665SrY = (C63665SrY) list.get(size);
                if (c63665SrY != null && !c63665SrY.A05) {
                    AbstractC63359SiH.A03(path, ((QAZ) c63665SrY.A02).A0B() / 100.0f, ((QAZ) c63665SrY.A00).A0B() / 100.0f, ((QAZ) c63665SrY.A01).A0B() / 360.0f);
                }
            } else {
                return;
            }
        }
    }
}
