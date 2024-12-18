package X;

import com.facebook.R;
import java.util.Map;

/* renamed from: X.6Fo, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC136356Fo {
    public static C6AV A00(C6FG c6fg, C136326Fl c136326Fl, C6AV c6av, Map map) {
        C63C c63c;
        C1339162z c1339162z = C1339162z.A00;
        if (c6fg == null) {
            c63c = null;
        } else {
            c63c = (C63C) c6fg.A01.get(R.id.bk_context_key_performance_logger);
        }
        int andIncrement = AbstractC1339062y.A00.getAndIncrement();
        if (c63c != null) {
            c63c.ATF(4, andIncrement);
            c63c.ATA(4, andIncrement, "instance", andIncrement);
        }
        C1LN.A01("Bloks Bind");
        C6AV A00 = C136366Fp.A00(c6fg, c136326Fl.A00.A06(map), c6av, c136326Fl.A01, c6fg.A02.AgS().AgX(), c1339162z);
        AbstractC102954kW.A00.incrementAndGet();
        C1LN.A00();
        if (c63c != null) {
            c63c.ATE(4, andIncrement);
        }
        return A00;
    }
}
