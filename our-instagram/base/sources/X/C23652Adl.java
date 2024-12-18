package X;

import android.graphics.Bitmap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.Adl, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23652Adl implements InterfaceC13000lm {
    public final Map A00 = AbstractC166987dD.A1I();

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        Map map = this.A00;
        Iterator A15 = AbstractC166997dE.A15(map);
        while (A15.hasNext()) {
            Bitmap bitmap = (Bitmap) AbstractC166987dD.A1K(A15).getValue();
            if (bitmap != null) {
                bitmap.recycle();
            }
        }
        map.clear();
    }
}
