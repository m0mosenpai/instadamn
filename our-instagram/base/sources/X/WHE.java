package X;

import android.content.ComponentCallbacks;
import android.content.res.Configuration;
import java.util.Vector;

/* loaded from: classes11.dex */
public final class WHE implements ComponentCallbacks {
    public final /* synthetic */ C66356UBx A00;

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    public WHE(C66356UBx c66356UBx) {
        this.A00 = c66356UBx;
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        C66356UBx c66356UBx = this.A00;
        int size = c66356UBx.A0M.A0O.size();
        for (int i = 0; i < size; i++) {
            c66356UBx.A0M.A0O.get(i);
        }
        Vector vector = W5O.A02;
        C70184WFm.A01(new C66524ULe());
    }
}
