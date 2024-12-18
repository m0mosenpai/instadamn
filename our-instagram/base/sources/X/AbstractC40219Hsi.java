package X;

import com.instagram.api.schemas.RingSpec;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.Hsi, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC40219Hsi {
    public static Map A00(RingSpec ringSpec) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (ringSpec.ApQ() != null) {
            A1I.put("colors", ringSpec.ApQ());
        }
        if (ringSpec.B1y() != null) {
            A1I.put("end_point", ringSpec.B1y().F7o());
        }
        if (ringSpec.BOR() != null) {
            List BOR = ringSpec.BOR();
            ArrayList A1E = AbstractC166987dD.A1E();
            Iterator it = BOR.iterator();
            while (it.hasNext()) {
                AbstractC37303Gc4.A1X(A1E, it);
            }
            A1I.put("locations", A1E);
        }
        if (ringSpec.getName() != null) {
            AbstractC37300Gc1.A14(ringSpec.getName(), A1I);
        }
        if (ringSpec.Bzg() != null) {
            A1I.put("start_point", ringSpec.Bzg().F7o());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
