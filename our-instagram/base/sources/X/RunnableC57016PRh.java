package X;

import android.widget.Space;
import java.util.Map;

/* renamed from: X.PRh, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class RunnableC57016PRh implements Runnable {
    public final /* synthetic */ Space A00;
    public final /* synthetic */ OL3 A01;

    public RunnableC57016PRh(Space space, OL3 ol3) {
        this.A01 = ol3;
        this.A00 = space;
    }

    @Override // java.lang.Runnable
    public final void run() {
        OL3 ol3 = this.A01;
        Map map = ol3.A06;
        Space space = this.A00;
        if (map.get(space) != null) {
            ol3.A01(space);
        }
    }
}
