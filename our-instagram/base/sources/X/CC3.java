package X;

import com.facebook.R;
import java.util.AbstractMap;

/* loaded from: classes5.dex */
public abstract class CC3 {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        Object A02 = c6fw.A02();
        AbstractC25225BEi.A1S(A02);
        C6FG c6fg = c6fq.A03;
        if (c6fg != null) {
            CUH cuh = (CUH) ((AbstractMap) c6fg.A00(R.id.bk_context_key_timers)).get(A02);
            if (cuh != null) {
                cuh.A00();
                return null;
            }
            return null;
        }
        throw AbstractC166997dE.A0g();
    }
}
