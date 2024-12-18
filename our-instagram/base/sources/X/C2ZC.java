package X;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: X.2ZC, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2ZC {
    public final C19L A03;
    public final C51232Ww A05;
    public final C006802i A04 = C006802i.A0p;
    public final ReentrantLock A02 = new ReentrantLock();
    public final Map A00 = new LinkedHashMap();
    public final java.util.Set A01 = new LinkedHashSet();

    public C2ZC(C12N c12n, C51232Ww c51232Ww) {
        this.A05 = c51232Ww;
        this.A03 = AnonymousClass194.A02(c12n.AOT(793717423, 3).A00(1));
    }

    public static final void A00(C170967jn c170967jn, C2ZC c2zc, boolean z) {
        String str;
        C006802i c006802i = c2zc.A04;
        if (z) {
            str = "hit";
        } else {
            str = "miss";
        }
        c006802i.markEventBuilder(220143265, str).annotate("to_module_name", c170967jn.A04).annotate("call_site", c170967jn.A03).annotate("consumed", z ? 1 : 0).report();
    }
}
