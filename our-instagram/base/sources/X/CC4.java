package X;

import com.facebook.R;
import java.util.AbstractMap;

/* loaded from: classes5.dex */
public abstract class CC4 {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        Object A03 = c6fw.A03(0);
        AbstractC25225BEi.A1S(A03);
        C6FG c6fg = c6fq.A03;
        if (c6fg != null) {
            CUH cuh = (CUH) ((AbstractMap) c6fg.A00(R.id.bk_context_key_timers)).get(A03);
            if (cuh != null && !cuh.A00) {
                if (!cuh.A01) {
                    cuh.A01 = true;
                    cuh.A03.removeCallbacks(cuh.A05);
                }
                cuh.A01 = false;
                cuh.A03.postDelayed(cuh.A05, cuh.A02);
                return null;
            }
            return null;
        }
        throw AbstractC166997dE.A0g();
    }
}
